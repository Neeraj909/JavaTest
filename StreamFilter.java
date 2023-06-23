package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"Apple Laptop",90000f));
        productsList.add(new Product(7,"Apple Laptop",80000f));
        List<Float> priceFilter=productsList.stream().
                filter(p->p.price > 30000).
                map(p->p.price).
                toList();
        System.out.println("priceFilter-->"+priceFilter);
        Stream.iterate(1, element->element+1)
                .filter(element->element%5==0)
                .limit(5)
                .forEach(System.out::println);
        productsList.stream().filter(product -> product.price == 30000)
                .forEach(p->System.out.println(p.name));
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
        Product productA=productsList.stream().max((product1,product2)->(product1.price>product2.price?1:-1)).get();
        System.out.println(productA.price);
        Product productB=productsList.stream().max((product1,product2)->(product1.price<product2.price)?1:-1).get();
        System.out.println(productB.price);
        long count=productsList.stream().filter(product -> product.price>30000).count();
        System.out.println(count);
        Set<Float> productPriceList=productsList.stream().filter(product -> product.price>26000)
                .map(product -> product.price)
                .collect(Collectors.toSet());
        System.out.println(productPriceList);

        Map<Integer,String> map=productsList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(map);
        HashMap<Integer, Integer> map1
                = new HashMap<Integer, Integer>();

        // Inserting elements in the Map
        // using put() method

        // Custom input addition
        map1.put(1, 4);
        map1.put(2, 5);
        map1.put(3, 7);
        map1.put(4, 2);
        map1.forEach((k,v)->System.out.println(k+" "+v));
        int max=map1.entrySet().stream()
                .max(Map.Entry.comparingByKey()).get().getValue();
        System.out.println(max);
        Map<String, Double> playerPercentile = new HashMap<>();


        // 1.1 add map entries
        playerPercentile.put("Morgan", 99.67);
        playerPercentile.put("Stewart", 90.98);
        playerPercentile.put("Mike", 93.65);
        playerPercentile.put("Cook", 91.67);
        playerPercentile.put("Stokes", 92.35);
        playerPercentile.put("Broad", 99.67);
        playerPercentile.put("Pietersen", 92.35);
        playerPercentile.put("Hussain", 94.89);
        playerPercentile.put("Collingwood", 92.35);
        playerPercentile.put("Flintoff", 93.65);
        playerPercentile.put("Strauss", 91.67);
        playerPercentile.put("Butler", 99.67);

        System.out.println("1. Original Map Entries :- \n");
        playerPercentile.forEach((k,v)->System.out.println("Key-->"+k+" Value-->"+v));
        Map<Double,Long> playersPercentileCount=playerPercentile.values().stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
        System.out.
                println(playersPercentileCount);

        String str="aw bw cw aw bw ew fg fg rwd dw dw dw bw bw cw cw";
      Map<String,Integer> wordMap=new HashMap<>();
     for(int i=0;i<str.split(" ").length;i++){
         wordMap.put(str.split(" ")[i],i);
     }
     System.out.println(wordMap);
        System.out.println(wordMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElse(null));
        int maxEntry =  Collections.max(wordMap.entrySet(), Map.Entry.comparingByKey()).getValue();
        System.out.println(maxEntry);





    }
}
