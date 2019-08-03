package com.example.commandreusable.pattern.business;

import com.example.commandreusable.pattern.ActionDecition;
import com.example.commandreusable.pattern.dto.PersonaDTO;
import com.example.commandreusable.pattern.util.Container;
import org.springframework.stereotype.Service;

@Service
public class ActionDesitionMayorEdad extends ActionDecition {

    @Override
    public boolean evaluate(Container container) {
        PersonaDTO persona = container.getValue(PersonaDTO.class);
        return persona.getEdad()>18;
    }

}
