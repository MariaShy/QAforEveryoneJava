package hw71;
/*
 * Задача №2
 * Необходимо создать класс hw71.Worker где метод
 * getSalary будет возвращать
 * базовую ставку.
 * */
public class Worker extends Employee{

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return getBaseSalary();
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }
}
