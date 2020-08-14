import interfaces.Dance;
import interfaces.Musician;
import interfaces.Singer;
import skills.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Concert {
    public static ArrayList<ArrayList<String>> allArtists = new ArrayList<>(1);
    public  static  String[] artistsArr;

    Concert (String[] artistsArr) {
        this.artistsArr = artistsArr;
    }

    public static void IntroduceArtist () {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(artistsArr));
        allArtists.add(list);

        if (allArtists.size() > 2) {
            for (ArrayList elem: allArtists) {
                System.out.println();
                System.out.println("Name: " + elem.get(0) + "\nAge: " + elem.get(1) + " year old\nPsevdoName: " + elem.get(2));
            }
        }
    }

   public static void Show (ArrayList concSkill) {
       Disco d = new Disco();
       Guitar g = new Guitar();
       HipHop h = new HipHop();
       OperaSinger o = new OperaSinger();
       Piano p = new Piano();
       RockSinger r = new RockSinger();

       if (d instanceof Dance && d.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       } else if (h instanceof Dance && h.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       } else if (g instanceof Musician && g.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       } else if (p instanceof Musician && p.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       } else if (o instanceof Singer && o.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       } else if (r instanceof Singer && r.getTalent() == concSkill.get(0)) {
           System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
       }
    }
}
