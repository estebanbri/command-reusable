package com.example.commandreusable.pattern;

import com.example.commandreusable.pattern.business.Action1;
import com.example.commandreusable.pattern.business.Action2;
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

    @Bean("beanEntrada")
    public ActionList m1(){
        ActionList actionList = new ActionList();
        actionList.add(action1);
        actionList.add(action2);
        return actionList;
    }
}
