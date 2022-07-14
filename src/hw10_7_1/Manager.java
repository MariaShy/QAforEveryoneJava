package hw10_7_1;

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
public final class Manager extends BaseManager {

    private static final int MANAG_KOEF= 3;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return MANAG_KOEF;
    }
}
