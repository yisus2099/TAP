package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cTC, cTL, cTI;
        double x1, x2, pru;
        Scanner ent = new Scanner(System.in);
        cTC = ent.nextInt();
        cTL = ent.nextInt();
        cTI = ent.nextInt();
        pru = Math.pow(cTL, 2) - (4 * cTC * cTI);
        if (pru < 0) {
            x1=0;
            x2=0;
        } else {
            x1 = (-cTL + Math.sqrt(pru)) / 2 * cTC;
            System.out.println(x1);
            x2 =( -cTL - Math.sqrt(pru)) / 2* cTC;
            System.out.println(x2);

        }

    }

}
