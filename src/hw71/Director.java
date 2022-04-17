package hw71;

public class Director extends Manager {
    public Director(String name, double salary, double baseSalary, int numberOfSubordinates) {
        super(name, salary, baseSalary, numberOfSubordinates);
    }
    /*
* Необходимо создать класс hw71.Director с теми же методами,
* что и hw71.Manager, но метод getSalary должен возвращать
* результат по формуле - <базовая ставка> *
* (<количество подчиненных> / 100 * 9).
*  Если количество подчиненных 0, то результат как у
* обычного рабочего.
 * */

    public double getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getSalary();
        } else {
            return getSalary() * (getNumberOfSubordinates()/100.0 * 9);
        }
    }


}
