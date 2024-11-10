public class GenericsType<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // Menggunakan parameter tipe yang spesifik
        GenericsType<String> type = new GenericsType<>();
        type.set("Java");

        // Menentukan parameter tipe yang berbeda, misalnya Integer, untuk menghindari raw type
        GenericsType<Integer> type1 = new GenericsType<>();
        type1.set(10);

        // Mencetak nilai dari objek
        System.out.println("Type: " + type.get());
        System.out.println("Type1: " + type1.get());
    }
}
