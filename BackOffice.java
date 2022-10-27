abstract public class BackOffice {
    int SalaryIn$;
    int HoursInDay;

    public BackOffice(int salaryIn$, int hoursInDay) {
        SalaryIn$ = salaryIn$;
        HoursInDay = hoursInDay;
    }

    public int getSalaryIn$() {
        return SalaryIn$;
    }

    public void setSalaryIn$(int salaryIn$) {
        SalaryIn$ = salaryIn$;
    }

    public int getHoursInDay() {
        return HoursInDay;
    }

    public void setHoursInDay(int hoursInDay) {
        HoursInDay = hoursInDay;
    }
    abstract public void Action();
}