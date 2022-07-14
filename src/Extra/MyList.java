package Extra;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {

        List<String> q2 = new ArrayList<>();
        q2.add("April");
        q2.add("May");
        q2.add("June");

        System.out.printf("ArrayList has %d element(s) \n", q2.size());

        //add to 1, (extends list)
        q2.add(0,"March");
        // установка нового значения для 2-го объекта
        q2.set(1, "april2");

        // проверяем наличие элемента
        if(q2.contains("May")){
            System.out.println("ArrayList contains May");
        }
        for(String month : q2){
            System.out.println(month);
        }
        // удалим несколько объектов
        // удаление конкретного элемента
        q2.remove("april2");
        // удаление по индексу
        q2.remove(0);

        System.out.println();
        for(String month : q2){
            System.out.println(month);
        }


    }
}
