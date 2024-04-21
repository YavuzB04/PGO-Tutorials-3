public class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String PESEL;
    protected int employmentYear;

    public Employee(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.employmentYear = employmentYear;
    }

    public int calculateSalary() {
        int baseSalary = 3000;
        int yearsWorkedBonus = (2024 - employmentYear) * 1000;
        return baseSalary + yearsWorkedBonus;
    }
}
