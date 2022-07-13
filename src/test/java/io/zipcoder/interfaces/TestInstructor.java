package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance() {
        Person instructor = new Instructor(0, null);
        Assert.assertTrue(instructor instanceof Person);
    }


}
