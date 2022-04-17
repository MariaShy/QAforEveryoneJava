package hw71;

public class Employee {
    /*Задача №1
Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
set BaseSalary
getName - получить имя
setName
getSalary - получить зарплату
*/

    private String name;
    private double salary;
    private double baseSalary;

    public Employee(String name, double salary, double baseSalary) {
        this.name = name;
        this.salary = salary;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
