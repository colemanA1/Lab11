import java.util.*;

public class Main {
    //Declaring variables
    static Scanner scan = new Scanner(System.in);
    public static ArrayList<Car> carList = new ArrayList<>();
    //Buying section
    static boolean buyOrNah = true;
    static String returnToMenu;
    static int menuChoice;
    //

    //Method for return to Menu choice
    public static int returnToMenu() {
        System.out.println("Press ENTER to return to the previous menu: ");
        returnToMenu = scan.nextLine();
        if (returnToMenu.equals("")) {

        }
        return menuChoice;
    }


    //Menu Method prints menu choices
    public static int getMenu() {
        System.out.println("1.View full car inventory\n2.Add a car\n" +
                "3.Remove a car\n4.Look up a car\n5.Replace a car\n6.Quit");
        System.out.println("Choose one of the options (1-6): ");
        int menuChoice = Validator.getInt(scan);
        return menuChoice;
    }

    //Method adds used cars to carList
    public static void addUsedCars() {
        String make = Validator.getString(scan, "Enter make: ");
        String model = Validator.getString(scan, "Enter model: ");
        int year = Validator.getInt(scan, "Enter year: ");
        double price = Validator.getInt(scan, "Enter price: ");
        int mileage = Validator.getInt(scan, "Enter mileage: ");

        UsedCar addCar = new UsedCar(make, model, year, price, "Used", mileage);
        CarLot.addCars(addCar);
    }

    //Method adds new cars to carList
    public static void addNewCars() {
        String make = Validator.getString(scan, "Enter make: ");
        String model = Validator.getString(scan, "Enter model: ");
        int year = Validator.getInt(scan, "Enter year: ");
        double price = Validator.getInt(scan, "Enter price: ");

        Car addCar = new Car(model, make, year, price);
        CarLot.addCars(addCar);
    }

    //Method for user adding another car
    public static String userAddMoreCars() {
        String input = Validator.getString(scan, "Would you like to add another car?: (y/n)");
        return input;
    }

    //Method for user removing another car
    public static String userRmMoreCars() {
        String input = Validator.getString(scan, "Remove another car?: (y/n)");
        return input;
    }

    //Method for user looking at another car
    public static String userLookMoreCars() {
        String input = Validator.getString(scan, "Look at another car?: (y/n)");
        return input;
    }


    //Method replaces a car in a certain position
    public static void replaceCar() {
        String make = Validator.getString(scan, "Enter make: ");
        String model = Validator.getString(scan, "Enter model: ");
        int year = Validator.getInt(scan, "Enter year: ");
        double price = Validator.getInt(scan, "Enter price: ");
        int mileage = Validator.getInt(scan, "Enter mileage: ");

    }

    //Method searches for cars based on categories
    public static void searchCar() {

    }


    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GRAND CIRCUS CAR LOT!");
        System.out.println();
        CarLot carLot = new CarLot();
        do {

            menuChoice = getMenu();
            switch (menuChoice) {
//View the entire list action
                case 0:
                    getMenu();
                case 1:
                    CarLot.carList();
                    returnToMenu();
                    menuChoice = 0;
                    break;
//Add a car to the list action
                case 2:
                    do {
                        String used = Validator.getString(scan, "Used Car? (y/n)");
                        if (used.equalsIgnoreCase("y")) {
                            addUsedCars();
                            CarLot.carList();
                        } else if (used.equalsIgnoreCase("n")) {
                            addNewCars();
                            CarLot.carList();
                        }
                    } while (userAddMoreCars().equalsIgnoreCase("y"));
                    menuChoice = 0;
                    break;
//Remove a car from the list action.
                case 3:
                    do {
                        CarLot.carList();
                        int userRemove = Validator.getInt(scan, "Select number for car that you wish to remove: ");
                        CarLot.carList.remove(userRemove - 1);
                        CarLot.carList();
                    } while (userRmMoreCars().equalsIgnoreCase("y"));
                    menuChoice = 0;
                    break;
//View a specific car in the list
                case 4:
                    do {
                        CarLot.carList();
                        int userPicks = Validator.getInt(scan, "Select a car from the list to view: ", 1, CarLot.carList.size());
                        System.out.println(CarLot.carList.get(userPicks -1));

                    } while (userLookMoreCars().equalsIgnoreCase("y"));
                    menuChoice = 0;
                    break;

//Replace a specific car in the list
                case 5:
                    CarLot.carList();
                    int carSwap = Validator.getInt(scan, "Enter number of car you want to swap out: ");
                    replaceCar();
                    System.out.println(CarLot.carList.indexOf(carSwap ));
                    //TODO Code car switch

                    returnToMenu();
                    menuChoice = 0;
                    break;
                case 6:
                    System.out.println("Thank you! Come again!");
                    break;

                default:
                    break;
            }
        } while (menuChoice != 7);


    }


}