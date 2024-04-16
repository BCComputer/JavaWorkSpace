public class Laptop extends Product {
    //Phase1
    int screenSize;
    double ram;
    double ssd;
    double processor;

    //Phase2
    public Laptop(int id, String name, double price, double rating, int screenSize, double ram, double ssd, double processor) {
        super(id, name, price, rating);
        this.screenSize = screenSize;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getSsd() {
        return ssd;
    }

    public void setSsd(double ssd) {
        this.ssd = ssd;
    }

    public double getProcessor() {
        return processor;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

    public void checkCharging(){
        System.out.println("Check Charging");
    }
    public void checkLogin(){
        System.out.println("Check Login");
    }

    //Phase3
    @Override
    public String toString() {
        return "Id: " + super.getId() +
                "\n Price: " + super.getPrice() +
                "\n Screen Size: " + screenSize +
                "\n RAM: "+ ram +
                "\n SSD: " + ssd +
                "\n Processor: " + processor;
    }
@Override
    public boolean equals(Object obj) {
        Laptop laptop = (Laptop)obj;
        return super.getId() == laptop.getId() && this.ram == laptop.ram && this.ssd == laptop.ssd && laptop.processor == laptop.processor;
    }
}
