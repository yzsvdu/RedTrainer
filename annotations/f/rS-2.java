/*  1 */
package f;

public final class rS extends JG0 {
    public static final Ll COm9;
    public static final Ll hD;
    public static final Ll cOM6;
    public static final Ll mT;
    public static final NC0 F2;
    public final Ja Fd0;
    public final Ja PB;
    public final JG0 z9;
    public Nj JB0;
    public JG0 iR;
    public int YP;
    public db Wk;
    public db pq0;
    public db W6;
    public boolean t8;
    public boolean w30;
    public boolean mV;
    public int Sr;

    public static rS ck(JG0 paramJG0) {
        JG0 jG0;
        if ((jG0 = paramJG0.fr0) != null &&
                /*  2 */       jG0 = jG0.fr0 instanceof rS)
            /*  3 */ {
            jG0 = jG0;
            if (v3 || ((rS) jG0)
                    /*  4 */.iR == paramJG0)
                /*  5 */ return (rS) jG0;
            throw new AssertionError();
        }
        return null;
    }

    /*    */   public YG ez0;
    /*  7 */   public long Ep;
    public float VK0;
    public float Fz0;
    public float tv;
    public float tK;
    public float Ly;
    public float ze0;
    public float qs;
    public boolean EG0;
    public boolean catch;
    public boolean eK0;
    public float CL0;
    public cx0 gl;
    public float V10;
    public boolean P2;

    public rS() {
        this(null);
    }

    public rS(JG0 paramJG0) {
        cx0 cx01;
        Ja ja1;
        Ja ja2;
        this.YP = 1;
        db db1 = db.oI;
        this.pq0 = db1;
        this.W6 = db1;
        this.Ep = 0L;
        this.VK0 = 0.0F;
        this.EG0 = false;
        this.catch =true;
        this.eK0 = true;
        this.CL0 = 50.0F;
        this();
        this.gl = cx01;
        this.V10 = 1.0F;
        this.P2 = true;
        this(1);
        this.Fd0 = ja1;
        this(2);
        this.PB = ja2;
        this();
        this.z9 = jG0;
        Runnable runnable;
        ja1.XI0(runnable = this::BB0);
        ja1.wI0(true);
        ja2.XI0(this);
        ja2.wI0(true);
        JG0 jG0;
        (jG0 = new JG0()).xL0();
        (new JG0()).Xu("");
        super.si(jG0, 0);
        super.si(ja1, 1);
        super.si(ja2, 2);
        Gz0(paramJG0);
        Zf0(true);
    }

    public static Stream pz0(JG0 paramJG0) {
        return Arrays.stream(paramJG0.Li0.Uq0);
    }

    static {
        COm9 = Ll.F10("downArrowArmed");
        hD = Ll.F10("rightArrowArmed");
        cOM6 = Ll.F10("horizontalScrollbarVisible");
        mT = Ll.F10("verticalScrollbarVisible");
        Ll.F10("autoScrollUp");
        Ll.F10("autoScrollDown");
        F2 = new NC0();
    }

    public final void cF() {
        this.Ep = System.currentTimeMillis();
        float f;
        if ((f = this.VK0) > 0.0F) {
            f = UB0.M60.Qy;
            this.V10 = 0.5F;
            float f1 = f / 0.5F;
            Ja ja;
            float f3 = (ja = this.Fd0).Ny0;
            float f4 = this.PB.Ny0;
            /*  8 */
            this.eK0 = false;
            this.CL0 = 0.0F;
            this.tK = f3 = Oq.R0(this.Fz0, f1, f, f3);
            this.Ly = Oq.R0(this.tv, f1, f, f4);
            /*  9 */
            if (this.catch){
                /*    */
                /* 11 */
                int i = (int) nx0.SA0(f3, 0.0F, ja.sy);
                /* 12 */
                this.Fd0
/* 13 */.Fk0(i, true);
                /* 14 */
                if (this.eK0)
                    /*    */ {
                    float f5;
                    /*    */
                    /* 17 */
                    int j = (int) nx0.SA0(this.Ly, -(f5 = this.CL0), this.PB.sy + f5);
                }
                /*    */
                else
                    /*    */
                    /* 20 */ {
                    i = (int) nx0.SA0(this.Ly, 0.0F, this.PB.sy);
                }
                rt(i);
                /* 21 */
            }
            float f2;
            if ((f1 = this.tK) == (f3 = -(f2 = this.CL0))) this.Fz0 = 0.0F;
            if (f1 >=
                    /* 22 */         this.Fd0
                    /* 23 */.sy + f2) this
                    /* 24 */.Fz0 = 0.0F;
            if ((f1 = this.Ly) == f3) this.tv = 0.0F;
            if (f1 >=
                    /* 25 */         this.PB
                    /* 26 */.sy + f2) this
                    /* 27 */.tv = 0.0F;
            if ((this.VK0 -= f) <= 0.0F) {
                this.Fz0 = 0.0F;
                this.tv = 0.0F;
            }
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    /*    */
    public final String TI() {
        /*    */
        return "scrollpane";
        /*    */
    }

    /*    */
    /*    */
    public final void LM(throws paramthrows) {
        /*    */
        if (!this.P2)
            /*    */ return;
        /*    */
        this(new mQ(this));
        /*    */
        YG yG;
        /*    */
        this.ez0 = new YG();
        /*    */
        paramthrows.xr.K90(yG);
        /*    */
    }

    /*    */
    /*    */
    public final void ED0(throws paramthrows) {
        /*    */
        if (!this.P2)
            /*    */ return;
        /*    */
        paramthrows.xr.Sh0(this.ez0);
        /*    */
    }

    /*    */
    /*    */
    public final void Gz0(JG0 paramJG0) {
        /*    */
        if (this.iR != null) {
            /*    */
            this.z9.gx();
            /*    */
            this.iR = null;
            /*    */
        }
        /*    */
        if (paramJG0 != null) {
            /*    */
            this.iR = paramJG0;
            /*    */
            this.z9.J8(paramJG0);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void rt(int paramInt) {
        /*    */
        this.PB.Fk0(paramInt, true);
        /*    */
    }

    /*    */
    /*    */
    public final void Uo0(int paramInt1, int paramInt2, int paramInt3) {
        /*    */
        Ja ja = this.PB;
        /*    */
        if (paramInt2 <= 0) {
            /*    */
            getClass();
            /*    */
        } else {
            /*    */
            if (paramInt3 < 0)
                /*    */ paramInt3 = 0;
            /*    */
            paramInt1 += paramInt2;
            /*    */
            int i = this.Ny0;
            /*    */
            int j;
            /*    */
            if ((j = Jk((paramInt2 = Jk(paramInt1)) - paramInt3)) < i)
                /*    */ i = j;
            /*    */
            int k, m = i + (k = this.x10);
            /*    */
            if ((paramInt3 = paramInt1 + paramInt3) > m && (i = Jk(paramInt3 - k)) > j) {
                /*    */
                paramInt1 -= paramInt2;
                /*    */
                i = paramInt2 - Math.max(0, this.x10 - paramInt1) / 2;
                /*    */
            }
            /*    */
            U90(i);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void ai(JG0 paramJG0) {
        /*    */
        if (paramJG0 == null || !paramJG0.Ji0(this)) {
            /*    */
            rt(0);
            /*    */
            return;
            /*    */
        }
        /*    */
        int i = e3();
        /*    */
        int j = this.PB.Ny0;
        /*    */
        if ((i = paramJG0.e3() - i + j - Hy() / 3) < 0)
            /*    */ i = 0;
        /*    */
        rt(i);
        /*    */
    }

    /*    */
    /*    */
    public final void ey0(Predicate<JG0> paramPredicate) {
        /*    */
        JG0[] arrayOfJG0;
        /*    */
        int i;
        /*    */
        byte b;
        /*    */
        for (i = (arrayOfJG0 = (JG0[]) Arrays.<Object>stream(this.z9.Li0.Uq0).filter(Objects::nonNull).flatMap(rS::pz0).toArray(rS::kr0)).length, b = 0; b < i; ) {
            /*    */
            JG0 jG0;
            /*    */
            if (paramPredicate.test(jG0 = arrayOfJG0[b])) {
                /*    */
                ai(jG0);
                /*    */
                return;
                /*    */
            }
            /*    */
            b++;
            /*    */
        }
        /*    */
        rt(0);
        /*    */
    }

    /*    */
    /*    */
    public final int AW() {
        /*    */
        int i = super.AW(), j = Ho();
        /*    */
        if (this.YP == 2 && this.iR != null) {
            /*    */
            byte b;
            /*    */
            Ja ja;
            /*    */
            if ((ja = this.PB).dP) {
                /*    */
                b = ja.AW();
                /*    */
            } else {
                /*    */
                b = 0;
                /*    */
            }
            /*    */
            i = Math.max(i, this.iR.AW() + j + b);
            /*    */
        }
        /*    */
        return i;
        /*    */
    }

    /*    */
    /*    */
    public final int HY() {
        /*    */
        int i = super.HY(), j = Et();
        /*    */
        if (this.YP == 3 && this.iR != null) {
            /*    */
            byte b;
            /*    */
            Ja ja;
            /*    */
            if ((ja = this.Fd0).dP) {
                /*    */
                b = ja.HY();
                /*    */
            } else {
                /*    */
                b = 0;
                /*    */
            }
            /*    */
            i = Math.max(i, this.iR.HY() + j + b);
            /*    */
        }
        /*    */
        return i;
        /*    */
    }

    /*    */
    /*    */
    public final int R80() {
        /*    */
        if (this.iR != null) {
            /*    */
            int i;
            /*    */
            if ((i = Zk0.yE(this.YP)) != 1) {
                /*    */
                if (i == 2)
                    /*    */ return this.iR.J50();
                /*    */
            } else {
                /*    */
                int j = JG0.Fr(this.iR.AW(), this.iR.J50(), this.iR.W3());
                /*    */
                Ja ja;
                /*    */
                if ((ja = this.PB).dP)
                    /*    */ j = ja.AW() + j;
                /*    */
                return j;
                /*    */
            }
            /*    */
        }
        /*    */
        return 0;
        /*    */
    }

    /*    */
    /*    */
    public final int tJ0() {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield iR : Lf/JG0;
        /*    */     //   4: ifnull -> 82
        /*    */     //   7: aload_0
        /*    */     //   8: getfield YP : I
        /*    */     //   11: invokestatic yE : (I)I
        /*    */     //   14: dup
        /*    */     //   15: istore_1
        /*    */     //   16: iconst_1
        /*    */     //   17: if_icmpeq -> 74
        /*    */     //   20: iload_1
        /*    */     //   21: iconst_2
        /*    */     //   22: if_icmpeq -> 28
        /*    */     //   25: goto -> 82
        /*    */     //   28: aload_0
        /*    */     //   29: dup
        /*    */     //   30: getfield iR : Lf/JG0;
        /*    */     //   33: invokevirtual HY : ()I
        /*    */     //   36: aload_0
        /*    */     //   37: getfield iR : Lf/JG0;
        /*    */     //   40: invokevirtual tj0 : ()I
        /*    */     //   43: aload_0
        /*    */     //   44: getfield iR : Lf/JG0;
        /*    */     //   47: invokevirtual Hj : ()I
        /*    */     //   50: invokestatic Fr : (III)I
        /*    */     //   53: istore_0
        /*    */     //   54: getfield Fd0 : Lf/Ja;
        /*    */     //   57: dup
        /*    */     //   58: astore_1
        /*    */     //   59: getfield dP : Z
        /*    */     //   62: ifeq -> 72
        /*    */     //   65: aload_1
        /*    */     //   66: invokevirtual HY : ()I
        /*    */     //   69: iload_0
        /*    */     //   70: iadd
        /*    */     //   71: istore_0
        /*    */     //   72: iload_0
        /*    */     //   73: ireturn
        /*    */     //   74: aload_0
        /*    */     //   75: getfield iR : Lf/JG0;
        /*    */     //   78: invokevirtual tj0 : ()I
        /*    */     //   81: ireturn
        /*    */     //   82: iconst_0
        /*    */     //   83: ireturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 59
        /*    */     //   #2	-> 66
        /*    */     //   #3	-> 75
        /*    */
    }

    /*    */
    /*    */
    public final void si(JG0 paramJG0, int paramInt) {
        /*    */
        throw new UnsupportedOperationException("use setContent");
        /*    */
    }

    /*    */
    /*    */
    public final void gx() {
        /*    */
        Gz0(null);
        /*    */
    }

    /*    */
    /*    */
    public final JG0 fG0(int paramInt) {
        /*    */
        throw new UnsupportedOperationException("use setContent");
        /*    */
    }

    /*    */
    /*    */
    public final void Xw(nY paramnY) {
        /*    */
        Nj nj;
        /*    */
        super.Xw(paramnY);
        /*    */
        q80.Km(q80.Km(5, "autoScrollArea") * 2, "autoScrollSpeed");
        /*    */
        db db1 = db.oI;
        /*    */
        this.Wk = (db) q80.Yz0("hscrollbarOffset", false, db.class, db1);
        /*    */
        this.pq0 = (db) q80.Yz0("vscrollbarOffset", false, db.class, db1);
        /*    */
        this.W6 = (db) q80.Yz0("contentScrollbarSpacing", false, db.class, db1);
        /*    */
        this.mV = q80.Mw0("scrollbarsAlwaysVisible", false);
        /*    */
        q80 q80;
        /*    */
        boolean bool;
        /*    */
        if ((bool = (q80 = (q80) paramnY).Mw0("hasDragButton", false)) && this.JB0 == null) {
            /*    */
            LG0 lG0;
            /*    */
            this();
            /*    */
            this.JB0 = nj;
            /*    */
            (nj = new Nj()).Xu("dragButton");
            /*    */
            this(this);
            /*    */
            (nj = this.JB0).a4 = lG0;
            /*    */
            super.si(nj, 3);
            /*    */
        } else if (nj == null && this.JB0 != null) {
            /*    */
            if (v3 || lPt3(3) == this.JB0) {
                /*    */
                super.fG0(3);
                /*    */
                this.JB0 = null;
                /*    */
                return;
                /*    */
            }
            /*    */
            throw new AssertionError();
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void uW() {
        /*    */
        if (!this.t8)
            /*    */ try {
            /*    */
            this.t8 = true;
            /*    */
            JG0 jG0;
            /*    */
            if ((jG0 = this.iR) != null)
                /*    */ jG0.uW();
            /*    */
            super.uW();
            /*    */
        } finally {
            /*    */
            this.t8 = false;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void UW(JG0 paramJG0) {
        /*    */
        if (paramJG0 == this.z9) {
            /*    */
            rq0();
            /*    */
        } else {
            /*    */
            MJ0();
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void J00(throws paramthrows) {
        /*    */
        this.Sr = 0;
        /*    */
    }

    /*    */
    /*    */
    public final void d40() {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield iR : Lf/JG0;
        /*    */     //   4: ifnull -> 1231
        /*    */     //   7: aload_0
        /*    */     //   8: dup
        /*    */     //   9: dup2
        /*    */     //   10: invokevirtual qF : ()I
        /*    */     //   13: istore_1
        /*    */     //   14: invokevirtual Hy : ()I
        /*    */     //   17: istore_2
        /*    */     //   18: getfield pq0 : Lf/db;
        /*    */     //   21: dup
        /*    */     //   22: astore_3
        /*    */     //   23: aload_0
        /*    */     //   24: iload_1
        /*    */     //   25: aload_3
        /*    */     //   26: getfield PO : I
        /*    */     //   29: iadd
        /*    */     //   30: istore_3
        /*    */     //   31: getfield Wk : Lf/db;
        /*    */     //   34: dup
        /*    */     //   35: iload_2
        /*    */     //   36: swap
        /*    */     //   37: getfield bJ0 : I
        /*    */     //   40: iadd
        /*    */     //   41: istore #4
        /*    */     //   43: getfield PO : I
        /*    */     //   46: istore #5
        /*    */     //   48: getfield bJ0 : I
        /*    */     //   51: istore #6
        /*    */     //   53: iconst_0
        /*    */     //   54: istore #7
        /*    */     //   56: iconst_0
        /*    */     //   57: istore #8
        /*    */     //   59: getfield YP : I
        /*    */     //   62: invokestatic yE : (I)I
        /*    */     //   65: dup
        /*    */     //   66: istore #9
        /*    */     //   68: iconst_1
        /*    */     //   69: if_icmpeq -> 114
        /*    */     //   72: iload #9
        /*    */     //   74: iconst_2
        /*    */     //   75: if_icmpeq -> 99
        /*    */     //   78: aload_0
        /*    */     //   79: dup
        /*    */     //   80: getfield iR : Lf/JG0;
        /*    */     //   83: invokevirtual J50 : ()I
        /*    */     //   86: istore #9
        /*    */     //   88: getfield iR : Lf/JG0;
        /*    */     //   91: invokevirtual tj0 : ()I
        /*    */     //   94: istore #10
        /*    */     //   96: goto -> 126
        /*    */     //   99: aload_0
        /*    */     //   100: getfield iR : Lf/JG0;
        /*    */     //   103: invokevirtual J50 : ()I
        /*    */     //   106: istore #9
        /*    */     //   108: iload_2
        /*    */     //   109: istore #10
        /*    */     //   111: goto -> 126
        /*    */     //   114: aload_0
        /*    */     //   115: getfield iR : Lf/JG0;
        /*    */     //   118: invokevirtual tj0 : ()I
        /*    */     //   121: istore #10
        /*    */     //   123: iload_1
        /*    */     //   124: istore #9
        /*    */     //   126: iload_1
        /*    */     //   127: iconst_0
        /*    */     //   128: istore #11
        /*    */     //   130: iconst_0
        /*    */     //   131: istore #12
        /*    */     //   133: ifle -> 434
        /*    */     //   136: iload_2
        /*    */     //   137: ifle -> 434
        /*    */     //   140: iload #4
        /*    */     //   142: iload_3
        /*    */     //   143: istore #12
        /*    */     //   145: istore #11
        /*    */     //   147: aload_0
        /*    */     //   148: iconst_0
        /*    */     //   149: istore #13
        /*    */     //   151: getfield YP : I
        /*    */     //   154: iconst_2
        /*    */     //   155: if_icmpeq -> 268
        /*    */     //   158: iload #9
        /*    */     //   160: iload_1
        /*    */     //   161: isub
        /*    */     //   162: iconst_0
        /*    */     //   163: swap
        /*    */     //   164: invokestatic max : (II)I
        /*    */     //   167: dup
        /*    */     //   168: istore #14
        /*    */     //   170: ifgt -> 208
        /*    */     //   173: aload_0
        /*    */     //   174: getfield mV : Z
        /*    */     //   177: ifne -> 208
        /*    */     //   180: aload_0
        /*    */     //   181: getfield Sr : I
        /*    */     //   184: iconst_3
        /*    */     //   185: iand
        /*    */     //   186: iconst_3
        /*    */     //   187: if_icmpne -> 193
        /*    */     //   190: goto -> 208
        /*    */     //   193: iload #13
        /*    */     //   195: iload #14
        /*    */     //   197: iload #11
        /*    */     //   199: istore #13
        /*    */     //   201: istore #11
        /*    */     //   203: istore #14
        /*    */     //   205: goto -> 286
        /*    */     //   208: iload #4
        /*    */     //   210: aload_0
        /*    */     //   211: iload #13
        /*    */     //   213: iload #7
        /*    */     //   215: iconst_1
        /*    */     //   216: ixor
        /*    */     //   217: ior
        /*    */     //   218: istore #13
        /*    */     //   220: iconst_1
        /*    */     //   221: istore_2
        /*    */     //   222: getfield Fd0 : Lf/Ja;
        /*    */     //   225: invokevirtual HY : ()I
        /*    */     //   228: isub
        /*    */     //   229: dup
        /*    */     //   230: istore #11
        /*    */     //   232: aload_0
        /*    */     //   233: getfield W6 : Lf/db;
        /*    */     //   236: getfield bJ0 : I
        /*    */     //   239: isub
        /*    */     //   240: iconst_0
        /*    */     //   241: swap
        /*    */     //   242: invokestatic max : (II)I
        /*    */     //   245: istore #7
        /*    */     //   247: iload #13
        /*    */     //   249: iload #7
        /*    */     //   251: iload_2
        /*    */     //   252: iload #14
        /*    */     //   254: iload #11
        /*    */     //   256: istore #13
        /*    */     //   258: istore #11
        /*    */     //   260: istore #7
        /*    */     //   262: istore_2
        /*    */     //   263: istore #14
        /*    */     //   265: goto -> 286
        /*    */     //   268: iconst_0
        /*    */     //   269: istore #9
        /*    */     //   271: iload #13
        /*    */     //   273: iload_1
        /*    */     //   274: iload #9
        /*    */     //   276: iload #11
        /*    */     //   278: istore #13
        /*    */     //   280: istore #11
        /*    */     //   282: istore #9
        /*    */     //   284: istore #14
        /*    */     //   286: aload_0
        /*    */     //   287: getfield YP : I
        /*    */     //   290: iconst_3
        /*    */     //   291: if_icmpeq -> 397
        /*    */     //   294: iload #10
        /*    */     //   296: iload_2
        /*    */     //   297: isub
        /*    */     //   298: iconst_0
        /*    */     //   299: swap
        /*    */     //   300: invokestatic max : (II)I
        /*    */     //   303: dup
        /*    */     //   304: istore #15
        /*    */     //   306: ifgt -> 342
        /*    */     //   309: aload_0
        /*    */     //   310: getfield mV : Z
        /*    */     //   313: ifne -> 342
        /*    */     //   316: aload_0
        /*    */     //   317: getfield Sr : I
        /*    */     //   320: bipush #12
        /*    */     //   322: iand
        /*    */     //   323: bipush #12
        /*    */     //   325: if_icmpne -> 331
        /*    */     //   328: goto -> 342
        /*    */     //   331: iload #14
        /*    */     //   333: iload #15
        /*    */     //   335: istore #14
        /*    */     //   337: istore #15
        /*    */     //   339: goto -> 411
        /*    */     //   342: iload_3
        /*    */     //   343: aload_0
        /*    */     //   344: iload #14
        /*    */     //   346: iload #8
        /*    */     //   348: iconst_1
        /*    */     //   349: ixor
        /*    */     //   350: ior
        /*    */     //   351: istore #14
        /*    */     //   353: iconst_1
        /*    */     //   354: istore_1
        /*    */     //   355: getfield PB : Lf/Ja;
        /*    */     //   358: invokevirtual AW : ()I
        /*    */     //   361: isub
        /*    */     //   362: dup
        /*    */     //   363: istore #12
        /*    */     //   365: aload_0
        /*    */     //   366: getfield W6 : Lf/db;
        /*    */     //   369: getfield PO : I
        /*    */     //   372: isub
        /*    */     //   373: iconst_0
        /*    */     //   374: swap
        /*    */     //   375: invokestatic max : (II)I
        /*    */     //   378: istore #8
        /*    */     //   380: iload #14
        /*    */     //   382: iload #8
        /*    */     //   384: iload #15
        /*    */     //   386: iload_1
        /*    */     //   387: istore #8
        /*    */     //   389: istore #14
        /*    */     //   391: istore_1
        /*    */     //   392: istore #15
        /*    */     //   394: goto -> 411
        /*    */     //   397: iconst_0
        /*    */     //   398: istore #10
        /*    */     //   400: iload #14
        /*    */     //   402: iload_2
        /*    */     //   403: iload #10
        /*    */     //   405: istore #14
        /*    */     //   407: istore #10
        /*    */     //   409: istore #15
        /*    */     //   411: iload #15
        /*    */     //   413: ifne -> 427
        /*    */     //   416: iload #13
        /*    */     //   418: iload #14
        /*    */     //   420: istore #13
        /*    */     //   422: istore #14
        /*    */     //   424: goto -> 445
        /*    */     //   427: iload #13
        /*    */     //   429: istore #11
        /*    */     //   431: goto -> 147
        /*    */     //   434: iload #4
        /*    */     //   436: iload_3
        /*    */     //   437: iload #12
        /*    */     //   439: istore #13
        /*    */     //   441: istore #12
        /*    */     //   443: istore #14
        /*    */     //   445: iload #7
        /*    */     //   447: ifeq -> 470
        /*    */     //   450: aload_0
        /*    */     //   451: getfield Fd0 : Lf/Ja;
        /*    */     //   454: getfield dP : Z
        /*    */     //   457: ifne -> 470
        /*    */     //   460: aload_0
        /*    */     //   461: dup
        /*    */     //   462: getfield Sr : I
        /*    */     //   465: iconst_1
        /*    */     //   466: ior
        /*    */     //   467: putfield Sr : I
        /*    */     //   470: iload #7
        /*    */     //   472: ifne -> 495
        /*    */     //   475: aload_0
        /*    */     //   476: getfield Fd0 : Lf/Ja;
        /*    */     //   479: getfield dP : Z
        /*    */     //   482: ifeq -> 495
        /*    */     //   485: aload_0
        /*    */     //   486: dup
        /*    */     //   487: getfield Sr : I
        /*    */     //   490: iconst_2
        /*    */     //   491: ior
        /*    */     //   492: putfield Sr : I
        /*    */     //   495: iload #8
        /*    */     //   497: ifeq -> 520
        /*    */     //   500: aload_0
        /*    */     //   501: getfield PB : Lf/Ja;
        /*    */     //   504: getfield dP : Z
        /*    */     //   507: ifne -> 520
        /*    */     //   510: aload_0
        /*    */     //   511: dup
        /*    */     //   512: getfield Sr : I
        /*    */     //   515: iconst_4
        /*    */     //   516: ior
        /*    */     //   517: putfield Sr : I
        /*    */     //   520: iload #8
        /*    */     //   522: ifne -> 546
        /*    */     //   525: aload_0
        /*    */     //   526: getfield PB : Lf/Ja;
        /*    */     //   529: getfield dP : Z
        /*    */     //   532: ifeq -> 546
        /*    */     //   535: aload_0
        /*    */     //   536: dup
        /*    */     //   537: getfield Sr : I
        /*    */     //   540: bipush #8
        /*    */     //   542: ior
        /*    */     //   543: putfield Sr : I
        /*    */     //   546: iload #7
        /*    */     //   548: aload_0
        /*    */     //   549: getfield Fd0 : Lf/Ja;
        /*    */     //   552: getfield dP : Z
        /*    */     //   555: ixor
        /*    */     //   556: dup
        /*    */     //   557: istore #15
        /*    */     //   559: iload #8
        /*    */     //   561: aload_0
        /*    */     //   562: getfield PB : Lf/Ja;
        /*    */     //   565: getfield dP : Z
        /*    */     //   568: ixor
        /*    */     //   569: istore #16
        /*    */     //   571: ifne -> 579
        /*    */     //   574: iload #16
        /*    */     //   576: ifeq -> 616
        /*    */     //   579: iload #15
        /*    */     //   581: ifeq -> 592
        /*    */     //   584: aload_0
        /*    */     //   585: getfield YP : I
        /*    */     //   588: iconst_3
        /*    */     //   589: if_icmpeq -> 605
        /*    */     //   592: iload #16
        /*    */     //   594: ifeq -> 612
        /*    */     //   597: aload_0
        /*    */     //   598: getfield YP : I
        /*    */     //   601: iconst_2
        /*    */     //   602: if_icmpne -> 612
        /*    */     //   605: aload_0
        /*    */     //   606: invokevirtual MJ0 : ()V
        /*    */     //   609: goto -> 616
        /*    */     //   612: aload_0
        /*    */     //   613: invokevirtual rq0 : ()V
        /*    */     //   616: aload_0
        /*    */     //   617: getfield iR : Lf/JG0;
        /*    */     //   620: dup
        /*    */     //   621: astore #15
        /*    */     //   623: instanceof f/qF0
        /*    */     //   626: ifeq -> 652
        /*    */     //   629: iload_2
        /*    */     //   630: aload #15
        /*    */     //   632: checkcast f/qF0
        /*    */     //   635: checkcast f/Na
        /*    */     //   638: dup
        /*    */     //   639: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   642: pop
        /*    */     //   643: getfield zK : I
        /*    */     //   646: isub
        /*    */     //   647: istore #15
        /*    */     //   649: goto -> 655
        /*    */     //   652: iload_2
        /*    */     //   653: istore #15
        /*    */     //   655: aload_0
        /*    */     //   656: dup
        /*    */     //   657: dup
        /*    */     //   658: dup2
        /*    */     //   659: getfield Fd0 : Lf/Ja;
        /*    */     //   662: iload #7
        /*    */     //   664: invokevirtual wI0 : (Z)V
        /*    */     //   667: getfield Fd0 : Lf/Ja;
        /*    */     //   670: iload #11
        /*    */     //   672: invokevirtual mE0 : (I)V
        /*    */     //   675: getfield Fd0 : Lf/Ja;
        /*    */     //   678: iload #4
        /*    */     //   680: iload #14
        /*    */     //   682: iload #12
        /*    */     //   684: iload #5
        /*    */     //   686: isub
        /*    */     //   687: iconst_0
        /*    */     //   688: swap
        /*    */     //   689: invokestatic max : (II)I
        /*    */     //   692: istore #4
        /*    */     //   694: isub
        /*    */     //   695: istore #11
        /*    */     //   697: iload #4
        /*    */     //   699: iconst_0
        /*    */     //   700: iload #11
        /*    */     //   702: invokestatic max : (II)I
        /*    */     //   705: invokevirtual Tm : (II)Z
        /*    */     //   708: pop
        /*    */     //   709: getfield Fd0 : Lf/Ja;
        /*    */     //   712: aload_0
        /*    */     //   713: invokevirtual RS : ()I
        /*    */     //   716: iload #5
        /*    */     //   718: iadd
        /*    */     //   719: aload_0
        /*    */     //   720: invokevirtual e3 : ()I
        /*    */     //   723: iload #14
        /*    */     //   725: iadd
        /*    */     //   726: invokevirtual ME : (II)Z
        /*    */     //   729: pop
        /*    */     //   730: getfield Fd0 : Lf/Ja;
        /*    */     //   733: astore #4
        /*    */     //   735: iconst_1
        /*    */     //   736: iload_1
        /*    */     //   737: invokestatic max : (II)I
        /*    */     //   740: dup
        /*    */     //   741: istore #5
        /*    */     //   743: iconst_1
        /*    */     //   744: if_icmplt -> 1214
        /*    */     //   747: aload #4
        /*    */     //   749: dup
        /*    */     //   750: iload #5
        /*    */     //   752: putfield x10 : I
        /*    */     //   755: getfield zm0 : Z
        /*    */     //   758: ifeq -> 766
        /*    */     //   761: aload #4
        /*    */     //   763: invokevirtual ve : ()V
        /*    */     //   766: iload_1
        /*    */     //   767: aload_0
        /*    */     //   768: getfield Fd0 : Lf/Ja;
        /*    */     //   771: astore #4
        /*    */     //   773: bipush #10
        /*    */     //   775: idiv
        /*    */     //   776: iconst_1
        /*    */     //   777: swap
        /*    */     //   778: invokestatic max : (II)I
        /*    */     //   781: dup
        /*    */     //   782: istore #5
        /*    */     //   784: iconst_1
        /*    */     //   785: if_icmplt -> 1197
        /*    */     //   788: aload_0
        /*    */     //   789: dup
        /*    */     //   790: dup
        /*    */     //   791: dup2
        /*    */     //   792: aload #4
        /*    */     //   794: iload #5
        /*    */     //   796: putfield YB : I
        /*    */     //   799: getfield PB : Lf/Ja;
        /*    */     //   802: iload #8
        /*    */     //   804: invokevirtual wI0 : (Z)V
        /*    */     //   807: getfield PB : Lf/Ja;
        /*    */     //   810: iload #13
        /*    */     //   812: invokevirtual mE0 : (I)V
        /*    */     //   815: getfield PB : Lf/Ja;
        /*    */     //   818: iload #14
        /*    */     //   820: iload #6
        /*    */     //   822: iload_3
        /*    */     //   823: iload #12
        /*    */     //   825: isub
        /*    */     //   826: istore_3
        /*    */     //   827: iconst_0
        /*    */     //   828: iload_3
        /*    */     //   829: invokestatic max : (II)I
        /*    */     //   832: istore #4
        /*    */     //   834: isub
        /*    */     //   835: istore #5
        /*    */     //   837: iload #4
        /*    */     //   839: iconst_0
        /*    */     //   840: iload #5
        /*    */     //   842: invokestatic max : (II)I
        /*    */     //   845: invokevirtual Tm : (II)Z
        /*    */     //   848: pop
        /*    */     //   849: getfield PB : Lf/Ja;
        /*    */     //   852: aload_0
        /*    */     //   853: invokevirtual RS : ()I
        /*    */     //   856: iload #12
        /*    */     //   858: iadd
        /*    */     //   859: aload_0
        /*    */     //   860: invokevirtual e3 : ()I
        /*    */     //   863: iload #6
        /*    */     //   865: iadd
        /*    */     //   866: invokevirtual ME : (II)Z
        /*    */     //   869: pop
        /*    */     //   870: getfield PB : Lf/Ja;
        /*    */     //   873: astore #4
        /*    */     //   875: iconst_1
        /*    */     //   876: iload #15
        /*    */     //   878: invokestatic max : (II)I
        /*    */     //   881: dup
        /*    */     //   882: istore #5
        /*    */     //   884: iconst_1
        /*    */     //   885: if_icmplt -> 1180
        /*    */     //   888: aload #4
        /*    */     //   890: dup
        /*    */     //   891: iload #5
        /*    */     //   893: putfield x10 : I
        /*    */     //   896: getfield zm0 : Z
        /*    */     //   899: ifeq -> 907
        /*    */     //   902: aload #4
        /*    */     //   904: invokevirtual ve : ()V
        /*    */     //   907: iload #15
        /*    */     //   909: aload_0
        /*    */     //   910: getfield PB : Lf/Ja;
        /*    */     //   913: astore #4
        /*    */     //   915: bipush #10
        /*    */     //   917: idiv
        /*    */     //   918: iconst_1
        /*    */     //   919: swap
        /*    */     //   920: invokestatic max : (II)I
        /*    */     //   923: dup
        /*    */     //   924: istore #5
        /*    */     //   926: iconst_1
        /*    */     //   927: if_icmplt -> 1163
        /*    */     //   930: aload_0
        /*    */     //   931: aload #4
        /*    */     //   933: iload #5
        /*    */     //   935: putfield YB : I
        /*    */     //   938: getfield JB0 : Lf/Nj;
        /*    */     //   941: dup
        /*    */     //   942: astore #4
        /*    */     //   944: ifnull -> 1014
        /*    */     //   947: iload #7
        /*    */     //   949: ifeq -> 963
        /*    */     //   952: iload #8
        /*    */     //   954: ifeq -> 963
        /*    */     //   957: iconst_1
        /*    */     //   958: istore #5
        /*    */     //   960: goto -> 966
        /*    */     //   963: iconst_0
        /*    */     //   964: istore #5
        /*    */     //   966: aload_0
        /*    */     //   967: dup
        /*    */     //   968: aload #4
        /*    */     //   970: iload #5
        /*    */     //   972: invokevirtual wI0 : (Z)V
        /*    */     //   975: getfield JB0 : Lf/Nj;
        /*    */     //   978: iconst_0
        /*    */     //   979: iload_3
        /*    */     //   980: invokestatic max : (II)I
        /*    */     //   983: iconst_0
        /*    */     //   984: iload #11
        /*    */     //   986: invokestatic max : (II)I
        /*    */     //   989: invokevirtual Tm : (II)Z
        /*    */     //   992: pop
        /*    */     //   993: getfield JB0 : Lf/Nj;
        /*    */     //   996: aload_0
        /*    */     //   997: invokevirtual RS : ()I
        /*    */     //   1000: iload #12
        /*    */     //   1002: iadd
        /*    */     //   1003: aload_0
        /*    */     //   1004: invokevirtual e3 : ()I
        /*    */     //   1007: iload #14
        /*    */     //   1009: iadd
        /*    */     //   1010: invokevirtual ME : (II)Z
        /*    */     //   1013: pop
        /*    */     //   1014: aload_0
        /*    */     //   1015: dup
        /*    */     //   1016: dup
        /*    */     //   1017: getfield z9 : Lf/JG0;
        /*    */     //   1020: aload_0
        /*    */     //   1021: dup
        /*    */     //   1022: invokevirtual RS : ()I
        /*    */     //   1025: istore_3
        /*    */     //   1026: invokevirtual e3 : ()I
        /*    */     //   1029: iload_3
        /*    */     //   1030: swap
        /*    */     //   1031: invokevirtual ME : (II)Z
        /*    */     //   1034: pop
        /*    */     //   1035: getfield z9 : Lf/JG0;
        /*    */     //   1038: iload_1
        /*    */     //   1039: iload_2
        /*    */     //   1040: invokevirtual Tm : (II)Z
        /*    */     //   1043: pop
        /*    */     //   1044: getfield iR : Lf/JG0;
        /*    */     //   1047: dup
        /*    */     //   1048: astore_3
        /*    */     //   1049: instanceof f/lPt9
        /*    */     //   1052: ifeq -> 1086
        /*    */     //   1055: aload_0
        /*    */     //   1056: aload_3
        /*    */     //   1057: aload_0
        /*    */     //   1058: getfield z9 : Lf/JG0;
        /*    */     //   1061: dup
        /*    */     //   1062: getfield Kd : I
        /*    */     //   1065: istore_3
        /*    */     //   1066: getfield er0 : I
        /*    */     //   1069: iload_3
        /*    */     //   1070: swap
        /*    */     //   1071: invokevirtual Ol0 : (II)V
        /*    */     //   1074: getfield iR : Lf/JG0;
        /*    */     //   1077: iload_1
        /*    */     //   1078: iload_2
        /*    */     //   1079: invokevirtual Tm : (II)Z
        /*    */     //   1082: pop
        /*    */     //   1083: goto -> 1135
        /*    */     //   1086: aload_0
        /*    */     //   1087: getfield w30 : Z
        /*    */     //   1090: ifeq -> 1116
        /*    */     //   1093: aload_3
        /*    */     //   1094: iload_2
        /*    */     //   1095: iload_1
        /*    */     //   1096: iload #9
        /*    */     //   1098: invokestatic max : (II)I
        /*    */     //   1101: istore_1
        /*    */     //   1102: iload #10
        /*    */     //   1104: invokestatic max : (II)I
        /*    */     //   1107: iload_1
        /*    */     //   1108: swap
        /*    */     //   1109: invokevirtual Tm : (II)Z
        /*    */     //   1112: pop
        /*    */     //   1113: goto -> 1135
        /*    */     //   1116: aload_3
        /*    */     //   1117: iconst_0
        /*    */     //   1118: iload #9
        /*    */     //   1120: invokestatic max : (II)I
        /*    */     //   1123: iconst_0
        /*    */     //   1124: iload #10
        /*    */     //   1126: invokestatic max : (II)I
        /*    */     //   1129: swap
        /*    */     //   1130: swap
        /*    */     //   1131: invokevirtual Tm : (II)Z
        /*    */     //   1134: pop
        /*    */     //   1135: aload_0
        /*    */     //   1136: dup
        /*    */     //   1137: getfield O : Lf/Sa0;
        /*    */     //   1140: dup
        /*    */     //   1141: getstatic f/rS.cOM6 : Lf/Ll;
        /*    */     //   1144: iload #7
        /*    */     //   1146: invokevirtual gf0 : (Lf/Ll;Z)V
        /*    */     //   1149: getstatic f/rS.mT : Lf/Ll;
        /*    */     //   1152: iload #8
        /*    */     //   1154: invokevirtual gf0 : (Lf/Ll;Z)V
        /*    */     //   1157: invokevirtual BB0 : ()V
        /*    */     //   1160: goto -> 1247
        /*    */     //   1163: aload #4
        /*    */     //   1165: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   1168: pop
        /*    */     //   1169: new java/lang/IllegalArgumentException
        /*    */     //   1172: dup
        /*    */     //   1173: ldc_w 'stepSize < 1'
        /*    */     //   1176: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   1179: athrow
        /*    */     //   1180: aload #4
        /*    */     //   1182: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   1185: pop
        /*    */     //   1186: new java/lang/IllegalArgumentException
        /*    */     //   1189: dup
        /*    */     //   1190: ldc_w 'pageSize < 1'
        /*    */     //   1193: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   1196: athrow
        /*    */     //   1197: aload #4
        /*    */     //   1199: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   1202: pop
        /*    */     //   1203: new java/lang/IllegalArgumentException
        /*    */     //   1206: dup
        /*    */     //   1207: ldc_w 'stepSize < 1'
        /*    */     //   1210: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   1213: athrow
        /*    */     //   1214: aload #4
        /*    */     //   1216: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   1219: pop
        /*    */     //   1220: new java/lang/IllegalArgumentException
        /*    */     //   1223: dup
        /*    */     //   1224: ldc_w 'pageSize < 1'
        /*    */     //   1227: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   1230: athrow
        /*    */     //   1231: aload_0
        /*    */     //   1232: dup
        /*    */     //   1233: getfield Fd0 : Lf/Ja;
        /*    */     //   1236: iconst_0
        /*    */     //   1237: invokevirtual wI0 : (Z)V
        /*    */     //   1240: getfield PB : Lf/Ja;
        /*    */     //   1243: iconst_0
        /*    */     //   1244: invokevirtual wI0 : (Z)V
        /*    */     //   1247: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 26
        /*    */     //   #2	-> 31
        /*    */     //   #3	-> 37
        /*    */     //   #4	-> 43
        /*    */     //   #5	-> 48
        /*    */     //   #6	-> 59
        /*    */     //   #7	-> 225
        /*    */     //   #8	-> 233
        /*    */     //   #9	-> 236
        /*    */     //   #10	-> 242
        /*    */     //   #11	-> 358
        /*    */     //   #12	-> 366
        /*    */     //   #13	-> 369
        /*    */     //   #14	-> 375
        /*    */     //   #15	-> 454
        /*    */     //   #16	-> 462
        /*    */     //   #17	-> 479
        /*    */     //   #18	-> 487
        /*    */     //   #19	-> 504
        /*    */     //   #20	-> 512
        /*    */     //   #21	-> 529
        /*    */     //   #22	-> 537
        /*    */     //   #23	-> 552
        /*    */     //   #24	-> 562
        /*    */     //   #25	-> 565
        /*    */     //   #26	-> 585
        /*    */     //   #27	-> 643
        /*    */     //   #28	-> 659
        /*    */     //   #29	-> 726
        /*    */     //   #30	-> 730
        /*    */     //   #31	-> 752
        /*    */     //   #32	-> 755
        /*    */     //   #33	-> 768
        /*    */     //   #34	-> 796
        /*    */     //   #35	-> 799
        /*    */     //   #36	-> 866
        /*    */     //   #37	-> 870
        /*    */     //   #38	-> 893
        /*    */     //   #39	-> 896
        /*    */     //   #40	-> 910
        /*    */     //   #41	-> 935
        /*    */     //   #42	-> 938
        /*    */     //   #43	-> 1010
        /*    */     //   #44	-> 1017
        /*    */     //   #45	-> 1031
        /*    */     //   #46	-> 1035
        /*    */     //   #47	-> 1062
        /*    */     //   #48	-> 1066
        /*    */     //   #49	-> 1071
        /*    */     //   #50	-> 1137
        /*    */     //   #51	-> 1141
        /*    */     //   #52	-> 1169
        /*    */     //   #53	-> 1182
        /*    */     //   #54	-> 1186
        /*    */     //   #55	-> 1199
        /*    */     //   #56	-> 1203
        /*    */     //   #57	-> 1216
        /*    */     //   #58	-> 1220
        /*    */     //   #59	-> 1233
        /*    */
    }

    /*    */
    /*    */
    public final boolean i2(oa0 paramoa0) {
        /*    */
        Ja ja;
        /*    */
        int j;
        /*    */
        JG0 jG02;
        /*    */
        if (B8.Wm0(paramoa0.cz0) && (jG02 = this.iR) != null && jG02.zI0 && jG02.i2(paramoa0)) {
            /*    */
            this.iR.BA();
            /*    */
            return true;
            /*    */
        }
        /*    */
        if (super.i2(paramoa0))
            /*    */ return true;
        /*    */
        switch (Zk0.yE(paramoa0.cz0)) {
            /*    */
            case 8:
                /*    */
            case 9:
                /*    */
                if ((j = yl.Nk(paramoa0.GG0)) == 21 || j == 22)
                    /*    */ return this.Fd0.i2(paramoa0);
                /*    */
                if (j == 19 || j == 20 || j == 92 || j == 93)
                    /*    */ return this.PB.i2(paramoa0);
                /*    */
                break;
            /*    */
            case 7:
                /*    */
                if ((ja = this.PB).dP)
                    /*    */ return i2(paramoa0);
                /*    */
                return false;
            /*    */
        }
        /*    */
        getClass();
        /*    */
        int i = paramoa0.aK;
        /*    */
        JG0 jG01;
        /*    */
        return (B8.Pg(paramoa0.cz0) && (jG01 = ((rS) super).z9).mu0(i, paramoa0.gk0));
        /*    */
    }

    /*    */
    /*    */
    public final void WN(throws paramthrows, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*    */
        cF();
        /*    */
        super.WN(paramthrows, paramInt1, paramInt2, paramInt3, paramInt4);
        /*    */
    }

    /*    */
    /*    */
    public final void V90(throws paramthrows) {
        /*    */
        cF();
        /*    */
        Nj nj;
        /*    */
        if ((nj = this.JB0) != null) {
            /*    */
            nj.O.gf0(COm9, this.PB.lm.TG0.Ni0());
            /*    */
            nj.O.gf0(hD, this.Fd0.lm.TG0.Ni0());
            /*    */
        }
        /*    */
        super.V90(paramthrows);
        /*    */
    }

    /*    */
    /*    */
    public final void BB0() {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield iR : Lf/JG0;
        /*    */     //   4: dup
        /*    */     //   5: astore_1
        /*    */     //   6: instanceof f/lPt9
        /*    */     //   9: ifeq -> 69
        /*    */     //   12: aload_1
        /*    */     //   13: checkcast f/lPt9
        /*    */     //   16: aload_0
        /*    */     //   17: dup
        /*    */     //   18: getfield Fd0 : Lf/Ja;
        /*    */     //   21: getfield Ny0 : I
        /*    */     //   24: istore_0
        /*    */     //   25: getfield PB : Lf/Ja;
        /*    */     //   28: getfield Ny0 : I
        /*    */     //   31: istore_1
        /*    */     //   32: checkcast f/Na
        /*    */     //   35: dup
        /*    */     //   36: astore_2
        /*    */     //   37: getfield ch0 : I
        /*    */     //   40: iload_0
        /*    */     //   41: if_icmpne -> 52
        /*    */     //   44: aload_2
        /*    */     //   45: getfield ZW : I
        /*    */     //   48: iload_1
        /*    */     //   49: if_icmpeq -> 102
        /*    */     //   52: aload_2
        /*    */     //   53: dup
        /*    */     //   54: dup
        /*    */     //   55: iload_0
        /*    */     //   56: putfield ch0 : I
        /*    */     //   59: iload_1
        /*    */     //   60: putfield ZW : I
        /*    */     //   63: invokevirtual rq0 : ()V
        /*    */     //   66: goto -> 102
        /*    */     //   69: aload_1
        /*    */     //   70: aload_0
        /*    */     //   71: getfield z9 : Lf/JG0;
        /*    */     //   74: dup
        /*    */     //   75: astore_1
        /*    */     //   76: getfield Kd : I
        /*    */     //   79: aload_0
        /*    */     //   80: getfield Fd0 : Lf/Ja;
        /*    */     //   83: getfield Ny0 : I
        /*    */     //   86: isub
        /*    */     //   87: aload_1
        /*    */     //   88: getfield er0 : I
        /*    */     //   91: aload_0
        /*    */     //   92: getfield PB : Lf/Ja;
        /*    */     //   95: getfield Ny0 : I
        /*    */     //   98: isub
        /*    */     //   99: invokevirtual Ol0 : (II)V
        /*    */     //   102: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 21
        /*    */     //   #2	-> 25
        /*    */     //   #3	-> 28
        /*    */     //   #4	-> 32
        /*    */     //   #5	-> 37
        /*    */     //   #6	-> 45
        /*    */     //   #7	-> 71
        /*    */     //   #8	-> 76
        /*    */     //   #9	-> 80
        /*    */     //   #10	-> 83
        /*    */     //   #11	-> 88
        /*    */     //   #12	-> 92
        /*    */     //   #13	-> 95
        /*    */     //   #14	-> 99
        /*    */
    }

    /*    */
    /*    */
    public final void Yl() {
        /*    */
        boolean bool = false;
        /*    */
        if (this.Bo0 == null) {
            /*    */
            this.P2 = bool;
            /*    */
            return;
            /*    */
        }
        /*    */
        throw new RuntimeException("set before adding to gui");
        /*    */
    }

    /*    */
    /*    */
    public final void xZ() {
        /*    */
        boolean bool = true;
        /*    */
        if (this.w30 != bool) {
            /*    */
            this.w30 = bool;
            /*    */
            rq0();
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void zG0(int paramInt) {
        /*    */
        if (paramInt != 0) {
            /*    */
            if (this.YP != paramInt) {
                /*    */
                this.YP = paramInt;
                /*    */
                MJ0();
                /*    */
            }
            /*    */
            return;
            /*    */
        }
        /*    */
        throw new NullPointerException("fixed");
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */