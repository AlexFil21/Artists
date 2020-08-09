import java.util.ArrayList;
import java.util.Arrays;

public class Programm {
    private static int i = 0;
    public static ArrayList<ArrayList<String>> concSkills = new ArrayList<>(1);

    public static void main(String[] args) {
        TalantedHuman e = new TalantedHuman();

        if (e.TalentedPeopleOrArtist()) {
            People people = new People();
            people.setNameAge();
            System.out.println("Know you created a simple person, not artist. Try one more time");
        } else {
//create person
            People people = new People();
            people.setNameAge();

//create academy
            ArtAcademy academy = new ArtAcademy();

//artist Psevdo
            String psevdo = academy.Teach(people).getPsevdoName();

//set skills
            String artistSkill = academy.setRandomSkills();

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



        i++;
        }


//adding artist
        String[] arrg = {};
        while (i<3) {
            System.out.println();
            main(arrg);
        }
    }
}
