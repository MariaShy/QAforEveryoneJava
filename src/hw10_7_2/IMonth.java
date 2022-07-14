package hw10_7_2;
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
public interface IMonth { //immutable(неизменяемый) =  without setters, only constructor

String getMonthName() ;
int getNumberOfDays() ;
int getNumberOfWorkDays() ;

}
