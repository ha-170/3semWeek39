package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;
import entities.Person;
import exceptions.PersonNotFoundException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */

public interface IPersonFacade {
    
  public PersonDTO addPerson(String fName, String lName, String phone, String street, int zip, String city);  
  public PersonDTO deletePerson(int id) throws PersonNotFoundException;  
  public PersonDTO getPerson(int id) throws PersonNotFoundException;
  public PersonsDTO getAllPersons();
  public PersonDTO editPerson(PersonDTO p) throws PersonNotFoundException;  
  
}