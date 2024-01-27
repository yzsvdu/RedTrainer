/* 1 */
package f;

public final class j40 extends Qh0 {
    public final String m() {
        if (this.Zs.YC())
            /*   */ {
            /*   */
            /* 4 */
            return Ml0.Go(1893, this.VP.o60(false));
            /*   */
        }
        /* 6 */
        if (!this.Zs.nr.isEmpty())
            /* 7 */ return this.Zs.nr;
        UD0 uD0;
        /* 8 */
        if ((uD0 = this.VP) == null) return "???";
        /* 9 */
        return o60(false);
    }

    /*   */
    /*   */
    /*   */   public Q90 Zs;
    /*   */   public Sf Fq0;
    /*   */   public UD0 LPT4;
    /*   */   public UD0 VP;
    /*   */   public short cY = 0;

    /*   */
    /*   */
    public j40(Q90 paramQ90) {
        /*   */
        super(paramQ90.Z90());
        /*   */
        this.Zs = paramQ90;
        /*   */
        this.Fq0 = new Sf(this);
        /*   */
        If0(On.v30().lpT3(paramQ90.u60()));
        /*   */
    }

    /*   */
    /*   */
    public final String Hn() {
        /*   */
        if (this.Zs.YC())
            /*   */ return Ml0.Go(1893, this.VP.o60(false));
        /*   */
        return this.VP.o60(false);
        /*   */
    }

    /*   */
    /*   */
    public final short qI0() {
        /*   */
        return this.Zs.Cw0;
        /*   */
    }

    /*   */
    /*   */
    public final boolean Q00() {
        /*   */
        return this.Zs.YC();
        /*   */
    }

    /*   */
    /*   */
    public final boolean ol0() {
        /*   */
        return this.Zs.da();
        /*   */
    }

    /*   */
    /*   */
    public final Q90 eC() {
        /*   */
        return this.Zs;
        /*   */
    }

    /*   */
    /*   */
    public final Sf nB0() {
        /*   */
        return this.Fq0;
        /*   */
    }

    /*   */
    /*   */
    public final byte s5() {
        /*   */
        UD0 uD0;
        /*   */
        if ((uD0 = this.VP) == null)
            /*   */ return -1;
        /*   */
        int i;
        /*   */
        if ((i = uD0.FD) != 0) {
            /*   */
            if (i != 254) {
                /*   */
                if (i != 255)
                    /*   */ return (((byte) this.Zs.MD0 & 0xFF) >= i) ? 0 : 1;
                /*   */
                return -1;
                /*   */
            }
            /*   */
            return 1;
            /*   */
        }
        /*   */
        return 0;
        /*   */
    }

    /*   */
    /*   */
    public final UD0 Ek() {
        /*   */
        return this.VP;
        /*   */
    }

    /*   */
    /*   */
    public final UD0 h60() {
        /*   */
        return this.LPT4;
        /*   */
    }

    /*   */
    /*   */
    public final void If0(UD0 paramUD0) {
        /*   */
        this.VP = paramUD0;
        /*   */
        this.LPT4 = paramUD0;
        /*   */
        if (paramUD0.TL > 0 && this.Zs.Vp > 0)
            /*   */ this.LPT4 = On.v30().lpT3((short) (paramUD0.TL + this.Zs.Vp - 1));
        /*   */
    }

    /*   */
    /*   */
    public final Ht0 rG() {
        /*   */
        return this.LPT4.Sl0(this.Zs.Vp);
        /*   */
    }

    /*   */
    /*   */
    public final Ht0 OH() {
        /*   */
        return this.LPT4.pf0(this.Zs.Vp);
        /*   */
    }

    /*   */
    /*   */
    public final short K20() {
        /*   */
        return this.cY;
        /*   */
    }

    /*   */
    /*   */
    public final short rX() {
        /*   */
        short s;
        /*   */
        if ((s = this.LPT4.zq0(this.Zs.cC)) == 0)
            /*   */ s = this.LPT4.zq0(0);
        /*   */
        return s;
        /*   */
    }

    /*   */
    /*   */
    public final boolean pJ0(String[] paramArrayOfString) {
        /*   */     // Byte code:
        /*   */     //   0: aload_1
        /*   */     //   1: ifnull -> 324
        /*   */     //   4: aload_1
        /*   */     //   5: arraylength
        /*   */     //   6: iconst_1
        /*   */     //   7: if_icmpge -> 13
        /*   */     //   10: goto -> 324
        /*   */     //   13: aload_1
        /*   */     //   14: arraylength
        /*   */     //   15: istore_2
        /*   */     //   16: iconst_0
        /*   */     //   17: istore_3
        /*   */     //   18: iload_3
        /*   */     //   19: iload_2
        /*   */     //   20: if_icmpge -> 322
        /*   */     //   23: aload_1
        /*   */     //   24: iload_3
        /*   */     //   25: aaload
        /*   */     //   26: dup
        /*   */     //   27: astore #4
        /*   */     //   29: invokevirtual isEmpty : ()Z
        /*   */     //   32: ifeq -> 38
        /*   */     //   35: goto -> 316
        /*   */     //   38: aload_0
        /*   */     //   39: invokevirtual m : ()Ljava/lang/String;
        /*   */     //   42: aload #4
        /*   */     //   44: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   47: ifne -> 306
        /*   */     //   50: aload_0
        /*   */     //   51: getfield VP : Lf/UD0;
        /*   */     //   54: iconst_0
        /*   */     //   55: invokevirtual o60 : (Z)Ljava/lang/String;
        /*   */     //   58: aload #4
        /*   */     //   60: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   63: ifeq -> 69
        /*   */     //   66: goto -> 306
        /*   */     //   69: aload_0
        /*   */     //   70: getfield Zs : Lf/Q90;
        /*   */     //   73: getfield En0 : [S
        /*   */     //   76: dup
        /*   */     //   77: astore #5
        /*   */     //   79: arraylength
        /*   */     //   80: istore #6
        /*   */     //   82: iconst_0
        /*   */     //   83: istore #7
        /*   */     //   85: iload #7
        /*   */     //   87: iload #6
        /*   */     //   89: if_icmpge -> 120
        /*   */     //   92: aload #5
        /*   */     //   94: iload #7
        /*   */     //   96: saload
        /*   */     //   97: ldc 110000
        /*   */     //   99: iadd
        /*   */     //   100: invokestatic OH0 : (I)Ljava/lang/String;
        /*   */     //   103: aload #4
        /*   */     //   105: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   108: ifeq -> 114
        /*   */     //   111: goto -> 306
        /*   */     //   114: iinc #7, 1
        /*   */     //   117: goto -> 85
        /*   */     //   120: aload_0
        /*   */     //   121: invokevirtual rX : ()S
        /*   */     //   124: ldc 210000
        /*   */     //   126: iadd
        /*   */     //   127: invokestatic OH0 : (I)Ljava/lang/String;
        /*   */     //   130: aload #4
        /*   */     //   132: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   135: ifeq -> 141
        /*   */     //   138: goto -> 306
        /*   */     //   141: aload_0
        /*   */     //   142: getfield LPT4 : Lf/UD0;
        /*   */     //   145: astore #5
        /*   */     //   147: iconst_2
        /*   */     //   148: dup
        /*   */     //   149: istore #6
        /*   */     //   151: anewarray f/Ht0
        /*   */     //   154: dup
        /*   */     //   155: astore #7
        /*   */     //   157: aload #5
        /*   */     //   159: aload #7
        /*   */     //   161: aload #5
        /*   */     //   163: getfield FH : Lf/Ht0;
        /*   */     //   166: iconst_0
        /*   */     //   167: swap
        /*   */     //   168: aastore
        /*   */     //   169: getfield e6 : Lf/Ht0;
        /*   */     //   172: iconst_1
        /*   */     //   173: swap
        /*   */     //   174: aastore
        /*   */     //   175: iconst_0
        /*   */     //   176: istore #5
        /*   */     //   178: iload #5
        /*   */     //   180: iload #6
        /*   */     //   182: if_icmpge -> 221
        /*   */     //   185: aload #7
        /*   */     //   187: iload #5
        /*   */     //   189: aaload
        /*   */     //   190: dup
        /*   */     //   191: astore #8
        /*   */     //   193: ifnonnull -> 199
        /*   */     //   196: goto -> 215
        /*   */     //   199: aload #8
        /*   */     //   201: invokevirtual mn0 : ()Ljava/lang/String;
        /*   */     //   204: aload #4
        /*   */     //   206: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   209: ifeq -> 215
        /*   */     //   212: goto -> 306
        /*   */     //   215: iinc #5, 1
        /*   */     //   218: goto -> 178
        /*   */     //   221: aload_0
        /*   */     //   222: getfield Zs : Lf/Q90;
        /*   */     //   225: invokevirtual p10 : ()S
        /*   */     //   228: ifle -> 261
        /*   */     //   231: getstatic f/Of.eH : Lf/Of;
        /*   */     //   234: aload_0
        /*   */     //   235: getfield Zs : Lf/Q90;
        /*   */     //   238: invokevirtual p10 : ()S
        /*   */     //   241: invokevirtual On0 : (S)Lf/LPT3;
        /*   */     //   244: getfield Iu : I
        /*   */     //   247: invokestatic OH0 : (I)Ljava/lang/String;
        /*   */     //   250: aload #4
        /*   */     //   252: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   255: ifeq -> 261
        /*   */     //   258: goto -> 306
        /*   */     //   261: aload_0
        /*   */     //   262: getfield Zs : Lf/Q90;
        /*   */     //   265: getfield k0 : Lf/nV;
        /*   */     //   268: invokevirtual cK0 : ()Ljava/lang/String;
        /*   */     //   271: aload #4
        /*   */     //   273: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   276: ifeq -> 282
        /*   */     //   279: goto -> 306
        /*   */     //   282: aload_0
        /*   */     //   283: getfield Zs : Lf/Q90;
        /*   */     //   286: invokevirtual lG : ()Ljava/lang/String;
        /*   */     //   289: aload #4
        /*   */     //   291: invokestatic qS : (Ljava/lang/String;Ljava/lang/String;)Z
        /*   */     //   294: ifeq -> 300
        /*   */     //   297: goto -> 306
        /*   */     //   300: iconst_0
        /*   */     //   301: istore #4
        /*   */     //   303: goto -> 309
        /*   */     //   306: iconst_1
        /*   */     //   307: istore #4
        /*   */     //   309: iload #4
        /*   */     //   311: ifne -> 316
        /*   */     //   314: iconst_0
        /*   */     //   315: ireturn
        /*   */     //   316: iinc #3, 1
        /*   */     //   319: goto -> 18
        /*   */     //   322: iconst_1
        /*   */     //   323: ireturn
        /*   */     //   324: iconst_1
        /*   */     //   325: ireturn
        /*   */     // Line number table:
        /*   */     //   Java source line number -> byte code offset
        /*   */     //   #1	-> 39
        /*   */     //   #2	-> 55
        /*   */     //   #3	-> 60
        /*   */     //   #4	-> 70
        /*   */     //   #5	-> 73
        /*   */     //   #6	-> 79
        /*   */     //   #7	-> 142
        /*   */     //   #8	-> 151
        /*   */     //   #9	-> 163
        /*   */     //   #10	-> 168
        /*   */     //   #11	-> 189
        /*   */     //   #12	-> 222
        /*   */     //   #13	-> 225
        /*   */     //   #14	-> 231
        /*   */     //   #15	-> 235
        /*   */     //   #16	-> 238
        /*   */     //   #17	-> 244
        /*   */     //   #18	-> 252
        /*   */     //   #19	-> 265
        /*   */     //   #20	-> 268
        /*   */     //   #21	-> 283
        /*   */     //   #22	-> 286
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */