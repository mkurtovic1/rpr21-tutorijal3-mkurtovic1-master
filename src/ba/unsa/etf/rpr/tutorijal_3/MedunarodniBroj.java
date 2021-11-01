package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj){
        setDrzava(drzava);
        setBroj(broj);
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getBroj() {
        return broj;
    }

    public String getDrzava() {
        return drzava;
    }
    @Override
    public String ispisi(){
        return drzava+broj;
    }
}
