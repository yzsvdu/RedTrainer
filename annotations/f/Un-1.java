/*  1 */
package f;

public class Un extends Ap {
    public static final Ll p2 = Ll.F10("armed");
    public static final Ll NI = Ll.F10("pressed");
    public static final Ll ey = Ll.F10("selected");
    public final qw Ps0;
    public protected TG0;
    public String WU;
    public String GE0;

    public void sk0(boolean paramBoolean) {
        boolean bool;
        protected protected1 ;
        if (((protected1 = this.TG0).hm0 & 0x8) == 0) {
            bool = true;
        } else {
            bool = false;
        }
        if (paramBoolean != bool)
            /*  2 */ {
            Bv(8, paramBoolean ^ true);
            /*  3 */
            hm.Fz0(this.JK0);
        }
    }

    public Un() {
        this(null, false, null);
    }

    public Un(Sa0 paramSa0) {
        this(paramSa0, false, null);
    }

    public Un(String paramString) {
        this(null, false, null);
        s6(paramString);
    }

    public Un(Sa0 paramSa0, int paramInt) {
        this(paramSa0, true, null);
    }

    public Un(xo paramxo) {
        this(null, false, paramxo);
    }

    public Un(Sa0 paramSa0, boolean paramBoolean, xo paramxo) {
        super(paramSa0, paramBoolean);
        qw qw1;
        protected protected1 ;
        this(this);
        this.Ps0 = qw1;
        if (paramxo == null) this();
        ow(protected1);
        Zf0(true);
    }

    public String TI() {
        return "button";
    }

    public final void V7() {
        Ds0();
    }

    public final void tW(Runnable paramRunnable) {
        this.TG0.oh0 = (Runnable[]) hm.LpT6((Object[]) this.TG0.oh0, paramRunnable, Runnable.class);
    }

    public final boolean Wg0() {
        boolean bool;
        if (this.TG0.oh0 != null) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public final String Jr0() {
        return this.GE0;
    }

    public final void s6(String paramString) {
        if (paramString == null || !paramString.equals(this.GE0)) {
            this.GE0 = paramString;
            if (paramString == null) {
                HC(gd0.It0(this.WU));
            } else {
                HC(paramString);
            }
            MJ0();
        }
    }

    public void Xw(nY paramnY) {
        super.Xw(paramnY);
        String str1 = (String) ((q80) paramnY).Yz0("text", false, String.class, null);
        String str2;
        /*  4 */
        if ((str2 = this.GE0) == null) {
            HC(gd0.It0(str1));
        } else {
            HC(str2);
        }
        MJ0();
    }

    public void LM(throws paramthrows) {
        protected protected1 ;
        if ((protected1 = this.TG0) != null) xz0();
    }

    public void ED0(throws paramthrows) {
        protected protected1 ;
        if ((protected1 = this.TG0) != null) Oy();
    }

    public int AW() {
        return Math.max(super.AW(), J50());
    }

    public int HY() {
        return Math.max(super.HY(), tj0());
    }

    public final void wI0(boolean paramBoolean) {
        super.wI0(paramBoolean);
        if (!paramBoolean) Ds0();
    }

    public final void Ds0() {
        this.TG0.zb(false);
        this.TG0.Bq(false);
        this.TG0.hB(false);
    }

    public final void zc() {
        boolean bool1, bool2, bool3;
        if ((this.TG0.hm0 & 0x8) == 0) {
            bool1 = true;
        } else {
            bool1 = false;
        }
        super.sk0(bool1);
        Sa0 sa0;
        (sa0 = this.O).gf0(ey, this.TG0.nm0());
        Ll ll2 = Ap.b00;
        if ((this.TG0
                /*  5 */.hm0 & 0x1) != 0) {
            bool3 = true;
        } else {
            bool3 = false;
        }
        sa0
/*  6 */.gf0(ll2, bool3);
        sa0.gf0(p2, this.TG0.Ni0());
        Ll ll1 = NI;
        if ((this.TG0
                /*  7 */.hm0 & 0x2) != 0) {
            bool2 = true;
        } else {
            bool2 = false;
        }
        sa0
/*  8 */.gf0(this, bool2);
    }

    public boolean i2(oa0 paramoa0) { // Byte code:
        /*    */     //   0: aload_1
        /*    */     //   1: getfield cz0 : I
        /*    */     //   4: dup
        /*    */     //   5: istore_2
        /*    */     //   6: invokestatic Pg : (I)Z
        /*    */     //   9: ifeq -> 92
        /*    */     //   12: iload_2
        /*    */     //   13: bipush #7
        /*    */     //   15: if_icmpeq -> 41
        /*    */     //   18: aload_0
        /*    */     //   19: aload_1
        /*    */     //   20: dup
        /*    */     //   21: getfield aK : I
        /*    */     //   24: istore_2
        /*    */     //   25: getfield gk0 : I
        /*    */     //   28: iload_2
        /*    */     //   29: swap
        /*    */     //   30: invokevirtual mu0 : (II)Z
        /*    */     //   33: ifeq -> 41
        /*    */     //   36: iconst_1
        /*    */     //   37: istore_2
        /*    */     //   38: goto -> 43
        /*    */     //   41: iconst_0
        /*    */     //   42: istore_2
        /*    */     //   43: iload_2
        /*    */     //   44: aload_0
        /*    */     //   45: dup
        /*    */     //   46: getfield TG0 : Lf/protected;
        /*    */     //   49: iload_2
        /*    */     //   50: invokevirtual zb : (Z)V
        /*    */     //   53: getfield TG0 : Lf/protected;
        /*    */     //   56: astore_2
        /*    */     //   57: ifeq -> 85
        /*    */     //   60: aload_2
        /*    */     //   61: getfield hm0 : I
        /*    */     //   64: iconst_2
        /*    */     //   65: iand
        /*    */     //   66: ifeq -> 74
        /*    */     //   69: iconst_1
        /*    */     //   70: istore_3
        /*    */     //   71: goto -> 76
        /*    */     //   74: iconst_0
        /*    */     //   75: istore_3
        /*    */     //   76: iload_3
        /*    */     //   77: ifeq -> 85
        /*    */     //   80: iconst_1
        /*    */     //   81: istore_3
        /*    */     //   82: goto -> 87
        /*    */     //   85: iconst_0
        /*    */     //   86: istore_3
        /*    */     //   87: aload_2
        /*    */     //   88: iload_3
        /*    */     //   89: invokevirtual Bq : (Z)V
        /*    */     //   92: aload_1
        /*    */     //   93: getfield cz0 : I
        /*    */     //   96: invokestatic yE : (I)I
        /*    */     //   99: dup
        /*    */     //   100: istore_2
        /*    */     //   101: iconst_2
        /*    */     //   102: if_icmpeq -> 291
        /*    */     //   105: iload_2
        /*    */     //   106: iconst_3
        /*    */     //   107: if_icmpeq -> 265
        /*    */     //   110: iload_2
        /*    */     //   111: tableswitch default -> 140, 7 -> 263, 8 -> 195, 9 -> 154, 10 -> 143
        /*    */     //   140: goto -> 314
        /*    */     //   143: aload_0
        /*    */     //   144: getfield TG0 : Lf/protected;
        /*    */     //   147: iconst_0
        /*    */     //   148: invokevirtual zb : (Z)V
        /*    */     //   151: goto -> 314
        /*    */     //   154: aload_1
        /*    */     //   155: getfield GG0 : I
        /*    */     //   158: invokestatic dc0 : (I)I
        /*    */     //   161: dup
        /*    */     //   162: istore_2
        /*    */     //   163: bipush #62
        /*    */     //   165: if_icmpeq -> 177
        /*    */     //   168: iload_2
        /*    */     //   169: bipush #66
        /*    */     //   171: if_icmpeq -> 177
        /*    */     //   174: goto -> 314
        /*    */     //   177: aload_0
        /*    */     //   178: dup
        /*    */     //   179: getfield TG0 : Lf/protected;
        /*    */     //   182: iconst_0
        /*    */     //   183: invokevirtual hB : (Z)V
        /*    */     //   186: getfield TG0 : Lf/protected;
        /*    */     //   189: iconst_0
        /*    */     //   190: invokevirtual Bq : (Z)V
        /*    */     //   193: iconst_1
        /*    */     //   194: ireturn
        /*    */     //   195: aload_1
        /*    */     //   196: getfield GG0 : I
        /*    */     //   199: invokestatic dc0 : (I)I
        /*    */     //   202: dup
        /*    */     //   203: istore_2
        /*    */     //   204: bipush #62
        /*    */     //   206: if_icmpeq -> 218
        /*    */     //   209: iload_2
        /*    */     //   210: bipush #66
        /*    */     //   212: if_icmpeq -> 218
        /*    */     //   215: goto -> 314
        /*    */     //   218: aload_1
        /*    */     //   219: getfield cz0 : I
        /*    */     //   222: bipush #9
        /*    */     //   224: if_icmpne -> 239
        /*    */     //   227: aload_1
        /*    */     //   228: getfield sj : Z
        /*    */     //   231: ifeq -> 239
        /*    */     //   234: iconst_1
        /*    */     //   235: istore_1
        /*    */     //   236: goto -> 241
        /*    */     //   239: iconst_0
        /*    */     //   240: istore_1
        /*    */     //   241: iload_1
        /*    */     //   242: ifne -> 261
        /*    */     //   245: aload_0
        /*    */     //   246: dup
        /*    */     //   247: getfield TG0 : Lf/protected;
        /*    */     //   250: iconst_1
        /*    */     //   251: invokevirtual hB : (Z)V
        /*    */     //   254: getfield TG0 : Lf/protected;
        /*    */     //   257: iconst_1
        /*    */     //   258: invokevirtual Bq : (Z)V
        /*    */     //   261: iconst_1
        /*    */     //   262: ireturn
        /*    */     //   263: iconst_0
        /*    */     //   264: ireturn
        /*    */     //   265: aload_1
        /*    */     //   266: getfield vl : I
        /*    */     //   269: ifne -> 314
        /*    */     //   272: aload_0
        /*    */     //   273: dup
        /*    */     //   274: getfield TG0 : Lf/protected;
        /*    */     //   277: iconst_0
        /*    */     //   278: invokevirtual hB : (Z)V
        /*    */     //   281: getfield TG0 : Lf/protected;
        /*    */     //   284: iconst_0
        /*    */     //   285: invokevirtual Bq : (Z)V
        /*    */     //   288: goto -> 314
        /*    */     //   291: aload_1
        /*    */     //   292: getfield vl : I
        /*    */     //   295: ifne -> 314
        /*    */     //   298: aload_0
        /*    */     //   299: dup
        /*    */     //   300: getfield TG0 : Lf/protected;
        /*    */     //   303: iconst_1
        /*    */     //   304: invokevirtual hB : (Z)V
        /*    */     //   307: getfield TG0 : Lf/protected;
        /*    */     //   310: iconst_1
        /*    */     //   311: invokevirtual Bq : (Z)V
        /*    */     //   314: aload_0
        /*    */     //   315: aload_1
        /*    */     //   316: invokespecial i2 : (Lf/oa0;)Z
        /*    */     //   319: ifeq -> 324
        /*    */     //   322: iconst_1
        /*    */     //   323: ireturn
        /*    */     //   324: aload_1
        /*    */     //   325: getfield cz0 : I
        /*    */     //   328: invokestatic Pg : (I)Z
        /*    */     //   331: ireturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 1
        /*    */     //   #2	-> 6
        /*    */     //   #3	-> 21
        /*    */     //   #4	-> 25
        /*    */     //   #5	-> 30
        /*    */     //   #6	-> 46
        /*    */     //   #7	-> 61
        /*    */     //   #8	-> 89
        /*    */     //   #9	-> 93
        /*    */     //   #10	-> 96
        /*    */     //   #11	-> 155
        /*    */     //   #12	-> 158
        /*    */     //   #13	-> 196
        /*    */     //   #14	-> 199
        /*    */     //   #15	-> 219
        /*    */     //   #16	-> 247
        /*    */     //   #17	-> 266
        /*    */     //   #18	-> 274
        /*    */     //   #19	-> 292
        /*    */     //   #20	-> 300
        /*  8 */     //   #21	-> 325 } public final void Wf() { if (yl.fX()) { super.D8(); Ds0(); }  } public final void D8() { super.D8(); Ds0(); } public final protected Xe0() { return this.TG0; } public final void ow(protected paramprotected) { Object object3, object2, object1; boolean bool; if (this.Bo0 != null) { bool = true; } else { bool = false; }  protected protected1; if ((protected1 = this.TG0) != null) { if (bool) protected1.Oy();  this.TG0.JK0 = (Runnable[])hm.LL0(this.Ps0, (Object[])this.TG0.JK0); }  this.TG0 = paramprotected; paramprotected.xu0(this.Ps0); if (bool) this.TG0.xz0();  zc(); Sa0 sa0 = this.O; getClass(); u70[] arrayOfU70; int m; if ((m = p2.fK) < (
        /*  9 */
        arrayOfU70 = this.Sn).length){
            object3 = this[m];
        } else{
            object3 = null;
        }
        if (object3 != null) ((u70) object3)
                /* 10 */.ul = false;
        /*    */
        int k;
        /* 12 */
        if ((k = NI.fK) < this.length)
            /* 13 */ {
            object2 = this[k];
        } else {
            object2 = null;
        }
        if (object2 != null) ((u70) object2)
                /* 14 */.ul = false;
        /*    */
        int j;
        /* 16 */
        if ((j = Ap.b00.fK) < this.length)
            /* 17 */ {
            object1 = this[j];
        } else {
            object1 = null;
        }
        if (object1 != null) ((u70) object1)
                /* 18 */.ul = false;
        /*    */
        int i;
        /* 20 */
        if ((i = ey.fK) < this.length)
            /* 21 */ {
            u70 u70 = this[i];
        } else {
            arrayOfU70 = null;
        }
        if (this != null) ((u70) this)
                /* 22 */.ul = false;
    }
    /*    */
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Un.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */