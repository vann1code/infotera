//package br.com.desafio.infotera.modelos;
//
//import jakarta.annotation.PostConstruct;
//import jakarta.faces.view.ViewScoped;
//import jakarta.inject.Named;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import java.io.Serializable;
//import java.util.List;
//
//@Named
//@ViewScoped
//public class PersonBean implements Serializable {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    private List<Person> persons;
//    private Person newPerson;
//
//    @PostConstruct
//    public void init() {
//        loadPersons();
//        newPerson = new Person();
//    }
//
//    public List<Person> getUsers() {
//        return persons;
//    }
//
//    public Person getNewUser() {
//        return newPerson;
//    }
//
//    @Transactional
//    public void addUser() {
//        entityManager.persist(newPerson);
//        loadPersons();
//        newPerson = new Person();
//    }
//
//    @Transactional
//    public void deletePerson(Person person) {
//        entityManager.remove(entityManager.merge(person));
//        loadPersons();
//    }
//
//    private void loadPersons() {
//        persons = entityManager.createQuery("SELECT u FROM Person u", Person.class).getResultList();
//    }
//}
