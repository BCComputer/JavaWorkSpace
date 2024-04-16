//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //int id, String name, double price, double rating
        Laptop laptop1 = new Laptop(201, "HP", 550.00, 4.5, 12, 2.4, 4.5, 6.2);
        Laptop laptop2 = new Laptop(202, "Dell", 700.00, 4.2, 17, 2.4, 4.5, 6.2);

        if(laptop1.equals(laptop2)){
            System.out.println("Both laptops are same.");
        }else{
            System.out.println("Both laptops are not same.");
        }
        System.out.println("***************************************");

        System.out.println(laptop1.toString());

        System.out.println("***************************************");

        System.out.println(laptop2.toString());

        System.out.println("***************************************");
        Table rectangularTale1 = new Table(101, "myTable", 20.50, 4, 4, 4);
        Table rectangularTale2 = new Table(102, "myTable", 25.50, 2, 2, 2);


        System.out.println("Table 1 Area:" + rectangularTale1.area());
        System.out.println("Table 1 Volume: " + rectangularTale1.volume());

        System.out.println("***************************************");

        System.out.println("Table 2 Area:" + rectangularTale2.area());
        System.out.println("Table 2 Volume: " + rectangularTale2.volume());

        System.out.println("***************************************");

        if(rectangularTale1.equals(rectangularTale2)){
            System.out.println("Both tables are same.");

        }else{
            System.out.println("Both tables are not same.");
        }

        System.out.println("***************************************");

        System.out.println(rectangularTale1.toString());

        System.out.println("***************************************");

        System.out.println(rectangularTale2.toString());

        System.out.println("***************************************");
//int id, String name, double price, double rating, int watts, int lumens
        Light light1 = new Light(501, "LightBulb", 10.40, 4.3, 60, 800);
        Light light2 = new Light(502, "LedLight", 5.20, 2.3, 100, 600);

        System.out.println("***************************************");
        System.out.println(light1.toString());
        System.out.println("***************************************");
        System.out.println(light2.toString());

        System.out.println("***************************************");

        if(light1.equals(light2)){
            System.out.println("Both Lights are same.");

        }else{
            System.out.println("Both Lights are not same.");
        }

        System.out.println("***************************************");

        light1.checkPowerUtil();
        light2.checkPowerUtil();

    }


}