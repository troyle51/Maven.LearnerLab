package io.zipcoder.interfaces;

public class Students {
    private Students(){ }
    private static class StudentsHelper{
        private static final Students INSTANCE = new Students();
    }

    public static Students getInstance(){
        return StudentsHelper.INSTANCE;
    }

}
