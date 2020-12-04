package com.moshcoder;

public abstract class Item {
    private String name;
    private int id;
    private int size;

    public Item(String name, int id, int size) {
        this.name = name;
        this.id = id;
        this.size = size;
    }

    public abstract void hello();

    public void calculateSize(int i) {
        this.size = size + i;
        System.out.println("New Size Value : " + size);
    }
    /*public void Display(){
        System.out.println("Printing Item");
    }*/

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", size=" + size +
                '}';
    }
}

class Furniture extends Item {
    public Furniture(String name, int id, int size) {
        super(name, id, size);
    }

    @Override
    public void hello() {
        System.out.println("printing hello from Fruniture");
    }

    //@Override
    public void Display() {
        System.out.println("Printing Furniture");
    }

}

class Book extends Item {
    public Book(String name, int id, int size) {
        super(name, id, size);
    }

    @Override
    public void hello() {
        System.out.println("printing hello from BOOK");
    }

    public void Display() {
        System.out.println("Printing Book");
    }
}

class Runner {
    public static void main(String[] args) {
        Item ob;
        ob = new Furniture("Rahul", 4, 40);
        ob.calculateSize(2);
        ob.hello();

        printing(ob);

        ob = new Book("test", 1, 1);
        printing(ob);

        /*
        1. Parent class, gives it's child its methods, 
        2. Item ob, works as a variable (ref), it can only call methods for parent class. if it abstract or override anyway, it will call from the child...else only from parent.
        3. Also, there can be a method in runner class, which will sense whatever object is being input, it will print that class method.
        So, Item object, will only call methods from parent class, but by assigning new Objects from other classes will decide which child class method to execute.
        */

        if (ob instanceof Book) {
            System.out.println("ob is instance of Book, so Creating the Book instance again to call methods only in books which the parent doesnät know about");
            Book book = (Book) ob;
            book.Display();
        }


        ob = new Book("BedTime Stories", 5, 10);

       /* if(ob instanceof Item){
            System.out.println("Book is instance of Item");
            System.out.println(ob);
        }*/


    }

    public static void printing(Item object) {
        System.out.println("printing objects now");
        object.hello();
    }
}