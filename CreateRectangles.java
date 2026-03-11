// Kalan Jarvis-Loewen
// March 10, 2026

class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        width = 1.0;
        height = 2.0;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return this.height + this.width;
    }
}

class CreateRectangles {
    public static void main(String[] args) {
        
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.7);

        System.out.println(
            "This is rectangle 1. It has a width of 4 and a height of 40. It's area is "
            + rectangle1.getArea() + ", and it's perimeter is " + rectangle1.getPerimeter() + ".");

        System.out.println(
            "This is rectangle 2. It has a width of 3.5 and a height of 35.7. It's area is "
            + rectangle2.getArea() + ", and it's perimeter is " + rectangle2.getPerimeter() + ".");
    }
}

