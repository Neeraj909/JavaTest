package java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;

public class Java8 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(9, 8);
        FunctionalInterface functionalInterface = (int x) -> System.out.println(2 * x);
        functionalInterface.abstractFun(58);
        functionalInterface.normalFun();
        Runnable zeroParameterLambda = () -> System.out.println("Zero parameter lambda");
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        // print all element using lamda exp
        arrL.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
        FuncInter1 add = (int x, int y) -> x + y;
        FuncInter1 multiply = (int x, int y) -> x * y;
        Java8 tobj = new Java8();
        System.out.println("Addition is "
                + tobj.operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is "
                + tobj.operate(6, 3, multiply));
        //fun(System.out::println, 1000);

    }
    static void fun(InterFaceTwo t, Integer p)
    {
        // calls the print function
        t.print(p);
    }
        interface FuncInter1 {
            int operation(int a, int b);
        }
        interface FuncInter2 {
            void sayMessage(String message);
        }
        private int operate(int a, int b, FuncInter1 fobj)
        {
            return fobj.operation(a, b);
        }

}
