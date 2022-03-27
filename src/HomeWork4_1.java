public class HomeWork4_1 {
    public void mainHW4_1(String[] args) {
/*Задача №1
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива. */
        int[] arr1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int arraySum = 0;
        for (int i = 0; i< arr1.length; i++){
            arraySum = arraySum + arr1[i];
        }
        System.out.println("Задача №1: sum="+arraySum);

/*Задача №2
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.*/
        int[] arr2 = arr1;
        //int arrayMax = arr2[0]; //для инициализированных массивов
        int arrayMax = Integer.MIN_VALUE; //классический случай чтобы не словить ошибку выхода за границы массива если он не инициализирован
        for (int i = 0; i< arr2.length; i++){
            if (arr2[i]>arrayMax){
                arrayMax=arr2[i];
            }
        }
        System.out.println("Задача №2: max="+arrayMax);

/*Задача №3
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.*/
        int[] arr3 = arr1;
        //int arrayMin = arr3[0];
        int arrayMin = Integer.MAX_VALUE; //классический случай чтобы не словить ошибку выхода за границы массива если он не инициализирован
        for (int i = 0; i< arr3.length; i++){
            if (arr3[i]<arrayMin){
                arrayMin=arr3[i];
            }
        }
        System.out.println("Задача №3: min="+arrayMin);

/*Задача №4
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.*/
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double tempSum = 0;
        for (int i = 0; i< arr4.length; i++){
            tempSum = tempSum + arr4[i];
        }
        System.out.println("Задача №4: avg="+(tempSum / arr4.length));

/*Задача №5
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.*/
        int[][] arr5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int deepArraySum = 0;
        for (int i = 0; i< arr5.length; i++){
            for (int j=0; j<arr5[i].length;j++){
                deepArraySum = deepArraySum + arr5[i][j];
            }
        }
        System.out.println("Задача №5: deepSum="+deepArraySum);

/*Задача №6
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.*/
        int[][] arr6 = arr5;
        //int deepArrayMax = arr6[0][0];
        int deepArrayMax = Integer.MIN_VALUE;
        for (int i = 0; i< arr6.length; i++){
            for (int j=0; j<arr6[i].length; j++){
                if (arr6[i][j]>deepArrayMax){
                    deepArrayMax=arr6[i][j];
                }
            }
        }
        System.out.println("Задача №6: deepMax="+deepArrayMax);
/*Задача №7
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве. */
        int[][] arr7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int countArrayLength = 0;
        for (int i = 0; i< arr7.length; i++){
            countArrayLength = countArrayLength + arr7[i].length;
        }
        System.out.println("Задача №7: deepArrayCount="+countArrayLength);
    }
}
