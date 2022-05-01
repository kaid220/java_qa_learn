package ru.stqa.sandbox;

public class Square {
  public int l; //создана переменная являющаяся свойством объекта

  public Square(int l) { //создан конструктор Square
    this.l = l;
  }
  public int area(){
    return this.l*this.l;
  }
}
