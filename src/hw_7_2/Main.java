package hw_7_2;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Sergey", 30,'M',1000);
        Manager m1=new Manager("Anton", 30,'M',1000, 5);

        System.out.println( e1.getName() + "'s salary for Q1 is " + e1.getSalary(MonthUtils.getQ1()));
        System.out.println( m1.getName() + "'s salary for Q1 is " + m1.getSalary(MonthUtils.getQ1()));
    }
}
