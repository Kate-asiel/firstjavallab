package mur.first.projct;

public class Main
{
    public static void main(String[] args)
    {
        Juicer samsung = new Juicer();
        Juicer xiaomi = new Juicer("pink", 1.5, 0.2);
        Juicer bosch = new Juicer("white", 1.3, 0.25, "Japan", 350, "plastic", "Bosch");

        System.out.println(Juicer.printTypeOfTheJuicer());
        System.out.println(samsung);
        System.out.println(xiaomi);
        System.out.println(bosch);
    }
}
