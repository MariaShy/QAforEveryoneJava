package hw10_7_2;

/*Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
Все поля сделать приватными и для каждого поля добавить методы set и get. Класс должен иметь метод
 - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы
 в качестве аргумента. К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
*/
public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(IMonth[] mArr){
            return super.getSalary(mArr) * (1 + getNumberOfSubordinates()/100.0 * 1);
    }

    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates=numberOfSubordinates;
    }
}
