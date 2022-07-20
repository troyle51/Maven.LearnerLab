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
    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(0, "Bob");
        Student student = new Student(0, "Tray");
        instructor.teach(student, 2.0);

        double expected = 2.0;

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(actual, expected, 0.005);

    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(0, "Bob");
        Student student = new Student(0, "Tray");
        Student[] students = new Student[1];
        students[0] = student;
        instructor.lecture(students, 2.0);

        double expected = 2.0;

        double actual = students[0].getTotalStudyTime();

        Assert.assertEquals(actual, expected, 0.005);

    }


}
