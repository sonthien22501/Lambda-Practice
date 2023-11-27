package forEachAndFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachAndFilterDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Thien");
        list.add("Anh");
        list.add("Hoang");
        list.add("Non");
        list.add("Nam");

        for (String s:list){
            if (s.startsWith("N")){
                System.out.println(s);
            }
        }

//        list.stream().forEach(t -> System.out.println(t));
        list.stream().filter(s -> s.startsWith("n")).forEach(t -> System.out.println(t));

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        map.forEach((key,value) -> System.out.println(key + ": " + value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        map.entrySet().stream().filter((s)-> s.getKey() % 2 ==0).forEach(obj -> System.out.println(obj));

//        Consumer<String> consumer = t -> System.out.println("print: "+t);
//        for (String s : list){
//            consumer.accept(s);
//        }
    }
}
