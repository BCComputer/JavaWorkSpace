public class Table extends Product {
    private double height;
    private double width;
    private double length;

    public Table(int id, String name, double price, double height, double width, double length) {
        super(id, name, price);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){
        return length*width;
    }
    public double volume(){
        return length*width*height;
    }

    //Phase3
    @Override
    public String toString() {
        return  "Id: " + super.getId() +
                "\n Name: "+ super.getName() +
                "\n Price: " + super.getPrice() +
                "\n Height: " + height +
                "\n Width: "+ width +
                "\n Length: " + length;
    }

    public boolean equals(Table table2) {
        return super.getId() == table2.getId() && this.length == table2.length && this.height == table2.height;
    }

}
