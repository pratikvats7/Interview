package Java.designpatterns.proxydesignpattern;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();

        //heavy object will be initialized only after this call
        //if it was ExpensiveObject object = new ExpensiveObjectImpl(); heavy object would have been
        // initialized before
        object.process();
        object.process();

    }
}
