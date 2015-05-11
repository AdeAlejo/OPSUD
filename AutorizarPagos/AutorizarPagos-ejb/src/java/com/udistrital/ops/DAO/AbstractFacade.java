/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udistrital.ops.DAO;

import javax.persistence.EntityManager;

/**
 *
 * @author Administrator
 */
public abstract class AbstractFacade<T> {
    
    private T entity;
    
    public abstract EntityManager getEntityManager();
    
    
    public int count(){
        return 1;
    }
    
    
    public void create(T object) {
        getEntityManager().persist(object);
    }
    
    public void edit(T object){
        getEntityManager().merge(object);
    }
    
    public T find(Object key){
//        return entityManager.find(T, key);
    return null;
    }
    
    public void remove(T objeto) {
        getEntityManager().remove(objeto);
    }
}
