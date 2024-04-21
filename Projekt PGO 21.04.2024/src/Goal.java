public class Goal {
    private String name;
    private int bonus;
    private int year;
    private int month;

    public Goal(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public Goal(int year, int month, String name, int bonus) {
        this.year = year;
        this.month = month;
        this.name = name;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
}
