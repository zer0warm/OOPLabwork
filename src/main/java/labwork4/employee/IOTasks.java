package labwork4.employee;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOTasks {
    public static List<Employee> readInfoFromStdin() {
        List<Employee> employeeList = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of employees: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.printf("Employee #%d:\n", i + 1);
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

                employeeList.add(new Employee(id, name, department, basicSalary, extraSalary));
            }
        }

        return employeeList;
    }

    public static List<Employee> readInfoFromFile(String path) {
        List<Employee> employeeList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            // Fine cheating for next data line
            while (scanner.hasNextInt()) {
                int id = scanner.nextInt();
                String name = scanner.next();
                String department = scanner.next();
                double basicSalary = scanner.nextDouble();
                double extraSalary = scanner.nextDouble();

                Employee employee = new Employee(id, name, department, basicSalary, extraSalary);
                employee.calculateIncome();
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File does not exist.");
        }

        return employeeList;
    }

    public static void writeInfoToFile(String path, List<Employee> employeeList) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Employee employee : employeeList) {
                writer.write(employee.getInfoWithSalaries());
                writer.append('\n');
            }
        } catch (IOException e) {
            System.err.println("File is not accessible.");
        }
    }
}
