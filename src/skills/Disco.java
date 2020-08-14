package skills;
import abstractClass.Artist;
import interfaces.Dance;

public class Disco extends Artist implements Dance {
    String s = "disco";
    String psevdo;

    @Override
    public void setPsevdo(String psevdoN) {
        this.psevdo = psevdoN;
    }

    @Override
    public String getPsevdoName() {
        return psevdo;
    }

    @Override
    public void setTalent(String talent) {
        this.s = talent;
    }

    @Override
    public String getSkill() { return s;}

    @Override
    public String getTalent() {
        return s;
    }

}
