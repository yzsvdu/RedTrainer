/*  1 */
package f;

public final class XF extends Wr {
    public pA nv0;
    public gp0 WT;
    public final Ip CoM2;
    public int gM;
    public dQ AE;
    public vF0 Ml;
    public Ro0 bh0;
    public dQ XC;
    public dQ fq0;

    private void SA(nv0 paramnv0) {
        gp0 gp01;
        if ((gp01 = this.WT) != null) {
            byte b1 = (byte) (paramnv0.ik0 + 1), b2 = (byte) gp01.Tc;
            pA pA1;
            /*    */
            XF xF;
            /*  3 */
            if ((xF = (pA1 = this.nv0).er0) != null) {
                xF
/*  4 */.ra0();
                pA1.er0 = null;
            }
            /*  5 */
            km.u4.N7(this.ij0, new byte[]{b1, b2});
        }
    }

    public dQ C1;
    public dQ YV;
    public nv0[] uG0;
    public Px0 aUx;
    public final j40 G20;
    public byte ij0;
    public mc[] oK0;
    public rS Ce0;
    public final Un x1;

    public XF(pA parampA, Px0 paramPx0, byte paramByte, j40 paramj40, short[] paramArrayOfshort) {
        pRn pRn;
        Ip ip2;
        dQ dQ1;
        Ip ip1;
        dQ dQ2;
        vF0 vF01;
        dQ dQ3;
        dQ dQ4;
        dQ dQ5;
        ArrayList<nv0> arrayList;
        dQ dQ6;
        dQ dQ7;
        Ip ip3;
        this.gM = -1;
        this.nv0 = parampA;
        this.ij0 = paramByte;
        this.G20 = paramj40;
        this.aUx = paramPx0;
        TG0(new IO(this));
        this((byte) -1, (byte) -1, (byte) -1, (byte) -1);
        Vo0(new I(this, pRn));
        Xu("movetutor");
        if (paramPx0 == Px0.Rc0 || paramPx0 == Px0.py) {
            Lo(Ml0.OH0(1933));
        } else {
            Lo(Ml0.OH0(1932));
        }
        EP(1);
        jJ0(false);
        this();
        this.CoM2 = ip2;
        this();
        cr0 cr0 = (new Ip()).d7();
        g0 g0 = (new Ip()).mE0();
        this();
        for (byte b2 = 0; b2 < paramArrayOfshort.length; b2++) {
            boolean bool = true;
            short s;
            if ((s = paramArrayOfshort[b2]) < 1 && s != 0) {
                bool = false;
                s = (short) (s * -1);
            }
            arrayList.add(new nv0(yk0.cw().mP(s), bool, b2));
        }
        Collections.sort(arrayList);
        nv0[] arrayOfNv01 = arrayList.toArray(new nv0[0]);
        this.oK0 = new mc[arrayOfNv01.length];
        nv0[] arrayOfNv02;
        for (byte b1 = 0; b1 < (arrayOfNv02 = this.uG0).length; b1++) {
            mc mc1;
            this(nv01.rd0.cW(), "");
            nv0 nv01;
            if (!(nv01 = arrayOfNv02[b1]).v10) mc1.Xu("button-disabled");
            mc1.tW(new U80(this, nv01, b1));
            this.oK0[b1] = mc1;
        }
        cr0.Mg((JG0[]) this.oK0);
        g0.Mg((JG0[]) this.oK0);
        ip2.WN(cr0);
        ip2.rK0(g0);
        (this.Ce0 = new rS()).zG0(2);
        this.Ce0.Gz0(ip2);
        this.Ce0.lpt5();
        this(Ml0.OH0(1854));
        (this.AE = new dQ()).Xu("label-value");
        this(Ml0.OH0(1855));
        this(140, 28);
        this.Ml = new vF0();
        vF01.ZH0().zT(5, 8);
        this.Ml.Xu("label-value-type");
        this(Ml0.OH0(1856));
        (this.bh0 = new Ro0()).Xu("label-value");
        this(Ml0.OH0(1850));
        (this.XC = new dQ()).Xu("label-value");
        this(Ml0.OH0(1851));
        (this.C1 = new dQ()).Xu("label-value");
        this(Ml0.OH0(1852));
        (this.fq0 = new dQ()).Xu("label-value");
        this(Ml0.OH0(1853));
        (this.YV = new dQ()).Xu("label-value");
        this();
        arrayOfU901[0] = ip3.vo0(new JG0[]{dQ1, this.AE});
        arrayOfU901[1] = ip3.vo0(new JG0[]{dQ3, this.bh0});
        arrayOfU901[2] = ip3.vo0(new JG0[]{dQ2, this.Ml});
        arrayOfU901[3] = ip3.vo0(new JG0[]{dQ4, this.XC});
        arrayOfU901[4] = ip3.vo0(new JG0[]{dQ5, this.C1});
        U90[] arrayOfU901;
        (arrayOfU901 = new U90[6])[5] = ip3.vo0(new JG0[]{dQ6, this.fq0});
        U90 u902 = (new Ip()).mE0().cOM8(new U90[6]);
        arrayOfU902[0] = ip3.AUX(new JG0[]{dQ1, this.AE});
        arrayOfU902[1] = ip3.AUX(new JG0[]{dQ3, this.bh0});
        arrayOfU902[2] = ip3.AUX(new JG0[]{dQ2, this.Ml});
        arrayOfU902[3] = ip3.AUX(new JG0[]{dQ4, this.XC});
        arrayOfU902[4] = ip3.AUX(new JG0[]{dQ5, this.C1});
        U90[] arrayOfU902;
        (arrayOfU902 = new U90[6])[5] = ip3.AUX(new JG0[]{dQ6, this.fq0});
        U90 u901 = (new Ip()).d7().cOM8(new U90[6]);
        if (paramPx0 != Px0.Ty) {
            arrayOfJG0[0] = dQ7;
            JG0[] arrayOfJG0;
            (arrayOfJG0 = new JG0[2])[1] = this.YV;
            U90[] arrayOfU90;
            (arrayOfU90 = new U90[1])[0] = ip3.vo0(arrayOfJG0);
            u902.cOM8(arrayOfU90);
            arrayOfJG0[0] = dQ7;
            (arrayOfJG0 = new JG0[2])[1] = this.YV;
            (arrayOfU90 = new U90[1])[0] = ip3.AUX(arrayOfJG0);
            u901.cOM8(arrayOfU90);
        }
        ip3.rK0(u902);
        ip3.WN(u901);
        this(Ml0.OH0(1936));
        this.x1 = un;
        Un un;
        (un = new Un()).tW(new Sb0(this));
        this.CoM2.rK0(this.CoM2.d7().cOM8(new U90[]{this.CoM2.mE0().Aq(5).Mg(new JG0[]{ip3, un})}));
        this.CoM2.WN(this.CoM2.mE0().cOM8(new U90[]{this.CoM2.d7().Mg(new JG0[]{ip3, un})}));
        this();
        (new Ip()).rK0((new Ip()).d7().cOM8(new U90[]{ip1.mE0().ee0(ip1.mE0().Mg(new JG0[]{this.Ce0})), ip1.d7().Mg(new JG0[]{this.CoM2})}));
        (new Ip()).WN((new Ip()).mE0().cOM8(new U90[]{ip1.d7().ee0(ip1.d7().Mg(new JG0[]{this.Ce0})), ip1.mE0().Mg(new JG0[]{this.CoM2})}));
        J8(new Ip());
    }

    public final void Vn0() { // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield gM : I
        /*    */     //   4: dup
        /*    */     //   5: istore_1
        /*    */     //   6: iflt -> 94
        /*    */     //   9: iload_1
        /*    */     //   10: aload_0
        /*    */     //   11: getfield uG0 : [Lf/nv0;
        /*    */     //   14: dup
        /*    */     //   15: astore_2
        /*    */     //   16: arraylength
        /*    */     //   17: if_icmplt -> 23
        /*    */     //   20: goto -> 94
        /*    */     //   23: aload_0
        /*    */     //   24: dup
        /*    */     //   25: dup
        /*    */     //   26: aload_2
        /*    */     //   27: iload_1
        /*    */     //   28: aaload
        /*    */     //   29: astore_1
        /*    */     //   30: new f/gp0
        /*    */     //   33: dup
        /*    */     //   34: aload_0
        /*    */     //   35: swap
        /*    */     //   36: dup
        /*    */     //   37: aload_0
        /*    */     //   38: aload_1
        /*    */     //   39: aload_0
        /*    */     //   40: dup
        /*    */     //   41: getfield G20 : Lf/j40;
        /*    */     //   44: astore_1
        /*    */     //   45: getfield uG0 : [Lf/nv0;
        /*    */     //   48: aload_0
        /*    */     //   49: getfield gM : I
        /*    */     //   52: aaload
        /*    */     //   53: getfield rd0 : Lf/WD;
        /*    */     //   56: getfield HA : S
        /*    */     //   59: istore_0
        /*    */     //   60: <illegal opcode> run : (Lf/XF;Lf/nv0;)Ljava/lang/Runnable;
        /*    */     //   65: astore_2
        /*    */     //   66: aload_1
        /*    */     //   67: iload_0
        /*    */     //   68: aload_2
        /*    */     //   69: invokespecial <init> : (Lf/j40;SLjava/lang/Runnable;)V
        /*    */     //   72: putfield WT : Lf/gp0;
        /*    */     //   75: ldc_w 'monster-panel'
        /*    */     //   78: invokevirtual Xu : (Ljava/lang/String;)V
        /*    */     //   81: getfield WT : Lf/gp0;
        /*    */     //   84: astore_0
        /*    */     //   85: invokevirtual Ub : ()I
        /*    */     //   88: aload_0
        /*    */     //   89: swap
        /*    */     //   90: invokevirtual si : (Lf/JG0;I)V
        /*    */     //   93: return
        /*    */     //   94: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 56
        /*    */     //   #2	-> 60
        /*  5 */     //   #3	-> 85 } public final void LM(throws paramthrows) { this.Ce0.yl = dH.TB; } public final void d40() { uh0(500, 335); gp0 gp01; if ((gp01 = this.WT) != null) gp01.Tm(300, 325);  this.Ce0.RI(32767, 400); super.d40(); } public final boolean jf0(JG0 paramJG0) { if (paramJG0 == this.WT) this.WT = null;  return super.jf0(paramJG0); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) return Op(paramoa0.GG0);  return super.i2(paramoa0); } public final boolean Op(int paramInt) { gp0 gp01; if ((gp01 = this.WT) != null) { int i; if ((i = gp01.Tc + 2) < 4) gp01.Tc = i;  VA0.c90(gp01.J6[gp01.Tc]); if ((i = gp01.Tc) > 1) gp01.Tc = i - 2;  VA0.c90(gp01.J6[gp01.Tc]); if ((i = gp01.Tc) > 0 && i % 2 == 1) gp01.Tc = i - 1;  VA0.c90(gp01.J6[gp01.Tc]); if ((i = gp01.Tc) < 4 && i % 2 == 0) gp01.Tc = i + 1;  VA0.c90(gp01.J6[gp01.Tc]); hm.Fz0((gp01.J6[gp01.Tc]).TG0.oh0); gp01.Tc = -1;
        /*    */
        /*    */
        /*  8 */
        hm.Fz0(gp01.Vz0.TG0.oh0);
        if (h1.J20(paramInt, BM.N70) ? true : (h1.J20(paramInt, BM.ni) ? true : (h1.J20(paramInt, BM.Oq) ? true : (h1.J20(paramInt, BM.M8) ? true : (h1.J20(paramInt, BM.bC) ? true : (h1.J20(paramInt, BM.lc)))))))
            return true;
    }
    /*  9 */      if(h1.J20(paramInt,BM.N70))

    {
        mc[] arrayOfMc;
        if ((paramInt = this.gM + 1) < (arrayOfMc = this.oK0).length) this.gM = paramInt;
        if ((paramInt = this.gM) >= 0 && paramInt < arrayOfMc.length) {
            VA0.c90(arrayOfMc[paramInt]);
            /*    */
            /*    */
            /* 12 */
            hm.Fz0((this.oK0[this.gM]).TG0.oh0);
            /* 13 */
            this.Ce0.ai(this.oK0[this.gM]);
        }
        return true;
    }  if(h1.J20(paramInt,BM.ni))

    {
        if ((paramInt = this.gM) > 0) this.gM = paramInt - 1;
        mc[] arrayOfMc;
        if ((paramInt = this.gM) >= 0 && paramInt < (arrayOfMc = this.oK0).length) {
            VA0.c90(arrayOfMc[paramInt]);
            /*    */
            /*    */
            /* 16 */
            hm.Fz0((this.oK0[this.gM]).TG0.oh0);
            /* 17 */
            this.Ce0.ai(this.oK0[this.gM]);
        }
        return true;
    }  if(h1.J20(paramInt,BM.bC))

    {
        Vn0();
        return true;
    }  if(h1.J20(paramInt,BM.lc))

    {
        paramInt = -1;
        byte b = -1;
        pA pA1;
        /*    */
        XF xF;
        /* 19 */
        if ((xF = (pA1 = this.nv0).er0) != null) {
            xF
/* 20 */.ra0();
            pA1.er0 = null;
        }
        /* 21 */
        km.u4.N7(this.ij0, new byte[]{paramInt, b});
        return true;
    }  return false;
}
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */