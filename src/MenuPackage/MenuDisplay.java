package MenuPackage;

import java.util.Scanner;

public class MenuDisplay {
    public static Menu showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- MENU --------------");
        System.out.println("Our menu types: \n 1) Non-Vegetarian \n 2) Vegetarian \n 3) Kids section");
        System.out.println("----------------------------------");

        System.out.println("Choose your menu option: ");
        int option = sc.nextInt();

        MenuFactory menuType;
        switch (option) {
            case 1:
                menuType = new NonVegetarianMenu();
                System.out.println("\n * Non Vegetarian menu options *");
                break;
            case 2:
                menuType = new VegetarianMenu();
                System.out.println("\n * Vegetarian menu options *");
                break;
            case 3:
                menuType = new KidsMenu();
                System.out.println("\n * Kids section options *");
                break;
            default:
                System.out.println("Invalid option");
                return showMenu();
        }

        Menu menu = menuType.createMenu();
        menu.display();
        return menu;
    }
}
