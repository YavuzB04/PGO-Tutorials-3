import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        return baseSalary + (testTypes.size() * 300);
    }
}
