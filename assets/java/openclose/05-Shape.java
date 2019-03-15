public interface Shape {
    public double calculateArea();
}

public class Rectangle implements Shape {
    double length;
    double width;
    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Circle implements Shape {
    public double radius;
    @Override
    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}