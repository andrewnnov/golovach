package oop;


//1. у класса есть как минимум 1 конструктор
//2. если нет конструктора добавят по умолчанию
//3. в рамках конструирования потомка вызывается конструктор предка


public class Parent {

    Parent() {

    }

    Parent(int k) {

    }
}

class Child extends Parent {

}
