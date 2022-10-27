abstract public class FrontOffice {
    int Salaryin$;
    int HoursInDay;

    public FrontOffice(int salaryin$, int hoursInDay) {
        Salaryin$ = salaryin$;
        HoursInDay = hoursInDay;
    }

    public int getSalaryin$() {
        return Salaryin$;
    }

    public void setSalaryin$(int salaryin$) {
        Salaryin$ = salaryin$;
    }

    public int getHoursInDay() {
        return HoursInDay;
    }

    public void setHoursInDay(int hoursInDay) {
        HoursInDay = hoursInDay;
    }
    abstract public void Actions();
}