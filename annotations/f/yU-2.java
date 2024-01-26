package f;

public class yU extends Bs implements Cloneable {
  public int rB0 = 20;
  
  public int TH;
  
  public int O90 = 0;
  
  public short[][][][] nK;
  
  public COn zL0;
  
  public boolean Yz0 = false;
  
  public yU(HI paramHI, short paramShort, T7 paramT7) {
    super(paramHI, paramShort, paramT7);
    if (paramHI.bO() == 3)
      this.rB0 = 16; 
    this.ar0 = 32;
    this.Rc0 = 32;
  }
  
  public yU(yU paramyU) {
    super(paramyU);
    this.nK = paramyU.nK;
    this.ar0 = paramyU.ar0;
    this.Rc0 = paramyU.Rc0;
    this.rB0 = paramyU.rB0;
    this.TH = paramyU.TH;
    this.zL0 = paramyU.zL0;
    this.Yz0 = paramyU.Yz0;
    this.O90 = paramyU.O90;
  }
  
  public final void s() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Yz0 : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: dup
    //   10: dup
    //   11: iconst_1
    //   12: putfield Yz0 : Z
    //   15: getfield wX : Lf/T7;
    //   18: iconst_0
    //   19: invokevirtual rb : (Z)Ljava/nio/ByteBuffer;
    //   22: astore_1
    //   23: getfield rM : Lf/HI;
    //   26: invokevirtual bO : ()B
    //   29: dup
    //   30: istore_2
    //   31: aload_1
    //   32: dup
    //   33: dup
    //   34: dup2
    //   35: invokevirtual position : ()I
    //   38: istore_3
    //   39: invokevirtual getInt : ()I
    //   42: istore #4
    //   44: invokevirtual getInt : ()I
    //   47: istore #5
    //   49: invokevirtual getInt : ()I
    //   52: istore #6
    //   54: invokevirtual getInt : ()I
    //   57: pop
    //   58: bipush #52
    //   60: istore #7
    //   62: iconst_3
    //   63: if_icmpeq -> 77
    //   66: aload_1
    //   67: dup
    //   68: invokevirtual getShort : ()S
    //   71: pop
    //   72: invokevirtual getShort : ()S
    //   75: istore #7
    //   77: iload_2
    //   78: aload_0
    //   79: iload #5
    //   81: aload_0
    //   82: iload_3
    //   83: aload_0
    //   84: getfield rB0 : I
    //   87: iadd
    //   88: iload #4
    //   90: iadd
    //   91: dup
    //   92: istore_3
    //   93: iload #5
    //   95: aload_0
    //   96: iload_3
    //   97: putfield dd0 : I
    //   100: iadd
    //   101: dup
    //   102: istore_3
    //   103: iload #6
    //   105: aload_0
    //   106: iload_3
    //   107: putfield L8 : I
    //   110: iadd
    //   111: putfield TH : I
    //   114: bipush #48
    //   116: idiv
    //   117: putfield O90 : I
    //   120: iconst_3
    //   121: if_icmpeq -> 167
    //   124: aload_0
    //   125: dup
    //   126: dup2
    //   127: dup2
    //   128: aload_1
    //   129: dup
    //   130: invokevirtual position : ()I
    //   133: iload #7
    //   135: iadd
    //   136: invokevirtual position : (I)Ljava/nio/Buffer;
    //   139: pop
    //   140: getfield L8 : I
    //   143: iload #7
    //   145: iadd
    //   146: putfield L8 : I
    //   149: getfield dd0 : I
    //   152: iload #7
    //   154: iadd
    //   155: putfield dd0 : I
    //   158: getfield TH : I
    //   161: iload #7
    //   163: iadd
    //   164: putfield TH : I
    //   167: aload_0
    //   168: getfield ar0 : I
    //   171: aload_0
    //   172: getfield Rc0 : I
    //   175: multianewarray[[S 2
    //   179: astore_3
    //   180: iconst_0
    //   181: istore #4
    //   183: iload #4
    //   185: aload_0
    //   186: getfield Rc0 : I
    //   189: if_icmpge -> 227
    //   192: iconst_0
    //   193: istore #5
    //   195: iload #5
    //   197: aload_0
    //   198: getfield ar0 : I
    //   201: if_icmpge -> 221
    //   204: aload_3
    //   205: iload #5
    //   207: aaload
    //   208: iload #4
    //   210: aload_1
    //   211: invokevirtual getShort : ()S
    //   214: sastore
    //   215: iinc #5, 1
    //   218: goto -> 195
    //   221: iinc #4, 1
    //   224: goto -> 183
    //   227: iload_2
    //   228: aload_0
    //   229: aload_1
    //   230: aload_0
    //   231: getfield TH : I
    //   234: invokevirtual position : (I)Ljava/nio/Buffer;
    //   237: pop
    //   238: new f/COn
    //   241: dup
    //   242: dup
    //   243: astore #4
    //   245: iload_2
    //   246: aload_0
    //   247: getfield MV : S
    //   250: aload_1
    //   251: swap
    //   252: invokespecial <init> : (BLjava/nio/ByteBuffer;S)V
    //   255: putfield zL0 : Lf/COn;
    //   258: iconst_3
    //   259: if_icmpne -> 611
    //   262: aload_0
    //   263: getfield MV : S
    //   266: dup
    //   267: istore_1
    //   268: bipush #28
    //   270: if_icmpeq -> 461
    //   273: iload_1
    //   274: sipush #171
    //   277: if_icmpeq -> 413
    //   280: iload_1
    //   281: sipush #188
    //   284: if_icmpeq -> 332
    //   287: iload_1
    //   288: sipush #235
    //   291: if_icmpeq -> 297
    //   294: goto -> 1424
    //   297: bipush #24
    //   299: istore_1
    //   300: iconst_0
    //   301: istore #5
    //   303: iload #5
    //   305: bipush #32
    //   307: if_icmpge -> 1424
    //   310: aload #4
    //   312: getfield BG : Lf/ib0;
    //   315: iload #5
    //   317: bipush #32
    //   319: imul
    //   320: iload_1
    //   321: iadd
    //   322: fconst_0
    //   323: invokevirtual ma0 : (IF)V
    //   326: iinc #5, 1
    //   329: goto -> 303
    //   332: fconst_0
    //   333: fstore_1
    //   334: iconst_0
    //   335: istore #5
    //   337: iload #5
    //   339: aload #4
    //   341: getfield j8 : I
    //   344: if_icmpge -> 1424
    //   347: iconst_0
    //   348: istore #6
    //   350: iload #6
    //   352: bipush #32
    //   354: if_icmpge -> 407
    //   357: iconst_0
    //   358: istore #7
    //   360: iload #7
    //   362: bipush #32
    //   364: if_icmpge -> 401
    //   367: aload #4
    //   369: getfield BG : Lf/ib0;
    //   372: iload #7
    //   374: iload #5
    //   376: sipush #1024
    //   379: imul
    //   380: istore #8
    //   382: bipush #32
    //   384: imul
    //   385: iload #8
    //   387: iadd
    //   388: iload #6
    //   390: iadd
    //   391: fload_1
    //   392: invokevirtual ma0 : (IF)V
    //   395: iinc #7, 1
    //   398: goto -> 360
    //   401: iinc #6, 1
    //   404: goto -> 350
    //   407: iinc #5, 1
    //   410: goto -> 337
    //   413: bipush #6
    //   415: istore_1
    //   416: iload_1
    //   417: bipush #31
    //   419: if_icmpgt -> 1424
    //   422: bipush #28
    //   424: istore #5
    //   426: iload #5
    //   428: bipush #32
    //   430: if_icmpge -> 455
    //   433: aload #4
    //   435: getfield BG : Lf/ib0;
    //   438: iload #5
    //   440: bipush #32
    //   442: imul
    //   443: iload_1
    //   444: iadd
    //   445: fconst_1
    //   446: invokevirtual ma0 : (IF)V
    //   449: iinc #5, 1
    //   452: goto -> 426
    //   455: iinc #1, 1
    //   458: goto -> 416
    //   461: bipush #11
    //   463: istore_1
    //   464: iload_1
    //   465: bipush #18
    //   467: if_icmpgt -> 502
    //   470: aload #4
    //   472: getfield BG : Lf/ib0;
    //   475: aload #4
    //   477: iload_1
    //   478: dup
    //   479: sipush #704
    //   482: iadd
    //   483: istore #5
    //   485: bipush #23
    //   487: invokevirtual S20 : (II)F
    //   490: iload #5
    //   492: swap
    //   493: invokevirtual ma0 : (IF)V
    //   496: iinc #1, 1
    //   499: goto -> 464
    //   502: bipush #11
    //   504: istore_1
    //   505: iload_1
    //   506: bipush #18
    //   508: if_icmpgt -> 562
    //   511: bipush #29
    //   513: istore #5
    //   515: iload #5
    //   517: bipush #31
    //   519: if_icmpgt -> 556
    //   522: aload #4
    //   524: getfield BG : Lf/ib0;
    //   527: aload #4
    //   529: iload_1
    //   530: iload #5
    //   532: bipush #32
    //   534: imul
    //   535: iload_1
    //   536: iadd
    //   537: istore #6
    //   539: bipush #28
    //   541: invokevirtual S20 : (II)F
    //   544: iload #6
    //   546: swap
    //   547: invokevirtual ma0 : (IF)V
    //   550: iinc #5, 1
    //   553: goto -> 515
    //   556: iinc #1, 1
    //   559: goto -> 505
    //   562: bipush #21
    //   564: istore_1
    //   565: iload_1
    //   566: bipush #22
    //   568: if_icmpgt -> 1424
    //   571: bipush #24
    //   573: istore #5
    //   575: iload #5
    //   577: bipush #27
    //   579: if_icmpgt -> 605
    //   582: aload #4
    //   584: getfield BG : Lf/ib0;
    //   587: iload #5
    //   589: bipush #32
    //   591: imul
    //   592: iload_1
    //   593: iadd
    //   594: ldc 3.0
    //   596: invokevirtual ma0 : (IF)V
    //   599: iinc #5, 1
    //   602: goto -> 575
    //   605: iinc #1, 1
    //   608: goto -> 565
    //   611: iload_2
    //   612: iconst_4
    //   613: if_icmpne -> 1424
    //   616: aload_0
    //   617: getfield MV : S
    //   620: lookupswitch default -> 808, 17 -> 1413, 81 -> 1312, 84 -> 1299, 141 -> 1285, 237 -> 1244, 254 -> 1206, 261 -> 1146, 360 -> 1123, 397 -> 1111, 404 -> 1098, 414 -> 1086, 429 -> 1073, 481 -> 1011, 523 -> 981, 529 -> 968, 558 -> 955, 583 -> 931, 584 -> 906, 604 -> 894, 608 -> 848, 611 -> 835, 625 -> 811
    //   808: goto -> 1424
    //   811: aload_0
    //   812: aload #4
    //   814: iconst_0
    //   815: bipush #25
    //   817: fconst_2
    //   818: invokevirtual lpT5 : (IIF)V
    //   821: getfield zL0 : Lf/COn;
    //   824: bipush #18
    //   826: bipush #26
    //   828: fconst_1
    //   829: invokevirtual lpT5 : (IIF)V
    //   832: goto -> 1424
    //   835: aload #4
    //   837: bipush #11
    //   839: bipush #18
    //   841: fconst_2
    //   842: invokevirtual lpT5 : (IIF)V
    //   845: goto -> 1424
    //   848: bipush #6
    //   850: istore_1
    //   851: iload_1
    //   852: bipush #8
    //   854: if_icmpgt -> 1424
    //   857: iconst_0
    //   858: istore #5
    //   860: iload #5
    //   862: iconst_1
    //   863: if_icmpgt -> 888
    //   866: aload #4
    //   868: getfield BG : Lf/ib0;
    //   871: iload #5
    //   873: bipush #32
    //   875: imul
    //   876: iload_1
    //   877: iadd
    //   878: fconst_1
    //   879: invokevirtual ma0 : (IF)V
    //   882: iinc #5, 1
    //   885: goto -> 860
    //   888: iinc #1, 1
    //   891: goto -> 851
    //   894: aload #4
    //   896: bipush #18
    //   898: iconst_1
    //   899: fconst_1
    //   900: invokevirtual lpT5 : (IIF)V
    //   903: goto -> 1424
    //   906: aload_0
    //   907: aload #4
    //   909: bipush #6
    //   911: iconst_5
    //   912: ldc 7.5
    //   914: invokevirtual lpT5 : (IIF)V
    //   917: getfield zL0 : Lf/COn;
    //   920: bipush #7
    //   922: iconst_5
    //   923: ldc 7.5
    //   925: invokevirtual lpT5 : (IIF)V
    //   928: goto -> 1424
    //   931: aload_0
    //   932: aload #4
    //   934: bipush #18
    //   936: iconst_1
    //   937: ldc 7.0
    //   939: invokevirtual lpT5 : (IIF)V
    //   942: getfield zL0 : Lf/COn;
    //   945: iconst_2
    //   946: iconst_1
    //   947: ldc 7.0
    //   949: invokevirtual lpT5 : (IIF)V
    //   952: goto -> 1424
    //   955: aload #4
    //   957: bipush #31
    //   959: bipush #13
    //   961: fconst_0
    //   962: invokevirtual lpT5 : (IIF)V
    //   965: goto -> 1424
    //   968: aload #4
    //   970: iconst_2
    //   971: bipush #10
    //   973: ldc 3.0
    //   975: invokevirtual lpT5 : (IIF)V
    //   978: goto -> 1424
    //   981: bipush #7
    //   983: istore_1
    //   984: iload_1
    //   985: bipush #12
    //   987: if_icmpgt -> 1424
    //   990: aload #4
    //   992: getfield BG : Lf/ib0;
    //   995: iload_1
    //   996: sipush #992
    //   999: iadd
    //   1000: ldc 7.0
    //   1002: invokevirtual ma0 : (IF)V
    //   1005: iinc #1, 1
    //   1008: goto -> 984
    //   1011: bipush #6
    //   1013: istore_1
    //   1014: iload_1
    //   1015: bipush #8
    //   1017: if_icmpgt -> 1424
    //   1020: bipush #26
    //   1022: istore #5
    //   1024: iload #5
    //   1026: bipush #29
    //   1028: if_icmpgt -> 1067
    //   1031: aload #4
    //   1033: getfield BG : Lf/ib0;
    //   1036: aload #4
    //   1038: iload_1
    //   1039: iload #5
    //   1041: bipush #32
    //   1043: imul
    //   1044: iload_1
    //   1045: iadd
    //   1046: istore #6
    //   1048: iconst_1
    //   1049: isub
    //   1050: iload #5
    //   1052: invokevirtual S20 : (II)F
    //   1055: iload #6
    //   1057: swap
    //   1058: invokevirtual ma0 : (IF)V
    //   1061: iinc #5, 1
    //   1064: goto -> 1024
    //   1067: iinc #1, 1
    //   1070: goto -> 1014
    //   1073: aload #4
    //   1075: bipush #6
    //   1077: bipush #27
    //   1079: fconst_1
    //   1080: invokevirtual lpT5 : (IIF)V
    //   1083: goto -> 1424
    //   1086: aload #4
    //   1088: bipush #6
    //   1090: iconst_2
    //   1091: fconst_1
    //   1092: invokevirtual lpT5 : (IIF)V
    //   1095: goto -> 1424
    //   1098: aload #4
    //   1100: bipush #7
    //   1102: bipush #11
    //   1104: fconst_1
    //   1105: invokevirtual lpT5 : (IIF)V
    //   1108: goto -> 1424
    //   1111: aload #4
    //   1113: iconst_4
    //   1114: bipush #8
    //   1116: fconst_1
    //   1117: invokevirtual lpT5 : (IIF)V
    //   1120: goto -> 1424
    //   1123: aload_0
    //   1124: aload #4
    //   1126: bipush #6
    //   1128: iconst_2
    //   1129: fconst_1
    //   1130: invokevirtual lpT5 : (IIF)V
    //   1133: getfield zL0 : Lf/COn;
    //   1136: bipush #8
    //   1138: iconst_2
    //   1139: fconst_1
    //   1140: invokevirtual lpT5 : (IIF)V
    //   1143: goto -> 1424
    //   1146: iconst_4
    //   1147: istore_1
    //   1148: iload_1
    //   1149: bipush #20
    //   1151: if_icmpgt -> 1424
    //   1154: bipush #23
    //   1156: istore #5
    //   1158: iload #5
    //   1160: bipush #24
    //   1162: if_icmpgt -> 1200
    //   1165: aload #4
    //   1167: getfield BG : Lf/ib0;
    //   1170: aload #4
    //   1172: iload_1
    //   1173: iload #5
    //   1175: dup
    //   1176: bipush #32
    //   1178: imul
    //   1179: iload_1
    //   1180: iadd
    //   1181: istore #6
    //   1183: iconst_1
    //   1184: isub
    //   1185: invokevirtual S20 : (II)F
    //   1188: iload #6
    //   1190: swap
    //   1191: invokevirtual ma0 : (IF)V
    //   1194: iinc #5, 1
    //   1197: goto -> 1158
    //   1200: iinc #1, 1
    //   1203: goto -> 1148
    //   1206: iconst_2
    //   1207: istore_1
    //   1208: iload_1
    //   1209: bipush #24
    //   1211: if_icmpgt -> 1424
    //   1214: aload #4
    //   1216: getfield BG : Lf/ib0;
    //   1219: aload #4
    //   1221: iload_1
    //   1222: dup
    //   1223: bipush #64
    //   1225: iadd
    //   1226: istore #5
    //   1228: iconst_3
    //   1229: invokevirtual S20 : (II)F
    //   1232: iload #5
    //   1234: swap
    //   1235: invokevirtual ma0 : (IF)V
    //   1238: iinc #1, 1
    //   1241: goto -> 1208
    //   1244: bipush #9
    //   1246: istore_1
    //   1247: iload_1
    //   1248: bipush #13
    //   1250: if_icmpgt -> 1424
    //   1253: aload #4
    //   1255: getfield BG : Lf/ib0;
    //   1258: aload #4
    //   1260: iload_1
    //   1261: dup
    //   1262: sipush #736
    //   1265: iadd
    //   1266: istore #5
    //   1268: bipush #22
    //   1270: invokevirtual S20 : (II)F
    //   1273: iload #5
    //   1275: swap
    //   1276: invokevirtual ma0 : (IF)V
    //   1279: iinc #1, 1
    //   1282: goto -> 1247
    //   1285: aload #4
    //   1287: bipush #18
    //   1289: bipush #14
    //   1291: ldc 0.5
    //   1293: invokevirtual lpT5 : (IIF)V
    //   1296: goto -> 1424
    //   1299: aload #4
    //   1301: iconst_0
    //   1302: bipush #22
    //   1304: ldc 3.0
    //   1306: invokevirtual lpT5 : (IIF)V
    //   1309: goto -> 1424
    //   1312: aload #4
    //   1314: bipush #20
    //   1316: bipush #15
    //   1318: invokevirtual S20 : (II)F
    //   1321: fstore_1
    //   1322: bipush #19
    //   1324: istore #5
    //   1326: iload #5
    //   1328: bipush #31
    //   1330: if_icmpgt -> 1424
    //   1333: iload #5
    //   1335: bipush #21
    //   1337: if_icmplt -> 1373
    //   1340: iconst_4
    //   1341: istore #6
    //   1343: iload #6
    //   1345: bipush #8
    //   1347: if_icmpgt -> 1373
    //   1350: aload #4
    //   1352: getfield BG : Lf/ib0;
    //   1355: iload #6
    //   1357: bipush #32
    //   1359: imul
    //   1360: iload #5
    //   1362: iadd
    //   1363: fload_1
    //   1364: invokevirtual ma0 : (IF)V
    //   1367: iinc #6, 1
    //   1370: goto -> 1343
    //   1373: bipush #9
    //   1375: istore #6
    //   1377: iload #6
    //   1379: bipush #13
    //   1381: if_icmpgt -> 1407
    //   1384: aload #4
    //   1386: getfield BG : Lf/ib0;
    //   1389: iload #6
    //   1391: bipush #32
    //   1393: imul
    //   1394: iload #5
    //   1396: iadd
    //   1397: fload_1
    //   1398: invokevirtual ma0 : (IF)V
    //   1401: iinc #6, 1
    //   1404: goto -> 1377
    //   1407: iinc #5, 1
    //   1410: goto -> 1326
    //   1413: aload #4
    //   1415: bipush #27
    //   1417: bipush #28
    //   1419: ldc 5.0
    //   1421: invokevirtual lpT5 : (IIF)V
    //   1424: aload_0
    //   1425: dup
    //   1426: getfield zL0 : Lf/COn;
    //   1429: getfield j8 : I
    //   1432: aload_0
    //   1433: dup
    //   1434: getfield ar0 : I
    //   1437: istore_1
    //   1438: getfield Rc0 : I
    //   1441: istore #4
    //   1443: iconst_2
    //   1444: iload_1
    //   1445: iload #4
    //   1447: multianewarray[[[[S 4
    //   1451: putfield nK : [[[[S
    //   1454: iconst_0
    //   1455: istore_1
    //   1456: iload_1
    //   1457: aload_0
    //   1458: getfield zL0 : Lf/COn;
    //   1461: getfield j8 : I
    //   1464: if_icmpge -> 2082
    //   1467: iconst_0
    //   1468: istore #4
    //   1470: iload #4
    //   1472: aload_0
    //   1473: getfield Rc0 : I
    //   1476: if_icmpge -> 2076
    //   1479: iconst_0
    //   1480: istore #5
    //   1482: iload #5
    //   1484: aload_0
    //   1485: getfield ar0 : I
    //   1488: if_icmpge -> 2070
    //   1491: aload_0
    //   1492: aload_3
    //   1493: iload #5
    //   1495: aaload
    //   1496: iload #4
    //   1498: saload
    //   1499: dup
    //   1500: sipush #255
    //   1503: iand
    //   1504: i2s
    //   1505: istore #6
    //   1507: bipush #8
    //   1509: ishr
    //   1510: sipush #255
    //   1513: iand
    //   1514: i2s
    //   1515: istore #7
    //   1517: getfield zL0 : Lf/COn;
    //   1520: getfield j8 : I
    //   1523: iconst_1
    //   1524: if_icmple -> 2014
    //   1527: iload #6
    //   1529: bipush #34
    //   1531: if_icmpeq -> 1938
    //   1534: iload #6
    //   1536: bipush #122
    //   1538: if_icmpeq -> 1867
    //   1541: iload #6
    //   1543: bipush #114
    //   1545: if_icmpeq -> 1799
    //   1548: iload #6
    //   1550: bipush #115
    //   1552: if_icmpeq -> 1731
    //   1555: iload #6
    //   1557: bipush #117
    //   1559: if_icmpeq -> 1658
    //   1562: iload #6
    //   1564: bipush #118
    //   1566: if_icmpeq -> 1867
    //   1569: iload #6
    //   1571: bipush #124
    //   1573: if_icmpeq -> 1731
    //   1576: iload #6
    //   1578: bipush #125
    //   1580: if_icmpeq -> 1586
    //   1583: goto -> 2014
    //   1586: iconst_0
    //   1587: istore #8
    //   1589: ldc -999.0
    //   1591: fstore #9
    //   1593: iconst_0
    //   1594: istore #10
    //   1596: iload #10
    //   1598: aload_0
    //   1599: getfield zL0 : Lf/COn;
    //   1602: dup
    //   1603: astore #11
    //   1605: getfield j8 : I
    //   1608: if_icmpge -> 1645
    //   1611: aload #11
    //   1613: iload #10
    //   1615: iload #5
    //   1617: iload #4
    //   1619: invokevirtual Ne : (III)F
    //   1622: dup
    //   1623: fstore #11
    //   1625: fload #9
    //   1627: fcmpl
    //   1628: ifle -> 1639
    //   1631: iload #10
    //   1633: fload #11
    //   1635: fstore #9
    //   1637: istore #8
    //   1639: iinc #10, 1
    //   1642: goto -> 1596
    //   1645: iload_1
    //   1646: iload #8
    //   1648: if_icmpeq -> 2014
    //   1651: bipush #33
    //   1653: istore #6
    //   1655: goto -> 2014
    //   1658: iconst_0
    //   1659: istore #8
    //   1661: ldc -999.0
    //   1663: fstore #9
    //   1665: iconst_0
    //   1666: istore #10
    //   1668: iload #10
    //   1670: aload_0
    //   1671: getfield zL0 : Lf/COn;
    //   1674: dup
    //   1675: astore #11
    //   1677: getfield j8 : I
    //   1680: if_icmpge -> 1717
    //   1683: aload #11
    //   1685: iload #10
    //   1687: iload #5
    //   1689: iload #4
    //   1691: invokevirtual Ne : (III)F
    //   1694: dup
    //   1695: fstore #11
    //   1697: fload #9
    //   1699: fcmpl
    //   1700: ifle -> 1711
    //   1703: iload #10
    //   1705: fload #11
    //   1707: fstore #9
    //   1709: istore #8
    //   1711: iinc #10, 1
    //   1714: goto -> 1668
    //   1717: iload_1
    //   1718: iload #8
    //   1720: if_icmpeq -> 2014
    //   1723: sipush #168
    //   1726: istore #6
    //   1728: goto -> 2014
    //   1731: iconst_0
    //   1732: istore #8
    //   1734: ldc -999.0
    //   1736: fstore #9
    //   1738: iconst_0
    //   1739: istore #10
    //   1741: iload #10
    //   1743: aload_0
    //   1744: getfield zL0 : Lf/COn;
    //   1747: dup
    //   1748: astore #11
    //   1750: getfield j8 : I
    //   1753: if_icmpge -> 1790
    //   1756: aload #11
    //   1758: iload #10
    //   1760: iload #5
    //   1762: iload #4
    //   1764: invokevirtual Ne : (III)F
    //   1767: dup
    //   1768: fstore #11
    //   1770: fload #9
    //   1772: fcmpl
    //   1773: ifle -> 1784
    //   1776: iload #10
    //   1778: fload #11
    //   1780: fstore #9
    //   1782: istore #8
    //   1784: iinc #10, 1
    //   1787: goto -> 1741
    //   1790: iload_1
    //   1791: iload #8
    //   1793: if_icmpeq -> 2014
    //   1796: goto -> 2010
    //   1799: iconst_0
    //   1800: istore #8
    //   1802: ldc -999.0
    //   1804: fstore #9
    //   1806: iconst_0
    //   1807: istore #10
    //   1809: iload #10
    //   1811: aload_0
    //   1812: getfield zL0 : Lf/COn;
    //   1815: dup
    //   1816: astore #11
    //   1818: getfield j8 : I
    //   1821: if_icmpge -> 1858
    //   1824: aload #11
    //   1826: iload #10
    //   1828: iload #5
    //   1830: iload #4
    //   1832: invokevirtual Ne : (III)F
    //   1835: dup
    //   1836: fstore #11
    //   1838: fload #9
    //   1840: fcmpl
    //   1841: ifle -> 1852
    //   1844: iload #10
    //   1846: fload #11
    //   1848: fstore #9
    //   1850: istore #8
    //   1852: iinc #10, 1
    //   1855: goto -> 1809
    //   1858: iload_1
    //   1859: iload #8
    //   1861: if_icmpeq -> 2014
    //   1864: goto -> 2003
    //   1867: iconst_0
    //   1868: istore #8
    //   1870: ldc -999.0
    //   1872: fstore #9
    //   1874: iconst_0
    //   1875: istore #10
    //   1877: iload #10
    //   1879: aload_0
    //   1880: getfield zL0 : Lf/COn;
    //   1883: dup
    //   1884: astore #11
    //   1886: getfield j8 : I
    //   1889: if_icmpge -> 1926
    //   1892: aload #11
    //   1894: iload #10
    //   1896: iload #5
    //   1898: iload #4
    //   1900: invokevirtual Ne : (III)F
    //   1903: dup
    //   1904: fstore #11
    //   1906: fload #9
    //   1908: fcmpl
    //   1909: ifle -> 1920
    //   1912: iload #10
    //   1914: fload #11
    //   1916: fstore #9
    //   1918: istore #8
    //   1920: iinc #10, 1
    //   1923: goto -> 1877
    //   1926: iload_1
    //   1927: iload #8
    //   1929: if_icmpeq -> 2014
    //   1932: iconst_0
    //   1933: istore #6
    //   1935: goto -> 2014
    //   1938: iconst_0
    //   1939: istore #6
    //   1941: ldc -999.0
    //   1943: fstore #8
    //   1945: iconst_0
    //   1946: istore #9
    //   1948: iload #9
    //   1950: aload_0
    //   1951: getfield zL0 : Lf/COn;
    //   1954: dup
    //   1955: astore #10
    //   1957: getfield j8 : I
    //   1960: if_icmpge -> 1997
    //   1963: aload #10
    //   1965: iload #9
    //   1967: iload #5
    //   1969: iload #4
    //   1971: invokevirtual Ne : (III)F
    //   1974: dup
    //   1975: fstore #10
    //   1977: fload #8
    //   1979: fcmpl
    //   1980: ifle -> 1991
    //   1983: iload #9
    //   1985: fload #10
    //   1987: fstore #8
    //   1989: istore #6
    //   1991: iinc #9, 1
    //   1994: goto -> 1948
    //   1997: iload_1
    //   1998: iload #6
    //   2000: if_icmpeq -> 2010
    //   2003: bipush #8
    //   2005: istore #6
    //   2007: goto -> 2014
    //   2010: bipush #21
    //   2012: istore #6
    //   2014: iload_2
    //   2015: iconst_4
    //   2016: if_icmpne -> 2037
    //   2019: iload #6
    //   2021: bipush #62
    //   2023: if_icmpne -> 2037
    //   2026: iload #7
    //   2028: sipush #128
    //   2031: if_icmpne -> 2037
    //   2034: iconst_0
    //   2035: istore #6
    //   2037: aload_0
    //   2038: getfield nK : [[[[S
    //   2041: iload_1
    //   2042: aaload
    //   2043: dup
    //   2044: iconst_0
    //   2045: aaload
    //   2046: iload #5
    //   2048: aaload
    //   2049: iload #4
    //   2051: iload #6
    //   2053: sastore
    //   2054: iconst_1
    //   2055: aaload
    //   2056: iload #5
    //   2058: aaload
    //   2059: iload #4
    //   2061: iload #7
    //   2063: sastore
    //   2064: iinc #5, 1
    //   2067: goto -> 1482
    //   2070: iinc #4, 1
    //   2073: goto -> 1470
    //   2076: iinc #1, 1
    //   2079: goto -> 1456
    //   2082: iload_2
    //   2083: iconst_3
    //   2084: if_icmpeq -> 2188
    //   2087: iload_2
    //   2088: iconst_4
    //   2089: if_icmpeq -> 2095
    //   2092: goto -> 2192
    //   2095: aload_0
    //   2096: getfield MV : S
    //   2099: dup
    //   2100: istore_1
    //   2101: sipush #478
    //   2104: if_icmpeq -> 2171
    //   2107: iload_1
    //   2108: sipush #493
    //   2111: if_icmpeq -> 2142
    //   2114: iload_1
    //   2115: sipush #495
    //   2118: if_icmpeq -> 2124
    //   2121: goto -> 2192
    //   2124: aload_0
    //   2125: getfield nK : [[[[S
    //   2128: iconst_0
    //   2129: aaload
    //   2130: iconst_0
    //   2131: aaload
    //   2132: bipush #15
    //   2134: aaload
    //   2135: bipush #9
    //   2137: iconst_0
    //   2138: sastore
    //   2139: goto -> 2192
    //   2142: aload_0
    //   2143: getfield nK : [[[[S
    //   2146: iconst_0
    //   2147: aaload
    //   2148: iconst_1
    //   2149: aaload
    //   2150: dup
    //   2151: iconst_3
    //   2152: aaload
    //   2153: bipush #10
    //   2155: sipush #128
    //   2158: sastore
    //   2159: bipush #13
    //   2161: aaload
    //   2162: bipush #10
    //   2164: sipush #128
    //   2167: sastore
    //   2168: goto -> 2192
    //   2171: aload_0
    //   2172: getfield nK : [[[[S
    //   2175: iconst_0
    //   2176: aaload
    //   2177: iconst_0
    //   2178: aaload
    //   2179: bipush #6
    //   2181: aaload
    //   2182: iconst_3
    //   2183: iconst_0
    //   2184: sastore
    //   2185: goto -> 2192
    //   2188: aload_0
    //   2189: invokevirtual Nw0 : ()V
    //   2192: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 19
    //   #2	-> 23
    //   #3	-> 312
    //   #4	-> 323
    //   #5	-> 341
    //   #6	-> 369
    //   #7	-> 435
    //   #8	-> 472
    //   #9	-> 617
    //   #10	-> 868
    //   #11	-> 900
    //   #12	-> 992
    //   #13	-> 1002
    //   #14	-> 1033
    //   #15	-> 1080
    //   #16	-> 1167
    //   #17	-> 1216
    //   #18	-> 1229
    //   #19	-> 1255
    //   #20	-> 1270
    //   #21	-> 1293
    //   #22	-> 1318
    //   #23	-> 1352
    //   #24	-> 1421
    //   #25	-> 1429
    //   #26	-> 1434
    //   #27	-> 1461
    //   #28	-> 1473
    //   #29	-> 1520
    //   #30	-> 1599
    //   #31	-> 1605
    //   #32	-> 1619
    //   #33	-> 1677
    //   #34	-> 1691
    //   #35	-> 1750
    //   #36	-> 1764
    //   #37	-> 1818
    //   #38	-> 1832
    //   #39	-> 1886
    //   #40	-> 1900
    //   #41	-> 1957
    //   #42	-> 1971
    //   #43	-> 2096
    //   #44	-> 2189
  }
  
  public final short[][][][] Nb0() {
    return this.nK;
  }
  
  public final void Nw0() {
    short s;
    if ((s = this.MV) != 225) {
      if (s != 274) {
        if (s == 333)
          this.zL0.lpT5(2, 2, 0.0F); 
      } else {
        short[][][][] arrayOfShort;
        for (s = 0; s < (arrayOfShort = this.nK).length; s++)
          arrayOfShort[s][0][10][13] = 0; 
      } 
    } else {
      for (s = 0; s < 4; s++) {
        for (byte b = 0; b < 32; b++) {
          byte b1 = 0;
          while (true)
            b1++; 
          continue;
        } 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */