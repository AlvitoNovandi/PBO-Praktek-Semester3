class Developer extends Employee implements Salary {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " sedang menulis dan menguji kode.");
    }

    @Override
    public void HitungGaji() {
        System.out.println(getName() + "' gaji dihitung berdasarkan jam kerja dan bonus proyek.");
    }
}