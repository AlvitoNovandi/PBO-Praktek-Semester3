public class Commission extends Hourly{
    protected  double CommissionRate;
    protected  double TotalSales;
    
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,
            double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        CommissionRate = commissionRate;
    }

    public void addSales(double totalSales){
        TotalSales = totalSales;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales = " + TotalSales;
    }

    @Override
    public double pay() {
        return super.pay() +  (CommissionRate * TotalSales);
    }


}
