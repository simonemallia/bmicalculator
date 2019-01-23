import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.out.println("Benvenuto gentile utente. Questa applicazione effettua un calcolo del tuo indice di massa corporea per valutare il tuo grado di salute.");
     System.out.println("NOTA BENE: l'indice di massa corporea non può essere calcolato in persone con meno di 18 anni e in persone anziane.");

     Calcoli x = new Calcoli();
     Scanner tastiera = new Scanner (System.in);
     String scelta;
     while (true) {
	
              try {

                   System.out.println("Inizia inserendo il tuo peso in kg:");
                   x.setPeso(tastiera.nextDouble());

                   System.out.println("Ora inserisci la tua altezza in cm:");
                   x.setAltezza(tastiera.nextDouble());

                   System.out.println("Il tuo indice di massa corporea è: " +x.getBMI());
                   Thread.sleep(1000);

                   x.getStatistiche();

                   System.out.println("E' in corso il calcolo del tuo peso forma...");
                   Thread.sleep(2000);
                   System.out.println(x.getPesoForma()+" kg");

                   System.out.println("Vuoi riprovare? Scrivi Si o No");

                   scelta = tastiera.nextLine();
                   scelta = tastiera.nextLine();

                   while (!scelta.equalsIgnoreCase("Si") && !scelta.equalsIgnoreCase("No")) {
	               System.out.println("Input non valido. Ritenta");
	               scelta = tastiera.nextLine();
                   }


                   if (scelta.equalsIgnoreCase("Si")) {
	               System.out.println("Riavvio in corso...");
	               continue;
                   }
                   else if (scelta.equalsIgnoreCase("No")){
	               System.out.println("Chiudo il programma...");
	               break;
                   }
                   }

                   catch (InputMismatchException err){
	               System.out.println("Errore: input non riconosciuto");
	               Thread.sleep(1000);
	               System.out.println("Riavvio in corso...");
	               Thread.sleep(1000);
	               scelta = tastiera.nextLine();
	               continue;	
                   }
                   }

       tastiera.close();
      

    }

}


