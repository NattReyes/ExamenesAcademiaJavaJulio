package com.luv2code.springboot.crud.rest;
import com.luv2code.springboot.crud.entity.Personaje;
import com.luv2code.springboot.crud.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonajeRestController {

    private PersonajeService personajeService;

    @Autowired
    public PersonajeRestController(PersonajeService thePersonajeService) {
        personajeService = thePersonajeService;
    }

    // expose "/personajes" and return a list of personajes
    @GetMapping("/personajes")
    public List<Personaje> findAll() {
        return personajeService.findAll();
    }

    // add mapping for GET /personajes/{personajeId}

    @GetMapping("/personaje/{personajeId}")
    public Personaje getPersonaje(@PathVariable int personajeId) {

    	Personaje thePersonaje = personajeService.findById(personajeId);

        if (thePersonaje == null) {
            throw new RuntimeException("Personaje id not found - " + personajeId);
        }

        return thePersonaje;
    }

    // add mapping for POST /personajes - add new personaje

    @PostMapping("/personajes")
    public Personaje addPersonaje(@RequestBody Personaje thePersonaje) {

        thePersonaje.setId(0);

        Personaje dbPersonaje = personajeService.save(thePersonaje);

        return dbPersonaje;
    }

    // add mapping for PUT /personajes - update existing personajes

    @PutMapping("/personajes")
    public Personaje updatePersonaje(@RequestBody Personaje thePersonaje) {

    	Personaje dbPersonaje = personajeService.save(thePersonaje);

        return dbPersonaje;
    }

    // add mapping for DELETE /personajes/{employeeId} - delete personajes

    @DeleteMapping("/personajes/{personajeId}")
    public String deletePersonaje(@PathVariable int personajeId) {

    	Personaje tempPersonaje = personajeService.findById(personajeId);

        // throw exception if null

        if (tempPersonaje == null) {
            throw new RuntimeException("Personaje id not found - " + personajeId);
        }

        personajeService.deleteById(personajeId);

        return "Deleted personaje id - " + personajeId;
    }

}














