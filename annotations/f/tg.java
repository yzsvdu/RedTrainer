/*  1 */ package f;public final class tg extends jp0 { public static final ik a00 = C00.gd(tg.class); public static final NC0 df0 = new NC0(); public static final NC0 SZ = new NC0(); public Wo DA; public float[] Og = new float[200]; public long[] OI0 = new long[200]; public int QF = 0; public Ah[][] kB = null; public final void YR(Cy paramCy) { if (!this.w6) { paramCy.br0
/*  2 */         .cC0
/*  3 */         .getClass();
/*    */       
/*  5 */       int i = L70.gq.Rr0() * 60;
/*    */       
/*  7 */       i = eA0.W70(L70.gq.Zi0() % 3600 / 60 + i);
/*  8 */       this.Cc0 = paramCy.br0.cC0.R10[i]; tJ(); }  Hb0();
/*    */     
/* 10 */     yB(paramCy.Cd, this.w6 ^ true); } public int gA = -1; public float pH0; public float Jt0; public float lpT8; public boolean xy = false; public tg(Wo paramWo) { super(paramWo); this.DA = paramWo; } public final void L00() { super.L00(); this(Lpt3.La0(), Lpt3.h40(), null); xh xh; lt lt; K70 k70; Lpt3 lpt3; (new xh()).Ug0 = 1; (new xh()).hX = 1; (new xh()).xu = 32; this(this, null); this(); this(lpt3, this); this.E40 = k70; } public final boolean rS(byte paramByte, eo parameo, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield w6 : Z
/*    */     //   4: iconst_1
/*    */     //   5: ixor
/*    */     //   6: istore #7
/*    */     //   8: getstatic f/km.a3 : Lf/vh0;
/*    */     //   11: dup
/*    */     //   12: astore #8
/*    */     //   14: ifnonnull -> 20
/*    */     //   17: iconst_1
/*    */     //   18: istore #7
/*    */     //   20: iload #7
/*    */     //   22: aconst_null
/*    */     //   23: astore #9
/*    */     //   25: ifne -> 88
/*    */     //   28: aload #8
/*    */     //   30: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   33: dup
/*    */     //   34: astore #8
/*    */     //   36: instanceof f/Cy
/*    */     //   39: ifne -> 44
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: aload #8
/*    */     //   46: checkcast f/Cy
/*    */     //   49: dup
/*    */     //   50: astore #9
/*    */     //   52: ifnull -> 85
/*    */     //   55: aload_0
/*    */     //   56: getfield oo0 : Lf/me;
/*    */     //   59: dup
/*    */     //   60: astore #8
/*    */     //   62: ifnonnull -> 69
/*    */     //   65: iconst_0
/*    */     //   66: goto -> 74
/*    */     //   69: aload #8
/*    */     //   71: invokevirtual h20 : ()S
/*    */     //   74: aload #9
/*    */     //   76: getfield br0 : Lf/Ws0;
/*    */     //   79: getfield Ga : S
/*    */     //   82: if_icmpeq -> 88
/*    */     //   85: iconst_1
/*    */     //   86: istore #7
/*    */     //   88: iload #7
/*    */     //   90: ifeq -> 118
/*    */     //   93: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   96: new f/aB0
/*    */     //   99: dup
/*    */     //   100: aload_0
/*    */     //   101: iload_1
/*    */     //   102: aload_2
/*    */     //   103: iload_3
/*    */     //   104: iload #4
/*    */     //   106: iload #5
/*    */     //   108: iload #6
/*    */     //   110: invokespecial <init> : (Lf/tg;BLf/eo;IZZZ)V
/*    */     //   113: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   116: iconst_1
/*    */     //   117: ireturn
/*    */     //   118: iload_1
/*    */     //   119: ldc 3.4028235E38
/*    */     //   121: fstore #7
/*    */     //   123: aconst_null
/*    */     //   124: astore #8
/*    */     //   126: aconst_null
/*    */     //   127: astore #10
/*    */     //   129: iconst_4
/*    */     //   130: if_icmpeq -> 144
/*    */     //   133: iload_1
/*    */     //   134: iconst_5
/*    */     //   135: if_icmpeq -> 144
/*    */     //   138: iconst_1
/*    */     //   139: istore #11
/*    */     //   141: goto -> 147
/*    */     //   144: iconst_0
/*    */     //   145: istore #11
/*    */     //   147: aload_0
/*    */     //   148: getfield wN : Lf/fQ;
/*    */     //   151: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   154: astore #12
/*    */     //   156: aload #12
/*    */     //   158: invokevirtual hasNext : ()Z
/*    */     //   161: ifeq -> 567
/*    */     //   164: aload #12
/*    */     //   166: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   169: checkcast f/Ah
/*    */     //   172: dup
/*    */     //   173: astore #13
/*    */     //   175: getfield W7 : Lf/fQ;
/*    */     //   178: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   181: astore #14
/*    */     //   183: aload #14
/*    */     //   185: invokevirtual hasNext : ()Z
/*    */     //   188: ifeq -> 156
/*    */     //   191: iload #4
/*    */     //   193: aload #14
/*    */     //   195: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   198: checkcast f/lpt1
/*    */     //   201: astore #15
/*    */     //   203: ifeq -> 258
/*    */     //   206: aload #15
/*    */     //   208: getfield Zl0 : Ljava/lang/String;
/*    */     //   211: ldc 'door'
/*    */     //   213: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   216: ifne -> 258
/*    */     //   219: iload #5
/*    */     //   221: ifne -> 237
/*    */     //   224: aload #15
/*    */     //   226: getfield Zl0 : Ljava/lang/String;
/*    */     //   229: ldc 'badgegate'
/*    */     //   231: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   234: ifne -> 258
/*    */     //   237: iload #5
/*    */     //   239: ifne -> 183
/*    */     //   242: aload #15
/*    */     //   244: getfield Zl0 : Ljava/lang/String;
/*    */     //   247: ldc 'elevator'
/*    */     //   249: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   252: ifne -> 258
/*    */     //   255: goto -> 183
/*    */     //   258: iload #6
/*    */     //   260: ifeq -> 289
/*    */     //   263: iload #5
/*    */     //   265: ifne -> 289
/*    */     //   268: iload #4
/*    */     //   270: ifeq -> 289
/*    */     //   273: aload #15
/*    */     //   275: getfield Zl0 : Ljava/lang/String;
/*    */     //   278: ldc 'badgegate'
/*    */     //   280: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   283: ifeq -> 289
/*    */     //   286: goto -> 183
/*    */     //   289: aload #9
/*    */     //   291: invokevirtual Xg0 : ()S
/*    */     //   294: sipush #143
/*    */     //   297: if_icmpne -> 342
/*    */     //   300: aload #15
/*    */     //   302: getfield Zl0 : Ljava/lang/String;
/*    */     //   305: ldc 'warp0'
/*    */     //   307: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   310: ifne -> 183
/*    */     //   313: aload #15
/*    */     //   315: getfield Zl0 : Ljava/lang/String;
/*    */     //   318: ldc '_sta'
/*    */     //   320: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   323: ifne -> 183
/*    */     //   326: aload #15
/*    */     //   328: getfield Zl0 : Ljava/lang/String;
/*    */     //   331: ldc 'obj'
/*    */     //   333: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   336: ifeq -> 342
/*    */     //   339: goto -> 183
/*    */     //   342: aload #15
/*    */     //   344: aload_0
/*    */     //   345: dup
/*    */     //   346: dup
/*    */     //   347: getfield dH0 : Lf/Eb;
/*    */     //   350: getfield pp0 : Lf/eo;
/*    */     //   353: dup
/*    */     //   354: astore #16
/*    */     //   356: aload_2
/*    */     //   357: dup
/*    */     //   358: dup
/*    */     //   359: aload #16
/*    */     //   361: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   364: pop
/*    */     //   365: getfield x : F
/*    */     //   368: fstore #16
/*    */     //   370: getfield y : F
/*    */     //   373: fstore #17
/*    */     //   375: getfield z : F
/*    */     //   378: fstore #18
/*    */     //   380: fload #16
/*    */     //   382: fload #17
/*    */     //   384: fload #18
/*    */     //   386: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   389: ldc_w 0.125
/*    */     //   392: invokevirtual ky0 : (F)V
/*    */     //   395: getfield dH0 : Lf/Eb;
/*    */     //   398: getfield s60 : Lf/eo;
/*    */     //   401: dup
/*    */     //   402: astore #16
/*    */     //   404: aload_2
/*    */     //   405: dup
/*    */     //   406: dup
/*    */     //   407: aload #16
/*    */     //   409: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   412: pop
/*    */     //   413: getfield x : F
/*    */     //   416: fstore #16
/*    */     //   418: getfield y : F
/*    */     //   421: fstore #17
/*    */     //   423: getfield z : F
/*    */     //   426: fstore #18
/*    */     //   428: fload #16
/*    */     //   430: fload #17
/*    */     //   432: fload #18
/*    */     //   434: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   437: ldc_w 0.125
/*    */     //   440: invokevirtual r9 : (F)V
/*    */     //   443: getfield dH0 : Lf/Eb;
/*    */     //   446: dup
/*    */     //   447: dup
/*    */     //   448: getfield pp0 : Lf/eo;
/*    */     //   451: astore #16
/*    */     //   453: getfield s60 : Lf/eo;
/*    */     //   456: aload #16
/*    */     //   458: swap
/*    */     //   459: invokevirtual kX : (Lf/eo;Lf/eo;)Lf/Eb;
/*    */     //   462: pop
/*    */     //   463: getfield Of : Lf/Eb;
/*    */     //   466: aload_0
/*    */     //   467: getfield dH0 : Lf/Eb;
/*    */     //   470: invokevirtual r10 : (Lf/Eb;)Z
/*    */     //   473: ifne -> 488
/*    */     //   476: aload_2
/*    */     //   477: invokevirtual Kw0 : ()Z
/*    */     //   480: ifne -> 488
/*    */     //   483: iload #4
/*    */     //   485: ifne -> 183
/*    */     //   488: iload #11
/*    */     //   490: ifeq -> 508
/*    */     //   493: iload_3
/*    */     //   494: aload #15
/*    */     //   496: getfield lz : Lf/fQ;
/*    */     //   499: getfield Z8 : I
/*    */     //   502: if_icmplt -> 508
/*    */     //   505: goto -> 183
/*    */     //   508: aload_2
/*    */     //   509: aload #15
/*    */     //   511: getfield Of : Lf/Eb;
/*    */     //   514: getfield sD : Lf/eo;
/*    */     //   517: dup
/*    */     //   518: dup
/*    */     //   519: getfield x : F
/*    */     //   522: fstore #16
/*    */     //   524: getfield y : F
/*    */     //   527: fstore #17
/*    */     //   529: getfield z : F
/*    */     //   532: fstore #18
/*    */     //   534: fload #16
/*    */     //   536: fload #17
/*    */     //   538: fload #18
/*    */     //   540: invokevirtual Cl0 : (FFF)F
/*    */     //   543: dup
/*    */     //   544: fstore #16
/*    */     //   546: fload #7
/*    */     //   548: fcmpg
/*    */     //   549: ifge -> 183
/*    */     //   552: aload #15
/*    */     //   554: aload #13
/*    */     //   556: fload #16
/*    */     //   558: fstore #7
/*    */     //   560: astore #10
/*    */     //   562: astore #8
/*    */     //   564: goto -> 183
/*    */     //   567: aload #8
/*    */     //   569: ifnull -> 1185
/*    */     //   572: aload #10
/*    */     //   574: ifnull -> 1185
/*    */     //   577: iload #5
/*    */     //   579: ifne -> 593
/*    */     //   582: iload #4
/*    */     //   584: ifne -> 593
/*    */     //   587: aload #8
/*    */     //   589: iconst_0
/*    */     //   590: putfield Yr0 : Z
/*    */     //   593: iload_1
/*    */     //   594: tableswitch default -> 632, 0 -> 843, 1 -> 843, 2 -> 824, 3 -> 816, 4 -> 734, 5 -> 635
/*    */     //   632: goto -> 1183
/*    */     //   635: aload #10
/*    */     //   637: getstatic f/eo.Zero : Lf/eo;
/*    */     //   640: iload_3
/*    */     //   641: getstatic f/km.mI0 : Lf/P1;
/*    */     //   644: getfield AN : Lf/Wo;
/*    */     //   647: aload #10
/*    */     //   649: dup
/*    */     //   650: getfield QQ : Lf/VV;
/*    */     //   653: astore_0
/*    */     //   654: getfield Kj0 : I
/*    */     //   657: aload_0
/*    */     //   658: swap
/*    */     //   659: invokevirtual oB : (Lf/VV;I)Lf/Wd;
/*    */     //   662: new f/f7
/*    */     //   665: dup
/*    */     //   666: astore_0
/*    */     //   667: invokespecial <init> : ()V
/*    */     //   670: iconst_0
/*    */     //   671: swap
/*    */     //   672: aload_0
/*    */     //   673: invokevirtual nd : (Lf/eo;IILf/Wd;Lf/f7;)Lf/lpt1;
/*    */     //   676: dup
/*    */     //   677: astore_0
/*    */     //   678: ifnull -> 1183
/*    */     //   681: aload_0
/*    */     //   682: dup
/*    */     //   683: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   686: dup
/*    */     //   687: aload #8
/*    */     //   689: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   692: astore_0
/*    */     //   693: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   696: pop
/*    */     //   697: aload_0
/*    */     //   698: getfield Z0 : [F
/*    */     //   701: invokevirtual Qw : ([F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   704: pop
/*    */     //   705: getfield Of : Lf/Eb;
/*    */     //   708: aload #8
/*    */     //   710: getfield Of : Lf/Eb;
/*    */     //   713: invokevirtual rD0 : (Lf/Eb;)V
/*    */     //   716: getstatic f/UB0.Kg0 : Lf/Q50;
/*    */     //   719: aload #10
/*    */     //   721: aload #8
/*    */     //   723: <illegal opcode> run : (Lf/Ah;Lf/lpt1;)Ljava/lang/Runnable;
/*    */     //   728: invokevirtual fN : (Ljava/lang/Runnable;)V
/*    */     //   731: goto -> 1183
/*    */     //   734: iload_3
/*    */     //   735: aload #8
/*    */     //   737: new f/eo
/*    */     //   740: dup
/*    */     //   741: astore_0
/*    */     //   742: invokespecial <init> : ()V
/*    */     //   745: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   748: aload_0
/*    */     //   749: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   752: pop
/*    */     //   753: iconst_1
/*    */     //   754: if_icmpne -> 782
/*    */     //   757: aload_0
/*    */     //   758: getfield y : F
/*    */     //   761: dup
/*    */     //   762: fstore_1
/*    */     //   763: ldc_w -90000.0
/*    */     //   766: fcmpg
/*    */     //   767: ifgt -> 804
/*    */     //   770: aload_0
/*    */     //   771: fload_1
/*    */     //   772: ldc_w 100000.0
/*    */     //   775: fadd
/*    */     //   776: putfield y : F
/*    */     //   779: goto -> 804
/*    */     //   782: aload_0
/*    */     //   783: getfield y : F
/*    */     //   786: dup
/*    */     //   787: fstore_1
/*    */     //   788: ldc_w -90000.0
/*    */     //   791: fcmpl
/*    */     //   792: ifle -> 804
/*    */     //   795: aload_0
/*    */     //   796: fload_1
/*    */     //   797: ldc_w 100000.0
/*    */     //   800: fsub
/*    */     //   801: putfield y : F
/*    */     //   804: aload #8
/*    */     //   806: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   809: aload_0
/*    */     //   810: invokevirtual b8 : (Lf/eo;)V
/*    */     //   813: goto -> 1183
/*    */     //   816: aload #8
/*    */     //   818: invokevirtual uq : ()V
/*    */     //   821: goto -> 1183
/*    */     //   824: aload #8
/*    */     //   826: dup
/*    */     //   827: ldc_w 1.0E8
/*    */     //   830: putfield k : F
/*    */     //   833: iload_3
/*    */     //   834: iconst_0
/*    */     //   835: aconst_null
/*    */     //   836: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   839: pop
/*    */     //   840: goto -> 1183
/*    */     //   843: iload #4
/*    */     //   845: ifeq -> 868
/*    */     //   848: iload #5
/*    */     //   850: ifeq -> 868
/*    */     //   853: iload_3
/*    */     //   854: ifne -> 868
/*    */     //   857: aload #8
/*    */     //   859: ldc_w 1.0E8
/*    */     //   862: putfield k : F
/*    */     //   865: goto -> 898
/*    */     //   868: aload #8
/*    */     //   870: getfield Zl0 : Ljava/lang/String;
/*    */     //   873: ldc 'badgegate'
/*    */     //   875: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   878: ifeq -> 892
/*    */     //   881: aload #8
/*    */     //   883: ldc_w 2.5
/*    */     //   886: putfield k : F
/*    */     //   889: goto -> 898
/*    */     //   892: aload #8
/*    */     //   894: fconst_1
/*    */     //   895: putfield k : F
/*    */     //   898: iload_1
/*    */     //   899: iconst_1
/*    */     //   900: if_icmpne -> 908
/*    */     //   903: iconst_1
/*    */     //   904: istore_1
/*    */     //   905: goto -> 910
/*    */     //   908: iconst_0
/*    */     //   909: istore_1
/*    */     //   910: iload_3
/*    */     //   911: aload #8
/*    */     //   913: iload_3
/*    */     //   914: iload_1
/*    */     //   915: aconst_null
/*    */     //   916: invokevirtual rd : (IZLf/J3;)Lf/KI0;
/*    */     //   919: pop
/*    */     //   920: ifne -> 1022
/*    */     //   923: iload #4
/*    */     //   925: ifeq -> 1022
/*    */     //   928: iload #6
/*    */     //   930: ifeq -> 1022
/*    */     //   933: aload_0
/*    */     //   934: invokestatic k60 : ()Lf/So;
/*    */     //   937: invokevirtual L5 : ()Lf/So;
/*    */     //   940: aload_0
/*    */     //   941: getfield To0 : Lf/Ih0;
/*    */     //   944: bipush #7
/*    */     //   946: ldc_w 1.5
/*    */     //   949: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   952: aload_0
/*    */     //   953: getfield To0 : Lf/Ih0;
/*    */     //   956: getfield el0 : F
/*    */     //   959: fconst_2
/*    */     //   960: fdiv
/*    */     //   961: invokevirtual a : (F)Lf/Wz0;
/*    */     //   964: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   967: aload_0
/*    */     //   968: getfield To0 : Lf/Ih0;
/*    */     //   971: bipush #6
/*    */     //   973: ldc_w 1.5
/*    */     //   976: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
/*    */     //   979: aload_0
/*    */     //   980: getfield To0 : Lf/Ih0;
/*    */     //   983: getfield IG0 : F
/*    */     //   986: ldc_w 10.0
/*    */     //   989: fadd
/*    */     //   990: invokevirtual a : (F)Lf/Wz0;
/*    */     //   993: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   996: invokevirtual Kr : ()Lf/So;
/*    */     //   999: dup
/*    */     //   1000: aload_0
/*    */     //   1001: getfield RC : Lf/bf;
/*    */     //   1004: putfield C00 : Lf/hk0;
/*    */     //   1007: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   1010: getfield pB0 : Lf/G30;
/*    */     //   1013: invokevirtual mg : (Lf/G30;)Lf/sh;
/*    */     //   1016: checkcast f/So
/*    */     //   1019: putfield wI : Lf/So;
/*    */     //   1022: iload #4
/*    */     //   1024: ifeq -> 1183
/*    */     //   1027: iload_3
/*    */     //   1028: ifne -> 1036
/*    */     //   1031: iconst_1
/*    */     //   1032: istore_0
/*    */     //   1033: goto -> 1038
/*    */     //   1036: iconst_0
/*    */     //   1037: istore_0
/*    */     //   1038: aload #8
/*    */     //   1040: getfield Zl0 : Ljava/lang/String;
/*    */     //   1043: ldc_w '_pc'
/*    */     //   1046: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   1049: ifne -> 1129
/*    */     //   1052: aload #8
/*    */     //   1054: getfield Zl0 : Ljava/lang/String;
/*    */     //   1057: ldc 'elevator'
/*    */     //   1059: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   1062: ifne -> 1129
/*    */     //   1065: aload #8
/*    */     //   1067: getfield Zl0 : Ljava/lang/String;
/*    */     //   1070: ldc_w '_untower'
/*    */     //   1073: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   1076: ifne -> 1129
/*    */     //   1079: aload #8
/*    */     //   1081: getfield Zl0 : Ljava/lang/String;
/*    */     //   1084: ldc_w 'door_c05'
/*    */     //   1087: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   1090: ifne -> 1129
/*    */     //   1093: aload #8
/*    */     //   1095: getfield Zl0 : Ljava/lang/String;
/*    */     //   1098: ldc_w 'door_auto'
/*    */     //   1101: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   1104: ifne -> 1129
/*    */     //   1107: aload #8
/*    */     //   1109: getfield Zl0 : Ljava/lang/String;
/*    */     //   1112: ldc_w 'door_c03'
/*    */     //   1115: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   1118: ifeq -> 1124
/*    */     //   1121: goto -> 1129
/*    */     //   1124: iconst_0
/*    */     //   1125: istore_1
/*    */     //   1126: goto -> 1131
/*    */     //   1129: iconst_1
/*    */     //   1130: istore_1
/*    */     //   1131: iload #5
/*    */     //   1133: ifeq -> 1143
/*    */     //   1136: iload_0
/*    */     //   1137: iload_1
/*    */     //   1138: if_icmpeq -> 1143
/*    */     //   1141: iconst_0
/*    */     //   1142: ireturn
/*    */     //   1143: iload_1
/*    */     //   1144: ifeq -> 1154
/*    */     //   1147: sipush #1671
/*    */     //   1150: istore_0
/*    */     //   1151: goto -> 1169
/*    */     //   1154: iload_0
/*    */     //   1155: ifeq -> 1165
/*    */     //   1158: sipush #1669
/*    */     //   1161: istore_0
/*    */     //   1162: goto -> 1169
/*    */     //   1165: sipush #1670
/*    */     //   1168: istore_0
/*    */     //   1169: iload_0
/*    */     //   1170: ifle -> 1183
/*    */     //   1173: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   1176: iconst_1
/*    */     //   1177: iconst_2
/*    */     //   1178: iload_0
/*    */     //   1179: fconst_0
/*    */     //   1180: invokevirtual bA0 : (ZBSF)V
/*    */     //   1183: iconst_1
/*    */     //   1184: ireturn
/*    */     //   1185: iconst_0
/*    */     //   1186: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 76
/*    */     //   #2	-> 79
/*    */     //   #3	-> 365
/*    */     //   #4	-> 392
/*    */     //   #5	-> 413
/*    */     //   #6	-> 440
/*    */     //   #7	-> 514
/*    */     //   #8	-> 519
/*    */     //   #9	-> 524
/*    */     //   #10	-> 529
/*    */     //   #11	-> 540
/*    */     //   #12	-> 641
/*    */     //   #13	-> 683
/*    */     //   #14	-> 698
/*    */     //   #15	-> 705
/*    */     //   #16	-> 836
/*    */     //   #17	-> 862
/*    */     //   #18	-> 916
/*    */     //   #19	-> 934
/*    */     //   #20	-> 1004
/*    */     //   #21	-> 1007
/*    */     //   #22	-> 1010
/*    */     //   #23	-> 1013
/*    */     //   #24	-> 1180 } public final void yB(yE0 paramyE0, boolean paramBoolean) { if ((!Bz.WZ && (Bz.fn || km.D70(8))) || !this.E4) paramyE0 = yE0.ne;  if ((this.j40 != null && paramBoolean) || paramyE0 == null || this.wg != paramyE0) { this.Zg.pf0(); this.j40 = null; }  this.wg = paramyE0; if (this.j40 == null && paramyE0 != null) { ParticleEffectExt particleEffectExt; int i; if ((i = paramyE0.ordinal()) != 3) { if (i != 5) { if (i != 7) if (i != 13) { if (i != 17) return;  } else { (this.j40 = this.Zg.gi0("weather/heavy_rain")).start(); this.Zg.L40(this.j40); this.YK = particleEffectExt = this.Zg.gi0("weather/thunder"); this.Zg.L40(this); return; }   (((jp0)this).j40 = ((jp0)this).Zg.gi0("weather/snow")).start(); ((jp0)this).Zg.L40(((jp0)this).j40); } else { (((jp0)this).j40 = ((jp0)this).Zg.gi0("weather/rain")).start(); ((jp0)this).Zg.L40(((jp0)this).j40); ((jp0)this).YK = particleEffectExt = ((jp0)this).Zg.gi0("weather/thunder"); ((jp0)this).Zg.L40(this); }  } else { (((jp0)this).j40 = ((jp0)this).Zg.gi0("weather/rain")).start(); ((jp0)this).Zg.L40(((jp0)this).j40); }  }  } public final void Ap0() { // Byte code:
/*    */     //   0: getstatic f/km.a3 : Lf/vh0;
/*    */     //   3: dup
/*    */     //   4: astore_1
/*    */     //   5: ifnull -> 2032
/*    */     //   8: aload_1
/*    */     //   9: getfield Ct : Lf/Jo;
/*    */     //   12: ifnull -> 2032
/*    */     //   15: getstatic f/km.u4 : Lf/R8;
/*    */     //   18: getfield sU : Z
/*    */     //   21: ifeq -> 2032
/*    */     //   24: getstatic f/km.a3 : Lf/vh0;
/*    */     //   27: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   30: instanceof f/pI
/*    */     //   33: ifne -> 39
/*    */     //   36: goto -> 2032
/*    */     //   39: aload_0
/*    */     //   40: dup
/*    */     //   41: invokespecial Ap0 : ()V
/*    */     //   44: getstatic f/km.a3 : Lf/vh0;
/*    */     //   47: invokevirtual Jr0 : ()Lf/KI;
/*    */     //   50: checkcast f/pI
/*    */     //   53: astore_1
/*    */     //   54: getstatic f/km.a3 : Lf/vh0;
/*    */     //   57: getfield Ct : Lf/Jo;
/*    */     //   60: astore_2
/*    */     //   61: getstatic f/UB0.go : Lf/hj0;
/*    */     //   64: aload_0
/*    */     //   65: getfield lPT1 : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   68: dup
/*    */     //   69: dup2
/*    */     //   70: getfield r : F
/*    */     //   73: fstore_3
/*    */     //   74: getfield g : F
/*    */     //   77: fstore #4
/*    */     //   79: getfield b : F
/*    */     //   82: fstore #5
/*    */     //   84: getfield a : F
/*    */     //   87: fstore #6
/*    */     //   89: fload_3
/*    */     //   90: fload #4
/*    */     //   92: fload #5
/*    */     //   94: fload #6
/*    */     //   96: invokeinterface glClearColor : (FFFF)V
/*    */     //   101: getstatic f/UB0.go : Lf/hj0;
/*    */     //   104: sipush #16640
/*    */     //   107: invokeinterface glClear : (I)V
/*    */     //   112: getfield wI : Lf/So;
/*    */     //   115: ifnull -> 121
/*    */     //   118: goto -> 178
/*    */     //   121: aload_2
/*    */     //   122: ifnonnull -> 128
/*    */     //   125: goto -> 202
/*    */     //   128: aload_0
/*    */     //   129: dup
/*    */     //   130: aload_2
/*    */     //   131: aload_0
/*    */     //   132: getstatic f/tr.Jv : Lf/tr;
/*    */     //   135: invokevirtual WR : ()V
/*    */     //   138: getfield To0 : Lf/Ih0;
/*    */     //   141: iconst_1
/*    */     //   142: invokevirtual YB : (Lf/Jo;Lf/Ih0;Z)V
/*    */     //   145: getfield wJ : Z
/*    */     //   148: ifeq -> 178
/*    */     //   151: getstatic f/Xi.z6 : Lf/eo;
/*    */     //   154: aload_0
/*    */     //   155: getfield Z5 : Lf/Ih0;
/*    */     //   158: getfield H : Lf/eo;
/*    */     //   161: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   164: aload_0
/*    */     //   165: getfield Z5 : Lf/Ih0;
/*    */     //   168: getfield I70 : Lf/eo;
/*    */     //   171: invokevirtual zy0 : (Lf/eo;)Lf/eo;
/*    */     //   174: pop
/*    */     //   175: goto -> 202
/*    */     //   178: getstatic f/Xi.z6 : Lf/eo;
/*    */     //   181: aload_0
/*    */     //   182: getfield To0 : Lf/Ih0;
/*    */     //   185: getfield H : Lf/eo;
/*    */     //   188: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   191: aload_0
/*    */     //   192: getfield To0 : Lf/Ih0;
/*    */     //   195: getfield I70 : Lf/eo;
/*    */     //   198: invokevirtual zy0 : (Lf/eo;)Lf/eo;
/*    */     //   201: pop
/*    */     //   202: aload_1
/*    */     //   203: ifnull -> 1651
/*    */     //   206: aload_0
/*    */     //   207: aload_2
/*    */     //   208: getfield pm : Lf/d7;
/*    */     //   211: getfield cOm3 : Lf/eo;
/*    */     //   214: astore_2
/*    */     //   215: getfield K60 : Lf/Cy;
/*    */     //   218: dup
/*    */     //   219: astore_3
/*    */     //   220: ifnull -> 247
/*    */     //   223: aload_3
/*    */     //   224: aload_1
/*    */     //   225: if_acmpne -> 247
/*    */     //   228: aload_3
/*    */     //   229: getfield IY : Z
/*    */     //   232: ifeq -> 450
/*    */     //   235: invokestatic Bp : ()Lf/ud;
/*    */     //   238: invokevirtual yF : ()I
/*    */     //   241: sipush #255
/*    */     //   244: if_icmplt -> 450
/*    */     //   247: aload_0
/*    */     //   248: getstatic f/L70.gq : Lf/L70;
/*    */     //   251: getfield oh0 : Lf/e2;
/*    */     //   254: lconst_0
/*    */     //   255: putfield jn0 : J
/*    */     //   258: getfield K60 : Lf/Cy;
/*    */     //   261: dup
/*    */     //   262: astore_3
/*    */     //   263: ifnull -> 282
/*    */     //   266: aload_3
/*    */     //   267: getfield IY : Z
/*    */     //   270: ifeq -> 282
/*    */     //   273: aload_3
/*    */     //   274: dup
/*    */     //   275: iconst_0
/*    */     //   276: putfield IY : Z
/*    */     //   279: invokevirtual t8 : ()V
/*    */     //   282: aload_0
/*    */     //   283: dup
/*    */     //   284: aload_1
/*    */     //   285: aload_0
/*    */     //   286: aload_1
/*    */     //   287: putfield K60 : Lf/Cy;
/*    */     //   290: getfield xk0 : Lf/lF0;
/*    */     //   293: dup
/*    */     //   294: astore_3
/*    */     //   295: getfield X7 : S
/*    */     //   298: aload_3
/*    */     //   299: getfield cB0 : S
/*    */     //   302: multianewarray[[Lf/Ah; 2
/*    */     //   306: putfield kB : [[Lf/Ah;
/*    */     //   309: getstatic f/Wx0.i4 : Lf/Wx0;
/*    */     //   312: invokevirtual TV : ()V
/*    */     //   315: getfield wN : Lf/fQ;
/*    */     //   318: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   321: astore_3
/*    */     //   322: aload_3
/*    */     //   323: invokevirtual hasNext : ()Z
/*    */     //   326: ifeq -> 342
/*    */     //   329: aload_3
/*    */     //   330: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   333: checkcast f/Ah
/*    */     //   336: invokevirtual dispose : ()V
/*    */     //   339: goto -> 322
/*    */     //   342: aload_0
/*    */     //   343: dup
/*    */     //   344: dup2
/*    */     //   345: getfield wN : Lf/fQ;
/*    */     //   348: invokevirtual clear : ()V
/*    */     //   351: getfield l1 : Lf/HI;
/*    */     //   354: getfield aB0 : Lf/V60;
/*    */     //   357: invokevirtual vO : ()V
/*    */     //   360: iconst_m1
/*    */     //   361: putfield XT : I
/*    */     //   364: iconst_m1
/*    */     //   365: putfield G50 : I
/*    */     //   368: getstatic f/km.MR : Lf/Gp0;
/*    */     //   371: ifnonnull -> 400
/*    */     //   374: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   377: getfield K00 : Lf/jA0;
/*    */     //   380: ifnonnull -> 400
/*    */     //   383: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   386: aload_1
/*    */     //   387: dup
/*    */     //   388: getfield E10 : B
/*    */     //   391: istore_3
/*    */     //   392: invokevirtual zu : ()S
/*    */     //   395: iload_3
/*    */     //   396: swap
/*    */     //   397: invokevirtual Wk0 : (BS)V
/*    */     //   400: aload_1
/*    */     //   401: getfield UZ : Lf/vF;
/*    */     //   404: getfield vN : Z
/*    */     //   407: ifeq -> 424
/*    */     //   410: aload_1
/*    */     //   411: invokevirtual Xg0 : ()S
/*    */     //   414: sipush #249
/*    */     //   417: if_icmpeq -> 424
/*    */     //   420: iconst_1
/*    */     //   421: goto -> 425
/*    */     //   424: iconst_0
/*    */     //   425: putstatic f/Xi.WB : Z
/*    */     //   428: aload_0
/*    */     //   429: getfield l1 : Lf/HI;
/*    */     //   432: getfield aB0 : Lf/V60;
/*    */     //   435: checkcast f/s20
/*    */     //   438: getfield HC0 : Lf/f7;
/*    */     //   441: invokevirtual t9 : ()V
/*    */     //   444: getstatic f/km.iE0 : Lf/r9;
/*    */     //   447: invokevirtual Hf0 : ()V
/*    */     //   450: aload_0
/*    */     //   451: getfield oo0 : Lf/me;
/*    */     //   454: dup
/*    */     //   455: astore_3
/*    */     //   456: ifnonnull -> 463
/*    */     //   459: iconst_m1
/*    */     //   460: goto -> 467
/*    */     //   463: aload_3
/*    */     //   464: invokevirtual h20 : ()S
/*    */     //   467: aload_1
/*    */     //   468: getfield br0 : Lf/Ws0;
/*    */     //   471: getfield Ga : S
/*    */     //   474: if_icmpne -> 507
/*    */     //   477: iconst_1
/*    */     //   478: invokestatic D70 : (I)Z
/*    */     //   481: ifeq -> 1111
/*    */     //   484: getstatic f/UB0.PU : Lf/aY;
/*    */     //   487: sipush #129
/*    */     //   490: invokevirtual Ak : (I)Z
/*    */     //   493: ifeq -> 1111
/*    */     //   496: getstatic f/UB0.PU : Lf/aY;
/*    */     //   499: bipush #92
/*    */     //   501: invokevirtual j2 : (I)Z
/*    */     //   504: ifeq -> 1111
/*    */     //   507: aload_0
/*    */     //   508: getfield oo0 : Lf/me;
/*    */     //   511: dup
/*    */     //   512: astore_3
/*    */     //   513: ifnull -> 525
/*    */     //   516: aload_0
/*    */     //   517: aload_3
/*    */     //   518: invokevirtual dispose : ()V
/*    */     //   521: aconst_null
/*    */     //   522: putfield oo0 : Lf/me;
/*    */     //   525: aload_1
/*    */     //   526: getfield br0 : Lf/Ws0;
/*    */     //   529: getfield Ga : S
/*    */     //   532: lookupswitch default -> 904, 0 -> 1097, 7 -> 1085, 18 -> 1073, 27 -> 1060, 29 -> 1048, 32 -> 1036, 33 -> 1036, 34 -> 1036, 51 -> 1060, 63 -> 1024, 67 -> 1012, 68 -> 1012, 69 -> 1012, 70 -> 1012, 71 -> 1012, 72 -> 1012, 73 -> 1012, 74 -> 1012, 90 -> 1060, 91 -> 1060, 92 -> 1060, 97 -> 1000, 98 -> 988, 108 -> 976, 114 -> 964, 121 -> 952, 131 -> 1060, 132 -> 1060, 133 -> 1060, 137 -> 940, 138 -> 928, 159 -> 1060, 195 -> 916, 196 -> 916, 197 -> 916, 251 -> 1060, 252 -> 1060, 254 -> 1036, 318 -> 1060, 320 -> 1060, 366 -> 1060, 369 -> 1060, 372 -> 1060, 375 -> 1060, 379 -> 1060
/*    */     //   904: new f/me
/*    */     //   907: dup
/*    */     //   908: astore_3
/*    */     //   909: aload_1
/*    */     //   910: invokespecial <init> : (Lf/Cy;)V
/*    */     //   913: goto -> 1106
/*    */     //   916: new f/xD0
/*    */     //   919: dup
/*    */     //   920: astore_3
/*    */     //   921: aload_1
/*    */     //   922: invokespecial <init> : (Lf/pI;)V
/*    */     //   925: goto -> 1106
/*    */     //   928: new f/DL0
/*    */     //   931: dup
/*    */     //   932: astore_3
/*    */     //   933: aload_1
/*    */     //   934: invokespecial <init> : (Lf/pI;)V
/*    */     //   937: goto -> 1106
/*    */     //   940: new f/DF0
/*    */     //   943: dup
/*    */     //   944: astore_3
/*    */     //   945: aload_1
/*    */     //   946: invokespecial <init> : (Lf/pI;)V
/*    */     //   949: goto -> 1106
/*    */     //   952: new f/X40
/*    */     //   955: dup
/*    */     //   956: astore_3
/*    */     //   957: aload_1
/*    */     //   958: invokespecial <init> : (Lf/pI;)V
/*    */     //   961: goto -> 1106
/*    */     //   964: new f/NS
/*    */     //   967: dup
/*    */     //   968: astore_3
/*    */     //   969: aload_1
/*    */     //   970: invokespecial <init> : (Lf/pI;)V
/*    */     //   973: goto -> 1106
/*    */     //   976: new f/H6
/*    */     //   979: dup
/*    */     //   980: astore_3
/*    */     //   981: aload_1
/*    */     //   982: invokespecial <init> : (Lf/pI;)V
/*    */     //   985: goto -> 1106
/*    */     //   988: new f/IV
/*    */     //   991: dup
/*    */     //   992: astore_3
/*    */     //   993: aload_1
/*    */     //   994: invokespecial <init> : (Lf/pI;)V
/*    */     //   997: goto -> 1106
/*    */     //   1000: new f/ko0
/*    */     //   1003: dup
/*    */     //   1004: astore_3
/*    */     //   1005: aload_1
/*    */     //   1006: invokespecial <init> : (Lf/pI;)V
/*    */     //   1009: goto -> 1106
/*    */     //   1012: new f/Vx
/*    */     //   1015: dup
/*    */     //   1016: astore_3
/*    */     //   1017: aload_1
/*    */     //   1018: invokespecial <init> : (Lf/pI;)V
/*    */     //   1021: goto -> 1106
/*    */     //   1024: new f/ZJ
/*    */     //   1027: dup
/*    */     //   1028: astore_3
/*    */     //   1029: aload_1
/*    */     //   1030: invokespecial <init> : (Lf/pI;)V
/*    */     //   1033: goto -> 1106
/*    */     //   1036: new f/L90
/*    */     //   1039: dup
/*    */     //   1040: astore_3
/*    */     //   1041: aload_1
/*    */     //   1042: invokespecial <init> : (Lf/pI;)V
/*    */     //   1045: goto -> 1106
/*    */     //   1048: new f/Sw
/*    */     //   1051: dup
/*    */     //   1052: astore_3
/*    */     //   1053: aload_1
/*    */     //   1054: invokespecial <init> : (Lf/pI;)V
/*    */     //   1057: goto -> 1106
/*    */     //   1060: new f/ht
/*    */     //   1063: dup
/*    */     //   1064: astore_3
/*    */     //   1065: aload_1
/*    */     //   1066: aload_0
/*    */     //   1067: invokespecial <init> : (Lf/pI;Lf/tg;)V
/*    */     //   1070: goto -> 1106
/*    */     //   1073: new f/q30
/*    */     //   1076: dup
/*    */     //   1077: astore_3
/*    */     //   1078: aload_1
/*    */     //   1079: invokespecial <init> : (Lf/pI;)V
/*    */     //   1082: goto -> 1106
/*    */     //   1085: new f/fX
/*    */     //   1088: dup
/*    */     //   1089: astore_3
/*    */     //   1090: aload_1
/*    */     //   1091: invokespecial <init> : (Lf/pI;)V
/*    */     //   1094: goto -> 1106
/*    */     //   1097: new f/AX
/*    */     //   1100: dup
/*    */     //   1101: astore_3
/*    */     //   1102: aload_1
/*    */     //   1103: invokespecial <init> : (Lf/pI;)V
/*    */     //   1106: aload_0
/*    */     //   1107: aload_3
/*    */     //   1108: putfield oo0 : Lf/me;
/*    */     //   1111: aload_1
/*    */     //   1112: iconst_0
/*    */     //   1113: istore_3
/*    */     //   1114: iconst_0
/*    */     //   1115: istore #4
/*    */     //   1117: getfield et0 : I
/*    */     //   1120: dup
/*    */     //   1121: istore #5
/*    */     //   1123: ifle -> 1157
/*    */     //   1126: aload_1
/*    */     //   1127: getfield ey : I
/*    */     //   1130: dup
/*    */     //   1131: istore #6
/*    */     //   1133: ifle -> 1157
/*    */     //   1136: aload_2
/*    */     //   1137: dup
/*    */     //   1138: getfield x : F
/*    */     //   1141: iload #5
/*    */     //   1143: i2f
/*    */     //   1144: fdiv
/*    */     //   1145: f2i
/*    */     //   1146: istore_3
/*    */     //   1147: getfield y : F
/*    */     //   1150: iload #6
/*    */     //   1152: i2f
/*    */     //   1153: fdiv
/*    */     //   1154: f2i
/*    */     //   1155: istore #4
/*    */     //   1157: aload_0
/*    */     //   1158: getfield XT : I
/*    */     //   1161: iload_3
/*    */     //   1162: if_icmpne -> 1174
/*    */     //   1165: aload_0
/*    */     //   1166: getfield G50 : I
/*    */     //   1169: iload #4
/*    */     //   1171: if_icmpeq -> 1185
/*    */     //   1174: aload_0
/*    */     //   1175: dup
/*    */     //   1176: iload_3
/*    */     //   1177: putfield XT : I
/*    */     //   1180: iload #4
/*    */     //   1182: putfield G50 : I
/*    */     //   1185: aload_1
/*    */     //   1186: iconst_1
/*    */     //   1187: istore_2
/*    */     //   1188: getfield br0 : Lf/Ws0;
/*    */     //   1191: getfield gS : B
/*    */     //   1194: dup
/*    */     //   1195: istore #5
/*    */     //   1197: iconst_1
/*    */     //   1198: if_icmpeq -> 1223
/*    */     //   1201: iload #5
/*    */     //   1203: bipush #11
/*    */     //   1205: if_icmpeq -> 1223
/*    */     //   1208: iload #5
/*    */     //   1210: bipush #13
/*    */     //   1212: if_icmpeq -> 1218
/*    */     //   1215: goto -> 1225
/*    */     //   1218: iconst_3
/*    */     //   1219: istore_2
/*    */     //   1220: goto -> 1225
/*    */     //   1223: iconst_2
/*    */     //   1224: istore_2
/*    */     //   1225: iload_3
/*    */     //   1226: iload_2
/*    */     //   1227: invokestatic nanoTime : ()J
/*    */     //   1230: pop2
/*    */     //   1231: iconst_0
/*    */     //   1232: istore #5
/*    */     //   1234: iconst_0
/*    */     //   1235: istore #6
/*    */     //   1237: isub
/*    */     //   1238: iconst_0
/*    */     //   1239: swap
/*    */     //   1240: invokestatic max : (II)I
/*    */     //   1243: istore #7
/*    */     //   1245: iload #7
/*    */     //   1247: iload_3
/*    */     //   1248: iload_2
/*    */     //   1249: iadd
/*    */     //   1250: if_icmpgt -> 1548
/*    */     //   1253: iload #4
/*    */     //   1255: iload_2
/*    */     //   1256: isub
/*    */     //   1257: iconst_0
/*    */     //   1258: swap
/*    */     //   1259: invokestatic max : (II)I
/*    */     //   1262: istore #8
/*    */     //   1264: iload #8
/*    */     //   1266: iload #4
/*    */     //   1268: iload_2
/*    */     //   1269: iadd
/*    */     //   1270: if_icmpgt -> 1542
/*    */     //   1273: iload #7
/*    */     //   1275: iflt -> 1536
/*    */     //   1278: iload #8
/*    */     //   1280: ifge -> 1286
/*    */     //   1283: goto -> 1536
/*    */     //   1286: aload_1
/*    */     //   1287: iload #7
/*    */     //   1289: iload #8
/*    */     //   1291: invokevirtual C20 : (II)Lf/QJ;
/*    */     //   1294: dup
/*    */     //   1295: astore #9
/*    */     //   1297: ifnonnull -> 1303
/*    */     //   1300: goto -> 1536
/*    */     //   1303: aload_0
/*    */     //   1304: getfield kB : [[Lf/Ah;
/*    */     //   1307: iload #7
/*    */     //   1309: aaload
/*    */     //   1310: iload #8
/*    */     //   1312: aaload
/*    */     //   1313: ifnonnull -> 1536
/*    */     //   1316: aload_1
/*    */     //   1317: iload #7
/*    */     //   1319: iload #8
/*    */     //   1321: invokevirtual bD : (II)Lf/gb;
/*    */     //   1324: dup
/*    */     //   1325: astore #5
/*    */     //   1327: new f/Ah
/*    */     //   1330: dup
/*    */     //   1331: astore #6
/*    */     //   1333: aload_0
/*    */     //   1334: aload #6
/*    */     //   1336: aload #5
/*    */     //   1338: aload #9
/*    */     //   1340: invokeinterface gT : ()Lf/Bs;
/*    */     //   1345: checkcast f/LW
/*    */     //   1348: invokespecial <init> : (Lf/gb;Lf/LW;)V
/*    */     //   1351: getfield Cc0 : Lf/lw;
/*    */     //   1354: invokevirtual ej0 : (Lf/lw;)V
/*    */     //   1357: getfield gS : B
/*    */     //   1360: dup
/*    */     //   1361: istore #5
/*    */     //   1363: iconst_1
/*    */     //   1364: if_icmpeq -> 1449
/*    */     //   1367: iload #5
/*    */     //   1369: iconst_5
/*    */     //   1370: if_icmpeq -> 1410
/*    */     //   1373: aload #6
/*    */     //   1375: getfield w3 : Lf/eo;
/*    */     //   1378: iload #8
/*    */     //   1380: iload #7
/*    */     //   1382: bipush #8
/*    */     //   1384: imul
/*    */     //   1385: iconst_4
/*    */     //   1386: iadd
/*    */     //   1387: i2f
/*    */     //   1388: fstore #5
/*    */     //   1390: bipush #8
/*    */     //   1392: imul
/*    */     //   1393: iconst_4
/*    */     //   1394: iadd
/*    */     //   1395: i2f
/*    */     //   1396: fstore #9
/*    */     //   1398: fload #5
/*    */     //   1400: fconst_0
/*    */     //   1401: fload #9
/*    */     //   1403: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1406: pop
/*    */     //   1407: goto -> 1485
/*    */     //   1410: aload #6
/*    */     //   1412: getfield w3 : Lf/eo;
/*    */     //   1415: iload #8
/*    */     //   1417: iload #7
/*    */     //   1419: bipush #8
/*    */     //   1421: imul
/*    */     //   1422: bipush #8
/*    */     //   1424: iadd
/*    */     //   1425: i2f
/*    */     //   1426: fstore #5
/*    */     //   1428: bipush #8
/*    */     //   1430: imul
/*    */     //   1431: bipush #8
/*    */     //   1433: iadd
/*    */     //   1434: i2f
/*    */     //   1435: fstore #9
/*    */     //   1437: fload #5
/*    */     //   1439: fconst_0
/*    */     //   1440: fload #9
/*    */     //   1442: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1445: pop
/*    */     //   1446: goto -> 1485
/*    */     //   1449: aload #6
/*    */     //   1451: getfield w3 : Lf/eo;
/*    */     //   1454: iload #8
/*    */     //   1456: iload #7
/*    */     //   1458: bipush #32
/*    */     //   1460: imul
/*    */     //   1461: bipush #16
/*    */     //   1463: iadd
/*    */     //   1464: i2f
/*    */     //   1465: fstore #5
/*    */     //   1467: bipush #32
/*    */     //   1469: imul
/*    */     //   1470: bipush #16
/*    */     //   1472: iadd
/*    */     //   1473: i2f
/*    */     //   1474: fstore #9
/*    */     //   1476: fload #5
/*    */     //   1478: fconst_0
/*    */     //   1479: fload #9
/*    */     //   1481: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   1484: pop
/*    */     //   1485: aload #6
/*    */     //   1487: aload_0
/*    */     //   1488: dup
/*    */     //   1489: aload #6
/*    */     //   1491: invokevirtual hj0 : ()V
/*    */     //   1494: getfield kB : [[Lf/Ah;
/*    */     //   1497: iload #7
/*    */     //   1499: aaload
/*    */     //   1500: iload #8
/*    */     //   1502: aload #6
/*    */     //   1504: aastore
/*    */     //   1505: getfield wN : Lf/fQ;
/*    */     //   1508: aload #6
/*    */     //   1510: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   1513: iconst_1
/*    */     //   1514: istore #6
/*    */     //   1516: getfield K9 : Lf/lpt1;
/*    */     //   1519: dup
/*    */     //   1520: dup
/*    */     //   1521: fconst_1
/*    */     //   1522: putfield OU : F
/*    */     //   1525: fconst_1
/*    */     //   1526: putfield Zr0 : F
/*    */     //   1529: fconst_1
/*    */     //   1530: putfield gE0 : F
/*    */     //   1533: iconst_1
/*    */     //   1534: istore #5
/*    */     //   1536: iinc #8, 1
/*    */     //   1539: goto -> 1264
/*    */     //   1542: iinc #7, 1
/*    */     //   1545: goto -> 1245
/*    */     //   1548: iload #6
/*    */     //   1550: ifeq -> 1624
/*    */     //   1553: invokestatic hS : ()Z
/*    */     //   1556: ifeq -> 1624
/*    */     //   1559: getstatic f/D.N2 : Lf/D;
/*    */     //   1562: dup
/*    */     //   1563: dup
/*    */     //   1564: astore_2
/*    */     //   1565: getfield vt : Lf/Oe0;
/*    */     //   1568: invokevirtual d : ()V
/*    */     //   1571: getfield l00 : Lf/ga0;
/*    */     //   1574: ifnull -> 1624
/*    */     //   1577: aload_2
/*    */     //   1578: getfield ni : Lf/JG0;
/*    */     //   1581: dup
/*    */     //   1582: astore_3
/*    */     //   1583: ifnull -> 1596
/*    */     //   1586: aload_2
/*    */     //   1587: getfield hp : Lf/fQ;
/*    */     //   1590: aload_3
/*    */     //   1591: iconst_1
/*    */     //   1592: invokevirtual Ct : (Ljava/lang/Object;Z)Z
/*    */     //   1595: pop
/*    */     //   1596: aload_2
/*    */     //   1597: dup
/*    */     //   1598: dup2
/*    */     //   1599: aconst_null
/*    */     //   1600: putfield ni : Lf/JG0;
/*    */     //   1603: invokevirtual du0 : ()V
/*    */     //   1606: getfield l00 : Lf/ga0;
/*    */     //   1609: invokevirtual dispose : ()V
/*    */     //   1612: getfield hp : Lf/fQ;
/*    */     //   1615: aload_2
/*    */     //   1616: getfield l00 : Lf/ga0;
/*    */     //   1619: iconst_1
/*    */     //   1620: invokevirtual Ct : (Ljava/lang/Object;Z)Z
/*    */     //   1623: pop
/*    */     //   1624: iload #5
/*    */     //   1626: ifeq -> 1651
/*    */     //   1629: iconst_1
/*    */     //   1630: invokestatic D70 : (I)Z
/*    */     //   1633: ifeq -> 1651
/*    */     //   1636: getstatic f/tg.a00 : Lf/ik;
/*    */     //   1639: getstatic f/h1.A4 : Lf/ik;
/*    */     //   1642: pop
/*    */     //   1643: invokestatic nanoTime : ()J
/*    */     //   1646: pop2
/*    */     //   1647: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1650: pop
/*    */     //   1651: aload_1
/*    */     //   1652: aload_0
/*    */     //   1653: dup
/*    */     //   1654: dup
/*    */     //   1655: dup2
/*    */     //   1656: dup2
/*    */     //   1657: getfield E40 : Lf/K70;
/*    */     //   1660: aload_0
/*    */     //   1661: invokevirtual zf0 : ()Lf/Ih0;
/*    */     //   1664: invokevirtual mx0 : (Lf/ny;)V
/*    */     //   1667: invokevirtual PL0 : ()V
/*    */     //   1670: getfield Zg : Lf/kg0;
/*    */     //   1673: invokevirtual begin : ()V
/*    */     //   1676: getfield Zg : Lf/kg0;
/*    */     //   1679: invokevirtual iy : ()V
/*    */     //   1682: getfield Zg : Lf/kg0;
/*    */     //   1685: invokevirtual ZK0 : ()V
/*    */     //   1688: getfield Zg : Lf/kg0;
/*    */     //   1691: invokevirtual end : ()V
/*    */     //   1694: getfield E40 : Lf/K70;
/*    */     //   1697: aload_0
/*    */     //   1698: getfield Zg : Lf/kg0;
/*    */     //   1701: invokevirtual tx0 : (Lf/tk;)V
/*    */     //   1704: ifnull -> 1906
/*    */     //   1707: aload_1
/*    */     //   1708: getfield Eo : Lf/xm;
/*    */     //   1711: getstatic f/xm.jQ : Lf/xm;
/*    */     //   1714: if_acmpne -> 1724
/*    */     //   1717: aload_1
/*    */     //   1718: getfield lpT1 : Z
/*    */     //   1721: ifeq -> 1906
/*    */     //   1724: getstatic f/km.u4 : Lf/R8;
/*    */     //   1727: getfield Ta0 : I
/*    */     //   1730: bipush #7
/*    */     //   1732: if_icmpeq -> 1906
/*    */     //   1735: aload_0
/*    */     //   1736: dup
/*    */     //   1737: dup
/*    */     //   1738: getfield fY : Lf/eo;
/*    */     //   1741: aload_0
/*    */     //   1742: getfield To0 : Lf/Ih0;
/*    */     //   1745: getfield I70 : Lf/eo;
/*    */     //   1748: invokevirtual JL : (Lf/eo;)Lf/eo;
/*    */     //   1751: pop
/*    */     //   1752: getfield fY : Lf/eo;
/*    */     //   1755: dup
/*    */     //   1756: getfield y : F
/*    */     //   1759: ldc_w 0.125
/*    */     //   1762: fadd
/*    */     //   1763: putfield y : F
/*    */     //   1766: getfield Bu0 : F
/*    */     //   1769: fconst_1
/*    */     //   1770: fcmpg
/*    */     //   1771: ifge -> 1779
/*    */     //   1774: aload_0
/*    */     //   1775: fconst_1
/*    */     //   1776: putfield Bu0 : F
/*    */     //   1779: aload_0
/*    */     //   1780: getfield Bu0 : F
/*    */     //   1783: ldc_w 5.0
/*    */     //   1786: fcmpl
/*    */     //   1787: ifle -> 1797
/*    */     //   1790: aload_0
/*    */     //   1791: ldc_w 5.0
/*    */     //   1794: putfield Bu0 : F
/*    */     //   1797: aload_0
/*    */     //   1798: dup
/*    */     //   1799: dup
/*    */     //   1800: dup2
/*    */     //   1801: dup2
/*    */     //   1802: getfield T60 : Lf/Tb;
/*    */     //   1805: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1808: invokevirtual WU : ()Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1811: pop
/*    */     //   1812: getfield T60 : Lf/Tb;
/*    */     //   1815: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1818: aload_0
/*    */     //   1819: getfield To0 : Lf/Ih0;
/*    */     //   1822: dup
/*    */     //   1823: dup
/*    */     //   1824: getfield I70 : Lf/eo;
/*    */     //   1827: astore_1
/*    */     //   1828: getfield H : Lf/eo;
/*    */     //   1831: astore_2
/*    */     //   1832: getfield nj0 : Lf/eo;
/*    */     //   1835: astore_3
/*    */     //   1836: aload_1
/*    */     //   1837: aload_2
/*    */     //   1838: aload_3
/*    */     //   1839: invokevirtual Cj : (Lf/eo;Lf/eo;Lf/eo;)V
/*    */     //   1842: getfield T60 : Lf/Tb;
/*    */     //   1845: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1848: aload_0
/*    */     //   1849: getfield fY : Lf/eo;
/*    */     //   1852: invokevirtual b8 : (Lf/eo;)V
/*    */     //   1855: getfield T60 : Lf/Tb;
/*    */     //   1858: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1861: getstatic f/eo.X : Lf/eo;
/*    */     //   1864: ldc_w 90.0
/*    */     //   1867: invokevirtual N8 : (Lf/eo;F)Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1870: pop
/*    */     //   1871: getfield T60 : Lf/Tb;
/*    */     //   1874: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   1877: aload_0
/*    */     //   1878: getfield Bu0 : F
/*    */     //   1881: ldc_w 1.2
/*    */     //   1884: fmul
/*    */     //   1885: dup
/*    */     //   1886: dup
/*    */     //   1887: invokevirtual GJ : (FFF)V
/*    */     //   1890: getfield E40 : Lf/K70;
/*    */     //   1893: invokevirtual Ly0 : ()V
/*    */     //   1896: getfield E40 : Lf/K70;
/*    */     //   1899: aload_0
/*    */     //   1900: getfield T60 : Lf/Tb;
/*    */     //   1903: invokevirtual tx0 : (Lf/tk;)V
/*    */     //   1906: aload_0
/*    */     //   1907: dup
/*    */     //   1908: getfield E40 : Lf/K70;
/*    */     //   1911: invokevirtual end : ()V
/*    */     //   1914: getstatic f/km.iE0 : Lf/r9;
/*    */     //   1917: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   1920: pop
/*    */     //   1921: getfield w6 : Z
/*    */     //   1924: ifne -> 2031
/*    */     //   1927: iconst_0
/*    */     //   1928: istore_1
/*    */     //   1929: iload_1
/*    */     //   1930: sipush #200
/*    */     //   1933: if_icmpge -> 1956
/*    */     //   1936: aload_0
/*    */     //   1937: dup
/*    */     //   1938: getfield Og : [F
/*    */     //   1941: iload_1
/*    */     //   1942: fconst_0
/*    */     //   1943: fastore
/*    */     //   1944: getfield OI0 : [J
/*    */     //   1947: iload_1
/*    */     //   1948: lconst_0
/*    */     //   1949: lastore
/*    */     //   1950: iinc #1, 1
/*    */     //   1953: goto -> 1929
/*    */     //   1956: getstatic f/km.u4 : Lf/R8;
/*    */     //   1959: dup
/*    */     //   1960: astore_0
/*    */     //   1961: getfield GG0 : Z
/*    */     //   1964: ifeq -> 1977
/*    */     //   1967: aload_0
/*    */     //   1968: iconst_0
/*    */     //   1969: putfield GG0 : Z
/*    */     //   1972: iconst_1
/*    */     //   1973: istore_1
/*    */     //   1974: goto -> 1979
/*    */     //   1977: iconst_0
/*    */     //   1978: istore_1
/*    */     //   1979: iload_1
/*    */     //   1980: ifeq -> 2017
/*    */     //   1983: getstatic f/km.a3 : Lf/vh0;
/*    */     //   1986: getfield Ct : Lf/Jo;
/*    */     //   1989: dup
/*    */     //   1990: getfield J : Lf/static;
/*    */     //   1993: iconst_0
/*    */     //   1994: putfield Jg0 : Z
/*    */     //   1997: getfield pm : Lf/d7;
/*    */     //   2000: iconst_1
/*    */     //   2001: anewarray f/nl
/*    */     //   2004: dup
/*    */     //   2005: getstatic f/nl.Dn0 : Lf/nl;
/*    */     //   2008: iconst_0
/*    */     //   2009: swap
/*    */     //   2010: aastore
/*    */     //   2011: invokevirtual Kk : ([Lf/nl;)V
/*    */     //   2014: goto -> 2021
/*    */     //   2017: aload_0
/*    */     //   2018: invokevirtual D80 : ()V
/*    */     //   2021: invokestatic Bp : ()Lf/ud;
/*    */     //   2024: sipush #500
/*    */     //   2027: iconst_0
/*    */     //   2028: invokevirtual Xk : (IZ)V
/*    */     //   2031: return
/*    */     //   2032: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 9
/*    */     //   #2	-> 15
/*    */     //   #3	-> 18
/*    */     //   #4	-> 24
/*    */     //   #5	-> 57
/*    */     //   #6	-> 61
/*    */     //   #7	-> 112
/*    */     //   #8	-> 208
/*    */     //   #9	-> 211
/*    */     //   #10	-> 215
/*    */     //   #11	-> 229
/*    */     //   #12	-> 235
/*    */     //   #13	-> 248
/*    */     //   #14	-> 251
/*    */     //   #15	-> 255
/*    */     //   #16	-> 258
/*    */     //   #17	-> 267
/*    */     //   #18	-> 276
/*    */     //   #19	-> 287
/*    */     //   #20	-> 290
/*    */     //   #21	-> 295
/*    */     //   #22	-> 299
/*    */     //   #23	-> 302
/*    */     //   #24	-> 309
/*    */     //   #25	-> 312
/*    */     //   #26	-> 354
/*    */     //   #27	-> 357
/*    */     //   #28	-> 377
/*    */     //   #29	-> 383
/*    */     //   #30	-> 388
/*    */     //   #31	-> 392
/*    */     //   #32	-> 401
/*    */     //   #33	-> 404
/*    */     //   #34	-> 411
/*    */     //   #35	-> 432
/*    */     //   #36	-> 435
/*    */     //   #37	-> 438
/*    */     //   #38	-> 441
/*    */     //   #39	-> 444
/*    */     //   #40	-> 468
/*    */     //   #41	-> 471
/*    */     //   #42	-> 478
/*    */     //   #43	-> 484
/*    */     //   #44	-> 526
/*    */     //   #45	-> 529
/*    */     //   #46	-> 1117
/*    */     //   #47	-> 1127
/*    */     //   #48	-> 1138
/*    */     //   #49	-> 1188
/*    */     //   #50	-> 1191
/*    */     //   #51	-> 1227
/*    */     //   #52	-> 1240
/*    */     //   #53	-> 1522
/*    */     //   #54	-> 1526
/*    */     //   #55	-> 1553
/*    */     //   #56	-> 1565
/*    */     //   #57	-> 1568
/*    */     //   #58	-> 1571
/*    */     //   #59	-> 1578
/*    */     //   #60	-> 1606
/*    */     //   #61	-> 1630
/*    */     //   #62	-> 1636
/*    */     //   #63	-> 1643
/*    */     //   #64	-> 1647
/*    */     //   #65	-> 1657
/*    */     //   #66	-> 1708
/*    */     //   #67	-> 1711
/*    */     //   #68	-> 1718
/*    */     //   #69	-> 1724
/*    */     //   #70	-> 1727
/*    */     //   #71	-> 1738
/*    */     //   #72	-> 1961
/*    */     //   #73	-> 1969
/*    */     //   #74	-> 1983
/*    */     //   #75	-> 1986
/*    */     //   #76	-> 1990
/*    */     //   #77	-> 1994
/*    */     //   #78	-> 1997
/*    */     //   #79	-> 2001
/* 10 */     //   #80	-> 2028 } public final void rJ() {} public final void YB(Jo paramJo, Ih0 paramIh0, boolean paramBoolean) { eo eo = paramJo.pm.cOm3; float f = eo.z * 0.25F + 0.1F; this.tM.TG0(eo.x * 0.25F, f, eo.y * 0.25F + 0.1F); Cy cy; if ((cy = this.K60) != null) { float f1, f2; byte b = (byte)(cy.br0.et & 0xFFFFFFFE); Xu0 xu0 = (Xu0)this.DA.Hl.Ha0(b); short s; if ((s = this.K60.br0.Ga) == 28) { paramIh0.Bj = xu0.b7 / 196.0F; } else if (s == 250) { paramIh0.Bj = xu0.b7 / 96.0F - 8.0F; } else if (!this.xy) { paramIh0.Bj = xu0.b7 / 96.0F; }  float f6, f7 = (f6 = xu0.Z2) / 64.0F + 1.0F; if (!this.xy && h1.hR && s != 250) { paramIh0.Bj *= 0.6F; f7 = f6 / 42.0F; }  if (s == 0) f7 *= 2.0F;  paramIh0.l6 = xu0.aU + 4.0F; paramIh0.Ce0 = xu0.Sz0 / 4.0F + 0.1F; if (s == 155) { paramIh0.l6 = paramIh0.el0 + 6.0F; } else if (s == 249) { paramIh0.l6 = paramIh0.el0 + 30.0F; }  if (this.wg == yE0.qB) paramIh0.l6 = paramIh0.el0 + 5.0F;  boolean bool = false; float f4 = 0.0F; pI pI = (pI)km.a3.Jr0(); G5 g5;
/* 11 */       if ((g5 = paramJo.HW)
/* 12 */         .LB0 && pI
/* 13 */         .Xg0() != 114 && pI.Xg0() != 121 && pI.Xg0() != 137) { CoM8 coM8; if ((coM8 = (CoM8)g5.CJ0()) != null) { HE0 hE0 = coM8.ls0;
/*    */           
/* 15 */           rD rD1 = pI.oL0.Ha[hE0.E1], rD2 = pI.oL0.Ha[hE0.wP]; ta ta1 = arrayOfTa[hE0.O1], ta2 = arrayOfTa[rD1.i0]; ta arrayOfTa[], ta3 = (arrayOfTa = pI.oL0.Tu0)[rD2.i0]; float f11 = -((((ta1.cOM8 & 0xFFFF) / 65536.0F * 360.0F + 360.0F) % 360.0F + 360.0F) % 360.0F), f8 = ta1.o5 / 4.0F, f15 = Math.max(hE0.r90, 1); float f13, f14; if ((f13 = ta2.o5 / 4.0F) != (f14 = ta3.o5 / 4.0F) || f13 != f8) { int m; if ((m = ta1.pL0) != 19 && m != 17 && m != 5 && m != 12 && m != 1)
/*    */             
/*    */             { 
/* 18 */               f8 = NUL.df(f14, f13, km.a3.Ct.HW.mm / f15, f13); } else if (f8 == 2)
/* 19 */             { f8 = ta1.o5 / 4.0F; } else { f8 = ta1.o5 / 8.0F; }  }  f8++; if (pI.Xg0() == 28 && coM8.hA0() <= -3) paramIh0.Bj *= 1.25F;  float f9 = Xu0.uo0(ta2.DO), f10 = Xu0.uo0(ta1.DO);
/*    */ 
/*    */           
/* 22 */           f9 = NUL.df(Xu0.uo0(ta3.DO), f9, km.a3.Ct.HW.mm / f15, f9); int k;
/* 23 */           if ((k = ta1.pL0) == 4) f9 = f10;  if (k == 11) f9 = Xu0.uo0(ta1.cOM8); 
/* 24 */           float f12 = (coM8.fl0 % 360.0F + 360.0F) % 360.0F; for (; f12 - (
/* 25 */             f14 = paramIh0.Mp) > 30.0F; paramIh0.Mp = f14 + 360.0F); for (; f12 - (f14 = paramIh0.Mp) < -30.0F; paramIh0.Mp = f14 - 360.0F); if (pI.Xg0() == 66) { bool = true; paramIh0.IG0 = f9 = -34.0F; if (ta1.pL0 == 4)
/*    */             
/* 27 */             { f12 = (coM8.ap0.y - 0.66666675F) / 5.333333F * -90.0F + 270.0F; f4 = 270.0F; } else { f4 = paramIh0.Mp; }  float f16; for (; f9 - (f16 = paramIh0.IG0) > 30.0F; paramIh0.IG0 = f16 + 360.0F); float f17; for (; (f17 = f9 - (f16 = paramIh0.IG0)) < -30.0F; paramIh0.IG0 = f16 - 360.0F); if (f17 > 180.0F || f17 < -180.0F) f9 = f16;  }  int i; if ((i = ta1.pL0) == 19) { paramIh0.IG0 = f10; paramIh0.Mp = f11; paramIh0.el0 = f8; } else { f11 = f12; f10 = f9; }  int j; if (((j = this.gA) == 19 && i != 19) || j == -1) { paramIh0.IG0 = f10; paramIh0.Mp = f11; paramIh0.el0 = f8; }  if (this.wI == null)
/*    */           { d7 d7;
/* 29 */             if ((d7 = km.a3.Ct.pm)
/* 30 */               .n3)
/*    */             
/*    */             { 
/* 33 */               f7 = (float)(zm0.u20 - d7.xc) / d7.tD0;
/* 34 */               paramIh0.IG0 = NUL.df(f10, this.pH0, f7, this.pH0); paramIh0.Mp = (((f11 - (f8 = this.Jt0) + 360.0F + 180.0F) % 360.0F - 180.0F) * f7 + f8 + 360.0F) % 360.0F; paramIh0.el0 = NUL.df(f8, this.lpT8, f7, this.lpT8); } else { this.pH0 = f10; this.Jt0 = f11; this.lpT8 = f8; paramIh0.Mp = f11; paramIh0.el0 = f8; paramIh0.IG0 = f10; }  }  this.gA = i; }  } else { paramIh0.Mp = 0.0F; paramIh0.el0 = f7; paramIh0.IG0 = Xu0.uo0(xu0.Lq); if (this.K60.Xg0() == 137) { paramIh0.el0 = f7 * 1.25F; paramIh0.IG0 = -30.0F; }  this.gA = -1;
/*    */         
/* 36 */         short s1 = this.K60.br0.Ka0;
/*    */         M00 m00;
/* 38 */         if ((m00 = (M00)this.DA.cG0.Z90(s1)) != null)
/* 39 */         { XL xL2; this.tM
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 44 */             .x = nx0.SA0(this.tM.x, (xL2 = m00.Hg0[0]).T60 / 64.0F, xL2.Dd / 64.0F);
/*    */           
/*    */           XL xL1;
/*    */           
/* 48 */           this.tM.z = nx0.SA0(this.tM.z, (xL1 = m00.Hg0[0]).Uj0 / 64.0F, xL1.fv0 / 64.0F); }  this
/* 49 */           .pH0 = paramIh0.IG0; this.Jt0 = paramIh0.Mp; this.lpT8 = paramIh0.el0; }
/* 50 */        float f3 = xu0.VE0; f3 = ((xu0.PQ & 0xFFFF) / 65536.0F + f3) * 0.25F;
/* 51 */       float f5 = xu0.Q10; f5 = -((xu0.vx0 & 0xFFFF) / 65536.0F + f5) * 0.25F;
/* 52 */       f7 = xu0.PK0; f7 = -((xu0.n1 & 0xFFFF) / 65536.0F + f7) * 0.25F;
/* 53 */       if (xu0.Z60 == 0) { f1 = -f5; this.tM.TG0(f3, f1, -f7); paramIh0.el0 = 10.0F; f1 = this.tM.x; f2 = this.tM.y * 0.2F; f3 = this.tM.z; paramIh0.rE0(f1, f2, f3, 0.0F, 0.0F, 0.0F); } else { if (f2 != 0.0F) {
/* 54 */           long l1, l2 = (l1 = zm0.u20) - 200L;
/* 55 */           this.QF = j; int j; float[] arrayOfFloat; if ((j = this.QF + 1) >= (arrayOfFloat = this.Og).length) this.QF = 0;  int i; float f10; long l3; float f11; byte b1; for (arrayOfFloat[i = this.QF] = this.tM.y, this.OI0[i] = l1, l1 = 0L, f10 = 0.0F, l3 = Long.MAX_VALUE, f11 = 0.0F, b1 = 0; b1 < 'È'; ) { long l; if ((l = this.OI0[b1]) != 0L) { int k; if ((k = l cmp l2) <= 0 && l > l1) { f10 = this.Og[b1]; l1 = l; }  if (k > 0 && l < l3) { float f12 = this.Og[b1]; l3 = l; }  }  b1++; }  if (l3 != Long.MAX_VALUE) if (l1 == 0L) { this.tM.y = f11; } else { float f12 = (float)(l2 - l1) / (float)(l3 - l1); f10 = NUL.df(f11, f10, f12, f10); eo eo1; float f13; double d; if ((d = ((f13 = (eo1 = this.tM).y) - f10)) > 0.25D) { eo1.y = (float)(f13 - 0.25D); } else if (d < -0.25D) { eo1.y = (float)(f13 + 0.25D); } else { eo1.y = f10; }  }  
/* 56 */         }  tr tr; float f8 = (((tr = tr.Jv).hn0 % 2 == 0) ? tr.fm : -tr.fm); f1 = f8 * 0.02F; this
/* 57 */           .tM.uD(f1, 0.0F, f1); f1 = this.tM.x; f8 = this.tM.y; float f9 = this.tM.z; paramIh0.rE0(f1, f8, f9, f3, f5, f7); if (f1 != 0.0F) { nC0
/* 58 */             .x = 6.5F;
/* 59 */           nC0.y = 4.0F; NC0 nC0;
/* 60 */           (nC0 = SZ)
/* 61 */             .x = 4.0F;
/* 62 */           SZ.y = 4.0F; f8 = -f4;
/* 63 */           nC0.x -= 4.0F; nC0.y -= 4.0F;
/* 64 */           nC0.Nr(f8).f80(nC0);
/* 65 */           paramIh0.el0 = 4.5F; float f10 = nC0.x; f8 = this.tM.y; f4 = (nC0 = df0).y; paramIh0.rE0(f10, f8, f4, f3, f5, f7); }  }  }  if (this.wJ) { this.Z5.l6 = 1000.0F; this.Z5.Ce0 = 0.1F; this.Z5.Bj = paramIh0.Bj; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.l1.aB0.vO();
/*    */     me me;
/*    */     if ((me = this.oo0) != null)
/*    */       dispose(); 
/*    */   }
/*    */   
/*    */   public final void ek() {
/*    */     this.xy = true;
/*    */     this.To0.Bj--;
/*    */   }
/*    */   
/*    */   public final void k0() {
/*    */     this.xy = true;
/*    */     this.To0.Bj++;
/*    */   }
/*    */   
/*    */   public final void CH(double paramDouble) {}
/*    */   
/*    */   public final void BJ0(float paramFloat) {
/*    */     this.To0.Bj = paramFloat;
/*    */   }
/*    */   
/*    */   public final float x0() {
/*    */     return 67.0F;
/*    */   }
/*    */   
/*    */   public final void Xv0() {
/*    */     this.xy = false;
/*    */     this.To0.Bj = 67.0F;
/*    */   }
/*    */   
/*    */   public final String XX() {
/*    */     Xu0 xu0;
/*    */     String str = "\n\nMapHeader:";
/*    */     str = zw.vz(zw.vz(zw.vz(zw.vz(str, "\nID: ").append(this.K60.br0.Ga).toString(), "\nMatrix: ").append(this.K60.xk0.sa0).toString(), "\nTilesetID: ").append(this.K60.br0.COm4).toString(), "\nLight ID: ").append(this.K60.br0.P2.YI0).toString();
/*    */     if (this.K60 != null && this.Cc0 != null)
/*    */       str = zw.vz(str, "\nClearColor: ").append(this.Cc0.Jb0).toString(); 
/*    */     pI pI;
/*    */     G5 g5;
/*    */     CoM8 coM8;
/*    */     if ((pI = (pI)km.a3.Jr0()) != null && (g5 = km.a3.Ct.HW).LB0 && (coM8 = (CoM8)g5.CJ0()) != null) {
/*    */       HE0 hE0 = coM8.ls0;
/*    */       rD rD1 = pI.oL0.Ha[hE0.E1], rD2 = pI.oL0.Ha[hE0.wP];
/*    */       ta ta1 = arrayOfTa[hE0.O1], ta2 = arrayOfTa[rD1.i0];
/*    */       ta arrayOfTa[], ta3 = (arrayOfTa = pI.oL0.Tu0)[rD2.i0];
/*    */       str = zw.vz(zw.vz(zw.vz(zw.vz(zw.vz(str, "\nPoint A:  ").append(hE0.E1).toString(), "\nPoint B: ").append(hE0.wP).toString(), "\n\nCamera A: ").append(rD1.i0).append("\n\t» Type: ").append(ta2.pL0).append("\n\t» Distance: ").append(ta2.o5).append("\n\t» Yaw: ").append(ta2.DO).append("\n\t» Pitch: ").append(ta2.cOM8).toString(), "\n\nCamera B: ").append(rD2.i0).append("\n\t» Type: ").append(ta3.pL0).append("\n\t» Distance: ").append(ta3.o5).append("\n\t» Yaw: ").append(ta3.DO).append("\n\t» Pitch: ").append(ta3.cOM8).toString(), "\n\nCamera L: ").append(hE0.O1).append("\n\t» Type: ").append(ta1.pL0).append("\n\t» Distance: ").append(ta1.o5).append("\n\t» Yaw: ").append(ta1.DO).append("\n\t» Pitch: ").append(ta1.cOM8).toString();
/*    */     } 
/*    */     Cy cy;
/*    */     if ((cy = this.K60) != null) {
/*    */       byte b1;
/*    */       byte b = (byte)(cy.br0.et & 0xFFFFFFFE);
/*    */       xu0 = (Xu0)this.DA.Hl.Ha0(b);
/*    */       StringBuilder stringBuilder = zw.vz(str, "\n\nCameras:\nID: ");
/*    */       Cy cy1;
/*    */       if ((cy1 = this.K60) == null) {
/*    */         b1 = -1;
/*    */       } else {
/*    */         b1 = b1.br0.et;
/*    */       } 
/*    */       return stringBuilder.append(b1).append("\nBW Distance: ").append(xu0.Z2).append("\nDIST: ").append(this.To0.el0).append("\nYAW: ").append(this.To0.IG0).append("\nPITCH: ").append(this.To0.Mp).toString();
/*    */     } 
/*    */     return (String)xu0;
/*    */   }
/*    */   
/*    */   public final void j00(short[] paramArrayOfshort) {
/*    */     super.j00(paramArrayOfshort);
/*    */     int i = this.w6 ^ true;
/*    */     Cy cy;
/*    */     me me2;
/*    */     if ((cy = (Cy)km.a3.Jr0()) == null || (((me2 = this.oo0) == null) ? 0 : me2.h20()) != cy.br0.Ga)
/*    */       i = 1; 
/*    */     if (i != 0) {
/*    */       UB0.Kg0.fN(new com5(this, paramArrayOfshort));
/*    */       return;
/*    */     } 
/*    */     me me1;
/*    */     if ((me1 = this.oo0) != null)
/*    */       Ad0(paramArrayOfshort); 
/*    */   }
/*    */   
/*    */   public final void Rx0(boolean paramBoolean) {
/*    */     this.B5.JL(km.a3.Ct.J.lpt8);
/*    */     for (Hc0 hc0 = this.wN.r30(); hc0.hasNext();) {
/*    */       for (Hc0 hc01 = ((Ah)hc0.next()).W7.r30(); hc01.hasNext(); ) {
/*    */         lpt1 lpt1 = (lpt1)hc01.next();
/*    */         this.dH0.pp0.JL(this.B5).ky0(0.125F);
/*    */         this.dH0.s60.JL(this.B5).r9(0.125F);
/*    */         eo eo = this.dH0.pp0;
/*    */         this.dH0.kX(eo, this.dH0.s60);
/*    */         if (lpt1.Zl0.equalsIgnoreCase("pc01") && lpt1.Of.r10(this.dH0)) {
/*    */           String str;
/*    */           if (paramBoolean) {
/*    */             str = "pc01_start";
/*    */           } else {
/*    */             str = "pc01_end";
/*    */           } 
/*    */           lpt1.co0(str, false, null);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */