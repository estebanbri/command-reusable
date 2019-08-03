package com.example.commandreusable.pattern;

import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

@Service
public abstract class ActionDecition implements Action {

    ActionList trueActionList;
    ActionList falseActionList;

    @Override
    public void execute(Container container) {
        if(evaluate(container)){
            trueActionList.execute(container);
        }else{
            falseActionList.execute(container);
        }
    }

    /**
     *  Metodo abstracto para implemtar una evaluacion. Dependiendo del resultado execute va a
     *  determinar que lista de acciones debe ejecutar
     */
    public abstract boolean evaluate(Container container);

    // GETTERS Y SETTERS
    public ActionList getTrueActionList() { return trueActionList; }
    public void setTrueActionList(ActionList trueActionList) { this.trueActionList = trueActionList; }
    public ActionList getFalseActionList() { return falseActionList; }
    public void setFalseActionList(ActionList falseActionList) { this.falseActionList = falseActionList; }
}
