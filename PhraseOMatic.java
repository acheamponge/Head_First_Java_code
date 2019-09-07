public class PhraseOMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"24/7","multi-Tier","30,OOO foot", "B-to-B" , "win-win" , "frontend" , "web-based" , "pervasive", "smart", "sixsigma", "critical-path" , "dynamic"};
        String[] wordListTwo ={"empowered", "sticky",
                    "value-added.", "oriented", "centric", "distributed",
                    "clustered", "branded", "outside-the-box", "positioned",
                    "networked", " focused" , "leveraged", "aligned",
                    "targeted", "shared" , "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency" ,
                "strategy", "mindshare", "portal" , "space", "vision",
                "paradigm", "mission"};


        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength =wordListThree.length;

        int randl = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[randl] + " " +
        wordListTwo[rand2] + " " + wordListThree[rand3] ;
        System.out.println("What we need is a " + phrase);
}
}
