public class HW_5_2_alt {
    public static void task1() {
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0
        String s = "0 1 2 3 4 5 6 7 8 9";
        for(int i = 0; i < s.length(); i=i+2) {
            System.out.println(s.substring(0, s.length()-i));
        }
    }

    public static void task2() {
//        0  1  2  3  4  5  6  7  8  9
//           0  1  2  3  4  5  6  7  8
//              0  1  2  3  4  5  6  7
//                 0  1  2  3  4  5  6
//                    0  1  2  3  4  5
//                       0  1  2  3  4
//                          0  1  2  3
//                             0  1  2
//                                0  1
//                                   0

        String s = "0 1 2 3 4 5 6 7 8 9";

        for(int i = 0; i < s.length(); i=i+2) {
            System.out.println(" ".repeat(i) + s.substring(0, s.length()-i));
        }
    }

    public static void task3() {
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//            7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//              6 5 4 3 2 1 0 1 2 3 4 5 6
//                5 4 3 2 1 0 1 2 3 4 5
//                  4 3 2 1 0 1 2 3 4
//                    3 2 1 0 1 2 3
//                      2 1 0 1 2
//                        1 0 1
//                          0

        String s = "9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9"; // total length = 37,
        for(int i = 0; i < s.length(); i=i+2) {
            if (i > s.length()-i ) {
                break;
            }
            System.out.println(" ".repeat(i) + s.substring(i, s.length()-i));
        }
    }
}
