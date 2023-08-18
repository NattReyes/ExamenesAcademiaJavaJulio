package com.luv2code.springboot.crud.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.luv2code.springboot.crud.entity.Personaje;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class PersonajeDAOJpaImpl implements PersonajeDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public PersonajeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Personaje> findAll() {

        // create personaje
        TypedQuery<Personaje> theQuery = entityManager.createQuery("from Personaje", Personaje.class);

        // execute query and get result list
        List<Personaje> personajes = theQuery.getResultList();

        // return the results
        return personajes;
    }

    @Override
    public Personaje findById(int theId) {

        // get personaje
    	Personaje thePersonaje = entityManager.find(Personaje.class, theId);

        // return personaje
        return thePersonaje;
    }

    @Override
    public Personaje save(Personaje thePersonaje) {

        // save personaje
    	Personaje dbPersonaje = entityManager.merge(thePersonaje);

        // return the db
        return dbPersonaje;
    }

    @Override
    public void deleteById(int theId) {

        // find personaje by id
    	Personaje thePersonaje = entityManager.find(Personaje.class, theId);

        // remove personaje
        entityManager.remove(thePersonaje);
    }
}











