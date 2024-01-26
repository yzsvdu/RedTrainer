/* 1 */ package f;public final class mT extends static { public Jo ia; public uT KD0; public uT[][] N4 = new uT[6][Vp0.Jo.length + 1]; public final boolean II0(Ih0 paramIh0, K70 paramK70, fo0 paramfo0, int paramInt, boolean paramBoolean) { Jo jo; uT uT1; uT[][] arrayOfUT; boolean bool; if (!(bool = nc0()) && this.Su0 == null) lpt6(paramIh0, paramK70, paramfo0, false, false);  Matrix4 matrix4;
/* 2 */     if ((matrix4 = this.Su0) != null) { jo = this.ia; uT1 = this.KD0; arrayOfUT = this.N4; byte b = (byte)paramInt; this.KD0 = km.q00.Y0(paramK70, paramfo0, this, uT1, arrayOfUT, b, matrix4, paramBoolean, bool); } else { jo = ((mT)super).ia; uT uT2 = ((mT)super).KD0, arrayOfUT1[][] = ((mT)super).N4; byte b = (byte)arrayOfUT; eo eo1 = ((static)this).ao, eo2 = ((static)this).Yk0, eo3 = ((static)this).K70.nj0; ((mT)super).KD0 = km.q00.qi0((K70)uT1, paramfo0, this, uT2, arrayOfUT1, b, eo1, eo2, eo3, paramBoolean, bool); }  return true; } public boolean uc0 = false; public long Mo0 = 0L; public mT(Jo paramJo) { super(paramJo); this.ia = paramJo; } public final boolean t0(tH paramtH, int paramInt, boolean paramBoolean) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual nc0 : ()Z
/*   */     //   4: dup
/*   */     //   5: istore #4
/*   */     //   7: ifne -> 18
/*   */     //   10: aload_0
/*   */     //   11: sipush #255
/*   */     //   14: aload_1
/*   */     //   15: invokevirtual xS : (ILf/tH;)V
/*   */     //   18: aload_0
/*   */     //   19: getfield ao : Lf/eo;
/*   */     //   22: dup
/*   */     //   23: getfield x : F
/*   */     //   26: f2i
/*   */     //   27: istore #5
/*   */     //   29: getfield y : F
/*   */     //   32: f2i
/*   */     //   33: getstatic f/km.q00 : Lf/Hk;
/*   */     //   36: dup
/*   */     //   37: astore #6
/*   */     //   39: iload_2
/*   */     //   40: aload_0
/*   */     //   41: getfield ia : Lf/Jo;
/*   */     //   44: astore_0
/*   */     //   45: i2b
/*   */     //   46: istore_2
/*   */     //   47: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   50: pop
/*   */     //   51: aload_0
/*   */     //   52: swap
/*   */     //   53: iload #5
/*   */     //   55: i2f
/*   */     //   56: ldc 13.5
/*   */     //   58: fsub
/*   */     //   59: fstore #5
/*   */     //   61: i2f
/*   */     //   62: ldc 18.0
/*   */     //   64: fsub
/*   */     //   65: fstore #7
/*   */     //   67: getfield pm : Lf/d7;
/*   */     //   70: getfield Mv : Lf/nl;
/*   */     //   73: dup
/*   */     //   74: astore #8
/*   */     //   76: getstatic f/nl.Qt : Lf/nl;
/*   */     //   79: if_acmpeq -> 135
/*   */     //   82: aload #8
/*   */     //   84: getstatic f/nl.rm : Lf/nl;
/*   */     //   87: if_acmpne -> 93
/*   */     //   90: goto -> 135
/*   */     //   93: aload_0
/*   */     //   94: invokevirtual UG : ()Z
/*   */     //   97: ifne -> 126
/*   */     //   100: aload_0
/*   */     //   101: invokevirtual VO : ()Z
/*   */     //   104: ifeq -> 110
/*   */     //   107: goto -> 126
/*   */     //   110: aload_0
/*   */     //   111: invokevirtual XC : ()Z
/*   */     //   114: ifeq -> 191
/*   */     //   117: iload_2
/*   */     //   118: bipush #18
/*   */     //   120: iadd
/*   */     //   121: i2b
/*   */     //   122: istore_2
/*   */     //   123: goto -> 191
/*   */     //   126: iload_2
/*   */     //   127: bipush #27
/*   */     //   129: iadd
/*   */     //   130: i2b
/*   */     //   131: istore_2
/*   */     //   132: goto -> 191
/*   */     //   135: aload_0
/*   */     //   136: getfield HW : Lf/G5;
/*   */     //   139: getfield g50 : B
/*   */     //   142: dup
/*   */     //   143: istore #8
/*   */     //   145: iconst_3
/*   */     //   146: if_icmpne -> 158
/*   */     //   149: fload #5
/*   */     //   151: fconst_2
/*   */     //   152: fadd
/*   */     //   153: fstore #5
/*   */     //   155: goto -> 170
/*   */     //   158: iload #8
/*   */     //   160: iconst_2
/*   */     //   161: if_icmpne -> 170
/*   */     //   164: fload #5
/*   */     //   166: fconst_2
/*   */     //   167: fsub
/*   */     //   168: fstore #5
/*   */     //   170: aload_0
/*   */     //   171: invokevirtual UG : ()Z
/*   */     //   174: ifne -> 191
/*   */     //   177: aload_0
/*   */     //   178: invokevirtual XC : ()Z
/*   */     //   181: ifeq -> 191
/*   */     //   184: fload #5
/*   */     //   186: ldc 8.0
/*   */     //   188: fadd
/*   */     //   189: fstore #5
/*   */     //   191: aload_0
/*   */     //   192: dup
/*   */     //   193: dup
/*   */     //   194: getfield lB0 : Lf/OE0;
/*   */     //   197: getstatic f/Vp0.CR : Lf/Vp0;
/*   */     //   200: dup
/*   */     //   201: astore #8
/*   */     //   203: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   206: istore #9
/*   */     //   208: getfield lB0 : Lf/OE0;
/*   */     //   211: getstatic f/Vp0.c6 : Lf/Vp0;
/*   */     //   214: dup
/*   */     //   215: astore #10
/*   */     //   217: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   220: istore #11
/*   */     //   222: getfield HW : Lf/G5;
/*   */     //   225: getfield g50 : B
/*   */     //   228: iconst_1
/*   */     //   229: if_icmpne -> 248
/*   */     //   232: aload #8
/*   */     //   234: iload #9
/*   */     //   236: invokevirtual O5 : (S)Z
/*   */     //   239: ifeq -> 248
/*   */     //   242: iconst_1
/*   */     //   243: istore #12
/*   */     //   245: goto -> 251
/*   */     //   248: iconst_0
/*   */     //   249: istore #12
/*   */     //   251: aload_0
/*   */     //   252: getfield HW : Lf/G5;
/*   */     //   255: getfield g50 : B
/*   */     //   258: iconst_1
/*   */     //   259: if_icmpne -> 278
/*   */     //   262: aload #10
/*   */     //   264: iload #11
/*   */     //   266: invokevirtual O5 : (S)Z
/*   */     //   269: ifeq -> 278
/*   */     //   272: iconst_1
/*   */     //   273: istore #13
/*   */     //   275: goto -> 281
/*   */     //   278: iconst_0
/*   */     //   279: istore #13
/*   */     //   281: aload_0
/*   */     //   282: iconst_0
/*   */     //   283: istore #14
/*   */     //   285: invokevirtual XC : ()Z
/*   */     //   288: ifeq -> 310
/*   */     //   291: aload_0
/*   */     //   292: invokevirtual UG : ()Z
/*   */     //   295: ifne -> 310
/*   */     //   298: aload_0
/*   */     //   299: invokevirtual VO : ()Z
/*   */     //   302: ifne -> 310
/*   */     //   305: getstatic f/Hk.C00 : S
/*   */     //   308: istore #14
/*   */     //   310: iload #11
/*   */     //   312: getstatic f/FN.tv : Lf/FN;
/*   */     //   315: dup
/*   */     //   316: astore #15
/*   */     //   318: iload #14
/*   */     //   320: invokevirtual zE0 : (S)[[F
/*   */     //   323: astore #16
/*   */     //   325: iconst_0
/*   */     //   326: istore #17
/*   */     //   328: iconst_0
/*   */     //   329: istore #18
/*   */     //   331: iconst_2
/*   */     //   332: if_icmpeq -> 355
/*   */     //   335: iload #11
/*   */     //   337: bipush #12
/*   */     //   339: if_icmpeq -> 355
/*   */     //   342: iload #11
/*   */     //   344: bipush #17
/*   */     //   346: if_icmpeq -> 355
/*   */     //   349: iconst_0
/*   */     //   350: istore #19
/*   */     //   352: goto -> 358
/*   */     //   355: iconst_1
/*   */     //   356: istore #19
/*   */     //   358: iload #19
/*   */     //   360: ifne -> 368
/*   */     //   363: iload #14
/*   */     //   365: ifle -> 591
/*   */     //   368: aload_0
/*   */     //   369: invokevirtual XC : ()Z
/*   */     //   372: ifeq -> 591
/*   */     //   375: aload_0
/*   */     //   376: invokevirtual UG : ()Z
/*   */     //   379: ifne -> 591
/*   */     //   382: aload_0
/*   */     //   383: invokevirtual VO : ()Z
/*   */     //   386: ifne -> 591
/*   */     //   389: iload_2
/*   */     //   390: tableswitch default -> 432, 18 -> 463, 19 -> 450, 20 -> 432, 21 -> 463, 22 -> 463, 23 -> 450, 24 -> 450
/*   */     //   432: iload_3
/*   */     //   433: bipush #20
/*   */     //   435: istore #19
/*   */     //   437: ifeq -> 476
/*   */     //   440: iconst_3
/*   */     //   441: istore #17
/*   */     //   443: bipush #6
/*   */     //   445: istore #18
/*   */     //   447: goto -> 482
/*   */     //   450: iconst_1
/*   */     //   451: istore #17
/*   */     //   453: iconst_0
/*   */     //   454: istore #18
/*   */     //   456: bipush #19
/*   */     //   458: istore #19
/*   */     //   460: goto -> 482
/*   */     //   463: iconst_0
/*   */     //   464: istore #17
/*   */     //   466: iconst_2
/*   */     //   467: istore #18
/*   */     //   469: bipush #18
/*   */     //   471: istore #19
/*   */     //   473: goto -> 482
/*   */     //   476: iconst_2
/*   */     //   477: istore #17
/*   */     //   479: iconst_4
/*   */     //   480: istore #18
/*   */     //   482: iload #11
/*   */     //   484: invokestatic o7 : (S)Z
/*   */     //   487: ifeq -> 514
/*   */     //   490: iload #4
/*   */     //   492: ifne -> 514
/*   */     //   495: aload #6
/*   */     //   497: aload_1
/*   */     //   498: aload_0
/*   */     //   499: aload #10
/*   */     //   501: iload #11
/*   */     //   503: iload #19
/*   */     //   505: fload #5
/*   */     //   507: fload #7
/*   */     //   509: iload_3
/*   */     //   510: iconst_0
/*   */     //   511: invokevirtual vo : (Lf/tH;Lf/Jo;Lf/Vp0;SBFFZZ)V
/*   */     //   514: aload #15
/*   */     //   516: iload #14
/*   */     //   518: getstatic f/zm0.u20 : J
/*   */     //   521: ldc2_w 444
/*   */     //   524: lrem
/*   */     //   525: l2i
/*   */     //   526: sipush #222
/*   */     //   529: idiv
/*   */     //   530: iload #18
/*   */     //   532: iadd
/*   */     //   533: dup
/*   */     //   534: istore #18
/*   */     //   536: iconst_0
/*   */     //   537: invokevirtual zd0 : (SII)Lf/U70;
/*   */     //   540: dup
/*   */     //   541: astore #10
/*   */     //   543: ifnull -> 594
/*   */     //   546: aload_1
/*   */     //   547: fload #7
/*   */     //   549: aload #16
/*   */     //   551: iload #17
/*   */     //   553: aload #10
/*   */     //   555: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   558: astore #10
/*   */     //   560: aaload
/*   */     //   561: dup
/*   */     //   562: fload #5
/*   */     //   564: swap
/*   */     //   565: iconst_0
/*   */     //   566: faload
/*   */     //   567: fadd
/*   */     //   568: fstore #15
/*   */     //   570: iconst_1
/*   */     //   571: faload
/*   */     //   572: fadd
/*   */     //   573: fstore #20
/*   */     //   575: aload #10
/*   */     //   577: fload #15
/*   */     //   579: fload #20
/*   */     //   581: ldc 24.0
/*   */     //   583: ldc 24.0
/*   */     //   585: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*   */     //   588: goto -> 594
/*   */     //   591: iload_2
/*   */     //   592: istore #19
/*   */     //   594: iload #9
/*   */     //   596: bipush #68
/*   */     //   598: if_icmpeq -> 608
/*   */     //   601: iload #9
/*   */     //   603: bipush #73
/*   */     //   605: if_icmpne -> 627
/*   */     //   608: aload #6
/*   */     //   610: aload_1
/*   */     //   611: aload_0
/*   */     //   612: aload #8
/*   */     //   614: iload #9
/*   */     //   616: iload #19
/*   */     //   618: fload #5
/*   */     //   620: fload #7
/*   */     //   622: iload_3
/*   */     //   623: iconst_0
/*   */     //   624: invokevirtual un : (Lf/tH;Lf/Jo;Lf/Vp0;SBFFZZ)V
/*   */     //   627: iload #4
/*   */     //   629: ifeq -> 638
/*   */     //   632: iconst_1
/*   */     //   633: istore #8
/*   */     //   635: goto -> 641
/*   */     //   638: iconst_2
/*   */     //   639: istore #8
/*   */     //   641: iconst_0
/*   */     //   642: istore #10
/*   */     //   644: iload #10
/*   */     //   646: iload #8
/*   */     //   648: if_icmpge -> 1744
/*   */     //   651: iload #10
/*   */     //   653: ifne -> 662
/*   */     //   656: iconst_1
/*   */     //   657: istore #15
/*   */     //   659: goto -> 665
/*   */     //   662: iconst_0
/*   */     //   663: istore #15
/*   */     //   665: iload #10
/*   */     //   667: iconst_1
/*   */     //   668: if_icmpeq -> 677
/*   */     //   671: iload #8
/*   */     //   673: iconst_1
/*   */     //   674: if_icmpne -> 922
/*   */     //   677: iload #4
/*   */     //   679: getstatic f/lPT9.U4 : Lf/lPT9;
/*   */     //   682: astore #20
/*   */     //   684: ifeq -> 693
/*   */     //   687: iconst_0
/*   */     //   688: istore #21
/*   */     //   690: goto -> 705
/*   */     //   693: aload_0
/*   */     //   694: getfield lB0 : Lf/OE0;
/*   */     //   697: getfield Xu : Lf/H10;
/*   */     //   700: getfield goto : B
/*   */     //   703: istore #21
/*   */     //   705: aload #6
/*   */     //   707: aload #20
/*   */     //   709: iload #21
/*   */     //   711: iload #19
/*   */     //   713: invokevirtual zK0 : (Lf/lPT9;II)Lf/pe0;
/*   */     //   716: dup
/*   */     //   717: astore #20
/*   */     //   719: ifnull -> 922
/*   */     //   722: iload #4
/*   */     //   724: ifeq -> 830
/*   */     //   727: iload_3
/*   */     //   728: aload_1
/*   */     //   729: dup
/*   */     //   730: getfield lPt6 : F
/*   */     //   733: fstore_0
/*   */     //   734: fconst_0
/*   */     //   735: fconst_0
/*   */     //   736: fconst_0
/*   */     //   737: ldc 0.25
/*   */     //   739: invokevirtual implements : (FFFF)V
/*   */     //   742: ifeq -> 758
/*   */     //   745: aload #20
/*   */     //   747: getfield H0 : I
/*   */     //   750: i2f
/*   */     //   751: ldc 0.75
/*   */     //   753: fmul
/*   */     //   754: fstore_2
/*   */     //   755: goto -> 760
/*   */     //   758: fconst_0
/*   */     //   759: fstore_2
/*   */     //   760: iload_3
/*   */     //   761: aload #20
/*   */     //   763: fload #5
/*   */     //   765: fload_2
/*   */     //   766: fadd
/*   */     //   767: fstore_2
/*   */     //   768: fconst_0
/*   */     //   769: fstore_3
/*   */     //   770: fconst_0
/*   */     //   771: fstore #4
/*   */     //   773: getfield H0 : I
/*   */     //   776: istore #5
/*   */     //   778: ifeq -> 787
/*   */     //   781: iconst_m1
/*   */     //   782: istore #6
/*   */     //   784: goto -> 790
/*   */     //   787: iconst_1
/*   */     //   788: istore #6
/*   */     //   790: aload_1
/*   */     //   791: fload_0
/*   */     //   792: aload_1
/*   */     //   793: aload #20
/*   */     //   795: dup
/*   */     //   796: iload #5
/*   */     //   798: iload #6
/*   */     //   800: imul
/*   */     //   801: i2f
/*   */     //   802: fstore_0
/*   */     //   803: getfield Vn0 : I
/*   */     //   806: i2f
/*   */     //   807: fstore_1
/*   */     //   808: fload_2
/*   */     //   809: fload #7
/*   */     //   811: fload_3
/*   */     //   812: fload #4
/*   */     //   814: fload_0
/*   */     //   815: fload_1
/*   */     //   816: ldc 0.75
/*   */     //   818: ldc 0.75
/*   */     //   820: fconst_0
/*   */     //   821: invokevirtual dR : (Lf/pe0;FFFFFFFFF)V
/*   */     //   824: invokevirtual og0 : (F)V
/*   */     //   827: goto -> 1780
/*   */     //   830: iload_3
/*   */     //   831: ifeq -> 848
/*   */     //   834: aload #20
/*   */     //   836: getfield H0 : I
/*   */     //   839: i2f
/*   */     //   840: ldc 0.75
/*   */     //   842: fmul
/*   */     //   843: fstore #21
/*   */     //   845: goto -> 851
/*   */     //   848: fconst_0
/*   */     //   849: fstore #21
/*   */     //   851: iload_3
/*   */     //   852: aload #20
/*   */     //   854: fload #5
/*   */     //   856: fload #21
/*   */     //   858: fadd
/*   */     //   859: fstore #21
/*   */     //   861: fconst_0
/*   */     //   862: fstore #22
/*   */     //   864: fconst_0
/*   */     //   865: fstore #23
/*   */     //   867: getfield H0 : I
/*   */     //   870: istore #24
/*   */     //   872: ifeq -> 881
/*   */     //   875: iconst_m1
/*   */     //   876: istore #25
/*   */     //   878: goto -> 884
/*   */     //   881: iconst_1
/*   */     //   882: istore #25
/*   */     //   884: aload_1
/*   */     //   885: aload #20
/*   */     //   887: dup
/*   */     //   888: iload #24
/*   */     //   890: iload #25
/*   */     //   892: imul
/*   */     //   893: i2f
/*   */     //   894: fstore #20
/*   */     //   896: getfield Vn0 : I
/*   */     //   899: i2f
/*   */     //   900: fstore #24
/*   */     //   902: fload #21
/*   */     //   904: fload #7
/*   */     //   906: fload #22
/*   */     //   908: fload #23
/*   */     //   910: fload #20
/*   */     //   912: fload #24
/*   */     //   914: ldc 0.75
/*   */     //   916: ldc 0.75
/*   */     //   918: fconst_0
/*   */     //   919: invokevirtual dR : (Lf/pe0;FFFFFFFFF)V
/*   */     //   922: iload #13
/*   */     //   924: aload #6
/*   */     //   926: getstatic f/Vp0.Rj : Lf/Vp0;
/*   */     //   929: astore #20
/*   */     //   931: aload_1
/*   */     //   932: aload_0
/*   */     //   933: aload #20
/*   */     //   935: iload #19
/*   */     //   937: fload #5
/*   */     //   939: fload #7
/*   */     //   941: iload_3
/*   */     //   942: iload #15
/*   */     //   944: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   947: ifne -> 992
/*   */     //   950: iload #11
/*   */     //   952: bipush #12
/*   */     //   954: if_icmpeq -> 992
/*   */     //   957: iload #11
/*   */     //   959: bipush #17
/*   */     //   961: if_icmpeq -> 992
/*   */     //   964: iload #14
/*   */     //   966: iconst_1
/*   */     //   967: if_icmpge -> 992
/*   */     //   970: aload #6
/*   */     //   972: getstatic f/Vp0.c6 : Lf/Vp0;
/*   */     //   975: astore #20
/*   */     //   977: aload_1
/*   */     //   978: aload_0
/*   */     //   979: aload #20
/*   */     //   981: iload_2
/*   */     //   982: fload #5
/*   */     //   984: fload #7
/*   */     //   986: iload_3
/*   */     //   987: iload #15
/*   */     //   989: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   992: getstatic f/Vp0.Sz0 : Lf/Vp0;
/*   */     //   995: dup
/*   */     //   996: astore #20
/*   */     //   998: aload_0
/*   */     //   999: getfield lB0 : Lf/OE0;
/*   */     //   1002: aload #20
/*   */     //   1004: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1007: invokevirtual G6 : (S)Z
/*   */     //   1010: ifeq -> 1036
/*   */     //   1013: aload #6
/*   */     //   1015: getstatic f/Vp0.sg0 : Lf/Vp0;
/*   */     //   1018: astore #21
/*   */     //   1020: aload_1
/*   */     //   1021: aload_0
/*   */     //   1022: aload #21
/*   */     //   1024: iload #19
/*   */     //   1026: fload #5
/*   */     //   1028: fload #7
/*   */     //   1030: iload_3
/*   */     //   1031: iload #15
/*   */     //   1033: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1036: aload #20
/*   */     //   1038: aload_0
/*   */     //   1039: getfield lB0 : Lf/OE0;
/*   */     //   1042: aload #20
/*   */     //   1044: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1047: invokevirtual Jz0 : (S)Z
/*   */     //   1050: ifeq -> 1076
/*   */     //   1053: aload #6
/*   */     //   1055: getstatic f/Vp0.M9 : Lf/Vp0;
/*   */     //   1058: astore #21
/*   */     //   1060: aload_1
/*   */     //   1061: aload_0
/*   */     //   1062: aload #21
/*   */     //   1064: iload #19
/*   */     //   1066: fload #5
/*   */     //   1068: fload #7
/*   */     //   1070: iload_3
/*   */     //   1071: iload #15
/*   */     //   1073: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1076: aload_0
/*   */     //   1077: getfield lB0 : Lf/OE0;
/*   */     //   1080: getstatic f/Vp0.rK : Lf/Vp0;
/*   */     //   1083: dup
/*   */     //   1084: astore #21
/*   */     //   1086: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1089: iconst_1
/*   */     //   1090: if_icmpeq -> 1099
/*   */     //   1093: iconst_1
/*   */     //   1094: istore #22
/*   */     //   1096: goto -> 1102
/*   */     //   1099: iconst_0
/*   */     //   1100: istore #22
/*   */     //   1102: iload #22
/*   */     //   1104: ifne -> 1125
/*   */     //   1107: aload #6
/*   */     //   1109: aload_1
/*   */     //   1110: aload_0
/*   */     //   1111: aload #21
/*   */     //   1113: iload #19
/*   */     //   1115: fload #5
/*   */     //   1117: fload #7
/*   */     //   1119: iload_3
/*   */     //   1120: iload #15
/*   */     //   1122: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1125: iload #12
/*   */     //   1127: aload #6
/*   */     //   1129: aload_1
/*   */     //   1130: aload_0
/*   */     //   1131: aload #20
/*   */     //   1133: iload #19
/*   */     //   1135: fload #5
/*   */     //   1137: fload #7
/*   */     //   1139: iload_3
/*   */     //   1140: iload #15
/*   */     //   1142: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1145: ifne -> 1171
/*   */     //   1148: aload #6
/*   */     //   1150: getstatic f/Vp0.CR : Lf/Vp0;
/*   */     //   1153: astore #20
/*   */     //   1155: aload_1
/*   */     //   1156: aload_0
/*   */     //   1157: aload #20
/*   */     //   1159: iload #19
/*   */     //   1161: fload #5
/*   */     //   1163: fload #7
/*   */     //   1165: iload_3
/*   */     //   1166: iload #15
/*   */     //   1168: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1171: aload_0
/*   */     //   1172: aload #6
/*   */     //   1174: aload_1
/*   */     //   1175: aload #6
/*   */     //   1177: aload_1
/*   */     //   1178: getstatic f/Vp0.Pa0 : Lf/Vp0;
/*   */     //   1181: aload_0
/*   */     //   1182: swap
/*   */     //   1183: iload #19
/*   */     //   1185: fload #5
/*   */     //   1187: fload #7
/*   */     //   1189: iload_3
/*   */     //   1190: iload #15
/*   */     //   1192: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1195: getstatic f/Vp0.K7 : Lf/Vp0;
/*   */     //   1198: aload_0
/*   */     //   1199: swap
/*   */     //   1200: iload #19
/*   */     //   1202: fload #5
/*   */     //   1204: fload #7
/*   */     //   1206: iload_3
/*   */     //   1207: iload #15
/*   */     //   1209: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1212: getfield lB0 : Lf/OE0;
/*   */     //   1215: getstatic f/Vp0.bG : Lf/Vp0;
/*   */     //   1218: dup
/*   */     //   1219: astore #20
/*   */     //   1221: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1224: iconst_m1
/*   */     //   1225: if_icmpeq -> 1530
/*   */     //   1228: iload #15
/*   */     //   1230: aload_0
/*   */     //   1231: dup
/*   */     //   1232: dup
/*   */     //   1233: getfield lB0 : Lf/OE0;
/*   */     //   1236: getstatic f/Vp0.MP : Lf/Vp0;
/*   */     //   1239: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1242: istore #21
/*   */     //   1244: getfield lB0 : Lf/OE0;
/*   */     //   1247: aload #20
/*   */     //   1249: invokevirtual JM : (Lf/Vp0;)S
/*   */     //   1252: istore #23
/*   */     //   1254: getfield lB0 : Lf/OE0;
/*   */     //   1257: getfield ew0 : [Lf/vd;
/*   */     //   1260: aload #20
/*   */     //   1262: getfield gw0 : B
/*   */     //   1265: aaload
/*   */     //   1266: astore #20
/*   */     //   1268: getstatic f/Hk.dA : [[Lf/pe0;
/*   */     //   1271: aconst_null
/*   */     //   1272: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
/*   */     //   1275: ifeq -> 1286
/*   */     //   1278: getstatic f/Hk.Ys0 : [B
/*   */     //   1281: astore #24
/*   */     //   1283: goto -> 1291
/*   */     //   1286: getstatic f/Hk.bl : [B
/*   */     //   1289: astore #24
/*   */     //   1291: iconst_0
/*   */     //   1292: istore #25
/*   */     //   1294: iload #25
/*   */     //   1296: getstatic f/Hk.Vm : [Lf/Vp0;
/*   */     //   1299: dup
/*   */     //   1300: astore #26
/*   */     //   1302: arraylength
/*   */     //   1303: if_icmpge -> 1553
/*   */     //   1306: aload #26
/*   */     //   1308: iload #25
/*   */     //   1310: aaload
/*   */     //   1311: astore #26
/*   */     //   1313: iconst_0
/*   */     //   1314: istore #27
/*   */     //   1316: iload #27
/*   */     //   1318: aload #24
/*   */     //   1320: arraylength
/*   */     //   1321: if_icmpge -> 1524
/*   */     //   1324: aload #24
/*   */     //   1326: iload #27
/*   */     //   1328: baload
/*   */     //   1329: istore #28
/*   */     //   1331: getstatic f/Hk.dA : [[Lf/pe0;
/*   */     //   1334: dup
/*   */     //   1335: astore #29
/*   */     //   1337: iload #27
/*   */     //   1339: aaload
/*   */     //   1340: ifnonnull -> 1367
/*   */     //   1343: aload #29
/*   */     //   1345: iload #27
/*   */     //   1347: aload #6
/*   */     //   1349: getstatic f/lPT9.U4 : Lf/lPT9;
/*   */     //   1352: iload #21
/*   */     //   1354: iload #23
/*   */     //   1356: iload #19
/*   */     //   1358: iload #28
/*   */     //   1360: iconst_0
/*   */     //   1361: aload #20
/*   */     //   1363: invokevirtual WJ : (Lf/lPT9;SSBBZLf/vd;)[Lf/pe0;
/*   */     //   1366: aastore
/*   */     //   1367: aload #29
/*   */     //   1369: iload #27
/*   */     //   1371: aaload
/*   */     //   1372: dup
/*   */     //   1373: astore #29
/*   */     //   1375: ifnull -> 1518
/*   */     //   1378: aload #29
/*   */     //   1380: iload #25
/*   */     //   1382: aaload
/*   */     //   1383: dup
/*   */     //   1384: astore #29
/*   */     //   1386: ifnull -> 1518
/*   */     //   1389: aload #26
/*   */     //   1391: getstatic f/Vp0.MP : Lf/Vp0;
/*   */     //   1394: if_acmpne -> 1404
/*   */     //   1397: iload #21
/*   */     //   1399: istore #30
/*   */     //   1401: goto -> 1408
/*   */     //   1404: iload #23
/*   */     //   1406: istore #30
/*   */     //   1408: iload #28
/*   */     //   1410: iconst_5
/*   */     //   1411: if_icmpeq -> 1436
/*   */     //   1414: iload #28
/*   */     //   1416: iconst_2
/*   */     //   1417: if_icmpeq -> 1436
/*   */     //   1420: iload #28
/*   */     //   1422: bipush #6
/*   */     //   1424: if_icmpne -> 1430
/*   */     //   1427: goto -> 1436
/*   */     //   1430: iconst_0
/*   */     //   1431: istore #31
/*   */     //   1433: goto -> 1439
/*   */     //   1436: iconst_1
/*   */     //   1437: istore #31
/*   */     //   1439: iload #31
/*   */     //   1441: ifeq -> 1450
/*   */     //   1444: aconst_null
/*   */     //   1445: astore #31
/*   */     //   1447: goto -> 1461
/*   */     //   1450: aload_0
/*   */     //   1451: getfield lB0 : Lf/OE0;
/*   */     //   1454: aload #26
/*   */     //   1456: invokevirtual F00 : (Lf/Vp0;)Lf/UX;
/*   */     //   1459: astore #31
/*   */     //   1461: iload #28
/*   */     //   1463: iconst_4
/*   */     //   1464: if_icmpeq -> 1489
/*   */     //   1467: iload #28
/*   */     //   1469: iconst_1
/*   */     //   1470: if_icmpeq -> 1489
/*   */     //   1473: iload #28
/*   */     //   1475: bipush #6
/*   */     //   1477: if_icmpne -> 1483
/*   */     //   1480: goto -> 1489
/*   */     //   1483: iconst_0
/*   */     //   1484: istore #28
/*   */     //   1486: goto -> 1492
/*   */     //   1489: iconst_1
/*   */     //   1490: istore #28
/*   */     //   1492: aload_1
/*   */     //   1493: iload #28
/*   */     //   1495: iconst_1
/*   */     //   1496: ixor
/*   */     //   1497: istore #28
/*   */     //   1499: aload #29
/*   */     //   1501: aload #26
/*   */     //   1503: iload #30
/*   */     //   1505: aload #31
/*   */     //   1507: fload #5
/*   */     //   1509: fload #7
/*   */     //   1511: iload_3
/*   */     //   1512: iload #28
/*   */     //   1514: fconst_1
/*   */     //   1515: invokestatic QH : (Lf/tH;Lf/pe0;Lf/Vp0;SLf/UX;FFZZF)V
/*   */     //   1518: iinc #27, 1
/*   */     //   1521: goto -> 1316
/*   */     //   1524: iinc #25, 1
/*   */     //   1527: goto -> 1294
/*   */     //   1530: aload #6
/*   */     //   1532: getstatic f/Vp0.MP : Lf/Vp0;
/*   */     //   1535: astore #20
/*   */     //   1537: aload_1
/*   */     //   1538: aload_0
/*   */     //   1539: aload #20
/*   */     //   1541: iload #19
/*   */     //   1543: fload #5
/*   */     //   1545: fload #7
/*   */     //   1547: iload_3
/*   */     //   1548: iload #15
/*   */     //   1550: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1553: iload #22
/*   */     //   1555: ifeq -> 1581
/*   */     //   1558: aload #6
/*   */     //   1560: getstatic f/Vp0.rK : Lf/Vp0;
/*   */     //   1563: astore #20
/*   */     //   1565: aload_1
/*   */     //   1566: aload_0
/*   */     //   1567: aload #20
/*   */     //   1569: iload #19
/*   */     //   1571: fload #5
/*   */     //   1573: fload #7
/*   */     //   1575: iload_3
/*   */     //   1576: iload #15
/*   */     //   1578: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1581: iload #12
/*   */     //   1583: ifeq -> 1609
/*   */     //   1586: aload #6
/*   */     //   1588: getstatic f/Vp0.CR : Lf/Vp0;
/*   */     //   1591: astore #20
/*   */     //   1593: aload_1
/*   */     //   1594: aload_0
/*   */     //   1595: aload #20
/*   */     //   1597: iload #19
/*   */     //   1599: fload #5
/*   */     //   1601: fload #7
/*   */     //   1603: iload_3
/*   */     //   1604: iload #15
/*   */     //   1606: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1609: iload #14
/*   */     //   1611: ifle -> 1676
/*   */     //   1614: getstatic f/FN.tv : Lf/FN;
/*   */     //   1617: iload #14
/*   */     //   1619: iload #18
/*   */     //   1621: iconst_1
/*   */     //   1622: invokevirtual zd0 : (SII)Lf/U70;
/*   */     //   1625: dup
/*   */     //   1626: astore #15
/*   */     //   1628: ifnull -> 1738
/*   */     //   1631: aload_1
/*   */     //   1632: fload #7
/*   */     //   1634: aload #16
/*   */     //   1636: iload #17
/*   */     //   1638: aload #15
/*   */     //   1640: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   1643: astore #15
/*   */     //   1645: aaload
/*   */     //   1646: dup
/*   */     //   1647: fload #5
/*   */     //   1649: swap
/*   */     //   1650: iconst_0
/*   */     //   1651: faload
/*   */     //   1652: fadd
/*   */     //   1653: fstore #20
/*   */     //   1655: iconst_1
/*   */     //   1656: faload
/*   */     //   1657: fadd
/*   */     //   1658: fstore #21
/*   */     //   1660: aload #15
/*   */     //   1662: fload #20
/*   */     //   1664: fload #21
/*   */     //   1666: ldc 24.0
/*   */     //   1668: ldc 24.0
/*   */     //   1670: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*   */     //   1673: goto -> 1738
/*   */     //   1676: iload #11
/*   */     //   1678: invokestatic o7 : (S)Z
/*   */     //   1681: ifeq -> 1711
/*   */     //   1684: aload #6
/*   */     //   1686: getstatic f/Vp0.c6 : Lf/Vp0;
/*   */     //   1689: astore #15
/*   */     //   1691: aload_1
/*   */     //   1692: aload_0
/*   */     //   1693: aload #15
/*   */     //   1695: iload #11
/*   */     //   1697: iload #19
/*   */     //   1699: fload #5
/*   */     //   1701: fload #7
/*   */     //   1703: iload_3
/*   */     //   1704: iconst_1
/*   */     //   1705: invokevirtual vo : (Lf/tH;Lf/Jo;Lf/Vp0;SBFFZZ)V
/*   */     //   1708: goto -> 1738
/*   */     //   1711: iload #13
/*   */     //   1713: ifeq -> 1738
/*   */     //   1716: aload #6
/*   */     //   1718: getstatic f/Vp0.c6 : Lf/Vp0;
/*   */     //   1721: astore #20
/*   */     //   1723: aload_1
/*   */     //   1724: aload_0
/*   */     //   1725: aload #20
/*   */     //   1727: iload_2
/*   */     //   1728: fload #5
/*   */     //   1730: fload #7
/*   */     //   1732: iload_3
/*   */     //   1733: iload #15
/*   */     //   1735: invokevirtual Vw0 : (Lf/tH;Lf/Jo;Lf/Vp0;BFFZZ)V
/*   */     //   1738: iinc #10, 1
/*   */     //   1741: goto -> 644
/*   */     //   1744: iload #9
/*   */     //   1746: bipush #68
/*   */     //   1748: if_icmpeq -> 1758
/*   */     //   1751: iload #9
/*   */     //   1753: bipush #73
/*   */     //   1755: if_icmpne -> 1780
/*   */     //   1758: aload #6
/*   */     //   1760: getstatic f/Vp0.CR : Lf/Vp0;
/*   */     //   1763: astore_2
/*   */     //   1764: aload_1
/*   */     //   1765: aload_0
/*   */     //   1766: aload_2
/*   */     //   1767: iload #9
/*   */     //   1769: iload #19
/*   */     //   1771: fload #5
/*   */     //   1773: fload #7
/*   */     //   1775: iload_3
/*   */     //   1776: iconst_1
/*   */     //   1777: invokevirtual un : (Lf/tH;Lf/Jo;Lf/Vp0;SBFFZZ)V
/*   */     //   1780: iconst_1
/*   */     //   1781: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 67
/*   */     //   #2	-> 70
/*   */     //   #3	-> 76
/*   */     //   #4	-> 136
/*   */     //   #5	-> 139
/*   */     //   #6	-> 171
/*   */     //   #7	-> 194
/*   */     //   #8	-> 197
/*   */     //   #9	-> 208
/*   */     //   #10	-> 211
/*   */     //   #11	-> 222
/*   */     //   #12	-> 225
/*   */     //   #13	-> 236
/*   */     //   #14	-> 252
/*   */     //   #15	-> 255
/*   */     //   #16	-> 266
/*   */     //   #17	-> 312
/*   */     //   #18	-> 320
/*   */     //   #19	-> 518
/*   */     //   #20	-> 524
/*   */     //   #21	-> 694
/*   */     //   #22	-> 697
/*   */     //   #23	-> 700
/*   */     //   #24	-> 713
/*   */     //   #25	-> 730
/*   */     //   #26	-> 739
/*   */     //   #27	-> 747
/*   */     //   #28	-> 803
/*   */     //   #29	-> 821
/*   */     //   #30	-> 836
/*   */     //   #31	-> 896
/*   */     //   #32	-> 919
/*   */     //   #33	-> 999
/*   */     //   #34	-> 1004
/*   */     //   #35	-> 1039
/*   */     //   #36	-> 1044
/*   */     //   #37	-> 1077
/*   */     //   #38	-> 1080
/*   */     //   #39	-> 1212
/*   */     //   #40	-> 1215
/*   */     //   #41	-> 1233
/*   */     //   #42	-> 1236
/*   */     //   #43	-> 1244
/*   */     //   #44	-> 1249
/*   */     //   #45	-> 1254
/*   */     //   #46	-> 1257
/*   */     //   #47	-> 1262
/*   */     //   #48	-> 1265
/*   */     //   #49	-> 1268
/*   */     //   #50	-> 1451
/*   */     //   #51	-> 1456
/*   */     //   #52	-> 1515
/*   */     //   #53	-> 1532
/*   */     //   #54	-> 1614
/* 2 */     //   #55	-> 1622 } public final int zv() { return 16; } public final int e60() { return 32; } public final void fH(boolean paramBoolean1, boolean paramBoolean2) { this.uc0 = paramBoolean1; if (!paramBoolean1 && paramBoolean2) { this.Mo0 = zm0.u20 + 2500L; } else if (!paramBoolean2) { this.Mo0 = 0L; }  } public final boolean nc0() { return (this.uc0 && zm0.u20 > this.Mo0); }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */