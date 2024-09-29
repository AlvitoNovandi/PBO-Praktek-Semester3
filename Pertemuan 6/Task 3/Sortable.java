abstract class Sortable {
    public abstract int compare(Sortable b); // Metode abstrak untuk perbandingan

    public static void shell_sort(Sortable[] a) {
        // Implementasi algoritma Shell sort
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i]; // Simpan elemen saat ini
                int j;
                for (j = i; j >= gap && temp.compare(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap]; // Geser elemen
                }
                a[j] = temp; // Tempatkan elemen saat ini di posisi yang benar
            }
        }
    }
}
