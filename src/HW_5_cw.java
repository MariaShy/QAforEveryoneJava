public class HW_5_cw {

    public void getHW_5_cw() {
        System.out.println("1 task");
        System.out.println(doubleInteger(5));

        System.out.println("2 task");
        System.out.println(isLove(5, 4));

        System.out.println("3 task");
        System.out.println(numberToString(444));

        System.out.println("4 task");
        int[] arr={444, 4};
        System.out.println(findSmallestInt(arr));

        System.out.println("5 task");
        System.out.println(countingSheep(6));
    }

    public int doubleInteger(int i) {
        return i*2;
    }

    public boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }

    public String numberToString(int num){
            return String.valueOf(num);
            //return Integer.toString(num);
            //return "" + num;
    }

    public int findSmallestInt(int[] args) {
            int min = Integer.MAX_VALUE;
            for (int i=0; i< args.length; i++){
                if (args[i]<min){
                    min=args[i];
                }
            }
            return min;
    }

    public String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;

        /*
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
         */
    }
}
