package org.example.singleton.impl;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import org.example.singleton.MySingleton;
import org.wildfly.common.net.HostName;


@Singleton
@Startup
public class MySingletonImpl implements MySingleton {    
    @Override
    public String hello() {
       return "Hello from " + HostName.getNodeName();
    }    
}
