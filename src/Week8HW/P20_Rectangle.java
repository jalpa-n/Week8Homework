package Week8HW;

public class P20_Rectangle {
    double width,length;  //Instance variable

    //Constructor with parameters
    public P20_Rectangle(double width,double length){

        this.width=width;
        this.length=length;

        if(width<0){

            width=0;
        }
        if(length<0){

            length=0;
        }
    }

    //Instance method with return type
    public double getWidth(){
        return width;
    }

    //Instance method with return type
    public double getLength(){
        return length;

    }

    //Instance method with return type
    public double getArea(){

        return width*length;   //area of rectangle

    }
}




