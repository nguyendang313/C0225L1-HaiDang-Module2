public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0, 2.0);

        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
    }
}