package java8features;

public class Recursion {
    static int n1=0,n2=1,n3=0;
    public static void methodOne(){
        methodTwo();
        System.out.println("methodOne");

    }
    public static void methodTwo(){
        methodThree();
        System.out.println("methodTwo");

    }
    public static void methodThree(){
        System.out.println("methodThree");
    }
    public static void main(String[] args) {
      methodOne();
      System.out.println(factorial(5));
      System.out.println(n1+"  "+n2);
        Fibonacci(10);
    }
    public static int factorial(int n){
        if(n==1)
            return 1;

        return n * factorial(n-1);
    }
    public static void Fibonacci(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            Fibonacci(count-1);
        }

    }


}
