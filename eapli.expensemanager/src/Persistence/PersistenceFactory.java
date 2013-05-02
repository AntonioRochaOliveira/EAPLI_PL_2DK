/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arocha
 */
public class PersistenceFactory {
    
    private PersistenceFactory() {
    }

    public static RepositoryFactory buildPersistenceFactory() {
    JpaRepositoryFactory repo = new JpaRepositoryFactory();
     //InMemoryRepositoryFactory repo= new InMemoryRepositoryFactory();
        return (RepositoryFactory)  repo;
  
    }
}
