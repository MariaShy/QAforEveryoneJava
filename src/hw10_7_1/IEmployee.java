package hw10_7_1;
/*Задача №1
Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
set BaseSalary
getName - получить имя
setName
getSalary - получить зарплату
*/
public interface IEmployee {

    String getName() ;
    double getBaseSalary() ;
    double getSalary();
}
