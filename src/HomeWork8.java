public class HomeWork8 {
    public static void main(String[] args) {
        //System.out.println(feast("string gh df", "string disf"));
        //System.out.println(tripleTrouble("aa", "bb","cc"));
        System.out.println(correct("1F-5UDYAR0 K1PL1]NG"));
    }

    public static String abbrevName(String name) {
        String[] temp = name.toUpperCase().split(" ");
        return Character.toString(temp[0].charAt(0))+"."+Character.toString(temp[1].charAt(0));
    }

    public static boolean feast(String beast, String dish) {
        boolean result =false;
        String[] tempBeast = beast.split(" ");
        String[] tempDish = dish.split(" ");
        String lastBeast = tempBeast[tempBeast.length-1].substring(tempBeast[tempBeast.length-1].length() - 1);
        String lastDish = tempDish[tempDish.length-1].substring(tempDish[tempDish.length-1].length() - 1);
        if ((tempBeast[0].charAt(0)+lastBeast).equals((tempDish[0].charAt(0)+lastDish))){
            result = true;
        } else        {
            result = false;
        }
        return result;
    }

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i=0; i<one.length();i++){
            result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }

    public static String position(char alphabet)
    {
        //chr a= 97
        int position = (int)alphabet - 96;
        return  "Position of alphabet: " + position;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i=0;i< arr1.length;i++){
            sum+=arr1[i];
        }
        for (int i=0;i< arr2.length;i++){
            sum+=arr2[i];
        }
        return sum;
    }

    public static String boolToWord(boolean b)
    {
        if (b) {
            return "Yes";
        }
        return "No";
    }

    /* Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.*/
    public static Integer basicMath(String op, int v1, int v2)
    {
        int result=0;
        switch(op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
            default:
                break;
        }
        return result;
    }
    /*Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.

When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.

Your task is correct the errors in the digitised text. You only have to handle the following mistakes:

S is misinterpreted as 5
O is misinterpreted as 0
I is misinterpreted as 1
The test cases contain numbers only by mistake.*/
    public static String correct(String string) {
        //string.replace('5','S').replace('0','O').replace('1','I');
        String str1 = string.replace("5","S");
        String str2 = str1.replace("0","O");
        String str3 = str2.replace("1","I");
        return str3;
    }

}