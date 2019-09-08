public class MixedMessages {
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
     /*   while (x < 5)
       {
            y = x - y;
            System.out.print(x + ""+ y + " ");
            x++;
        }
        //00 11 21 32 42
*/


 /*       while (x < 5)
        {
            y = y + x;
            System.out.print(x + ""+ y + " ");
            x++;
        }
        //00 11 23 36 410
 */


 /*       while (x < 5)
        {
            y = y + 2;
            if (y > 4)
            {
                y --;
            }
            System.out.print(x + ""+ y + " ");
            x++;
        }
 */
        //02 14 25 36 47

/*
        while (x < 5)
        {
            x++;
            y = y+x;
            System.out.print(x + ""+ y + " ");
            x++;
        }

 */
        //11 34 59

        while (x < 5)
        {
            if (y<5)
            {
                x++;
                if (y<3)
                {
                    x--;
                }
            }

           y = y+2;

            System.out.print(x + ""+ y + " ");
            x++;
        }

        //02 14 36 48
    }
}
