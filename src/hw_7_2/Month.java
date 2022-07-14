package hw_7_2;
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
public class Month { //immutable(неизменяемый) =  without setters, only constructor

    private final String monthName;
    private final int numberOfDays;
    private final int numberOfWorkDays;

    public String getMonthName() {
        return monthName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getNumberOfWorkDays() {
        return numberOfWorkDays;
    }

    Month(String monthName, int numberOfDays, int numberOfWorkDays ){
        this.monthName=monthName;
        this.numberOfDays=numberOfDays;
        this.numberOfWorkDays=numberOfWorkDays;
    }

}
