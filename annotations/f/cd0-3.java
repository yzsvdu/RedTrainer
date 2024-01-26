/*  1 */
package f;

public final class cd0 extends Ij {
    public static void NW() {
        boolean bool;
        Hk hk;
        (hk = km.q00).getClass();
        lPT9[] arrayOfLPT9;
        int j;
        byte b;
        for (j = (arrayOfLPT9 = lPT9.AUX).length, b = 0; b < j; ) {
            lPT9 lPT9 = arrayOfLPT9[b];
            /*    */
            Ut0 ut0;
            /*  3 */
            (ut0 = hk.hG0[lPT9.nV]).getClass();
            /*    */
            /*  5 */
            for (Iterator iterator = (new mt(ut0)).iterator(); ((DA0) iterator).hasNext(); ) {
                for (k = (arrayOfPe0 = (pe0[]) ((iF0) iterator).AUX()).length, b1 = 0; b1 < k; ) {
                    (arrayOfPe0[b1])
/*  6 */.G3
/*  7 */.dispose();
                    b1++;
                }
            }
            hk.hG0[lPT9
                    /*  8 */.nV] =
                    /*  9 */         new Ut0();
            b++;
        }
        for (j = (arrayOfLPT9 = lPT9.AUX).length, b = 0; b < j; ) {
            byte b1;
            for (lPT9 lPT9 = arrayOfLPT9[b]; b1 < 5; ) {
                for (byte b2 = 0; b2 < 52; )
                    /*    */ {
                    pe0 pe0;
                    /* 11 */
                    if ((pe0 = hk.RW[lPT9.nV][b1][b2]) != null) pe0
/* 12 */.G3
/* 13 */.dispose();
                    b2++;
                }
                b1 = (byte) (b1 + 1);
            }
            b++;
        }
        Vp0[] arrayOfVp0;
        for (int i = (arrayOfVp0 = Vp0.Jo).length; j < i; ) {
            ArrayList<wc> arrayList;
            this();
            Vp0 vp0;
            qw0 qw0;
            /* 14 */
            (qw0 = (vp0 = arrayOfVp0[j]).aU)
/* 15 */.getClass();
            /*    */
            /* 17 */
            for (Iterator iterator = (new iL(qw0)).iterator(); ((DA0) iterator).hasNext(); ) {
                wc wc1 = (wc) ((Ke) iterator).q00();
                byte b1 = 0;
                while (b1 < wc1
                        /* 18 */.Mv.length)
                    /* 19 */ {
                    X9[] arrayOfX9;
                    for (byte b2 = 0; b2 < (arrayOfX9 = wc1.Mv[b1]).length; ) {
                        X9 x9;
                        if ((x9 = arrayOfX9[b2]) != null) {
                            byte b3 = 0;
                            Gh0[] arrayOfGh0;
                            while (b3 < (
                                    /* 20 */                 arrayOfGh0 = x9.ls).length) {
                                arrayOfGh0[b3].gy();
                                x9.ls[b3] = null;
                                b3++;
                            }
                            x9.N5 = null;
                        }
                        b2++;
                    }
                    b1++;
                }
                arrayList
/* 21 */.add(wc1);
            }
            for (wc wc1 : arrayList)
                /*    */ {
                int k;
                /*    */
                qw0 qw01;
                /* 24 */
                if ((k = (qw01 = vp0.aU).kc0(wc1.Lk)) >= 0) {
                    qw01
                            /* 25 */.TH0[k];
                    qw01.Id(k);
                }
            }
            j++;
        }
        /*    */
        /*    */
        /* 28 */
        try {
            bool = GF0.g6(UB0.vj0.aP("data/sprites/addons.pak").fg0(FileChannel.MapMode.READ_ONLY).order(ByteOrder.LITTLE_ENDIAN));
        } catch (Exception exception) {
            GF0.Et.error("", exception);
            bool = false;
        }
        if (!bool ||
                /* 29 */       !(km.q00 = new Hk()).bg())
            /* 30 */ js.vu0
/* 31 */.Pu(-1, "error during reload");
    }

    /*    */
    /*    */
    /*    */   public Dn0 gA;
    /*    */   public Ip Sb0;
    /*    */   public Ip sx0;
    /*    */   public Ip Q40;
    /*    */   public dQ[] Uv;
    /*    */   public Fy0[] I20;
    /*    */   public Q20[] NM;
    /*    */   public wc[] q;
    /*    */   public Vp0 Q4;
    /*    */   public eJ0 xZ;
    /*    */   public f40 dv;
    /*    */   public dQ ie0;
    /*    */   public Q20 zc;
    /*    */   public ge0 Qy0;
    /*    */   public Un TE;
    /*    */   public Un static;
    /*    */   public byte OU;

    /*    */
    /*    */
    public cd0(wc[] paramArrayOfwc) {
        /*    */
        Q20 q203;
        /*    */
        rS rS;
        /*    */
        Ip ip;
        /*    */
        Un un1;
        /*    */
        Un un2;
        /*    */
        this.OU = 0;
        /*    */
        eJ0 eJ01 = new eJ0();
        /*    */
        this(arrayOfVp0.length);
        /*    */
        this.xZ = eJ01;
        /*    */
        this.q = paramArrayOfwc;
        /*    */
        TG0(new mU(this));
        /*    */
        Xu("wardrobe");
        /*    */
        Lo(Ml0.OH0(3204));
        /*    */
        EP(1);
        /*    */
        (this.gA = new Dn0(this, km.a3.wQ())).gT(3);
        /*    */
        this.Sb0 = new Ip();
        /*    */
        this.Uv = new dQ[arrayOfVp0.length];
        /*    */
        this.I20 = new Fy0[arrayOfVp0.length];
        /*    */
        this.NM = new Q20[arrayOfVp0.length];
        /*    */
        this();
        /*    */
        Vp0[] arrayOfVp0;
        /*    */
        int i = (arrayOfVp0 = Vp0.Jo).length;
        /*    */
        for (byte b1 = 0; b1 < i; b1++) {
            /*    */
            this.Uv[vp0.CoM8()] = new dQ(Ml0.OH0(vp0.V00()));
            /*    */
            this("", 48, 40);
            /*    */
            fy0.Xu("addon-item-picker");
            /*    */
            this.NM[vp0.CoM8()] = new Q20();
            /*    */
            Fy0 fy0;
            /*    */
            (fy0 = new Fy0()).zY().qt(new U70[]{wm0.y8().eM0((short) 5459)});
            /*    */
            (new Fy0()).tW(new ez(this, vp0));
            /*    */
            Vp0 vp0;
            /*    */
            if ((vp0 = arrayOfVp0[b1]) == Vp0.Rj) {
                /*    */
                q203.J8(fy0);
                /*    */
                fy0.Pb0(50);
                /*    */
                fy0.Gq0(Ml0.OH0(vp0.V00()));
                /*    */
                fy0.zY().qt(new U70[]{wm0.y8().eM0((short) 5447)});
                /*    */
            } else if (vp0 == Vp0.c6) {
                /*    */
                q203.J8(fy0);
                /*    */
                fy0.Pb0(50);
                /*    */
                fy0.Gq0(Ml0.OH0(vp0.V00()));
                /*    */
                fy0.zY().qt(new U70[]{wm0.y8().eM0((short) 5450)});
                /*    */
            } else if (vp0.CoM8() < 5) {
                /*    */
                this.NM[vp0.CoM8()].J8(fy0);
                /*    */
                this.NM[vp0.CoM8()].J8(this.Uv[vp0.CoM8()]);
                /*    */
            } else {
                /*    */
                this.NM[vp0.CoM8()].J8(this.Uv[vp0.CoM8()]);
                /*    */
                this.NM[vp0.CoM8()].J8(fy0);
                /*    */
            }
            /*    */
            fy0.zY().tL(24, 24);
            /*    */
            fy0.zY().zT(8, 8);
            /*    */
            this.I20[vp0.CoM8()] = fy0;
            /*    */
        }
        /*    */
        this(2);
        /*    */
        Q20 q204;
        /*    */
        (q204 = new Q20()).J8(q203);
        /*    */
        Vp0 vp01;
        /*    */
        Vp0 vp02;
        /*    */
        Vp0 vp03;
        /*    */
        Vp0 vp04;
        /*    */
        arrayOfU901[0] = this.Sb0.d7().Ya(this.NM[(vp01 = Vp0.bG).CoM8()]).Ya(this.NM[(vp02 = Vp0.MP).CoM8()]).Ya(this.NM[(vp03 = Vp0.K7).CoM8()]).Ya(this.NM[(vp04 = Vp0.Pa0).CoM8()]);
        /*    */
        arrayOfU901[1] = this.Sb0.mE0().lW(et.F30, q204);
        /*    */
        U90[] arrayOfU901;
        /*    */
        Vp0 vp05;
        /*    */
        Vp0 vp06;
        /*    */
        Vp0 vp07;
        /*    */
        Vp0 vp08;
        /*    */
        (arrayOfU901 = new U90[3])[2] = this.Sb0.d7().Ya(this.NM[(vp05 = Vp0.Sz0).CoM8()]).Ya(this.NM[(vp06 = Vp0.rK).CoM8()]).Ya(this.NM[(vp07 = Vp0.M9).CoM8()]).Ya(this.NM[(vp08 = Vp0.CR).CoM8()]);
        /*    */
        U90 u902 = this.Sb0.mE0().cOM8(new U90[3]);
        /*    */
        Q20 q202 = this.NM[vp01.CoM8()];
        /*    */
        q202 = this.NM[vp05.CoM8()];
        /*    */
        et et1;
        /*    */
        et et2;
        /*    */
        arrayOfU902[0] = this.Sb0.d7().ee0(this.Sb0.mE0().lW(et2 = et.c5, q202).lW(et1 = et.COM2, q202));
        /*    */
        arrayOfU902[1] = this.Sb0.d7().ee0(this.Sb0.mE0().lW(et2, this.NM[vp02.CoM8()]).lW(et1, this.NM[vp06.CoM8()]));
        /*    */
        arrayOfU902[2] = this.Sb0.d7().ee0(this.Sb0.mE0().lW(et2, this.NM[vp03.CoM8()]).lW(et1, this.NM[vp07.CoM8()]));
        /*    */
        arrayOfU902[3] = this.Sb0.d7().ee0(this.Sb0.mE0().lW(et2, this.NM[vp04.CoM8()]).lW(et1, this.NM[vp08.CoM8()]));
        /*    */
        U90[] arrayOfU902;
        /*    */
        (arrayOfU902 = new U90[5])[4] = this.Sb0.AUX(new JG0[]{q204});
        /*    */
        U90 u901 = this.Sb0.mE0().cOM8(new U90[5]);
        /*    */
        this.Sb0.rK0(u901);
        /*    */
        this.Sb0.WN(u902);
        /*    */
        (this.sx0 = new Ip()).Xu("shoplayout");
        /*    */
        this.dv = new f40(this);
        /*    */
        this(this.dv);
        /*    */
        this.ie0 = new dQ(Ml0.Go(3202, "0"));
        /*    */
        this("Reload addons.pak");
        /*    */
        (new Un()).tW(cd0::Lu0);
        /*    */
        this.sx0.rK0(this.sx0.AUX(new JG0[]{rS, this.ie0, un1}));
        /*    */
        this.sx0.WN(this.sx0.vo0(new JG0[]{rS, this.ie0, un1}));
        /*    */
        (this.Q40 = new Ip()).Xu("color-dialog");
        /*    */
        cr0 cr01 = this.Q40.d7();
        /*    */
        g0 g01 = this.Q40.mE0();
        /*    */
        g0 g02 = this.Q40.mE0();
        /*    */
        cr0 cr02 = this.Q40.d7();
        /*    */
        UX[] arrayOfUX;
        /*    */
        Un[] arrayOfUn = new Un[(arrayOfUX = UX.jj).length];
        /*    */
        int j = 0;
        /*    */
        int k = UX.jj.length;
        /*    */
        for (byte b2 = 0; b2 < k; b2++) {
            /*    */
            pRn pRn;
            /*    */
            UX uX = arrayOfUX[b2];
            /*    */
            this(null, 20, 20);
            /*    */
            arrayOfUn[j] = fy0;
            /*    */
            Fy0 fy0;
            /*    */
            (fy0 = new Fy0()).Xu("color-button");
            /*    */
            arrayOfUn[j].uh0(20, 20);
            /*    */
            arrayOfUn[j].Tm(20, 20);
            /*    */
            this(uX.Lv().Jt());
            /*    */
            Un un;
            /*    */
            (un = arrayOfUn[j]).Vo0(new I(un, pRn));
            /*    */
            arrayOfUn[j].tW(new lPt2(this, uX));
            /*    */
            g02.Ya(arrayOfUn[j]);
            /*    */
            cr02.Ya(arrayOfUn[j]);
            /*    */
            if (++j % 3 == 0) {
                /*    */
                cr01.ee0(g02);
                /*    */
                g01.ee0(cr02);
                /*    */
                g02 = this.Q40.mE0();
                /*    */
                cr02 = this.Q40.d7();
                /*    */
            }
            /*    */
        }
        /*    */
        cr01.ee0(g02);
        /*    */
        g01.ee0(cr02);
        /*    */
        this("Select");
        /*    */
        (new Un()).tW(new Sx(this));
        /*    */
        this.Q40.WN(this.Q40.d7().ee0(g01).Ya(un2));
        /*    */
        this.Q40.rK0(this.Q40.mE0().ee0(cr01).Ya(un2));
        /*    */
        this.Q40.wI0(false);
        /*    */
        this();
        /*    */
        (new Ip()).rK0((new Ip()).vo0(new JG0[]{this.Sb0}).ee0(ip.AUX(new JG0[]{this.sx0, this.Q40})));
        /*    */
        (new Ip()).WN((new Ip()).AUX(new JG0[]{this.Sb0}).ee0(ip.AUX(new JG0[]{this.sx0, this.Q40})));
        /*    */
        J8(new Ip());
        /*    */
        this.Qy0 = new ge0();
        /*    */
        this.TE = new Un("<");
        /*    */
        this. static =new Un(">");
        /*    */
        this.Qy0.tW(new E0(this));
        /*    */
        this.TE.tW(new native (this));
        /*    */
        this. static.tW(new We(this));
        /*    */
        this();
        /*    */
        this.zc = q201;
        /*    */
        Q20 q201;
        /*    */
        (q201 = new Q20()).J8(this.Qy0);
        /*    */
        this.zc.J8(new dQ("Hide Hat"));
        /*    */
        J8(this.zc);
        /*    */
        J8(this.TE);
        /*    */
        J8(this. static);
        /*    */
    }

    /*    */
    /*    */
    public final void R60(throws paramthrows) {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: dup
        /*    */     //   2: aload_1
        /*    */     //   3: invokespecial R60 : (Lf/throws;)V
        /*    */     //   6: getfield OU : B
        /*    */     //   9: dup
        /*    */     //   10: istore_1
        /*    */     //   11: bipush #9
        /*    */     //   13: if_icmpge -> 90
        /*    */     //   16: aload_0
        /*    */     //   17: getfield gA : Lf/Dn0;
        /*    */     //   20: dup
        /*    */     //   21: dup
        /*    */     //   22: dup2
        /*    */     //   23: astore_2
        /*    */     //   24: aload_0
        /*    */     //   25: getfield Sb0 : Lf/Ip;
        /*    */     //   28: getfield xY : I
        /*    */     //   31: iconst_2
        /*    */     //   32: idiv
        /*    */     //   33: bipush #73
        /*    */     //   35: isub
        /*    */     //   36: dup
        /*    */     //   37: istore_0
        /*    */     //   38: bipush #60
        /*    */     //   40: istore_3
        /*    */     //   41: putfield Uq : I
        /*    */     //   44: iload_3
        /*    */     //   45: putfield Z1 : I
        /*    */     //   48: getstatic f/lPT9.U4 : Lf/lPT9;
        /*    */     //   51: putfield Ng0 : Lf/lPT9;
        /*    */     //   54: getfield wh0 : Lf/Vp0;
        /*    */     //   57: getstatic f/Vp0.c6 : Lf/Vp0;
        /*    */     //   60: if_acmpne -> 69
        /*    */     //   63: iload_1
        /*    */     //   64: bipush #6
        /*    */     //   66: iadd
        /*    */     //   67: i2b
        /*    */     //   68: istore_1
        /*    */     //   69: aload_2
        /*    */     //   70: getstatic f/Rg.Za : [[B
        /*    */     //   73: iload_1
        /*    */     //   74: aaload
        /*    */     //   75: getstatic f/Rg.VE : Lf/Pn0;
        /*    */     //   78: invokevirtual Nn0 : ()I
        /*    */     //   81: baload
        /*    */     //   82: iload_0
        /*    */     //   83: iload_3
        /*    */     //   84: invokevirtual FD0 : (BII)V
        /*    */     //   87: goto -> 208
        /*    */     //   90: iload_1
        /*    */     //   91: bipush #9
        /*    */     //   93: if_icmpne -> 125
        /*    */     //   96: aload_0
        /*    */     //   97: dup
        /*    */     //   98: getfield gA : Lf/Dn0;
        /*    */     //   101: dup
        /*    */     //   102: dup
        /*    */     //   103: astore_0
        /*    */     //   104: iconst_2
        /*    */     //   105: putfield Dd : I
        /*    */     //   108: getstatic f/lPT9.jR : Lf/lPT9;
        /*    */     //   111: putfield Ng0 : Lf/lPT9;
        /*    */     //   114: iconst_0
        /*    */     //   115: istore_1
        /*    */     //   116: getfield Sb0 : Lf/Ip;
        /*    */     //   119: getfield xY : I
        /*    */     //   122: goto -> 157
        /*    */     //   125: iload_1
        /*    */     //   126: bipush #10
        /*    */     //   128: if_icmpne -> 174
        /*    */     //   131: aload_0
        /*    */     //   132: dup
        /*    */     //   133: getfield gA : Lf/Dn0;
        /*    */     //   136: dup
        /*    */     //   137: dup
        /*    */     //   138: astore_0
        /*    */     //   139: iconst_2
        /*    */     //   140: putfield Dd : I
        /*    */     //   143: getstatic f/lPT9.jR : Lf/lPT9;
        /*    */     //   146: putfield Ng0 : Lf/lPT9;
        /*    */     //   149: iconst_1
        /*    */     //   150: istore_1
        /*    */     //   151: getfield Sb0 : Lf/Ip;
        /*    */     //   154: getfield xY : I
        /*    */     //   157: iconst_2
        /*    */     //   158: idiv
        /*    */     //   159: aload_0
        /*    */     //   160: swap
        /*    */     //   161: bipush #73
        /*    */     //   163: isub
        /*    */     //   164: iload_1
        /*    */     //   165: swap
        /*    */     //   166: bipush #60
        /*    */     //   168: invokevirtual FD0 : (BII)V
        /*    */     //   171: goto -> 208
        /*    */     //   174: aload_0
        /*    */     //   175: getfield gA : Lf/Dn0;
        /*    */     //   178: dup
        /*    */     //   179: aload_0
        /*    */     //   180: swap
        /*    */     //   181: dup
        /*    */     //   182: iconst_4
        /*    */     //   183: putfield Dd : I
        /*    */     //   186: getstatic f/lPT9.U4 : Lf/lPT9;
        /*    */     //   189: putfield Ng0 : Lf/lPT9;
        /*    */     //   192: getfield Sb0 : Lf/Ip;
        /*    */     //   195: getfield xY : I
        /*    */     //   198: iconst_2
        /*    */     //   199: idiv
        /*    */     //   200: bipush #73
        /*    */     //   202: isub
        /*    */     //   203: bipush #60
        /*    */     //   205: invokevirtual gy : (II)V
        /*    */     //   208: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 28
        /*    */     //   #2	-> 32
        /*    */     //   #3	-> 41
        /*    */     //   #4	-> 45
        /*    */     //   #5	-> 48
        /*    */     //   #6	-> 51
        /*    */     //   #7	-> 54
        /*    */     //   #8	-> 70
        /*    */     //   #9	-> 84
        /*    */     //   #10	-> 98
        /*    */     //   #11	-> 105
        /*    */     //   #12	-> 108
        /*    */     //   #13	-> 111
        /*    */     //   #14	-> 116
        /*    */     //   #15	-> 119
        /*    */     //   #16	-> 133
        /*    */     //   #17	-> 140
        /*    */     //   #18	-> 143
        /*    */     //   #19	-> 146
        /*    */     //   #20	-> 151
        /*    */     //   #21	-> 154
        /*    */     //   #22	-> 158
        /*    */     //   #23	-> 168
        /*    */     //   #24	-> 175
        /*    */     //   #25	-> 183
        /*    */     //   #26	-> 186
        /*    */     //   #27	-> 189
        /*    */     //   #28	-> 192
        /*    */     //   #29	-> 195
        /*    */     //   #30	-> 199
        /*    */
    }

    /*    */
    /*    */
    public final void d40() {
        /*    */
        super.d40();
        /*    */
        uh0(750, 300);
        /*    */
        mM();
        /*    */
        this.zc.mM();
        /*    */
        Ip ip2;
        /*    */
        int j = (ip2 = this.Sb0).Kd;
        /*    */
        this.zc.ME(this.Sb0.xY / 2 + j - this.zc.xY / 2, ip2.er0 + 10);
        /*    */
        this.TE.uh0(24, 24);
        /*    */
        this.TE.RI(24, 24);
        /*    */
        this.TE.Tm(24, 24);
        /*    */
        this.TE.mM();
        /*    */
        j = (ip2 = this.Sb0).Kd;
        /*    */
        this.TE.ME(this.Sb0.xY / 2 + j - this.TE.xY / 2 - 32, ip2.er0 + 160);
        /*    */
        this. static.uh0(24, 24);
        /*    */
        this. static.RI(24, 24);
        /*    */
        this. static.Tm(24, 24);
        /*    */
        this. static.mM();
        /*    */
        Ip ip1;
        /*    */
        int i = (ip1 = this.Sb0).Kd;
        /*    */
        this. static.ME(this.Sb0.xY / 2 + i - this. static.xY / 2 + 32, this.er0 + 160);
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cd0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */