package f;

public final class ZW extends sO {
  public final G3 Nt;
  
  public final G3 NR;
  
  public final G3 zx0;
  
  public final fQ g7;
  
  public ZW() {
    this(null);
  }
  
  public ZW(Xt0 paramXt0) {
    super(paramXt0);
    G3 g3;
    fQ fQ1;
    this(300);
    this.Nt = this;
    this(300);
    this.NR = this;
    this(200);
    this.zx0 = this;
    this(10);
    this.g7 = this;
  }
  
  public static int A20(int paramInt, String paramString) {
    int i;
    return (paramString == null || paramString.length() == 0) ? 0 : (((i = Integer.parseInt(paramString)) < 0) ? (paramInt + i) : (i - 1));
  }
  
  public final YW KY(RD0 paramRD0, oI paramoI) {
    // Byte code:
    //   0: aload_2
    //   1: checkcast f/x40
    //   4: dup
    //   5: astore_2
    //   6: ifnull -> 21
    //   9: aload_2
    //   10: getfield xp : Z
    //   13: ifeq -> 21
    //   16: iconst_1
    //   17: istore_2
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_2
    //   23: aload_0
    //   24: new f/dR
    //   27: dup
    //   28: astore_3
    //   29: invokespecial <init> : ()V
    //   32: new f/m60
    //   35: dup
    //   36: astore #4
    //   38: ldc 'default'
    //   40: invokespecial <init> : (Ljava/lang/String;)V
    //   43: getfield g7 : Lf/fQ;
    //   46: aload #4
    //   48: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   51: new java/io/BufferedReader
    //   54: dup
    //   55: astore #5
    //   57: new java/io/InputStreamReader
    //   60: dup
    //   61: aload_1
    //   62: invokevirtual Yc : ()Ljava/io/InputStream;
    //   65: invokespecial <init> : (Ljava/io/InputStream;)V
    //   68: sipush #4096
    //   71: invokespecial <init> : (Ljava/io/Reader;I)V
    //   74: iconst_0
    //   75: istore #6
    //   77: aload #5
    //   79: invokevirtual readLine : ()Ljava/lang/String;
    //   82: dup
    //   83: astore #7
    //   85: ifnull -> 946
    //   88: aload #7
    //   90: ldc '\s+'
    //   92: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   95: dup
    //   96: astore #7
    //   98: arraylength
    //   99: iconst_1
    //   100: if_icmpge -> 106
    //   103: goto -> 946
    //   106: aload #7
    //   108: iconst_0
    //   109: aaload
    //   110: invokevirtual length : ()I
    //   113: ifne -> 119
    //   116: goto -> 77
    //   119: aload #7
    //   121: iconst_0
    //   122: aaload
    //   123: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   126: iconst_0
    //   127: invokevirtual charAt : (I)C
    //   130: dup
    //   131: istore #8
    //   133: bipush #35
    //   135: if_icmpne -> 141
    //   138: goto -> 77
    //   141: iload #8
    //   143: bipush #118
    //   145: if_icmpne -> 339
    //   148: aload #7
    //   150: iconst_0
    //   151: aaload
    //   152: invokevirtual length : ()I
    //   155: iconst_1
    //   156: if_icmpne -> 202
    //   159: aload #7
    //   161: aload_0
    //   162: dup
    //   163: dup
    //   164: getfield Nt : Lf/G3;
    //   167: aload #7
    //   169: iconst_1
    //   170: aaload
    //   171: invokestatic parseFloat : (Ljava/lang/String;)F
    //   174: invokevirtual ZB0 : (F)V
    //   177: getfield Nt : Lf/G3;
    //   180: aload #7
    //   182: iconst_2
    //   183: aaload
    //   184: invokestatic parseFloat : (Ljava/lang/String;)F
    //   187: invokevirtual ZB0 : (F)V
    //   190: getfield Nt : Lf/G3;
    //   193: astore #7
    //   195: iconst_3
    //   196: aaload
    //   197: astore #8
    //   199: goto -> 256
    //   202: aload #7
    //   204: iconst_0
    //   205: aaload
    //   206: iconst_1
    //   207: invokevirtual charAt : (I)C
    //   210: bipush #110
    //   212: if_icmpne -> 269
    //   215: aload #7
    //   217: aload_0
    //   218: dup
    //   219: dup
    //   220: getfield NR : Lf/G3;
    //   223: aload #7
    //   225: iconst_1
    //   226: aaload
    //   227: invokestatic parseFloat : (Ljava/lang/String;)F
    //   230: invokevirtual ZB0 : (F)V
    //   233: getfield NR : Lf/G3;
    //   236: aload #7
    //   238: iconst_2
    //   239: aaload
    //   240: invokestatic parseFloat : (Ljava/lang/String;)F
    //   243: invokevirtual ZB0 : (F)V
    //   246: getfield NR : Lf/G3;
    //   249: astore #7
    //   251: iconst_3
    //   252: aaload
    //   253: goto -> 197
    //   256: aload #7
    //   258: aload #8
    //   260: invokestatic parseFloat : (Ljava/lang/String;)F
    //   263: invokevirtual ZB0 : (F)V
    //   266: goto -> 77
    //   269: aload #7
    //   271: iconst_0
    //   272: aaload
    //   273: iconst_1
    //   274: invokevirtual charAt : (I)C
    //   277: bipush #116
    //   279: if_icmpne -> 77
    //   282: iload_2
    //   283: aload_0
    //   284: dup
    //   285: getfield zx0 : Lf/G3;
    //   288: aload #7
    //   290: iconst_1
    //   291: aaload
    //   292: invokestatic parseFloat : (Ljava/lang/String;)F
    //   295: invokevirtual ZB0 : (F)V
    //   298: getfield zx0 : Lf/G3;
    //   301: astore #8
    //   303: ifeq -> 320
    //   306: fconst_1
    //   307: aload #7
    //   309: iconst_2
    //   310: aaload
    //   311: invokestatic parseFloat : (Ljava/lang/String;)F
    //   314: fsub
    //   315: fstore #7
    //   317: goto -> 329
    //   320: aload #7
    //   322: iconst_2
    //   323: aaload
    //   324: invokestatic parseFloat : (Ljava/lang/String;)F
    //   327: fstore #7
    //   329: aload #8
    //   331: fload #7
    //   333: invokevirtual ZB0 : (F)V
    //   336: goto -> 77
    //   339: iload #8
    //   341: bipush #102
    //   343: if_icmpne -> 755
    //   346: aload #4
    //   348: getfield Ra0 : Lf/fQ;
    //   351: astore #8
    //   353: iconst_1
    //   354: istore #9
    //   356: iload #9
    //   358: aload #7
    //   360: arraylength
    //   361: iconst_2
    //   362: isub
    //   363: if_icmpge -> 77
    //   366: aload #8
    //   368: aload_0
    //   369: aload #7
    //   371: iconst_1
    //   372: aaload
    //   373: ldc '/'
    //   375: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   378: dup
    //   379: astore #10
    //   381: iconst_0
    //   382: aaload
    //   383: astore #11
    //   385: getfield Nt : Lf/G3;
    //   388: getfield NB0 : I
    //   391: aload #11
    //   393: invokestatic A20 : (ILjava/lang/String;)I
    //   396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   399: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   402: aload #10
    //   404: arraylength
    //   405: iconst_2
    //   406: if_icmple -> 447
    //   409: iload #9
    //   411: iconst_1
    //   412: if_icmpne -> 421
    //   415: aload #4
    //   417: iconst_1
    //   418: putfield HK : Z
    //   421: aload #8
    //   423: aload_0
    //   424: aload #10
    //   426: iconst_2
    //   427: aaload
    //   428: astore #11
    //   430: getfield NR : Lf/G3;
    //   433: getfield NB0 : I
    //   436: aload #11
    //   438: invokestatic A20 : (ILjava/lang/String;)I
    //   441: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   444: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   447: aload #10
    //   449: arraylength
    //   450: iconst_1
    //   451: if_icmple -> 502
    //   454: aload #10
    //   456: iconst_1
    //   457: aaload
    //   458: invokevirtual length : ()I
    //   461: ifle -> 502
    //   464: iload #9
    //   466: iconst_1
    //   467: if_icmpne -> 476
    //   470: aload #4
    //   472: iconst_1
    //   473: putfield wI : Z
    //   476: aload #8
    //   478: aload_0
    //   479: aload #10
    //   481: iconst_1
    //   482: aaload
    //   483: astore #10
    //   485: getfield zx0 : Lf/G3;
    //   488: getfield NB0 : I
    //   491: aload #10
    //   493: invokestatic A20 : (ILjava/lang/String;)I
    //   496: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   499: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   502: aload #8
    //   504: aload_0
    //   505: aload #7
    //   507: iload #9
    //   509: iconst_1
    //   510: iadd
    //   511: dup
    //   512: istore #9
    //   514: aaload
    //   515: ldc '/'
    //   517: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   520: dup
    //   521: astore #10
    //   523: iconst_0
    //   524: aaload
    //   525: astore #11
    //   527: getfield Nt : Lf/G3;
    //   530: getfield NB0 : I
    //   533: aload #11
    //   535: invokestatic A20 : (ILjava/lang/String;)I
    //   538: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   541: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   544: aload #10
    //   546: arraylength
    //   547: iconst_2
    //   548: if_icmple -> 577
    //   551: aload #8
    //   553: aload_0
    //   554: aload #10
    //   556: iconst_2
    //   557: aaload
    //   558: astore #11
    //   560: getfield NR : Lf/G3;
    //   563: getfield NB0 : I
    //   566: aload #11
    //   568: invokestatic A20 : (ILjava/lang/String;)I
    //   571: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   574: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   577: aload #10
    //   579: arraylength
    //   580: iconst_1
    //   581: if_icmple -> 620
    //   584: aload #10
    //   586: iconst_1
    //   587: aaload
    //   588: invokevirtual length : ()I
    //   591: ifle -> 620
    //   594: aload #8
    //   596: aload_0
    //   597: aload #10
    //   599: iconst_1
    //   600: aaload
    //   601: astore #10
    //   603: getfield zx0 : Lf/G3;
    //   606: getfield NB0 : I
    //   609: aload #10
    //   611: invokestatic A20 : (ILjava/lang/String;)I
    //   614: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   617: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   620: aload #8
    //   622: aload_0
    //   623: aload #7
    //   625: iload #9
    //   627: iconst_1
    //   628: iadd
    //   629: dup
    //   630: istore #9
    //   632: aaload
    //   633: ldc '/'
    //   635: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   638: dup
    //   639: astore #10
    //   641: iconst_0
    //   642: aaload
    //   643: astore #11
    //   645: getfield Nt : Lf/G3;
    //   648: getfield NB0 : I
    //   651: aload #11
    //   653: invokestatic A20 : (ILjava/lang/String;)I
    //   656: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   659: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   662: aload #10
    //   664: arraylength
    //   665: iconst_2
    //   666: if_icmple -> 695
    //   669: aload #8
    //   671: aload_0
    //   672: aload #10
    //   674: iconst_2
    //   675: aaload
    //   676: astore #11
    //   678: getfield NR : Lf/G3;
    //   681: getfield NB0 : I
    //   684: aload #11
    //   686: invokestatic A20 : (ILjava/lang/String;)I
    //   689: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   692: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   695: aload #10
    //   697: arraylength
    //   698: iconst_1
    //   699: if_icmple -> 738
    //   702: aload #10
    //   704: iconst_1
    //   705: aaload
    //   706: invokevirtual length : ()I
    //   709: ifle -> 738
    //   712: aload #8
    //   714: aload_0
    //   715: aload #10
    //   717: iconst_1
    //   718: aaload
    //   719: astore #10
    //   721: getfield zx0 : Lf/G3;
    //   724: getfield NB0 : I
    //   727: aload #10
    //   729: invokestatic A20 : (ILjava/lang/String;)I
    //   732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   735: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   738: aload #4
    //   740: dup
    //   741: getfield K3 : I
    //   744: iconst_1
    //   745: iadd
    //   746: putfield K3 : I
    //   749: iinc #9, -1
    //   752: goto -> 356
    //   755: iload #8
    //   757: bipush #111
    //   759: if_icmpeq -> 852
    //   762: iload #8
    //   764: bipush #103
    //   766: if_icmpne -> 772
    //   769: goto -> 852
    //   772: aload #7
    //   774: iconst_0
    //   775: aaload
    //   776: ldc 'mtllib'
    //   778: invokevirtual equals : (Ljava/lang/Object;)Z
    //   781: ifeq -> 802
    //   784: aload_3
    //   785: aload_1
    //   786: invokevirtual wT : ()Lf/RD0;
    //   789: aload #7
    //   791: iconst_1
    //   792: aaload
    //   793: invokevirtual f0 : (Ljava/lang/String;)Lf/RD0;
    //   796: invokevirtual jw : (Lf/RD0;)V
    //   799: goto -> 77
    //   802: aload #7
    //   804: iconst_0
    //   805: aaload
    //   806: ldc 'usemtl'
    //   808: invokevirtual equals : (Ljava/lang/Object;)Z
    //   811: ifeq -> 77
    //   814: aload #7
    //   816: arraylength
    //   817: iconst_1
    //   818: if_icmpne -> 828
    //   821: ldc 'default'
    //   823: astore #7
    //   825: goto -> 842
    //   828: aload #7
    //   830: iconst_1
    //   831: aaload
    //   832: bipush #46
    //   834: bipush #95
    //   836: invokevirtual replace : (CC)Ljava/lang/String;
    //   839: goto -> 823
    //   842: aload #4
    //   844: aload #7
    //   846: putfield Ke0 : Ljava/lang/String;
    //   849: goto -> 77
    //   852: aload #7
    //   854: arraylength
    //   855: iconst_1
    //   856: if_icmple -> 868
    //   859: aload #7
    //   861: iconst_1
    //   862: aaload
    //   863: astore #4
    //   865: goto -> 873
    //   868: ldc 'default'
    //   870: goto -> 863
    //   873: aload_0
    //   874: getfield g7 : Lf/fQ;
    //   877: invokevirtual r30 : ()Lf/Hc0;
    //   880: astore #7
    //   882: aload #7
    //   884: invokevirtual hasNext : ()Z
    //   887: ifeq -> 919
    //   890: aload #7
    //   892: invokevirtual next : ()Ljava/lang/Object;
    //   895: checkcast f/m60
    //   898: dup
    //   899: astore #8
    //   901: getfield Wz : Ljava/lang/String;
    //   904: aload #4
    //   906: invokevirtual equals : (Ljava/lang/Object;)Z
    //   909: ifeq -> 882
    //   912: aload #8
    //   914: astore #4
    //   916: goto -> 77
    //   919: aload_0
    //   920: new f/m60
    //   923: dup
    //   924: astore #7
    //   926: aload #4
    //   928: invokespecial <init> : (Ljava/lang/String;)V
    //   931: getfield g7 : Lf/fQ;
    //   934: aload #7
    //   936: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   939: aload #7
    //   941: astore #4
    //   943: goto -> 77
    //   946: aload #5
    //   948: invokevirtual close : ()V
    //   951: iconst_0
    //   952: istore_1
    //   953: iload_1
    //   954: aload_0
    //   955: getfield g7 : Lf/fQ;
    //   958: dup
    //   959: astore_2
    //   960: getfield Z8 : I
    //   963: dup
    //   964: istore #4
    //   966: if_icmpge -> 1002
    //   969: aload_2
    //   970: iload_1
    //   971: invokevirtual get : (I)Ljava/lang/Object;
    //   974: checkcast f/m60
    //   977: getfield K3 : I
    //   980: iconst_1
    //   981: if_icmpge -> 996
    //   984: aload_0
    //   985: getfield g7 : Lf/fQ;
    //   988: iload_1
    //   989: invokevirtual Hc : (I)Ljava/lang/Object;
    //   992: pop
    //   993: iinc #1, -1
    //   996: iinc #1, 1
    //   999: goto -> 953
    //   1002: iload #4
    //   1004: iconst_1
    //   1005: if_icmpge -> 1011
    //   1008: goto -> 1935
    //   1011: new f/YW
    //   1014: dup
    //   1015: astore_1
    //   1016: invokespecial <init> : ()V
    //   1019: iconst_0
    //   1020: istore_2
    //   1021: iload_2
    //   1022: iload #4
    //   1024: if_icmpge -> 1864
    //   1027: aload_0
    //   1028: getfield g7 : Lf/fQ;
    //   1031: iload_2
    //   1032: invokevirtual get : (I)Ljava/lang/Object;
    //   1035: checkcast f/m60
    //   1038: dup
    //   1039: dup2
    //   1040: astore #5
    //   1042: getfield Ra0 : Lf/fQ;
    //   1045: dup
    //   1046: astore #7
    //   1048: getfield Z8 : I
    //   1051: istore #8
    //   1053: getfield K3 : I
    //   1056: istore #9
    //   1058: getfield HK : Z
    //   1061: dup
    //   1062: istore #10
    //   1064: iload #9
    //   1066: aload #5
    //   1068: getfield wI : Z
    //   1071: istore #9
    //   1073: iconst_3
    //   1074: imul
    //   1075: istore #11
    //   1077: iconst_3
    //   1078: istore #12
    //   1080: ifeq -> 1087
    //   1083: iconst_3
    //   1084: goto -> 1088
    //   1087: iconst_0
    //   1088: iload #12
    //   1090: iadd
    //   1091: istore #12
    //   1093: iload #9
    //   1095: ifeq -> 1104
    //   1098: iconst_2
    //   1099: istore #13
    //   1101: goto -> 1107
    //   1104: iconst_0
    //   1105: istore #13
    //   1107: iload #12
    //   1109: iload #13
    //   1111: iadd
    //   1112: iload #11
    //   1114: imul
    //   1115: newarray float
    //   1117: astore #12
    //   1119: iconst_0
    //   1120: istore #13
    //   1122: iconst_0
    //   1123: istore #14
    //   1125: iload #13
    //   1127: iload #8
    //   1129: if_icmpge -> 1367
    //   1132: iload #10
    //   1134: aload #12
    //   1136: dup
    //   1137: dup
    //   1138: iload #14
    //   1140: aload_0
    //   1141: aload #7
    //   1143: iload #13
    //   1145: dup
    //   1146: iconst_1
    //   1147: iadd
    //   1148: istore #13
    //   1150: invokevirtual get : (I)Ljava/lang/Object;
    //   1153: checkcast java/lang/Integer
    //   1156: invokevirtual intValue : ()I
    //   1159: iconst_3
    //   1160: imul
    //   1161: istore #15
    //   1163: iinc #14, 1
    //   1166: getfield Nt : Lf/G3;
    //   1169: iload #15
    //   1171: dup
    //   1172: iconst_1
    //   1173: iadd
    //   1174: istore #15
    //   1176: invokevirtual cON : (I)F
    //   1179: fastore
    //   1180: iload #14
    //   1182: aload_0
    //   1183: iinc #14, 1
    //   1186: getfield Nt : Lf/G3;
    //   1189: iload #15
    //   1191: dup
    //   1192: iconst_1
    //   1193: iadd
    //   1194: istore #15
    //   1196: invokevirtual cON : (I)F
    //   1199: fastore
    //   1200: iload #14
    //   1202: aload_0
    //   1203: iinc #14, 1
    //   1206: getfield Nt : Lf/G3;
    //   1209: iload #15
    //   1211: invokevirtual cON : (I)F
    //   1214: fastore
    //   1215: ifeq -> 1299
    //   1218: aload #12
    //   1220: dup
    //   1221: dup
    //   1222: iload #14
    //   1224: aload_0
    //   1225: aload #7
    //   1227: iload #13
    //   1229: dup
    //   1230: iconst_1
    //   1231: iadd
    //   1232: istore #13
    //   1234: invokevirtual get : (I)Ljava/lang/Object;
    //   1237: checkcast java/lang/Integer
    //   1240: invokevirtual intValue : ()I
    //   1243: iconst_3
    //   1244: imul
    //   1245: istore #15
    //   1247: iinc #14, 1
    //   1250: getfield NR : Lf/G3;
    //   1253: iload #15
    //   1255: dup
    //   1256: iconst_1
    //   1257: iadd
    //   1258: istore #15
    //   1260: invokevirtual cON : (I)F
    //   1263: fastore
    //   1264: iload #14
    //   1266: aload_0
    //   1267: iinc #14, 1
    //   1270: getfield NR : Lf/G3;
    //   1273: iload #15
    //   1275: dup
    //   1276: iconst_1
    //   1277: iadd
    //   1278: istore #15
    //   1280: invokevirtual cON : (I)F
    //   1283: fastore
    //   1284: iload #14
    //   1286: aload_0
    //   1287: iinc #14, 1
    //   1290: getfield NR : Lf/G3;
    //   1293: iload #15
    //   1295: invokevirtual cON : (I)F
    //   1298: fastore
    //   1299: iload #9
    //   1301: ifeq -> 1125
    //   1304: aload #12
    //   1306: dup
    //   1307: iload #14
    //   1309: aload_0
    //   1310: aload #7
    //   1312: iload #13
    //   1314: dup
    //   1315: iconst_1
    //   1316: iadd
    //   1317: istore #13
    //   1319: invokevirtual get : (I)Ljava/lang/Object;
    //   1322: checkcast java/lang/Integer
    //   1325: invokevirtual intValue : ()I
    //   1328: iconst_2
    //   1329: imul
    //   1330: istore #15
    //   1332: iinc #14, 1
    //   1335: getfield zx0 : Lf/G3;
    //   1338: iload #15
    //   1340: dup
    //   1341: iconst_1
    //   1342: iadd
    //   1343: istore #15
    //   1345: invokevirtual cON : (I)F
    //   1348: fastore
    //   1349: iload #14
    //   1351: aload_0
    //   1352: iinc #14, 1
    //   1355: getfield zx0 : Lf/G3;
    //   1358: iload #15
    //   1360: invokevirtual cON : (I)F
    //   1363: fastore
    //   1364: goto -> 1125
    //   1367: iload #11
    //   1369: sipush #32767
    //   1372: if_icmplt -> 1378
    //   1375: iconst_0
    //   1376: istore #11
    //   1378: iload #11
    //   1380: dup
    //   1381: newarray short
    //   1383: astore #7
    //   1385: ifle -> 1413
    //   1388: iconst_0
    //   1389: istore #8
    //   1391: iload #8
    //   1393: iload #11
    //   1395: if_icmpge -> 1413
    //   1398: aload #7
    //   1400: iload #8
    //   1402: i2s
    //   1403: iload #8
    //   1405: swap
    //   1406: sastore
    //   1407: iinc #8, 1
    //   1410: goto -> 1391
    //   1413: iload #10
    //   1415: new f/fQ
    //   1418: dup
    //   1419: dup
    //   1420: astore #8
    //   1422: invokespecial <init> : ()V
    //   1425: new f/lw0
    //   1428: dup
    //   1429: astore #10
    //   1431: iconst_1
    //   1432: iconst_3
    //   1433: ldc 'a_position'
    //   1435: invokespecial <init> : (IILjava/lang/String;)V
    //   1438: aload #10
    //   1440: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1443: ifeq -> 1467
    //   1446: aload #8
    //   1448: new f/lw0
    //   1451: dup
    //   1452: astore #10
    //   1454: bipush #8
    //   1456: iconst_3
    //   1457: ldc 'a_normal'
    //   1459: invokespecial <init> : (IILjava/lang/String;)V
    //   1462: aload #10
    //   1464: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1467: iload #9
    //   1469: ifeq -> 1493
    //   1472: aload #8
    //   1474: new f/lw0
    //   1477: dup
    //   1478: astore #9
    //   1480: bipush #16
    //   1482: iconst_2
    //   1483: ldc 'a_texCoord0'
    //   1485: invokespecial <init> : (IILjava/lang/String;)V
    //   1488: aload #9
    //   1490: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1493: aload #5
    //   1495: iload #6
    //   1497: iconst_1
    //   1498: iadd
    //   1499: dup
    //   1500: istore #6
    //   1502: invokestatic toString : (I)Ljava/lang/String;
    //   1505: astore #9
    //   1507: getfield Wz : Ljava/lang/String;
    //   1510: ldc 'default'
    //   1512: swap
    //   1513: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1516: ifeq -> 1531
    //   1519: ldc 'node'
    //   1521: aload #9
    //   1523: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1526: astore #10
    //   1528: goto -> 1538
    //   1531: aload #5
    //   1533: getfield Wz : Ljava/lang/String;
    //   1536: astore #10
    //   1538: aload #5
    //   1540: dup
    //   1541: getfield Wz : Ljava/lang/String;
    //   1544: ldc 'default'
    //   1546: swap
    //   1547: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1550: pop
    //   1551: getfield Wz : Ljava/lang/String;
    //   1554: ldc 'default'
    //   1556: swap
    //   1557: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1560: ifeq -> 1575
    //   1563: ldc 'part'
    //   1565: aload #9
    //   1567: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1570: astore #9
    //   1572: goto -> 1582
    //   1575: aload #5
    //   1577: getfield Wz : Ljava/lang/String;
    //   1580: astore #9
    //   1582: aload_3
    //   1583: aload #5
    //   1585: aload_1
    //   1586: dup
    //   1587: new f/Jp
    //   1590: dup
    //   1591: dup2
    //   1592: dup2
    //   1593: astore #11
    //   1595: aload #10
    //   1597: aload #11
    //   1599: invokespecial <init> : ()V
    //   1602: putfield Qk0 : Ljava/lang/String;
    //   1605: new f/eo
    //   1608: dup
    //   1609: fconst_1
    //   1610: fconst_1
    //   1611: fconst_1
    //   1612: invokespecial <init> : (FFF)V
    //   1615: putfield pB : Lf/eo;
    //   1618: new f/eo
    //   1621: dup
    //   1622: invokespecial <init> : ()V
    //   1625: putfield XD0 : Lf/eo;
    //   1628: new f/TG0
    //   1631: dup
    //   1632: invokespecial <init> : ()V
    //   1635: putfield Ea0 : Lf/TG0;
    //   1638: new f/bj0
    //   1641: dup
    //   1642: astore #10
    //   1644: aload #5
    //   1646: aload #10
    //   1648: aload #9
    //   1650: aload #10
    //   1652: invokespecial <init> : ()V
    //   1655: putfield E00 : Ljava/lang/String;
    //   1658: getfield Ke0 : Ljava/lang/String;
    //   1661: putfield const : Ljava/lang/String;
    //   1664: iconst_1
    //   1665: anewarray f/bj0
    //   1668: dup
    //   1669: iconst_0
    //   1670: aload #10
    //   1672: aastore
    //   1673: putfield Sz : [Lf/bj0;
    //   1676: new f/ow0
    //   1679: dup
    //   1680: dup
    //   1681: astore #5
    //   1683: aload #7
    //   1685: aload #5
    //   1687: aload #9
    //   1689: aload #5
    //   1691: invokespecial <init> : ()V
    //   1694: putfield Qp0 : Ljava/lang/String;
    //   1697: putfield xj : [S
    //   1700: iconst_4
    //   1701: putfield Ff0 : I
    //   1704: new f/mZ
    //   1707: dup
    //   1708: dup
    //   1709: astore #7
    //   1711: aload #12
    //   1713: aload #7
    //   1715: aload #8
    //   1717: aload #7
    //   1719: invokespecial <init> : ()V
    //   1722: ldc f/lw0
    //   1724: invokevirtual Ib : (Ljava/lang/Class;)[Ljava/lang/Object;
    //   1727: checkcast [Lf/lw0;
    //   1730: putfield e7 : [Lf/lw0;
    //   1733: putfield qL0 : [F
    //   1736: iconst_1
    //   1737: anewarray f/ow0
    //   1740: dup
    //   1741: iconst_0
    //   1742: aload #5
    //   1744: aastore
    //   1745: putfield i2 : [Lf/ow0;
    //   1748: getfield nG0 : Lf/fQ;
    //   1751: aload #11
    //   1753: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1756: getfield Lg : Lf/fQ;
    //   1759: aload #7
    //   1761: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1764: getfield Ke0 : Ljava/lang/String;
    //   1767: astore #5
    //   1769: getfield Bm0 : Lf/fQ;
    //   1772: invokevirtual r30 : ()Lf/Hc0;
    //   1775: astore #7
    //   1777: aload #7
    //   1779: invokevirtual hasNext : ()Z
    //   1782: ifeq -> 1810
    //   1785: aload #7
    //   1787: invokevirtual next : ()Ljava/lang/Object;
    //   1790: checkcast f/QD
    //   1793: dup
    //   1794: astore #8
    //   1796: getfield KJ0 : Ljava/lang/String;
    //   1799: aload #5
    //   1801: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1804: ifeq -> 1777
    //   1807: goto -> 1849
    //   1810: aload_3
    //   1811: new f/QD
    //   1814: dup
    //   1815: dup
    //   1816: astore #8
    //   1818: aload #5
    //   1820: aload #8
    //   1822: invokespecial <init> : ()V
    //   1825: putfield KJ0 : Ljava/lang/String;
    //   1828: new com/badlogic/gdx/graphics/Color
    //   1831: dup
    //   1832: getstatic com/badlogic/gdx/graphics/Color.WHITE : Lcom/badlogic/gdx/graphics/Color;
    //   1835: invokespecial <init> : (Lcom/badlogic/gdx/graphics/Color;)V
    //   1838: putfield sK : Lcom/badlogic/gdx/graphics/Color;
    //   1841: getfield Bm0 : Lf/fQ;
    //   1844: aload #8
    //   1846: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1849: aload_1
    //   1850: getfield ID : Lf/fQ;
    //   1853: aload #8
    //   1855: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   1858: iinc #2, 1
    //   1861: goto -> 1021
    //   1864: aload_0
    //   1865: getfield Nt : Lf/G3;
    //   1868: dup
    //   1869: astore_2
    //   1870: getfield NB0 : I
    //   1873: ifle -> 1881
    //   1876: aload_2
    //   1877: iconst_0
    //   1878: putfield NB0 : I
    //   1881: aload_0
    //   1882: getfield NR : Lf/G3;
    //   1885: dup
    //   1886: astore_2
    //   1887: getfield NB0 : I
    //   1890: ifle -> 1898
    //   1893: aload_2
    //   1894: iconst_0
    //   1895: putfield NB0 : I
    //   1898: aload_0
    //   1899: getfield zx0 : Lf/G3;
    //   1902: dup
    //   1903: astore_2
    //   1904: getfield NB0 : I
    //   1907: ifle -> 1915
    //   1910: aload_2
    //   1911: iconst_0
    //   1912: putfield NB0 : I
    //   1915: aload_0
    //   1916: getfield g7 : Lf/fQ;
    //   1919: dup
    //   1920: astore_0
    //   1921: getfield Z8 : I
    //   1924: ifle -> 1937
    //   1927: aload_0
    //   1928: invokevirtual clear : ()V
    //   1931: goto -> 1937
    //   1934: pop
    //   1935: aconst_null
    //   1936: astore_1
    //   1937: aload_1
    //   1938: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 24
    //   #3	-> 874
    //   #4	-> 948
    //   #5	-> 1519
    //   #6	-> 1533
    //   #7	-> 1563
    //   #8	-> 1577
    //   #9	-> 1769
    //   #10	-> 1850
    //   #11	-> 1878
    //   #12	-> 1882
    //   #13	-> 1895
    //   #14	-> 1899
    //   #15	-> 1912
    //   #16	-> 1916
    // Exception table:
    //   from	to	target	type
    //   77	82	1934	java/io/IOException
    //   88	95	1934	java/io/IOException
    //   98	99	1934	java/io/IOException
    //   106	113	1934	java/io/IOException
    //   119	130	1934	java/io/IOException
    //   148	155	1934	java/io/IOException
    //   159	193	1934	java/io/IOException
    //   195	197	1934	java/io/IOException
    //   202	210	1934	java/io/IOException
    //   215	249	1934	java/io/IOException
    //   251	277	1934	java/io/IOException
    //   282	301	1934	java/io/IOException
    //   307	314	1934	java/io/IOException
    //   320	327	1934	java/io/IOException
    //   329	339	1934	java/io/IOException
    //   346	351	1934	java/io/IOException
    //   356	361	1934	java/io/IOException
    //   366	378	1934	java/io/IOException
    //   381	383	1934	java/io/IOException
    //   385	405	1934	java/io/IOException
    //   415	428	1934	java/io/IOException
    //   430	450	1934	java/io/IOException
    //   454	461	1934	java/io/IOException
    //   470	483	1934	java/io/IOException
    //   485	502	1934	java/io/IOException
    //   514	520	1934	java/io/IOException
    //   523	525	1934	java/io/IOException
    //   527	547	1934	java/io/IOException
    //   551	558	1934	java/io/IOException
    //   560	580	1934	java/io/IOException
    //   584	591	1934	java/io/IOException
    //   594	601	1934	java/io/IOException
    //   603	620	1934	java/io/IOException
    //   632	638	1934	java/io/IOException
    //   641	643	1934	java/io/IOException
    //   645	665	1934	java/io/IOException
    //   669	676	1934	java/io/IOException
    //   678	698	1934	java/io/IOException
    //   702	709	1934	java/io/IOException
    //   712	719	1934	java/io/IOException
    //   721	744	1934	java/io/IOException
    //   746	749	1934	java/io/IOException
    //   772	781	1934	java/io/IOException
    //   784	811	1934	java/io/IOException
    //   814	817	1934	java/io/IOException
    //   821	823	1934	java/io/IOException
    //   828	855	1934	java/io/IOException
    //   859	863	1934	java/io/IOException
    //   868	880	1934	java/io/IOException
    //   882	887	1934	java/io/IOException
    //   890	898	1934	java/io/IOException
    //   901	909	1934	java/io/IOException
    //   919	923	1934	java/io/IOException
    //   926	939	1934	java/io/IOException
    //   946	951	1934	java/io/IOException
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZW.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */