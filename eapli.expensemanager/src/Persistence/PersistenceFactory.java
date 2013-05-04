/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.FileInputStream;
import java.util.Properties;
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
    	return loadRepositoryFactoryFromFile();
    }

	private static RepositoryFactory loadRepositoryFactoryFromFile() {
		Properties persistence = new Properties();
		String PROPERTIES_PATH = "config/config.properties";
		try{
			persistence.load(new FileInputStream(PROPERTIES_PATH));
			String property = PersistenceFactory.class.getSimpleName() + ".useFactory";
			Class factoryClass = Class.forName(persistence.getProperty(property));
			return (RepositoryFactory) factoryClass.newInstance();
		}catch(Exception e){
			System.err.println("Unable to load persistence factory");
			e.printStackTrace(System.err);
			System.err.println("Reverting to Memory");
			return new InMemoryRepositoryFactory();
		}
	}
}
