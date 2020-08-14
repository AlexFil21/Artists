import abstractClass.Artist;
import java.util.ArrayList;
import java.util.Arrays;


public class Programm {
    private static int i = 0;
    public static ArrayList<ArrayList<String>> concSkills = new ArrayList<>(1);

    public static void main(String[] args) {
//create person
            People people = new People();
            people.setNameAge();

//create academy
            ArtAcademy academy = new ArtAcademy();
            Artist a = academy.teach(people);
//artist Psevdo
            String psevdo = a.getPsevdoName();

//set skills
            String artistSkill = a.getSkill();

//create artist info array
            String[] arr = {people.getName(), Integer.toString(people.getAge()), psevdo};

//introduce artist
            Concert concert = new Concert(arr);
            concert.IntroduceArtist();

//build all artists array
            String[] skillPsevdo = {artistSkill, psevdo};
            ArrayList<String> list = new ArrayList<>(Arrays.asList(skillPsevdo));
            concSkills.add(list);

//start show
            if (i > 1) {
                for (ArrayList elem : concSkills) {
                    concert.Show(elem);
                }
            }


//adding artist
        String[] arrg = {};
        while (i<2) {
            System.out.println();
            i++;
            main(arrg);
        }
    }
}
