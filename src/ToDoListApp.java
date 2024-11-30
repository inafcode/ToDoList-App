import java.util.Scanner;

public class ToDoListApp {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
//        testAddToDoList();
//        testShowToDoList();
//        testRemoveToDoList();
//        testInput();
//        testViewShowToDoList();
//        testViewAddToDoList();
//        testViewRemoveToDoList();
        viewShowToDoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showToDoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowToDoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Study Case : Todo-List App";
        showToDoList();
    }

    /**
     * Menambah todo ke List
     */
    public static void addToDoList(String todo){
        var isFull = true;
//        Apakah data sudah penuh? lakukan pengecekkan
        for (int i = 0; i < model.length; i++){
            if (model[i] == null){
//                model masih ada yang kosong
                isFull = false;
                break;
            }
        }

//        Jika penuh, kita resize ukuran array 2x lipat.
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];
        for (int i = 0; i < temp.length; i++) {
            model[i] = temp[i];
            }
        }

//        tambahkan ke posisi yang data arraynya null
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddToDoList(){
        for (int i = 0; i < 25; i++) {
            addToDoList("Contoh Todo ke. " + i);
        }

        showToDoList();
    }

    /**
     * Menghapus todo dari List
     */
    public static boolean removeToDoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        } else if (model[number -1 ] == null){
            return false;
        } else {
            for (int i = (number -1 ); i < model.length ; i++) {
                if (i == (model.length) - 1) {
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveToDoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        addToDoList("Empat");
        addToDoList("Lima");

        var result = removeToDoList(20);
        System.out.println(result);

        result = removeToDoList(7);
        System.out.println(result);

        result = removeToDoList(2);
        System.out.println(result);

        showToDoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data =  scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var address = input("Address");
        System.out.println("Your Address " + address);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowToDoList(){
        while (true){
            showToDoList();

            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");


            if (input.equals("1")){
                viewAddToDoList();
            }else if (input.equals("2")){
                viewRemoveToDoList();
            }else if (input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowToDoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        addToDoList("Empat");
        addToDoList("Lima");
        viewShowToDoList();
    }

    /**
     * Menampilkan view add todo list
     */
    public static void viewAddToDoList(){
        System.out.println("MENAMBAH TODOLIST");

        var todo = input("Todo (x Jika Batal)");
        if (todo.equals("x")){
//            batal
        }else {
            addToDoList(todo);
        }
    }

    public static void testViewAddToDoList(){
        addToDoList("Satu");
        addToDoList("Dua");
//        addToDoList("Tiga");
//        addToDoList("Empat");
//        addToDoList("Lima");

        viewAddToDoList();
        showToDoList();
    }

    /**
     * Menghapus view remove todo list
     */
    public static void viewRemoveToDoList(){
        System.out.println("MENGHAPUS TODOLIST");

        var number = input("Nomor yang dihapus (x Jika Batal)");
        if (number.equals("x")){
//            Batal
        }else {
            boolean success = removeToDoList(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal Menghapus ToDoList : " + number);
            }
        }
    }

    public static void testViewRemoveToDoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");

        showToDoList();

        viewRemoveToDoList();

        showToDoList();
    }
}