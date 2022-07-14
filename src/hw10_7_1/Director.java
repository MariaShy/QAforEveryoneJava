package hw10_7_1;

/*
 * Необходимо создать класс hw71.Director с теми же методами,
 * что и hw71.Manager, но метод getSalary должен возвращать
 * результат по формуле - <базовая ставка> *
 * (<количество подчиненных> / 100 * 9).
 *  Если количество подчиненных 0, то результат как у
 * обычного рабочего.
 * */
public final class Director extends BaseManager {

    private static final int DIR_KOEF= 9;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return DIR_KOEF;
    }
}
