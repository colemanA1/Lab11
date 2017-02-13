import java.util.*;

public class CarLot extends Car {
    public static ArrayList<Car> carList = new ArrayList<>();

    public static ArrayList<Car> getCarList() {
        return carList;
    }

    public static void setCarList(ArrayList<Car> carList) {
        CarLot.carList = carList;
    }

    public CarLot() {
        carList.add(new Car("Lamborghini", "Reventon", 2010, 4500000));
        carList.add(new Car("Mercedes", "Maybach", 2017, 500000));
        carList.add(new Car("Aston Martin", "DB10", 2011, 1500000));
        carList.add(new UsedCar("Ford", "Pinto", 1978, 2000, "(Used)", 300000));
        carList.add(new UsedCar("Mazda", "Miata", 1994, 800, "(Used)", 280000));
        carList.add(new UsedCar("Geo/Chevy", "Metro", 1995, 500, "(Used)", 300000));
    }


    public static void carList() {
        System.out.printf("%-2s %-12s %-12s %-12s %-13s %-6s %-2s", "Num", "Model", "Make", "Year", "Price", "N/U", "Mileage\n");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < CarLot.carList.size(); ++i) {
            System.out.print((i + 1) + ". ");
            System.out.println(carList.get(i).toString());
        }
    }

    public static void addCars(Car input){
        CarLot.carList.add(input);
    }
    public static void removCars(Car input){
        carList.remove(input);
    }

    public static ArrayList<Car> getcarList() {
        return carList;
    }
}
