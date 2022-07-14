package hw10_7_1;

/*
 * Задача №2
 * Необходимо создать класс hw71.Worker где метод
 * getSalary будет возвращать
 * базовую ставку.
 * */
public class Worker implements IEmployee {


    private String name;
    private double baseSalary;

    public Worker(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getSalary() {
        return getBaseSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


}
