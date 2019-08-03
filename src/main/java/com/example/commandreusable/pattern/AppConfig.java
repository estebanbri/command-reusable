package com.example.commandreusable.pattern;

import com.example.commandreusable.pattern.business.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.commandreusable.pattern.business")
public class AppConfig {

    @Autowired
    Action1 action1;

    @Autowired
    Action2 action2;

    @Autowired
    ActionDesitionMayorEdad actionDesitionMayorEdad;

    @Autowired
    ActionMayorEdad actionMayorEdad;

    @Autowired
    ActionMenorEdad actionMenorEdad;

    @Bean("beanEntrada")
    public ActionList m1(){
        ActionList actionList = new ActionList();
        actionList.add(action1);
        actionList.add(m2());
        actionList.add(m3());
        return actionList;
    }

    @Bean("asd")
    public ActionIterator m2(){
        ActionIterator actionIterator = null;
        try {
            actionIterator = new ActionIterator("com.example.commandreusable.pattern.dto.PersonaDTO");
            ActionList actionList = new ActionList();
            actionList.add(action2);
            actionIterator.setActionList(actionList);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return actionIterator;
    }

    @Bean("actionDesition")
    public Action m3(){
        ActionDecition actionDesition = new ActionDesitionMayorEdad();
        ActionList trueActionList = new ActionList();
        ActionList falseActionList = new ActionList();

        trueActionList.add(actionMayorEdad);

        falseActionList.add(actionMenorEdad);

        actionDesition.setTrueActionList(trueActionList);
        actionDesition.setFalseActionList(falseActionList);
        return actionDesition;
    }
}
