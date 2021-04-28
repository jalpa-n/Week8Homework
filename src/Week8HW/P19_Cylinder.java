package Week8HW;

class P19_Cylinder extends P19_Circle {
    double height; //Global variable

    //call parent constructor
    public P19_Cylinder(double radius, double height) {

        super(radius);
        this.height = height;

        if (height < 0) {

            height = 0;
        }
    }

    //Instance method with return type
    public double getHeight() {

        return height;

    }

    //Instance method with return type
    public double getVolume() {

        return getArea() * height;  //call parentClass method
    }
}

class main1 {
    //Main Method

    public static void main(String[] args) {

        P19_Circle circle = new P19_Circle(3.75);  //Create object with initialize constructor parameter
        System.out.println("circle.radius= " + circle.getRadius()); //call getRadius method
        System.out.println("circle.area= " + circle.getArea());  //call getArea method
        P19_Cylinder cylinder = new P19_Cylinder(5.55, 7.25);  //Create object with initialize constructor parameter
        System.out.println("cylinder.radius= " + cylinder.getRadius()); //call getRadius method
        System.out.println("cylinder.height= " + cylinder.getHeight()); //call getHeight method
        System.out.println("cylinder.area= " + cylinder.getArea());  //call getArea method
        System.out.println("cylinder.volume= " + cylinder.getVolume());  //call getVolume method


    }


}
