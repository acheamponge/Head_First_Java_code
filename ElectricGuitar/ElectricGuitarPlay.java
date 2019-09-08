public class ElectricGuitarPlay extends ElectricGuitar {
    public static void main(String[] args)
    {
        ElectricGuitar eG = new ElectricGuitar();

        eG.setBrand("Casio");
        eG.setNumOfPickups(34);
        eG.setRockStarUsesIt(true);

        System.out.println(eG.getBrand());
    }
}
