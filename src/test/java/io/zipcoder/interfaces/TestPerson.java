package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        String expectedName = "George";
        long expectedId = 01;

        //when
        Person person = new Person(expectedId, expectedName);
        String actualName = person.getName();
        long actualId = person.getId();

        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setNameTest(){
        Person person = new Person(01, "George");
        String expectedName = "George";

        String actualName = person.getName();
        person.setName(expectedName);

        Assert.assertEquals(actualName, expectedName);
    }

}
