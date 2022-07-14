package hw_7_2;
//Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
public class MonthUtils {


    private final static Month[] MONTH_ARRAY= {
            new Month("january",31,20),
            new Month("february",28,20),
            new Month("march",31,22),
            new Month("april",30,21),
            new Month("may",31,20),
            new Month("june",30,22),
            new Month("july",31,21),
            new Month("august",31,23),
            new Month("september",30,22),
            new Month("october",31,21),
            new Month("november",30,21),
            new Month("december",31,22)
    };

    public static Month[] getYear() {
        return MONTH_ARRAY;
    }

    public static Month[] getQ1() {
        Month[] Q1 = {MONTH_ARRAY[0],
                MONTH_ARRAY[1],
                MONTH_ARRAY[2]};
        return Q1;
    }

    public static Month[] getQ2() {
        Month[] Q2 = {MONTH_ARRAY[3],
                MONTH_ARRAY[4],
                MONTH_ARRAY[5]};
        return Q2;
    }

    public static Month[] getQ3() {
        Month[] Q3 = {MONTH_ARRAY[6],
                MONTH_ARRAY[7],
                MONTH_ARRAY[8]};
        return Q3;
    }

    public static Month[] getQ4() {
        Month[] Q4 = {MONTH_ARRAY[9],
                MONTH_ARRAY[10],
                MONTH_ARRAY[11]};
        return Q4;
    }

    public static Month[] getHalf1() {
        Month[] Half1 = {MONTH_ARRAY[0],
                MONTH_ARRAY[1],
                MONTH_ARRAY[2],
                MONTH_ARRAY[3],
                MONTH_ARRAY[4],
                MONTH_ARRAY[5]};
        return Half1;
    }

    public static Month[] getHalf2() {
        Month[] Half2 = {MONTH_ARRAY[6],
                MONTH_ARRAY[7],
                MONTH_ARRAY[8],
                MONTH_ARRAY[9],
                MONTH_ARRAY[10],
                MONTH_ARRAY[11]};
        return Half2;
    }

}
