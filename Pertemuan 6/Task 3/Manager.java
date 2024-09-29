import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    @Override
    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 0.5% untuk setiap tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    @Override
    public int compare(Sortable b) {
        if (b instanceof Manager) {
            Manager mb = (Manager) b;
            if (getSalary() < mb.getSalary()) return -1;
            if (getSalary() > mb.getSalary()) return 1;
            return 0;
        }
        return 0; // atau throw new ClassCastException("Invalid comparison");
    }
}
