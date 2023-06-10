package org.example;

import controler.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;
import service.DataServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher sensei = new Teacher("Коменский, И.Г. ", 1968, Disciples.PROGRAMMING);

        Student katya = new Student(" Ш.А.Амонашвили ", 1991);
        Student vasya = new Student(" С.Т.Щацкий ", 1975);
        Student kirill = new Student(" Я.Корчак ", 1956);

        List<Student> list = new ArrayList<>(Arrays.asList(katya, vasya, kirill));

        controller.create(list,sensei);
        controller.read();
    }
}