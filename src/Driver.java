import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.print(menu.showOptions());
            choice = input.nextInt();
            menu.setOption(choice);
        } while (choice != 5);
        
        input.close();
    }
}
