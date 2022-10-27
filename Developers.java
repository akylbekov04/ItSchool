public class Developers extends BackOffice implements Actions{
    String name;
    int age;
    char sex;

    public Developers(int salaryIn$, int hoursInDay, String name, int age, char sex) {
        super(salaryIn$, hoursInDay);
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public void Action() {
        System.out.println("Don't distract me, im writing code...");
    }
    public void DevInfo(){
        System.out.println("Name of Developer: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Working hours in a day: "+getHoursInDay());
        System.out.println("Salary in $: "+getSalaryIn$());
        System.out.println("Age: "+getSex());
    }

    @Override
    public void Action1() {
        System.out.println("Developer's responsibilities include writing codes, creating applications, and helping young developers");
        System.out.println("Salary of developer: "+getSalaryIn$());
        System.out.println("Working hours in a day: "+getHoursInDay());
    }
}