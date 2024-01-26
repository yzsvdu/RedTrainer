/* 1 */ package f;public final class bM0 implements Iterable { public nc eR; public String U8; public double v3; public long yi0; public String as0; public bM0 Rr0; public bM0 UC; public bM0 H7; public bM0 Go0; public int LG; public final bM0 Cp(String paramString) { if ((this = Jb(paramString)) != null) return this;  throw new IllegalArgumentException(m0.tF0("Child not found with name: ", paramString)); } public bM0(nc paramnc) { this.eR = paramnc; } public bM0(String paramString) { Sy0(paramString); } public bM0(double paramDouble) { Kd(paramDouble, null); } public bM0(long paramLong) { SD0(paramLong, null); } public bM0(double paramDouble, String paramString) { Kd(paramDouble, paramString); } public bM0(long paramLong, String paramString) { SD0(paramLong, paramString); } public bM0(boolean paramBoolean) { MF(paramBoolean); } public static void zu0(bM0 parambM0, Ag paramAg, int paramInt, COM3 paramCOM3) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: aload_3
/*   */     //   2: getfield gn0 : Lf/BB;
/*   */     //   5: astore #4
/*   */     //   7: getfield eR : Lf/nc;
/*   */     //   10: getstatic f/nc.Gg0 : Lf/nc;
/*   */     //   13: if_acmpne -> 22
/*   */     //   16: iconst_1
/*   */     //   17: istore #5
/*   */     //   19: goto -> 25
/*   */     //   22: iconst_0
/*   */     //   23: istore #5
/*   */     //   25: iload #5
/*   */     //   27: ifeq -> 382
/*   */     //   30: aload_0
/*   */     //   31: getfield Rr0 : Lf/bM0;
/*   */     //   34: dup
/*   */     //   35: astore #5
/*   */     //   37: ifnonnull -> 46
/*   */     //   40: ldc '{}'
/*   */     //   42: astore_0
/*   */     //   43: goto -> 1491
/*   */     //   46: aload #5
/*   */     //   48: ifnull -> 97
/*   */     //   51: aload #5
/*   */     //   53: getfield eR : Lf/nc;
/*   */     //   56: getstatic f/nc.Gg0 : Lf/nc;
/*   */     //   59: if_acmpne -> 66
/*   */     //   62: iconst_1
/*   */     //   63: goto -> 67
/*   */     //   66: iconst_0
/*   */     //   67: ifne -> 91
/*   */     //   70: aload #5
/*   */     //   72: invokevirtual OA0 : ()Z
/*   */     //   75: ifeq -> 81
/*   */     //   78: goto -> 91
/*   */     //   81: aload #5
/*   */     //   83: getfield H7 : Lf/bM0;
/*   */     //   86: astore #5
/*   */     //   88: goto -> 46
/*   */     //   91: iconst_0
/*   */     //   92: istore #5
/*   */     //   94: goto -> 100
/*   */     //   97: iconst_1
/*   */     //   98: istore #5
/*   */     //   100: aload_1
/*   */     //   101: iload #5
/*   */     //   103: iconst_1
/*   */     //   104: ixor
/*   */     //   105: istore #5
/*   */     //   107: getfield Td0 : I
/*   */     //   110: istore #6
/*   */     //   112: iload #5
/*   */     //   114: ifeq -> 124
/*   */     //   117: ldc '{\\n'
/*   */     //   119: astore #7
/*   */     //   121: goto -> 128
/*   */     //   124: ldc '{ '
/*   */     //   126: astore #7
/*   */     //   128: aload_0
/*   */     //   129: aload_1
/*   */     //   130: aload #7
/*   */     //   132: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   135: getfield Rr0 : Lf/bM0;
/*   */     //   138: astore #7
/*   */     //   140: aload #7
/*   */     //   142: ifnull -> 348
/*   */     //   145: iload #5
/*   */     //   147: ifeq -> 171
/*   */     //   150: iconst_0
/*   */     //   151: istore #8
/*   */     //   153: iload #8
/*   */     //   155: iload_2
/*   */     //   156: if_icmpge -> 171
/*   */     //   159: aload_1
/*   */     //   160: bipush #9
/*   */     //   162: invokevirtual yd0 : (C)V
/*   */     //   165: iinc #8, 1
/*   */     //   168: goto -> 153
/*   */     //   171: iload #5
/*   */     //   173: aload #7
/*   */     //   175: aload_1
/*   */     //   176: iload_2
/*   */     //   177: aload_1
/*   */     //   178: dup
/*   */     //   179: aload #4
/*   */     //   181: aload #7
/*   */     //   183: getfield as0 : Ljava/lang/String;
/*   */     //   186: invokevirtual ve : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   189: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   192: ldc ': '
/*   */     //   194: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   197: iconst_1
/*   */     //   198: iadd
/*   */     //   199: aload_3
/*   */     //   200: invokestatic zu0 : (Lf/bM0;Lf/Ag;ILf/COM3;)V
/*   */     //   203: ifeq -> 214
/*   */     //   206: aload #4
/*   */     //   208: getstatic f/BB.NH0 : Lf/BB;
/*   */     //   211: if_acmpeq -> 228
/*   */     //   214: aload #7
/*   */     //   216: getfield H7 : Lf/bM0;
/*   */     //   219: ifnull -> 228
/*   */     //   222: aload_1
/*   */     //   223: bipush #44
/*   */     //   225: invokevirtual yd0 : (C)V
/*   */     //   228: iload #5
/*   */     //   230: ifeq -> 240
/*   */     //   233: bipush #10
/*   */     //   235: istore #8
/*   */     //   237: goto -> 244
/*   */     //   240: bipush #32
/*   */     //   242: istore #8
/*   */     //   244: iload #5
/*   */     //   246: aload_1
/*   */     //   247: iload #8
/*   */     //   249: invokevirtual yd0 : (C)V
/*   */     //   252: ifne -> 338
/*   */     //   255: aload_1
/*   */     //   256: getfield Td0 : I
/*   */     //   259: dup
/*   */     //   260: istore #8
/*   */     //   262: iload #6
/*   */     //   264: isub
/*   */     //   265: aload_3
/*   */     //   266: getfield JU : I
/*   */     //   269: if_icmple -> 338
/*   */     //   272: iload #6
/*   */     //   274: iflt -> 328
/*   */     //   277: iload #6
/*   */     //   279: aload_1
/*   */     //   280: getfield bF0 : [C
/*   */     //   283: dup
/*   */     //   284: astore #5
/*   */     //   286: arraylength
/*   */     //   287: if_icmple -> 299
/*   */     //   290: aload_1
/*   */     //   291: iload #6
/*   */     //   293: invokevirtual LpT8 : (I)V
/*   */     //   296: goto -> 316
/*   */     //   299: iload #8
/*   */     //   301: iload #6
/*   */     //   303: if_icmpge -> 316
/*   */     //   306: aload #5
/*   */     //   308: iload #8
/*   */     //   310: iload #6
/*   */     //   312: iconst_0
/*   */     //   313: invokestatic fill : ([CIIC)V
/*   */     //   316: aload_1
/*   */     //   317: iload #6
/*   */     //   319: putfield Td0 : I
/*   */     //   322: iconst_1
/*   */     //   323: istore #5
/*   */     //   325: goto -> 112
/*   */     //   328: new java/lang/StringIndexOutOfBoundsException
/*   */     //   331: dup
/*   */     //   332: iload #6
/*   */     //   334: invokespecial <init> : (I)V
/*   */     //   337: athrow
/*   */     //   338: aload #7
/*   */     //   340: getfield H7 : Lf/bM0;
/*   */     //   343: astore #7
/*   */     //   345: goto -> 140
/*   */     //   348: iload #5
/*   */     //   350: ifeq -> 376
/*   */     //   353: iload_2
/*   */     //   354: iconst_1
/*   */     //   355: isub
/*   */     //   356: istore_0
/*   */     //   357: iconst_0
/*   */     //   358: istore_2
/*   */     //   359: iload_2
/*   */     //   360: iload_0
/*   */     //   361: if_icmpge -> 376
/*   */     //   364: aload_1
/*   */     //   365: bipush #9
/*   */     //   367: invokevirtual yd0 : (C)V
/*   */     //   370: iinc #2, 1
/*   */     //   373: goto -> 359
/*   */     //   376: bipush #125
/*   */     //   378: istore_0
/*   */     //   379: goto -> 799
/*   */     //   382: aload_0
/*   */     //   383: invokevirtual OA0 : ()Z
/*   */     //   386: ifeq -> 807
/*   */     //   389: aload_0
/*   */     //   390: getfield Rr0 : Lf/bM0;
/*   */     //   393: dup
/*   */     //   394: astore #5
/*   */     //   396: ifnonnull -> 405
/*   */     //   399: ldc '[]'
/*   */     //   401: astore_0
/*   */     //   402: goto -> 1491
/*   */     //   405: aload #5
/*   */     //   407: ifnull -> 456
/*   */     //   410: aload #5
/*   */     //   412: getfield eR : Lf/nc;
/*   */     //   415: getstatic f/nc.Gg0 : Lf/nc;
/*   */     //   418: if_acmpne -> 425
/*   */     //   421: iconst_1
/*   */     //   422: goto -> 426
/*   */     //   425: iconst_0
/*   */     //   426: ifne -> 450
/*   */     //   429: aload #5
/*   */     //   431: invokevirtual OA0 : ()Z
/*   */     //   434: ifeq -> 440
/*   */     //   437: goto -> 450
/*   */     //   440: aload #5
/*   */     //   442: getfield H7 : Lf/bM0;
/*   */     //   445: astore #5
/*   */     //   447: goto -> 405
/*   */     //   450: iconst_0
/*   */     //   451: istore #5
/*   */     //   453: goto -> 459
/*   */     //   456: iconst_1
/*   */     //   457: istore #5
/*   */     //   459: aload_0
/*   */     //   460: iload #5
/*   */     //   462: iconst_1
/*   */     //   463: ixor
/*   */     //   464: istore #5
/*   */     //   466: getfield Rr0 : Lf/bM0;
/*   */     //   469: astore #6
/*   */     //   471: aload #6
/*   */     //   473: ifnull -> 531
/*   */     //   476: aload #6
/*   */     //   478: getfield eR : Lf/nc;
/*   */     //   481: dup
/*   */     //   482: astore #7
/*   */     //   484: getstatic f/nc.zK0 : Lf/nc;
/*   */     //   487: if_acmpeq -> 507
/*   */     //   490: aload #7
/*   */     //   492: getstatic f/nc.ci0 : Lf/nc;
/*   */     //   495: if_acmpne -> 501
/*   */     //   498: goto -> 507
/*   */     //   501: iconst_0
/*   */     //   502: istore #7
/*   */     //   504: goto -> 510
/*   */     //   507: iconst_1
/*   */     //   508: istore #7
/*   */     //   510: iload #7
/*   */     //   512: ifne -> 521
/*   */     //   515: iconst_0
/*   */     //   516: istore #6
/*   */     //   518: goto -> 534
/*   */     //   521: aload #6
/*   */     //   523: getfield H7 : Lf/bM0;
/*   */     //   526: astore #6
/*   */     //   528: goto -> 471
/*   */     //   531: iconst_1
/*   */     //   532: istore #6
/*   */     //   534: aload_1
/*   */     //   535: iload #6
/*   */     //   537: iconst_1
/*   */     //   538: ixor
/*   */     //   539: istore #6
/*   */     //   541: getfield Td0 : I
/*   */     //   544: istore #7
/*   */     //   546: iload #5
/*   */     //   548: ifeq -> 558
/*   */     //   551: ldc '[\\n'
/*   */     //   553: astore #8
/*   */     //   555: goto -> 562
/*   */     //   558: ldc '[ '
/*   */     //   560: astore #8
/*   */     //   562: aload_0
/*   */     //   563: aload_1
/*   */     //   564: aload #8
/*   */     //   566: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   569: getfield Rr0 : Lf/bM0;
/*   */     //   572: astore #8
/*   */     //   574: aload #8
/*   */     //   576: ifnull -> 768
/*   */     //   579: iload #5
/*   */     //   581: ifeq -> 605
/*   */     //   584: iconst_0
/*   */     //   585: istore #9
/*   */     //   587: iload #9
/*   */     //   589: iload_2
/*   */     //   590: if_icmpge -> 605
/*   */     //   593: aload_1
/*   */     //   594: bipush #9
/*   */     //   596: invokevirtual yd0 : (C)V
/*   */     //   599: iinc #9, 1
/*   */     //   602: goto -> 587
/*   */     //   605: iload #5
/*   */     //   607: aload #8
/*   */     //   609: iload_2
/*   */     //   610: iconst_1
/*   */     //   611: iadd
/*   */     //   612: aload_1
/*   */     //   613: swap
/*   */     //   614: aload_3
/*   */     //   615: invokestatic zu0 : (Lf/bM0;Lf/Ag;ILf/COM3;)V
/*   */     //   618: ifeq -> 629
/*   */     //   621: aload #4
/*   */     //   623: getstatic f/BB.NH0 : Lf/BB;
/*   */     //   626: if_acmpeq -> 643
/*   */     //   629: aload #8
/*   */     //   631: getfield H7 : Lf/bM0;
/*   */     //   634: ifnull -> 643
/*   */     //   637: aload_1
/*   */     //   638: bipush #44
/*   */     //   640: invokevirtual yd0 : (C)V
/*   */     //   643: iload #5
/*   */     //   645: ifeq -> 655
/*   */     //   648: bipush #10
/*   */     //   650: istore #9
/*   */     //   652: goto -> 659
/*   */     //   655: bipush #32
/*   */     //   657: istore #9
/*   */     //   659: iload #6
/*   */     //   661: aload_1
/*   */     //   662: iload #9
/*   */     //   664: invokevirtual yd0 : (C)V
/*   */     //   667: ifeq -> 758
/*   */     //   670: iload #5
/*   */     //   672: ifne -> 758
/*   */     //   675: aload_1
/*   */     //   676: getfield Td0 : I
/*   */     //   679: dup
/*   */     //   680: istore #9
/*   */     //   682: iload #7
/*   */     //   684: isub
/*   */     //   685: aload_3
/*   */     //   686: getfield JU : I
/*   */     //   689: if_icmple -> 758
/*   */     //   692: iload #7
/*   */     //   694: iflt -> 748
/*   */     //   697: iload #7
/*   */     //   699: aload_1
/*   */     //   700: getfield bF0 : [C
/*   */     //   703: dup
/*   */     //   704: astore #5
/*   */     //   706: arraylength
/*   */     //   707: if_icmple -> 719
/*   */     //   710: aload_1
/*   */     //   711: iload #7
/*   */     //   713: invokevirtual LpT8 : (I)V
/*   */     //   716: goto -> 736
/*   */     //   719: iload #9
/*   */     //   721: iload #7
/*   */     //   723: if_icmpge -> 736
/*   */     //   726: aload #5
/*   */     //   728: iload #9
/*   */     //   730: iload #7
/*   */     //   732: iconst_0
/*   */     //   733: invokestatic fill : ([CIIC)V
/*   */     //   736: aload_1
/*   */     //   737: iload #7
/*   */     //   739: putfield Td0 : I
/*   */     //   742: iconst_1
/*   */     //   743: istore #5
/*   */     //   745: goto -> 546
/*   */     //   748: new java/lang/StringIndexOutOfBoundsException
/*   */     //   751: dup
/*   */     //   752: iload #7
/*   */     //   754: invokespecial <init> : (I)V
/*   */     //   757: athrow
/*   */     //   758: aload #8
/*   */     //   760: getfield H7 : Lf/bM0;
/*   */     //   763: astore #8
/*   */     //   765: goto -> 574
/*   */     //   768: iload #5
/*   */     //   770: ifeq -> 796
/*   */     //   773: iload_2
/*   */     //   774: iconst_1
/*   */     //   775: isub
/*   */     //   776: istore_0
/*   */     //   777: iconst_0
/*   */     //   778: istore_2
/*   */     //   779: iload_2
/*   */     //   780: iload_0
/*   */     //   781: if_icmpge -> 796
/*   */     //   784: aload_1
/*   */     //   785: bipush #9
/*   */     //   787: invokevirtual yd0 : (C)V
/*   */     //   790: iinc #2, 1
/*   */     //   793: goto -> 779
/*   */     //   796: bipush #93
/*   */     //   798: istore_0
/*   */     //   799: aload_1
/*   */     //   800: iload_0
/*   */     //   801: invokevirtual yd0 : (C)V
/*   */     //   804: goto -> 1496
/*   */     //   807: aload_0
/*   */     //   808: getfield eR : Lf/nc;
/*   */     //   811: dup
/*   */     //   812: astore_2
/*   */     //   813: getstatic f/nc.O80 : Lf/nc;
/*   */     //   816: if_acmpne -> 824
/*   */     //   819: iconst_1
/*   */     //   820: istore_3
/*   */     //   821: goto -> 826
/*   */     //   824: iconst_0
/*   */     //   825: istore_3
/*   */     //   826: iload_3
/*   */     //   827: ifeq -> 843
/*   */     //   830: aload #4
/*   */     //   832: aload_0
/*   */     //   833: invokevirtual DX : ()Ljava/lang/String;
/*   */     //   836: invokevirtual kW : (Ljava/lang/Object;)Ljava/lang/String;
/*   */     //   839: astore_0
/*   */     //   840: goto -> 1491
/*   */     //   843: aload_2
/*   */     //   844: getstatic f/nc.zK0 : Lf/nc;
/*   */     //   847: if_acmpne -> 854
/*   */     //   850: iconst_1
/*   */     //   851: goto -> 855
/*   */     //   854: iconst_0
/*   */     //   855: ifeq -> 890
/*   */     //   858: aload_0
/*   */     //   859: invokevirtual cQ : ()D
/*   */     //   862: dup2
/*   */     //   863: dstore_2
/*   */     //   864: aload_0
/*   */     //   865: invokevirtual YO : ()J
/*   */     //   868: l2d
/*   */     //   869: dup2
/*   */     //   870: dstore #4
/*   */     //   872: dcmpl
/*   */     //   873: ifne -> 879
/*   */     //   876: dload #4
/*   */     //   878: dstore_2
/*   */     //   879: aload_1
/*   */     //   880: dload_2
/*   */     //   881: invokestatic toString : (D)Ljava/lang/String;
/*   */     //   884: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   887: goto -> 1496
/*   */     //   890: aload_2
/*   */     //   891: getstatic f/nc.ci0 : Lf/nc;
/*   */     //   894: if_acmpne -> 901
/*   */     //   897: iconst_1
/*   */     //   898: goto -> 902
/*   */     //   901: iconst_0
/*   */     //   902: ifeq -> 1428
/*   */     //   905: aload_0
/*   */     //   906: invokevirtual YO : ()J
/*   */     //   909: dup2
/*   */     //   910: lstore_2
/*   */     //   911: ldc2_w -9223372036854775808
/*   */     //   914: lcmp
/*   */     //   915: ifne -> 927
/*   */     //   918: aload_1
/*   */     //   919: ldc '-9223372036854775808'
/*   */     //   921: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   924: goto -> 1496
/*   */     //   927: lload_2
/*   */     //   928: lconst_0
/*   */     //   929: lcmp
/*   */     //   930: ifge -> 942
/*   */     //   933: lload_2
/*   */     //   934: aload_1
/*   */     //   935: bipush #45
/*   */     //   937: invokevirtual yd0 : (C)V
/*   */     //   940: lneg
/*   */     //   941: lstore_2
/*   */     //   942: lload_2
/*   */     //   943: ldc2_w 10000
/*   */     //   946: lcmp
/*   */     //   947: iflt -> 1333
/*   */     //   950: lload_2
/*   */     //   951: ldc2_w 1000000000000000000
/*   */     //   954: lcmp
/*   */     //   955: iflt -> 977
/*   */     //   958: aload_1
/*   */     //   959: getstatic f/Ag.EZ : [C
/*   */     //   962: lload_2
/*   */     //   963: l2d
/*   */     //   964: ldc2_w 1.0E19
/*   */     //   967: drem
/*   */     //   968: ldc2_w 1.0E18
/*   */     //   971: ddiv
/*   */     //   972: d2i
/*   */     //   973: caload
/*   */     //   974: invokevirtual yd0 : (C)V
/*   */     //   977: lload_2
/*   */     //   978: ldc2_w 100000000000000000
/*   */     //   981: lcmp
/*   */     //   982: iflt -> 1003
/*   */     //   985: aload_1
/*   */     //   986: getstatic f/Ag.EZ : [C
/*   */     //   989: lload_2
/*   */     //   990: ldc2_w 1000000000000000000
/*   */     //   993: lrem
/*   */     //   994: ldc2_w 100000000000000000
/*   */     //   997: ldiv
/*   */     //   998: l2i
/*   */     //   999: caload
/*   */     //   1000: invokevirtual yd0 : (C)V
/*   */     //   1003: lload_2
/*   */     //   1004: ldc2_w 10000000000000000
/*   */     //   1007: lcmp
/*   */     //   1008: iflt -> 1029
/*   */     //   1011: aload_1
/*   */     //   1012: getstatic f/Ag.EZ : [C
/*   */     //   1015: lload_2
/*   */     //   1016: ldc2_w 100000000000000000
/*   */     //   1019: lrem
/*   */     //   1020: ldc2_w 10000000000000000
/*   */     //   1023: ldiv
/*   */     //   1024: l2i
/*   */     //   1025: caload
/*   */     //   1026: invokevirtual yd0 : (C)V
/*   */     //   1029: lload_2
/*   */     //   1030: ldc2_w 1000000000000000
/*   */     //   1033: lcmp
/*   */     //   1034: iflt -> 1055
/*   */     //   1037: aload_1
/*   */     //   1038: getstatic f/Ag.EZ : [C
/*   */     //   1041: lload_2
/*   */     //   1042: ldc2_w 10000000000000000
/*   */     //   1045: lrem
/*   */     //   1046: ldc2_w 1000000000000000
/*   */     //   1049: ldiv
/*   */     //   1050: l2i
/*   */     //   1051: caload
/*   */     //   1052: invokevirtual yd0 : (C)V
/*   */     //   1055: lload_2
/*   */     //   1056: ldc2_w 100000000000000
/*   */     //   1059: lcmp
/*   */     //   1060: iflt -> 1081
/*   */     //   1063: aload_1
/*   */     //   1064: getstatic f/Ag.EZ : [C
/*   */     //   1067: lload_2
/*   */     //   1068: ldc2_w 1000000000000000
/*   */     //   1071: lrem
/*   */     //   1072: ldc2_w 100000000000000
/*   */     //   1075: ldiv
/*   */     //   1076: l2i
/*   */     //   1077: caload
/*   */     //   1078: invokevirtual yd0 : (C)V
/*   */     //   1081: lload_2
/*   */     //   1082: ldc2_w 10000000000000
/*   */     //   1085: lcmp
/*   */     //   1086: iflt -> 1107
/*   */     //   1089: aload_1
/*   */     //   1090: getstatic f/Ag.EZ : [C
/*   */     //   1093: lload_2
/*   */     //   1094: ldc2_w 100000000000000
/*   */     //   1097: lrem
/*   */     //   1098: ldc2_w 10000000000000
/*   */     //   1101: ldiv
/*   */     //   1102: l2i
/*   */     //   1103: caload
/*   */     //   1104: invokevirtual yd0 : (C)V
/*   */     //   1107: lload_2
/*   */     //   1108: ldc2_w 1000000000000
/*   */     //   1111: lcmp
/*   */     //   1112: iflt -> 1133
/*   */     //   1115: aload_1
/*   */     //   1116: getstatic f/Ag.EZ : [C
/*   */     //   1119: lload_2
/*   */     //   1120: ldc2_w 10000000000000
/*   */     //   1123: lrem
/*   */     //   1124: ldc2_w 1000000000000
/*   */     //   1127: ldiv
/*   */     //   1128: l2i
/*   */     //   1129: caload
/*   */     //   1130: invokevirtual yd0 : (C)V
/*   */     //   1133: lload_2
/*   */     //   1134: ldc2_w 100000000000
/*   */     //   1137: lcmp
/*   */     //   1138: iflt -> 1159
/*   */     //   1141: aload_1
/*   */     //   1142: getstatic f/Ag.EZ : [C
/*   */     //   1145: lload_2
/*   */     //   1146: ldc2_w 1000000000000
/*   */     //   1149: lrem
/*   */     //   1150: ldc2_w 100000000000
/*   */     //   1153: ldiv
/*   */     //   1154: l2i
/*   */     //   1155: caload
/*   */     //   1156: invokevirtual yd0 : (C)V
/*   */     //   1159: lload_2
/*   */     //   1160: ldc2_w 10000000000
/*   */     //   1163: lcmp
/*   */     //   1164: iflt -> 1185
/*   */     //   1167: aload_1
/*   */     //   1168: getstatic f/Ag.EZ : [C
/*   */     //   1171: lload_2
/*   */     //   1172: ldc2_w 100000000000
/*   */     //   1175: lrem
/*   */     //   1176: ldc2_w 10000000000
/*   */     //   1179: ldiv
/*   */     //   1180: l2i
/*   */     //   1181: caload
/*   */     //   1182: invokevirtual yd0 : (C)V
/*   */     //   1185: lload_2
/*   */     //   1186: ldc2_w 1000000000
/*   */     //   1189: lcmp
/*   */     //   1190: iflt -> 1211
/*   */     //   1193: aload_1
/*   */     //   1194: getstatic f/Ag.EZ : [C
/*   */     //   1197: lload_2
/*   */     //   1198: ldc2_w 10000000000
/*   */     //   1201: lrem
/*   */     //   1202: ldc2_w 1000000000
/*   */     //   1205: ldiv
/*   */     //   1206: l2i
/*   */     //   1207: caload
/*   */     //   1208: invokevirtual yd0 : (C)V
/*   */     //   1211: lload_2
/*   */     //   1212: ldc2_w 100000000
/*   */     //   1215: lcmp
/*   */     //   1216: iflt -> 1237
/*   */     //   1219: aload_1
/*   */     //   1220: getstatic f/Ag.EZ : [C
/*   */     //   1223: lload_2
/*   */     //   1224: ldc2_w 1000000000
/*   */     //   1227: lrem
/*   */     //   1228: ldc2_w 100000000
/*   */     //   1231: ldiv
/*   */     //   1232: l2i
/*   */     //   1233: caload
/*   */     //   1234: invokevirtual yd0 : (C)V
/*   */     //   1237: lload_2
/*   */     //   1238: ldc2_w 10000000
/*   */     //   1241: lcmp
/*   */     //   1242: iflt -> 1263
/*   */     //   1245: aload_1
/*   */     //   1246: getstatic f/Ag.EZ : [C
/*   */     //   1249: lload_2
/*   */     //   1250: ldc2_w 100000000
/*   */     //   1253: lrem
/*   */     //   1254: ldc2_w 10000000
/*   */     //   1257: ldiv
/*   */     //   1258: l2i
/*   */     //   1259: caload
/*   */     //   1260: invokevirtual yd0 : (C)V
/*   */     //   1263: lload_2
/*   */     //   1264: ldc2_w 1000000
/*   */     //   1267: lcmp
/*   */     //   1268: iflt -> 1289
/*   */     //   1271: aload_1
/*   */     //   1272: getstatic f/Ag.EZ : [C
/*   */     //   1275: lload_2
/*   */     //   1276: ldc2_w 10000000
/*   */     //   1279: lrem
/*   */     //   1280: ldc2_w 1000000
/*   */     //   1283: ldiv
/*   */     //   1284: l2i
/*   */     //   1285: caload
/*   */     //   1286: invokevirtual yd0 : (C)V
/*   */     //   1289: lload_2
/*   */     //   1290: ldc2_w 100000
/*   */     //   1293: lcmp
/*   */     //   1294: iflt -> 1315
/*   */     //   1297: aload_1
/*   */     //   1298: getstatic f/Ag.EZ : [C
/*   */     //   1301: lload_2
/*   */     //   1302: ldc2_w 1000000
/*   */     //   1305: lrem
/*   */     //   1306: ldc2_w 100000
/*   */     //   1309: ldiv
/*   */     //   1310: l2i
/*   */     //   1311: caload
/*   */     //   1312: invokevirtual yd0 : (C)V
/*   */     //   1315: aload_1
/*   */     //   1316: getstatic f/Ag.EZ : [C
/*   */     //   1319: lload_2
/*   */     //   1320: ldc2_w 100000
/*   */     //   1323: lrem
/*   */     //   1324: ldc2_w 10000
/*   */     //   1327: ldiv
/*   */     //   1328: l2i
/*   */     //   1329: caload
/*   */     //   1330: invokevirtual yd0 : (C)V
/*   */     //   1333: lload_2
/*   */     //   1334: ldc2_w 1000
/*   */     //   1337: lcmp
/*   */     //   1338: iflt -> 1359
/*   */     //   1341: aload_1
/*   */     //   1342: getstatic f/Ag.EZ : [C
/*   */     //   1345: lload_2
/*   */     //   1346: ldc2_w 10000
/*   */     //   1349: lrem
/*   */     //   1350: ldc2_w 1000
/*   */     //   1353: ldiv
/*   */     //   1354: l2i
/*   */     //   1355: caload
/*   */     //   1356: invokevirtual yd0 : (C)V
/*   */     //   1359: lload_2
/*   */     //   1360: ldc2_w 100
/*   */     //   1363: lcmp
/*   */     //   1364: iflt -> 1385
/*   */     //   1367: aload_1
/*   */     //   1368: getstatic f/Ag.EZ : [C
/*   */     //   1371: lload_2
/*   */     //   1372: ldc2_w 1000
/*   */     //   1375: lrem
/*   */     //   1376: ldc2_w 100
/*   */     //   1379: ldiv
/*   */     //   1380: l2i
/*   */     //   1381: caload
/*   */     //   1382: invokevirtual yd0 : (C)V
/*   */     //   1385: lload_2
/*   */     //   1386: ldc2_w 10
/*   */     //   1389: lcmp
/*   */     //   1390: iflt -> 1411
/*   */     //   1393: aload_1
/*   */     //   1394: getstatic f/Ag.EZ : [C
/*   */     //   1397: lload_2
/*   */     //   1398: ldc2_w 100
/*   */     //   1401: lrem
/*   */     //   1402: ldc2_w 10
/*   */     //   1405: ldiv
/*   */     //   1406: l2i
/*   */     //   1407: caload
/*   */     //   1408: invokevirtual yd0 : (C)V
/*   */     //   1411: aload_1
/*   */     //   1412: getstatic f/Ag.EZ : [C
/*   */     //   1415: lload_2
/*   */     //   1416: ldc2_w 10
/*   */     //   1419: lrem
/*   */     //   1420: l2i
/*   */     //   1421: caload
/*   */     //   1422: invokevirtual yd0 : (C)V
/*   */     //   1425: goto -> 1496
/*   */     //   1428: aload_2
/*   */     //   1429: getstatic f/nc.hK0 : Lf/nc;
/*   */     //   1432: if_acmpne -> 1440
/*   */     //   1435: iconst_1
/*   */     //   1436: istore_3
/*   */     //   1437: goto -> 1442
/*   */     //   1440: iconst_0
/*   */     //   1441: istore_3
/*   */     //   1442: iload_3
/*   */     //   1443: ifeq -> 1470
/*   */     //   1446: aload_0
/*   */     //   1447: invokevirtual gI0 : ()Z
/*   */     //   1450: ifeq -> 1459
/*   */     //   1453: ldc 'true'
/*   */     //   1455: astore_0
/*   */     //   1456: goto -> 1462
/*   */     //   1459: ldc 'false'
/*   */     //   1461: astore_0
/*   */     //   1462: aload_1
/*   */     //   1463: aload_0
/*   */     //   1464: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   1467: goto -> 1496
/*   */     //   1470: aload_2
/*   */     //   1471: getstatic f/nc.NJ0 : Lf/nc;
/*   */     //   1474: if_acmpne -> 1482
/*   */     //   1477: iconst_1
/*   */     //   1478: istore_2
/*   */     //   1479: goto -> 1484
/*   */     //   1482: iconst_0
/*   */     //   1483: istore_2
/*   */     //   1484: iload_2
/*   */     //   1485: ifeq -> 1497
/*   */     //   1488: ldc 'null'
/*   */     //   1490: astore_0
/*   */     //   1491: aload_1
/*   */     //   1492: aload_0
/*   */     //   1493: invokevirtual V9 : (Ljava/lang/String;)V
/*   */     //   1496: return
/*   */     //   1497: new f/kN
/*   */     //   1500: dup
/*   */     //   1501: new java/lang/StringBuilder
/*   */     //   1504: dup
/*   */     //   1505: invokespecial <init> : ()V
/*   */     //   1508: ldc 'Unknown object type: '
/*   */     //   1510: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   1513: aload_0
/*   */     //   1514: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   1517: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   1520: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   1523: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 10
/*   */     //   #3	-> 31
/*   */     //   #4	-> 53
/*   */     //   #5	-> 72
/*   */     //   #6	-> 107
/*   */     //   #7	-> 117
/*   */     //   #8	-> 132
/*   */     //   #9	-> 135
/*   */     //   #10	-> 162
/*   */     //   #11	-> 183
/*   */     //   #12	-> 189
/*   */     //   #13	-> 200
/*   */     //   #14	-> 225
/*   */     //   #15	-> 256
/*   */     //   #16	-> 266
/*   */     //   #17	-> 280
/*   */     //   #18	-> 340
/*   */     //   #19	-> 367
/*   */     //   #20	-> 383
/*   */     //   #21	-> 412
/*   */     //   #22	-> 431
/*   */     //   #23	-> 466
/*   */     //   #24	-> 478
/*   */     //   #25	-> 523
/*   */     //   #26	-> 541
/*   */     //   #27	-> 551
/*   */     //   #28	-> 566
/*   */     //   #29	-> 569
/*   */     //   #30	-> 596
/*   */     //   #31	-> 615
/*   */     //   #32	-> 640
/*   */     //   #33	-> 676
/*   */     //   #34	-> 686
/*   */     //   #35	-> 700
/*   */     //   #36	-> 760
/*   */     //   #37	-> 787
/*   */     //   #38	-> 801
/*   */     //   #39	-> 808
/*   */     //   #40	-> 833
/*   */     //   #41	-> 844
/*   */     //   #42	-> 859
/*   */     //   #43	-> 881
/*   */     //   #44	-> 891
/*   */     //   #45	-> 906
/*   */     //   #46	-> 919
/*   */     //   #47	-> 959
/*   */     //   #48	-> 1429
/*   */     //   #49	-> 1447
/*   */     //   #50	-> 1453
/*   */     //   #51	-> 1464
/*   */     //   #52	-> 1471
/*   */     //   #53	-> 1488
/*   */     //   #54	-> 1493
/* 1 */     //   #55	-> 1497 } public final bM0 Jb(String paramString) { String str; for (this = this.Rr0; this != null && ((str = this.as0) == null || !str.equalsIgnoreCase(paramString)); this = this.H7); return this; } public final boolean Ua(String paramString) { return (Jb(paramString) != null); } public final String DX() { String str; switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to string: ")
/* 2 */             .append(this.eR).toString());case 5: return null;case 4: return (this.yi0 != 0L) ? "true" : "false";case 3: if ((str = this.U8) == null) str = Long.toString(this.yi0);  return str;case 2: if ((str = this.U8) == null) str = Double.toString(this.v3);  return str;case 1: break; }  return this.U8; } public final float hy0() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to float: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1.0F : 0.0F;case 3: return (float)this.yi0;case 2: return (float)this.v3;case 1: break; }  return Float.parseFloat(this.U8); } public final double cQ() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to double: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1.0D : 0.0D;case 3: return this.yi0;case 2: return this.v3;case 1: break; }  return Double.parseDouble(this.U8); } public final long YO() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to long: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1L : 0L;case 3: return this.yi0;case 2: return (long)this.v3;case 1: break; }  return Long.parseLong(this.U8); } public final int v60() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to int: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1 : 0;case 3: return (int)this.yi0;case 2: return (int)this.v3;case 1: break; }  return Integer.parseInt(this.U8); } public final boolean gI0() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to boolean: ").append(this.eR).toString());case 4: return (this.yi0 != 0L);case 3: return (this.yi0 != 0L);case 2: return (this.v3 != 0.0D);case 1: break; }  return this.U8.equalsIgnoreCase("true"); } public final byte z70() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to byte: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1 : 0;case 3: return (byte)(int)this.yi0;case 2: return (byte)(int)this.v3;case 1: break; }  return Byte.parseByte(this.U8); } public final short B9() { switch (YU.Ae[this.eR.ordinal()]) { default: throw new IllegalStateException(B40.df("Value cannot be converted to short: ").append(this.eR).toString());case 4: return (this.yi0 != 0L) ? 1 : 0;case 3: return (short)(int)this.yi0;case 2: return (short)(int)this.v3;case 1: break; }  return Short.parseShort(this.U8); } public final String Bh0(String paramString1, String paramString2) { if ((this = Jb(paramString1)) != null) { boolean bool; switch (YU.Ae[this.eR.ordinal()]) { default: bool = false; break;case 1: case 2: case 3: case 4: case 5: bool = true; break; }  if (bool) { if (this.eR == nc.NJ0) { bool = true; } else { bool = false; }  if (!bool)
/* 3 */           paramString2 = DX();  }  }  return paramString2; } public final float Lv0(String paramString, float paramFloat) { if ((this = Jb(paramString)) != null) { boolean bool; switch (YU.Ae[this.eR.ordinal()]) { default: bool = false; break;case 1: case 2: case 3: case 4: case 5: bool = true; break; }  if (bool) { if (this.eR == nc.NJ0) { bool = true; } else { bool = false; }  if (!bool) paramFloat = hy0();  }  }  return paramFloat; } public final String ty(String paramString) { if ((this = Jb(paramString)) != null) return DX();  throw new IllegalArgumentException(m0.tF0("Named value not found: ", paramString)); } public final float s20(int paramInt) { bM0 bM01; for (bM01 = this.Rr0; bM01 != null && paramInt > 0; ) { paramInt--; bM01 = bM01.H7; }  if (bM01 != null) return bM01.hy0();  throw new IllegalArgumentException(B40.df("Indexed value not found: ")
/* 4 */         .append(this.as0).toString()); } public final boolean OA0() { return (this.eR == nc.implements); } public final void Sy0(String paramString) { nc nc1; this.U8 = paramString; if (paramString == null) { nc1 = nc.NJ0; } else { nc1 = nc.O80; }  this.eR = nc1; } public final String toString() { switch (YU.Ae[this.eR.ordinal()]) { default: case 1: case 2: case 3: case 4: case 5: break; }  if (true) return (this.as0 == null) ? DX() : (this.as0 + ": " + DX());  this(); Ag ag; StringBuilder stringBuilder; String str; if (this.as0 == null) { str = ""; } else { str = UQ.Vr0(new StringBuilder(), this.as0, ": "); }  BB bB = BB.NH0;
/* 5 */     this(); COM3 cOM3; (cOM3 = new COM3()).gn0 = this; (new COM3()).JU = 0;
/* 6 */     this(512); zu0(this, new Ag(), 0, cOM3);
/* 7 */     return stringBuilder.append(str).append(toString()).toString(); }
/*   */ 
/*   */   
/*   */   public final void Kd(double paramDouble, String paramString) {
/*   */     this.v3 = paramDouble;
/*   */     this.yi0 = (long)paramDouble;
/*   */     this.U8 = paramString;
/*   */     this.eR = nc.zK0;
/*   */   }
/*   */   
/*   */   public final void SD0(long paramLong, String paramString) {
/*   */     this.yi0 = paramLong;
/*   */     this.v3 = paramLong;
/*   */     this.U8 = paramString;
/*   */     this.eR = nc.ci0;
/*   */   }
/*   */   
/*   */   public final void MF(boolean paramBoolean) {
/*   */     long l;
/*   */     if (paramBoolean) {
/*   */       l = 1L;
/*   */     } else {
/*   */       l = 0L;
/*   */     } 
/*   */     this.yi0 = l;
/*   */     this.eR = nc.hK0;
/*   */   }
/*   */   
/*   */   public final String in() {
/*   */     nc nc1;
/*   */     String str;
/*   */     bM0 bM01;
/*   */     if ((bM01 = this.UC) == null)
/*   */       return ((nc1 = this.eR) == nc.implements) ? "[]" : ((this == nc.Gg0) ? "{}" : ""); 
/*   */     if (bM01.eR == nc.implements) {
/*   */       byte b;
/*   */       bM0 bM02;
/*   */       for (str = "[]", b = 0, bM02 = bM01.Rr0; bM02 != null; ) {
/*   */         if (bM02 == this) {
/*   */           str = "[" + b + "]";
/*   */           break;
/*   */         } 
/*   */         bM02 = bM02.H7;
/*   */         b++;
/*   */       } 
/*   */     } else if (((bM0)super).as0.indexOf('.') != -1) {
/*   */       str = B40.df(".\"").append(((bM0)super).as0.replace("\"", "\\\"")).append("\"").toString();
/*   */     } else {
/*   */       str = '.' + ((bM0)super).as0;
/*   */     } 
/*   */     return ((bM0)super).UC.in() + str;
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return new Jy0(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bM0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */