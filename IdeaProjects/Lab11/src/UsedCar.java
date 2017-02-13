public class UsedCar extends Car {
    private int Mileage;
    public String Used;

    public void getMileage(int mileage) {
        Mileage = mileage;
    }

    public int setMileage() {

        return Mileage;
    }
    public void getUsed(String used) {
        Used = used;
    }

    public String setUsed() {
        return Used;
    }

    @Override
    public String toString() {
        return String.format("%-13s %-12s %-12s $%-12.2f %-2s %-5s", make, model, year, price, Used, Mileage);

    }

    public UsedCar(String make, String model, int year,  double price, String Used, int Mileage) {
        {this.make = make;
            this.model = model;
            this.year = year;
            this.Used = Used;
            this.price = price;
            this.Mileage = Mileage;
        }
    }
}