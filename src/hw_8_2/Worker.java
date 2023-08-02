package hw_8_2;

public class Worker extends Employee{
    public Worker(String name, int baseSalary) {
        super(name, baseSalary);
    }

    public double getSalaryWorker(){
        return getBaseSalary();
    }
}
