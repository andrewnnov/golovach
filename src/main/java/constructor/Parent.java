package constructor;

/**
 * A class always has at least one constructor
 * If a class does not have a constructor, the compiler add one by default
 * an ancestor constructor is called within the descendant constructor
 *
 */

public class Parent {
    Parent() {
    }
}

class Child extends Parent {
    Child() {
        super();
    }

}
