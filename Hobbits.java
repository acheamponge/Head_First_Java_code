public class Hobbits {
    protected String name;

    public static void  main(String[] args)
    {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z<3)
        {

            h[z] = new Hobbits();
            h[z].name = "Bilbo";

            if (z == 2)
            {
                h[z].name = "sam";
            }

            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z++;
        }
    }
}
