package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
    Person student = new Student(0, null);

    Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Person student = new Student(0, null);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(0, "Terry");
        double expected = 2.0;

        student.learn(2.0);
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(actual, expected, .0001);
    }
}
