package org.example.singleton;

import javax.ejb.Remote;

@Remote
public interface MySingleton {
    String hello();
}
