import java.util.*;

public class ArtAcademy {
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
                return skills[0][r.nextInt(skills[0].length)];
            case "singer":
                return skills[1][r.nextInt(skills[1].length)];

            case "musician":
                return skills[2][r.nextInt(skills[2].length)];
        }

        return  "";
    }


    public Artist Teach (People people) {
        String psevdo = setPsevdonim();
        Artist artist = new Artist(psevdo);
        artist.psevdoName = psevdo;
        return artist;
    }

}
