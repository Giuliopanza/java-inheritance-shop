package org.shop;

public class Cuffie  extends Prodotto{
    private boolean isWireless;
    private String colore;

    public Cuffie(String name, String brand, float prezzo, int iva, Boolean isWireless, String colore) {
        super(name, brand, prezzo, iva);
        this.isWireless = isWireless;
        this.colore = colore;
    }

    public String getColore (){
        return colore;
    }

    public void set (String colore){
        this.colore=colore;
    }

    public boolean getIsWireless (){
        return isWireless;
    }

    public void setIsWireless (boolean isWireless){
        this.isWireless=isWireless;
    }

    @Override
    public String toString(){
        return super.toString() + "\nColore: " + getColore() + "\n Wireless: " + getIsWireless();
    }
}
