public class PythonFrontEnd extends Courses {
    public PythonFrontEnd(String cost, int howLongInMonth) {
        super(cost, howLongInMonth);
    }

    @Override
    public void SomeInfo() {
        System.out.println("Nowadays, Python is very popular language cause he's such a flexible language");
    }
    public void PythonInfo(){
        System.out.println("The cost of this Courses for 1 month is: "+getCost());
        System.out.println("The long of the Python Front-End courses in months is: "+getHowLongInMonth());
    }
}