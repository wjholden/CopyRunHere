/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjholden.copyrunhere;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.connection.channel.direct.Session.Command;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
import net.schmizz.sshj.userauth.UserAuthException;

/**
 * Most code in this class is based off of 
 * https://github.com/hierynomus/sshj/blob/master/examples/src/main/java/net/schmizz/sshj/examples/Exec.java
 * 
 * @author William John Holden
 */
public class SecureShellNetworkDevice extends NetworkDevice {
    
    public SecureShellNetworkDevice(String address, String username, 
            String password) throws UnknownHostException, IOException {
        super(address, username, password);
    }
    
    @Override
    public void run() {
        assert(commands != null);
        assert(super.address != null);
        assert(super.username != null);
        assert(super.password != null);
        
        for (String command : super.commands) {
            try (SSHClient ssh = new SSHClient()) {
                ssh.addHostKeyVerifier(new PromiscuousVerifier());
                ssh.connect(super.address);
                try {
                    ssh.authPassword(super.username, super.password);
                } catch (UserAuthException | TransportException e) {
                    config.put(command, e.toString());
                }
            
                try (Session session = ssh.startSession()) {
                    String result;
                    final Command cmd = session.exec(command);
                    result = (IOUtils.readFully(cmd.getInputStream()).toString());                   
                    cmd.join(5, TimeUnit.SECONDS);
                    config.put(command, result);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
