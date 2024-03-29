class Movie {
    protected String title;
    protected String genre;
    protected int rating;

    public void playIt()
    {
        System.out.println("Playing the movie");
    }
}


public class MovieTestDrive
{
    public static void main(String[] args)
    {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.genre = "Tragic but ultimately uplifting";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}