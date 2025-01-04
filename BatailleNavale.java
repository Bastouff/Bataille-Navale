import java.util.Scanner;
public class BatailleNavale{
    public static void main(String[] args) {
        Scanner monScan = new Scanner(System.in);
        char tabBataille[][] = new char[10][10];
        byte numLigne, numColonne = 0;
        char sens = 'H';
        
        System.out.println("Où souhaitez-vous placer le bateau ?");
        System.out.println("Numéro de ligne ?");
        numLigne = monScan.nextByte();

        System.out.println("Numéro de colonne ?");

        numColonne = monScan.nextByte();

        System.out.println("Sens ?");

        sens = monScan.next().charAt(0);

        System.out.println("Vous souhaitez placer le bateau en ligne " + numLigne + " et en colonne " + numColonne + " enfin le sens désiré est " + sens);

        if (sens == 'B'){
            tabBataille[numLigne-1][numColonne-1] = 'P';

            tabBataille[numLigne][numColonne-1] = 'P';

            tabBataille[numLigne+1][numColonne-1] = 'P';

            tabBataille[numLigne+2][numColonne-1] = 'P';

            tabBataille[numLigne+3][numColonne-1] = 'P';
        }

        else if (sens == 'H'){
            tabBataille[numLigne-1][numColonne-1] = 'P';

            tabBataille[numLigne-2][numColonne-1] = 'P';

            tabBataille[numLigne-3][numColonne-1] = 'P';

            tabBataille[numLigne-4][numColonne-1] = 'P';

            tabBataille[numLigne-5][numColonne-1] = 'P';
        }

        else if (sens == 'D'){
            tabBataille[numLigne-1][numColonne-1] = 'P';

            tabBataille[numLigne-1][numColonne] = 'P';

            tabBataille[numLigne-1][numColonne+1] = 'P';

            tabBataille[numLigne-1][numColonne+2] = 'P';

            tabBataille[numLigne-1][numColonne+3] = 'P';
        }

        else if (sens == 'G'){
            tabBataille[numLigne-1][numColonne-1] = 'P';

            tabBataille[numLigne-1][numColonne-2] = 'P';

            tabBataille[numLigne-1][numColonne-3] = 'P';

            tabBataille[numLigne-1][numColonne-4] = 'P';

            tabBataille[numLigne-1][numColonne-5] = 'P';
        }

        else{
            System.out.println("Je ne comprends pas.");
        }

        System.out.println("Où souhaitez-vous tirer ?");
        System.out.println("Numéro de ligne ?");

        numLigne = monScan.nextByte();

        System.out.println("Numéro de colonne ?");

        numColonne = monScan.nextByte();

        System.out.println("Vous souhaitez frapper en ligne " +numLigne + " et en colonne " + numColonne);

 

        if(tabBataille[numLigne-1][numColonne-1] == 'P'){
            System.out.println("TOUCHE");
        }

        else{
            System.out.println("PLOUF");
        }

        System.out.println(tabBataille[numLigne-1][numColonne-1] + 1 + tabBataille[numLigne-1][numColonne] + "." + tabBataille[numLigne-1][numColonne+1] + "." + tabBataille[numLigne-1][numColonne+2] + "." + tabBataille[numLigne-1][numColonne+3] + "." + tabBataille[numLigne-1][numColonne+4] + "." + tabBataille[numLigne-1][numColonne+5] + "." + tabBataille[numLigne-1][numColonne+6] + "." + tabBataille[numLigne-1][numColonne+7] + "." + tabBataille[numLigne-1][numColonne+8]);

        System.out.println(tabBataille[numLigne][numColonne-1] + "." + tabBataille[numLigne][numColonne] + "." + tabBataille[numLigne][numColonne+1] + "." + tabBataille[numLigne][numColonne+2] + "." + tabBataille[numLigne][numColonne+3] + "." + tabBataille[numLigne][numColonne+4] + "." + tabBataille[numLigne][numColonne+5] + "." + tabBataille[numLigne][numColonne+6] + "." + tabBataille[numLigne][numColonne+7] + "." + tabBataille[numLigne][numColonne+8]);

        System.out.println(tabBataille[numLigne+1][numColonne-1] + "." + tabBataille[numLigne+1][numColonne] + "." + tabBataille[numLigne+1][numColonne+1] + "." + tabBataille[numLigne+1][numColonne+2] + "." + tabBataille[numLigne+1][numColonne+3] + "." + tabBataille[numLigne+1][numColonne+4] + "." + tabBataille[numLigne+1][numColonne+5] + "." + tabBataille[numLigne+1][numColonne+6] + "." + tabBataille[numLigne+1][numColonne+7] + "." + tabBataille[numLigne+1][numColonne+8]);

        System.out.println(tabBataille[numLigne+2][numColonne-1] + "." + tabBataille[numLigne+2][numColonne] + "." + tabBataille[numLigne+2][numColonne+1] + "." + tabBataille[numLigne+2][numColonne+2] + "." + tabBataille[numLigne+2][numColonne+3] + "." + tabBataille[numLigne+2][numColonne+4] + "." + tabBataille[numLigne+2][numColonne+5] + "." + tabBataille[numLigne+2][numColonne+6] + "." + tabBataille[numLigne+2][numColonne+7] + "." + tabBataille[numLigne+2][numColonne+8]);

        System.out.println(tabBataille[numLigne+3][numColonne-1] + "." + tabBataille[numLigne+3][numColonne] + "." + tabBataille[numLigne+3][numColonne+1] + "." + tabBataille[numLigne+3][numColonne+2] + "." + tabBataille[numLigne+3][numColonne+3] + "." + tabBataille[numLigne+3][numColonne+4] + "." + tabBataille[numLigne+3][numColonne+5] + "." + tabBataille[numLigne+3][numColonne+6] + "." + tabBataille[numLigne+3][numColonne+7] + "." + tabBataille[numLigne+3][numColonne+8]);

        System.out.println(tabBataille[numLigne+3][numColonne-1] + "." + tabBataille[numLigne+3][numColonne] + "." + tabBataille[numLigne+3][numColonne+1] + "." + tabBataille[numLigne+3][numColonne+2] + "." + tabBataille[numLigne+4][numColonne+3] + "." + tabBataille[numLigne+4][numColonne+4] + "." + tabBataille[numLigne+4][numColonne+5] + "." + tabBataille[numLigne+4][numColonne+6] + "." + tabBataille[numLigne+4][numColonne+7] + "." + tabBataille[numLigne+4][numColonne+8]);
        
        System.out.println(tabBataille[numLigne+3][numColonne-1] + "." + tabBataille[numLigne+3][numColonne] + "." + tabBataille[numLigne+3][numColonne+1] + "." + tabBataille[numLigne+3][numColonne+2] + "." + tabBataille[numLigne+5][numColonne+3] + "." + tabBataille[numLigne+5][numColonne+4] + "." + tabBataille[numLigne+5][numColonne+5] + "." + tabBataille[numLigne+5][numColonne+6] + "." + tabBataille[numLigne+5][numColonne+7] + "." + tabBataille[numLigne+5][numColonne+8]);
        
        monScan.close();
    }
}