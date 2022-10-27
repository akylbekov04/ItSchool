public class Reception extends FrontOffice implements Actions {
    String name;
    int age;
    char sex;

    public Reception(int salaryin$, int hoursInDay, String name, int age, char sex) {
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

    public void RecInfo() {
        System.out.println("Name of Receptionist: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Working hours in a day: " + getHoursInDay());
        System.out.println("Salary in $: " + getSalaryin$());
        System.out.println("Sex: " + getSex());
    }

    @Override
    public void Actions() {
    }

    @Override
    public void Action1() {
        System.out.println("The duties of Receptionist include registering students, accepting payment and " + "providing any assistance.");
        System.out.println("Salary of Receptionist: "+getSalaryin$());
        System.out.println("Working hours in a day: "+getHoursInDay());
    }
}