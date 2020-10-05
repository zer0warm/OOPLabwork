package labwork4.employee;

import java.util.List;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        String emFilePath = "src/main/java/labwork4/employee/employees.txt";
        List<Employee> employeeList;

        employeeList = IOTasks.readEmployeesFromStdin();
        IOTasks.writeEmployeesToFile(emFilePath, employeeList);

        employeeList = IOTasks.readEmployeesFromFile(emFilePath);
        System.out.println(Employee.getIncomeTitle());
        for (Employee employee : employeeList) {
            System.out.println(employee.getInfoWithIncome());
        }
    }
}
