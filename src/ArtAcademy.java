import interfaces.Dance;
import interfaces.Musician;
import interfaces.Singer;

import java.util.*;

public class ArtAcademy implements Dance, Musician, Singer {
    String[][] skills = {{"hip-hop", "disco"}, {"opera singer","rock singer"}, {"piano","guitar"}};
    String[] randomSkills = {"dancer", "singer", "musician"};


    public String setPsevdonim() {
        Scanner setPsevdo = new Scanner(System.in);
        System.out.println("enter artist psevdoName: ");
        String psevdoName = setPsevdo.next();
        return  psevdoName;
    }

    public  String setRandomSkills() {
        Random r = new Random();
        int randomNumber=r.nextInt(randomSkills.length);
        String elem = randomSkills[randomNumber];

        switch (elem) {
            case "dancer":
               return dance(r);
            case "singer":
                return singer(r);
            case "musician":
                return musician(r);
        }

        return  "";
    }


    public ConcretArtist Teach (People people) {
        String psevdo = setPsevdonim();
        ConcretArtist artist = new ConcretArtist();
        artist.setPsevdo(psevdo);
        return  artist;
    }

    @Override
    public String dance(Random elem) {
        return skills[0][elem.nextInt(skills[0].length)];
    }

    @Override
    public String musician(Random elem) {
        return skills[2][elem.nextInt(skills[2].length)];
    }

    @Override
    public String singer(Random elem) {
        return skills[1][elem.nextInt(skills[1].length)];
    }
}
