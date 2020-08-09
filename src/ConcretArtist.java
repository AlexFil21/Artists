
public class ConcretArtist extends Artist{
    public String psevdo;

    @Override
    public void setPsevdo(String psevdo1) {
        this.psevdo = psevdo1;
    }

    @Override
    public String getPsevdoName() {
        return psevdo;
    }


}
