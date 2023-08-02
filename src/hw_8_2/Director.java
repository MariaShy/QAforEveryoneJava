package hw_8_2;

public class Director extends Manager{

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public double getSalaryDirector(){
        if (this.numberOfSubordinates==0){
            return getBaseSalary();
        }
        else {
            return getBaseSalary() * (1.0 * this.numberOfSubordinates / 100 * 9);
        }
    }
}
