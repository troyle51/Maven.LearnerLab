package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public abstract class People implements Iterable {
    long id;
    List<Person> personList;

    public void addPerson(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        //Person person = personList.contains(id);
        return null;
    }
    public Person removeById(long id){
        //Person person = personList.contains(id);
        return null;
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
