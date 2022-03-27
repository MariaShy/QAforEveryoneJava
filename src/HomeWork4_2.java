import java.util.Arrays;

public class HomeWork4_2 {
    public void mainHW4_2(String[] args) {

/* Задача №1
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик) */

        String s1 = "Перестановочный алгоритм быстрого действия";
        System.out.print("Задача №1: ");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'о') {
                System.out.print(s1.charAt(i));
            }
        }
        System.out.println();

/*Задача №2
Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.*/
        String s2 = "Перевыборы выбранного президента";
        int sum = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е') {
                sum++;
            }
        }
        System.out.println("Задача №2: " + sum);

/*Задача №3
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29. */
        String s3 = "Посмотрите как Рите нравится ритм";
        s3=s3.toLowerCase();
        String sub = "рит";
        System.out.print("Задача №3: ");
        /*
        for (int i = 0; i < s3.length() - 3; i++) {
            if (s3.substring(i, i + 3).equals(sub)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); */
        int index = s3.indexOf("рит");
        while (index !=-1){
            System.out.println(index);
            index=s3.indexOf("рит",index+1);
        }


/*Экстра задача
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.*/
        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};
        int countOfArrayElements =0;
       /*
        for (int i = 0; i < array.length; i++) {
                countOfArrayElements = countOfArrayElements+array[i].length;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (array[i][j].charAt(k) == 'е') {
                        j++;
                        k=0;
                        countOfArrayElements--;
                    }
                }
            }
        }
        */

        for (int i=0; i<array.length; i++){
            for (int j=0; j< array[i].length; j++){
                if(!array[i][j].contains("е"))
                    countOfArrayElements++;
            }
        }
        System.out.println("Экстра задача: " + countOfArrayElements);
    }
}
