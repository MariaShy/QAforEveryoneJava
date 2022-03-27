public class HomeWork3_2 {
    public void mainHW3_2(String[] args) {
        //Задача №1 Необходимо вывести числа от 0 до 15.
        System.out.println("==1 task==");
        for (int i=0; i<=15; i++) {
            System.out.print(i + " ");
        }

/*Задача №2
Необходимо вывести все положительные степени числа 5 которые меньше 10000,
вывести результат возведения в степень.
 //Power 442:         5^442 = Infinity
        double d = 1.0;
        for (int i=0; i<10000; i++) {
            System.out.println("Power " + i + ":");
            d=Math.pow(5.0, (double)i);
            System.out.println("5^" + i + " = "+ d);
        }
*/      System.out.println();
        System.out.println("==2 task==");
        for (double i=0;Math.pow(5.0, i)<10000;i++)
        {
            //System.out.println("Power " + i + ":");
            System.out.println("5^" + i + " = "+ Math.pow(5.0, i));
        }

/*Задача №3
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).
*/
        System.out.println("==3 task==");
        System.out.println("1 variant (with if):");
        for (int i=40; i<=60; i++) {
            if (i%4==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("2 variant (without if):");
        for (int i=40; i<=60; i=i+4) {
                System.out.print(i +" ");
        }
    }
}
