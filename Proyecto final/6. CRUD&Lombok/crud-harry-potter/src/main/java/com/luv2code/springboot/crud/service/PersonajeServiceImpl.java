package com.luv2code.springboot.crud.service;
import com.luv2code.springboot.crud.dao.PersonajeDAO;
import com.luv2code.springboot.crud.entity.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    private PersonajeDAO personajeDAO;

    @Autowired
    public PersonajeServiceImpl(PersonajeDAO thePersonajeDAO) {
    	personajeDAO = thePersonajeDAO;
    }

    @Override
    public List<Personaje> findAll() {
        return personajeDAO.findAll();
    }

    @Override
    public Personaje findById(int theId) {
        return personajeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Personaje save(Personaje thePersonaje) {
        return personajeDAO.save(thePersonaje);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
    	personajeDAO.deleteById(theId);
    }
}






