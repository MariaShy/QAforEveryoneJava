package hw_7_2;
//Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
public class MonthUtils {

    public static Month[] getMonthArray() {
        return MONTH_ARRAY;
    }

    private static Month[] MONTH_ARRAY= {
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

}
