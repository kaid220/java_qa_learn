package ru.stqa.sandbox;

public class Hello1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Square areaofsquare = new Square(5);
        Rectangle pryam = new Rectangle(7,5);
        System.out.println(areaofsquare.area());
        System.out.println(pryam.area());

    }
}
