abstract class Employee{
    private String name;

    public Employee(String name)
    {
        this.name = name;
    }

    

    public abstract void work();


    public String getName() {
        return name;
    }
}