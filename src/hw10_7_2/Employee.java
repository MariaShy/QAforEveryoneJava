package hw10_7_2;

/*
 * Задача №7.1  Необходимо создать класс hw71.Employee со следующими методами:
 * getBaseSalary - получить базовую ставку
 * setBaseSalary
 * getName - получить имя
 * setName
 * getSalary - получить зарплату
 */
public final class Employee extends BaseEmployee {

    public Employee(String name, int age, char gender, double salary) {
        super(name, age, gender, salary);
    }

}
