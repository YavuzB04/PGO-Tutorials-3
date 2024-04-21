import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String PESEL, int employmentYear) {
        super(firstName, lastName, address, email, PESEL, employmentYear);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int baseSalary = super.calculateSalary();
        int bonus = 0;
        for (Goal goal : goals) {
            if (goal.getYear() == 2024 && goal.getMonth() == 4) {
                bonus += goal.getBonus();
            }
        }
        return baseSalary + bonus;
    }
}
