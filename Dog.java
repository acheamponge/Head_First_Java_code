class Dog {
    protected int size;
    protected String breed;
    protected String name;

    public void bark()
    {
        System.out.println("Ruff, Ruff");
    }
}

class DogTestDrive
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
