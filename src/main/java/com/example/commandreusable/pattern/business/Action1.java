package com.example.commandreusable.pattern.business;


import com.example.commandreusable.pattern.Action;
import com.example.commandreusable.pattern.dto.PersonaDTO;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Action1 implements Action {

//    private List<PersonaDTO> getPersonasDTO(){
//        return Arrays.asList(
//                new PersonaDTO("Esteban","Briceno"),
//                new PersonaDTO("Andres","Sati"));
//    }

    @Override
    public void execute(Container container) {
        System.out.println("******  EJECUTANDO: Action1");
        System.out.println("*********    Inicializando PersonaDTO...");
        PersonaDTO persona = new PersonaDTO("Esteban","Briceno");
        System.out.println("*********    Almacenando PersonaDTO dentro del Container...");
        container.saveValue(PersonaDTO.class, persona);
    }
}
