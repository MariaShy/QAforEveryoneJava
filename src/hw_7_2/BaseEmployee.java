package hw_7_2;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char gender;
    private double salary;

    public BaseEmployee(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary(Month[] monthArr) {
        double grossSalary=0;
        for (int i=0;i<monthArr.length;i++) {
            grossSalary+= getSalary() * monthArr[i].getNumberOfWorkDays();
        }
        return grossSalary;
    }

}
