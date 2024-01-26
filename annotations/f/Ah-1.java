/*    */ package f;public final class Ah implements iq0 { public static boolean ai0 = false; public static boolean YP = false; public static final ik yv = C00.gd(Ah.class); public static final eo U4 = new eo(); public static final eo O9 = new eo(); public static final Eb Mb0 = new Eb(); public static float[][] DB; public static float[][] ue0; public int F40; public int Kj0; public int aK; public eo w3; public eo od; public Ws0 wg0; public lpt1 K9; public fQ W7; public fQ J90; public fQ KQ; public boolean a20; public S0 FI; public VV QQ; public lpt1 LW; public lpt1 lR; public lpt1 O1; public Ah(iy0 paramiy0, yU paramyU) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aload_2
/*    */     //   2: aload_0
/*    */     //   3: aload_2
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: aload_0
/*    */     //   7: dup
/*    */     //   8: dup2
/*    */     //   9: dup2
/*    */     //   10: dup2
/*    */     //   11: dup2
/*    */     //   12: invokespecial <init> : ()V
/*    */     //   15: new f/eo
/*    */     //   18: dup
/*    */     //   19: invokespecial <init> : ()V
/*    */     //   22: putfield w3 : Lf/eo;
/*    */     //   25: new f/eo
/*    */     //   28: dup
/*    */     //   29: invokespecial <init> : ()V
/*    */     //   32: putfield od : Lf/eo;
/*    */     //   35: new f/fQ
/*    */     //   38: dup
/*    */     //   39: iconst_0
/*    */     //   40: bipush #16
/*    */     //   42: invokespecial <init> : (ZI)V
/*    */     //   45: putfield W7 : Lf/fQ;
/*    */     //   48: new f/fQ
/*    */     //   51: dup
/*    */     //   52: iconst_0
/*    */     //   53: bipush #6
/*    */     //   55: invokespecial <init> : (ZI)V
/*    */     //   58: putfield J90 : Lf/fQ;
/*    */     //   61: new f/fQ
/*    */     //   64: dup
/*    */     //   65: iconst_0
/*    */     //   66: bipush #16
/*    */     //   68: invokespecial <init> : (ZI)V
/*    */     //   71: putfield KQ : Lf/fQ;
/*    */     //   74: iconst_1
/*    */     //   75: putfield a20 : Z
/*    */     //   78: aconst_null
/*    */     //   79: putfield LW : Lf/lpt1;
/*    */     //   82: aconst_null
/*    */     //   83: putfield lR : Lf/lpt1;
/*    */     //   86: aconst_null
/*    */     //   87: putfield O1 : Lf/lpt1;
/*    */     //   90: putfield wg0 : Lf/Ws0;
/*    */     //   93: invokevirtual lc0 : ()S
/*    */     //   96: putfield aK : I
/*    */     //   99: invokevirtual qq : ()Ljava/nio/ByteBuffer;
/*    */     //   102: invokestatic tB : (Ljava/nio/ByteBuffer;)Lf/Q1;
/*    */     //   105: astore_3
/*    */     //   106: invokevirtual lpT5 : ()Lf/uz0;
/*    */     //   109: ifnonnull -> 123
/*    */     //   112: aload_0
/*    */     //   113: aload_1
/*    */     //   114: getfield COm4 : S
/*    */     //   117: putfield F40 : I
/*    */     //   120: goto -> 134
/*    */     //   123: aload_0
/*    */     //   124: aload_1
/*    */     //   125: invokevirtual lpT5 : ()Lf/uz0;
/*    */     //   128: invokevirtual ez0 : ()S
/*    */     //   131: putfield F40 : I
/*    */     //   134: aload_1
/*    */     //   135: invokevirtual VK : ()B
/*    */     //   138: iconst_3
/*    */     //   139: if_icmpne -> 257
/*    */     //   142: aload_0
/*    */     //   143: getfield aK : I
/*    */     //   146: dup
/*    */     //   147: istore #4
/*    */     //   149: sipush #177
/*    */     //   152: if_icmpeq -> 251
/*    */     //   155: iload #4
/*    */     //   157: sipush #178
/*    */     //   160: if_icmpne -> 166
/*    */     //   163: goto -> 251
/*    */     //   166: iload #4
/*    */     //   168: sipush #173
/*    */     //   171: if_icmpne -> 183
/*    */     //   174: aload_0
/*    */     //   175: bipush #6
/*    */     //   177: putfield F40 : I
/*    */     //   180: goto -> 257
/*    */     //   183: iload #4
/*    */     //   185: sipush #174
/*    */     //   188: if_icmpne -> 200
/*    */     //   191: aload_0
/*    */     //   192: bipush #15
/*    */     //   194: putfield F40 : I
/*    */     //   197: goto -> 257
/*    */     //   200: iload #4
/*    */     //   202: sipush #175
/*    */     //   205: if_icmpne -> 217
/*    */     //   208: aload_0
/*    */     //   209: bipush #7
/*    */     //   211: putfield F40 : I
/*    */     //   214: goto -> 257
/*    */     //   217: iload #4
/*    */     //   219: sipush #176
/*    */     //   222: if_icmpne -> 234
/*    */     //   225: aload_0
/*    */     //   226: bipush #12
/*    */     //   228: putfield F40 : I
/*    */     //   231: goto -> 257
/*    */     //   234: iload #4
/*    */     //   236: sipush #179
/*    */     //   239: if_icmpne -> 257
/*    */     //   242: aload_0
/*    */     //   243: bipush #19
/*    */     //   245: putfield F40 : I
/*    */     //   248: goto -> 257
/*    */     //   251: aload_0
/*    */     //   252: bipush #14
/*    */     //   254: putfield F40 : I
/*    */     //   257: aload_3
/*    */     //   258: getstatic f/km.mI0 : Lf/P1;
/*    */     //   261: aload_1
/*    */     //   262: invokevirtual VK : ()B
/*    */     //   265: invokevirtual LpT7 : (B)Lf/HI;
/*    */     //   268: aload_0
/*    */     //   269: getstatic f/VV.Dv0 : Lf/VV;
/*    */     //   272: astore #4
/*    */     //   274: getfield F40 : I
/*    */     //   277: aload #4
/*    */     //   279: swap
/*    */     //   280: invokevirtual oB : (Lf/VV;I)Lf/Wd;
/*    */     //   283: astore #4
/*    */     //   285: new f/Iq
/*    */     //   288: dup
/*    */     //   289: astore #5
/*    */     //   291: aload_0
/*    */     //   292: aload_3
/*    */     //   293: aload_1
/*    */     //   294: invokevirtual VK : ()B
/*    */     //   297: istore #6
/*    */     //   299: getfield Nt : [Lf/hC;
/*    */     //   302: iconst_0
/*    */     //   303: aaload
/*    */     //   304: astore #7
/*    */     //   306: getfield F40 : I
/*    */     //   309: istore #8
/*    */     //   311: iload #6
/*    */     //   313: aload #7
/*    */     //   315: aload #4
/*    */     //   317: iload #8
/*    */     //   319: invokespecial <init> : (BLf/hC;Lf/Wd;I)V
/*    */     //   322: getfield Nt : [Lf/hC;
/*    */     //   325: iconst_0
/*    */     //   326: aaload
/*    */     //   327: aload #4
/*    */     //   329: invokestatic DG0 : (Lf/hC;Lf/Wd;)V
/*    */     //   332: getstatic f/h1.Pm : Z
/*    */     //   335: ifeq -> 453
/*    */     //   338: aload_1
/*    */     //   339: invokevirtual VK : ()B
/*    */     //   342: dup
/*    */     //   343: istore #6
/*    */     //   345: iconst_3
/*    */     //   346: if_icmpeq -> 406
/*    */     //   349: iload #6
/*    */     //   351: iconst_4
/*    */     //   352: if_icmpeq -> 356
/*    */     //   355: return
/*    */     //   356: getstatic f/km.ln : Lf/ei;
/*    */     //   359: iconst_4
/*    */     //   360: invokevirtual d1 : (B)Lf/IZ;
/*    */     //   363: aload_0
/*    */     //   364: getfield aK : I
/*    */     //   367: aload #5
/*    */     //   369: invokevirtual VE0 : (ILf/Ew;)Lf/lpt1;
/*    */     //   372: dup
/*    */     //   373: astore #6
/*    */     //   375: aload_0
/*    */     //   376: aload #6
/*    */     //   378: putfield K9 : Lf/lpt1;
/*    */     //   381: ifnull -> 453
/*    */     //   384: getstatic f/km.mI0 : Lf/P1;
/*    */     //   387: getfield yE : Lf/BE;
/*    */     //   390: aload #6
/*    */     //   392: aload_3
/*    */     //   393: getfield Nt : [Lf/hC;
/*    */     //   396: iconst_0
/*    */     //   397: aaload
/*    */     //   398: aload #5
/*    */     //   400: invokestatic C90 : (Lf/HI;Lf/lpt1;Lf/hC;Lf/Ew;)V
/*    */     //   403: goto -> 453
/*    */     //   406: getstatic f/km.ln : Lf/ei;
/*    */     //   409: iconst_3
/*    */     //   410: invokevirtual d1 : (B)Lf/IZ;
/*    */     //   413: aload_0
/*    */     //   414: getfield aK : I
/*    */     //   417: aload #5
/*    */     //   419: invokevirtual VE0 : (ILf/Ew;)Lf/lpt1;
/*    */     //   422: dup
/*    */     //   423: astore #6
/*    */     //   425: aload_0
/*    */     //   426: aload #6
/*    */     //   428: putfield K9 : Lf/lpt1;
/*    */     //   431: ifnull -> 453
/*    */     //   434: getstatic f/km.mI0 : Lf/P1;
/*    */     //   437: getfield MT : Lf/gD;
/*    */     //   440: aload #6
/*    */     //   442: aload_3
/*    */     //   443: getfield Nt : [Lf/hC;
/*    */     //   446: iconst_0
/*    */     //   447: aaload
/*    */     //   448: aload #5
/*    */     //   450: invokestatic C90 : (Lf/HI;Lf/lpt1;Lf/hC;Lf/Ew;)V
/*    */     //   453: aload_0
/*    */     //   454: aload_1
/*    */     //   455: dup
/*    */     //   456: invokevirtual hG0 : ()Z
/*    */     //   459: istore #6
/*    */     //   461: invokevirtual ia0 : ()Z
/*    */     //   464: istore #7
/*    */     //   466: getfield K9 : Lf/lpt1;
/*    */     //   469: ifnonnull -> 532
/*    */     //   472: aload_1
/*    */     //   473: invokevirtual VK : ()B
/*    */     //   476: iconst_4
/*    */     //   477: if_icmpne -> 499
/*    */     //   480: aload_0
/*    */     //   481: getfield aK : I
/*    */     //   484: sipush #225
/*    */     //   487: if_icmpne -> 499
/*    */     //   490: aload_3
/*    */     //   491: getfield Nt : [Lf/hC;
/*    */     //   494: iconst_0
/*    */     //   495: aaload
/*    */     //   496: invokestatic vS : (Lf/hC;)V
/*    */     //   499: aload_0
/*    */     //   500: aload_3
/*    */     //   501: invokestatic Lj : ()Lf/eI;
/*    */     //   504: astore #8
/*    */     //   506: getfield Nt : [Lf/hC;
/*    */     //   509: iconst_0
/*    */     //   510: aaload
/*    */     //   511: aload #5
/*    */     //   513: aload #4
/*    */     //   515: aload #8
/*    */     //   517: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   520: pop
/*    */     //   521: aconst_null
/*    */     //   522: fconst_1
/*    */     //   523: iload #6
/*    */     //   525: iconst_0
/*    */     //   526: invokestatic Q9 : (Lf/hC;Lf/Ew;Lf/Wd;Lf/fQ;FZZ)Lf/lpt1;
/*    */     //   529: putfield K9 : Lf/lpt1;
/*    */     //   532: aload_1
/*    */     //   533: invokevirtual VK : ()B
/*    */     //   536: iconst_3
/*    */     //   537: if_icmpne -> 637
/*    */     //   540: aload_0
/*    */     //   541: getfield aK : I
/*    */     //   544: dup
/*    */     //   545: istore #4
/*    */     //   547: sipush #294
/*    */     //   550: if_icmpeq -> 569
/*    */     //   553: iload #4
/*    */     //   555: sipush #233
/*    */     //   558: if_icmpeq -> 569
/*    */     //   561: iload #4
/*    */     //   563: sipush #235
/*    */     //   566: if_icmpne -> 637
/*    */     //   569: iload #4
/*    */     //   571: aconst_null
/*    */     //   572: astore #6
/*    */     //   574: sipush #233
/*    */     //   577: if_icmpeq -> 613
/*    */     //   580: iload #4
/*    */     //   582: sipush #235
/*    */     //   585: if_icmpeq -> 599
/*    */     //   588: iload #4
/*    */     //   590: sipush #294
/*    */     //   593: if_icmpeq -> 599
/*    */     //   596: goto -> 624
/*    */     //   599: aload_0
/*    */     //   600: getfield K9 : Lf/lpt1;
/*    */     //   603: ldc 'lambert1'
/*    */     //   605: invokevirtual else : (Ljava/lang/String;)Lf/T0;
/*    */     //   608: astore #6
/*    */     //   610: goto -> 624
/*    */     //   613: aload_0
/*    */     //   614: getfield K9 : Lf/lpt1;
/*    */     //   617: ldc 'ss'
/*    */     //   619: invokevirtual else : (Ljava/lang/String;)Lf/T0;
/*    */     //   622: astore #6
/*    */     //   624: aload #6
/*    */     //   626: ifnull -> 637
/*    */     //   629: aload #6
/*    */     //   631: getstatic f/O80.Jg0 : J
/*    */     //   634: invokevirtual Ng0 : (J)V
/*    */     //   637: aload_0
/*    */     //   638: getfield K9 : Lf/lpt1;
/*    */     //   641: ifnull -> 688
/*    */     //   644: getstatic f/Ah.YP : Z
/*    */     //   647: ifne -> 688
/*    */     //   650: aload_1
/*    */     //   651: invokevirtual VK : ()B
/*    */     //   654: iconst_3
/*    */     //   655: if_icmpne -> 667
/*    */     //   658: getstatic f/km.mI0 : Lf/P1;
/*    */     //   661: getfield MT : Lf/gD;
/*    */     //   664: goto -> 673
/*    */     //   667: getstatic f/km.mI0 : Lf/P1;
/*    */     //   670: getfield yE : Lf/BE;
/*    */     //   673: aload_0
/*    */     //   674: getfield K9 : Lf/lpt1;
/*    */     //   677: aload_3
/*    */     //   678: getfield Nt : [Lf/hC;
/*    */     //   681: iconst_0
/*    */     //   682: aaload
/*    */     //   683: aload #5
/*    */     //   685: invokestatic C90 : (Lf/HI;Lf/lpt1;Lf/hC;Lf/Ew;)V
/*    */     //   688: aload_2
/*    */     //   689: getfield O90 : I
/*    */     //   692: ifle -> 1139
/*    */     //   695: aload_1
/*    */     //   696: invokevirtual VK : ()B
/*    */     //   699: iconst_3
/*    */     //   700: if_icmpne -> 712
/*    */     //   703: aload_2
/*    */     //   704: invokevirtual lc0 : ()S
/*    */     //   707: bipush #71
/*    */     //   709: if_icmpeq -> 1139
/*    */     //   712: aload_2
/*    */     //   713: invokevirtual ZJ : ()Lf/T7;
/*    */     //   716: invokevirtual l2 : ()Ljava/nio/ByteBuffer;
/*    */     //   719: astore_3
/*    */     //   720: iconst_0
/*    */     //   721: istore #4
/*    */     //   723: iload #4
/*    */     //   725: aload_2
/*    */     //   726: getfield O90 : I
/*    */     //   729: if_icmpge -> 1139
/*    */     //   732: aload_1
/*    */     //   733: aload_3
/*    */     //   734: iload #4
/*    */     //   736: aload_2
/*    */     //   737: invokevirtual nG : ()I
/*    */     //   740: istore #5
/*    */     //   742: bipush #48
/*    */     //   744: imul
/*    */     //   745: iload #5
/*    */     //   747: iadd
/*    */     //   748: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   751: pop
/*    */     //   752: getstatic f/Ah.U4 : Lf/eo;
/*    */     //   755: dup
/*    */     //   756: astore #5
/*    */     //   758: aload_3
/*    */     //   759: dup
/*    */     //   760: aload #5
/*    */     //   762: aload_3
/*    */     //   763: dup
/*    */     //   764: aload #5
/*    */     //   766: aload_3
/*    */     //   767: dup
/*    */     //   768: dup
/*    */     //   769: invokevirtual getInt : ()I
/*    */     //   772: istore #6
/*    */     //   774: invokevirtual getShort : ()S
/*    */     //   777: ldc_w 65535
/*    */     //   780: iand
/*    */     //   781: i2f
/*    */     //   782: ldc_w 65536.0
/*    */     //   785: fdiv
/*    */     //   786: fstore #8
/*    */     //   788: invokevirtual getShort : ()S
/*    */     //   791: i2f
/*    */     //   792: fload #8
/*    */     //   794: fadd
/*    */     //   795: putfield x : F
/*    */     //   798: invokevirtual getShort : ()S
/*    */     //   801: ldc_w 65535
/*    */     //   804: iand
/*    */     //   805: i2f
/*    */     //   806: ldc_w 65536.0
/*    */     //   809: fdiv
/*    */     //   810: fstore #8
/*    */     //   812: invokevirtual getShort : ()S
/*    */     //   815: i2f
/*    */     //   816: fload #8
/*    */     //   818: fadd
/*    */     //   819: putfield y : F
/*    */     //   822: invokevirtual getShort : ()S
/*    */     //   825: ldc_w 65535
/*    */     //   828: iand
/*    */     //   829: i2f
/*    */     //   830: ldc_w 65536.0
/*    */     //   833: fdiv
/*    */     //   834: fstore #8
/*    */     //   836: invokevirtual getShort : ()S
/*    */     //   839: i2f
/*    */     //   840: fload #8
/*    */     //   842: fadd
/*    */     //   843: putfield z : F
/*    */     //   846: invokevirtual VK : ()B
/*    */     //   849: iconst_4
/*    */     //   850: if_icmpne -> 875
/*    */     //   853: iload #6
/*    */     //   855: bipush #124
/*    */     //   857: if_icmpeq -> 867
/*    */     //   860: iload #6
/*    */     //   862: bipush #125
/*    */     //   864: if_icmpne -> 875
/*    */     //   867: iload #7
/*    */     //   869: ifeq -> 875
/*    */     //   872: goto -> 1133
/*    */     //   875: aload_1
/*    */     //   876: invokevirtual VK : ()B
/*    */     //   879: iconst_4
/*    */     //   880: if_icmpne -> 895
/*    */     //   883: iload #6
/*    */     //   885: sipush #221
/*    */     //   888: if_icmpne -> 895
/*    */     //   891: bipush #23
/*    */     //   893: istore #6
/*    */     //   895: aload_1
/*    */     //   896: invokevirtual VK : ()B
/*    */     //   899: iconst_3
/*    */     //   900: if_icmpne -> 922
/*    */     //   903: aload #5
/*    */     //   905: aload_0
/*    */     //   906: getfield K9 : Lf/lpt1;
/*    */     //   909: getfield fv0 : F
/*    */     //   912: iload #6
/*    */     //   914: invokestatic RP : (Lf/eo;FI)Lf/lpt1;
/*    */     //   917: astore #8
/*    */     //   919: goto -> 950
/*    */     //   922: aload #5
/*    */     //   924: iload #7
/*    */     //   926: aload_0
/*    */     //   927: getfield K9 : Lf/lpt1;
/*    */     //   930: getfield fv0 : F
/*    */     //   933: fstore #8
/*    */     //   935: iconst_1
/*    */     //   936: ixor
/*    */     //   937: istore #9
/*    */     //   939: fload #8
/*    */     //   941: iload #6
/*    */     //   943: iload #9
/*    */     //   945: invokestatic gt : (Lf/eo;FIZ)Lf/lpt1;
/*    */     //   948: astore #8
/*    */     //   950: aload #8
/*    */     //   952: ifnonnull -> 987
/*    */     //   955: getstatic f/Ah.yv : Lf/ik;
/*    */     //   958: new java/lang/StringBuilder
/*    */     //   961: dup
/*    */     //   962: invokespecial <init> : ()V
/*    */     //   965: ldc_w 'unable to load building id = '
/*    */     //   968: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   971: iload #6
/*    */     //   973: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   976: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   979: invokeinterface info : (Ljava/lang/String;)V
/*    */     //   984: goto -> 1133
/*    */     //   987: aload_1
/*    */     //   988: invokevirtual VK : ()B
/*    */     //   991: iconst_4
/*    */     //   992: if_icmpne -> 1050
/*    */     //   995: aload_1
/*    */     //   996: invokevirtual WD0 : ()Lf/vF;
/*    */     //   999: getstatic f/vF.ud0 : Lf/vF;
/*    */     //   1002: if_acmpne -> 1050
/*    */     //   1005: iload #6
/*    */     //   1007: bipush #36
/*    */     //   1009: if_icmpne -> 1040
/*    */     //   1012: aload_0
/*    */     //   1013: aload #5
/*    */     //   1015: aload_0
/*    */     //   1016: dup
/*    */     //   1017: aload #8
/*    */     //   1019: putfield LW : Lf/lpt1;
/*    */     //   1022: getfield K9 : Lf/lpt1;
/*    */     //   1025: getfield fv0 : F
/*    */     //   1028: bipush #107
/*    */     //   1030: iconst_0
/*    */     //   1031: invokestatic gt : (Lf/eo;FIZ)Lf/lpt1;
/*    */     //   1034: putfield O1 : Lf/lpt1;
/*    */     //   1037: goto -> 1106
/*    */     //   1040: iload #6
/*    */     //   1042: bipush #37
/*    */     //   1044: if_icmpne -> 1106
/*    */     //   1047: goto -> 1100
/*    */     //   1050: aload_1
/*    */     //   1051: invokevirtual VK : ()B
/*    */     //   1054: iconst_3
/*    */     //   1055: if_icmpne -> 1106
/*    */     //   1058: iload #6
/*    */     //   1060: bipush #123
/*    */     //   1062: if_icmpne -> 1093
/*    */     //   1065: aload_0
/*    */     //   1066: aload #5
/*    */     //   1068: aload_0
/*    */     //   1069: dup
/*    */     //   1070: aload #8
/*    */     //   1072: putfield LW : Lf/lpt1;
/*    */     //   1075: getfield K9 : Lf/lpt1;
/*    */     //   1078: getfield fv0 : F
/*    */     //   1081: sipush #517
/*    */     //   1084: invokestatic RP : (Lf/eo;FI)Lf/lpt1;
/*    */     //   1087: putfield O1 : Lf/lpt1;
/*    */     //   1090: goto -> 1106
/*    */     //   1093: iload #6
/*    */     //   1095: bipush #124
/*    */     //   1097: if_icmpne -> 1106
/*    */     //   1100: aload_0
/*    */     //   1101: aload #8
/*    */     //   1103: putfield lR : Lf/lpt1;
/*    */     //   1106: aload_0
/*    */     //   1107: aload #8
/*    */     //   1109: aload_1
/*    */     //   1110: dup
/*    */     //   1111: getfield d8 : B
/*    */     //   1114: istore #5
/*    */     //   1116: invokevirtual VK : ()B
/*    */     //   1119: iload #5
/*    */     //   1121: swap
/*    */     //   1122: invokevirtual Kg0 : (IB)V
/*    */     //   1125: getfield W7 : Lf/fQ;
/*    */     //   1128: aload #8
/*    */     //   1130: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   1133: iinc #4, 1
/*    */     //   1136: goto -> 723
/*    */     //   1139: aload_1
/*    */     //   1140: invokevirtual VK : ()B
/*    */     //   1143: iconst_3
/*    */     //   1144: if_icmpne -> 1313
/*    */     //   1147: aload_0
/*    */     //   1148: getfield aK : I
/*    */     //   1151: sipush #588
/*    */     //   1154: if_icmpne -> 1162
/*    */     //   1157: aload_0
/*    */     //   1158: iconst_0
/*    */     //   1159: putfield a20 : Z
/*    */     //   1162: aload_1
/*    */     //   1163: getfield d8 : B
/*    */     //   1166: dup
/*    */     //   1167: istore_1
/*    */     //   1168: bipush #6
/*    */     //   1170: if_icmpne -> 1210
/*    */     //   1173: aload_0
/*    */     //   1174: dup
/*    */     //   1175: getfield K9 : Lf/lpt1;
/*    */     //   1178: iconst_1
/*    */     //   1179: anewarray java/lang/String
/*    */     //   1182: dup
/*    */     //   1183: iconst_0
/*    */     //   1184: ldc_w 'c1_o02b_lm6'
/*    */     //   1187: aastore
/*    */     //   1188: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1191: getfield K9 : Lf/lpt1;
/*    */     //   1194: iconst_1
/*    */     //   1195: anewarray java/lang/String
/*    */     //   1198: dup
/*    */     //   1199: iconst_0
/*    */     //   1200: ldc_w 'c1_o02b_lm4'
/*    */     //   1203: aastore
/*    */     //   1204: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1207: goto -> 1554
/*    */     //   1210: iload_1
/*    */     //   1211: bipush #10
/*    */     //   1213: if_icmpne -> 1253
/*    */     //   1216: aload_0
/*    */     //   1217: dup
/*    */     //   1218: getfield K9 : Lf/lpt1;
/*    */     //   1221: iconst_1
/*    */     //   1222: anewarray java/lang/String
/*    */     //   1225: dup
/*    */     //   1226: iconst_0
/*    */     //   1227: ldc_w 'c5_light_lm2'
/*    */     //   1230: aastore
/*    */     //   1231: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1234: getfield K9 : Lf/lpt1;
/*    */     //   1237: iconst_1
/*    */     //   1238: anewarray java/lang/String
/*    */     //   1241: dup
/*    */     //   1242: iconst_0
/*    */     //   1243: ldc_w 'lambert7'
/*    */     //   1246: aastore
/*    */     //   1247: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1250: goto -> 1554
/*    */     //   1253: iload_1
/*    */     //   1254: bipush #56
/*    */     //   1256: if_icmpne -> 1554
/*    */     //   1259: aload_0
/*    */     //   1260: dup
/*    */     //   1261: dup
/*    */     //   1262: getfield K9 : Lf/lpt1;
/*    */     //   1265: iconst_1
/*    */     //   1266: anewarray java/lang/String
/*    */     //   1269: dup
/*    */     //   1270: iconst_0
/*    */     //   1271: ldc_w 'c5_light_lm2'
/*    */     //   1274: aastore
/*    */     //   1275: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1278: getfield K9 : Lf/lpt1;
/*    */     //   1281: iconst_1
/*    */     //   1282: anewarray java/lang/String
/*    */     //   1285: dup
/*    */     //   1286: iconst_0
/*    */     //   1287: ldc_w 'c5_light_lm4'
/*    */     //   1290: aastore
/*    */     //   1291: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1294: getfield K9 : Lf/lpt1;
/*    */     //   1297: iconst_1
/*    */     //   1298: anewarray java/lang/String
/*    */     //   1301: dup
/*    */     //   1302: iconst_0
/*    */     //   1303: ldc_w 'c5_light_lm6'
/*    */     //   1306: aastore
/*    */     //   1307: invokevirtual z8 : ([Ljava/lang/String;)V
/*    */     //   1310: goto -> 1554
/*    */     //   1313: aload_1
/*    */     //   1314: invokevirtual VK : ()B
/*    */     //   1317: iconst_4
/*    */     //   1318: if_icmpne -> 1554
/*    */     //   1321: aload_1
/*    */     //   1322: getfield Ga : S
/*    */     //   1325: bipush #76
/*    */     //   1327: if_icmpne -> 1353
/*    */     //   1330: aload_0
/*    */     //   1331: dup
/*    */     //   1332: getfield K9 : Lf/lpt1;
/*    */     //   1335: ldc_w 'h_mado_lm1'
/*    */     //   1338: invokevirtual db0 : (Ljava/lang/String;)V
/*    */     //   1341: getfield K9 : Lf/lpt1;
/*    */     //   1344: ldc_w 'ko_h03x_h_'
/*    */     //   1347: invokevirtual db0 : (Ljava/lang/String;)V
/*    */     //   1350: goto -> 1554
/*    */     //   1353: aload_0
/*    */     //   1354: getfield aK : I
/*    */     //   1357: dup
/*    */     //   1358: istore_1
/*    */     //   1359: sipush #249
/*    */     //   1362: if_icmpne -> 1376
/*    */     //   1365: aload_0
/*    */     //   1366: getfield K9 : Lf/lpt1;
/*    */     //   1369: iconst_0
/*    */     //   1370: putfield Yr0 : Z
/*    */     //   1373: goto -> 1554
/*    */     //   1376: iload_1
/*    */     //   1377: sipush #246
/*    */     //   1380: if_icmpne -> 1405
/*    */     //   1383: aload_0
/*    */     //   1384: getfield K9 : Lf/lpt1;
/*    */     //   1387: ldc_w 'polygon2_lm9'
/*    */     //   1390: invokevirtual Gm0 : (Ljava/lang/String;)Lf/zP;
/*    */     //   1393: dup
/*    */     //   1394: astore_0
/*    */     //   1395: ifnull -> 1554
/*    */     //   1398: aload_0
/*    */     //   1399: invokevirtual ZF : ()V
/*    */     //   1402: goto -> 1554
/*    */     //   1405: iload_1
/*    */     //   1406: sipush #225
/*    */     //   1409: if_icmpne -> 1422
/*    */     //   1412: aload_0
/*    */     //   1413: getfield K9 : Lf/lpt1;
/*    */     //   1416: invokestatic zv : (Lf/lpt1;)V
/*    */     //   1419: goto -> 1554
/*    */     //   1422: iload_1
/*    */     //   1423: sipush #230
/*    */     //   1426: if_icmpne -> 1467
/*    */     //   1429: aload_0
/*    */     //   1430: getfield K9 : Lf/lpt1;
/*    */     //   1433: ldc_w 'lm4'
/*    */     //   1436: invokevirtual else : (Ljava/lang/String;)Lf/T0;
/*    */     //   1439: dup
/*    */     //   1440: astore_0
/*    */     //   1441: ifnull -> 1554
/*    */     //   1444: aload_0
/*    */     //   1445: new f/qo
/*    */     //   1448: dup
/*    */     //   1449: getstatic f/qo.A80 : J
/*    */     //   1452: getstatic com/badlogic/gdx/graphics/Color.BLACK : Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1455: invokevirtual cpy : ()Lcom/badlogic/gdx/graphics/Color;
/*    */     //   1458: invokespecial <init> : (JLcom/badlogic/gdx/graphics/Color;)V
/*    */     //   1461: invokevirtual Tz0 : (Lf/dj;)V
/*    */     //   1464: goto -> 1554
/*    */     //   1467: iload_1
/*    */     //   1468: sipush #445
/*    */     //   1471: if_icmpne -> 1554
/*    */     //   1474: aload_0
/*    */     //   1475: invokevirtual iJ : ()Lf/lpt1;
/*    */     //   1478: dup
/*    */     //   1479: astore_0
/*    */     //   1480: ifnull -> 1554
/*    */     //   1483: aload_0
/*    */     //   1484: dup
/*    */     //   1485: dup
/*    */     //   1486: dup2
/*    */     //   1487: ldc_w 'back_yuu'
/*    */     //   1490: invokevirtual Gm0 : (Ljava/lang/String;)Lf/zP;
/*    */     //   1493: getfield nH : Lf/eo;
/*    */     //   1496: fconst_1
/*    */     //   1497: fconst_1
/*    */     //   1498: fconst_1
/*    */     //   1499: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1502: pop
/*    */     //   1503: ldc_w 'cloud_yuu'
/*    */     //   1506: invokevirtual Gm0 : (Ljava/lang/String;)Lf/zP;
/*    */     //   1509: getfield nH : Lf/eo;
/*    */     //   1512: fconst_1
/*    */     //   1513: fconst_1
/*    */     //   1514: fconst_1
/*    */     //   1515: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1518: pop
/*    */     //   1519: ldc_w 'back_yoru'
/*    */     //   1522: invokevirtual Gm0 : (Ljava/lang/String;)Lf/zP;
/*    */     //   1525: getfield nH : Lf/eo;
/*    */     //   1528: fconst_1
/*    */     //   1529: fconst_1
/*    */     //   1530: fconst_1
/*    */     //   1531: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1534: pop
/*    */     //   1535: ldc_w 'cloud_yoru'
/*    */     //   1538: invokevirtual Gm0 : (Ljava/lang/String;)Lf/zP;
/*    */     //   1541: getfield nH : Lf/eo;
/*    */     //   1544: fconst_1
/*    */     //   1545: fconst_1
/*    */     //   1546: fconst_1
/*    */     //   1547: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   1550: pop
/*    */     //   1551: invokevirtual o6 : ()V
/*    */     //   1554: return
/*    */     //   1555: invokevirtual printStackTrace : ()V
/*    */     //   1558: return
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*  1 */     //   99	105	1555	java/lang/Exception } public Ah(gb paramgb, LW paramLW) { this.w3 = new eo(); this.od = new eo(); this.W7 = new fQ(false, 16); this.J90 = new fQ(false, 6); this.KQ = new fQ(false, 16); this.a20 = true; this.LW = null; this.lR = null; this.O1 = null; this.wg0 = paramgb; this.aK = paramLW.lc0(); try { VV vV3; Q1 q1 = Q1.tB(paramLW.qq()); paramgb.Lj0(); uz0 uz0; this.F40 = (uz0 = paramgb.lpT5()).ez0(); this.Kj0 = uz0.oA(); if (paramgb.hG0()) { vV3 = VV.transient; } else { vV3 = VV.i60; }  this.QQ = vV3; KB0 kB0 = km.mI0.AN.P().eD(this.F40); eI.DG0(q1.Nt[0], kB0.Ag); kB0.QI0(q1.Nt[0]); int k = this.aK; this.K9 = lpt11; lpt1 lpt11; if (h1.Pm && (lpt11 = km.ln.d1((byte)2).VE0(k, kB0.Db0)) != null) { hC hC = q1.Nt[0]; eI.C90(km.mI0.AN, lpt11, hC, kB0.Db0); }  if (this.K9 == null || !h1.Pm) { boolean bool; eI eI = eI.Lj(); hC hC = q1.Nt[0]; if (this.QQ == VV.transient) { bool = true; } else { bool = false; }  eI.getClass(); this.K9 = eI.T40(hC, kB0, bool); if (km.a40() && h1.Pm) yv
/*  2 */             .info(B40.df("Failed to load cache of ").append(this.K9.Zl0).append(". Using convert instead.").toString());  lpt1 lpt12; if ((lpt12 = this.K9) != null) { hC hC1 = q1.Nt[0]; eI.C90(km.mI0.AN, lpt12, hC1, kB0.Db0); }  }  VV vV1 = this.QQ; this.FI = (km.mI0.AN.P().Sa0(vV1, this.Kj0)).Hc0; f7 f7 = (km.mI0.AN.P().Sa0(vV1, this.Kj0)).ip0; VV vV2 = this.QQ; Wd wd = km.mI0.AN.oB(vV2, this.Kj0); ByteBuffer byteBuffer; (byteBuffer = paramLW.ZJ().l2()).position(paramLW.nG()); int j; byte b; for (j = paramLW.ZJ().l2().getInt(), b = 0; b < j; ) { float f = (byteBuffer.getShort() & 0xFFFF) / 65536.0F; eo1.x = byteBuffer.getShort() + f; f = (byteBuffer.getShort() & 0xFFFF) / 65536.0F; eo1.y = byteBuffer.getShort() + f; f = (byteBuffer.getShort() & 0xFFFF) / 65536.0F; eo eo1; (eo1 = U4).z = -byteBuffer.getShort() - f; byteBuffer.get(); int m = byteBuffer.get() & 0xFF, n = byteBuffer.position(); nd(eo1, (short)((byteBuffer.get() & 0xFF) << 8 | byteBuffer.get() & 0xFF), m, wd, f7); byteBuffer.position(n); b++; }  zP zP; if (this.F40 == 211 && this.Kj0 == 1 && (zP = this.K9.Gm0("polygon3_in02_pc")) != null) zP.ZF();  int i; if ((i = paramgb.Ga) == 28) { this.w3.y += 0.1F; this.a20 = false; if ((i = this.aK) == 635) { this.K9.vC0.Ct(this.K9.vC0.get(0), true); } else if (i == 636) { ((R70)(this.K9.Gm0("polygon25_c3_kanban")).zx0.get(0)).xn.H40.uu(100.0F); ((R70)(this.K9.Gm0("polygon26_c3_kanban")).zx0.get(0)).xn.H40.uu(100.0F); ((R70)(this.K9.Gm0("polygon27_c3_kanban")).zx0.get(0)).xn.H40.uu(100.0F); ((R70)(this.K9.Gm0("polygon19_c3_kanban")).zx0.get(0)).xn.H40.uu(100.0F); this.a20 = false; this.K9.db0("c3_window"); this.K9.Mz("c3_window_1"); }  } else if (i == 33) { this.a20 = false; } else if (i == 249) { this.w3.y = 0.05F; } else if (i >= 30 && i <= 35) { if (i == 35) { this.K9.Mz("h_mado"); } else { this.K9.db0("h_mado"); }  }  return; } catch (Exception exception) { null.printStackTrace(); return; }  } private void eh0(short paramShort, Jo paramJo, int paramInt, sh paramsh) { this.J90.clear(); zk0 zk0; if (paramShort != 0 && (zk0 = paramJo.Ae) != null) ((yF)this.Y1)
/*    */         
/*  4 */         .On = false;  } private void x5(boolean paramBoolean, int paramInt, sh paramsh) { this.LW.rd(0, false, null); this.LW.k = 1.125F; km.pm0.Yt0((byte)2, (short)1300); lpt1 lpt11; if (!paramBoolean && (lpt11 = this.lR) != null) { lpt11.k = 1.25F; lpt11.rd(0, false, null); }  for (Hc0 hc0 = this.J90.r30(); hasNext();) ((lpt1)next())
/*  5 */         .rd(0, false, null);  } static { float[] arrayOfFloat; (arrayOfFloat = new float[2])[0] = -0.05F; (new float[2])[1] = -0.1F; (new float[6][])[0] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.05F; (new float[2])[1] = -0.1F; (new float[6][])[1] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.1F; (new float[2])[1] = 0.0F; (new float[6][])[2] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.05F; (new float[2])[1] = 0.1F; (new float[6][])[3] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = -0.05F; (new float[2])[1] = 0.1F; (new float[6][])[4] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = -0.1F; (new float[2])[1] = 0.0F; DB = new float[][] { null, null, null, null, null, arrayOfFloat }; (arrayOfFloat = new float[2])[0] = -0.05F; (new float[2])[1] = -0.1F; (new float[6][])[0] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.05F; (new float[2])[1] = -0.1F; (new float[6][])[1] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = -0.05F; (new float[2])[1] = 0.0F; (new float[6][])[2] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.05F; (new float[2])[1] = 0.0F; (new float[6][])[3] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = -0.05F; (new float[2])[1] = 0.1F; (new float[6][])[4] = arrayOfFloat; (arrayOfFloat = new float[2])[0] = 0.05F; (new float[2])[1] = 0.1F; ue0 = new float[][] { null, null, null, null, null, arrayOfFloat }; } public static void iF0(p10 paramp10, fQ paramfQ, zP paramzP, eo parameo) { fQ fQ1; if ((fQ1 = paramzP.zx0).Z8 != 0) for (Hc0 hc01 = fQ1.r30(); hc01.hasNext(); ) { R70 r70 = (R70)hc01.next(); float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z; U4.JL(r70.xn.dK).Tz(f1, f2, f3); eo eo1; (eo1 = O9).JL(r70.xn.H40).uu(2.0F); if (Y4.jJ0(paramp10, U4, eo1)) paramfQ.Com3(r70.Zz0);  }   Hc0 hc0 = paramzP.cq.r30(); for (; hc0.hasNext(); iF0(paramp10, paramfQ, (zP)hc0.next(), parameo)); } public static void lpt4(zP paramzP) { fQ fQ1; if ((fQ1 = paramzP.zx0).Z8 != 0) for (Hc0 hc01 = fQ1.r30(); hc01.hasNext(); ) { Eb eb = Mb0; int i = cOM6.xI0, j = cOM6.Dr; Matrix4 matrix4 = paramzP.AS; COM6 cOM6; (cOM6 = ((R70)hc01.next()).xn).u90.getClass(); (cOM6 = ((R70)hc01.next()).xn).u90.kY(eb.Te0(), i, j, matrix4); ((R70)hc01.next()).xn.dK.JL(eb.sD); ((R70)hc01.next()).xn.H40
/*    */           
/*  7 */           .JL(eb.LW)
/*  8 */           .uu(0.5F); ((R70)hc01.next()).xn.XF = ((R70)hc01.next()).xn.H40.Ab0(); }
/*    */        
/* 10 */     Hc0 hc0 = paramzP.cq.r30(); for (; hc0
/* 11 */       .hasNext(); lpt4((zP)hc0.next())); } public final lpt1 nd(eo parameo, int paramInt1, int paramInt2, Wd paramWd, f7 paramf7) { lpt1 lpt11; Mh0 mh0; if ((mh0 = (Mh0)this.FI.Vr0.get(Short.valueOf((short)paramInt1))) == null) { yv.info("Unable to load model: " + paramInt1); return null; }  mh0.DI0(); if (mh0.sD == null) { yv.info("Unable to load model: " + paramInt1); return null; }  if (paramf7.GB0(Integer.valueOf(paramInt1))) { this((lpt1)paramf7.pd0(Integer.valueOf(paramInt1))); (lpt11 = new lpt1()).jx = paramInt1; } else { paramf7.X00(Integer.valueOf(paramInt1), lpt11); (lpt11 = xV(mh0, paramWd)).jx = paramInt1; }  short s2; if (lpt11.lz.Z8 > 0 && ((s2 = mh0.iz) == 1 || s2 == 3)) { if (s2 == 3) { s2 = 1; } else { s2 = 0; }  lpt11.zd0 = s2; lpt11.rd(0, true, null); if (mh0.t90 == 2) lpt11.rd(1, true, null);  }  VV vV; if (this.QQ == (vV = VV.transient) && paramInt1 == 34) { ((Mh0)this.FI.Vr0.get(Short.valueOf((short)98))).DI0(); (this.O1 = xV((Mh0)this.FI.Vr0.get(Short.valueOf((short)98)), paramWd)).Yr0 = false; this.LW = lpt11; }  lpt11.AW = paramInt2; parameo = parameo.uu(0.25F); matrix4.getClass(); float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z; Matrix4 matrix4; (matrix4 = lpt11.mh).g7(f1, f2, f3); if (lpt11.Zl0.startsWith("door_")) { eo2.getClass(); float f5 = parameo.x; f2 = parameo.y; f3 = parameo.z; eo eo2; (eo2 = lpt11.Of.pp0).Tz(f5, f2, f3).ky0(0.15F); eo1.getClass(); float f4 = parameo.x; f2 = parameo.y; f3 = parameo.z; eo eo1; (eo1 = lpt11.Of.s60).Tz(f4, f2, f3).r9(0.15F); if (this.aK == 638) lpt11.mh.g7(0.0F, -0.025F, 0.0F);  } else { eo3.getClass(); float f5 = parameo.x; f2 = parameo.y; f3 = parameo.z; eo eo3; (eo3 = lpt11.Of.pp0).Tz(f5, f2, f3);
/* 12 */       eo2.getClass();
/* 13 */       float f4 = parameo.x; f2 = parameo.y; f3 = parameo.z; eo eo2; (eo2 = lpt11.Of.s60).Tz(f4, f2, f3);
/* 14 */       eo eo1 = lpt11.Of.pp0; lpt11.Of.kX(eo1, lpt11.Of.s60); }  lpt11.Kg0(this.wg0.d8, (byte)2); this.W7.Com3(lpt11); short s1; if ((s1 = mh0.c50) >= 0) { Mh0 mh01; if ((mh01 = (Mh0)this.FI.Vr0.get(Short.valueOf(s1))) == null) return lpt11;  mh01.DI0(); if (mh01.sD != null) { lpt1 lpt12; VV vV1 = null; if (!paramf7.GB0(Integer.valueOf(mh0.c50))) { this(); this.KQ.Com3(iq); Iq iq; (iq = new Iq()).yq(mh01.sD.Nt[0], paramWd);
/*    */ 
/*    */           
/* 17 */           vV1 = this.QQ; int i = this.Kj0, j = mh01.yn0; if (h1.Pm && (lpt12 = km.ln.dh0[2].yd0(vV1, i, j, iq)) != null) { fQ fQ1 = mh01.Fe0; eI.Lj().getClass(); eI.aI(lpt12, paramWd, iq, fQ1); }  if (lpt12 == null) { boolean bool; eI eI = eI.Lj(); hC hC = mh01.sD.Nt[0]; fQ fQ1 = mh01.Fe0; float f = 1.0F; if (this.QQ == vV) { bool = true; } else { bool = false; }  eI.getClass(); lpt12 = eI.Q9(hC, iq, paramWd, fQ1, f, bool, false); }  paramf7.X00(Integer.valueOf(mh0.c50), lpt12); } else { this((lpt1)paramf7.pd0(Integer.valueOf(mh0.c50))); }  matrix41.getClass();
/* 18 */         float f9 = parameo.x, f10 = parameo.y, f11 = parameo.z; Matrix4 matrix41; (matrix41 = lpt12.mh).g7(f9, f10, f11); eo eo5;
/* 19 */         lpt12.mh.g7((eo5 = mh0.wp).x * 0.016F, 0.0F, eo5.z * 0.015F); float f8; if (this.K9.Zl0.equals("map24_18") && (f8 = mh0.wp.z) == 13.0F) lpt12.mh.g7(0.0F, f8 * 0.012F, 0.0F);  eo eo2; lpt12.mh.on0(eo2 = U4); eo4.getClass();
/* 20 */         float f6 = this.x; f10 = this.y; f11 = this.z; eo eo4; (eo4 = lpt12.Of.pp0).Tz(f6, f10, f11);
/* 21 */         eo3.getClass();
/* 22 */         float f4 = this.x, f5 = this.y; f10 = this.z; eo eo3; (eo3 = lpt12.Of.s60).Tz(f4, f5, f10);
/* 23 */         eo eo1 = lpt12.Of.pp0; lpt12.Of.kX(this, lpt12.Of.s60); this.W7.Com3(lpt12); lpt12.jx = mh0.c50; }  }  return lpt11; }
/*    */ 
/*    */   
/*    */   public final lpt1 iJ() {
/*    */     char c = '»';
/*    */     Hc0 hc0 = this.W7.r30();
/*    */     while (hc0.hasNext()) {
/*    */       lpt1 lpt11;
/*    */       if ((lpt11 = (lpt1)hc0.next()).jx == c)
/*    */         return lpt11; 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final lpt1 xV(Mh0 paramMh0, Wd paramWd) {
/*    */     VV vV = null;
/*    */     this();
/*    */     this.KQ.Com3(iq);
/*    */     Iq iq;
/*    */     (iq = new Iq()).yq(paramMh0.sD.Nt[0], paramWd);
/*    */     vV = this.QQ;
/*    */     int i = this.Kj0, j = paramMh0.yn0;
/*    */     lpt1 lpt11;
/*    */     if (h1.Pm && (lpt11 = km.ln.dh0[2].yd0(vV, i, j, iq)) != null && paramMh0.Fe0.Z8 > 0) {
/*    */       fQ fQ1 = paramMh0.Fe0;
/*    */       eI.Lj().getClass();
/*    */       eI.aI(lpt11, paramWd, iq, fQ1);
/*    */     } 
/*    */     if (lpt11 == null) {
/*    */       eI.DG0(paramMh0.sD.Nt[0], paramWd);
/*    */       eI eI = eI.Lj();
/*    */       hC hC = paramMh0.sD.Nt[0];
/*    */       fQ fQ1 = paramMh0.Fe0;
/*    */       float f = this.K9.fv0 / hC.Sw;
/*    */       if (this.QQ == VV.transient) {
/*    */         j = 1;
/*    */       } else {
/*    */         j = 0;
/*    */       } 
/*    */       getClass();
/*    */       lpt11 = eI.Q9(hC, iq, paramWd, fQ1, f, j, false);
/*    */     } 
/*    */     return lpt11;
/*    */   }
/*    */   
/*    */   public final void WQ(int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield LW : Lf/lpt1;
/*    */     //   4: dup
/*    */     //   5: astore_2
/*    */     //   6: ifnull -> 281
/*    */     //   9: aload_0
/*    */     //   10: getfield O1 : Lf/lpt1;
/*    */     //   13: ifnull -> 281
/*    */     //   16: getstatic f/km.a3 : Lf/vh0;
/*    */     //   19: dup
/*    */     //   20: astore_3
/*    */     //   21: ifnull -> 281
/*    */     //   24: aload_3
/*    */     //   25: getfield Ct : Lf/Jo;
/*    */     //   28: ifnonnull -> 34
/*    */     //   31: goto -> 281
/*    */     //   34: aload_2
/*    */     //   35: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   38: getstatic f/Ah.U4 : Lf/eo;
/*    */     //   41: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   44: pop
/*    */     //   45: iconst_0
/*    */     //   46: istore_2
/*    */     //   47: iload_2
/*    */     //   48: iload_1
/*    */     //   49: if_icmpge -> 84
/*    */     //   52: aload_0
/*    */     //   53: dup
/*    */     //   54: getfield O1 : Lf/lpt1;
/*    */     //   57: invokevirtual ro0 : ()Lf/lpt1;
/*    */     //   60: dup
/*    */     //   61: astore_3
/*    */     //   62: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   65: getstatic f/Ah.U4 : Lf/eo;
/*    */     //   68: invokevirtual Ri0 : (Lf/eo;)V
/*    */     //   71: getfield J90 : Lf/fQ;
/*    */     //   74: aload_3
/*    */     //   75: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   78: iinc #2, 1
/*    */     //   81: goto -> 47
/*    */     //   84: aload_0
/*    */     //   85: getfield wg0 : Lf/Ws0;
/*    */     //   88: getfield he0 : Lf/HI;
/*    */     //   91: invokevirtual bO : ()B
/*    */     //   94: iconst_2
/*    */     //   95: if_icmpne -> 103
/*    */     //   98: iconst_1
/*    */     //   99: istore_2
/*    */     //   100: goto -> 105
/*    */     //   103: iconst_0
/*    */     //   104: istore_2
/*    */     //   105: iload_2
/*    */     //   106: ifeq -> 116
/*    */     //   109: getstatic f/Ah.DB : [[F
/*    */     //   112: astore_3
/*    */     //   113: goto -> 120
/*    */     //   116: getstatic f/Ah.ue0 : [[F
/*    */     //   119: astore_3
/*    */     //   120: getstatic f/km.a3 : Lf/vh0;
/*    */     //   123: getfield Ct : Lf/Jo;
/*    */     //   126: dup
/*    */     //   127: astore #4
/*    */     //   129: invokevirtual nX : ()S
/*    */     //   132: dup
/*    */     //   133: istore #5
/*    */     //   135: aload #4
/*    */     //   137: invokevirtual wo : ()B
/*    */     //   140: pop
/*    */     //   141: ifeq -> 167
/*    */     //   144: aload #4
/*    */     //   146: getfield Ae : Lf/zk0;
/*    */     //   149: dup
/*    */     //   150: astore #6
/*    */     //   152: ifnull -> 167
/*    */     //   155: aload #6
/*    */     //   157: getfield Y1 : Lf/static;
/*    */     //   160: checkcast f/yF
/*    */     //   163: iconst_1
/*    */     //   164: putfield On : Z
/*    */     //   167: invokestatic k60 : ()Lf/So;
/*    */     //   170: astore #6
/*    */     //   172: iconst_0
/*    */     //   173: istore #7
/*    */     //   175: iload #7
/*    */     //   177: iload_1
/*    */     //   178: if_icmpge -> 214
/*    */     //   181: aload #6
/*    */     //   183: aload_0
/*    */     //   184: aload_3
/*    */     //   185: aload #6
/*    */     //   187: ldc_w 0.125
/*    */     //   190: invokevirtual Wz0 : (F)Lf/So;
/*    */     //   193: pop
/*    */     //   194: iload #7
/*    */     //   196: <illegal opcode> Do : (Lf/Ah;[[FI)Lf/hk0;
/*    */     //   201: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*    */     //   204: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   207: pop
/*    */     //   208: iinc #7, 1
/*    */     //   211: goto -> 175
/*    */     //   214: iload_2
/*    */     //   215: aload #6
/*    */     //   217: aload_0
/*    */     //   218: iload_2
/*    */     //   219: <illegal opcode> Do : (Lf/Ah;Z)Lf/hk0;
/*    */     //   224: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*    */     //   227: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   230: pop
/*    */     //   231: ifeq -> 241
/*    */     //   234: ldc_w 3.0
/*    */     //   237: fstore_1
/*    */     //   238: goto -> 243
/*    */     //   241: fconst_2
/*    */     //   242: fstore_1
/*    */     //   243: aload #6
/*    */     //   245: dup
/*    */     //   246: aload_0
/*    */     //   247: iload #5
/*    */     //   249: aload #6
/*    */     //   251: fload_1
/*    */     //   252: invokevirtual Wz0 : (F)Lf/So;
/*    */     //   255: pop
/*    */     //   256: aload #4
/*    */     //   258: <illegal opcode> Do : (Lf/Ah;SLf/Jo;)Lf/hk0;
/*    */     //   263: invokestatic OC : (Lf/hk0;)Lf/Wz0;
/*    */     //   266: invokevirtual PL : (Lf/Wz0;)Lf/So;
/*    */     //   269: pop
/*    */     //   270: getstatic f/km.wI0 : Lf/Pw;
/*    */     //   273: getfield pB0 : Lf/G30;
/*    */     //   276: invokevirtual mg : (Lf/G30;)Lf/sh;
/*    */     //   279: pop
/*    */     //   280: return
/*    */     //   281: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 25
/*    */     //   #2	-> 35
/*    */     //   #3	-> 88
/*    */     //   #4	-> 91
/*    */     //   #5	-> 109
/*    */     //   #6	-> 123
/*    */     //   #7	-> 129
/*    */     //   #8	-> 146
/*    */     //   #9	-> 157
/*    */     //   #10	-> 160
/*    */     //   #11	-> 164
/*    */     //   #12	-> 167
/*    */     //   #13	-> 273
/*    */     //   #14	-> 276
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     this.K9.Ea0();
/*    */     Hc0 hc02 = this.W7.r30();
/*    */     while (hc02.hasNext())
/*    */       ((lpt1)hc02.next()).Ea0(); 
/*    */     this.W7.clear();
/*    */     lpt1 lpt11;
/*    */     if ((lpt11 = this.O1) != null)
/*    */       lpt11.Ea0(); 
/*    */     Hc0 hc01 = this.KQ.r30();
/*    */     while (hc01.hasNext())
/*    */       ((Iq)hc01.next()).dispose(); 
/*    */     this.KQ.clear();
/*    */   }
/*    */   
/*    */   public final void pRN(zP paramzP, Ih0 paramIh0) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield zx0 : Lf/fQ;
/*    */     //   4: dup
/*    */     //   5: astore_3
/*    */     //   6: getfield Z8 : I
/*    */     //   9: ifeq -> 405
/*    */     //   12: aload_3
/*    */     //   13: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   16: astore_3
/*    */     //   17: aload_3
/*    */     //   18: invokevirtual hasNext : ()Z
/*    */     //   21: ifeq -> 405
/*    */     //   24: aload_3
/*    */     //   25: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   28: checkcast f/R70
/*    */     //   31: dup
/*    */     //   32: astore #4
/*    */     //   34: getfield xn : Lf/COM6;
/*    */     //   37: dup
/*    */     //   38: aload_2
/*    */     //   39: getfield dR : Lf/ZQ;
/*    */     //   42: astore #5
/*    */     //   44: getfield dK : Lf/eo;
/*    */     //   47: dup
/*    */     //   48: dup
/*    */     //   49: getfield x : F
/*    */     //   52: aload_0
/*    */     //   53: getfield od : Lf/eo;
/*    */     //   56: dup
/*    */     //   57: astore #6
/*    */     //   59: getfield x : F
/*    */     //   62: fadd
/*    */     //   63: fstore #7
/*    */     //   65: getfield y : F
/*    */     //   68: aload #6
/*    */     //   70: getfield y : F
/*    */     //   73: fadd
/*    */     //   74: fstore #8
/*    */     //   76: getfield z : F
/*    */     //   79: aload #6
/*    */     //   81: getfield z : F
/*    */     //   84: fadd
/*    */     //   85: fstore #6
/*    */     //   87: getfield H40 : Lf/eo;
/*    */     //   90: aload #5
/*    */     //   92: swap
/*    */     //   93: dup
/*    */     //   94: dup
/*    */     //   95: getfield x : F
/*    */     //   98: fstore #9
/*    */     //   100: getfield y : F
/*    */     //   103: fstore #10
/*    */     //   105: getfield z : F
/*    */     //   108: fstore #11
/*    */     //   110: iconst_0
/*    */     //   111: istore #12
/*    */     //   113: getfield LF : [Lf/Q0;
/*    */     //   116: arraylength
/*    */     //   117: istore #13
/*    */     //   119: iload #12
/*    */     //   121: iload #13
/*    */     //   123: if_icmpge -> 379
/*    */     //   126: aload #5
/*    */     //   128: getfield LF : [Lf/Q0;
/*    */     //   131: iload #12
/*    */     //   133: aaload
/*    */     //   134: fload #6
/*    */     //   136: fload #11
/*    */     //   138: fload #8
/*    */     //   140: fload #10
/*    */     //   142: fload #7
/*    */     //   144: fload #9
/*    */     //   146: fadd
/*    */     //   147: fstore #14
/*    */     //   149: fadd
/*    */     //   150: fstore #15
/*    */     //   152: fadd
/*    */     //   153: fstore #16
/*    */     //   155: fload #14
/*    */     //   157: fload #15
/*    */     //   159: fload #16
/*    */     //   161: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   164: getstatic f/Ov.RJ : Lf/Ov;
/*    */     //   167: dup
/*    */     //   168: astore #17
/*    */     //   170: if_acmpeq -> 176
/*    */     //   173: goto -> 367
/*    */     //   176: aload #5
/*    */     //   178: getfield LF : [Lf/Q0;
/*    */     //   181: iload #12
/*    */     //   183: aaload
/*    */     //   184: fload #14
/*    */     //   186: fload #6
/*    */     //   188: fload #11
/*    */     //   190: fsub
/*    */     //   191: fstore #18
/*    */     //   193: fload #15
/*    */     //   195: fload #18
/*    */     //   197: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   200: aload #17
/*    */     //   202: if_acmpeq -> 208
/*    */     //   205: goto -> 367
/*    */     //   208: aload #5
/*    */     //   210: getfield LF : [Lf/Q0;
/*    */     //   213: iload #12
/*    */     //   215: aaload
/*    */     //   216: fload #14
/*    */     //   218: fload #8
/*    */     //   220: fload #10
/*    */     //   222: fsub
/*    */     //   223: dup
/*    */     //   224: fstore #19
/*    */     //   226: fload #16
/*    */     //   228: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   231: aload #17
/*    */     //   233: if_acmpeq -> 239
/*    */     //   236: goto -> 367
/*    */     //   239: aload #5
/*    */     //   241: getfield LF : [Lf/Q0;
/*    */     //   244: iload #12
/*    */     //   246: aaload
/*    */     //   247: fload #14
/*    */     //   249: fload #19
/*    */     //   251: fload #18
/*    */     //   253: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   256: aload #17
/*    */     //   258: if_acmpeq -> 264
/*    */     //   261: goto -> 367
/*    */     //   264: aload #5
/*    */     //   266: getfield LF : [Lf/Q0;
/*    */     //   269: iload #12
/*    */     //   271: aaload
/*    */     //   272: fload #7
/*    */     //   274: fload #9
/*    */     //   276: fsub
/*    */     //   277: dup
/*    */     //   278: fstore #14
/*    */     //   280: fload #15
/*    */     //   282: fload #16
/*    */     //   284: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   287: aload #17
/*    */     //   289: if_acmpeq -> 295
/*    */     //   292: goto -> 367
/*    */     //   295: aload #5
/*    */     //   297: getfield LF : [Lf/Q0;
/*    */     //   300: iload #12
/*    */     //   302: aaload
/*    */     //   303: fload #14
/*    */     //   305: fload #15
/*    */     //   307: fload #18
/*    */     //   309: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   312: aload #17
/*    */     //   314: if_acmpeq -> 320
/*    */     //   317: goto -> 367
/*    */     //   320: aload #5
/*    */     //   322: getfield LF : [Lf/Q0;
/*    */     //   325: iload #12
/*    */     //   327: aaload
/*    */     //   328: fload #14
/*    */     //   330: fload #19
/*    */     //   332: fload #16
/*    */     //   334: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   337: aload #17
/*    */     //   339: if_acmpeq -> 345
/*    */     //   342: goto -> 367
/*    */     //   345: aload #5
/*    */     //   347: getfield LF : [Lf/Q0;
/*    */     //   350: iload #12
/*    */     //   352: aaload
/*    */     //   353: fload #14
/*    */     //   355: fload #19
/*    */     //   357: fload #18
/*    */     //   359: invokevirtual K1 : (FFF)Lf/Ov;
/*    */     //   362: aload #17
/*    */     //   364: if_acmpeq -> 373
/*    */     //   367: iinc #12, 1
/*    */     //   370: goto -> 119
/*    */     //   373: iconst_0
/*    */     //   374: istore #5
/*    */     //   376: goto -> 382
/*    */     //   379: iconst_1
/*    */     //   380: istore #5
/*    */     //   382: iload #5
/*    */     //   384: ifeq -> 396
/*    */     //   387: aload #4
/*    */     //   389: iconst_1
/*    */     //   390: putfield cF : Z
/*    */     //   393: goto -> 17
/*    */     //   396: aload #4
/*    */     //   398: iconst_0
/*    */     //   399: putfield cF : Z
/*    */     //   402: goto -> 17
/*    */     //   405: aload_1
/*    */     //   406: getfield cq : Lf/fQ;
/*    */     //   409: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   412: astore_1
/*    */     //   413: aload_1
/*    */     //   414: invokevirtual hasNext : ()Z
/*    */     //   417: ifeq -> 435
/*    */     //   420: aload_0
/*    */     //   421: aload_1
/*    */     //   422: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   425: checkcast f/zP
/*    */     //   428: aload_2
/*    */     //   429: invokevirtual pRN : (Lf/zP;Lf/Ih0;)V
/*    */     //   432: goto -> 413
/*    */     //   435: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 113
/*    */     //   #2	-> 116
/*    */     //   #3	-> 390
/*    */     //   #4	-> 406
/*    */     //   #5	-> 409
/*    */     //   #6	-> 414
/*    */   }
/*    */   
/*    */   public final void hj0() {
/*    */     this.K9.mh.Ri0(this.w3);
/*    */     this.K9.Of.pp0.zT(this.w3);
/*    */     this.K9.Of.s60.zT(this.w3);
/*    */     eo eo1 = this.K9.Of.pp0;
/*    */     this.K9.Of.kX(eo1, this.K9.Of.s60);
/*    */     this.K9.o6();
/*    */     this.K9.mh.on0(this.od);
/*    */     fQ fQ1;
/*    */     if ((fQ1 = this.K9.vC0).Z8 == 1)
/*    */       lpt4((zP)fQ1.get(0)); 
/*    */     for (Hc0 hc0 = this.W7.r30(); hc0.hasNext(); ) {
/*    */       eo eo2;
/*    */       this();
/*    */       lpt1 lpt11;
/*    */       (lpt11 = (lpt1)hc0.next()).mh.on0(eo2);
/*    */       ((lpt1)hc0.next()).mh.Ri0(this.w3);
/*    */       ((lpt1)hc0.next()).mh.N8(eo.Y, lpt11.AW / 64.0F * 90.0F);
/*    */       ((lpt1)hc0.next()).C50();
/*    */       if (this.wg0.he0.bO() == 3 || this.wg0.he0.bO() == 4)
/*    */         this.K9.Of.fY(lpt11.Of); 
/*    */     } 
/*    */     this.w3.TG0(0.0F, 0.0F, 0.0F);
/*    */   }
/*    */   
/*    */   public final void ej0(lw paramlw) {
/*    */     this.K9.Vv0(paramlw, true);
/*    */     Hc0 hc0 = this.W7.r30();
/*    */     while (hasNext())
/*    */       ((lpt1)next()).Vv0(paramlw, true); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */