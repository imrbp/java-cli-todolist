package imrbp;

public class Main {
    public static String[] Data = new String[10];
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static void GetList() {
        for (int i = 0; i < Data.length; i++) {
            System.out.println(i + 1 + ". " +Data[i]);
        }
    }

    public static void Menu() {
       GetList();
       System.out.println("Welcome TodoList CLI");
    }



}