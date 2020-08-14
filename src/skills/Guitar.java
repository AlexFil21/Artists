package skills;
import abstractClass.Artist;
import interfaces.Musician;

public class Guitar extends Artist implements Musician {
    String s = "guitar";
    String psevdo;

    @Override
    public void setPsevdo(String psevdoN) { this.psevdo = psevdoN; }

    @Override
    public String getTalent() {
        return s;
    }

    @Override
    public String getPsevdoName() {
        return psevdo;
    }

    @Override
    public void setTalent(String talent) { this.s = talent; }

    @Override
    public String getSkill() { return s;}

}
