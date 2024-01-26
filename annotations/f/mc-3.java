/*  1 */
package f;

public class mc extends Un {
    public CharSequence cOM9;
    public pe KH;
    public GE MM;
    public boolean Im0;
    public boolean Gp;
    public int aH;
    public int ga;
    public et zQ;
    public JG0 q90;
    public rH hC0;
    public rH c30;

    public mc(String paramString1, String paramString2) {
        super(paramString1);
        rH rH1;
        this.Im0 = true;
        this.aH = -1;
        this.zQ = null;
        this(this);
        this.hC0 = rH1;
        this(this);
        this.c30 = rH1;
        Ep0(paramString2);
        Xu("battlebutton");
    }

    public final rH CW() {
        return this.hC0;
    }

    public final void Ep0(String paramString) {
        byte b;
        if (paramString == null)
            /*  2 */ {
            MF.u10();
            this.cOM9 = paramString;
            this.aH = -1;
            /*  3 */
            b = 0;
            int i;
            if ((i = (paramString = "").length()) > 0) {
                byte b1;
                for (b = 1, b1 = 0; b1 < i; ) {
                    if (paramString.charAt(b1) == '\n') b++;
                    b1++;
                }
                /*    */
            }
            /*    */
        }
        /*    */
        else
            /*  7 */ {
            MF.u10();
            this.cOM9 = paramString;
            this.aH = -1;
            /*  8 */
            b = 0;
            int i;
            if ((i = paramString.length()) > 0) {
                b = 1;
                byte b1 = 0;
                while (true) {
                    if (b1 < i) {
                        if (paramString.charAt(b1) == '\n') b++;
                        b1++;
                        continue;
                    }
                    this.ga = b;
                    this.Gp = true;
                    this.O.Ym0(Ap.x2);
                    break;
                }
                /*  9 */
                MJ0();
                return;
            }
        }
        this.ga = b;
        this.Gp = true;
        this.O.Ym0(Ap.x2);
        break;
    }

    public final void eQ() {
        ia(0.0D, null, false);
    }

    /*    */
    public final void ia(double paramDouble, YB0 paramYB0, boolean paramBoolean) {
        boolean bool;
        if (this.q90 == null) {
            JG0 jG0;
            this();
            this.q90 = jG0;
            si(jG0, Ub());
        }
        JG0 jG02 = this.q90;
        if (paramYB0 != null) {
            bool = true;
        } else {
            bool = false;
        }
        /* 11 */
        jG02.wI0(bool);
        JG0 jG01 = this.q90;
        jG01 = ((mc) super).q90;
        jG01 = ((mc) super).q90;
        jG01 = ((mc) super).q90;
        /*    */
        /*    */
        /* 14 */
        jG01 = ((mc) super).q90;
        /*    */
        /*    */
        /* 17 */
        jG01 = ((mc) super).q90;
        String str;
        if ((paramYB0 == YB0.l9) ? (str = "eff-status").equals(this.cl) : ((str < 0.001D) ? (str = "eff-i").equals(this.cl) : (paramBoolean ? (str = "eff-e").equals(this.cl) : ((str < 1.0D) ? (str = "eff-nve").equals(this.cl) : ((str < 2.0D) ? (str = "eff-e").equals(this.cl) : (str = "eff-se")
/*    */
/* 19 */.equals(this.cl)))))) {
            Xu(str);
            cZ();
        }
    }

    public final void J00(throws paramthrows) {
        Lp(this.O);
        Sa0 sa0 = this.O;
        if (this.Gp) {
            this.Gp = false;
            pe pe1;
            if (this.Im0 && NK() && (pe1 = this.KH) != null) {
                if (this.MM == null) this.MM = ((t90) pe1).getFont().ag0();
                if (this.ga > 1) {
                    GE gE = this.MM;
                    CharSequence charSequence = this.cOM9;
                    t90 t90;
                    int i = (t90 = (t90) this.KH).computeMultiLineTextWidth(charSequence);
                    et et1;
                    if ((et1 = this.zQ) == null) et1 = this.d0;
                    Mo mo = et1.tk0;
                    this.aH = (int) (t90.cacheMultiLineText(gE, charSequence, i, mo)).e20;
                } else {
                    pe1 = this.KH;
                    GE gE = this.MM;
                    CharSequence charSequence = this.cOM9;
                    this.aH = (int) (((t90) pe1).cacheText(gE, charSequence)).e20;
                }
            } else {
                jA0();
            }
        }
        if (NK() && this.KH != null) {
            int i = RS();
            et et1;
            if ((et1 = this.zQ) == null) et1 = this.d0;
            byte b1;
            if ((b1 = et1.aN) > 0) {
                byte b;
                int k = qF();
                pe pe1;
                if ((pe1 = this.KH) != null) {
                    if (this.aH == -1 || this.Gp) {
                        CharSequence charSequence;
                        if (this.ga > 1) {
                            charSequence = this.cOM9;
                            this.aH = ((t90) pe1).computeMultiLineTextWidth(charSequence);
                        } else {
                            charSequence = this.cOM9;
                            this.aH = ((t90) charSequence).computeTextWidth(charSequence);
                        }
                    }
                    b = this.aH;
                } else {
                    b = 0;
                }
                i = (k - b) * b1 / 2 + i;
            }
            int j = e3();
            et et2;
            if ((et2 = this.zQ) == null)
                /* 20 */ et2 = this.d0;
            byte b2;
            /* 21 */
            if ((b2 = et2.PO) > 0) if (this
                    /* 22 */.q90 != null) {
                byte b;
                int k = Hy();
                if (this
                        /* 23 */.KH != null) {
                    float f = Math.max(1, this.ga);
                    b = (int) (((t90) this.KH).getLineHeightF() * f);
                } else {
                    b = 0;
                }
                /* 24 */
                j = (k - b) * b2 / 2 + j + 4;
            } else {
                byte b;
                int k = Hy();
                if (this
                        /* 25 */.KH != null) {
                    float f = Math.max(1, this.ga);
                    b = (int) (((t90) this.KH).getLineHeightF() * f);
                } else {
                    b = 0;
                }
                /* 26 */
                j = (k - b) * b2 / 2 + j + 12;
            }
            /* 27 */
            GE gE;
            if ((gE = this.MM) != null) {
                ((t90) this.KH).drawFromCache(gE, sa0, i, j);
            } else {
                pe pe1 = this.KH;
                CharSequence charSequence = this.cOM9;
                ((t90) this).drawText(sa0, i, j, charSequence);
            }
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    /*    */
    public final void jA0() {
        /*    */
        GE gE;
        /*    */
        if ((gE = this.MM) != null) {
            /*    */
            gE.RV();
            /*    */
            this.MM = null;
            /*    */
        }
        /*    */
        super.jA0();
        /*    */
    }

    /*    */
    /*    */
    public final void qx(nY paramnY) {
        /*    */
        super.qx(paramnY);
        /*    */
        q80 q80;
        /*    */
        this.KH = (q80 = (q80) paramnY).aa0("font2");
        /*    */
        GE gE;
        /*    */
        if ((gE = this.MM) != null) {
            /*    */
            gE.RV();
            /*    */
            this.MM = null;
            /*    */
        }
        /*    */
        String str = "textAlignment2";
        /*    */
        Enum enum_2 = this.d0;
        /*    */
        Enum enum_1;
        /*    */
        if ((enum_1 = (Enum) q80.Yz0(str, true, enum_2.getDeclaringClass(), null)) != null)
            /*    */ enum_2 = enum_1;
        /*    */
        this.zQ = (et) enum_2;
        /*    */
        this.aH = -1;
        /*    */
        if (this.Im0)
            /*    */ this.Gp = true;
        /*    */
    }

    /*    */
    /*    */
    public final void C70(et paramet) {
        /*    */
        if (this.d0 != paramet)
            /*    */ this.Gp = true;
        /*    */
        super.C70(paramet);
        /*    */
    }

    /*    */
    /*    */
    public boolean i2(oa0 paramoa0) {
        /*    */
        if (B8.Wm0(paramoa0.cz0) && paramoa0.GG0 == 66)
            /*    */ return false;
        /*    */
        return super.i2(paramoa0);
        /*    */
    }

    /*    */
    /*    */
    public void d40() {
        /*    */
        JG0 jG0;
        /*    */
        if ((jG0 = this.q90) != null) {
            /*    */
            jG0.Tm(104, 18);
            /*    */
            if (km.XU()) {
                /*    */
                this.q90.Tm(208, 36);
                /*    */
                if (this.cl.contains("right")) {
                    /*    */
                    /*    */
                } else {
                    /*    */
                    /*    */
                }
                /*    */
            } else {
                /*    */
                /*    */
            }
            /*    */
            this.q90.ME(this.Kd + 10, this.er0 + 26);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void yV(throws paramthrows) {
        /*    */
        super.yV(paramthrows);
        /*    */
        this.hC0.Iq();
        /*    */
        this.c30.Iq();
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */