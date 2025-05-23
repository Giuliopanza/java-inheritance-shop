package org.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        
        Prodotto [] products = new Prodotto[1];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {

            System.out.println("Nome del prodotto : ");
            String productName = input.nextLine();

            System.out.println("Marca del prodotto : ");
            String productBrand = input.nextLine();

            System.out.println("Prezzo del prodotto : ");
            int productPrice = Integer.parseInt(input.nextLine());

            System.out.println("A quale catoria fa parte? tv, smartphone o cuffie ");
            String productCategory = input.nextLine();
            
            switch (productCategory.toLowerCase()) {
                case "tv":
                
                System.out.println("Dimensioni della tv in pollici: ");
                int tvDimension = Integer.parseInt(input.nextLine());

                System.out.println("La tv è smart? (inserisci TRUE o FALSE)");
                boolean isSmartTv = Boolean.parseBoolean(input.nextLine());

                Televisori tv = new Televisori(productName, productBrand, productPrice, i, isSmartTv, tvDimension);
                products[i] = tv;

                break;

                case "smartphone":
                
                System.out.println("Memoria in GB: ");
                int smartphoneMemoria = Integer.parseInt(input.nextLine());

                System.out.println("Codice IMEI: ");
                String codeImei = input.nextLine();

                Smartphone smartphone = new Smartphone(productName, productBrand, productPrice, i, codeImei, smartphoneMemoria);
                products[i] = smartphone;
                    
                break;
            
                case "cuffie":
                
                System.out.println("Colore: ");
                String cuffieColor = input.nextLine();

                System.out.println("Le cuffie sono wireless? (inserisci TRUE o FALSE)");
                boolean isWirelessCuffie = Boolean.parseBoolean(input.nextLine());

                Cuffie cuffie = new Cuffie(productName, productBrand, productPrice, i, isWirelessCuffie, cuffieColor);
                products[i] = cuffie;
                break;
            }

            input.close();

            for (int j = 0; j < products.length; j++) {
                
                System.out.println(products[j]);
            }
        }
    }

}
