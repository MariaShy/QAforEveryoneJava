public class HomeWork2 { /*
Необходимо 1/создать целочисленные переменные a и b,
2/присвоить произвольные значения переменным на ваш выбор
и вывести результаты следующих операций с этими переменными:
3/сложение, 4/умножение,5/вычитание, 6/деление и 7/остаток от деления.
8/Так же сделать проверку на четность этих переменных и вывести результат.
 */
    public void mainHW2(String[] args) {
        //1 , 2 :
        int a =300000001;
        int b =2;

        System.out.println(String.format("%s + %s = %s", a,b,a+b)); // -3
        System.out.println(String.format("%s * %s = %s", a,b,a*b)); // -4
        System.out.println(String.format("%s - %s = %s", a,b,a-b)); // -5
        System.out.println(String.format("%s / %s = %s", a,b, a*0.1/b)); // -6
        System.out.println(String.format("%s %% %s = %s", a,b,a%b)); // -7
        System.out.println();
        isNumOdd(a);
        isNumOdd(b);

// Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        System.out.println("\u263A");
    }

    public void isNumOdd(int n) {
        if (n%2 == 0)
            System.out.println(n + " is even"); // -8
        else
            System.out.println(n + " is odd");
    }
}


