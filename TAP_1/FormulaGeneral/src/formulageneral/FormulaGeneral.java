package formulageneral;

public class FormulaGeneral {

    int cTC, cTL, cTI;
    double x1, x2, pru;
     
    public int getcTC() {
        return cTC;
    }

    public void setcTC(int cTC) {
        this.cTC = cTC;
    }

    public int getcTL() {
        return cTL;
    }

    public void setcTL(int cTL) {
        this.cTL = cTL;
    }

    public int getcTI() {
        return cTI;
    }

    public void setcTI(int cTI) {
        this.cTI = cTI;
    }

    public void formulaGeneral() {
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
