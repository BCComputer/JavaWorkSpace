public class Light extends Product {
    private int watts;    // Power consumption in watts
    private int lumens;   // Brightness in lumens
    private final double voltage = 12.6;

    public double noOfAmps(){
        return watts/voltage;
    }

    public void checkPowerUtil(){
        if(noOfAmps()< 5) {
            System.out.println("Low power utilization.");
        }else if(noOfAmps()>=5 && noOfAmps()<=20){
            System.out.println("Moderate power utilization.");
        }else{
            System.out.println("High power utilization.");
        }
    }

    //Phase 2

    public Light(int id, String name, double price, double rating, int watts, int lumens) {
        super(id, name,price, rating);
        this.watts = watts;
        this.lumens = lumens;
    }
    //Phase3
    @Override
    public String toString() {
        return  "Id: " + super.getId() +
                "\n Name: "+ super.getName() +
                "\n Price: " + super.getPrice() +
                "\n Wats: " + watts +
                "\n Lumens: "+ lumens;
    }
    @Override
    public boolean equals(Object obj) {
        Light light = (Light) obj;  // Cast the object to Person class
        // Compare attributes for equality
        return super.getId() == light.getId() && this.watts == light.watts && this.lumens == light.lumens;
    }

}
