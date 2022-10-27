public class Security extends FrontOffice implements Actions{
    String name;
    int age;
    char sex;

    public Security(int salaryin$, int hoursInDay, String name, int age, char sex) {
        super(salaryin$, hoursInDay);
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
    public void SecInfo(){
        System.out.println("Name of Security: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Working hours in a day: "+getHoursInDay());
        System.out.println("Salary in $: "+getSalaryin$());
        System.out.println("Sex: "+getSex());
    }

    @Override
    public void Action1() {
        System.out.println("Security guard duties include checking visitors, controlling keys and checking video " +"cameras");
        System.out.println("Salary of Security: "+getSalaryin$());
        System.out.println("Working hours in a day: "+getHoursInDay());
    }

    @Override
    public void Actions() {

    }
}