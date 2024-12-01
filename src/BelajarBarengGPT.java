public class BelajarBarengGPT {

    public static void main(String[] args) {
//        soal pertama
//        String[] model = new String[5];
//        model[0] = "Tugas 1";
//        model[1] = "Tugas 2";
//        model[2] = null; // Kosong
//        model[3] = "Tugas 4";
//        model[4] = "Tugas 5";

        String[] model = new String[5];
        model[0] = "Tugas 1";
        model[1] = null;  // Kosong
        model[2] = "Tugas 3";
        model[3] = null;  // Kosong
        model[4] = "Tugas 5";

        // Cek apakah ada tempat kosong (null)
        var isFull = true; // Anggap array penuh
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false; // Jika ada null, berarti ada tempat kosong
                break; // Langsung keluar dari loop setelah ke-temu tempat kosong
            }
        }

        if (isFull) {
            System.out.println("Array penuh.");
        } else {
            System.out.println("Array tidak penuh, ada tempat kosong.");
        }
    }
}
