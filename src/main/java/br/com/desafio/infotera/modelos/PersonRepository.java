//package br.com.desafio.infotera.modelos;
//
//import jakarta.ejb.Stateless;
//import javax.persistence.*;
//import java.util.List;
//
//@Stateless
//public class PersonRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public void save(Person person) {
//        entityManager.persist(person);
//    }
//
//    public void update(Person person) {
//        entityManager.merge(person);
//    }
//
//    public void remove(Person person) {
//        entityManager.remove(entityManager.merge(person));
//    }
//
//    public Person findById(Long userId) {
//        return entityManager.find(Person.class, userId);
//    }
//
//    public List<Person> findAll() {
//        return entityManager.createQuery("SELECT user FROM Person user", Person.class).getResultList();
//    }
//
//    public List<Person> findByName(String name) {
//        return entityManager.createQuery("SELECT user FROM Person user WHERE user.nmPerson LIKE :name", Person.class)
//                .setParameter("name", "%" + name + "%")
//                .getResultList();
//    }
//}
