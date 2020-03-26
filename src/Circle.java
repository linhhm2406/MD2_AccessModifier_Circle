public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}
