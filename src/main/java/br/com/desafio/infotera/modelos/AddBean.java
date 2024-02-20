//package br.com.desafio.infotera.modelos;
//
//import br.com.desafio.infotera.modelos.*;
//
//import javax.enterprise.context.RequestScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//@Named
//@RequestScoped
//public class AddBean {
//
//    @Inject
//    private PersonRepository personRepository;
//
//    private Person newPerson = new Person();
//
//    public void savePerson() {
//        personRepository.save(newPerson);
//        newPerson = new Person();
//    }
//
//    public Person getNewPerson() {
//        return newPerson;
//    }
//
//}