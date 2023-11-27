package LambdaExample;

@FunctionalInterface
public interface MyFunctionalInterface {

    void m1(); //abstract method

    default void m2(){
        System.out.println("Default method");
    }

    static void m3(){
        System.out.println("Static method");
    }
}
