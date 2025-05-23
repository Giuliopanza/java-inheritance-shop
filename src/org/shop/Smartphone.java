package org.shop;

public class Smartphone extends Prodotto {

    private String codeImei;
    private int memoria;

    public Smartphone(String name, String brand, float prezzo, int iva, String codeImei, int memoria) {
        super(name, brand, prezzo, iva);
        this.codeImei = codeImei;
        this.memoria = memoria;
    }

    public String getCodeImei (){
        return codeImei;
    }

    public void setCodeImei (String codeImei){
        this.codeImei=codeImei;
    }

    public int getMemoria (){
        return memoria;
    }

    public void setMemoria (int memoria){
        this.memoria=memoria;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodice IMEI: " + getCodeImei () + "\n Memoria: " + getMemoria ();
    }
}
