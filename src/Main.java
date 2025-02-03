public class Main {
    public static void main(String[] args) {
        
        Prodotto result = new Prodotto(null, 100, 22);

        System.out.println("Il nome è  " + result.getNomeEsteso() + "  " + result.setDescription(null));

        System.out.println(String.format("Il prezzo base è " + result.getPrezzoBase() + " e quello con l'iva è " + result.Prezzoiva()));

        Prodotto prodotto = new Prodotto("mouse", 0, 22);
        //mouse prima della variazione del codice
        System.out.println("Il nome è " + prodotto.getNomeEsteso());
        prodotto.setCode(12345678);
        //mouse dopo la variazione del codice
        System.out.println("Il nome è " + prodotto.getNomeEsteso() + "  " + result.setDescription("descrizione mouse"));
        System.out.println(String.format("Il prezzo base è " + prodotto.getPrezzoBase() + " e quello con l'iva è " + prodotto.Prezzoiva()));
        //variazione iva con il punto
        prodotto.setIva(1.04);
        System.out.println(prodotto.Prezzoiva());
        //variazione iva numero intero
        prodotto.setIva(22);
        System.out.println(prodotto.Prezzoiva());
        //variazione nome con  null
        prodotto.setName(null);
        System.out.println(prodotto.getNomeEsteso());
    }

    
    }
    

