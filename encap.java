class main
{
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class encap
{
    public static void main(String[] args) {
        main e = new main();
        e.setAge(22);
        e.setName("keerthana");
        System.out.println("Age is "+e.getAge()+" : "+e.getName()+" is the name");
    }
}
