import java.util.Random;

public class Prodotto {


    private int code;

    private String name;

    private String description;

    private double price;

    private double iva;



    public Prodotto(String name, double price, double iva){
        calcolaCodice();
        this.name = name;
        this.price = price;
        this.iva = iva;
        checkName(name);
        checkPrice();
        printIva();

    }

    public void checkName (String name){
        if(name == null){
           this.name = "Default-Name"; //this.name se non entra sopra non è assegnato a name
        }
  
    }

    public void checkPrice(){
        if(price > 1){
            this.price = price;
        }else{
            System.out.println("Inserisci un prezzo valido");
        }
    }

    public void printIva(){
        if(iva == 22){
            iva = 1.22;
        }else if (iva == 4){
            iva = 1.04;
        }
    }

   //codice random
    public void calcolaCodice(){
        Random number = new Random();
        code = number.nextInt(1000, 100000);
    }
   
    //prezzo base
   public double getPrezzoBase(){
    return price;
   }
   //prezzo con l'iva
   public double Prezzoiva(){
    if(iva == 1.22 || iva == 1.04){
          return price  * iva;
    }
       System.out.println("Il prezzo dell'iva è errato inserisci l'iva al 22 o al 4 %");
       return 0;
   }

   public String getNomeEsteso(){
     return code + "-" + name;
   }

  //per cambiare il codice
   public int setCode (int manualCode){
       code = manualCode;
      return manualCode;
   }

   //per cambiare l'iva
   public double  setIva (double manualIva){
    iva = manualIva;//assegno l'iva
    printIva(); //controllo
    return manualIva;
}
public String setName (String newName){
    name = newName;
    checkName(newName);
    return newName;
}

//descrizione
public String setDescription (String description){
    this.description = description;
    if(description == null){
          this.description = "Default-Text";
     }
     return this.description;
}
}
