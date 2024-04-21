import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Technology> technologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Technology tech : technologies) {
            bonus += tech.getBonus();
        }
        return baseSalary + bonus;
    }
}
