package hw71;
/*Задача №1
Необходимо создать класс Employee со следующими методами:
getBaseSalary - получить базовую ставку
set BaseSalary
getName - получить имя
setName
getSalary - получить зарплату
*/
public abstract class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
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

    public abstract double getSalary();
}
