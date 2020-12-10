
public class Game {

    public double netWorth = 0;
    public double incrementClick = .25;
    public String [] upgrades;
    public String [] temporaryBuffs;

    public Game() {

        upgrades = new String[]{"More shopping carts", "Buy a billboard", "Buy a TV ad", "Get a celebrity sponsor",
        "Latest and Greatest"};

        temporaryBuffs = new String []{"Black Friday", "Cyber Monday", "Holiday Rush", "Fourth of July Jamboree",
        "High School Dance", "Back to School Bash", "Halloween Horror Special", "Lover's Day Luxuries",
        "SuperBowl Sunday"};

    }

    public double getNetWorth() {
        return netWorth;
    }

    public double getIncrementClick() {
        return incrementClick;
    }

    public void setNetWorth(double increase) {
        this.netWorth = this.netWorth + increase;
    }

    public void setIncrementClick(double percent) {
        double increase = incrementClick * percent;
        this.incrementClick = this.incrementClick + increase;
    }

    public void setUpgrades(String[] upgrades) {

    }

}
