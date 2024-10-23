import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static Extra.CodeWarsExtra.*;

public class Main {
    public static void main(String[] args) {

        Extra.CodeWarsExtra cw = new Extra.CodeWarsExtra();
        System.out.println(cw.getCount("122"));


        //System.out.println("1233".chars().distinct().toArray());

        //int [][] arrDouble =new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};

//        Map<String, String[]> shelves = Map.of(
//                "полка 1", new String[]{"1984", "три товарища"},
//                "полка 2", new String[]{"убить пересмешника", "герой нашего времени"},
//                "полка 3", new String[]{"10 негритят", "на западном фронте без перемен"}
//        );
//        List<List<String>> books = List.of(
//                List.of("1984", "оруэлл"),
//                List.of("три товарища", "ремарк"),
//                List.of("убить пересмешника", "ли"),
//                List.of("герой нашего времени", "лермонтов"),
//                List.of("10 негритят", "кристи"),
//                List.of("на западном фронте без перемен", "ремарк")
//        );

//        String t1 = "123456 123";
//        String[] t2=t1.split("1");//0);
//        for(String str:t2){
//            System.out.println(str);
//        }
//
//        Map<Character, Integer> map = Map.of(
//                'I', 1,
//                'V', 5,
//                'X', 10,
//                'L', 50,
//                'C', 100,
//                'D', 500,
//                'M', 1000
//        );
//
//        System.out.println(map.get('M'));

        //System.out.println((t1.indexOf('o') == -1));

        /*
        Set<String> mySet = new HashSet<>() ;
        mySet.add("i");
        mySet.add("a");
        mySet.add("i");
        System.out.println(mySet.size()); // 2 */

        /*
        // Title1 Descr1
        // Title2 Descr2
        List<List<String>> temp = new ArrayList<>();
        temp.add(0, List.of("Title1", "Descr1"));
        temp.add(1, List.of("Title2", "Descr2"));
        System.out.println(temp.get(0).get(1)); // Descr1 */
    }

//    public static String findScreenHeight(int width, String ratio) {
//        String[] str = ratio.split(":");
//        int ratio1 = Integer.parseInt(str[0]);
//        int ratio2 = Integer.parseInt(str[1]);
//        int height = width * ratio2 / ratio1 ;
//        return String.format("%dx%d",width, height);
//    }
}
