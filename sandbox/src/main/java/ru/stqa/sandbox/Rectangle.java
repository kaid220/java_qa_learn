package ru.stqa.sandbox;

public class Rectangle {
  public double a;
  public double b;

  public Rectangle(double a,double b){//конструктор
    this.a=a;
    this.b=b;
  }

  public double area(){ //метод
   return this.a*this.b;
  }
}
