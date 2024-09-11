package org.example;

import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;
import org.example.task4.Clock;
import org.example.task5.Car;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Test Name");
        book.setAuthor("Test Author");
        book.setYear(2012);
        book.display();

        Student student = new Student();
        student.setFullName("John Doe");
        student.setGradeBookNum("12731273712");
        student.setAvgScore(4.75);
        student.print();

        Point point = new Point();
        point.setX(2.5);
        point.setY(5);
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

        Clock clock = new Clock();
        clock.setSeconds(59);
        clock.setMinutes(59);
        clock.setHours(22);
        clock.tick();
        clock.readTime();

        Car car = new Car();
        car.setBrand("Mazda");
        car.setModel("CX-5");
        car.setReleaseYear(2015);
        car.start();
        car.drive(3000);
        car.stop();
    }
}