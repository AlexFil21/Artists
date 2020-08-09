import java.util.Scanner;

public class TalantedHuman {
    public boolean TalentedPeopleOrArtist(){
        Scanner in = new Scanner(System.in);
        boolean res;
        System.out.print("Do you have any skills like dance, sing: (Y or N)> ");
        String name = in.next();
        if (name.equals("Y")) {
            res = true;
        } else {
            res = false;
        };

        return res;
    }
}
