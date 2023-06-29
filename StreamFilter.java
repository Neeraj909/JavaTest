package java8features;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class StreamFilter {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        productsList.add(new Product(6, "Apple Laptop", 90000f));
        productsList.add(new Product(7, "Apple Laptop", 80000f));
        List<Float> priceFilter = productsList.stream().
                filter(p -> p.price > 30000).
                map(p -> p.price).
                toList();
        System.out.println("priceFilter-->" + priceFilter);



        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        Integer maxValue = list1.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
        System.out.println(maxValue);
        // Creating list of integers
        List<Integer> array = Arrays.asList(-2, 1, 4, 6, 8);

        // Finding sum of all elements
        int sum = array.stream().reduce(2,
                (element1, element2) -> element1 * element2);

        // Displaying sum of all elements
        System.out.println("The sum of all elements is " + sum);

        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .forEach(System.out::println);


        productsList.stream().filter(product -> product.price == 30000)
                .forEach(p -> System.out.println(p.name));

        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        Product productA = productsList.stream().max((product1, product2) -> (product1.price > product2.price ? 1 : -1)).get();
        System.out.println(productA.price);

        Product productB = productsList.stream().max((product1, product2) -> (product1.price < product2.price) ? 1 : -1).get();
        System.out.println(productB.price);

        long count = productsList.stream().filter(product -> product.price > 30000).count();
        System.out.println(count);

        Set<Float> productPriceList = productsList.stream().filter(product -> product.price > 26000)
                .map(product -> product.price)
                .collect(Collectors.toSet());
        System.out.println(productPriceList);

         Map<Integer, String> map = productsList.stream().collect(toMap(p -> p.id, p -> p.name));
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
        map1.forEach((k, v) -> System.out.println(k + " " + v));
        int max = map1.entrySet().stream()
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
        playerPercentile.forEach((k, v) -> System.out.println("Key-->" + k + " Value-->" + v));

        Map<Double, Long> playersPercentileCount = playerPercentile.values().stream().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        System.out.
                println(playersPercentileCount);

        String str = "awbwcwawbwewfgfgrwddwdwdwbwbwcwcw";

        Map<String,Integer> listToMap = Arrays.stream(str.split(""))
                .collect(Collectors.toMap(k -> k, k->1, (e,n) -> e+1));


        System.out.println("print------------>"+listToMap);

        int maxEntry = Collections.max(listToMap.entrySet(), Map.Entry.comparingByKey()).getValue();
        System.out.println(maxEntry);


    }
}
