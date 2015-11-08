/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjholden.copyrunhere;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author William John Holden
 */
public abstract class NetworkDevice implements Runnable {
    protected final Map<String, String> config;

    protected List<String> commands;
    protected final InetAddress address;
    protected final String username;
    protected final String password;
    
    // Last-second design failure. So I only have one router, and I wanted
    // to test this program using more than one node. If all I had was the IP,
    // then HashCode and Equals methods would result in collisions. This would
    // cause a problem for the class when it is later added to a HashMap.
    // As a result, I've decided to privately maintain the original node
    // name as a String for testing. It won't have any major impact on 
    // performance but it might look a little weird to the keen observer.
    private final String node;
    
    public NetworkDevice(String address, String username, String password)
            throws UnknownHostException {
        this.address = InetAddress.getByName(address);
        this.node = address;
        this.username = username;
        this.password = password;
        config = new HashMap<>();
    }
    
    @Override
    public abstract void run ();
    
    public void setCommands(List<String> commands) {
        this.commands = commands;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> pair : config.entrySet()) {
            sb.append(pair.getKey()).append("\n").append(pair.getValue());
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.address);
        hash = 59 * hash + Objects.hashCode(this.node);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NetworkDevice other = (NetworkDevice) obj;
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.node, other.node)) {
            return false;
        }
        return true;
    }
    
    public Map<String, String> getConfig() {
        return config;
    }
}

