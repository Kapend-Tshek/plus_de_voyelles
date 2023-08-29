import java.util.Scanner;


public class Tableaux {

    public static void main( String[] args){

        Scanner scanner = new Scanner(System.in);

        int mot;

        // Demander a l'utilisateur combien de mot il veux saisir

        System.out.println("Combien de mot voulez vous saisir ?");
        mot = scanner.nextInt();

        // Creer un tableau de mot

        String[] mots = new String[mot];

        // Remplir le tableau de mot

        int[] voyelles = new int[mot];

        for (int i = 0; i < mots.length; i++) {
            System.out.println("Veuillez saisir un mot : ");
            mots[i] = scanner.next();
            mots[i] = mots[i].toLowerCase();
            voyelles[i] = 0;
            for (int j = 0; j < mots[i].length(); j++) {
                if (mots[i].charAt(j) == 'a' || mots[i].charAt(j) == 'e' || mots[i].charAt(j) == 'i' || mots[i].charAt(j) == 'o' || mots[i].charAt(j) == 'u' || mots[i].charAt(j) == 'y') {
                    voyelles[i]++;
                }
            }
        }

        // Trouver le mot avec le plus de voyelles

        int max = 0;
        for (int i = 0; i < voyelles.length; i++) {
            if (voyelles[i] > max) {
                max = voyelles[i];
            }
        }

        // Afficher le(s) mot(s) avec le plus de voyelles

        System.out.println("Le(s) mot(s) avec le plus de voyelles est(sont) : ");
        for (int i = 0; i < voyelles.length; i++) {
            if (voyelles[i] == max) {
                System.out.println(mots[i]);
            }
        }

        // Fermer le scanner

        scanner.close();

    }
    
} 
