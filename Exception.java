package java8features;

public class Exception {
    int i=0;
    static int j=0;
    public void m1(){
        i=10;
        j=10;
        System.out.println(i);
    }
    public void m2(){
      m1();
    }

    public static void main(String[] args) {
        Exception e=new Exception();
        System.out.println(e.i);
        System.out.println(j);
   e.m1();
        System.out.println(e.i);
        System.out.println(j);


    }

}
