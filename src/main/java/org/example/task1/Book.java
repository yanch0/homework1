package org.example.task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    public Book() {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: " +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year;
    }

    public void display(){
        System.out.println(this.toString());
    }
}
