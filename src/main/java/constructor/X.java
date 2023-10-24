package constructor;

//public (all)
//protected (in class and in package and in children)
// 'package private', 'default scope' (in class and in package)
//private (only in class)

//в файле с именем Х может не быть класса с имением Х
// если есть публичный класс в  файле то его имя должно совпадать с именем класса

public class X {
    public X(int k) {
        super();
        System.out.println("X(int)");
    }
    X (String s) {
        this(0);
        System.out.println("X(String)");
    }
}

class Y extends X {
    public Y() {
        super("");
        System.out.println("Y()");
    }

    public Y(int x, int y) {
       this();
       //this(0, 0); - нельзя делать петли (рекурсии)
       System.out.println("Y(int, int)");
    }
}

class Test2 {

    public static void main(String[] args) {
        new Y(0, 0);
    }
}
