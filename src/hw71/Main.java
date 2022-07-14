package hw71;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Worker("Alexandra", 10);
        Employee e2=new Worker("Alex", 20);
        Employee[] empArray={e1,e2};
        Manager[] manArray={new Manager("Todda", 12,10),
                            new Manager("Todd", 12,10)};

        System.out.println("searchByName: " +EmployeeHelper.searchByName(empArray, "Alex"));
        System.out.println("searchBySubName: "+EmployeeHelper.searchBySubName(empArray, "Alex"));
        System.out.println("getSalaryBudget: "+EmployeeHelper.getSalaryBudget(empArray));
        System.out.println("getMaxSalary: "+EmployeeHelper.getMaxSalary(empArray));
        System.out.println("getMinSalary: "+EmployeeHelper.getMinSalary(empArray));
        System.out.println("getMaxNumOfSubordinates: "+EmployeeHelper.getMaxNumOfSubordinates(manArray));
        System.out.println("getMinNumOfSubordinates: "+EmployeeHelper.getMinNumOfSubordinates(manArray));
        System.out.println("getMaxSalaryDifference: "+EmployeeHelper.getMaxSalaryDifference(manArray));
        System.out.println("getMinSalaryDifference: "+EmployeeHelper.getMinSalaryDifference(manArray));
    }
}
