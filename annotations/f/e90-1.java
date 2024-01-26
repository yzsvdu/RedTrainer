package f;

public class e90 extends BI0 {
  public static int[][][] to = new int[2][][];
  
  public static int[][] pZ;
  
  public static synchronized int Xe(m6 paramm6, Object paramObject, float[][] paramArrayOffloat, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/Wu
    //   4: dup
    //   5: astore_1
    //   6: getfield vT : Lf/bC;
    //   9: dup
    //   10: astore #5
    //   12: aload_1
    //   13: aload #5
    //   15: getfield bF : I
    //   18: istore #6
    //   20: getfield K00 : Lf/tF0;
    //   23: getfield PR : I
    //   26: istore #7
    //   28: getfield vK : I
    //   31: aload #5
    //   33: getfield Oi : I
    //   36: isub
    //   37: iload #6
    //   39: idiv
    //   40: dup
    //   41: istore #8
    //   43: iload #7
    //   45: iadd
    //   46: iconst_1
    //   47: isub
    //   48: iload #7
    //   50: idiv
    //   51: istore #9
    //   53: getstatic f/e90.to : [[[I
    //   56: arraylength
    //   57: iload_3
    //   58: if_icmpge -> 68
    //   61: iload_3
    //   62: anewarray [[I
    //   65: putstatic f/e90.to : [[[I
    //   68: iconst_0
    //   69: istore #10
    //   71: iload #10
    //   73: iload_3
    //   74: if_icmpge -> 117
    //   77: getstatic f/e90.to : [[[I
    //   80: dup
    //   81: astore #11
    //   83: iload #10
    //   85: aaload
    //   86: dup
    //   87: astore #12
    //   89: ifnull -> 100
    //   92: aload #12
    //   94: arraylength
    //   95: iload #9
    //   97: if_icmpge -> 111
    //   100: aload #11
    //   102: iload #9
    //   104: anewarray [I
    //   107: iload #10
    //   109: swap
    //   110: aastore
    //   111: iinc #10, 1
    //   114: goto -> 71
    //   117: iconst_0
    //   118: istore #9
    //   120: iload #9
    //   122: aload_1
    //   123: getfield hv : I
    //   126: if_icmpge -> 1061
    //   129: iconst_0
    //   130: istore #10
    //   132: iconst_0
    //   133: istore #11
    //   135: iload #10
    //   137: iload #8
    //   139: if_icmpge -> 1055
    //   142: iload #9
    //   144: ifne -> 211
    //   147: iconst_0
    //   148: istore #12
    //   150: iload #12
    //   152: iload_3
    //   153: if_icmpge -> 211
    //   156: aload_1
    //   157: getfield K00 : Lf/tF0;
    //   160: aload_0
    //   161: getfield Nh : Lf/E7;
    //   164: invokevirtual rB : (Lf/E7;)I
    //   167: dup
    //   168: istore #13
    //   170: iconst_m1
    //   171: if_icmpne -> 176
    //   174: iconst_0
    //   175: ireturn
    //   176: getstatic f/e90.to : [[[I
    //   179: dup
    //   180: iload #12
    //   182: swap
    //   183: iload #12
    //   185: aaload
    //   186: iload #11
    //   188: aload_1
    //   189: getfield oa : [[I
    //   192: iload #13
    //   194: aaload
    //   195: aastore
    //   196: aaload
    //   197: iload #11
    //   199: aaload
    //   200: ifnonnull -> 205
    //   203: iconst_0
    //   204: ireturn
    //   205: iinc #12, 1
    //   208: goto -> 150
    //   211: iconst_0
    //   212: istore #12
    //   214: iload #12
    //   216: iload #7
    //   218: if_icmpge -> 1049
    //   221: iload #10
    //   223: iload #8
    //   225: if_icmpge -> 1049
    //   228: iconst_0
    //   229: istore #13
    //   231: iload #13
    //   233: iload_3
    //   234: if_icmpge -> 1040
    //   237: aload #5
    //   239: iload #10
    //   241: iload #6
    //   243: aload #5
    //   245: getfield Oi : I
    //   248: istore #14
    //   250: imul
    //   251: iload #14
    //   253: iadd
    //   254: istore #14
    //   256: getstatic f/e90.to : [[[I
    //   259: iload #13
    //   261: aaload
    //   262: iload #11
    //   264: aaload
    //   265: iload #12
    //   267: iaload
    //   268: istore #15
    //   270: getfield k7 : [I
    //   273: iload #15
    //   275: iaload
    //   276: iconst_1
    //   277: iload #9
    //   279: ishl
    //   280: iand
    //   281: ifeq -> 1034
    //   284: aload_1
    //   285: getfield hc : [Lf/tF0;
    //   288: aload_1
    //   289: getfield T50 : [[I
    //   292: iload #15
    //   294: aaload
    //   295: iload #9
    //   297: iaload
    //   298: aaload
    //   299: dup
    //   300: astore #15
    //   302: ifnull -> 1034
    //   305: iload #4
    //   307: ifne -> 509
    //   310: aload #15
    //   312: iload #6
    //   314: aload #15
    //   316: dup
    //   317: aload_0
    //   318: aload_2
    //   319: iload #13
    //   321: aaload
    //   322: astore #16
    //   324: getfield Nh : Lf/E7;
    //   327: astore #17
    //   329: monitorenter
    //   330: getfield PR : I
    //   333: idiv
    //   334: istore #18
    //   336: getfield i80 : [I
    //   339: arraylength
    //   340: iload #18
    //   342: if_icmpge -> 354
    //   345: aload #15
    //   347: iload #18
    //   349: newarray int
    //   351: putfield i80 : [I
    //   354: iconst_0
    //   355: istore #19
    //   357: iload #19
    //   359: iload #18
    //   361: if_icmpge -> 409
    //   364: aload #15
    //   366: aload #17
    //   368: invokevirtual rB : (Lf/E7;)I
    //   371: dup
    //   372: istore #20
    //   374: iconst_m1
    //   375: if_icmpne -> 387
    //   378: aload #15
    //   380: iconst_m1
    //   381: istore #14
    //   383: monitorexit
    //   384: goto -> 497
    //   387: aload #15
    //   389: getfield i80 : [I
    //   392: iload #19
    //   394: iload #20
    //   396: aload #15
    //   398: getfield PR : I
    //   401: imul
    //   402: iastore
    //   403: iinc #19, 1
    //   406: goto -> 357
    //   409: iconst_0
    //   410: istore #17
    //   412: iconst_0
    //   413: istore #19
    //   415: iload #17
    //   417: aload #15
    //   419: getfield PR : I
    //   422: if_icmpge -> 491
    //   425: iconst_0
    //   426: istore #20
    //   428: iload #20
    //   430: iload #18
    //   432: if_icmpge -> 478
    //   435: aload #16
    //   437: dup
    //   438: iload #14
    //   440: iload #19
    //   442: iadd
    //   443: iload #20
    //   445: iadd
    //   446: dup
    //   447: istore #21
    //   449: faload
    //   450: aload #15
    //   452: getfield eS : [F
    //   455: aload #15
    //   457: getfield i80 : [I
    //   460: iload #20
    //   462: iaload
    //   463: iload #17
    //   465: iadd
    //   466: faload
    //   467: fadd
    //   468: iload #21
    //   470: swap
    //   471: fastore
    //   472: iinc #20, 1
    //   475: goto -> 428
    //   478: iload #19
    //   480: iload #18
    //   482: iinc #17, 1
    //   485: iadd
    //   486: istore #19
    //   488: goto -> 415
    //   491: aload #15
    //   493: iconst_0
    //   494: istore #14
    //   496: monitorexit
    //   497: iload #14
    //   499: iconst_m1
    //   500: if_icmpne -> 1034
    //   503: iconst_0
    //   504: ireturn
    //   505: aload #15
    //   507: monitorexit
    //   508: athrow
    //   509: iload #4
    //   511: iconst_1
    //   512: if_icmpne -> 1034
    //   515: aload #15
    //   517: aload_0
    //   518: aload_2
    //   519: iload #13
    //   521: aaload
    //   522: astore #16
    //   524: getfield Nh : Lf/E7;
    //   527: astore #17
    //   529: getfield PR : I
    //   532: bipush #8
    //   534: if_icmple -> 628
    //   537: iconst_0
    //   538: istore #18
    //   540: iload #18
    //   542: iload #6
    //   544: if_icmpge -> 1023
    //   547: aload #15
    //   549: aload #17
    //   551: invokevirtual rB : (Lf/E7;)I
    //   554: dup
    //   555: istore #19
    //   557: iconst_m1
    //   558: if_icmpne -> 564
    //   561: goto -> 652
    //   564: iload #19
    //   566: aload #15
    //   568: getfield PR : I
    //   571: imul
    //   572: istore #19
    //   574: iconst_0
    //   575: istore #20
    //   577: iload #20
    //   579: aload #15
    //   581: getfield PR : I
    //   584: if_icmpge -> 540
    //   587: aload #16
    //   589: dup
    //   590: iload #14
    //   592: iload #18
    //   594: dup
    //   595: iconst_1
    //   596: iadd
    //   597: istore #18
    //   599: iadd
    //   600: dup
    //   601: istore #21
    //   603: faload
    //   604: aload #15
    //   606: getfield eS : [F
    //   609: iload #19
    //   611: iload #20
    //   613: dup
    //   614: iconst_1
    //   615: iadd
    //   616: istore #20
    //   618: iadd
    //   619: faload
    //   620: fadd
    //   621: iload #21
    //   623: swap
    //   624: fastore
    //   625: goto -> 577
    //   628: iconst_0
    //   629: istore #18
    //   631: iload #18
    //   633: iload #6
    //   635: if_icmpge -> 1023
    //   638: aload #15
    //   640: aload #17
    //   642: invokevirtual rB : (Lf/E7;)I
    //   645: dup
    //   646: istore #19
    //   648: iconst_m1
    //   649: if_icmpne -> 658
    //   652: iconst_m1
    //   653: istore #14
    //   655: goto -> 1026
    //   658: aload #15
    //   660: getfield PR : I
    //   663: dup
    //   664: iload #19
    //   666: swap
    //   667: imul
    //   668: istore #19
    //   670: iconst_0
    //   671: istore #20
    //   673: tableswitch default -> 720, 1 -> 987, 2 -> 949, 3 -> 911, 4 -> 873, 5 -> 835, 6 -> 797, 7 -> 759, 8 -> 723
    //   720: goto -> 631
    //   723: aload #16
    //   725: dup
    //   726: iload #14
    //   728: iload #18
    //   730: dup
    //   731: iconst_1
    //   732: iadd
    //   733: istore #18
    //   735: iadd
    //   736: dup
    //   737: istore #21
    //   739: faload
    //   740: aload #15
    //   742: getfield eS : [F
    //   745: iload #19
    //   747: iload #20
    //   749: iconst_1
    //   750: istore #20
    //   752: iadd
    //   753: faload
    //   754: fadd
    //   755: iload #21
    //   757: swap
    //   758: fastore
    //   759: aload #16
    //   761: dup
    //   762: iload #14
    //   764: iload #18
    //   766: dup
    //   767: iconst_1
    //   768: iadd
    //   769: istore #18
    //   771: iadd
    //   772: dup
    //   773: istore #21
    //   775: faload
    //   776: aload #15
    //   778: getfield eS : [F
    //   781: iload #19
    //   783: iload #20
    //   785: dup
    //   786: iconst_1
    //   787: iadd
    //   788: istore #20
    //   790: iadd
    //   791: faload
    //   792: fadd
    //   793: iload #21
    //   795: swap
    //   796: fastore
    //   797: aload #16
    //   799: dup
    //   800: iload #14
    //   802: iload #18
    //   804: dup
    //   805: iconst_1
    //   806: iadd
    //   807: istore #18
    //   809: iadd
    //   810: dup
    //   811: istore #21
    //   813: faload
    //   814: aload #15
    //   816: getfield eS : [F
    //   819: iload #19
    //   821: iload #20
    //   823: dup
    //   824: iconst_1
    //   825: iadd
    //   826: istore #20
    //   828: iadd
    //   829: faload
    //   830: fadd
    //   831: iload #21
    //   833: swap
    //   834: fastore
    //   835: aload #16
    //   837: dup
    //   838: iload #14
    //   840: iload #18
    //   842: dup
    //   843: iconst_1
    //   844: iadd
    //   845: istore #18
    //   847: iadd
    //   848: dup
    //   849: istore #21
    //   851: faload
    //   852: aload #15
    //   854: getfield eS : [F
    //   857: iload #19
    //   859: iload #20
    //   861: dup
    //   862: iconst_1
    //   863: iadd
    //   864: istore #20
    //   866: iadd
    //   867: faload
    //   868: fadd
    //   869: iload #21
    //   871: swap
    //   872: fastore
    //   873: aload #16
    //   875: dup
    //   876: iload #14
    //   878: iload #18
    //   880: dup
    //   881: iconst_1
    //   882: iadd
    //   883: istore #18
    //   885: iadd
    //   886: dup
    //   887: istore #21
    //   889: faload
    //   890: aload #15
    //   892: getfield eS : [F
    //   895: iload #19
    //   897: iload #20
    //   899: dup
    //   900: iconst_1
    //   901: iadd
    //   902: istore #20
    //   904: iadd
    //   905: faload
    //   906: fadd
    //   907: iload #21
    //   909: swap
    //   910: fastore
    //   911: aload #16
    //   913: dup
    //   914: iload #14
    //   916: iload #18
    //   918: dup
    //   919: iconst_1
    //   920: iadd
    //   921: istore #18
    //   923: iadd
    //   924: dup
    //   925: istore #21
    //   927: faload
    //   928: aload #15
    //   930: getfield eS : [F
    //   933: iload #19
    //   935: iload #20
    //   937: dup
    //   938: iconst_1
    //   939: iadd
    //   940: istore #20
    //   942: iadd
    //   943: faload
    //   944: fadd
    //   945: iload #21
    //   947: swap
    //   948: fastore
    //   949: aload #16
    //   951: dup
    //   952: iload #14
    //   954: iload #18
    //   956: dup
    //   957: iconst_1
    //   958: iadd
    //   959: istore #18
    //   961: iadd
    //   962: dup
    //   963: istore #21
    //   965: faload
    //   966: aload #15
    //   968: getfield eS : [F
    //   971: iload #19
    //   973: iload #20
    //   975: dup
    //   976: iconst_1
    //   977: iadd
    //   978: istore #20
    //   980: iadd
    //   981: faload
    //   982: fadd
    //   983: iload #21
    //   985: swap
    //   986: fastore
    //   987: aload #16
    //   989: dup
    //   990: iload #14
    //   992: iload #18
    //   994: dup
    //   995: iconst_1
    //   996: iadd
    //   997: istore #18
    //   999: iadd
    //   1000: dup
    //   1001: istore #21
    //   1003: faload
    //   1004: aload #15
    //   1006: getfield eS : [F
    //   1009: iload #19
    //   1011: iload #20
    //   1013: iadd
    //   1014: faload
    //   1015: fadd
    //   1016: iload #21
    //   1018: swap
    //   1019: fastore
    //   1020: goto -> 631
    //   1023: iconst_0
    //   1024: istore #14
    //   1026: iload #14
    //   1028: iconst_m1
    //   1029: if_icmpne -> 1034
    //   1032: iconst_0
    //   1033: ireturn
    //   1034: iinc #13, 1
    //   1037: goto -> 231
    //   1040: iinc #12, 1
    //   1043: iinc #10, 1
    //   1046: goto -> 214
    //   1049: iinc #11, 1
    //   1052: goto -> 135
    //   1055: iinc #9, 1
    //   1058: goto -> 120
    //   1061: iconst_0
    //   1062: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 330
    //   #2	-> 521
    //   #3	-> 529
    // Exception table:
    //   from	to	target	type
    //   330	334	505	finally
    //   336	340	505	finally
    //   345	354	505	finally
    //   364	371	505	finally
    //   387	401	505	finally
    //   402	403	505	finally
    //   415	422	505	finally
    //   449	463	505	finally
    //   466	467	505	finally
    //   468	472	505	finally
  }
  
  public int tg(m6 paramm6, Object paramObject, float[][] paramArrayOffloat, int[] paramArrayOfint, int paramInt) {
    int i = 0;
    for (byte b = 0; b < paramInt; b++) {
      if (paramArrayOfint[b] != 0) {
        int j = i + 1;
        paramArrayOffloat[i] = paramArrayOffloat[b];
        i = j;
      } 
    } 
    return (i != 0) ? Xe(paramm6, paramObject, paramArrayOffloat, i, 0) : 0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/e90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */