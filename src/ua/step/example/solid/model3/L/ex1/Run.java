package ua.step.example.solid.model3.L.ex1;

public class Run {
    public static void main(String[] args) {
        Rectangle rectangle = new RectangleColor();
        rectangle.setLength(10);
        rectangle.setWidth(5);


        Rectangle rectangle1 = new Square();
        rectangle1.setWidth(10);
        rectangle1.setLength(20);

        System.out.println(rectangle1);
    }
}
