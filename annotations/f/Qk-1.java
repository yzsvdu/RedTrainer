package f;

public final class Qk extends GS implements Np0 {
  public final byte qK;
  
  public final byte oL;
  
  public final short t30;
  
  public final int qU;
  
  public Qk(byte paramByte1, byte paramByte2, short paramShort, int paramInt) {
    this.qK = paramByte1;
    this.oL = paramByte2;
    this.t30 = paramShort;
    this.qU = paramInt;
  }
  
  public final byte YG0() {
    return 2;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield qK : B
    //   4: dup
    //   5: istore_1
    //   6: ifne -> 751
    //   9: aload_2
    //   10: invokevirtual Sw : ()Z
    //   13: dup
    //   14: istore_1
    //   15: aload_2
    //   16: dup
    //   17: aload_0
    //   18: aload_2
    //   19: dup
    //   20: dup
    //   21: dup2
    //   22: invokevirtual Sy0 : ()Z
    //   25: istore_3
    //   26: invokevirtual Ok : ()Z
    //   29: istore #4
    //   31: invokevirtual u70 : ()Z
    //   34: istore #5
    //   36: invokevirtual Xk0 : ()Z
    //   39: istore #6
    //   41: invokevirtual Z9 : ()Z
    //   44: istore #8
    //   46: getfield oL : B
    //   49: invokevirtual ZE : (B)V
    //   52: invokevirtual Sw : ()Z
    //   55: if_icmpeq -> 164
    //   58: iload_1
    //   59: ifeq -> 113
    //   62: aload #7
    //   64: dup
    //   65: getstatic f/F40.ef0 : Lf/F40;
    //   68: astore_1
    //   69: bipush #14
    //   71: istore #9
    //   73: getfield AD : Lf/Gp0;
    //   76: sipush #312
    //   79: aload_2
    //   80: invokevirtual ex : (ILf/hm0;)I
    //   83: istore #10
    //   85: iconst_1
    //   86: anewarray java/lang/String
    //   89: dup
    //   90: astore #11
    //   92: aload_2
    //   93: invokevirtual fA : ()Ljava/lang/String;
    //   96: iconst_0
    //   97: swap
    //   98: aastore
    //   99: iconst_2
    //   100: aload_1
    //   101: iload #9
    //   103: iload #10
    //   105: aload #11
    //   107: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   110: goto -> 161
    //   113: aload #7
    //   115: dup
    //   116: getstatic f/F40.ef0 : Lf/F40;
    //   119: astore_1
    //   120: bipush #14
    //   122: istore #9
    //   124: getfield AD : Lf/Gp0;
    //   127: sipush #306
    //   130: aload_2
    //   131: invokevirtual ex : (ILf/hm0;)I
    //   134: istore #10
    //   136: iconst_1
    //   137: anewarray java/lang/String
    //   140: dup
    //   141: astore #11
    //   143: aload_2
    //   144: invokevirtual fA : ()Ljava/lang/String;
    //   147: iconst_0
    //   148: swap
    //   149: aastore
    //   150: iconst_2
    //   151: aload_1
    //   152: iload #9
    //   154: iload #10
    //   156: aload #11
    //   158: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   161: invokevirtual Kq : (Ljava/lang/String;)V
    //   164: iload_3
    //   165: aload_2
    //   166: invokevirtual Sy0 : ()Z
    //   169: if_icmpeq -> 274
    //   172: iload_3
    //   173: ifeq -> 225
    //   176: aload #7
    //   178: dup
    //   179: getstatic f/F40.ef0 : Lf/F40;
    //   182: astore_1
    //   183: bipush #14
    //   185: istore_3
    //   186: getfield AD : Lf/Gp0;
    //   189: sipush #246
    //   192: aload_2
    //   193: invokevirtual ex : (ILf/hm0;)I
    //   196: istore #9
    //   198: iconst_1
    //   199: anewarray java/lang/String
    //   202: dup
    //   203: astore #10
    //   205: aload_2
    //   206: invokevirtual fA : ()Ljava/lang/String;
    //   209: iconst_0
    //   210: swap
    //   211: aastore
    //   212: iconst_2
    //   213: aload_1
    //   214: iload_3
    //   215: iload #9
    //   217: aload #10
    //   219: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   222: goto -> 271
    //   225: aload #7
    //   227: dup
    //   228: getstatic f/F40.ef0 : Lf/F40;
    //   231: astore_1
    //   232: bipush #14
    //   234: istore_3
    //   235: getfield AD : Lf/Gp0;
    //   238: sipush #234
    //   241: aload_2
    //   242: invokevirtual ex : (ILf/hm0;)I
    //   245: istore #9
    //   247: iconst_1
    //   248: anewarray java/lang/String
    //   251: dup
    //   252: astore #10
    //   254: aload_2
    //   255: invokevirtual fA : ()Ljava/lang/String;
    //   258: iconst_0
    //   259: swap
    //   260: aastore
    //   261: iconst_2
    //   262: aload_1
    //   263: iload_3
    //   264: iload #9
    //   266: aload #10
    //   268: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   271: invokevirtual Kq : (Ljava/lang/String;)V
    //   274: iload #4
    //   276: aload_2
    //   277: invokevirtual Ok : ()Z
    //   280: if_icmpeq -> 386
    //   283: iload #4
    //   285: ifeq -> 337
    //   288: aload #7
    //   290: dup
    //   291: getstatic f/F40.ef0 : Lf/F40;
    //   294: astore_1
    //   295: bipush #14
    //   297: istore_3
    //   298: getfield AD : Lf/Gp0;
    //   301: sipush #264
    //   304: aload_2
    //   305: invokevirtual ex : (ILf/hm0;)I
    //   308: istore #4
    //   310: iconst_1
    //   311: anewarray java/lang/String
    //   314: dup
    //   315: astore #9
    //   317: aload_2
    //   318: invokevirtual fA : ()Ljava/lang/String;
    //   321: iconst_0
    //   322: swap
    //   323: aastore
    //   324: iconst_2
    //   325: aload_1
    //   326: iload_3
    //   327: iload #4
    //   329: aload #9
    //   331: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   334: goto -> 383
    //   337: aload #7
    //   339: dup
    //   340: getstatic f/F40.ef0 : Lf/F40;
    //   343: astore_1
    //   344: bipush #14
    //   346: istore_3
    //   347: getfield AD : Lf/Gp0;
    //   350: sipush #255
    //   353: aload_2
    //   354: invokevirtual ex : (ILf/hm0;)I
    //   357: istore #4
    //   359: iconst_1
    //   360: anewarray java/lang/String
    //   363: dup
    //   364: astore #9
    //   366: aload_2
    //   367: invokevirtual fA : ()Ljava/lang/String;
    //   370: iconst_0
    //   371: swap
    //   372: aastore
    //   373: iconst_2
    //   374: aload_1
    //   375: iload_3
    //   376: iload #4
    //   378: aload #9
    //   380: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   383: invokevirtual Kq : (Ljava/lang/String;)V
    //   386: iload #5
    //   388: aload_2
    //   389: invokevirtual u70 : ()Z
    //   392: if_icmpeq -> 498
    //   395: iload #5
    //   397: ifeq -> 449
    //   400: aload #7
    //   402: dup
    //   403: getstatic f/F40.ef0 : Lf/F40;
    //   406: astore_1
    //   407: bipush #14
    //   409: istore_3
    //   410: getfield AD : Lf/Gp0;
    //   413: sipush #294
    //   416: aload_2
    //   417: invokevirtual ex : (ILf/hm0;)I
    //   420: istore #4
    //   422: iconst_1
    //   423: anewarray java/lang/String
    //   426: dup
    //   427: astore #5
    //   429: aload_2
    //   430: invokevirtual fA : ()Ljava/lang/String;
    //   433: iconst_0
    //   434: swap
    //   435: aastore
    //   436: iconst_2
    //   437: aload_1
    //   438: iload_3
    //   439: iload #4
    //   441: aload #5
    //   443: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   446: goto -> 495
    //   449: aload #7
    //   451: dup
    //   452: getstatic f/F40.ef0 : Lf/F40;
    //   455: astore_1
    //   456: bipush #14
    //   458: istore_3
    //   459: getfield AD : Lf/Gp0;
    //   462: sipush #288
    //   465: aload_2
    //   466: invokevirtual ex : (ILf/hm0;)I
    //   469: istore #4
    //   471: iconst_1
    //   472: anewarray java/lang/String
    //   475: dup
    //   476: astore #5
    //   478: aload_2
    //   479: invokevirtual fA : ()Ljava/lang/String;
    //   482: iconst_0
    //   483: swap
    //   484: aastore
    //   485: iconst_2
    //   486: aload_1
    //   487: iload_3
    //   488: iload #4
    //   490: aload #5
    //   492: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   495: invokevirtual Kq : (Ljava/lang/String;)V
    //   498: iload #6
    //   500: aload_2
    //   501: invokevirtual Xk0 : ()Z
    //   504: if_icmpeq -> 610
    //   507: iload #6
    //   509: ifeq -> 561
    //   512: aload #7
    //   514: dup
    //   515: getstatic f/F40.ef0 : Lf/F40;
    //   518: astore_1
    //   519: bipush #14
    //   521: istore_3
    //   522: getfield AD : Lf/Gp0;
    //   525: sipush #279
    //   528: aload_2
    //   529: invokevirtual ex : (ILf/hm0;)I
    //   532: istore #4
    //   534: iconst_1
    //   535: anewarray java/lang/String
    //   538: dup
    //   539: astore #5
    //   541: aload_2
    //   542: invokevirtual fA : ()Ljava/lang/String;
    //   545: iconst_0
    //   546: swap
    //   547: aastore
    //   548: iconst_2
    //   549: aload_1
    //   550: iload_3
    //   551: iload #4
    //   553: aload #5
    //   555: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   558: goto -> 607
    //   561: aload #7
    //   563: dup
    //   564: getstatic f/F40.ef0 : Lf/F40;
    //   567: astore_1
    //   568: bipush #14
    //   570: istore_3
    //   571: getfield AD : Lf/Gp0;
    //   574: sipush #273
    //   577: aload_2
    //   578: invokevirtual ex : (ILf/hm0;)I
    //   581: istore #4
    //   583: iconst_1
    //   584: anewarray java/lang/String
    //   587: dup
    //   588: astore #5
    //   590: aload_2
    //   591: invokevirtual fA : ()Ljava/lang/String;
    //   594: iconst_0
    //   595: swap
    //   596: aastore
    //   597: iconst_2
    //   598: aload_1
    //   599: iload_3
    //   600: iload #4
    //   602: aload #5
    //   604: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   607: invokevirtual Kq : (Ljava/lang/String;)V
    //   610: iload #8
    //   612: aload_2
    //   613: invokevirtual Z9 : ()Z
    //   616: if_icmpeq -> 722
    //   619: iload #8
    //   621: ifeq -> 673
    //   624: aload #7
    //   626: dup
    //   627: getstatic f/F40.ef0 : Lf/F40;
    //   630: astore_1
    //   631: bipush #14
    //   633: istore_3
    //   634: getfield AD : Lf/Gp0;
    //   637: sipush #246
    //   640: aload_2
    //   641: invokevirtual ex : (ILf/hm0;)I
    //   644: istore #4
    //   646: iconst_1
    //   647: anewarray java/lang/String
    //   650: dup
    //   651: astore #5
    //   653: aload_2
    //   654: invokevirtual fA : ()Ljava/lang/String;
    //   657: iconst_0
    //   658: swap
    //   659: aastore
    //   660: iconst_2
    //   661: aload_1
    //   662: iload_3
    //   663: iload #4
    //   665: aload #5
    //   667: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   670: goto -> 719
    //   673: aload #7
    //   675: dup
    //   676: getstatic f/F40.ef0 : Lf/F40;
    //   679: astore_1
    //   680: bipush #14
    //   682: istore_3
    //   683: getfield AD : Lf/Gp0;
    //   686: sipush #237
    //   689: aload_2
    //   690: invokevirtual ex : (ILf/hm0;)I
    //   693: istore #4
    //   695: iconst_1
    //   696: anewarray java/lang/String
    //   699: dup
    //   700: astore #5
    //   702: aload_2
    //   703: invokevirtual fA : ()Ljava/lang/String;
    //   706: iconst_0
    //   707: swap
    //   708: aastore
    //   709: iconst_2
    //   710: aload_1
    //   711: iload_3
    //   712: iload #4
    //   714: aload #5
    //   716: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   719: invokevirtual Kq : (Ljava/lang/String;)V
    //   722: aload #7
    //   724: new f/rd
    //   727: dup
    //   728: astore_1
    //   729: aload #7
    //   731: aload_0
    //   732: getfield oL : B
    //   735: aload_2
    //   736: swap
    //   737: invokespecial <init> : (Lf/kf;Lf/hm0;B)V
    //   740: getfield YP : Ljava/util/LinkedList;
    //   743: aload_1
    //   744: invokevirtual add : (Ljava/lang/Object;)Z
    //   747: pop
    //   748: goto -> 1190
    //   751: iload_1
    //   752: iconst_1
    //   753: if_icmpne -> 1099
    //   756: aload_2
    //   757: dup
    //   758: aload_0
    //   759: getfield oL : B
    //   762: invokevirtual ZE : (B)V
    //   765: getstatic f/Of.eH : Lf/Of;
    //   768: aload_0
    //   769: getfield t30 : S
    //   772: invokevirtual On0 : (S)Lf/LPT3;
    //   775: getfield Iu : I
    //   778: invokestatic OH0 : (I)Ljava/lang/String;
    //   781: astore_1
    //   782: invokevirtual Z9 : ()Z
    //   785: ifeq -> 846
    //   788: aload #7
    //   790: dup
    //   791: getstatic f/F40.ef0 : Lf/F40;
    //   794: astore_3
    //   795: bipush #14
    //   797: istore #4
    //   799: getfield AD : Lf/Gp0;
    //   802: sipush #240
    //   805: aload_2
    //   806: invokevirtual ex : (ILf/hm0;)I
    //   809: istore #5
    //   811: iconst_2
    //   812: anewarray java/lang/String
    //   815: dup
    //   816: dup
    //   817: astore #6
    //   819: aload_2
    //   820: invokevirtual fA : ()Ljava/lang/String;
    //   823: iconst_0
    //   824: swap
    //   825: aastore
    //   826: iconst_1
    //   827: aload_1
    //   828: aastore
    //   829: iconst_2
    //   830: aload_3
    //   831: iload #4
    //   833: iload #5
    //   835: aload #6
    //   837: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   840: invokevirtual Kq : (Ljava/lang/String;)V
    //   843: goto -> 904
    //   846: aload_2
    //   847: invokevirtual Sy0 : ()Z
    //   850: ifeq -> 904
    //   853: aload #7
    //   855: dup
    //   856: getstatic f/F40.ef0 : Lf/F40;
    //   859: astore_3
    //   860: bipush #14
    //   862: istore #4
    //   864: getfield AD : Lf/Gp0;
    //   867: sipush #234
    //   870: aload_2
    //   871: invokevirtual ex : (ILf/hm0;)I
    //   874: istore #5
    //   876: iconst_1
    //   877: anewarray java/lang/String
    //   880: dup
    //   881: astore #6
    //   883: aload_2
    //   884: invokevirtual fA : ()Ljava/lang/String;
    //   887: iconst_0
    //   888: swap
    //   889: aastore
    //   890: iconst_2
    //   891: aload_3
    //   892: iload #4
    //   894: iload #5
    //   896: aload #6
    //   898: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   901: goto -> 840
    //   904: aload_2
    //   905: invokevirtual Ok : ()Z
    //   908: ifeq -> 966
    //   911: aload #7
    //   913: dup
    //   914: getstatic f/F40.ef0 : Lf/F40;
    //   917: astore_3
    //   918: bipush #14
    //   920: istore #4
    //   922: getfield AD : Lf/Gp0;
    //   925: sipush #258
    //   928: aload_2
    //   929: invokevirtual ex : (ILf/hm0;)I
    //   932: istore #5
    //   934: iconst_2
    //   935: anewarray java/lang/String
    //   938: dup
    //   939: dup
    //   940: astore #6
    //   942: aload_2
    //   943: invokevirtual fA : ()Ljava/lang/String;
    //   946: iconst_0
    //   947: swap
    //   948: aastore
    //   949: iconst_1
    //   950: aload_1
    //   951: aastore
    //   952: iconst_2
    //   953: aload_3
    //   954: iload #4
    //   956: iload #5
    //   958: aload #6
    //   960: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   963: invokevirtual Kq : (Ljava/lang/String;)V
    //   966: aload_2
    //   967: invokevirtual Xk0 : ()Z
    //   970: ifeq -> 1022
    //   973: aload #7
    //   975: dup
    //   976: getstatic f/F40.ef0 : Lf/F40;
    //   979: astore_1
    //   980: bipush #14
    //   982: istore_3
    //   983: getfield AD : Lf/Gp0;
    //   986: sipush #273
    //   989: aload_2
    //   990: invokevirtual ex : (ILf/hm0;)I
    //   993: istore #4
    //   995: iconst_1
    //   996: anewarray java/lang/String
    //   999: dup
    //   1000: astore #5
    //   1002: aload_2
    //   1003: invokevirtual fA : ()Ljava/lang/String;
    //   1006: iconst_0
    //   1007: swap
    //   1008: aastore
    //   1009: iconst_2
    //   1010: aload_1
    //   1011: iload_3
    //   1012: iload #4
    //   1014: aload #5
    //   1016: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   1019: invokevirtual Kq : (Ljava/lang/String;)V
    //   1022: aload_2
    //   1023: invokevirtual Sw : ()Z
    //   1026: ifeq -> 1078
    //   1029: aload #7
    //   1031: dup
    //   1032: getstatic f/F40.ef0 : Lf/F40;
    //   1035: astore_1
    //   1036: bipush #14
    //   1038: istore_3
    //   1039: getfield AD : Lf/Gp0;
    //   1042: sipush #306
    //   1045: aload_2
    //   1046: invokevirtual ex : (ILf/hm0;)I
    //   1049: istore #4
    //   1051: iconst_1
    //   1052: anewarray java/lang/String
    //   1055: dup
    //   1056: astore #5
    //   1058: aload_2
    //   1059: invokevirtual fA : ()Ljava/lang/String;
    //   1062: iconst_0
    //   1063: swap
    //   1064: aastore
    //   1065: iconst_2
    //   1066: aload_1
    //   1067: iload_3
    //   1068: iload #4
    //   1070: aload #5
    //   1072: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   1075: invokevirtual Kq : (Ljava/lang/String;)V
    //   1078: aload #7
    //   1080: new f/rd
    //   1083: dup
    //   1084: astore_1
    //   1085: aload #7
    //   1087: aload_0
    //   1088: getfield oL : B
    //   1091: aload_2
    //   1092: swap
    //   1093: invokespecial <init> : (Lf/kf;Lf/hm0;B)V
    //   1096: goto -> 740
    //   1099: iload_1
    //   1100: iconst_2
    //   1101: if_icmpne -> 1133
    //   1104: aload #7
    //   1106: aload_2
    //   1107: aload_0
    //   1108: getfield oL : B
    //   1111: invokevirtual ZE : (B)V
    //   1114: new f/rd
    //   1117: dup
    //   1118: astore_1
    //   1119: aload #7
    //   1121: aload_0
    //   1122: getfield oL : B
    //   1125: aload_2
    //   1126: swap
    //   1127: invokespecial <init> : (Lf/kf;Lf/hm0;B)V
    //   1130: goto -> 740
    //   1133: iload_1
    //   1134: iconst_3
    //   1135: if_icmpne -> 1190
    //   1138: aload_0
    //   1139: getfield qU : I
    //   1142: dup
    //   1143: istore_1
    //   1144: ifne -> 1148
    //   1147: return
    //   1148: aload #7
    //   1150: getfield AD : Lf/Gp0;
    //   1153: iload_1
    //   1154: invokevirtual f70 : (I)Lf/cOm4;
    //   1157: dup
    //   1158: astore_1
    //   1159: ifnonnull -> 1163
    //   1162: return
    //   1163: aload_1
    //   1164: getfield gc : Lf/jd0;
    //   1167: dup
    //   1168: astore_1
    //   1169: ifnonnull -> 1173
    //   1172: return
    //   1173: aload_1
    //   1174: dup
    //   1175: aload_0
    //   1176: getfield oL : B
    //   1179: istore_0
    //   1180: getfield ta : Lf/Q90;
    //   1183: iload_0
    //   1184: putfield u0 : B
    //   1187: invokevirtual pO : ()V
    //   1190: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 73
    //   #2	-> 80
    //   #3	-> 107
    //   #4	-> 116
    //   #5	-> 124
    //   #6	-> 131
    //   #7	-> 158
    //   #8	-> 161
    //   #9	-> 186
    //   #10	-> 193
    //   #11	-> 219
    //   #12	-> 228
    //   #13	-> 235
    //   #14	-> 242
    //   #15	-> 268
    //   #16	-> 271
    //   #17	-> 298
    //   #18	-> 305
    //   #19	-> 331
    //   #20	-> 340
    //   #21	-> 347
    //   #22	-> 354
    //   #23	-> 380
    //   #24	-> 383
    //   #25	-> 410
    //   #26	-> 417
    //   #27	-> 443
    //   #28	-> 452
    //   #29	-> 459
    //   #30	-> 466
    //   #31	-> 492
    //   #32	-> 495
    //   #33	-> 522
    //   #34	-> 529
    //   #35	-> 555
    //   #36	-> 564
    //   #37	-> 571
    //   #38	-> 578
    //   #39	-> 604
    //   #40	-> 607
    //   #41	-> 634
    //   #42	-> 641
    //   #43	-> 667
    //   #44	-> 676
    //   #45	-> 683
    //   #46	-> 690
    //   #47	-> 716
    //   #48	-> 719
    //   #49	-> 740
    //   #50	-> 744
    //   #51	-> 759
    //   #52	-> 765
    //   #53	-> 769
    //   #54	-> 775
    //   #55	-> 782
    //   #56	-> 799
    //   #57	-> 806
    //   #58	-> 837
    //   #59	-> 840
    //   #60	-> 864
    //   #61	-> 871
    //   #62	-> 898
    //   #63	-> 905
    //   #64	-> 922
    //   #65	-> 929
    //   #66	-> 960
    //   #67	-> 963
    //   #68	-> 983
    //   #69	-> 990
    //   #70	-> 1016
    //   #71	-> 1019
    //   #72	-> 1039
    //   #73	-> 1046
    //   #74	-> 1072
    //   #75	-> 1075
    //   #76	-> 1150
    //   #77	-> 1154
    //   #78	-> 1164
    //   #79	-> 1176
    //   #80	-> 1180
    //   #81	-> 1184
    //   #82	-> 1187
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */