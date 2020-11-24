package GeekSquad.grouptask2;


interface Shape{
    public double area();
    public double perimeter();
}

class Circle implements Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    public double area(){
        return 3.14 * radius * radius;
    }@Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 0;
    }
    static class Square implements Shape{
        double length;
        Square(double a){
            length=a;}
        public double perimeter(){
            return 4* length ;
        }
        @Override
        public double area() {
            return 0;
        }
    }
    static class InterfaceDemo{
        public static void main(String args[]){
            Circle c = new Circle(2.5);
            System.out.println("Area of circle: " + c.area());
            Square s = new Square(5.0);
            System.out.println("Perimeter of square: " + s.perimeter());
        }
    }
}
