package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);
        Stream<Integer> sequentialStream=myList.stream();
        Stream<Integer> parallelStream=myList.parallelStream();
        Stream<Integer> highNum=parallelStream.filter(p->p>90);
        highNum.forEach(p->System.out.println("High Nums parallel="+p));
        Stream<Integer> highNum2=sequentialStream.filter(p->p>90);
        highNum2.forEach(p->System.out.println("High Nums sequential="+p));

    }
}
