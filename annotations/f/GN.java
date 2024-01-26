/*  1 */
package f;

public final class GN extends Wv0 {
    public LZ oR;
    public fA0 Mn;

    public final void Ki(int paramInt) {
        fA0 fA01;
        super.Ki(paramInt);
        LZ[] arrayOfLZ;
        if ((arrayOfLZ = LZ.LPT1).length <= paramInt) return;
        LZ lZ1 = arrayOfLZ[paramInt];
        LZ lZ2;
        if ((lZ2 = this.oR) == lZ1) {
            if ((fA01 = this.Mn.xs0()) != null) {
                if (this.Mn != fA01) {
                    this.Mn = fA01;
                    /*  2 */
                    zB();
                    n70();
                }
            }
            /*  3 */
            else {
                throw new NullPointerException("order");
            }
        } else {
            if (fA01 != null) {
                if (lZ2 != fA01) {
                    this
                            /*  4 */.oR = (LZ) fA01;
                    /*  5 */
                    zB();
                    n70();
                }
                return;
            }
            /*  6 */
            throw new NullPointerException("column");
        }
    }

    /*  7 */   public CoM9 jm0;
    public wA v8;

    public GN() {
        wA wA1;
        Ve ve;
        uL uL;
        this.oR = LZ.w50;
        this.Mn = fA0.tk;
        this.jm0 = new CoM9();
        this();
        this.v8 = new wA();
        jA(this);
        this();
        ek(Un.class, this);
        this();
        ek(Q20.class, this);
        Xu("/member-table");
        Gb0(true);
        zs0();
        Pb0(0);
        zB();
    }

    public final void n70() {
        this();
        ArrayList<CD0> arrayList;
        for (CD0 cD0 : km.u4.E50) {
            CoM9 coM9;
            if ((coM9 = this.jm0) == null || coM9.kH(cD0)) arrayList.add(cD0);
        }
        Collections.sort(arrayList, this.oR.NUL);
        if (this.Mn == fA0.tk) Collections.reverse(arrayList);
        CD0[] arrayOfCD01 = arrayList.<CD0>toArray(new CD0[0]);
        wA wA1;
        CD0[] arrayOfCD02;
        if ((arrayOfCD02 = (wA1 = this.v8).JY).length > 0) in0(arrayOfCD02.length);
        this.JY = arrayOfCD01;
        i2(arrayOfCD01.length);
        /*    */
        Oc0 oc0;
        /*  9 */
        if ((oc0 = km.u4.E50)
                /* 10 */.zo) this
                /* 11 */.zo = false;
    }

    /*    */
    /*    */
    /*    */
    public final void V90(throws paramthrows) {
        /*    */
        boolean bool;
        /*    */
        super.V90(paramthrows);
        /*    */
        Oc0 oc0;
        /*    */
        if ((oc0 = km.u4.E50).zo) {
            /*    */
            oc0.zo = false;
            /*    */
            bool = true;
            /*    */
        } else {
            /*    */
            bool = false;
            /*    */
        }
        /*    */
        if (bool)
            /*    */ n70();
        /*    */
    }

    /*    */
    /*    */
    public final void zB() {
        /*    */
        int i = this.oR.ordinal();
        /*    */
        df0(i, this.Mn);
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */