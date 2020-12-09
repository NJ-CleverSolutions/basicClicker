
public class Game {

    public double netWorth = 0;
    public double incrementClick = .25;

    public Game() {

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

    public void setIncrement(double percent) {
        double increase = incrementClick * percent;
        this.incrementClick = this.incrementClick + increase;
    }

}
