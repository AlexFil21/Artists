import abstractClass.Artist;
import skills.*;

import java.util.*;

public class ArtAcademy {
    Disco d = new Disco();
    Guitar g = new Guitar();
    HipHop h = new HipHop();
    OperaSinger o = new OperaSinger();
    Piano p = new Piano();
    RockSinger r = new RockSinger();
    String[] arr = {d.getTalent(), g.getTalent(), h.getTalent(), o.getTalent(), p.getTalent(), r.getTalent()};



    public String setPsevdonim() {
        Scanner setPsevdo = new Scanner(System.in);
        System.out.println("enter artist psevdoName: ");
        String psevdoName = setPsevdo.next();
        return  psevdoName;
    }

    public  String setRandomSkills() {
        Random r = new Random();
        int randomNumber=r.nextInt(arr.length);
        String elem = arr[randomNumber];

        switch (elem) {
            case "disco":
               return elem;
            case "guitar":
                return elem;
            case "hip-hop":
                return elem;
            case "opera singer":
                return elem;
            case "piano":
                return elem;
            case "rock singer":
                return elem;
        }

        return  "";
    }


    public Artist teach (People people) {
        String psevdo = setPsevdonim();
        String skill = setRandomSkills();
        switch (skill){
            case "disco":
                d.setPsevdo(psevdo);
                d.setTalent("disco");
                return d;
            case "guitar":
                g.setTalent("guitar");
                g.setPsevdo(psevdo);
                return g;
            case "hip-hop":
                h.setTalent("hip-hop");
                h.setPsevdo(psevdo);
                return h;
            case "opera singer":
                o.setTalent("opera singer");
                o.setPsevdo(psevdo);
                return o;
            case "piano":
                p.setTalent("piano");
                p.setPsevdo(psevdo);
                return p;
            case "rock singer":
                r.setTalent("rock singer");
                r.setPsevdo(psevdo);
                return r;
        }
        return  null;
    }

}
