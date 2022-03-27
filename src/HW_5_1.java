public class HW_5_1 {
    public  void mainHW5() {
/*Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел*/
    int a=7;
    int b=4;

    getSum(a, b);

    getMinus(a, b);

    getMultiple(a, b);

    getDel(a, b);

    }

    public  void getSum(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    public  void getMinus(int a, int b){
        int result = a-b;
        System.out.println(result);
    }

    public  void getMultiple(int a, int b){
        int result = a*b;
        System.out.println(result);
    }

    public  void getDel(int a, int b) {
        double result = 1.0 * a / b;
        System.out.println(result);
    }
}
