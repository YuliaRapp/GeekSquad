package GeekSquad.grouptask2;

interface Car {
    double carPrice = 0;
    String color = null;
    String calculateSalePrice(double carPrice, double x);
}
class Sedan implements Car {
    double carPrice;
    @Override
    public String calculateSalePrice(double carPrice, double length) {
        if (length > 20) {
            return "5% discount for Sedan: " + carPrice * .05 + " is your discount";
        } else {
            return "10% discount for Sedan: " + carPrice * .10 + " is your discount";
        }
    }
}
class Truck implements Car {
    double weight;
    @Override
    public String calculateSalePrice(double carPrice, double weight) {
        if (weight > 2000) {
            return "10% discount for Truck : " + carPrice * .10 + " is your discount";
        } else {
            return "20% discount for Truck : " + carPrice * .20 + " is your discount";
        }
    }
}
class CarTest{
    public static void main(String[] args) {
            Truck obj1=new Truck();
        System.out.println("The price for a truck after 10% is "+obj1.calculateSalePrice(99999.99,2500));
            Truck obj2=new Truck();
        System.out.println("The price for a truck after 20% is "+obj2.calculateSalePrice(59999.99, 1500));

            Sedan obj3=new Sedan();
        System.out.println("The price for a sedan after 5% is "+obj3.calculateSalePrice(89999.99, 30));
        Sedan obj4=new Sedan();
        System.out.println("The price for a sedan after 10% is "+obj4.calculateSalePrice(39999.99, 18));
    }
    }
