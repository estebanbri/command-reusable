package com.example.commandreusable.pattern.business;


import com.example.commandreusable.pattern.Action;
import com.example.commandreusable.pattern.dto.PersonaDTO;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Action1 implements Action {

    @Override
    public void execute(Container container) {
        System.out.println("******  EJECUTANDO: Action1");
        System.out.println("*********    Inicializando PersonaDTO...");
        List<PersonaDTO> personas = callDB();
        System.out.println("*********    Almacenando PersonaDTO dentro del Container...");
        container.saveValue(PersonaDTO.class, personas);
    }

    private List<PersonaDTO> callDB(){
        return Arrays.asList(
                new PersonaDTO("Esteban","Briceno", 17),
                new PersonaDTO("Andres","Sati", 30));
    }
}
