package hw001;

public class t_2 {
    public class Rectangle {
        private double width;
        private double height;
        
        public Rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        public double getWidth() {
            return width;
        }
        
        public void setWidth(double width) {
            this.width = width;
        }
        
        public double getHeight() {
            return height;
        }
        
        public void setHeight(double height) {
            this.height = height;
        }
        
        public double calculateArea() {
            return width * height;
        }
        
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }
}
