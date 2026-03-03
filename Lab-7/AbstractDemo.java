

abstract class Base {
    abstract void debug();
}

class Subclass1 extends Base {
    @Override
    void debug() {
        System.out.println("Subclass1 Debug successful");
    }
}

class SUbclass2 extends Base {
    @Override
    void debug() {
        System.out.println("SUbclass2 Debug successful");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Base[] projectModules = new Base[2];

        projectModules[0] = new Subclass1();
        projectModules[1] = new SUbclass2();

        System.out.println(" Running Project Debug ");
        for (Base module : projectModules){
            module.debug();
        }
    }
}