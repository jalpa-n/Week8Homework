package Week8HW;
//child class
public class P20_Cuboid extends P20_Rectangle {

    double height; //Instance variable

        // Constructor  with parameters
        public P20_Cuboid(double width, double length ,double height) {

            super(width, length); //call parent class with super keyword
            this.height=height;

            if(height<0){

                height=0;

            }
        }

        //Instance method with return type
        public double getHeight(){

            return height;

        }

        //Instance method with return type
        public double getVolume(){

            return getArea()*height; //call parent class method

        }

    }

    //Class Main2
    class Main2{

        //Main method
        public static void main(String[] args) {

            P20_Rectangle rectangle = new P20_Rectangle(5, 10);//Create object
            System.out.println("rectangle.width= " + rectangle.getWidth()); //call getWidth method
            System.out.println("rectangle.length= " + rectangle.getLength()); //call getLength
            System.out.println("rectangle.area= " + rectangle.getArea()); //call getArea method
            P20_Cuboid cuboid = new P20_Cuboid(5,10,5); //create object
            System.out.println("cuboid.width= " + cuboid.getWidth()); //call getWidth method
            System.out.println("cuboid.length= " + cuboid.getLength()); //call getLength method
            System.out.println("cuboid.area= " + cuboid.getArea());  //call getArea method
            System.out.println("cuboid.height= " + cuboid.getHeight()); //call getHeight method
            System.out.println("cuboid.volume= " + cuboid.getVolume()); //call getVolume method
        }

    }