package hw13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("White.");
        colors.add("Tan.");
        colors.add("Yellow.");
        colors.add("Orange.");
        colors.add("Red.");
        colors.add("Pink.");
        colors.add("Purple.");
        colors.add("Blue.");
        System.out.println(colors.size());
//        System.out.println(colors.indexOf("Blue."));
//        System.out.println(colors.size());

        for(int i=0; i< colors.size(); i++){
            if (colors.get(i).contains("l")){
                System.out.println(colors.remove(i));
            }
        }
        System.out.println(colors.size());

        List<Integer> numbers = new ArrayList<>();
        for (int i=100; i<=1000; i++){
            numbers.add(i);
        }
        System.out.println(numbers.size()); //901

        // Exception in thread "main" java.util.ConcurrentModificationException
//        for(int num : numbers){
//            if (num%2 == 0){
//                numbers.remove(num);
//            }
//        }

//        for(int i=0;i<numbers.size();i++){
//            if (numbers.get(i)%2 == 0){
//                System.out.println(numbers.remove(i));
//            }
//        }
//        System.out.println(numbers.size()); //450

        int tmp =0;
        for(Integer i=0;i<numbers.size();i++){
            tmp = numbers.get(i);
            System.out.println(tmp);
            if (tmp%2== 0){
                System.out.println(numbers.remove(i));
            }
        }
        System.out.println(numbers.size()); //500

    }
}
