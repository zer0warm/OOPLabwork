package labwork4.employee;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double basicSalary;
    private final double extraSalary;
    private double income;

    public Employee(int id,
                    String name,
                    String department,
                    double basicSalary,
                    double extraSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
    }

    public static String getIncomeTitle() {
        return String.format("%s\t%-30s%s\t%s", "ID", "Name", "Dept", "Income");
    }

    public void calculateIncome() {
        this.income = this.basicSalary + this.extraSalary * 2.5;
    }

    public String getInfoWithIncome() {
        return String.format("%d\t", this.id)
               + String.format("%-30s", this.name)
               + String.format("%s\t", this.department)
               + String.format("%.2f", this.income);
    }

    public String getInfoWithSalaries() {
        return String.format("%d\t", this.id)
               + String.format("%-30s", this.name)
               + String.format("%s\t", this.department)
               + String.format("%.2f\t", this.basicSalary)
               + String.format("%.2f", this.extraSalary);
    }
}
