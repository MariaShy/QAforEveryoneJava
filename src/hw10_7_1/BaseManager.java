package hw10_7_1;

public abstract class BaseManager extends Worker implements IManager {

    private int numberOfSubordinates;

    public BaseManager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getIndex();

    public double getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates()/100.0 * getIndex());
        }
    }
}
