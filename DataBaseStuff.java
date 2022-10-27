public class DataBaseStuff extends BackOffice implements Actions{
    String name;
    int age;
    char sex;

    public DataBaseStuff(int salaryIn$, int hoursInDay, String name, int age, char sex) {
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
        System.out.println("okey");
    }
    public void DBInfo(){
        System.out.println("Name of DataBase Developer: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Working hours in a day: "+getHoursInDay());
        System.out.println("Salaty in $: "+getSalaryIn$());
        System.out.println("Sex: "+getSex());
    }

    @Override
    public void Action1() {
        System.out.println("The DataBase Developer's duties are checking the status of the company's Database, as well as It's control");
        System.out.println("Salary of Database Developer: "+getSalaryIn$());
        System.out.println("Working hours in a day: "+getHoursInDay());
    }
}