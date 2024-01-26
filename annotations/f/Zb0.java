/*  1 */ package f;public final class Zb0 { public byte as; public lpt1 zL0; public eo[] JM; public boolean DT = false; public int fd0 = 0; public static void N4(G5 paramG5) { km.u4.e20
/*  2 */       .W3(new t(paramG5, false, false)); } public int MH0 = 0; public float q50 = 0.0F; public boolean yn0 = false; public Jo OL = null; public Runnable Yq0 = null; public Zb0(wL0 paramwL0, byte paramByte, lpt1 paramlpt1, eo[] paramArrayOfeo) { this.as = paramByte; this.zL0 = paramlpt1; this.JM = paramArrayOfeo; paramlpt1.Yr0 = false; paramlpt1.k = 10000.0F; paramlpt1.ml0(0, false); paramwL0.kc(paramlpt1); paramlpt1.mh.b8(paramArrayOfeo[0]); } public final void mA0(int paramInt, Jo paramJo) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: iload_1
/*    */     //   3: aload_0
/*    */     //   4: aload_2
/*    */     //   5: putfield OL : Lf/Jo;
/*    */     //   8: invokestatic EF0 : (I)Z
/*    */     //   11: putfield yn0 : Z
/*    */     //   14: getfield as : B
/*    */     //   17: iconst_3
/*    */     //   18: if_icmpeq -> 48
/*    */     //   21: iload_1
/*    */     //   22: iconst_3
/*    */     //   23: if_icmpge -> 40
/*    */     //   26: aload_0
/*    */     //   27: dup
/*    */     //   28: getfield JM : [Lf/eo;
/*    */     //   31: arraylength
/*    */     //   32: iconst_1
/*    */     //   33: isub
/*    */     //   34: putfield MH0 : I
/*    */     //   37: goto -> 443
/*    */     //   40: aload_0
/*    */     //   41: iconst_0
/*    */     //   42: putfield MH0 : I
/*    */     //   45: goto -> 443
/*    */     //   48: aload_0
/*    */     //   49: getfield Dp : Lf/wL0;
/*    */     //   52: dup
/*    */     //   53: astore_3
/*    */     //   54: new f/eo
/*    */     //   57: dup
/*    */     //   58: astore #4
/*    */     //   60: ldc 0.875
/*    */     //   62: fconst_0
/*    */     //   63: ldc 2.25
/*    */     //   65: invokespecial <init> : (FFF)V
/*    */     //   68: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   71: pop
/*    */     //   72: new java/util/ArrayList
/*    */     //   75: dup
/*    */     //   76: astore #5
/*    */     //   78: invokespecial <init> : ()V
/*    */     //   81: iconst_m1
/*    */     //   82: istore #6
/*    */     //   84: iconst_m1
/*    */     //   85: istore #7
/*    */     //   87: iconst_0
/*    */     //   88: istore #8
/*    */     //   90: iload #8
/*    */     //   92: getstatic f/wL0.kZ : [[I
/*    */     //   95: arraylength
/*    */     //   96: if_icmpge -> 167
/*    */     //   99: iconst_0
/*    */     //   100: istore #9
/*    */     //   102: iload #9
/*    */     //   104: iconst_3
/*    */     //   105: if_icmpge -> 161
/*    */     //   108: iload #9
/*    */     //   110: iload #7
/*    */     //   112: if_icmpne -> 125
/*    */     //   115: iload #8
/*    */     //   117: iload #6
/*    */     //   119: if_icmpne -> 125
/*    */     //   122: goto -> 155
/*    */     //   125: getstatic f/wL0.kZ : [[I
/*    */     //   128: iload #8
/*    */     //   130: aaload
/*    */     //   131: iload #9
/*    */     //   133: iaload
/*    */     //   134: iload_1
/*    */     //   135: if_icmpne -> 155
/*    */     //   138: iconst_2
/*    */     //   139: newarray int
/*    */     //   141: dup
/*    */     //   142: dup
/*    */     //   143: astore_1
/*    */     //   144: iconst_0
/*    */     //   145: iload #8
/*    */     //   147: iastore
/*    */     //   148: iconst_1
/*    */     //   149: iload #9
/*    */     //   151: iastore
/*    */     //   152: goto -> 171
/*    */     //   155: iinc #9, 1
/*    */     //   158: goto -> 102
/*    */     //   161: iinc #8, 1
/*    */     //   164: goto -> 90
/*    */     //   167: iconst_2
/*    */     //   168: newarray int
/*    */     //   170: astore_1
/*    */     //   171: aload_1
/*    */     //   172: iconst_0
/*    */     //   173: iaload
/*    */     //   174: ifle -> 183
/*    */     //   177: iconst_m1
/*    */     //   178: istore #6
/*    */     //   180: goto -> 186
/*    */     //   183: iconst_1
/*    */     //   184: istore #6
/*    */     //   186: aload_1
/*    */     //   187: dup
/*    */     //   188: aload #5
/*    */     //   190: new f/eo
/*    */     //   193: dup
/*    */     //   194: astore #7
/*    */     //   196: aload #4
/*    */     //   198: dup
/*    */     //   199: dup
/*    */     //   200: aload #7
/*    */     //   202: aload_1
/*    */     //   203: dup
/*    */     //   204: iconst_1
/*    */     //   205: iaload
/*    */     //   206: bipush #6
/*    */     //   208: imul
/*    */     //   209: i2f
/*    */     //   210: ldc 0.25
/*    */     //   212: fmul
/*    */     //   213: fstore #7
/*    */     //   215: iconst_0
/*    */     //   216: iaload
/*    */     //   217: i2f
/*    */     //   218: ldc 0.25
/*    */     //   220: fmul
/*    */     //   221: fstore #8
/*    */     //   223: fload #7
/*    */     //   225: fconst_0
/*    */     //   226: fload #8
/*    */     //   228: invokespecial <init> : (FFF)V
/*    */     //   231: getfield x : F
/*    */     //   234: fstore #7
/*    */     //   236: getfield y : F
/*    */     //   239: fstore #8
/*    */     //   241: getfield z : F
/*    */     //   244: fstore #9
/*    */     //   246: fload #7
/*    */     //   248: fload #8
/*    */     //   250: fload #9
/*    */     //   252: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   255: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   258: pop
/*    */     //   259: iconst_0
/*    */     //   260: iaload
/*    */     //   261: iload #6
/*    */     //   263: iadd
/*    */     //   264: iconst_0
/*    */     //   265: swap
/*    */     //   266: iastore
/*    */     //   267: iconst_m1
/*    */     //   268: istore #7
/*    */     //   270: getstatic f/wL0.kZ : [[I
/*    */     //   273: aload_1
/*    */     //   274: iconst_0
/*    */     //   275: iaload
/*    */     //   276: dup
/*    */     //   277: istore #8
/*    */     //   279: aaload
/*    */     //   280: aload_1
/*    */     //   281: iconst_1
/*    */     //   282: iaload
/*    */     //   283: iaload
/*    */     //   284: dup
/*    */     //   285: istore #9
/*    */     //   287: bipush #20
/*    */     //   289: if_icmpne -> 304
/*    */     //   292: aload_3
/*    */     //   293: getfield jI0 : [Z
/*    */     //   296: iconst_0
/*    */     //   297: baload
/*    */     //   298: ifeq -> 304
/*    */     //   301: goto -> 320
/*    */     //   304: iload #9
/*    */     //   306: bipush #21
/*    */     //   308: if_icmpne -> 323
/*    */     //   311: aload_3
/*    */     //   312: getfield jI0 : [Z
/*    */     //   315: iconst_1
/*    */     //   316: baload
/*    */     //   317: ifeq -> 323
/*    */     //   320: iconst_0
/*    */     //   321: istore #9
/*    */     //   323: iload #9
/*    */     //   325: ifeq -> 785
/*    */     //   328: iload #7
/*    */     //   330: iload #9
/*    */     //   332: if_icmpne -> 338
/*    */     //   335: goto -> 785
/*    */     //   338: iload #9
/*    */     //   340: bipush #6
/*    */     //   342: if_icmplt -> 551
/*    */     //   345: iload #9
/*    */     //   347: bipush #11
/*    */     //   349: if_icmpgt -> 551
/*    */     //   352: aload_0
/*    */     //   353: dup
/*    */     //   354: dup
/*    */     //   355: aload #5
/*    */     //   357: dup
/*    */     //   358: new f/eo
/*    */     //   361: dup
/*    */     //   362: astore_3
/*    */     //   363: aload #4
/*    */     //   365: dup
/*    */     //   366: dup
/*    */     //   367: aload_3
/*    */     //   368: aload_1
/*    */     //   369: dup
/*    */     //   370: iconst_1
/*    */     //   371: iaload
/*    */     //   372: bipush #6
/*    */     //   374: imul
/*    */     //   375: i2f
/*    */     //   376: ldc 0.25
/*    */     //   378: fmul
/*    */     //   379: fstore_1
/*    */     //   380: iconst_0
/*    */     //   381: iaload
/*    */     //   382: i2f
/*    */     //   383: ldc 0.25
/*    */     //   385: fmul
/*    */     //   386: fstore_3
/*    */     //   387: fload_1
/*    */     //   388: fconst_0
/*    */     //   389: fload_3
/*    */     //   390: invokespecial <init> : (FFF)V
/*    */     //   393: getfield x : F
/*    */     //   396: fstore_1
/*    */     //   397: getfield y : F
/*    */     //   400: fstore_3
/*    */     //   401: getfield z : F
/*    */     //   404: fstore #4
/*    */     //   406: fload_1
/*    */     //   407: fload_3
/*    */     //   408: fload #4
/*    */     //   410: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   413: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   416: pop
/*    */     //   417: iconst_0
/*    */     //   418: anewarray f/eo
/*    */     //   421: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   424: checkcast [Lf/eo;
/*    */     //   427: dup
/*    */     //   428: astore_1
/*    */     //   429: putfield JM : [Lf/eo;
/*    */     //   432: iconst_0
/*    */     //   433: putfield fd0 : I
/*    */     //   436: aload_1
/*    */     //   437: arraylength
/*    */     //   438: iconst_1
/*    */     //   439: isub
/*    */     //   440: putfield MH0 : I
/*    */     //   443: aload_0
/*    */     //   444: dup
/*    */     //   445: aload_2
/*    */     //   446: getfield HW : Lf/G5;
/*    */     //   449: invokevirtual Ef0 : ()Lf/G5;
/*    */     //   452: dup
/*    */     //   453: aload_0
/*    */     //   454: getfield yn0 : Z
/*    */     //   457: iconst_1
/*    */     //   458: ixor
/*    */     //   459: putfield g50 : B
/*    */     //   462: <illegal opcode> run : (Lf/G5;)Ljava/lang/Runnable;
/*    */     //   467: putfield Yq0 : Ljava/lang/Runnable;
/*    */     //   470: getfield yn0 : Z
/*    */     //   473: ifeq -> 508
/*    */     //   476: aload_2
/*    */     //   477: getfield pm : Lf/d7;
/*    */     //   480: iconst_3
/*    */     //   481: anewarray f/nl
/*    */     //   484: dup
/*    */     //   485: dup2
/*    */     //   486: getstatic f/nl.fC : Lf/nl;
/*    */     //   489: astore_1
/*    */     //   490: iconst_0
/*    */     //   491: aload_1
/*    */     //   492: aastore
/*    */     //   493: iconst_1
/*    */     //   494: aload_1
/*    */     //   495: aastore
/*    */     //   496: getstatic f/nl.RH : Lf/nl;
/*    */     //   499: iconst_2
/*    */     //   500: swap
/*    */     //   501: aastore
/*    */     //   502: invokevirtual Kk : ([Lf/nl;)V
/*    */     //   505: goto -> 537
/*    */     //   508: aload_2
/*    */     //   509: getfield pm : Lf/d7;
/*    */     //   512: iconst_3
/*    */     //   513: anewarray f/nl
/*    */     //   516: dup
/*    */     //   517: dup2
/*    */     //   518: getstatic f/nl.IL : Lf/nl;
/*    */     //   521: astore_1
/*    */     //   522: iconst_0
/*    */     //   523: aload_1
/*    */     //   524: aastore
/*    */     //   525: iconst_1
/*    */     //   526: aload_1
/*    */     //   527: aastore
/*    */     //   528: getstatic f/nl.RH : Lf/nl;
/*    */     //   531: iconst_2
/*    */     //   532: swap
/*    */     //   533: aastore
/*    */     //   534: invokevirtual Kk : ([Lf/nl;)V
/*    */     //   537: aload_2
/*    */     //   538: getfield pm : Lf/d7;
/*    */     //   541: aload_0
/*    */     //   542: <illegal opcode> run : (Lf/Zb0;)Ljava/lang/Runnable;
/*    */     //   547: invokevirtual nZ : (Ljava/lang/Runnable;)V
/*    */     //   550: return
/*    */     //   551: aload_1
/*    */     //   552: dup
/*    */     //   553: aload #5
/*    */     //   555: new f/eo
/*    */     //   558: dup
/*    */     //   559: astore #7
/*    */     //   561: aload #4
/*    */     //   563: dup
/*    */     //   564: dup
/*    */     //   565: aload #7
/*    */     //   567: aload_1
/*    */     //   568: dup
/*    */     //   569: iconst_1
/*    */     //   570: iaload
/*    */     //   571: bipush #6
/*    */     //   573: imul
/*    */     //   574: i2f
/*    */     //   575: ldc 0.25
/*    */     //   577: fmul
/*    */     //   578: fstore_1
/*    */     //   579: iconst_0
/*    */     //   580: iaload
/*    */     //   581: i2f
/*    */     //   582: ldc 0.25
/*    */     //   584: fmul
/*    */     //   585: fstore #7
/*    */     //   587: fload_1
/*    */     //   588: fconst_0
/*    */     //   589: fload #7
/*    */     //   591: invokespecial <init> : (FFF)V
/*    */     //   594: getfield x : F
/*    */     //   597: fstore_1
/*    */     //   598: getfield y : F
/*    */     //   601: fstore #7
/*    */     //   603: getfield z : F
/*    */     //   606: fstore #8
/*    */     //   608: fload_1
/*    */     //   609: fload #7
/*    */     //   611: fload #8
/*    */     //   613: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   616: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   619: pop
/*    */     //   620: iconst_0
/*    */     //   621: iaload
/*    */     //   622: istore_1
/*    */     //   623: iconst_1
/*    */     //   624: iaload
/*    */     //   625: istore #7
/*    */     //   627: iconst_0
/*    */     //   628: istore #8
/*    */     //   630: iload #8
/*    */     //   632: getstatic f/wL0.kZ : [[I
/*    */     //   635: arraylength
/*    */     //   636: if_icmpge -> 707
/*    */     //   639: iconst_0
/*    */     //   640: istore #10
/*    */     //   642: iload #10
/*    */     //   644: iconst_3
/*    */     //   645: if_icmpge -> 701
/*    */     //   648: iload #10
/*    */     //   650: iload #7
/*    */     //   652: if_icmpne -> 664
/*    */     //   655: iload #8
/*    */     //   657: iload_1
/*    */     //   658: if_icmpne -> 664
/*    */     //   661: goto -> 695
/*    */     //   664: getstatic f/wL0.kZ : [[I
/*    */     //   667: iload #8
/*    */     //   669: aaload
/*    */     //   670: iload #10
/*    */     //   672: iaload
/*    */     //   673: iload #9
/*    */     //   675: if_icmpne -> 695
/*    */     //   678: iconst_2
/*    */     //   679: newarray int
/*    */     //   681: dup
/*    */     //   682: dup
/*    */     //   683: astore_1
/*    */     //   684: iconst_0
/*    */     //   685: iload #8
/*    */     //   687: iastore
/*    */     //   688: iconst_1
/*    */     //   689: iload #10
/*    */     //   691: iastore
/*    */     //   692: goto -> 711
/*    */     //   695: iinc #10, 1
/*    */     //   698: goto -> 642
/*    */     //   701: iinc #8, 1
/*    */     //   704: goto -> 630
/*    */     //   707: iconst_2
/*    */     //   708: newarray int
/*    */     //   710: astore_1
/*    */     //   711: aload #5
/*    */     //   713: new f/eo
/*    */     //   716: dup
/*    */     //   717: astore #7
/*    */     //   719: aload #4
/*    */     //   721: dup
/*    */     //   722: dup
/*    */     //   723: aload #7
/*    */     //   725: aload_1
/*    */     //   726: dup
/*    */     //   727: iconst_1
/*    */     //   728: iaload
/*    */     //   729: bipush #6
/*    */     //   731: imul
/*    */     //   732: i2f
/*    */     //   733: ldc 0.25
/*    */     //   735: fmul
/*    */     //   736: fstore #7
/*    */     //   738: iconst_0
/*    */     //   739: iaload
/*    */     //   740: i2f
/*    */     //   741: ldc 0.25
/*    */     //   743: fmul
/*    */     //   744: fstore #8
/*    */     //   746: fload #7
/*    */     //   748: fconst_0
/*    */     //   749: fload #8
/*    */     //   751: invokespecial <init> : (FFF)V
/*    */     //   754: getfield x : F
/*    */     //   757: fstore #7
/*    */     //   759: getfield y : F
/*    */     //   762: fstore #8
/*    */     //   764: getfield z : F
/*    */     //   767: fstore #10
/*    */     //   769: fload #7
/*    */     //   771: fload #8
/*    */     //   773: fload #10
/*    */     //   775: invokevirtual Tz : (FFF)Lf/eo;
/*    */     //   778: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   781: pop
/*    */     //   782: goto -> 794
/*    */     //   785: aload_1
/*    */     //   786: iload #8
/*    */     //   788: iload #6
/*    */     //   790: iadd
/*    */     //   791: iconst_0
/*    */     //   792: swap
/*    */     //   793: iastore
/*    */     //   794: iload #9
/*    */     //   796: istore #7
/*    */     //   798: goto -> 270
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 68
/*    */     //   #2	-> 72
/*    */     //   #3	-> 92
/*    */     //   #4	-> 173
/*    */     //   #5	-> 231
/*    */     //   #6	-> 255
/*    */     //   #7	-> 393
/*    */     //   #8	-> 413
/*    */     //   #9	-> 429
/*    */     //   #10	-> 446
/*    */     //   #11	-> 449
/*    */     //   #12	-> 459
/*    */     //   #13	-> 462
/*    */     //   #14	-> 477
/*    */     //   #15	-> 481
/*    */     //   #16	-> 509
/*    */     //   #17	-> 513
/*    */     //   #18	-> 538
/*    */     //   #19	-> 542
/*    */     //   #20	-> 555
/*    */     //   #21	-> 594
/*    */     //   #22	-> 616
/*    */     //   #23	-> 632
/*    */     //   #24	-> 713
/*    */     //   #25	-> 754
/*  2 */     //   #26	-> 778 } public final void zS() { this.DT = true; this.zL0.k = 1.0F; this.zL0.rd(0, true, null); if (this.OL == null) return;  eo eo1 = this.JM[this.MH0]; km.pm0.bL((byte)4, (short)1623); eo eo2 = new eo(); float f1 = 0.0F, f2 = (this.yn0 ? 0.0F : -0.25F) + -0.19374076F; this(f1, f2, 0.125F); eo eo3 = new eo(); f2 = 0.0F; float f3 = (this.yn0 ? -0.25F : 0.0F) + -0.19374076F; this(f2, f3, 0.125F); this.OL
/*  3 */       .pm
/*  4 */       .KC(this.zL0, false, eo2);
/*  5 */     this.OL.Ae
/*  6 */       .pm
/*  7 */       .KC(this.zL0, false, eo3);
/*    */     
/*  9 */     short s3 = (short)(int)(eo1.x * 4.0F), s4 = (short)(int)(eo1.z * 4.0F + this.yn0);
/* 10 */     byte b = this.OL.HW.g50;
/* 11 */     this.OL.HW.Zh(false, s3, s4, (byte)0, b);
/*    */ 
/*    */     
/* 14 */     short s1 = (short)(int)(eo1.x * 4.0F), s2 = (short)(int)(eo1.z * 4.0F + (this.yn0 ^ true));
/*    */     
/* 16 */     s4 = jo.HW.g50; Jo jo;
/* 17 */     (jo = this.OL).Ae.HW.Zh(false, s1, s2, (byte)0, s4); km.u4
/* 18 */       .hB0 = new mb(this); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Zb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */