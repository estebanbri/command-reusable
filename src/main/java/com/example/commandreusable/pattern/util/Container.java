package com.example.commandreusable.pattern.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Container {

    Map map;
    String lastKey;
    Class lastClass;

    public Container(){
        this.map = new HashMap();
    }

    public <T> void saveValue(Class<T> key, T value){
        this.lastKey = key.getName();
        this.lastClass = key;
        this.map.put(key, value);
    }

    public <T> void saveValue(Class<T> key, Collection<T> value){
        this.lastKey = key.getName();
        this.lastClass = Collection.class;
        this.map.put(key, value);
    }

    public <T> T getValue(Class<T> key){
        return (T) this.map.get(key);
    }
}
