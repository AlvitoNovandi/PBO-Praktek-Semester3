class Magang extends Employee {
    public Magang(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang belajar dan membantu tim.");
    }
}
