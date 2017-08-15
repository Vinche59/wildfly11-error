package org.example.test;

import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.example.singleton.MySingleton;

@Stateless
public class Test {
    @Inject
    Logger LOGGER;
    
    @EJB(lookup = "ejb:singleton-ear/singleton-ejb//MySingletonImpl!org.example.singleton.MySingleton")
    private MySingleton mySingleton;
    
    @Schedule(hour = "*", minute = "*", second="*/3", persistent = false)
    public void test() {
        LOGGER.info("Call Singleton EJB : " + mySingleton.hello());
    }
    
}
