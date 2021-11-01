package ba.unsa.etf.rpr.tutorijal_3;

public class FiksniBroj extends TelefonskiBroj{
    public enum Grad{
        TRAVNIK("030"), ODZAK("031"), BREZA("032"), SARAJEVO("033"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), CAZIN("037"), GORAZDE("038"), GRUDE("039");
        private final String pozivniBroj;
        Grad(String pozivniBroj){
            this.pozivniBroj=pozivniBroj;
        }
        public String getPozivniBroj(){
            return pozivniBroj;
        }
    }
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj){
        getGrad(grad);
        setBroj(broj);
    }
    public Grad getGrad(){
        return grad;
    }
    public void setGrad(){
        this.grad=grad;
    }
    public String getBroj(){
        return broj;
    }
    public void setBroj(String broj){
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        return grad.getPozivniBroj()+"/"+broj;
    }
}
