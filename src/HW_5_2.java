public class HW_5_2 {

    public void getFigure1(){
        int count = 9;
        for (int i= 0; i< 10; i++){
            for (int j=0; j<=count; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            count--;
        }
    }

    public void getFigure2(){
        int count = 9;
        for (int i= 0; i< 10; i++){
            System.out.print(" ".repeat(i*2));
            for (int j=0; j<=count; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            count--;
        }
    }

    public void getFigure3() {
        int count = 9;
        for (int i = 0; i < 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = count; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int n = 0; n <= count; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
            count--;
        }
    }
}
