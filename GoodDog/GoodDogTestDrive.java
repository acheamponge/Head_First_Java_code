public class GoodDogTestDrive extends GoodDog {
    public static void main(String[] args)
    {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog one barks: " + one.bark());

        System.out.println("Dog two: " + two.getSize());
        System.out.println("Dog two barks: " + two.bark());

    }
}
