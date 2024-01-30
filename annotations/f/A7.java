/* 1 */
package f;

public final class A7 extends Un {
    public final void R60(throws paramthrows) {
        super.R60(paramthrows);
        byte b2 = -32;
        Dn0 dn0;
        byte b1 = -32;
        this.P
                /* 2 */.Z1 = b2;
        /*   */
        Vp0 vp0;
        /* 4 */
        if ((vp0 = this.or0.Hl0) ==
                /* 5 */       Vp0.bG || vp0 == Vp0.MP || vp0 == Vp0.Pa0 || vp0 == Vp0.K7) {
            /* 6 */
            gy(b1, b2);
            /*   */
            return;
            /*   */
        }
        /*   */
        if (vp0 == Vp0.c6) {
            /*   */
            FD0((byte) 18, -32, -32);
            /*   */
        } else if (vp0 == Vp0.CR) {
            /*   */
            FD0((byte) 0, -16, -32);
            /*   */
        } else {
            /*   */
            FD0((byte) 0, -32, -32);
            /*   */
        }
    }

    /*   */
    /*   */
    /*   */   public Dn0 P;
    /*   */   public wc or0;
    /*   */   public vF0[] Q30 = new vF0[0];

    /*   */
    /*   */
    public A7(cd0 paramcd0, M9 paramM9, wc paramwc) {
        /*   */
        this.or0 = paramwc;
        /*   */
        if (paramwc.bk0() == Vp0.CR) {
            /*   */
            Xu("wardrobe-addon-item-back");
            /*   */
        } else if (this.or0.bk0() == Vp0.bG || this.or0.bk0() == Vp0.MP || this.or0.bk0() == Vp0.Pa0 || this.or0.bk0() == Vp0.K7) {
            /*   */
            Xu("wardrobe-addon-item");
            /*   */
        } else {
            /*   */
            Xu("wardrobe-addon-item-body");
            /*   */
        }
        /*   */
        this.P = new Dn0(this);
        /*   */
        Vp0 vp0;
        /*   */
        if (this.or0.bk0() != (vp0 = Vp0.MP))
            /*   */ this.P.X7((byte) 30, vp0, (short) 0);
        /*   */
        if (this.or0.bk0() != (vp0 = Vp0.K7))
            /*   */ this.P.X7((byte) 0, vp0, (short) 2);
        /*   */
        short s = this.or0.Zj();
        /*   */
        this.P.X7((byte) 3, this.or0.bk0(), s);
        /*   */
        this.P.gT(2);
        /*   */
        tW(new AA(this, paramcd0, paramM9));
        /*   */
        this.Q30 = vC0.Tn(Of.b20().On0(paramwc.uJ()));
        /*   */
        vC0.ee0(Of.b20().On0(paramwc.uJ()));
        /*   */
        vF0[] arrayOfVF0;
        /*   */
        int i = (arrayOfVF0 = this.Q30).length;
        /*   */
        for (byte b = 0; b < i; b++)
            /*   */
            J8(arrayOfVF0[b]);
        /*   */
    }

    /*   */
    /*   */
    public final void d40() {
        /*   */
        vF0[] arrayOfVF0;
        /*   */
        for (byte b = 0; b < (arrayOfVF0 = this.Q30).length; ) {
            /*   */
            int i = this.Kd + 4;
            /*   */
            arrayOfVF0[b].ME(b * 16 + i, yR() - 20);
            /*   */
            b++;
            /*   */
        }
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/A7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */