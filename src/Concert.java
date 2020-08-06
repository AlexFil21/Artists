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
        String[][] skills = {{"hip-hop", "disco"}, {"opera singer","rock singer"}, {"piano","guitar"}};
        String[] arr = {"dancer", "singer", "musician"};
        String talent = "";

        for (int i = 0; i < skills.length ; i++) {
            for (int j = 0; j <skills[i].length ; j++) {
                if (skills[i][j] == concSkill.get(0)) {
                    talent = arr[i];
                }
            }
        }
       System.out.println();

        switch (talent) {
            case "dancer":
                System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please dance");
                break;
            case "singer":
                System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please sing smth");
                break;
            case "musician":
                System.out.println(concSkill.get(1) + " skill is " + concSkill.get(0) + ". Please play smth");
                break;
        }
    }

}
