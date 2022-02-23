package mur.first.projct;

public record Juicer(String color, double amount, double power, String producer, int price, String material, String brand)
{
    private static final String TYPE = "Centrifugal";

    public Juicer()
    {
        this("black", 1.0, 0.15, "China", 300, "PP","Tefal");
    }

    public Juicer(String color, double amount, double power)
    {
        this(color, amount, power, "Turkey", 400, "metal", "Philips");
    }

    public Juicer(String color, double amount, double power, String producer, int price, String material, String brand)
    {
        this.color = color;
        this.amount = amount;
        this.power = power;
        this.producer = producer;
        this.price = price;
        this.material = material;
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return String.format("The juicer is %s, max amount of juice is %f l/h , its power is %f kW, made in %s, costs %d dollars, body material is %s and the brand of it is %s", color, amount, power, producer, price, material, brand);
    }

    public static String getStaticField()
    {
        return "Type of juicer - " + TYPE;
    }

}
