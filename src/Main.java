//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double salary = 55000.75;
        int bonus = 5000;
        double totalSalary = salary + bonus;

        System.out.println("(1) My Salary: " + totalSalary);

        int totalSalary2 = (int) (salary + bonus);

        System.out.println("(2) My Salary: " + totalSalary2);
    }
}