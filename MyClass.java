package java8features;

public class MyClass implements Interface1,Interface2{

    public static void main(String[] args) {
        Interface1 i1 = System.out::println;

        i1.method1("abc");

    }
    @Override
    public void method1(String str) {

    }

    @Override
    public void log(String str) {
        System.out.println("MyClass logging::"+str);
        Interface1.print("abc");
    }

    @Override
    public void method2() {

    }
}
