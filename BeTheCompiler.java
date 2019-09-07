public class BeTheCompiler {
    public static void main(String[] args)
    {

    // A
        int x = 1;
        while (x < 10)
        {
            if (x > 3)
            {
                System.out.println("big" + x);
            }

            x ++;
        }


     // B
        int y = 5;
        while (y > 1)
        {
            y--;
            if (y < 3)
            {
                System.out.println("small " + y);
            }
        }

     // C
        int z = 5;
        while (z > 1)
        {
            z--;
            if (z<3)
            {
                System.out.println("SMALL" + z);
            }
        }
    }
}
