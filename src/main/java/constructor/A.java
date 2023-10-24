package constructor;

public class A {

    int x;
    A() {
        //super(); конструктор предка
        //super. предок
        //this() ссылка на мой конструктор
        //this. ссылка на меня
        super(); //в каждом конструкторе первой строчкой вызывается конструктор предлка либо свой конструктор (),
        //если не прописываем явно это делает компилятор
        System.out.println("A " + this.hashCode());
        x = 42;
    }

    void f() {
        System.out.println("A.f");
    }
}

class B extends A {
    B() {
        System.out.println("B " + x);
    }

    void f() {
        System.out.println("B.f");
    }
}

class C extends B {
    C() {
        System.out.println("C");
    }

    void f() {
        System.out.println("C.f");
    }
}

class Test {
    public static void main(String[] args) {
        B ref0 = new C();
        A ref1 = ref0;
        ref1.f();
    }
}
