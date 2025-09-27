import java.util.Base64;

public class Activity3 {
    public static final String PASSWORD = "ZW1mNQo=";
    public static final char[] CHARACTERS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z','\n' };
    public static final int MAXCHAR = 5;

    public static void main(String[] args) {

        /*
         * à faire : afficher le mot de passe trouvé avec un sout
         * Le mot de passe contient exactement entre 0 et 5 caractères
         * Pour tester si un mot de passe est correct, il faut appeler la méthode
         * testPassword en lui donnant en paramètre le password à tester
         */
        String motsDePasse;
        boolean teste = false;
        while (teste == false) {
            for (int i = 0; i < CHARACTERS.length; i++) {
                motsDePasse = "" + CHARACTERS[i];
                teste = testPassword(motsDePasse);
                if (teste == true) {
                    System.out.println(motsDePasse);
                    break;
                }
            }
            for (int i = 0; i < CHARACTERS.length; i++) {
                for (int j = 0; j < CHARACTERS.length; j++) {
                    motsDePasse = "" + CHARACTERS[i] + CHARACTERS[j];
                    teste = testPassword(motsDePasse);
                    if (teste == true) {
                        System.out.println(motsDePasse);
                        break;
                    }
                }
            }
            for (int i = 0; i < CHARACTERS.length; i++) {
                for (int j = 0; j < CHARACTERS.length; j++) {
                    for (int j2 = 0; j2 < CHARACTERS.length; j2++) {
                        motsDePasse = "" + CHARACTERS[i] + CHARACTERS[j] + CHARACTERS[j2];
                        teste = testPassword(motsDePasse);
                        if (teste == true) {
                            System.out.println(motsDePasse);
                            teste = true;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < CHARACTERS.length; i++) {
                for (int j = 0; j < CHARACTERS.length; j++) {
                    for (int j2 = 0; j2 < CHARACTERS.length; j2++) {
                        for (int k = 0; k < CHARACTERS.length; k++) {
                            motsDePasse = "" + CHARACTERS[i] + CHARACTERS[j] + CHARACTERS[j2] + CHARACTERS[k];
                            if (CHARACTERS[i]=='e' && CHARACTERS[j]=='m'&& CHARACTERS[j2]=='f') {
                               // System.out.println(motsDePasse);
                            }
                            teste = testPassword(motsDePasse);
                            if (teste == true) {
                                teste = true;
                                System.out.println(motsDePasse);
                                break;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < CHARACTERS.length; i++) {
                for (int j = 0; j < CHARACTERS.length; j++) {
                    for (int j2 = 0; j2 < CHARACTERS.length; j2++) {
                        for (int k = 0; k < CHARACTERS.length; k++) {
                            for (int k2 = 0; k2 < CHARACTERS.length; k2++) {
                                motsDePasse = "" + CHARACTERS[i] + CHARACTERS[j] + CHARACTERS[j2] + CHARACTERS[k] +CHARACTERS[k2];
                                teste = testPassword(motsDePasse);
                                if (teste == true) {
                                    teste = true;
                                    System.out.println(motsDePasse);
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            }
        }
    

    public static boolean testPassword(String password) {
        boolean retour = false;
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);
        if (password.equals(decodedPwd)) {
            retour = true;
        }

        return retour;
    }
}

