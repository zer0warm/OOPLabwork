package labwork4.employee;

import java.io.*;
import java.util.*;

public class IOTasks {
    public static List<Employee> readEmployeesFromStdin() {
        List<Employee> employeeList = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int n = readNumberOfEmployeesFromScanner(scanner);

            for (int i = 0; i < n; i++) {
                System.out.printf("Employee #%d:\n", i + 1);
                Employee employee = readEmployeeFromScanner(scanner);
                employeeList.add(employee);
            }
        }

        return employeeList;
    }

    public static List<Employee> readEmployeesFromFile(String path) {
        List<Employee> employeeList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String employeeData = scanner.nextLine();
                Employee employee = makeEmployeeFromData(employeeData);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist.");
        }

        return employeeList;
    }

    public static void writeEmployeesToFile(String path, List<Employee> employeeList) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Employee employee : employeeList) {
                writer.write(employee.getInfoWithSalaries());
                writer.append('\n');
            }
        } catch (IOException e) {
            System.err.println("File is not accessible.");
        }
    }

    private static int readNumberOfEmployeesFromScanner(Scanner scanner) {
        System.out.print("Enter the number of employees: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static Employee readEmployeeFromScanner(Scanner scanner) {
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Basic salary: ");
        double basicSalary = Double.parseDouble(scanner.nextLine());
        System.out.print("Extra salary: ");
        double extraSalary = Double.parseDouble(scanner.nextLine());

        return new Employee(id, name, department, basicSalary, extraSalary);
    }

    private static Employee makeEmployeeFromData(String dataLine) {
        String[] infoList = dataLine.split(Employee.infoDelimiter);

        int id = Integer.parseInt(infoList[0]);
        String name = infoList[1];
        String department = infoList[2];
        double basicSalary = Double.parseDouble(infoList[3]);
        double extraSalary = Double.parseDouble(infoList[4]);

        Employee employee = new Employee(id, name, department, basicSalary, extraSalary);
        employee.calculateIncome();

        return employee;
    }
}
