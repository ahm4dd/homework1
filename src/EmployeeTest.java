public class EmployeeTest {

    EmployeeTest(){
        Employee employee1 = new Employee("Ahmad", "Mohammed", 20000);
        Employee employee2 = new Employee("Yousuf", "Ahmad", 50000);

        System.out.println("NAME\t\t\t\tYEARLY SALARY\n----\t\t\t\t-------------");
        System.out.println(employee1.getFirstName()+ " " + employee1.getLastName() + "\t\t$"+ employee1.getSalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t$" + employee2.getSalary()+'\n');

        employee1.raiseSalary(10);
        employee2.raiseSalary(10);
        System.out.println("10 Percent Salary Raise!! Yoohooooo!");
        System.out.println("NAME\t\t\t\tYEARLY SALARY\n----\t\t\t\t-------------");
        System.out.println(employee1.getFirstName()+ " " + employee1.getLastName() + "\t\t$"+ employee1.getSalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "\t\t$" + employee2.getSalary());



    }
}
