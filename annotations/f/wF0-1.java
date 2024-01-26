/*  1 */
package f;

public final class wF0 implements Runnable {
    public final void run() {
        if (this.uI.zy()) CF0();
        for (j10 j10 = this.UM.coM2(); j10.hasNext(); ) {
            BI bI;
            (bI = ((fk) j10.next()).LL).getClass();
            s3[] arrayOfS3;
            int i;
            byte b;
            /*  2 */
            for (i = (arrayOfS3 = s3.values()).length, b = 0; b < i; ) {
                boolean bool;
                int j = arrayOfS3[b].ordinal();
                /*  3 */
                try {
                    s3 s3;
                    if ((s3 = (s3) BI.r0.get(j)) != null && bI
/*  4 */.Fp0.t50(s3)) {
                        bool = true;
                    } else {
                        bool = false;
                    }
                } catch (l9 l9) {
                    bI.hp0();
                    bool = false;
                } catch (NullPointerException nullPointerException) {
                }
                if (bool != (
                        /*  5 */           (Boolean) bI.Z1.get(j)).booleanValue()) {
                    if (bool) {
                        bI.fJ.KL(bI, j);
                    } else {
                        bI.fJ.F0(bI, j);
                    }
                    Lpt7 lpt7;
                    if ((lpt7 = BI.Lq0)
                            /*  6 */.q1 == 3)
                        /*    */ {
                        String str;
                        /*    */
                        /*  9 */
                        StringBuilder stringBuilder = HB0.DH0("Button [", j, " - ").append(BI.r0.get(j)).append("] is ");
                        if (bool) {
                            str = "pressed";
                        } else {
                            str = "released";
                        }
                        lpt7.zK0(stringBuilder.append(str).toString());
                    }
                }
                bI.Z1.tD0(j, Boolean.valueOf(bool));
                b++;
            }
            /* 10 */
            kB[] arrayOfKB;
            for (i = (arrayOfKB = kB.values()).length, b = 0; b < i; ) {
                float f;
                int j = arrayOfKB[b].ordinal();
                /* 11 */
                try {
                    kB kB;
                    if ((kB = (kB) BI.D2.get(j)) == null) {
                        f = 0.0F;
                    }
                    /* 12 */
                    else {
                        f = bI.Fp0.QK0(f);
                    }
                } catch (l9 l9) {
                    bI.hp0();
                    f = 0.0F;
                } catch (NullPointerException nullPointerException) {
                }
                if (f != (
                        /* 13 */           (Float) bI.jb0.get(j)).floatValue()) {
                    Lpt7 lpt7;
                    if ((lpt7 = BI.Lq0)
                            /* 14 */.q1 == 3) lpt7
/*    */
/*    */
/* 17 */.zK0(HB0.DH0("Axis [", j, " - ").append(BI.D2.get(j)).append("] moved [").append(f).append("]").toString());
                    bI.fJ.CoM2(bI, j, f);
                }
                bI.jb0.tD0(j, Float.valueOf(f));
                b++;
            }
            /* 18 */
            if (!bI.S9) j10
/* 19 */.remove();
        }
        /* 20 */
        UB0.Kg0.fN(this);
    }

    /*    */
    /*    */
    /*    */   public final ControllerManager uI;
    /*    */   public final tx My0;
    /*    */   public final y10 UM;
    /*    */   public final fQ if0;

    /*    */
    /*    */
    public wF0(ControllerManager paramControllerManager, tx paramtx) {
        /*    */
        JamepadControllerManager.jamepadConfiguration.getClass();
        /*    */
        this.UM = new y10(4);
        /*    */
        this.if0 = new fQ();
        /*    */
        this.uI = paramControllerManager;
        /*    */
        this.My0 = paramtx;
        /*    */
        CF0();
        /*    */
    }

    /*    */
    /*    */
    public final void CF0() {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield UM : Lf/y10;
        /*    */     //   4: invokevirtual coM2 : ()Lf/j10;
        /*    */     //   7: dup
        /*    */     //   8: astore_1
        /*    */     //   9: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   12: pop
        /*    */     //   13: aload_1
        /*    */     //   14: invokevirtual hasNext : ()Z
        /*    */     //   17: ifeq -> 44
        /*    */     //   20: aload_1
        /*    */     //   21: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   24: checkcast f/fk
        /*    */     //   27: dup
        /*    */     //   28: astore_2
        /*    */     //   29: getfield LL : Lf/BI;
        /*    */     //   32: aload_2
        /*    */     //   33: aconst_null
        /*    */     //   34: putfield rF : Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   37: aconst_null
        /*    */     //   38: putfield Fp0 : Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   41: goto -> 13
        /*    */     //   44: aload_0
        /*    */     //   45: getfield if0 : Lf/fQ;
        /*    */     //   48: invokevirtual clear : ()V
        /*    */     //   51: getstatic com/badlogic/gdx/controllers/desktop/JamepadControllerManager.jamepadConfiguration : Lf/XE0;
        /*    */     //   54: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   57: pop
        /*    */     //   58: iconst_4
        /*    */     //   59: istore_1
        /*    */     //   60: iconst_0
        /*    */     //   61: istore_2
        /*    */     //   62: iload_2
        /*    */     //   63: iload_1
        /*    */     //   64: if_icmpge -> 221
        /*    */     //   67: aload_0
        /*    */     //   68: getfield uI : Lcom/studiohartman/jamepad/ControllerManager;
        /*    */     //   71: dup
        /*    */     //   72: astore_3
        /*    */     //   73: getfield wH0 : Z
        /*    */     //   76: ifeq -> 203
        /*    */     //   79: aload_3
        /*    */     //   80: getfield coM4 : [Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   83: iload_2
        /*    */     //   84: aaload
        /*    */     //   85: dup
        /*    */     //   86: astore_3
        /*    */     //   87: invokevirtual Yb : ()I
        /*    */     //   90: dup
        /*    */     //   91: istore #4
        /*    */     //   93: aload_0
        /*    */     //   94: getfield UM : Lf/y10;
        /*    */     //   97: astore #5
        /*    */     //   99: ifne -> 112
        /*    */     //   102: aload #5
        /*    */     //   104: getfield yq0 : Z
        /*    */     //   107: istore #5
        /*    */     //   109: goto -> 131
        /*    */     //   112: aload #5
        /*    */     //   114: iload #4
        /*    */     //   116: invokevirtual Kz : (I)I
        /*    */     //   119: iflt -> 128
        /*    */     //   122: iconst_1
        /*    */     //   123: istore #5
        /*    */     //   125: goto -> 131
        /*    */     //   128: iconst_0
        /*    */     //   129: istore #5
        /*    */     //   131: iload #5
        /*    */     //   133: ifeq -> 163
        /*    */     //   136: aload_0
        /*    */     //   137: getfield UM : Lf/y10;
        /*    */     //   140: iload #4
        /*    */     //   142: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   145: checkcast f/fk
        /*    */     //   148: dup
        /*    */     //   149: aload_3
        /*    */     //   150: putfield rF : Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   153: getfield LL : Lf/BI;
        /*    */     //   156: aload_3
        /*    */     //   157: putfield Fp0 : Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   160: goto -> 215
        /*    */     //   163: aload_0
        /*    */     //   164: dup
        /*    */     //   165: new f/fk
        /*    */     //   168: dup
        /*    */     //   169: astore #5
        /*    */     //   171: aload_3
        /*    */     //   172: invokespecial <init> : (Lcom/studiohartman/jamepad/ControllerIndex;)V
        /*    */     //   175: getfield UM : Lf/y10;
        /*    */     //   178: iload #4
        /*    */     //   180: aload #5
        /*    */     //   182: invokevirtual tD0 : (ILjava/lang/Object;)V
        /*    */     //   185: getfield if0 : Lf/fQ;
        /*    */     //   188: aload #5
        /*    */     //   190: getfield LL : Lf/BI;
        /*    */     //   193: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   196: goto -> 215
        /*    */     //   199: pop
        /*    */     //   200: goto -> 215
        /*    */     //   203: new java/lang/IllegalStateException
        /*    */     //   206: dup
        /*    */     //   207: ldc_w 'SDL_GameController is not initialized!'
        /*    */     //   210: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   213: athrow
        /*    */     //   214: pop
        /*    */     //   215: iinc #2, 1
        /*    */     //   218: goto -> 62
        /*    */     //   221: aload_0
        /*    */     //   222: getfield UM : Lf/y10;
        /*    */     //   225: invokevirtual coM2 : ()Lf/j10;
        /*    */     //   228: astore_1
        /*    */     //   229: aload_1
        /*    */     //   230: invokevirtual hasNext : ()Z
        /*    */     //   233: ifeq -> 265
        /*    */     //   236: aload_1
        /*    */     //   237: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   240: checkcast f/fk
        /*    */     //   243: dup
        /*    */     //   244: astore_2
        /*    */     //   245: getfield rF : Lcom/studiohartman/jamepad/ControllerIndex;
        /*    */     //   248: ifnonnull -> 229
        /*    */     //   251: aload_1
        /*    */     //   252: aload_2
        /*    */     //   253: getfield LL : Lf/BI;
        /*    */     //   256: invokevirtual hp0 : ()V
        /*    */     //   259: invokevirtual remove : ()V
        /*    */     //   262: goto -> 229
        /*    */     //   265: aload_0
        /*    */     //   266: getfield if0 : Lf/fQ;
        /*    */     //   269: invokevirtual r30 : ()Lf/Hc0;
        /*    */     //   272: astore_1
        /*    */     //   273: aload_1
        /*    */     //   274: invokevirtual hasNext : ()Z
        /*    */     //   277: ifeq -> 317
        /*    */     //   280: aload_0
        /*    */     //   281: dup
        /*    */     //   282: aload_1
        /*    */     //   283: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   286: checkcast f/BI
        /*    */     //   289: astore_2
        /*    */     //   290: getfield My0 : Lf/tx;
        /*    */     //   293: aload_2
        /*    */     //   294: getfield fJ : Lf/BL;
        /*    */     //   297: getfield JK0 : Ljava/util/LinkedList;
        /*    */     //   300: swap
        /*    */     //   301: invokevirtual add : (Ljava/lang/Object;)Z
        /*    */     //   304: pop
        /*    */     //   305: getfield My0 : Lf/tx;
        /*    */     //   308: aload_2
        /*    */     //   309: invokeinterface cq0 : (Lf/BI;)V
        /*    */     //   314: goto -> 273
        /*    */     //   317: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 38
        /*    */     //   #2	-> 45
        /*    */     //   #3	-> 73
        /*    */     //   #4	-> 80
        /*    */     //   #5	-> 87
        /*    */     //   #6	-> 104
        /*    */     //   #7	-> 137
        /*    */     //   #8	-> 157
        /*    */     //   #9	-> 165
        /*    */     //   #10	-> 203
        /*    */     //   #11	-> 222
        /*    */     //   #12	-> 294
        /*    */     //   #13	-> 297
        /*    */     //   #14	-> 301
        /*    */     //   #15	-> 305
        /*    */     // Exception table:
        /*    */     //   from	to	target	type
        /*    */     //   67	71	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   73	76	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   79	85	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   87	90	199	f/l9
        /*    */     //   87	90	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   93	97	199	f/l9
        /*    */     //   93	97	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   102	107	199	f/l9
        /*    */     //   102	107	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   112	119	199	f/l9
        /*    */     //   112	119	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   136	168	199	f/l9
        /*    */     //   136	168	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   171	199	199	f/l9
        /*    */     //   171	199	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   203	214	214	java/lang/ArrayIndexOutOfBoundsException
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wF0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */