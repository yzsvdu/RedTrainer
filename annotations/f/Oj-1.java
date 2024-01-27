/*  1 */
package f;

public final class Oj extends Pw {
    public final void Gn0() {
        if (kJ0.st0) {
            Kv kv;
            this(UB0.go);
            UB0.re0 = UB0.go = new Kv();
            UB0.M60.zW = kv;
        }
        super
/*  2 */.Gn0();
        /*  3 */
        fl0.IJ0("lwjgl_version", Version.getVersion(), "LWJGL version", false);
        /*  4 */
        this();
        pE pE1;
        kS kS;
        (kS = new kS())
                /*  5 */.t20 = this.RX;
        /*    */
        Texture texture;
        /*  7 */
        if ((texture = ( interface.ZZ()).xs) ==null){
            texture = null;
        }
        /*  8 */     else{
            pE pE2;
            tw tw = km.wI0.zn;
            int i = texture.getWidth(), j = texture.getHeight(), k = texture.getWidth(), m = texture.getHeight();
            pRn pRn = pRn.WHITE;
            this(tw, texture, i, j, k, m, pRn);
            pE1 = pE2;
        }
        this
                /*  9 */.mT = pE1;
        try {
            js js = this.js0;
            tw tw = this.zn;
            xR xR = km.ek;
            Tm tm = this.zb;
            (this.LK = new Rp0(this, js, tw, kS, xR, tm))
                    /* 10 */.xQ = false;
        } catch (Exception exception) {
            exception
/* 11 */.printStackTrace();
        }
        Rp0 rp0;
        if ((rp0 = this.LK) != null) {
            kS
                    /* 12 */.NF = rp0;
            /* 13 */
            km.ek
/* 14 */.Ue
/* 15 */.Com3(kS);
            /* 16 */
            Rp0 rp01 = this.LK;
            String str;
            dS dS;
            /* 17 */
            if ((dS = as0(this.zn, str = h1.MW)) != null) {
                dS dS2;
                if ((dS2 = this.Iv) != null) dS2.Ka0();
                this.Iv = dS;
                rp01.XX(dS);
                rp01.Pb0(500);
                dS dS1;
                if (this.Z5 != null && (dS1 = as0(this.tH, str)) != null) this.Z5.XX(dS1);
            }
            /* 18 */
            km.iE0.LY(h1.c20);
        }
        /*    */
    }

    /*    */
    /*    */
    /*    */   public static final ik gm0 = C00.gd(Oj.class);
    /*    */   public pE mT = null;

    /*    */
    /*    */
    public static void Q3(Oj paramOj) {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield oq0 : Z
        /*    */     //   4: ifne -> 10
        /*    */     //   7: goto -> 1865
        /*    */     //   10: aload_0
        /*    */     //   11: getfield js0 : Lf/js;
        /*    */     //   14: dup
        /*    */     //   15: astore_1
        /*    */     //   16: ifnull -> 169
        /*    */     //   19: getstatic f/km.u4 : Lf/R8;
        /*    */     //   22: dup
        /*    */     //   23: astore_2
        /*    */     //   24: ifnull -> 169
        /*    */     //   27: aload_2
        /*    */     //   28: getfield XQ : Z
        /*    */     //   31: ifeq -> 169
        /*    */     //   34: aload_2
        /*    */     //   35: getfield yu : Z
        /*    */     //   38: ifne -> 169
        /*    */     //   41: aload_2
        /*    */     //   42: iconst_1
        /*    */     //   43: putfield yu : Z
        /*    */     //   46: getstatic f/km.kH0 : Lf/Qz0;
        /*    */     //   49: invokevirtual xy0 : ()Z
        /*    */     //   52: ifeq -> 108
        /*    */     //   55: getstatic f/km.kH0 : Lf/Qz0;
        /*    */     //   58: dup
        /*    */     //   59: dup
        /*    */     //   60: astore_1
        /*    */     //   61: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   64: pop
        /*    */     //   65: invokestatic KQ : ()V
        /*    */     //   68: getfield W50 : Lf/Fy;
        /*    */     //   71: dup
        /*    */     //   72: astore_2
        /*    */     //   73: ifnull -> 87
        /*    */     //   76: aload_1
        /*    */     //   77: dup
        /*    */     //   78: aload_2
        /*    */     //   79: invokevirtual jf0 : (Lf/JG0;)Z
        /*    */     //   82: pop
        /*    */     //   83: aconst_null
        /*    */     //   84: putfield W50 : Lf/Fy;
        /*    */     //   87: aload_1
        /*    */     //   88: dup
        /*    */     //   89: dup
        /*    */     //   90: getfield A5 : Lf/Ut0;
        /*    */     //   93: invokevirtual clear : ()V
        /*    */     //   96: getfield D1 : Lf/fQ;
        /*    */     //   99: invokevirtual clear : ()V
        /*    */     //   102: invokevirtual gx : ()V
        /*    */     //   105: goto -> 46
        /*    */     //   108: aload_0
        /*    */     //   109: getfield js0 : Lf/js;
        /*    */     //   112: dup
        /*    */     //   113: astore_0
        /*    */     //   114: getstatic f/km.u4 : Lf/R8;
        /*    */     //   117: getfield uk : Lf/cG;
        /*    */     //   120: astore_1
        /*    */     //   121: getfield Tc : Lf/us0;
        /*    */     //   124: dup
        /*    */     //   125: astore_2
        /*    */     //   126: ifnull -> 134
        /*    */     //   129: aload_2
        /*    */     //   130: invokevirtual ra0 : ()Z
        /*    */     //   133: pop
        /*    */     //   134: aload_0
        /*    */     //   135: dup
        /*    */     //   136: dup
        /*    */     //   137: dup2
        /*    */     //   138: new f/us0
        /*    */     //   141: dup
        /*    */     //   142: dup
        /*    */     //   143: astore_2
        /*    */     //   144: aload_0
        /*    */     //   145: aload_1
        /*    */     //   146: invokespecial <init> : (Lf/js;Lf/cG;)V
        /*    */     //   149: putfield Tc : Lf/us0;
        /*    */     //   152: invokevirtual Ub : ()I
        /*    */     //   155: aload_2
        /*    */     //   156: swap
        /*    */     //   157: invokevirtual si : (Lf/JG0;I)V
        /*    */     //   160: getfield Tc : Lf/us0;
        /*    */     //   163: invokevirtual Af : (Lf/JG0;)V
        /*    */     //   166: goto -> 1865
        /*    */     //   169: getstatic f/km.a3 : Lf/vh0;
        /*    */     //   172: ifnull -> 1865
        /*    */     //   175: aload_1
        /*    */     //   176: getfield MH0 : Lf/pA;
        /*    */     //   179: ifnonnull -> 185
        /*    */     //   182: goto -> 1865
        /*    */     //   185: aload_0
        /*    */     //   186: getfield RX : Lf/Bn0;
        /*    */     //   189: invokevirtual nF : ()V
        /*    */     //   192: getstatic f/km.a3 : Lf/vh0;
        /*    */     //   195: getfield Ct : Lf/Jo;
        /*    */     //   198: astore_1
        /*    */     //   199: getstatic f/km.u4 : Lf/R8;
        /*    */     //   202: dup
        /*    */     //   203: astore_2
        /*    */     //   204: ifnull -> 1865
        /*    */     //   207: aload_2
        /*    */     //   208: invokevirtual NR : ()Z
        /*    */     //   211: ifne -> 1865
        /*    */     //   214: getstatic f/km.u4 : Lf/R8;
        /*    */     //   217: getfield tN : Z
        /*    */     //   220: ifne -> 1865
        /*    */     //   223: aload_0
        /*    */     //   224: getfield iJ0 : Lf/Xi;
        /*    */     //   227: dup
        /*    */     //   228: astore_2
        /*    */     //   229: ifnull -> 1865
        /*    */     //   232: aload_2
        /*    */     //   233: getfield w6 : Z
        /*    */     //   236: ifeq -> 1865
        /*    */     //   239: aload_2
        /*    */     //   240: invokevirtual su : ()Z
        /*    */     //   243: ifne -> 1865
        /*    */     //   246: aload_0
        /*    */     //   247: getfield js0 : Lf/js;
        /*    */     //   250: dup
        /*    */     //   251: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   254: pop
        /*    */     //   255: invokestatic com3 : (Lf/JG0;)Z
        /*    */     //   258: ifne -> 1865
        /*    */     //   261: aload_0
        /*    */     //   262: getfield js0 : Lf/js;
        /*    */     //   265: getfield iV : Lf/FO;
        /*    */     //   268: ifnonnull -> 1865
        /*    */     //   271: aload_1
        /*    */     //   272: ifnull -> 1865
        /*    */     //   275: aload_1
        /*    */     //   276: getfield pm : Lf/d7;
        /*    */     //   279: getfield ew0 : Ljava/util/LinkedList;
        /*    */     //   282: invokeinterface isEmpty : ()Z
        /*    */     //   287: ifeq -> 1865
        /*    */     //   290: getstatic f/km.MR : Lf/Gp0;
        /*    */     //   293: ifnonnull -> 1865
        /*    */     //   296: getstatic f/km.kH0 : Lf/Qz0;
        /*    */     //   299: invokevirtual xy0 : ()Z
        /*    */     //   302: ifne -> 1865
        /*    */     //   305: aload_0
        /*    */     //   306: getfield js0 : Lf/js;
        /*    */     //   309: getfield MH0 : Lf/pA;
        /*    */     //   312: getfield Qp0 : Lf/finally;
        /*    */     //   315: invokevirtual p3 : ()Z
        /*    */     //   318: ifne -> 1865
        /*    */     //   321: aload_0
        /*    */     //   322: getfield js0 : Lf/js;
        /*    */     //   325: getfield MH0 : Lf/pA;
        /*    */     //   328: dup
        /*    */     //   329: astore_2
        /*    */     //   330: getfield hG : Lf/hI0;
        /*    */     //   333: ifnonnull -> 1865
        /*    */     //   336: getstatic f/ro.l10 : B
        /*    */     //   339: ifne -> 1865
        /*    */     //   342: aload_2
        /*    */     //   343: getfield La0 : Lf/lU;
        /*    */     //   346: ifnull -> 353
        /*    */     //   349: iconst_1
        /*    */     //   350: goto -> 354
        /*    */     //   353: iconst_0
        /*    */     //   354: ifne -> 1865
        /*    */     //   357: aload_2
        /*    */     //   358: getfield Zr0 : Lf/qt0;
        /*    */     //   361: ifnonnull -> 1865
        /*    */     //   364: aload_2
        /*    */     //   365: getfield LU : Lf/A8;
        /*    */     //   368: ifnonnull -> 1865
        /*    */     //   371: aload_2
        /*    */     //   372: getfield sC0 : Lf/TQ;
        /*    */     //   375: ifnonnull -> 1865
        /*    */     //   378: aload_2
        /*    */     //   379: getfield OU : Lf/h2;
        /*    */     //   382: invokevirtual p3 : ()Z
        /*    */     //   385: ifne -> 1865
        /*    */     //   388: aload_0
        /*    */     //   389: getfield js0 : Lf/js;
        /*    */     //   392: getfield MH0 : Lf/pA;
        /*    */     //   395: getfield TF : Lf/wu;
        /*    */     //   398: getfield Qo : Lf/rS;
        /*    */     //   401: invokevirtual p3 : ()Z
        /*    */     //   404: ifne -> 1865
        /*    */     //   407: aload_0
        /*    */     //   408: getfield Zp : Lf/dw;
        /*    */     //   411: dup
        /*    */     //   412: astore_2
        /*    */     //   413: ifnull -> 423
        /*    */     //   416: aload_2
        /*    */     //   417: invokevirtual Dm0 : ()Z
        /*    */     //   420: ifeq -> 1865
        /*    */     //   423: getstatic f/km.a3 : Lf/vh0;
        /*    */     //   426: invokevirtual Jr0 : ()Lf/KI;
        /*    */     //   429: astore_2
        /*    */     //   430: getstatic f/km.n20 : Lf/q7;
        /*    */     //   433: getfield qO : Z
        /*    */     //   436: ifne -> 451
        /*    */     //   439: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   442: getstatic f/BM.lc : Lf/BM;
        /*    */     //   445: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   448: ifeq -> 467
        /*    */     //   451: aload_2
        /*    */     //   452: ifnull -> 467
        /*    */     //   455: aload_2
        /*    */     //   456: invokevirtual J4 : ()Z
        /*    */     //   459: ifeq -> 467
        /*    */     //   462: iconst_1
        /*    */     //   463: istore_2
        /*    */     //   464: goto -> 469
        /*    */     //   467: iconst_0
        /*    */     //   468: istore_2
        /*    */     //   469: aload_1
        /*    */     //   470: iconst_4
        /*    */     //   471: invokevirtual so0 : (B)Z
        /*    */     //   474: ifeq -> 537
        /*    */     //   477: aload_1
        /*    */     //   478: bipush #17
        /*    */     //   480: invokevirtual so0 : (B)Z
        /*    */     //   483: ifne -> 537
        /*    */     //   486: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   489: getstatic f/BM.lc : Lf/BM;
        /*    */     //   492: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   495: ifeq -> 537
        /*    */     //   498: aload_0
        /*    */     //   499: getfield k8 : J
        /*    */     //   502: lconst_0
        /*    */     //   503: lcmp
        /*    */     //   504: ifne -> 514
        /*    */     //   507: aload_0
        /*    */     //   508: invokestatic currentTimeMillis : ()J
        /*    */     //   511: putfield k8 : J
        /*    */     //   514: invokestatic currentTimeMillis : ()J
        /*    */     //   517: aload_0
        /*    */     //   518: getfield k8 : J
        /*    */     //   521: lsub
        /*    */     //   522: ldc2_w 1000
        /*    */     //   525: lcmp
        /*    */     //   526: ifle -> 547
        /*    */     //   529: aload_0
        /*    */     //   530: iconst_1
        /*    */     //   531: putfield dv0 : Z
        /*    */     //   534: goto -> 547
        /*    */     //   537: aload_0
        /*    */     //   538: dup
        /*    */     //   539: lconst_0
        /*    */     //   540: putfield k8 : J
        /*    */     //   543: iconst_0
        /*    */     //   544: putfield dv0 : Z
        /*    */     //   547: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   550: getstatic f/BM.ni : Lf/BM;
        /*    */     //   553: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   556: dup
        /*    */     //   557: istore_3
        /*    */     //   558: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   561: getstatic f/BM.N70 : Lf/BM;
        /*    */     //   564: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   567: istore #4
        /*    */     //   569: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   572: getstatic f/BM.Oq : Lf/BM;
        /*    */     //   575: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   578: istore #5
        /*    */     //   580: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   583: getstatic f/BM.M8 : Lf/BM;
        /*    */     //   586: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   589: istore #6
        /*    */     //   591: ifne -> 1396
        /*    */     //   594: iload #4
        /*    */     //   596: ifne -> 1396
        /*    */     //   599: iload #5
        /*    */     //   601: ifne -> 1396
        /*    */     //   604: iload #6
        /*    */     //   606: ifne -> 1396
        /*    */     //   609: aload_0
        /*    */     //   610: getfield dv0 : Z
        /*    */     //   613: dup
        /*    */     //   614: istore_3
        /*    */     //   615: ifeq -> 627
        /*    */     //   618: getstatic f/km.u4 : Lf/R8;
        /*    */     //   621: iconst_m1
        /*    */     //   622: iload_2
        /*    */     //   623: iload_3
        /*    */     //   624: invokevirtual jF : (BZZ)V
        /*    */     //   627: invokestatic currentTimeMillis : ()J
        /*    */     //   630: getstatic f/km.kH0 : Lf/Qz0;
        /*    */     //   633: getfield Kd0 : J
        /*    */     //   636: lsub
        /*    */     //   637: ldc2_w 200
        /*    */     //   640: lcmp
        /*    */     //   641: ifle -> 1330
        /*    */     //   644: aload_0
        /*    */     //   645: getfield uG : Z
        /*    */     //   648: ifne -> 1313
        /*    */     //   651: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   654: getstatic f/BM.bC : Lf/BM;
        /*    */     //   657: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   660: ifeq -> 1313
        /*    */     //   663: aload_1
        /*    */     //   664: getfield pm : Lf/d7;
        /*    */     //   667: invokevirtual gD0 : ()Z
        /*    */     //   670: ifeq -> 1313
        /*    */     //   673: getstatic f/km.u4 : Lf/R8;
        /*    */     //   676: getfield zl : Lf/Z;
        /*    */     //   679: getfield lpt7 : Lf/e2;
        /*    */     //   682: invokevirtual Po0 : ()Z
        /*    */     //   685: ifeq -> 1313
        /*    */     //   688: aload_0
        /*    */     //   689: iconst_1
        /*    */     //   690: putfield uG : Z
        /*    */     //   693: getstatic f/km.u4 : Lf/R8;
        /*    */     //   696: dup
        /*    */     //   697: astore_1
        /*    */     //   698: getfield hB0 : Lf/Ca;
        /*    */     //   701: dup
        /*    */     //   702: astore_2
        /*    */     //   703: ifnull -> 723
        /*    */     //   706: aload_2
        /*    */     //   707: invokeinterface Lz0 : ()Z
        /*    */     //   712: ifeq -> 718
        /*    */     //   715: goto -> 1330
        /*    */     //   718: aload_1
        /*    */     //   719: aconst_null
        /*    */     //   720: putfield hB0 : Lf/Ca;
        /*    */     //   723: aload_1
        /*    */     //   724: getfield Qa : Lf/vh0;
        /*    */     //   727: dup
        /*    */     //   728: astore_2
        /*    */     //   729: getfield Ct : Lf/Jo;
        /*    */     //   732: dup
        /*    */     //   733: astore_3
        /*    */     //   734: ifnonnull -> 740
        /*    */     //   737: goto -> 1330
        /*    */     //   740: aload_2
        /*    */     //   741: aload_3
        /*    */     //   742: getfield HW : Lf/G5;
        /*    */     //   745: dup
        /*    */     //   746: dup
        /*    */     //   747: getfield FB : B
        /*    */     //   750: istore_2
        /*    */     //   751: getfield kD0 : B
        /*    */     //   754: istore #4
        /*    */     //   756: getfield vu0 : B
        /*    */     //   759: istore #5
        /*    */     //   761: iload_2
        /*    */     //   762: iload #4
        /*    */     //   764: iload #5
        /*    */     //   766: invokevirtual COm8 : (BBB)Lf/KI;
        /*    */     //   769: dup
        /*    */     //   770: astore_2
        /*    */     //   771: ifnonnull -> 777
        /*    */     //   774: goto -> 1330
        /*    */     //   777: aload_3
        /*    */     //   778: getfield HW : Lf/G5;
        /*    */     //   781: invokevirtual CJ0 : ()Lf/xr0;
        /*    */     //   784: dup
        /*    */     //   785: astore #4
        /*    */     //   787: ifnonnull -> 793
        /*    */     //   790: goto -> 1330
        /*    */     //   793: aload_2
        /*    */     //   794: aload #4
        /*    */     //   796: aload_3
        /*    */     //   797: getfield HW : Lf/G5;
        /*    */     //   800: getfield g50 : B
        /*    */     //   803: iconst_1
        /*    */     //   804: invokevirtual COm3 : (Lf/xr0;BI)Lf/xr0;
        /*    */     //   807: astore #5
        /*    */     //   809: iconst_0
        /*    */     //   810: istore #6
        /*    */     //   812: iload #6
        /*    */     //   814: ifeq -> 953
        /*    */     //   817: aload #5
        /*    */     //   819: ifnull -> 841
        /*    */     //   822: aload #5
        /*    */     //   824: invokevirtual hz : ()Lf/ZK0;
        /*    */     //   827: dup
        /*    */     //   828: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   831: pop
        /*    */     //   832: instanceof f/Hg0
        /*    */     //   835: ifeq -> 841
        /*    */     //   838: goto -> 953
        /*    */     //   841: aload_3
        /*    */     //   842: getfield Ae : Lf/zk0;
        /*    */     //   845: invokevirtual b1 : ()Z
        /*    */     //   848: ifeq -> 936
        /*    */     //   851: aload_3
        /*    */     //   852: getfield Ae : Lf/zk0;
        /*    */     //   855: getfield HW : Lf/G5;
        /*    */     //   858: invokevirtual CJ0 : ()Lf/xr0;
        /*    */     //   861: aload #5
        /*    */     //   863: if_acmpne -> 936
        /*    */     //   866: aload_3
        /*    */     //   867: getfield Ae : Lf/zk0;
        /*    */     //   870: getfield QN : Lf/e2;
        /*    */     //   873: invokevirtual Po0 : ()Z
        /*    */     //   876: ifeq -> 936
        /*    */     //   879: aload_3
        /*    */     //   880: invokevirtual nX : ()S
        /*    */     //   883: dup
        /*    */     //   884: istore_2
        /*    */     //   885: ifle -> 892
        /*    */     //   888: iload_2
        /*    */     //   889: invokestatic MJ0 : (S)V
        /*    */     //   892: aload_3
        /*    */     //   893: getfield Ae : Lf/zk0;
        /*    */     //   896: getfield HW : Lf/G5;
        /*    */     //   899: getfield g50 : B
        /*    */     //   902: aload_3
        /*    */     //   903: getfield HW : Lf/G5;
        /*    */     //   906: getfield g50 : B
        /*    */     //   909: invokestatic IW : (B)B
        /*    */     //   912: if_icmpeq -> 936
        /*    */     //   915: aload_3
        /*    */     //   916: getfield Ae : Lf/zk0;
        /*    */     //   919: getfield pm : Lf/d7;
        /*    */     //   922: aload_3
        /*    */     //   923: getfield HW : Lf/G5;
        /*    */     //   926: getfield g50 : B
        /*    */     //   929: invokestatic IW : (B)B
        /*    */     //   932: invokevirtual qz0 : (B)Z
        /*    */     //   935: pop
        /*    */     //   936: aload_1
        /*    */     //   937: getfield e20 : Lf/c4;
        /*    */     //   940: new f/D6
        /*    */     //   943: dup
        /*    */     //   944: invokespecial <init> : ()V
        /*    */     //   947: invokevirtual W3 : (Lf/Bi;)V
        /*    */     //   950: goto -> 1330
        /*    */     //   953: iload #6
        /*    */     //   955: ifeq -> 995
        /*    */     //   958: aload #5
        /*    */     //   960: ifnull -> 995
        /*    */     //   963: aload #5
        /*    */     //   965: invokevirtual hz : ()Lf/ZK0;
        /*    */     //   968: dup
        /*    */     //   969: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   972: pop
        /*    */     //   973: instanceof f/Hg0
        /*    */     //   976: ifeq -> 995
        /*    */     //   979: aload_2
        /*    */     //   980: aload #5
        /*    */     //   982: aload_3
        /*    */     //   983: getfield HW : Lf/G5;
        /*    */     //   986: getfield g50 : B
        /*    */     //   989: iconst_1
        /*    */     //   990: invokevirtual COm3 : (Lf/xr0;BI)Lf/xr0;
        /*    */     //   993: astore #5
        /*    */     //   995: aload #5
        /*    */     //   997: iconst_1
        /*    */     //   998: istore #6
        /*    */     //   1000: ifnull -> 812
        /*    */     //   1003: aload #5
        /*    */     //   1005: invokevirtual hz : ()Lf/ZK0;
        /*    */     //   1008: invokevirtual Gn : ()Z
        /*    */     //   1011: ifeq -> 1017
        /*    */     //   1014: goto -> 812
        /*    */     //   1017: aload_1
        /*    */     //   1018: getfield Qa : Lf/vh0;
        /*    */     //   1021: invokevirtual iterator : ()Ljava/util/Iterator;
        /*    */     //   1024: astore #7
        /*    */     //   1026: aload #7
        /*    */     //   1028: invokeinterface hasNext : ()Z
        /*    */     //   1033: ifeq -> 1306
        /*    */     //   1036: aload #7
        /*    */     //   1038: invokeinterface next : ()Ljava/lang/Object;
        /*    */     //   1043: checkcast f/tc
        /*    */     //   1046: dup
        /*    */     //   1047: astore #8
        /*    */     //   1049: ifnull -> 1026
        /*    */     //   1052: aload #8
        /*    */     //   1054: aload #5
        /*    */     //   1056: invokevirtual bl0 : ()B
        /*    */     //   1059: aload #5
        /*    */     //   1061: invokevirtual jC : (BLf/xr0;)Z
        /*    */     //   1064: ifne -> 1070
        /*    */     //   1067: goto -> 1026
        /*    */     //   1070: aload_2
        /*    */     //   1071: getfield E10 : B
        /*    */     //   1074: dup
        /*    */     //   1075: istore #9
        /*    */     //   1077: ifeq -> 1148
        /*    */     //   1080: iload #9
        /*    */     //   1082: iconst_1
        /*    */     //   1083: if_icmpne -> 1089
        /*    */     //   1086: goto -> 1148
        /*    */     //   1089: aload #5
        /*    */     //   1091: invokevirtual bl0 : ()B
        /*    */     //   1094: aload #8
        /*    */     //   1096: getfield HW : Lf/G5;
        /*    */     //   1099: getfield Qf0 : B
        /*    */     //   1102: dup
        /*    */     //   1103: istore #9
        /*    */     //   1105: if_icmpeq -> 1124
        /*    */     //   1108: iload #9
        /*    */     //   1110: ifge -> 1026
        /*    */     //   1113: aload #5
        /*    */     //   1115: invokevirtual bl0 : ()B
        /*    */     //   1118: ifeq -> 1124
        /*    */     //   1121: goto -> 1026
        /*    */     //   1124: aload #4
        /*    */     //   1126: invokevirtual i00 : ()F
        /*    */     //   1129: aload #5
        /*    */     //   1131: invokevirtual i00 : ()F
        /*    */     //   1134: fsub
        /*    */     //   1135: invokestatic abs : (F)F
        /*    */     //   1138: ldc_w 1.27
        /*    */     //   1141: fcmpl
        /*    */     //   1142: ifle -> 1209
        /*    */     //   1145: goto -> 1026
        /*    */     //   1148: aload #8
        /*    */     //   1150: getfield HW : Lf/G5;
        /*    */     //   1153: getfield Qf0 : B
        /*    */     //   1156: dup
        /*    */     //   1157: istore #9
        /*    */     //   1159: iflt -> 1209
        /*    */     //   1162: aload_3
        /*    */     //   1163: getfield HW : Lf/G5;
        /*    */     //   1166: getfield Qf0 : B
        /*    */     //   1169: dup
        /*    */     //   1170: istore #10
        /*    */     //   1172: iflt -> 1209
        /*    */     //   1175: iload #10
        /*    */     //   1177: iconst_3
        /*    */     //   1178: idiv
        /*    */     //   1179: iload #9
        /*    */     //   1181: iconst_3
        /*    */     //   1182: idiv
        /*    */     //   1183: if_icmpeq -> 1209
        /*    */     //   1186: iload #10
        /*    */     //   1188: ifne -> 1200
        /*    */     //   1191: iload #9
        /*    */     //   1193: iconst_2
        /*    */     //   1194: if_icmpne -> 1200
        /*    */     //   1197: goto -> 1209
        /*    */     //   1200: aload #4
        /*    */     //   1202: invokevirtual bl0 : ()B
        /*    */     //   1205: iconst_m1
        /*    */     //   1206: if_icmpne -> 1026
        /*    */     //   1209: aload #8
        /*    */     //   1211: instanceof f/Kr0
        /*    */     //   1214: ifeq -> 1026
        /*    */     //   1217: aload #8
        /*    */     //   1219: checkcast f/Kr0
        /*    */     //   1222: dup
        /*    */     //   1223: astore #9
        /*    */     //   1225: getfield UA0 : Z
        /*    */     //   1228: ifne -> 1234
        /*    */     //   1231: goto -> 1026
        /*    */     //   1234: aload #9
        /*    */     //   1236: getfield pr0 : J
        /*    */     //   1239: invokestatic currentTimeMillis : ()J
        /*    */     //   1242: ldc2_w 500
        /*    */     //   1245: ladd
        /*    */     //   1246: lcmp
        /*    */     //   1247: ifge -> 1262
        /*    */     //   1250: aload #9
        /*    */     //   1252: invokestatic currentTimeMillis : ()J
        /*    */     //   1255: ldc2_w 500
        /*    */     //   1258: ladd
        /*    */     //   1259: putfield pr0 : J
        /*    */     //   1262: aload_1
        /*    */     //   1263: aload #9
        /*    */     //   1265: aload #8
        /*    */     //   1267: getstatic f/Z50.yx0 : Lf/Z50;
        /*    */     //   1270: invokevirtual q90 : (Lf/Z50;)V
        /*    */     //   1273: invokestatic currentTimeMillis : ()J
        /*    */     //   1276: sipush #500
        /*    */     //   1279: i2l
        /*    */     //   1280: ladd
        /*    */     //   1281: putfield pi : J
        /*    */     //   1284: getfield e20 : Lf/c4;
        /*    */     //   1287: new f/cO
        /*    */     //   1290: dup
        /*    */     //   1291: aload #8
        /*    */     //   1293: getfield Jg : I
        /*    */     //   1296: invokespecial <init> : (I)V
        /*    */     //   1299: invokevirtual W3 : (Lf/Bi;)V
        /*    */     //   1302: iconst_1
        /*    */     //   1303: goto -> 1307
        /*    */     //   1306: iconst_0
        /*    */     //   1307: ifeq -> 812
        /*    */     //   1310: goto -> 1330
        /*    */     //   1313: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   1316: getstatic f/BM.bC : Lf/BM;
        /*    */     //   1319: invokevirtual bn0 : (Lf/BM;)Z
        /*    */     //   1322: ifne -> 1330
        /*    */     //   1325: aload_0
        /*    */     //   1326: iconst_0
        /*    */     //   1327: putfield uG : Z
        /*    */     //   1330: aload_0
        /*    */     //   1331: getfield ec : Z
        /*    */     //   1334: ifne -> 1358
        /*    */     //   1337: aload_0
        /*    */     //   1338: getfield uK : Z
        /*    */     //   1341: ifne -> 1358
        /*    */     //   1344: aload_0
        /*    */     //   1345: getfield fA : Z
        /*    */     //   1348: ifne -> 1358
        /*    */     //   1351: aload_0
        /*    */     //   1352: getfield n40 : Z
        /*    */     //   1355: ifeq -> 1865
        /*    */     //   1358: aload_0
        /*    */     //   1359: dup
        /*    */     //   1360: dup
        /*    */     //   1361: dup2
        /*    */     //   1362: getfield Yu : Lf/B9;
        /*    */     //   1365: dup
        /*    */     //   1366: bipush #10
        /*    */     //   1368: newarray byte
        /*    */     //   1370: putfield COM8 : [B
        /*    */     //   1373: iconst_0
        /*    */     //   1374: putfield y90 : I
        /*    */     //   1377: iconst_0
        /*    */     //   1378: putfield ec : Z
        /*    */     //   1381: iconst_0
        /*    */     //   1382: putfield uK : Z
        /*    */     //   1385: iconst_0
        /*    */     //   1386: putfield fA : Z
        /*    */     //   1389: iconst_0
        /*    */     //   1390: putfield n40 : Z
        /*    */     //   1393: goto -> 1865
        /*    */     //   1396: iload_3
        /*    */     //   1397: ifeq -> 1423
        /*    */     //   1400: aload_0
        /*    */     //   1401: getfield ec : Z
        /*    */     //   1404: ifne -> 1423
        /*    */     //   1407: aload_0
        /*    */     //   1408: dup
        /*    */     //   1409: getfield Yu : Lf/B9;
        /*    */     //   1412: iconst_1
        /*    */     //   1413: invokevirtual Be : (B)V
        /*    */     //   1416: iconst_1
        /*    */     //   1417: putfield ec : Z
        /*    */     //   1420: goto -> 1447
        /*    */     //   1423: iload_3
        /*    */     //   1424: ifne -> 1447
        /*    */     //   1427: aload_0
        /*    */     //   1428: getfield ec : Z
        /*    */     //   1431: ifeq -> 1447
        /*    */     //   1434: aload_0
        /*    */     //   1435: dup
        /*    */     //   1436: getfield Yu : Lf/B9;
        /*    */     //   1439: iconst_1
        /*    */     //   1440: invokevirtual Ny0 : (B)V
        /*    */     //   1443: iconst_0
        /*    */     //   1444: putfield ec : Z
        /*    */     //   1447: iload #4
        /*    */     //   1449: ifeq -> 1475
        /*    */     //   1452: aload_0
        /*    */     //   1453: getfield uK : Z
        /*    */     //   1456: ifne -> 1475
        /*    */     //   1459: aload_0
        /*    */     //   1460: dup
        /*    */     //   1461: getfield Yu : Lf/B9;
        /*    */     //   1464: iconst_0
        /*    */     //   1465: invokevirtual Be : (B)V
        /*    */     //   1468: iconst_1
        /*    */     //   1469: putfield uK : Z
        /*    */     //   1472: goto -> 1500
        /*    */     //   1475: iload #4
        /*    */     //   1477: ifne -> 1500
        /*    */     //   1480: aload_0
        /*    */     //   1481: getfield uK : Z
        /*    */     //   1484: ifeq -> 1500
        /*    */     //   1487: aload_0
        /*    */     //   1488: dup
        /*    */     //   1489: getfield Yu : Lf/B9;
        /*    */     //   1492: iconst_0
        /*    */     //   1493: invokevirtual Ny0 : (B)V
        /*    */     //   1496: iconst_0
        /*    */     //   1497: putfield uK : Z
        /*    */     //   1500: iload #5
        /*    */     //   1502: ifeq -> 1528
        /*    */     //   1505: aload_0
        /*    */     //   1506: getfield fA : Z
        /*    */     //   1509: ifne -> 1528
        /*    */     //   1512: aload_0
        /*    */     //   1513: dup
        /*    */     //   1514: getfield Yu : Lf/B9;
        /*    */     //   1517: iconst_2
        /*    */     //   1518: invokevirtual Be : (B)V
        /*    */     //   1521: iconst_1
        /*    */     //   1522: putfield fA : Z
        /*    */     //   1525: goto -> 1553
        /*    */     //   1528: iload #5
        /*    */     //   1530: ifne -> 1553
        /*    */     //   1533: aload_0
        /*    */     //   1534: getfield fA : Z
        /*    */     //   1537: ifeq -> 1553
        /*    */     //   1540: aload_0
        /*    */     //   1541: dup
        /*    */     //   1542: getfield Yu : Lf/B9;
        /*    */     //   1545: iconst_2
        /*    */     //   1546: invokevirtual Ny0 : (B)V
        /*    */     //   1549: iconst_0
        /*    */     //   1550: putfield fA : Z
        /*    */     //   1553: iload #6
        /*    */     //   1555: ifeq -> 1581
        /*    */     //   1558: aload_0
        /*    */     //   1559: getfield n40 : Z
        /*    */     //   1562: ifne -> 1581
        /*    */     //   1565: aload_0
        /*    */     //   1566: dup
        /*    */     //   1567: getfield Yu : Lf/B9;
        /*    */     //   1570: iconst_3
        /*    */     //   1571: invokevirtual Be : (B)V
        /*    */     //   1574: iconst_1
        /*    */     //   1575: putfield n40 : Z
        /*    */     //   1578: goto -> 1606
        /*    */     //   1581: iload #6
        /*    */     //   1583: ifne -> 1606
        /*    */     //   1586: aload_0
        /*    */     //   1587: getfield n40 : Z
        /*    */     //   1590: ifeq -> 1606
        /*    */     //   1593: aload_0
        /*    */     //   1594: dup
        /*    */     //   1595: getfield Yu : Lf/B9;
        /*    */     //   1598: iconst_3
        /*    */     //   1599: invokevirtual Ny0 : (B)V
        /*    */     //   1602: iconst_0
        /*    */     //   1603: putfield n40 : Z
        /*    */     //   1606: iconst_1
        /*    */     //   1607: invokestatic D70 : (I)Z
        /*    */     //   1610: ifne -> 1620
        /*    */     //   1613: getstatic f/gm.By0 : Z
        /*    */     //   1616: pop
        /*    */     //   1617: goto -> 1658
        /*    */     //   1620: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   1623: bipush #59
        /*    */     //   1625: invokevirtual Y80 : (I)Z
        /*    */     //   1628: ifeq -> 1658
        /*    */     //   1631: getstatic f/km.Lpt1 : Lf/JP;
        /*    */     //   1634: sipush #129
        /*    */     //   1637: invokevirtual Y80 : (I)Z
        /*    */     //   1640: ifeq -> 1658
        /*    */     //   1643: aload_0
        /*    */     //   1644: getfield NC0 : Lf/e2;
        /*    */     //   1647: invokevirtual By0 : ()Z
        /*    */     //   1650: ifeq -> 1658
        /*    */     //   1653: iconst_1
        /*    */     //   1654: istore_1
        /*    */     //   1655: goto -> 1660
        /*    */     //   1658: iconst_0
        /*    */     //   1659: istore_1
        /*    */     //   1660: aload_0
        /*    */     //   1661: dup
        /*    */     //   1662: invokevirtual getClass : ()Ljava/lang/Class;
        /*    */     //   1665: pop
        /*    */     //   1666: getfield dv0 : Z
        /*    */     //   1669: dup
        /*    */     //   1670: istore_3
        /*    */     //   1671: ifne -> 1679
        /*    */     //   1674: aload_0
        /*    */     //   1675: lconst_0
        /*    */     //   1676: putfield k8 : J
        /*    */     //   1679: aload_0
        /*    */     //   1680: getfield Yu : Lf/B9;
        /*    */     //   1683: dup
        /*    */     //   1684: astore_0
        /*    */     //   1685: getfield y90 : I
        /*    */     //   1688: dup
        /*    */     //   1689: istore #4
        /*    */     //   1691: iconst_1
        /*    */     //   1692: isub
        /*    */     //   1693: dup
        /*    */     //   1694: istore #5
        /*    */     //   1696: iload #4
        /*    */     //   1698: if_icmpge -> 1855
        /*    */     //   1701: aload_0
        /*    */     //   1702: getfield COM8 : [B
        /*    */     //   1705: iload #5
        /*    */     //   1707: baload
        /*    */     //   1708: tableswitch default -> 1740, 0 -> 1827, 1 -> 1799, 2 -> 1771, 3 -> 1743
        /*    */     //   1740: goto -> 1865
        /*    */     //   1743: iload_1
        /*    */     //   1744: ifeq -> 1759
        /*    */     //   1747: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1750: ldc_w '//moveclose 1 0'
        /*    */     //   1753: invokevirtual lF : (Ljava/lang/String;)V
        /*    */     //   1756: goto -> 1865
        /*    */     //   1759: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1762: iconst_3
        /*    */     //   1763: iload_2
        /*    */     //   1764: iload_3
        /*    */     //   1765: invokevirtual jF : (BZZ)V
        /*    */     //   1768: goto -> 1865
        /*    */     //   1771: iload_1
        /*    */     //   1772: ifeq -> 1787
        /*    */     //   1775: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1778: ldc_w '//moveclose -1 0'
        /*    */     //   1781: invokevirtual lF : (Ljava/lang/String;)V
        /*    */     //   1784: goto -> 1865
        /*    */     //   1787: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1790: iconst_2
        /*    */     //   1791: iload_2
        /*    */     //   1792: iload_3
        /*    */     //   1793: invokevirtual jF : (BZZ)V
        /*    */     //   1796: goto -> 1865
        /*    */     //   1799: iload_1
        /*    */     //   1800: ifeq -> 1815
        /*    */     //   1803: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1806: ldc_w '//moveclose 0 -1'
        /*    */     //   1809: invokevirtual lF : (Ljava/lang/String;)V
        /*    */     //   1812: goto -> 1865
        /*    */     //   1815: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1818: iconst_1
        /*    */     //   1819: iload_2
        /*    */     //   1820: iload_3
        /*    */     //   1821: invokevirtual jF : (BZZ)V
        /*    */     //   1824: goto -> 1865
        /*    */     //   1827: iload_1
        /*    */     //   1828: ifeq -> 1843
        /*    */     //   1831: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1834: ldc_w '//moveclose 0 1'
        /*    */     //   1837: invokevirtual lF : (Ljava/lang/String;)V
        /*    */     //   1840: goto -> 1865
        /*    */     //   1843: getstatic f/km.u4 : Lf/R8;
        /*    */     //   1846: iconst_0
        /*    */     //   1847: iload_2
        /*    */     //   1848: iload_3
        /*    */     //   1849: invokevirtual jF : (BZZ)V
        /*    */     //   1852: goto -> 1865
        /*    */     //   1855: new java/lang/ArrayIndexOutOfBoundsException
        /*    */     //   1858: dup
        /*    */     //   1859: iload #5
        /*    */     //   1861: invokespecial <init> : (I)V
        /*    */     //   1864: athrow
        /*    */     //   1865: return
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 1
        /*    */     //   #2	-> 11
        /*    */     //   #3	-> 28
        /*    */     //   #4	-> 35
        /*    */     //   #5	-> 43
        /*    */     //   #6	-> 46
        /*    */     //   #7	-> 65
        /*    */     //   #8	-> 109
        /*    */     //   #9	-> 117
        /*    */     //   #10	-> 121
        /*    */     //   #11	-> 130
        /*    */     //   #12	-> 152
        /*    */     //   #13	-> 160
        /*    */     //   #14	-> 169
        /*    */     //   #15	-> 176
        /*    */     //   #16	-> 186
        /*    */     //   #17	-> 195
        /*    */     //   #18	-> 199
        /*    */     //   #19	-> 217
        /*    */     //   #20	-> 224
        /*    */     //   #21	-> 233
        /*    */     //   #22	-> 240
        /*    */     //   #23	-> 255
        /*    */     //   #24	-> 262
        /*    */     //   #25	-> 265
        /*    */     //   #26	-> 276
        /*    */     //   #27	-> 279
        /*    */     //   #28	-> 282
        /*    */     //   #29	-> 290
        /*    */     //   #30	-> 309
        /*    */     //   #31	-> 312
        /*    */     //   #32	-> 315
        /*    */     //   #33	-> 325
        /*    */     //   #34	-> 330
        /*    */     //   #35	-> 336
        /*    */     //   #36	-> 343
        /*    */     //   #37	-> 358
        /*    */     //   #38	-> 365
        /*    */     //   #39	-> 372
        /*    */     //   #40	-> 379
        /*    */     //   #41	-> 382
        /*    */     //   #42	-> 392
        /*    */     //   #43	-> 395
        /*    */     //   #44	-> 398
        /*    */     //   #45	-> 401
        /*    */     //   #46	-> 624
        /*    */     //   #47	-> 627
        /*    */     //   #48	-> 633
        /*    */     //   #49	-> 645
        /*    */     //   #50	-> 664
        /*    */     //   #51	-> 667
        /*    */     //   #52	-> 676
        /*    */     //   #53	-> 679
        /*    */     //   #54	-> 682
        /*    */     //   #55	-> 698
        /*    */     //   #56	-> 707
        /*    */     //   #57	-> 729
        /*    */     //   #58	-> 742
        /*    */     //   #59	-> 747
        /*    */     //   #60	-> 751
        /*    */     //   #61	-> 756
        /*    */     //   #62	-> 766
        /*    */     //   #63	-> 778
        /*    */     //   #64	-> 781
        /*    */     //   #65	-> 797
        /*    */     //   #66	-> 800
        /*    */     //   #67	-> 804
        /*    */     //   #68	-> 832
        /*    */     //   #69	-> 842
        /*    */     //   #70	-> 845
        /*    */     //   #71	-> 852
        /*    */     //   #72	-> 855
        /*    */     //   #73	-> 858
        /*    */     //   #74	-> 867
        /*    */     //   #75	-> 870
        /*    */     //   #76	-> 873
        /*    */     //   #77	-> 893
        /*    */     //   #78	-> 896
        /*    */     //   #79	-> 899
        /*    */     //   #80	-> 903
        /*    */     //   #81	-> 906
        /*    */     //   #82	-> 909
        /*    */     //   #83	-> 916
        /*    */     //   #84	-> 919
        /*    */     //   #85	-> 923
        /*    */     //   #86	-> 926
        /*    */     //   #87	-> 929
        /*    */     //   #88	-> 973
        /*    */     //   #89	-> 983
        /*    */     //   #90	-> 986
        /*    */     //   #91	-> 990
        /*    */     //   #92	-> 1018
        /*    */     //   #93	-> 1071
        /*    */     //   #94	-> 1091
        /*    */     //   #95	-> 1096
        /*    */     //   #96	-> 1099
        /*    */     //   #97	-> 1115
        /*    */     //   #98	-> 1150
        /*    */     //   #99	-> 1153
        /*    */     //   #100	-> 1163
        /*    */     //   #101	-> 1166
        /*    */     //   #102	-> 1178
        /*    */     //   #103	-> 1225
        /*    */     //   #104	-> 1236
        /*    */     //   #105	-> 1267
        /*    */     //   #106	-> 1273
        /*    */     //   #107	-> 1284
        /*    */     //   #108	-> 1293
        /*    */     //   #109	-> 1296
        /*    */     //   #110	-> 1313
        /*    */     //   #111	-> 1368
        /*    */     //   #112	-> 1370
        /*    */     //   #113	-> 1374
        /*    */     //   #114	-> 1378
        /*    */     //   #115	-> 1607
        /*    */     //   #116	-> 1613
        /*    */     //   #117	-> 1685
        /*    */     //   #118	-> 1702
        /*    */     //   #119	-> 1747
        /*    */     //   #120	-> 1855
        /*    */
    }

    /*    */
    /*    */
    public final void Cr() {
        /*    */
        try {
            /*    */
            return;
            /*    */
        } finally {
            /*    */
            null;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void oC0() {
        /*    */
        JP jP;
        /*    */
        (jP = km.Lpt1).getClass();
        /*    */
        if (yG.x3 == yG.A1)
            /*    */ jP.o60 = true;
        /*    */
        this.oq0 = false;
        /*    */
        lr lr;
        /*    */
        VD0 vD0;
        /*    */
        if (h1.VJ0 && (vD0 = km.pm0) != null && (lr = this.kR) != null) {
            /*    */
            vf0(0.0F);
            /*    */
            km.pm0.tf();
            /*    */
        }
        /*    */
        if (h1.Gh0)
            /*    */ h1.Td();
        /*    */
        if (EC.WD0)
            /*    */ EC.lpt2();
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Oj.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */