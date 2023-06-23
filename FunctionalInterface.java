package java8features;

public interface FunctionalInterface {
    void abstractFun(int x);
    default void normalFun()
    {
        System.out.println("Hello");
    }
}
