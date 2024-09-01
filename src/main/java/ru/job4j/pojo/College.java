package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kapaev Evgeniy");
        student.setGroup("DVS-10A1");
        student.setDate("20.08.2015");

        System.out.println(student.getName() + " of group "
                + student.getGroup() + " was enrolled " + student.getDate());
    }
}
