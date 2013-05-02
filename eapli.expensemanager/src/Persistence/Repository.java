/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;

/**
 *
 * @author arocha
 */
public interface Repository<T, PK> {
    T save(T entity);
    
    List<T> all();
    
    T findById(PK id);
}

