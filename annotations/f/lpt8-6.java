/*  1 */
package f;

public final class lpt8 extends dQ {
    public boolean o8;

    public lpt8(W1 paramW1, Sa0 paramSa0) {
        super(paramSa0);
        MB0();
        xL0();
        Xu("display");
    }

    public final int tJ0() {
        int i = super.tJ0();
        pe pe;
        if ((pe = this.Cq) != null)
            /*  2 */ i = Math.max(i, ((t90) pe).getLineHeight());
        return i;
    }

    public final String TI() {
        return "comboboxlabel";
    }

    public final int R80() {
        this.gj.getClass();
        return super.R80();
    }

    public final boolean i2(oa0 paramoa0) {
        int i;
        if (B8.Pg(i = paramoa0.cz0)) {
            if (i != 7) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != this
                    /*  3 */.o8) {
                boolean bool;
                this.o8 = i;
                W1 w1;
                /*  4 */
                Sa0 sa0 = (w1 = this.gj).O;
                /*  5 */
                Ll ll = Ap.b00;
                if (this.gj.xy0.o8 || (
                        /*    */
                        /*  7 */           ((w1.lPT8.TG0.hm0 & 0x1) != 0))) {
                    bool = true;
                } else {
                    bool = false;
                }
                sa0
/*  8 */.gf0(ll, bool);
            }
            if (paramoa0
                    /*  9 */.cz0 == 5) this
/* 10 */.gj.ix();
            if (paramoa0
                    /* 11 */.cz0 == 3 && paramoa0
                    /* 12 */.vl == 1) this
/* 13 */.gj.getClass();
            return
                    /* 14 */         (paramoa0.cz0 != 8);
        }
        return false;
    }
    /*    */
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lpt8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */