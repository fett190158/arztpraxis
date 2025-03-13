package arztpraxis;

import arztpraxis.persons.Patient;
import arztpraxis.rooms.Rezeption;


public class Arztpraxis {
    
    public static Patient [] patientenStamm = new Patient[30];
    public static Patient [] tagesPatienten = new Patient[10];
    
   

    
    public static void main(String[] args) {
        String[] svnNummern = {"03453534", "76853453", "546736456", "7456434345", "56734564536"};
        erzeugePatientenStamm();
        Rezeption rezeption = new Rezeption();
        
        // Jede Nummer in svnNummern Anmelden:
        for (int i = 0; i < svnNummern.length; i++) {
            
            // Prüfen ob Patient in patientenStamm vorhanden ist:
            if(rezeption.patientAnmelung(svnNummern[i]) == null){
                // -> Patient nicht vorhanden
                
                // Patient erstellen:
                Patient newPatient = rezeption.patientAufnehmen(svnNummern[i]);
                
                // Patient zu erster freien Stelle in patientenStamm hinzufügen:
                for (int j = 0; j < patientenStamm.length; j++) {
                    if(patientenStamm == null){
                        newPatient = patientenStamm[j];
                        break;
                    }
                }
                
                // Patient zu erster freien Stelle in tagesPatienten hinzufügen:
                for (int j = 0; j < tagesPatienten.length; j++) {
                    if(tagesPatienten[j] == null){
                        tagesPatienten[j] = newPatient;
                        break;
                    }
                }
            }
            
            // -> Patient vorhanden
            // Stelle des Patienten in PatientenStamm herausfinden:
            for (int j = 0; j < patientenStamm.length; j++) {
                if(patientenStamm[j] != null && patientenStamm[j].getSVNNumber().equals(svnNummern[i])){
                    
                    //Patient zu erster freien Stelle in tagesPatienten hinzufügen:
                    for (int k = 0; k < tagesPatienten.length; k++) {
                        if(tagesPatienten[k] == null){
                            tagesPatienten[k] = patientenStamm[j];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        rezeption.zeigeTagespPatienten();
    }
    
    private static void erzeugePatientenStamm() {
        
        // Bereits bekannte Patienten zu PatientenStamm hinzufügen:
        Patient p1 = new Patient(1, "Martin HUBER", "05.04.1978", "Vogelgasse 34, 8010", "364634345");
        patientenStamm[0] = p1;
         Patient p2 = new Patient(2, "Jan BOZNIK", "11.05.1998", "Kärnterstraße 22, 8030", "76853453");
        patientenStamm[1] = p2;
         Patient p3 = new Patient(3, "Martina HAUSMANN", "08.12.1988", "Feldweg 12, 8020", "53453452");
        patientenStamm[2] = p3;
         Patient p4 = new Patient(4, "Andrea FIELMANN", "27.03.2001", "Gartenweg 67, 8010", "784634345");
        patientenStamm[3] = p4;
         Patient p5 = new Patient(5, "Fabian TSCHERNER", "14.08.1973", "Siedlungsstraße 79, 8040", "112634345");
        patientenStamm[4] = p5;
         Patient p6 = new Patient(6, "Florian SOHNEG", "30.11.1994", "Fasangasse 15, 8040", "222634345");
        patientenStamm[5] = p6;
         Patient p7 = new Patient(7, "Lisa GROSS", "29.01.1983", "Am Lerchfeld 23, 8020", "363334345");
        patientenStamm[6] = p7;
         Patient p8 = new Patient(8, "Katharina HÜTTL", "09.09.1992", "Wasserwerksstraße 134, 8030", "555634345");
        patientenStamm[7] = p8;
         Patient p9 = new Patient(9, "Robert MAIER", "13.05.2003", "Hüttenweg 3, 8040", "7456434345");
        patientenStamm[8] = p9;
         Patient p10 = new Patient(10, "Michael MEIXNER", "31.03.1994", "Kaiserweg, 8010", "967834345");
        patientenStamm[9] = p10;
         Patient p11 = new Patient(11, "Martin AUINGER", "01.12.1982", "Wiesengasse 25, 8020", "546736456");
        patientenStamm[10] = p11;
         Patient p12 = new Patient(12, "Karin KECK", "07.06.1996", "Rechbauerstraße 5, 8010", "7894534345");
        patientenStamm[11] = p12;
         Patient p13 = new Patient(13, "Philipp STEINER", "05.08.2001", "Schützenhofgasse 13, 8020", "99546324");
        patientenStamm[12] = p13;
         Patient p14 = new Patient(14, "Eva FELLNER", "30.08.1964", "Grazbachgasse 46, 8030", "225465465");
        patientenStamm[13] = p14;
         Patient p15 = new Patient(15, "Karl GEISSNER", "28.02.1995", "Hallerschlossgasse 245, 8040", "45623445");
        patientenStamm[14] = p15;
         Patient p16 = new Patient(16, "Michaela STURM", "22.07.1989", "Engelgasse 65, 8010", "845624345");
        patientenStamm[15] = p16;
         Patient p17 = new Patient(17, "Carina KLUG", "06.10.1985", "Rapoldstraße 95, 8020", "3452634345");
        patientenStamm[16] = p17;
         Patient p18 = new Patient(18, "Klaus WINDISCH", "03.04.1993", "Schillerstraße 5, 8030", "96456353");
        patientenStamm[17] = p18;
         Patient p19 = new Patient(19, "Jennifer BECK", "12.07.2003", "Wittelweg 17, 8010", "03453534");
        patientenStamm[18] = p19;
         Patient p20 = new Patient(20, "Max GAUBE", "18.06.1979", "Merangasse 173, 8020", "34747583");
        patientenStamm[19] = p20;
    }
}
