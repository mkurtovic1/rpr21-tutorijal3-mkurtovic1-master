package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj  extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        setMobilnaMreza(mobilnaMreza);
        setBroj(broj);
    }
    public void setMobilnaMreza(int mobilnaMreza){
        this.mobilnaMreza=mobilnaMreza;
    }
    public void setBroj(String broj){
        this.broj=broj;
    }
    public int getMobilnaMreza(){
        return mobilnaMreza;
    }
    public String getBroj(){
        return broj;
    }
    @Override
    public String ispisi(){
        return "0"+mobilnaMreza+"/"+broj;
    }
}
