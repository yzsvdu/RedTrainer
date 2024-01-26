/*  1 */
package f;

public final class WX extends dQ {
    public rH Xb0 = new rH(this);
    public Z50 bW;
    public tc k00;
    public int lj;
    public int CON;
    public int o7 = -2;
    public short jo0 = 0;
    public JG0 nP = null;
    public JG0 vS;
    public FV h9 = null;
    public VP Wx0 = null;
    public short yi = -1;
    public vF0 S10 = null;

    public WX(String paramString, tc paramtc, int paramInt) {
        super(paramString);
        Xu("nameplate");
        y00(Z50.yx0);
        this.Xb0.tL(24, 24);
        this.Xb0.zT(5, -26);
        this.k00 = paramtc;
        this.lj = paramtc.VC();
        this.CON = 0;
        ZU(paramInt);
    }

    public final void ZU(int paramInt) {
        String str;
        if (this.CON == paramInt) return;
        if (this.vS == null) {
            JG0 jG01;
            this();
            this.vS = jG01;
            si(jG01, Ub());
        }
        if (this
                /*  2 */.lj == km.a3
                /*  3 */.yD) this
/*  4 */.vS.wI0(h1.QP);
        JG0 jG0;
        if ((jG0 = this.vS)
                /*  5 */.xY < 10) jG0
/*  6 */.mM();
        this.CON = paramInt;
        switch (paramInt) {
            case 10:
                jG0 = this.vS;
                if ((str = "tag-admin")
/*    */
/*  8 */.equals(jG0.cl)) break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            /*  9 */
            case 9:
                jG0 = this.vS;
                if ((str = "tag-dev")
/*    */
/* 11 */.equals(jG0.cl))
                    /* 12 */ break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            case 8:
                jG0 = this.vS;
                if ((str = "tag-hgm")
/*    */
/* 14 */.equals(jG0.cl))
                    /* 15 */ break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            case 7:
                jG0 = this.vS;
                if ((str = "tag-sgm")
/*    */
/* 17 */.equals(jG0.cl))
                    /* 18 */ break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            case 5:
            case 6:
                jG0 = this.vS;
                if ((str = "tag-gm")
/*    */
/* 20 */.equals(jG0.cl))
                    /* 21 */ break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            case 2:
            case 3:
            case 4:
                jG0 = this.vS;
                if ((str = "tag-mod")
/*    */
/* 23 */.equals(jG0.cl))
                    /* 24 */ break;
                jG0.Xu(str);
                jG0.cZ();
                break;
            case 1:
                jG0 = this.vS;
                if ((str = "tag-cm")
/*    */
/* 26 */.equals(jG0.cl)) break;
                jG0.Xu(str);
                jG0.cZ();
                break;
        }
        this
/* 27 */.vS.mM();
        if (paramInt > 0) Xu("nameplate-staff");
    }

    public final void R60(throws paramthrows) {
        int i, j;
        if ((j = vh0.H90) != -1) {
            int k;
            if ((k = this.lj) == j) {
                j = 1;
            } else {
                j = 0;
            }
            vh0 vh01;
            if ((vh01 = km.a3) != null && vh01.yD == k) j = 1;
            if (j == 0) {
                E1("");
                return;
            }
        }
        JG0 jG0;
        if ((jG0 = this.vS) != null) jG0.ME(this.Kd - 32, this.er0 + 2);
        if ((jG0 = this.nP) != null)
            /*    */ jG0.ME(this.Kd - 22, this.er0 + 83);
        if ((jG0 = this.Wx0) != null)
            /* 29 */ jG0.ME(this.Kd - 25, this.er0 + 45);
        vh0 vh0;
        if ((jG0 = this.S10) != null && (vh0 = km.u4.Qa) != null) {
            boolean bool;
            short s1 = this.k00.HW.mm;
            short s2 = this.k00.HW.Yu0;
            short s3 = vh0.Ct.HW.mm;
            long l = (s3 - s1);
            l *= l;
            if (Math.sqrt(((vh0.Ct.HW.Yu0 - s2) * (vh0.Ct.HW.Yu0 - s2) + l)) < 9.0D) {
                bool = true;
            } else {
                bool = false;
            }
            jG0.wI0(bool);
            this.S10.ME(this.Kd - 38, this.er0 + 15);
        }
        if (this
                /* 30 */.bW == Z50.yx0 && this.jo0 < 1) return;
        if (this.lj == -1) {
            i = -10;
        } else {
            i = Td0() / 2 - 16;
        }
        if (this.jo0 > 0) {
            this.Xb0.zT(i - 38, 76);
        } else if (this.Xb0.e00() == 24) {
            this.Xb0.zT(i + 4, -26);
        } else {
            this.Xb0.zT(i - 5, 32);
        }
        this.Xb0.Iq();
    }

    /*    */
    /*    */
    /*    */
    public final void y00(Z50 paramZ50) {
        /*    */
        byte b;
        /*    */
        rH rH1;
        /*    */
        U70[] arrayOfU70;
        /*    */
        boolean bool;
        /*    */
        cC0 cC0;
        /*    */
        MF.KQ();
        /*    */
        if (this.bW == paramZ50 || paramZ50 == null)
            /*    */ return;
        /*    */
        this.Xb0.VL0 = false;
        /*    */
        switch (paramZ50.ordinal()) {
            /*    */
            default:
                /*    */
                this.Xb0.H();
                /*    */
                break;
            /*    */
            case 7:
                /*    */
                this.Xb0.Pn(new pe0[]{( interface.ZZ()).iI0 });
                /*    */
                this.Xb0.tL(24, 24);
                /*    */
                break;
            /*    */
            case 6:
                /*    */
                this.Xb0.sm(new zh0[]{(h90.Kw0()).cA[2]});
                /*    */
                this.Xb0.tL(32, 32);
                /*    */
                break;
            /*    */
            case 5:
                /*    */
                this.Xb0.sm(new zh0[]{(h90.Kw0()).cA[8]});
                /*    */
                this.Xb0.tL(32, 32);
                /*    */
                break;
            /*    */
            case 4:
                /*    */
                if ((b = km.a3.eA) == 0 || b == 1) {
                    /*    */
                    this.Xb0.sm(new zh0[]{(h90.Kw0()).cA[5]});
                    /*    */
                    this.Xb0.tL(32, 32);
                    /*    */
                }
                /*    */
                break;
            /*    */
            case 3:
                /*    */
                rH1 = this.Xb0;
                /*    */
                arrayOfU70 = new U70[1];
                /*    */
                bool = false;
                /*    */
                if ((cC0 = cC0.xK).MH0 == null)
                    /*    */ cC0.MH0 = cC0.Bv0((short) 5012);
                /*    */
                arrayOfU70[bool] = cC0.MH0;
                /*    */
                rH1.qt(arrayOfU70);
                /*    */
                this.Xb0.tL(24, 24);
                /*    */
            case 2:
                /*    */
                this.Xb0.qt(new U70[]{cC0.xK.xr0()});
                /*    */
                this.Xb0.tL(24, 24);
                /*    */
            case 1:
                /*    */
                rH1 = this.Xb0;
                /*    */
                arrayOfU70 = new U70[1];
                /*    */
                bool = false;
                /*    */
                if ((cC0 = cC0.xK).Dk == null)
                    /*    */ cC0.Dk = cC0.Bv0((short) 5004);
                /*    */
                arrayOfU70[bool] = cC0.Dk;
                /*    */
                rH1.qt(arrayOfU70);
                /*    */
                this.Xb0.tL(24, 24);
                /*    */
                this.Xb0.VL0 = true;
                /*    */
                break;
            /*    */
        }
        /*    */
        this.bW = paramZ50;
        /*    */
    }

    /*    */
    /*    */
    public final mX mA() {
        /*    */
        if (this.lj == km.a3.yD && !h1.QP)
            /*    */ return null;
        /*    */
        return this.td0;
        /*    */
    }

    /*    */
    /*    */
    public final int tJ0() {
        /*    */
        return ((t90) this.Cq).getLineHeight();
        /*    */
    }

    /*    */
    /*    */
    public final void d40() {
        /*    */
        mM();
        /*    */
        JG0 jG0;
        /*    */
        if ((jG0 = this.vS) != null)
            /*    */ mM();
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */