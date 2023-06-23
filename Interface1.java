package java8features;

public interface Interface1 {
    void method1(String str);

    default void log(String str){
        System.out.println("I1 logging::"+str);
    }

    static void print(String str){
        System.out.println("Printing "+str);
    }
}
