package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd(){
        People people = new People();
        people.addPerson(new Person(0, "Bob"));
        Object expected = people.personList.get(0);

        Object actual = people.personList.get(0);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemove() {
        People people = new People();
        people.addPerson(new Person(0, "Bob"));
        people.personList.get(0);
        people.personList.remove(0);
        Object expected = people.personList.size();

        Object actual = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindById(){
        Person person = new Person(111, null);
        long expected = 111;

        long actual = person.getId();

        Assert.assertEquals(expected, actual);
    }
}
