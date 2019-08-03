package com.example.commandreusable.pattern.business;

import com.example.commandreusable.pattern.Action;
import com.example.commandreusable.pattern.dto.PersonaDTO;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Action2 implements Action {

    @Override
    public void execute(Container container) {
        System.out.println("******  EJECUTANDO: Action2");
        System.out.println("*********    Recuperando PersonaDTO del Container...");
        PersonaDTO persona = container.getValue(PersonaDTO.class);
        System.out.println("*********    Mostrando PersonaDTO...");
        System.out.println(persona);
    }
}
