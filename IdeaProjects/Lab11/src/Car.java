public class Car {
    //Main cannot see these variables.
    public String make;
    public String model;
    public int year;

    public double price;

    //Command N or right click and select generate, select all variables, constructor for method in the bottom method.
//Command N getter/setter makes the getter/setter right below.

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

    }

    //Changes the way the object prints.  Method signature must match the same .toString method.

    /**
     *Remember String.format()
     */
    @Override
    public String toString(){
        return String.format("%-13s %-12s %-12s $%-12.2f", make, model, year, price);
    }
    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0;
    }
    public Car(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}

