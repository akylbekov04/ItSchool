public abstract class Courses {
    String cost;
    int HowLongInMonth;

    public Courses(String cost, int howLongInMonth) {
        this.cost = cost;
        HowLongInMonth = howLongInMonth;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getHowLongInMonth() {
        return HowLongInMonth;
    }

    public void setHowLongInMonth(int howLongInMonth) {
        HowLongInMonth = howLongInMonth;
    }

    abstract public void SomeInfo();
}