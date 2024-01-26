/*  1 */ package f;public final class Vf extends Qa0 implements r60 { public byte bR; public int i5; public int CJ; public int cs0; public Texture dd; public Texture Jo0; public vF0 No; public vF0 tL; public int DJ0; private void xE() { pA.Dg0
/*  2 */       .jf0(this); km.u4.lx0(this.bR, (byte)2); } public int U9; public Fy0 kE; public H30 Fu0; public H30[] gt0; public float Fy; public pRn NJ0; public float dx; public H30 Cm0; public Vf(byte paramByte, short paramShort) { super(km.XU()); ig ig; ao ao; LD lD; vJ vJ2; pe0 pe0; vJ vJ1; ek0 ek0; vJ vJ3; this.cs0 = 0; this.Fu0 = null; this.gt0 = new H30[16]; this.Fy = 0.0F; this.NJ0 = new pRn(0); this.dx = 0.0F; Xu("base-frame-padded"); Lo(""); EP(1); jJ0(false); TG0(this::mw0); this.bR = paramByte; this.i5 = paramShort; this(km.mI0.yE.Vz().B8("/a/1/7/2")); this(ig.Em0(10)); this(ig.Em0(11)); this.dd = new Texture(zH2); (this.No = new vF0()).l80(); this.No.ZH0().Yo(new Texture[] { this.dd }); J8(this.No); ZH zH2; (zH2 = (new FM(ig.Em0(12))).VC0(vJ2, ek0)).dispose(); this.Jo0 = new Texture(zH1); (this.tL = new vF0()).l80(); this(this.Jo0, 32, 32); (new pe0[2])[0] = pe0; this(this.Jo0, 32, 0, 32, 32); this.tL.ZH0().Pn(new pe0[] { null, pe0 }); ZH zH1; (zH1 = (new FM(ig.Em0(13))).VC0(vJ2, ek0)).dispose(); this(ig.Em0(0)); this(ig.Em0(paramShort + 4)); this(ig.Em0(8)); this(ig.Em0(0)); this(255, 255, 255, 255); (new vJ()).tk0()[2][12] = ao; for (byte b = 0; b < 16; b++) { H30 h30; ZH zH3 = lD.Ld0(ek0, vJ1, b); this(this, b, zH3, zH4); this.gt0[b] = h30; zH3.dispose(); ZH zH4; (zH4 = lD.Ld0(ek0, vJ3, b)).dispose(); }  J8(this.tL); this.kE = new Fy0(); if (!km.XU()) this.kE.wI0(false);  this.kE.tW(() -> { H30 h30; if ((h30 = this.Fu0) == null) h30 = uh(null);  if (h30 != null && !h30.Ml0) H30.BL0(h30, true);  }); this.kE.zY().Pn(new pe0[] { interface.ZZ().Au() }); J8(this.kE); YF0(); } public final void mw0() { pA.Dg0.jf0(this); km.u4.lx0(this.bR, (byte)0); } public final void LM(throws paramthrows) { super.LM(paramthrows); VA0.c90(this); YF0(); int i = this.fr0.RS();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  8 */     i = this.fr0.e3();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     ME(JO.Se0(this.fr0.qF(), this.xY, 2, i), (this.fr0.Hy() - this.HC) / 4 + i); } public final boolean i2(oa0 paramoa0) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual Cz0 : ()Z
/*    */     //   4: ifeq -> 280
/*    */     //   7: aload_1
/*    */     //   8: getfield cz0 : I
/*    */     //   11: iconst_3
/*    */     //   12: if_icmpne -> 30
/*    */     //   15: aload_0
/*    */     //   16: aload_1
/*    */     //   17: dup
/*    */     //   18: getfield aK : I
/*    */     //   21: istore_2
/*    */     //   22: getfield gk0 : I
/*    */     //   25: iload_2
/*    */     //   26: swap
/*    */     //   27: invokevirtual Qe0 : (II)V
/*    */     //   30: aload_1
/*    */     //   31: getfield Ua : Z
/*    */     //   34: ifeq -> 108
/*    */     //   37: aload_0
/*    */     //   38: getfield Cm0 : Lf/H30;
/*    */     //   41: ifnonnull -> 93
/*    */     //   44: aload_0
/*    */     //   45: aconst_null
/*    */     //   46: invokevirtual uh : (Lf/H30;)Lf/H30;
/*    */     //   49: dup
/*    */     //   50: astore_2
/*    */     //   51: aload_0
/*    */     //   52: aload_2
/*    */     //   53: putfield Cm0 : Lf/H30;
/*    */     //   56: ifnull -> 85
/*    */     //   59: aload_2
/*    */     //   60: getfield Ml0 : Z
/*    */     //   63: ifne -> 85
/*    */     //   66: aload_2
/*    */     //   67: dup
/*    */     //   68: getfield i3 : Lf/vF0;
/*    */     //   71: iconst_0
/*    */     //   72: putfield bn : Z
/*    */     //   75: getfield yF : Lf/vF0;
/*    */     //   78: iconst_0
/*    */     //   79: putfield bn : Z
/*    */     //   82: goto -> 108
/*    */     //   85: aload_0
/*    */     //   86: aconst_null
/*    */     //   87: putfield Cm0 : Lf/H30;
/*    */     //   90: goto -> 108
/*    */     //   93: aload_0
/*    */     //   94: aload_1
/*    */     //   95: dup
/*    */     //   96: getfield aK : I
/*    */     //   99: istore_2
/*    */     //   100: getfield gk0 : I
/*    */     //   103: iload_2
/*    */     //   104: swap
/*    */     //   105: invokevirtual Qe0 : (II)V
/*    */     //   108: aload_1
/*    */     //   109: invokevirtual Ud : ()Z
/*    */     //   112: ifeq -> 278
/*    */     //   115: aload_0
/*    */     //   116: getfield Cm0 : Lf/H30;
/*    */     //   119: dup
/*    */     //   120: astore_1
/*    */     //   121: ifnull -> 273
/*    */     //   124: aload_0
/*    */     //   125: aload_1
/*    */     //   126: invokevirtual uh : (Lf/H30;)Lf/H30;
/*    */     //   129: ifnonnull -> 233
/*    */     //   132: aload_0
/*    */     //   133: getfield DJ0 : I
/*    */     //   136: dup
/*    */     //   137: istore_1
/*    */     //   138: aload_0
/*    */     //   139: getfield U9 : I
/*    */     //   142: istore_2
/*    */     //   143: iconst_1
/*    */     //   144: if_icmplt -> 207
/*    */     //   147: iload_1
/*    */     //   148: bipush #6
/*    */     //   150: if_icmple -> 156
/*    */     //   153: goto -> 207
/*    */     //   156: iload_1
/*    */     //   157: iconst_1
/*    */     //   158: if_icmpne -> 165
/*    */     //   161: iload_2
/*    */     //   162: ifeq -> 207
/*    */     //   165: iload_1
/*    */     //   166: bipush #6
/*    */     //   168: if_icmpne -> 178
/*    */     //   171: iload_2
/*    */     //   172: ifne -> 178
/*    */     //   175: goto -> 207
/*    */     //   178: iload_1
/*    */     //   179: iconst_1
/*    */     //   180: if_icmpne -> 188
/*    */     //   183: iload_2
/*    */     //   184: iconst_5
/*    */     //   185: if_icmpeq -> 207
/*    */     //   188: iload_1
/*    */     //   189: bipush #6
/*    */     //   191: if_icmpne -> 202
/*    */     //   194: iload_2
/*    */     //   195: iconst_5
/*    */     //   196: if_icmpne -> 202
/*    */     //   199: goto -> 207
/*    */     //   202: iconst_1
/*    */     //   203: istore_3
/*    */     //   204: goto -> 209
/*    */     //   207: iconst_0
/*    */     //   208: istore_3
/*    */     //   209: iload_3
/*    */     //   210: ifeq -> 233
/*    */     //   213: aload_0
/*    */     //   214: getfield Cm0 : Lf/H30;
/*    */     //   217: dup
/*    */     //   218: dup
/*    */     //   219: iload_1
/*    */     //   220: putfield d60 : I
/*    */     //   223: iload_2
/*    */     //   224: putfield u2 : I
/*    */     //   227: invokevirtual update : ()V
/*    */     //   230: goto -> 254
/*    */     //   233: aload_0
/*    */     //   234: dup
/*    */     //   235: dup
/*    */     //   236: getfield Cm0 : Lf/H30;
/*    */     //   239: dup
/*    */     //   240: astore_1
/*    */     //   241: getfield d60 : I
/*    */     //   244: putfield DJ0 : I
/*    */     //   247: aload_1
/*    */     //   248: getfield u2 : I
/*    */     //   251: putfield U9 : I
/*    */     //   254: aload_0
/*    */     //   255: getfield Cm0 : Lf/H30;
/*    */     //   258: dup
/*    */     //   259: getfield i3 : Lf/vF0;
/*    */     //   262: iconst_1
/*    */     //   263: putfield bn : Z
/*    */     //   266: getfield yF : Lf/vF0;
/*    */     //   269: iconst_1
/*    */     //   270: putfield bn : Z
/*    */     //   273: aload_0
/*    */     //   274: aconst_null
/*    */     //   275: putfield Cm0 : Lf/H30;
/*    */     //   278: iconst_1
/*    */     //   279: ireturn
/*    */     //   280: aload_1
/*    */     //   281: getfield cz0 : I
/*    */     //   284: invokestatic Wm0 : (I)Z
/*    */     //   287: ifeq -> 784
/*    */     //   290: aload_1
/*    */     //   291: invokevirtual oO : ()Z
/*    */     //   294: ifeq -> 784
/*    */     //   297: aload_0
/*    */     //   298: getfield cs0 : I
/*    */     //   301: ifne -> 784
/*    */     //   304: aload_1
/*    */     //   305: getfield GG0 : I
/*    */     //   308: dup
/*    */     //   309: istore_1
/*    */     //   310: getstatic f/BM.lc : Lf/BM;
/*    */     //   313: invokestatic J20 : (ILf/BM;)Z
/*    */     //   316: ifeq -> 464
/*    */     //   319: aload_0
/*    */     //   320: getfield Fu0 : Lf/H30;
/*    */     //   323: dup
/*    */     //   324: astore_1
/*    */     //   325: ifnonnull -> 355
/*    */     //   328: getstatic f/js.vu0 : Lf/js;
/*    */     //   331: new f/h70
/*    */     //   334: dup
/*    */     //   335: aload_0
/*    */     //   336: <illegal opcode> run : (Lf/Vf;)Ljava/lang/Runnable;
/*    */     //   341: ldc_w 'Do you want to close the puzzle?'
/*    */     //   344: swap
/*    */     //   345: aload_0
/*    */     //   346: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Lf/JG0;)V
/*    */     //   349: invokevirtual uh : (Lf/h70;)V
/*    */     //   352: goto -> 462
/*    */     //   355: aload_0
/*    */     //   356: aload_1
/*    */     //   357: invokevirtual uh : (Lf/H30;)Lf/H30;
/*    */     //   360: ifnonnull -> 457
/*    */     //   363: aload_0
/*    */     //   364: getfield DJ0 : I
/*    */     //   367: dup
/*    */     //   368: istore_1
/*    */     //   369: aload_0
/*    */     //   370: getfield U9 : I
/*    */     //   373: istore_2
/*    */     //   374: iconst_1
/*    */     //   375: if_icmplt -> 438
/*    */     //   378: iload_1
/*    */     //   379: bipush #6
/*    */     //   381: if_icmple -> 387
/*    */     //   384: goto -> 438
/*    */     //   387: iload_1
/*    */     //   388: iconst_1
/*    */     //   389: if_icmpne -> 396
/*    */     //   392: iload_2
/*    */     //   393: ifeq -> 438
/*    */     //   396: iload_1
/*    */     //   397: bipush #6
/*    */     //   399: if_icmpne -> 409
/*    */     //   402: iload_2
/*    */     //   403: ifne -> 409
/*    */     //   406: goto -> 438
/*    */     //   409: iload_1
/*    */     //   410: iconst_1
/*    */     //   411: if_icmpne -> 419
/*    */     //   414: iload_2
/*    */     //   415: iconst_5
/*    */     //   416: if_icmpeq -> 438
/*    */     //   419: iload_1
/*    */     //   420: bipush #6
/*    */     //   422: if_icmpne -> 433
/*    */     //   425: iload_2
/*    */     //   426: iconst_5
/*    */     //   427: if_icmpne -> 433
/*    */     //   430: goto -> 438
/*    */     //   433: iconst_1
/*    */     //   434: istore_3
/*    */     //   435: goto -> 440
/*    */     //   438: iconst_0
/*    */     //   439: istore_3
/*    */     //   440: iload_3
/*    */     //   441: ifeq -> 457
/*    */     //   444: aload_0
/*    */     //   445: getfield Fu0 : Lf/H30;
/*    */     //   448: dup
/*    */     //   449: iload_1
/*    */     //   450: putfield d60 : I
/*    */     //   453: iload_2
/*    */     //   454: putfield u2 : I
/*    */     //   457: aload_0
/*    */     //   458: aconst_null
/*    */     //   459: putfield Fu0 : Lf/H30;
/*    */     //   462: iconst_1
/*    */     //   463: ireturn
/*    */     //   464: iload_1
/*    */     //   465: getstatic f/BM.fN : Lf/BM;
/*    */     //   468: invokestatic J20 : (ILf/BM;)Z
/*    */     //   471: ifne -> 484
/*    */     //   474: iload_1
/*    */     //   475: getstatic f/BM.PW : Lf/BM;
/*    */     //   478: invokestatic J20 : (ILf/BM;)Z
/*    */     //   481: ifeq -> 516
/*    */     //   484: aload_0
/*    */     //   485: getfield Fu0 : Lf/H30;
/*    */     //   488: dup
/*    */     //   489: astore_2
/*    */     //   490: ifnonnull -> 505
/*    */     //   493: aload_0
/*    */     //   494: aconst_null
/*    */     //   495: invokevirtual uh : (Lf/H30;)Lf/H30;
/*    */     //   498: dup
/*    */     //   499: astore_2
/*    */     //   500: ifnonnull -> 505
/*    */     //   503: iconst_1
/*    */     //   504: ireturn
/*    */     //   505: aload_2
/*    */     //   506: iload_1
/*    */     //   507: getstatic f/BM.PW : Lf/BM;
/*    */     //   510: invokestatic J20 : (ILf/BM;)Z
/*    */     //   513: invokestatic BL0 : (Lf/H30;Z)V
/*    */     //   516: iload_1
/*    */     //   517: getstatic f/BM.bC : Lf/BM;
/*    */     //   520: invokestatic J20 : (ILf/BM;)Z
/*    */     //   523: ifeq -> 669
/*    */     //   526: aload_0
/*    */     //   527: getfield Fu0 : Lf/H30;
/*    */     //   530: dup
/*    */     //   531: astore_1
/*    */     //   532: ifnonnull -> 662
/*    */     //   535: aload_0
/*    */     //   536: aconst_null
/*    */     //   537: invokevirtual uh : (Lf/H30;)Lf/H30;
/*    */     //   540: dup
/*    */     //   541: astore_1
/*    */     //   542: ifnull -> 667
/*    */     //   545: aload_1
/*    */     //   546: getfield Ml0 : Z
/*    */     //   549: ifne -> 667
/*    */     //   552: aload_0
/*    */     //   553: aload_1
/*    */     //   554: aload_0
/*    */     //   555: aload_1
/*    */     //   556: putfield Fu0 : Lf/H30;
/*    */     //   559: getfield i3 : Lf/vF0;
/*    */     //   562: invokevirtual ID : (Lf/JG0;)I
/*    */     //   565: dup
/*    */     //   566: istore_2
/*    */     //   567: ifge -> 573
/*    */     //   570: goto -> 591
/*    */     //   573: iload_2
/*    */     //   574: aload_0
/*    */     //   575: invokevirtual Ub : ()I
/*    */     //   578: iconst_1
/*    */     //   579: isub
/*    */     //   580: dup
/*    */     //   581: istore_3
/*    */     //   582: if_icmpge -> 591
/*    */     //   585: aload_0
/*    */     //   586: iload_2
/*    */     //   587: iload_3
/*    */     //   588: invokevirtual Tb0 : (II)V
/*    */     //   591: aload_0
/*    */     //   592: aload_1
/*    */     //   593: getfield yF : Lf/vF0;
/*    */     //   596: invokevirtual ID : (Lf/JG0;)I
/*    */     //   599: dup
/*    */     //   600: istore_1
/*    */     //   601: ifge -> 607
/*    */     //   604: goto -> 625
/*    */     //   607: iload_1
/*    */     //   608: aload_0
/*    */     //   609: invokevirtual Ub : ()I
/*    */     //   612: iconst_1
/*    */     //   613: isub
/*    */     //   614: dup
/*    */     //   615: istore_2
/*    */     //   616: if_icmpge -> 625
/*    */     //   619: aload_0
/*    */     //   620: iload_1
/*    */     //   621: iload_2
/*    */     //   622: invokevirtual Tb0 : (II)V
/*    */     //   625: aload_0
/*    */     //   626: dup
/*    */     //   627: getfield tL : Lf/vF0;
/*    */     //   630: invokevirtual ID : (Lf/JG0;)I
/*    */     //   633: dup
/*    */     //   634: istore_1
/*    */     //   635: ifge -> 641
/*    */     //   638: goto -> 667
/*    */     //   641: iload_1
/*    */     //   642: aload_0
/*    */     //   643: invokevirtual Ub : ()I
/*    */     //   646: iconst_1
/*    */     //   647: isub
/*    */     //   648: dup
/*    */     //   649: istore_2
/*    */     //   650: if_icmpge -> 667
/*    */     //   653: aload_0
/*    */     //   654: iload_1
/*    */     //   655: iload_2
/*    */     //   656: invokevirtual Tb0 : (II)V
/*    */     //   659: goto -> 667
/*    */     //   662: aload_1
/*    */     //   663: iconst_1
/*    */     //   664: invokestatic BL0 : (Lf/H30;Z)V
/*    */     //   667: iconst_1
/*    */     //   668: ireturn
/*    */     //   669: iload_1
/*    */     //   670: getstatic f/BM.ni : Lf/BM;
/*    */     //   673: invokestatic J20 : (ILf/BM;)Z
/*    */     //   676: ifeq -> 697
/*    */     //   679: aload_0
/*    */     //   680: getfield U9 : I
/*    */     //   683: dup
/*    */     //   684: istore_1
/*    */     //   685: ifle -> 695
/*    */     //   688: aload_0
/*    */     //   689: iload_1
/*    */     //   690: iconst_1
/*    */     //   691: isub
/*    */     //   692: putfield U9 : I
/*    */     //   695: iconst_1
/*    */     //   696: ireturn
/*    */     //   697: iload_1
/*    */     //   698: getstatic f/BM.N70 : Lf/BM;
/*    */     //   701: invokestatic J20 : (ILf/BM;)Z
/*    */     //   704: ifeq -> 726
/*    */     //   707: aload_0
/*    */     //   708: getfield U9 : I
/*    */     //   711: dup
/*    */     //   712: istore_1
/*    */     //   713: iconst_5
/*    */     //   714: if_icmpge -> 724
/*    */     //   717: aload_0
/*    */     //   718: iload_1
/*    */     //   719: iconst_1
/*    */     //   720: iadd
/*    */     //   721: putfield U9 : I
/*    */     //   724: iconst_1
/*    */     //   725: ireturn
/*    */     //   726: iload_1
/*    */     //   727: getstatic f/BM.Oq : Lf/BM;
/*    */     //   730: invokestatic J20 : (ILf/BM;)Z
/*    */     //   733: ifeq -> 754
/*    */     //   736: aload_0
/*    */     //   737: getfield DJ0 : I
/*    */     //   740: dup
/*    */     //   741: istore_1
/*    */     //   742: ifle -> 752
/*    */     //   745: aload_0
/*    */     //   746: iload_1
/*    */     //   747: iconst_1
/*    */     //   748: isub
/*    */     //   749: putfield DJ0 : I
/*    */     //   752: iconst_1
/*    */     //   753: ireturn
/*    */     //   754: iload_1
/*    */     //   755: getstatic f/BM.M8 : Lf/BM;
/*    */     //   758: invokestatic J20 : (ILf/BM;)Z
/*    */     //   761: ifeq -> 784
/*    */     //   764: aload_0
/*    */     //   765: getfield DJ0 : I
/*    */     //   768: dup
/*    */     //   769: istore_1
/*    */     //   770: bipush #7
/*    */     //   772: if_icmpge -> 782
/*    */     //   775: aload_0
/*    */     //   776: iload_1
/*    */     //   777: iconst_1
/*    */     //   778: iadd
/*    */     //   779: putfield DJ0 : I
/*    */     //   782: iconst_1
/*    */     //   783: ireturn
/*    */     //   784: iconst_1
/*    */     //   785: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 18
/*    */     //   #3	-> 22
/*    */     //   #4	-> 27
/*    */     //   #5	-> 31
/*    */     //   #6	-> 38
/*    */     //   #7	-> 72
/*    */     //   #8	-> 75
/*    */     //   #9	-> 79
/*    */     //   #10	-> 87
/*    */     //   #11	-> 96
/*    */     //   #12	-> 100
/*    */     //   #13	-> 105
/*    */     //   #14	-> 263
/*    */     //   #15	-> 266
/*    */     //   #16	-> 270
/*    */     //   #17	-> 275
/*    */     //   #18	-> 281
/*    */     //   #19	-> 291
/*    */     //   #20	-> 305
/*    */     //   #21	-> 310
/*    */     //   #22	-> 328
/*    */     //   #23	-> 331
/*    */     //   #24	-> 562
/*    */     //   #25	-> 593
/*    */     //   #26	-> 596
/*    */     //   #27	-> 627
/*    */     //   #28	-> 630
/* 13 */     //   #29	-> 664 } public final void Ve(throws paramthrows, int paramInt1, int paramInt2, int paramInt3) { H30 h30; if ((h30 = this.Cm0) != null) { h30.i3.TS.sG0(paramInt1, paramInt2); this.Cm0.yF.TS.sG0(paramInt1, paramInt2); }  } public final void V90(throws paramthrows) { float f; byte b; super.V90(paramthrows); if (!p3()) VA0.c90(this);  boolean bool; H30[] arrayOfH30; int k; byte b1; for (bool = true, k = (arrayOfH30 = this.gt0).length, b1 = 0; b1 < k; ) { H30 h30; (h30 = arrayOfH30[b1]).update(); if ((arrayOfH30[b1]).d60 != h30.CH || h30.u2 != h30.GE || h30.kV != 0.0F) bool = false;  b1++; }  switch (this.cs0) { case 4: UB0.Kg0.fN(this::xE); break;case 3: this.dx = f = this.dx + UB0.M60.Qy; if (f > 0.25D) this.cs0 = 4;  break;case 2: if ((this.Fy = this.Fy - UB0.M60.Qy) < 0.0F) { this.Fy = 0.0F; this.cs0 = 3; }  b = (byte)(int)(this.Fy * 255.0F); this.NJ0.dN((byte)-1, (byte)-1, (byte)-1, b); break;case 1: if ((this.Fy = this.Fy + UB0.M60.Qy) > 1.0F) { this.Fy = 1.0F; this.cs0 = 2; }  b = (byte)(int)(this.Fy * 255.0F); this.NJ0.dN((byte)-1, (byte)-1, (byte)-1, b); break;case 0: if (b != 0) { this.cs0 = 1; jf0(this.tL); }  break; }  int i = nH0(), j = RS(); j = this.DJ0 * 32 * this.CJ + j + i; k = e3(); this.tL.ME(j, this.U9 * 32 * this.CJ + k); this.tL.TS.V1 = this.CJ; j = RS() + i; this.No.ME(j, e3());
/*    */     
/* 15 */     this.No.TS
/*    */       
/* 17 */       .V1 = this.CJ;
/* 18 */     j = RS(); this.kE
/* 19 */       .ME(this.CJ * 256 + j + 10 + i, e3() + 10);
/* 20 */     this.kE.RI(this.CJ * 32, this.CJ * 32); this.kE.Tm(this.CJ * 32, this.CJ * 32);
/* 21 */     this.kE.As
/* 22 */       .xB0 = 1;
/*    */     
/* 24 */     this.kE.As.V1 = (float)(this.CJ * 0.75D); }
/*    */ 
/*    */   
/*    */   public final void YF0() {
/*    */     int i = km.wI0.dG();
/*    */     int j = km.wI0.k1();
/*    */     if (!km.XU()) {
/*    */       i = (int)(i * 0.75D);
/*    */       j = (int)(j * 0.75D);
/*    */     } 
/*    */     if ((this.CJ = Math.min(i / 256, j / 192)) < 1)
/*    */       this.CJ = 1; 
/*    */     if (!km.XU()) {
/*    */       int k = this.CJ * 256 + 3;
/*    */       uh0(k, this.CJ * 192 + 2);
/*    */       k = this.CJ * 256 + 3;
/*    */       Tm(k, this.CJ * 192 + 2);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     YF0();
/*    */     if (km.XU() && this.Bo0 != null)
/*    */       QI(); 
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */     this.dd.dispose();
/*    */     this.Jo0.dispose();
/*    */     H30[] arrayOfH30;
/*    */     int i = (arrayOfH30 = this.gt0).length;
/*    */     for (byte b = 0; b < i; b++)
/*    */       this[b].dispose(); 
/*    */   }
/*    */   
/*    */   public final int nH0() {
/*    */     if (km.XU())
/*    */       return km.wI0.dG() / 2 - this.No.TS.e00() / 2; 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public final void Qe0(int paramInt1, int paramInt2) {
/*    */     if (paramInt1 - RS() - nH0() < 0)
/*    */       return; 
/*    */     if (paramInt2 - e3() < 0)
/*    */       return; 
/*    */     paramInt2 = (paramInt2 - e3()) / this.CJ / 32;
/*    */     if ((paramInt1 = (paramInt1 - RS() - nH0()) / this.CJ / 32) <= 7 && paramInt2 <= 5) {
/*    */       this.DJ0 = paramInt1;
/*    */       this.U9 = paramInt2;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final H30 uh(H30 paramH30) {
/*    */     H30[] arrayOfH30;
/*    */     int i = (arrayOfH30 = this.gt0).length;
/*    */     for (byte b = 0; b < i; b++) {
/*    */       H30 h30;
/*    */       if ((h30 = arrayOfH30[b]) != paramH30 && h30.d60 == this.DJ0 && h30.u2 == this.U9)
/*    */         return h30; 
/*    */     } 
/*    */     return null;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */