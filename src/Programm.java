import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Programm {
    private static int i = 0;
    public static ArrayList<ArrayList<String>> concSkills = new ArrayList<>(1);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = in.next();

        System.out.println("enter age: ");
        int age = Integer.parseInt(in.next());

//create person
        People people = new People(name, age);

//create academy
        ArtAcademy academy = new ArtAcademy();

//artist Psevdo
        String psevdoName = academy.Teach(people).psevdoName;
        String artistSkill = academy.setRandomSkills();
        String[] arr = {people.getName(), Integer.toString(people.getAge()), psevdoName};

//introduce artist
        Concert concert = new Concert(arr);
        concert.IntroduceArtist();
//start show
        String[] skillPsevdo = {artistSkill, psevdoName};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(skillPsevdo));
        concSkills.add(list);
        if (i>1) {
            for (ArrayList elem: concSkills) {
                     concert.Show(elem);
            }
        }


//adding artist
        String[] arrg = {};
        while (i<2) {
            i++;
            System.out.println();
            main(arrg);
        }
    }
}
