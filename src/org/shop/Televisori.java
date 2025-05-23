package org.shop;

public class Televisori extends Prodotto {
    private boolean isSmart;
    private int dimensioni;

    public Televisori(String name, String brand, int prezzo, int iva, Boolean isSmart, int dimensioni) {
        super(name, brand, prezzo, iva);
        this.isSmart = isSmart;
        this.dimensioni = dimensioni;
    }

    public int getDimensioni (){
        return dimensioni;
    }

    public void setDimensioni (int dimensioni){
        this.dimensioni=dimensioni;
    }

    public boolean getIsSmart (){
        return isSmart;
    }

    public void setIsSmart (boolean isSmart){
        this.isSmart=isSmart;
    }

    @Override
    public String toString(){
        return super.toString() + "\nDimensioni: " + getDimensioni () + "\n Smart: " + getIsSmart();
    }
}

