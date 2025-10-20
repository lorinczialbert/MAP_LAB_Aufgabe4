public class aufgabe4 {
    //billigste Tastatur finden
    public int findeBilligsteTastatur(int[] preise) {
        if (preise.length == 0) {
            return -1; //falls liste lehr
        }
        // nehmen an, das erste Element ist das billigste
        int billigsterPreis = preise[0];

        // Gehe durch den Rest der Liste
        for (int i = 1; i < preise.length; i++) {
            if (preise[i] < billigsterPreis) {
                //billigeres element gefunden
                billigsterPreis = preise[i];
            }
        }
        return billigsterPreis;
    }
    //2. Teuersten Gegenstand finden
    // Hilfsmethode, um den Maximalpreis in EINER Liste zu finden
    private int findeMaximalenPreis(int[] preise) {
        if (preise.length == 0) {
            return -1;
        }
        int teuersterPreis = preise[0];
        for (int preis : preise) {
            if (preis > teuersterPreis) {
                teuersterPreis = preis;
            }
        }
        return teuersterPreis;
    }

    public int findeTeuerstenGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int maxTastatur = findeMaximalenPreis(tastaturen);
        int maxUsb = findeMaximalenPreis(usbLaufwerke);

        // gibt den grsseren der beiden Maximalwerte zuruck
        return Math.max(maxTastatur, maxUsb);
    }

    //3.teuerste usb laufwerk finden
    public int findeTeuerstesUsbImBudget(int[] usbPreise, int budget) {
        int besterKauf = -1;

        for (int preis : usbPreise) {
            if (preis <= budget && preis > besterKauf) {
                besterKauf = preis;
            }
        }
        return besterKauf;
    }

    //4.Finde Maximale Ausgabe innerhalb des Budgets

    //public int findeMaximaleAusgabe(int[] tastaturPreise, int[] usbPreise, int budget) {
    //  int maximaleAusgabe = -1;






    public static  void main(String[] args) {
        aufgabe4 aufgabe = new aufgabe4();

        //1. Billigste Tastatur finden
        int[] tastaturPreise1 = {40, 35, 70, 15, 45};
        System.out.println("1. Billigste Tastatur: " + aufgabe.findeBilligsteTastatur(tastaturPreise1));

        //2. Teuersten Gegenstand finden
        int[] tastaturPreise2 = {15, 20, 10, 35};
        int[] usbPreise2 = {20, 15, 40, 15};
        System.out.println("2. Teuerster Gegenstand: " + aufgabe.findeTeuerstenGegenstand(tastaturPreise2, usbPreise2));

        //3.teuerste usb laufwerk finden
        int[] usbPreise3 = {15, 45, 20};
        int budget3 = 30;
        System.out.println("3. Teuerstes USB-Laufwerk im Budget: " + aufgabe.findeTeuerstesUsbImBudget(usbPreise3, budget3));

        //4.Finde Maximale Ausgabe innerhalb des Budgets
        //int[] tastaturPreise4 = {40, 50, 60};
        //int[] usbPreise4 = {5, 8, 12};
        //int budget4 = 58;
        //System.out.println("4. Maximale Ausgabe innerhalb des Budgets: " + aufgabe.findeMaximaleAusgabe(tastaturPreise4, usbPreise4, budget4));


    }
}
