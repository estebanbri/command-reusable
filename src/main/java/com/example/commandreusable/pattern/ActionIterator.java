package com.example.commandreusable.pattern;

import com.example.commandreusable.pattern.util.Container;

import java.util.Collection;

public class ActionIterator implements Action {

    ActionList actionList;
    Class clazz;

    public ActionIterator(String className) throws ClassNotFoundException {
        clazz = Class.forName(className);
    }

    public void setActionList(Collection<Action> actionList){
        this.actionList = new ActionList(actionList);
    }

    @Override
    public void execute(Container container) {
        Collection<?> values = (Collection<?>) container.getValue(clazz);
        if(values==null) return;

        // Por cada OBJECTO DTO que venga en la coleccion se va a ejecutar Accion2
        for(Object o : values){
            // Almaceno el OBJECTO DTO actual para que sea recuperado por Accion2
            container.saveValue(clazz, o);
            // Ejecuto acciones agregadas a actionList (En este caso es unicamente Accion2)
            actionList.execute(container);
        }
    }
}
