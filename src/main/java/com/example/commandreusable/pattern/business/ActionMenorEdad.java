package com.example.commandreusable.pattern.business;

import com.example.commandreusable.pattern.Action;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

@Service
public class ActionMenorEdad implements Action {
    @Override
    public void execute(Container container) {
        System.out.println("Ejecutando accion para menores de edad");
    }
}
