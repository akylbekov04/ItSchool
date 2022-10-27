public class JavaBackend extends Courses{
    public JavaBackend(String cost, int howLongInMonth) {
        super(cost, howLongInMonth);
    }

    @Override
    public void SomeInfo() {
        System.out.println("Now, Java Backend is very important language in IT World.");
    }
    public void JavaInfo(){
        System.out.println("The cost of this Courses for 1 month is: "+getCost());
        System.out.println("The long of the Java Back-end courses in months is: "+getHowLongInMonth());
    }
}