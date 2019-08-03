package com.example.commandreusable;

import com.example.commandreusable.pattern.Action;
import com.example.commandreusable.pattern.ActionList;
import com.example.commandreusable.pattern.AppConfig;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CommandReusableApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandReusableApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ActionList actionList = (ActionList) context.getBean("beanEntrada");
		actionList.execute(new Container());

	}

}
