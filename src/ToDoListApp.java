public class ToDoListApp {
    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    /**
     * Menampilkan todo list
     */
    public static void showToDoList(){
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + "." + todo);
            }
        }
    }

    /**
     * Menambah todo ke List
     */
    public static void addToDoList(){

    }

    /**
     * Menghapus todo dari List
     */
    public static void removeToDoList(){

    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowToDoList(){

    }

    /**
     * Menampilkan view add todo list
     */
    public static void viewAddToDoList(){

    }

    /**
     * Menghapus view remove todo list
     */
    public static void viewRemoveToDoList(){

    }
}
