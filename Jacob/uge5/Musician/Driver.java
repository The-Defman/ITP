public class Driver
{
    public static void exam() {
        Musician m1 = new Musician("Harrison Jenkin", "Drums", 75),
                 m2 = new Musician("Georgiann Lapan", "Guitar", 77), 
                 m3 = new Musician("Terrance Almon", "Keyboard", 82),
                 m4 = new Musician("Bianca Banfield", "Triangle", 92),
                 m5 = new Musician("Vilma Bruns", "Keyboard", 33);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        
        Band band = new Band("D....", m1, m2, m3, m4, m5);
        
        System.out.println(band.skilledMusicians(75));
        
        System.out.println(band.withInstrument("Drums"));
        
        band.printBand();
    }
}
