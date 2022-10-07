package Extra;

import java.util.ArrayList;
import java.util.List;

public class CodeWarsExtra {



        public static int computeDepth(int n) {
            int m=1;
            int temp = 0;
            int [] arr = {0,1,2,3,4,5,6,7,8,9};

            while(arrSum(arr) > -10){
                temp = n*m;
                String strTemp = Integer.toString(temp);
                for (int i=0; i< strTemp.length(); i++){
                    for (int j=0; j< arr.length; j++){
                        if((strTemp.charAt(i) - 48) == arr[j]){
                            arr[j]=-1;
                        }
                    }
                }
                m++;
            }
            return m-1;
        }

        public static int arrSum(int[] arr){
            int sum=0;
            for (int i=0; i<arr.length; i++){
                sum +=arr[i];
            }
            return sum;
        }



    public static String getMiddle(String word) {
        int i = word.length()/2;
        if (word.length()%2 == 0){
            return "" + word.charAt(i)+word.charAt(i+1);
        }
        else{
            return "" + word.charAt(i);
        }
    }

    public static String pattern(int n){
        if (n<=0)
            return "";
        else {
            String str = "";
            for (int i=0; i<n; i++){
                str+= "" + Integer.toString(i).repeat(i) +"\n";
            }
            return str.substring(0, str.length()-1);
        }
    }

    public int squareDigits(int n) {
        // 811181, .squareDigits(9119)

       String str1 = Integer.toString(n);
       String str2 = "";

       for(int i=0; i < str1.length(); i++){
           int digit = str1.charAt(i) - 48;
           int pow = digit * digit;
           str2 += pow;
       }
       return Integer.parseInt(str2);
    }


    public static String accum(String s) { //accum("cwAt") -> "C-Ww-Aaa-Tttt"
        String result="";
        String s1=s.toUpperCase();
        String s2=s.toLowerCase();
        for (int i = 0; i< s1.length(); i++){
            result += s1.charAt(i) + Character.toString(s2.charAt(i)).repeat(i) + "-";
        }
        return result.substring(0, result.length()-1);
    }

    /*Функция должна возвращать строку, содержащую word в количестве count, разделённых separator.
Пример:
func("Тест", "О", 3)  # "ТестОТестОТест"
func("Java", "И", 2)  # "JavaИJava"
func("Java", "И", 1)  # "Java"
 */
    public static String duplicateStr(String word, String separator, int count){
      String result="";
      int i=1;
      while(i<count){
          result += word + separator;
          i++;
      }
      result +=word;
      return result;
    }

    static int [] arr2 = new int[2];
    public static int [] solve(int a, int b){
        if(a==0 || b==0){
            arr2[0]=a;
            arr2[1]=b;
        }
        else {
            if(a>=2*b){
                a = a-2*b;
                solve(a, b);
            }
            else{
                if (b>=2*a){
                    b = b-2*a;
                    solve(a, b);
                }
                else{
                    arr2[0]=a;
                    arr2[1]=b;
                }
            }
        }
        return arr2;
    }

    //"45.6@mail.ru;789@jkl.com;"
    public static void email(String str){
        String [] arr = str.split(";");

        for(int i=0; i<arr.length;i++){

            int start = arr[i].indexOf('@');
            int end = arr[i].indexOf('.',start);

            System.out.println(arr[i].substring(start+1,end));
        }
    }

    public static String[] dup(String[] arr){
        String tmp = "";
        for(int j =0; j< arr.length;j++) {
            for (int i =1; i< arr[j].length();i++){
                if (arr[j].charAt(i) != arr[j].charAt(i-1)){
                    tmp += "" +arr[j].charAt(i-1);
                }
                //arr[j].replace(arr[j].charAt(i), arr[j].charAt(i).repeat(2))
            }
            arr[j]=tmp+ arr[j].charAt(arr[j].length()-1);
            tmp="";
        }
        return arr;
    }

    public static double getDiscount(int litres){
        double discount = litres / 2 * 0.05;
        if (litres>=10){
            discount = 0.25;
        }
        return discount;
    }
    public static double fuelPrice(int litres, double pricePerLitre) {
        return litres*(pricePerLitre-getDiscount(litres));
    }

    /*
    In this kata you will create a function that takes a list of non-negative integers and
    strings and returns a new list with the strings filtered out.
Example
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, 2, "a", "b", 0, 15)) => List.of(1,2,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 231)) => List.of(1, 2, 231) */
    public static List<Object> filterList(final List<Object> list) {
        List<Object> listInt = new ArrayList<>();
        for(int i=0; i<list.size();i++){
            if (!list.get(i).getClass().getName().equals("java.lang.String")){
                listInt.add(list.get(i));
            }
        }
        return listInt;
    }

    public int numWords(List<String> lst){
        int result=0;

        for(String el: lst){
            if (result< el.length()){
                result=el.length();
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int [] res= new int[2];
        for (int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }

    public static String getEasy(String a){
        String res = "";
        int intRes = 0;
        try {
            intRes = Integer.parseInt(a) *50 +6;
        }
        catch(Exception e) {
            return "Error";
        }
        return "" + intRes;
    }

    public static int lastFibDigit(int n) {
        if (n==1) return n;
        if (n>1){
            int temp =0;
            int num1=1;
            int num2=1;
            for (int i=2;i<n;i++){
               temp=num1%10;
               num1=num2%10;
               num2=(temp+num1)%10;
               System.out.println(num2);
            }
        }
        return n;
    }

    public static int arithmetic(int a, int b, String operator) {
            int res = 0;
            switch (operator) {
                case "add":
                    res = a + b;
                    break;
                case "subtract":
                    res = a - b;
                    break;
                case "multiply":
                    res = a * b;
                    break;
                case "divide":
                    res = a / b;
                    break;
                default:
                    break;
            }
            return res;
        }


    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] str = name.split(" ");
        return str[0].charAt(0) + "." + str[1].charAt(0);
    }

    public int getCount(String str) {
        int vowelsCount = 0;
        for (int i=0;i <str.length(); i++){
            if ( str.charAt(i) =='a'||
                    str.charAt(i) =='e'||
                    str.charAt(i) =='i'||
                    str.charAt(i) =='o'||
                    str.charAt(i) =='u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

/*
*Написать метод, который принимает параметры n, m, l,
*и печатает последовательность нечетных чисел
*начиная с числа n, с шагом m, длина последовательности l.
 * */
    public static void getOdd (int n, int m, int l) {
        int i=n;
        int counter=0;
        while(counter<l){
            if (i%2 !=0) {
                System.out.println(i);
                counter++;
                if(counter>l){
                    break;
                }
            }
            i+=m;
        }
    }
}
