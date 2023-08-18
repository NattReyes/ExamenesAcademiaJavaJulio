package com.luv2code.springboot.crud.service;
import java.util.List;

import com.luv2code.springboot.crud.entity.Personaje;

public interface PersonajeService {

    List<Personaje> findAll();

    Personaje findById(int theId);

    Personaje save(Personaje thePersonaje);

    void deleteById(int theId);

}
