package hw71;

public class Manager extends Employee{
    /* Необходимо создать класс hw71.Manager в который нужно
    * добавить следующие методы:
    * getNumberOfSubordinates - получить количество
    * подчиненных
    * setNumberOfSubordinates
    * в классе,
    * метод getSalary будет возвращать значение по
    * формуле - <базовая ставка> *
    * (<количество подчиненных> / 100 * 3).
    * Если количество подчиненных 0, то результат как
    * у обычного рабочего.
    * */

    private int numberOfSubordinates;

    public Manager(String name, double salary, double baseSalary, int numberOfSubordinates) {
        super(name, salary, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(){
        if (getNumberOfSubordinates() == 0){
            return super.getSalary();
        } else {
            return super.getSalary() * (getNumberOfSubordinates()/100.0 * 3);
        }
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates=numberOfSubordinates;
    }
}
