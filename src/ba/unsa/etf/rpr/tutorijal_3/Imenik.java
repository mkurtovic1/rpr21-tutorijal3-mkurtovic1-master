package ba.unsa.etf.rpr.tutorijal_3;

import java.util.*;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik=new HashMap<String, TelefonskiBroj>();
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String, TelefonskiBroj> p:imenik.entrySet()){
            if(p.getValue().equals(broj))
                return p.getKey();
        }
        return null;
    }
    public String naSlovo(char s){
        String t;
        for(String i: imenik.keySet()){
            if(s==i.charAt(0))
                t=t+1+". "+i+"-"+i.get(i).ispisi()+"\n";
        }
        return t;
    }
    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> imenaUGradu=new HashSet<String>();
        for(Map.Entry<String, TelefonskiBroj> p:imenik.entrySet()){
            if(p.getValue() instanceof FiksniBroj){
                FiksniBroj poredenje=(FiksniBroj)p.getValue();
                if(poredenje.getGrad().equals(g))
                    imenaUGradu.add(p.getKey());
            }
        }
        return imenaUGradu;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<String> brojeviUGradu=new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String, TelefonskiBroj> p:imenik.entrySet()){
            if(p.getValue() instanceof FiksniBroj){
                FiksniBroj poredenje=(FiksniBroj)p.getValue();
                if(poredenje.getGrad().equals(g))
                    brojeviUGradu.add(p.getKey());
            }
        }
        return brojeviUGradu;
    }
}
