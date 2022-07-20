package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable {
    Person person;
    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public Long findById(long id){
        //Person person = personList.contains(id);
        return person.getId();
    }
    public void removeById(long id){
        //Person person = personList.contains(id);
        personList.remove(id);
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void removePerson(Person person){
        personList.remove(person);
    }
    public void removeAll(){
        personList.removeAll(personList);
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray();
    }

    public Iterator iterator(){
        Iterator<Person> iterator = personList.iterator();
        return iterator;
    }

}
