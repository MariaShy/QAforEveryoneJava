package hw71;

public class EmployeeHelper {
    /*
     * Задача №7.3
     * Необходимо создать утилитарный класс со следующими методами:
     * поиск сотрудника в массиве по его имени
     * поиск сотрудника в массиве по вхождению указанной строки в его имени
     * подсчет зарплатного бюджета для всех сотрудников в массиве
     * поиск наименьшей зарплаты в массиве
     * поиск наибольшей зарплаты в массиве
     * поиск наименьшего количества подчиненных в массиве менеджеров
     * поиск наибольшего количества подчиненных в массиве менеджеров
     * поиск наибольшей надбавки (разнице между базовой зарплатой
     * и выплатой) в массиве менеджеров
     * поиск наименьшей надбавки (разнице между базовой ставки
     * и зарплатой) в массиве менеджеров
     * */

    //поиск сотрудника в массиве по его имени
    static Employee searchByName(Employee[] emp, String name){
        for (int i=0; i<emp.length; i++){
            if(emp[i].getName().equals(name)){
                System.out.println(emp[i].getName());
                return emp[i];
            }
        }
        return null;
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    static Employee searchBySubName(Employee[] emp, String subName){
        for (int i=0; i<emp.length; i++){
            if(emp[i].getName().contains(subName)){
                System.out.println(emp[i].getName());
                return emp[i];
            }
        }
        return null;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    static double getSalaryBudget(hw71.Employee[] emp){
        double budget=0;
        for (int i=0; i<emp.length; i++){
            budget+= emp[i].getSalary();
        }
        return budget;
    }

    //поиск наименьшей зарплаты в массиве
    static double getMinSalary(hw71.Employee[] emp){
        double minSalary=Integer.MAX_VALUE;
        for (int i=0; i<emp.length; i++){
            if(minSalary> emp[i].getSalary()){
                minSalary=emp[i].getSalary();
            }
        }
        return minSalary;
    }

    //поиск наибольшей зарплаты в массиве
    static double getMaxSalary(hw71.Employee[] emp){
        double maxSalary=0;
        for (int i=0; i<emp.length; i++){
            if(maxSalary< emp[i].getSalary()){
                maxSalary=emp[i].getSalary();
            }
        }
        return maxSalary;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    static int getMinNumOfSubordinates(Manager[] manag){
        int minNumOfSubordinates=Integer.MAX_VALUE;
        for (int i=0; i<manag.length; i++){
            if(minNumOfSubordinates>manag[i].getNumberOfSubordinates()){
                minNumOfSubordinates=manag[i].getNumberOfSubordinates();
            }
        }
        return minNumOfSubordinates;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    static int getMaxNumOfSubordinates(Manager[] manag){
        int maxNumOfSubordinates=Integer.MIN_VALUE;
        for (int i=0; i<manag.length; i++){
            if(maxNumOfSubordinates<manag[i].getNumberOfSubordinates()){
                maxNumOfSubordinates=manag[i].getNumberOfSubordinates();
            }
        }
        return maxNumOfSubordinates;
    }

    //поиск наибольшей надбавки (разнице между базовой зарплатой
    //и выплатой) в массиве менеджеров
    static double getMaxSalaryDifference(Manager[] manag){
        double maxSalaryDifference=Integer.MIN_VALUE;
        double salaryDifference=0;

        for (int i=0; i<manag.length; i++){
            salaryDifference=manag[i].getSalary()-manag[i].getBaseSalary();
            if(maxSalaryDifference<salaryDifference){
                maxSalaryDifference=salaryDifference;
            }
        }
        return maxSalaryDifference;
    }

    //поиск наименьшей надбавки (разнице между базовой ставки
    //и зарплатой) в массиве менеджеров
    static double getMinSalaryDifference(Manager[] manag){
        double minSalaryDifference=Integer.MAX_VALUE;
        double salaryDifference=0;

        for (int i=0; i<manag.length; i++){
            salaryDifference=manag[i].getSalary()-manag[i].getBaseSalary();
            if(minSalaryDifference>salaryDifference){
                minSalaryDifference=salaryDifference;
            }
        }
        return minSalaryDifference;
    }
}
