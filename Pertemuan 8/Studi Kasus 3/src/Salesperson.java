public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // toString method
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }


    @Override
    public int compareTo(Salesperson other) {
        // Bandingkan totalSales untuk urutan descending
        if (this.totalSales > other.totalSales) {
            return -1;  // Jika objek ini memiliki penjualan lebih banyak
        } else if (this.totalSales < other.totalSales) {
            return 1;   // Jika objek ini memiliki penjualan lebih sedikit
        } else {
            // Jika totalSales sama, bandingkan lastName
            int lastNameComparison = this.lastName.compareTo(other.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;  // Mengembalikan hasil perbandingan lastName
            } else {
                // Jika lastName sama, bandingkan firstName
                return this.firstName.compareTo(other.firstName);
            }
        }
    }
    
    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}
