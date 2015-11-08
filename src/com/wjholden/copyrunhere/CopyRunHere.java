/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjholden.copyrunhere;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author William John Holden
 */
public class CopyRunHere {
    
    static String testTargets [] = { "r1", "10.0.0.1" };
    static String testCommands [] = { "show ip route" , "show ip protocols" };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(CopyRunHere.class);
        List<String> targets = new ArrayList<>(Arrays.asList(testTargets));
        List<String> commands = new ArrayList<>(Arrays.asList(testCommands));
        List<NetworkDevice> network = new LinkedList<>();
       
        for (String target : targets) {
            try {
                NetworkDevice device = new SecureShellNetworkDevice(target,
                    args[0], args[1]);
                device.setCommands(commands);
                Thread thread = new Thread(device);
                thread.start();
                network.add(device);
            } catch (IOException ex) {
                logger.error(ex.getMessage());
            }
        }
    }
    
}
