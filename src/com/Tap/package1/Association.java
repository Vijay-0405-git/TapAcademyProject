package com.Tap.package1;

class Heart {
    private int bpm;
    private float weight;

    public Heart(int bpm, float weight) {
        this.bpm = bpm;
        this.weight = weight;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

class Brain {
    private float weight;
    private String colour;

    public Brain(float weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

class Bike {
    int speed;
    int cost;

    public Bike(int speed, int cost) {
        this.speed = speed;
        this.cost = cost;
    }

    public void displayBikeInfo() {
        System.out.println("Bike Speed: " + speed + " km/h");
        System.out.println("Bike Cost: ₹" + cost);
    }
}

class Books {
    String name;
    String author;

    public Books(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }
}

class Person {
    // Composition (tightly bound)
    protected Brain brain = new Brain(1600.0f, "Grey");
    protected Heart heart = new Heart(82, 250.0f);

    // Aggregation (externally created and passed in)
    Bike bike;
    Books books;

    public Person(Bike bike, Books books) {
        this.bike = bike;
        this.books = books;
    }

    public void showInfo() {
        System.out.println("Heart BPM: " + heart.getBpm());
        System.out.println("Heart Weight: " + heart.getWeight());
        System.out.println("Brain Weight: " + brain.getWeight());
        System.out.println("Brain Colour: " + brain.getColour());
        System.out.println("--- Bike Info ---");
        bike.displayBikeInfo();
        System.out.println("--- Book Info ---");
        books.displayBookInfo();
    }
}

class Police extends Person {
    public Police(Bike bike, Books books) {
        super(bike, books);
    }
}

public class Association {
    public static void main(String[] args) {
        Bike bike = new Bike(120, 95000);
        Books book = new Books("Java Fundamentals", "James Gosling");

        Police police = new Police(bike, book);
        police.showInfo();
    }
}
