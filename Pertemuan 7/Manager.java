class Manager extends Employee implements Salary {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang mengelola tim.");
    }

    @Override
    public void HitungGaji() {
        System.out.println(getName() + "'s gaji dihitung berdasarkan tarif tetap bulanan.");
    }
}



