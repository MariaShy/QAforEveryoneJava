package hw10_7_2;

//Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
public class MonthUtils {


    private final static MonthImpl[] MONTH_ARRAY= {
            new MonthImpl("january",31,20),
            new MonthImpl("february",28,20),
            new MonthImpl("march",31,22),
            new MonthImpl("april",30,21),
            new MonthImpl("may",31,20),
            new MonthImpl("june",30,22),
            new MonthImpl("july",31,21),
            new MonthImpl("august",31,23),
            new MonthImpl("september",30,22),
            new MonthImpl("october",31,21),
            new MonthImpl("november",30,21),
            new MonthImpl("december",31,22)
    };

    public static MonthImpl[] getYear() {
        return MONTH_ARRAY;
    }

    public static MonthImpl[] getQ1() {
        MonthImpl[] Q1 = {MONTH_ARRAY[0],
                MONTH_ARRAY[1],
                MONTH_ARRAY[2]};
        return Q1;
    }

    public static MonthImpl[] getQ2() {
        MonthImpl[] Q2 = {MONTH_ARRAY[3],
                MONTH_ARRAY[4],
                MONTH_ARRAY[5]};
        return Q2;
    }

    public static MonthImpl[] getQ3() {
        MonthImpl[] Q3 = {MONTH_ARRAY[6],
                MONTH_ARRAY[7],
                MONTH_ARRAY[8]};
        return Q3;
    }

    public static MonthImpl[] getQ4() {
        MonthImpl[] Q4 = {MONTH_ARRAY[9],
                MONTH_ARRAY[10],
                MONTH_ARRAY[11]};
        return Q4;
    }

    public static MonthImpl[] getHalf1() {
        MonthImpl[] Half1 = {MONTH_ARRAY[0],
                MONTH_ARRAY[1],
                MONTH_ARRAY[2],
                MONTH_ARRAY[3],
                MONTH_ARRAY[4],
                MONTH_ARRAY[5]};
        return Half1;
    }

    public static MonthImpl[] getHalf2() {
        MonthImpl[] Half2 = {MONTH_ARRAY[6],
                MONTH_ARRAY[7],
                MONTH_ARRAY[8],
                MONTH_ARRAY[9],
                MONTH_ARRAY[10],
                MONTH_ARRAY[11]};
        return Half2;
    }

}
