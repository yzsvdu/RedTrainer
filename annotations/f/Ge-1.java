/* 1 */
package f;

public final class Ge extends hO {
    public final Ip VD0;
    public mc[] l30;
    public p30 x1;

    public final boolean RW(int paramInt) {
        mc mc1;
        if (h1.J20(paramInt, BM.M8)) {
            int j;
            if (((j = this.K) + 1) % this.YU != 0) this.K = j + 1;
        } else if (h1.J20(paramInt, BM.Oq)) {
            int j;
            if (((j = this.K) + 1) % this.YU != 1) this.K = j - 1;
        } else if (h1.J20(paramInt, BM.ni)) {
            int j;
            int k;
            if ((j = this.K) - (k = this.YU) >= 0) this.K = j - k;
        } else {
            int j;
            int k;
            if (h1.J20(paramInt, BM.N70) && (j = this.K) + (k = this.YU) < this.l30.length) this.K = j + k;
        }
        int i;
        mc[] arrayOfMc;
        if ((i = this.K) >= 0 && i < (arrayOfMc = this.l30).length) VA0.c90(arrayOfMc[i]);
        if (h1.J20(paramInt, BM.bC) && p3()) {
            if ((mc1 = this.l30[this.K]).kN)
                /*   */ {
                /*   */
                /* 4 */
                hm.Fz0(this.TG0.oh0);
            }
            return true;
        }
        /* 5 */
        if (h1.J20(paramInt, BM.lc)) C40((byte) -1);
        return true;
    }

    /* 6 */   public int K;
    public int YU;

    public Ge(byte paramByte1, short paramShort, byte paramByte2, j40 paramj40) {
        super(paramByte1, Aq.db);
        WD wD;
        this.YU = 2;
        Xu("messagebox");
        (this.VD0 = new Ip()).Xu("npc-interaction-panel");
        (new Ip()).Zf0(true);
        this.l30 = new mc[5];
        mc[] arrayOfMc2;
        for (paramByte1 = 0; paramByte1 < (arrayOfMc2 = this.l30).length; paramByte1 = (byte) (paramByte1 + 1)) {
            mc mc1;
            this("", "");
            arrayOfMc2[paramByte1] = mc1;
            this.l30[paramByte1].Xu("battle-move-button-left");
            this.l30[paramByte1].C70(et.COM2);
        }
        for (paramByte1 = 0; paramByte1 < (arrayOfMc2 = this.l30).length; paramByte1 = (byte) (paramByte1 + 1)) {
            short s;
            if (paramByte1 == 4) {
                s = paramShort;
            } else {
                s = paramj40.eC().Fp0(paramByte1);
            }
            if (s == 0) {
                this.l30[paramByte1].s6("-");
                this.l30[paramByte1].Ep0("");
                this.l30[paramByte1].sk0(false);
                this.l30[paramByte1].CW().H();
                this.l30[paramByte1].Gq0(null);
                this.l30[paramByte1].eQ();
            } else {
                this.l30[paramByte1].sk0(true);
                this.l30[paramByte1].Gq0(w50.Ii0(wD, paramj40));
                this.l30[paramByte1].Ep0(rG0.oV(wD));
                this.l30[paramByte1].s6(wD.cW());
                this.l30[paramByte1].tW(new Aux(this, paramByte2, paramByte1));
                Ht0 ht0 = (wD = yk0.cw().mP(s)).Fn(paramj40.eC());
                this.l30[paramByte1].CW().Pn(new pe0[]{ interface.ZZ().xk0(ht0.oI()) });
                this.l30[paramByte1].CW().zT(153, 10);
                this.l30[paramByte1].s6(wD.cW());
                this.l30[paramByte1].eQ();
            }
        } wD[4].sk0(false);
        (this.x1 = new p30(Ml0.OH0(53), 96, 30)).Xu("battle-button-return");
        this.x1.tW(new Md(this));
        arrayOfJG02[0] = arrayOfMc1[0];
        arrayOfJG02[1] = arrayOfMc1[1];
        JG0[] arrayOfJG02;
        mc[] arrayOfMc1;
        (arrayOfJG02 = new JG0[3])[2] = (arrayOfMc1 = this.l30)[4];
        (new U90[2])[0] = this.VD0.mE0().Mg(new JG0[3]);
        arrayOfJG02[0] = this.l30[2];
        (arrayOfJG02 = new JG0[2])[1] = this.l30[3];
        this.VD0.WN(this.VD0.d7().cOM8(new U90[]{null, this.VD0.mE0().Mg(new JG0[2])}));
        arrayOfJG01[0] = this.l30[0];
        JG0[] arrayOfJG01;
        (arrayOfJG01 = new JG0[2])[1] = this.l30[2];
        arrayOfU90[0] = this.VD0.mE0().Mg(new JG0[2]);
        arrayOfJG01[0] = this.l30[1];
        (arrayOfJG01 = new JG0[2])[1] = this.l30[3];
        arrayOfU90[1] = this.VD0.mE0().Mg(new JG0[2]);
        U90[] arrayOfU90;
        (arrayOfU90 = new U90[3])[2] = this.VD0.mE0().Mg(new JG0[]{this.l30[4]});
        this.VD0.rK0(this.VD0.d7().cOM8(new U90[3]));
        J8(this.VD0);
        J8(this.x1);
    }

    public final boolean Cs0() {
        return false;
    }

    public final void EX(nY paramnY) {
        this.VD0.Tm(km.wI0.dG(), 240);
    }

    public final void d40() {
        this.VD0.Tm(800, 115);
        int i = (km.wI0.k1() - 500) / 4;
        i = km.wI0.dG() / 2 - 400;
        this.VD0.ME(i, i + 350);090
        this.x1.mM();
        this.x1.uh0(128, 24);
        this.x1.ME(this.VD0.m40() - this.x1.xY, this.VD0.mD() - this.x1.HC);
        /* 7 */
        mM();
    }

    /*   */
    /*   */
    /*   */
    public final boolean Eq() {
        /*   */
        return false;
        /*   */
    }

    /*   */
    /*   */
    public final void SB0(int paramInt1, int paramInt2) {
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */