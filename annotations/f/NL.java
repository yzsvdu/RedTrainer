package f;

public final class NL {
  public static NL Vp0;
  
  public U70[] TO;
  
  public U70 s5;
  
  public zh0[] jy;
  
  public U70 qa;
  
  public zh0[] wu0;
  
  public byte[][][] il0;
  
  public byte[][][] N30;
  
  public byte[][] Vz;
  
  public U70[] Xr;
  
  public zh0[] gr;
  
  public static NL ds0() {
    if (Vp0 == null)
      Vp0 = new NL(); 
    return Vp0;
  }
  
  public final void oH(s40 params40) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual in : ()B
    //   4: dup
    //   5: istore_2
    //   6: ifeq -> 613
    //   9: iload_2
    //   10: iconst_1
    //   11: if_icmpeq -> 17
    //   14: goto -> 1123
    //   17: aload_1
    //   18: invokevirtual pr : ()Ljava/nio/ByteBuffer;
    //   21: dup
    //   22: astore_2
    //   23: aload_1
    //   24: aload_0
    //   25: dup
    //   26: new f/U70
    //   29: dup
    //   30: new f/v00
    //   33: dup
    //   34: aload_1
    //   35: invokespecial <init> : (Lf/s40;)V
    //   38: invokespecial <init> : (Lf/N50;)V
    //   41: putfield s5 : Lf/U70;
    //   44: bipush #15
    //   46: bipush #28
    //   48: multianewarray[[B 2
    //   52: putfield Vz : [[B
    //   55: getfield wJ : Lf/uq;
    //   58: getstatic f/uq.vJ : I
    //   61: invokevirtual nz : (I)I
    //   64: invokevirtual position : (I)Ljava/nio/Buffer;
    //   67: pop
    //   68: iconst_0
    //   69: istore_3
    //   70: iload_3
    //   71: bipush #15
    //   73: if_icmpge -> 129
    //   76: iconst_0
    //   77: istore #4
    //   79: iload #4
    //   81: bipush #28
    //   83: if_icmpge -> 123
    //   86: aload_2
    //   87: invokevirtual get : ()B
    //   90: dup
    //   91: istore #5
    //   93: sipush #255
    //   96: iand
    //   97: sipush #213
    //   100: if_icmpne -> 106
    //   103: iconst_m1
    //   104: istore #5
    //   106: aload_0
    //   107: getfield Vz : [[B
    //   110: iload_3
    //   111: aaload
    //   112: iload #4
    //   114: iload #5
    //   116: bastore
    //   117: iinc #4, 1
    //   120: goto -> 79
    //   123: iinc #3, 1
    //   126: goto -> 70
    //   129: aload_2
    //   130: dup
    //   131: dup
    //   132: dup2
    //   133: dup2
    //   134: dup2
    //   135: aload_1
    //   136: aload_0
    //   137: dup
    //   138: dup2
    //   139: dup2
    //   140: aload_2
    //   141: dup
    //   142: dup
    //   143: dup2
    //   144: dup2
    //   145: dup2
    //   146: aload_1
    //   147: getfield wJ : Lf/uq;
    //   150: getstatic f/uq.xv : I
    //   153: invokevirtual nz : (I)I
    //   156: invokevirtual position : (I)Ljava/nio/Buffer;
    //   159: pop
    //   160: invokevirtual getInt : ()I
    //   163: pop
    //   164: invokevirtual getInt : ()I
    //   167: pop
    //   168: iconst_4
    //   169: newarray int
    //   171: dup
    //   172: astore_3
    //   173: aload_2
    //   174: dup
    //   175: aload_3
    //   176: aload_2
    //   177: aload_3
    //   178: aload_2
    //   179: dup
    //   180: dup
    //   181: aload_3
    //   182: aload_2
    //   183: invokevirtual getInt : ()I
    //   186: invokestatic tx0 : (I)I
    //   189: iconst_0
    //   190: swap
    //   191: iastore
    //   192: invokevirtual getInt : ()I
    //   195: pop
    //   196: invokevirtual getInt : ()I
    //   199: pop
    //   200: invokevirtual getInt : ()I
    //   203: invokestatic tx0 : (I)I
    //   206: iconst_1
    //   207: swap
    //   208: iastore
    //   209: invokevirtual getInt : ()I
    //   212: invokestatic tx0 : (I)I
    //   215: iconst_2
    //   216: swap
    //   217: iastore
    //   218: invokevirtual getInt : ()I
    //   221: pop
    //   222: invokevirtual getInt : ()I
    //   225: invokestatic tx0 : (I)I
    //   228: iconst_3
    //   229: swap
    //   230: iastore
    //   231: invokevirtual position : ()I
    //   234: bipush #12
    //   236: iadd
    //   237: invokevirtual position : (I)Ljava/nio/Buffer;
    //   240: pop
    //   241: invokevirtual getInt : ()I
    //   244: invokestatic tx0 : (I)I
    //   247: istore_2
    //   248: invokevirtual position : ()I
    //   251: bipush #40
    //   253: iadd
    //   254: invokevirtual position : (I)Ljava/nio/Buffer;
    //   257: pop
    //   258: invokevirtual getInt : ()I
    //   261: invokestatic tx0 : (I)I
    //   264: istore #4
    //   266: iconst_4
    //   267: anewarray f/U70
    //   270: dup
    //   271: aload_0
    //   272: swap
    //   273: putfield Xr : [Lf/U70;
    //   276: new f/U70
    //   279: dup
    //   280: astore #5
    //   282: new f/pw
    //   285: dup
    //   286: aload_1
    //   287: iload_2
    //   288: aload_3
    //   289: iload #4
    //   291: invokespecial <init> : (Lf/s40;I[II)V
    //   294: invokespecial <init> : (Lf/N50;)V
    //   297: iconst_0
    //   298: aload #5
    //   300: aastore
    //   301: getfield Xr : [Lf/U70;
    //   304: new f/U70
    //   307: dup
    //   308: astore #5
    //   310: new f/Bc0
    //   313: dup
    //   314: aload_1
    //   315: iload_2
    //   316: aload_3
    //   317: iload #4
    //   319: invokespecial <init> : (Lf/s40;I[II)V
    //   322: invokespecial <init> : (Lf/N50;)V
    //   325: iconst_1
    //   326: aload #5
    //   328: aastore
    //   329: getfield Xr : [Lf/U70;
    //   332: new f/U70
    //   335: dup
    //   336: astore #5
    //   338: new f/f60
    //   341: dup
    //   342: aload_1
    //   343: iload_2
    //   344: aload_3
    //   345: iload #4
    //   347: invokespecial <init> : (Lf/s40;I[II)V
    //   350: invokespecial <init> : (Lf/N50;)V
    //   353: iconst_2
    //   354: aload #5
    //   356: aastore
    //   357: getfield Xr : [Lf/U70;
    //   360: new f/U70
    //   363: dup
    //   364: astore #5
    //   366: new f/bv0
    //   369: dup
    //   370: aload_1
    //   371: iload_2
    //   372: aload_3
    //   373: iload #4
    //   375: invokespecial <init> : (Lf/s40;I[II)V
    //   378: invokespecial <init> : (Lf/N50;)V
    //   381: iconst_3
    //   382: aload #5
    //   384: aastore
    //   385: iconst_4
    //   386: anewarray f/zh0
    //   389: dup
    //   390: aload_0
    //   391: swap
    //   392: putfield gr : [Lf/zh0;
    //   395: new f/zh0
    //   398: dup
    //   399: astore_2
    //   400: aload_0
    //   401: getfield Xr : [Lf/U70;
    //   404: iconst_0
    //   405: aaload
    //   406: iconst_0
    //   407: iconst_0
    //   408: bipush #96
    //   410: bipush #48
    //   412: invokespecial <init> : (Lf/U70;IIII)V
    //   415: iconst_0
    //   416: aload_2
    //   417: aastore
    //   418: getfield gr : [Lf/zh0;
    //   421: new f/zh0
    //   424: dup
    //   425: astore_2
    //   426: aload_0
    //   427: getfield Xr : [Lf/U70;
    //   430: iconst_0
    //   431: aaload
    //   432: iconst_0
    //   433: bipush #48
    //   435: bipush #96
    //   437: bipush #48
    //   439: invokespecial <init> : (Lf/U70;IIII)V
    //   442: iconst_1
    //   443: aload_2
    //   444: aastore
    //   445: getfield gr : [Lf/zh0;
    //   448: new f/zh0
    //   451: dup
    //   452: astore_2
    //   453: aload_0
    //   454: getfield Xr : [Lf/U70;
    //   457: iconst_0
    //   458: aaload
    //   459: iconst_0
    //   460: bipush #72
    //   462: bipush #96
    //   464: bipush #48
    //   466: invokespecial <init> : (Lf/U70;IIII)V
    //   469: iconst_2
    //   470: aload_2
    //   471: aastore
    //   472: getfield gr : [Lf/zh0;
    //   475: new f/zh0
    //   478: dup
    //   479: astore_2
    //   480: aload_0
    //   481: getfield Xr : [Lf/U70;
    //   484: iconst_0
    //   485: aaload
    //   486: iconst_0
    //   487: bipush #96
    //   489: bipush #96
    //   491: bipush #48
    //   493: invokespecial <init> : (Lf/U70;IIII)V
    //   496: iconst_3
    //   497: aload_2
    //   498: aastore
    //   499: getfield wJ : Lf/uq;
    //   502: getstatic f/uq.kn0 : I
    //   505: invokevirtual nz : (I)I
    //   508: invokevirtual position : (I)Ljava/nio/Buffer;
    //   511: pop
    //   512: invokevirtual getInt : ()I
    //   515: invokestatic tx0 : (I)I
    //   518: istore_0
    //   519: invokevirtual getInt : ()I
    //   522: pop
    //   523: invokevirtual getInt : ()I
    //   526: invokestatic tx0 : (I)I
    //   529: istore_2
    //   530: invokevirtual getInt : ()I
    //   533: pop
    //   534: invokevirtual getInt : ()I
    //   537: invokestatic tx0 : (I)I
    //   540: istore_3
    //   541: invokevirtual position : ()I
    //   544: bipush #12
    //   546: iadd
    //   547: invokevirtual position : (I)Ljava/nio/Buffer;
    //   550: pop
    //   551: invokevirtual getInt : ()I
    //   554: invokestatic tx0 : (I)I
    //   557: istore #4
    //   559: new f/U70
    //   562: new f/De
    //   565: dup
    //   566: aload_1
    //   567: iload_0
    //   568: iload #4
    //   570: invokespecial <init> : (Lf/s40;II)V
    //   573: invokespecial <init> : (Lf/N50;)V
    //   576: new f/U70
    //   579: new f/kz
    //   582: dup
    //   583: aload_1
    //   584: iload_2
    //   585: iload #4
    //   587: invokespecial <init> : (Lf/s40;II)V
    //   590: invokespecial <init> : (Lf/N50;)V
    //   593: new f/U70
    //   596: new f/Wq
    //   599: dup
    //   600: aload_1
    //   601: iload_3
    //   602: iload #4
    //   604: invokespecial <init> : (Lf/s40;II)V
    //   607: invokespecial <init> : (Lf/N50;)V
    //   610: goto -> 1123
    //   613: aload_0
    //   614: aload_1
    //   615: dup
    //   616: dup
    //   617: invokevirtual pr : ()Ljava/nio/ByteBuffer;
    //   620: astore_2
    //   621: getfield wJ : Lf/uq;
    //   624: getstatic f/uq.Z50 : I
    //   627: invokevirtual nz : (I)I
    //   630: istore_3
    //   631: getfield wJ : Lf/uq;
    //   634: getstatic f/uq.Hb0 : I
    //   637: invokevirtual nz : (I)I
    //   640: istore #4
    //   642: iconst_4
    //   643: newarray int
    //   645: dup
    //   646: astore #5
    //   648: aload_1
    //   649: aload #5
    //   651: aload_1
    //   652: aload #5
    //   654: aload_1
    //   655: aload #5
    //   657: aload_1
    //   658: getfield wJ : Lf/uq;
    //   661: getstatic f/uq.Bx : I
    //   664: invokevirtual nz : (I)I
    //   667: iconst_0
    //   668: swap
    //   669: iastore
    //   670: getfield wJ : Lf/uq;
    //   673: getstatic f/uq.eg0 : I
    //   676: invokevirtual nz : (I)I
    //   679: iconst_1
    //   680: swap
    //   681: iastore
    //   682: getfield wJ : Lf/uq;
    //   685: getstatic f/uq.ki0 : I
    //   688: invokevirtual nz : (I)I
    //   691: iconst_2
    //   692: swap
    //   693: iastore
    //   694: getfield wJ : Lf/uq;
    //   697: getstatic f/uq.xi0 : I
    //   700: invokevirtual nz : (I)I
    //   703: iconst_3
    //   704: swap
    //   705: iastore
    //   706: iconst_4
    //   707: anewarray f/U70
    //   710: putfield TO : [Lf/U70;
    //   713: iconst_0
    //   714: istore #6
    //   716: iload #6
    //   718: aload_0
    //   719: getfield TO : [Lf/U70;
    //   722: dup
    //   723: astore #7
    //   725: arraylength
    //   726: if_icmpge -> 770
    //   729: aload #7
    //   731: new f/U70
    //   734: dup
    //   735: astore #7
    //   737: new f/jQ
    //   740: dup
    //   741: astore #8
    //   743: aload_1
    //   744: iload_3
    //   745: aload #5
    //   747: iload #6
    //   749: iload #4
    //   751: invokespecial <init> : (Lf/s40;I[III)V
    //   754: aload #8
    //   756: invokespecial <init> : (Lf/N50;)V
    //   759: iload #6
    //   761: aload #7
    //   763: aastore
    //   764: iinc #6, 1
    //   767: goto -> 716
    //   770: aload_0
    //   771: new f/U70
    //   774: dup
    //   775: astore_3
    //   776: new f/ZO
    //   779: dup
    //   780: aload_1
    //   781: invokespecial <init> : (Lf/s40;)V
    //   784: invokespecial <init> : (Lf/N50;)V
    //   787: iconst_2
    //   788: anewarray f/zh0
    //   791: putfield jy : [Lf/zh0;
    //   794: iconst_0
    //   795: istore #4
    //   797: iload #4
    //   799: aload_0
    //   800: getfield jy : [Lf/zh0;
    //   803: dup
    //   804: astore #5
    //   806: arraylength
    //   807: if_icmpge -> 847
    //   810: aload #5
    //   812: new f/zh0
    //   815: dup
    //   816: astore #5
    //   818: iload #4
    //   820: bipush #16
    //   822: imul
    //   823: istore #6
    //   825: aload_3
    //   826: iconst_0
    //   827: iload #6
    //   829: bipush #16
    //   831: bipush #16
    //   833: invokespecial <init> : (Lf/U70;IIII)V
    //   836: iload #4
    //   838: aload #5
    //   840: aastore
    //   841: iinc #4, 1
    //   844: goto -> 797
    //   847: aload_0
    //   848: dup
    //   849: new f/U70
    //   852: dup
    //   853: new f/IJ
    //   856: dup
    //   857: aload_1
    //   858: invokespecial <init> : (Lf/s40;)V
    //   861: invokespecial <init> : (Lf/N50;)V
    //   864: putfield qa : Lf/U70;
    //   867: new f/U70
    //   870: dup
    //   871: astore_3
    //   872: new f/Hv0
    //   875: dup
    //   876: aload_1
    //   877: invokespecial <init> : (Lf/s40;)V
    //   880: invokespecial <init> : (Lf/N50;)V
    //   883: iconst_2
    //   884: anewarray f/zh0
    //   887: putfield wu0 : [Lf/zh0;
    //   890: iconst_0
    //   891: istore #4
    //   893: iload #4
    //   895: aload_0
    //   896: getfield wu0 : [Lf/zh0;
    //   899: dup
    //   900: astore #5
    //   902: arraylength
    //   903: if_icmpge -> 943
    //   906: aload #5
    //   908: new f/zh0
    //   911: dup
    //   912: astore #5
    //   914: iload #4
    //   916: bipush #16
    //   918: imul
    //   919: istore #6
    //   921: aload_3
    //   922: iconst_0
    //   923: iload #6
    //   925: bipush #16
    //   927: bipush #16
    //   929: invokespecial <init> : (Lf/U70;IIII)V
    //   932: iload #4
    //   934: aload #5
    //   936: aastore
    //   937: iinc #4, 1
    //   940: goto -> 893
    //   943: aload_2
    //   944: aload_1
    //   945: aload_0
    //   946: dup
    //   947: iconst_4
    //   948: bipush #15
    //   950: bipush #22
    //   952: multianewarray[[[B 3
    //   956: putfield il0 : [[[B
    //   959: iconst_4
    //   960: bipush #15
    //   962: bipush #22
    //   964: multianewarray[[[B 3
    //   968: putfield N30 : [[[B
    //   971: getfield wJ : Lf/uq;
    //   974: getstatic f/uq.vJ : I
    //   977: invokevirtual nz : (I)I
    //   980: invokevirtual position : (I)Ljava/nio/Buffer;
    //   983: pop
    //   984: iconst_0
    //   985: istore_1
    //   986: iload_1
    //   987: iconst_4
    //   988: if_icmpge -> 1123
    //   991: iconst_0
    //   992: istore_3
    //   993: iload_3
    //   994: bipush #15
    //   996: if_icmpge -> 1054
    //   999: iconst_0
    //   1000: istore #4
    //   1002: iload #4
    //   1004: bipush #22
    //   1006: if_icmpge -> 1048
    //   1009: aload_2
    //   1010: invokevirtual get : ()B
    //   1013: dup
    //   1014: istore #5
    //   1016: sipush #255
    //   1019: iand
    //   1020: sipush #197
    //   1023: if_icmpne -> 1029
    //   1026: iconst_0
    //   1027: istore #5
    //   1029: aload_0
    //   1030: getfield il0 : [[[B
    //   1033: iload_1
    //   1034: aaload
    //   1035: iload_3
    //   1036: aaload
    //   1037: iload #4
    //   1039: iload #5
    //   1041: bastore
    //   1042: iinc #4, 1
    //   1045: goto -> 1002
    //   1048: iinc #3, 1
    //   1051: goto -> 993
    //   1054: iconst_0
    //   1055: istore_3
    //   1056: iload_3
    //   1057: bipush #15
    //   1059: if_icmpge -> 1117
    //   1062: iconst_0
    //   1063: istore #4
    //   1065: iload #4
    //   1067: bipush #22
    //   1069: if_icmpge -> 1111
    //   1072: aload_2
    //   1073: invokevirtual get : ()B
    //   1076: dup
    //   1077: istore #5
    //   1079: sipush #255
    //   1082: iand
    //   1083: sipush #197
    //   1086: if_icmpne -> 1092
    //   1089: iconst_0
    //   1090: istore #5
    //   1092: aload_0
    //   1093: getfield N30 : [[[B
    //   1096: iload_1
    //   1097: aaload
    //   1098: iload_3
    //   1099: aaload
    //   1100: iload #4
    //   1102: iload #5
    //   1104: bastore
    //   1105: iinc #4, 1
    //   1108: goto -> 1065
    //   1111: iinc #3, 1
    //   1114: goto -> 1056
    //   1117: iinc #1, 1
    //   1120: goto -> 986
    //   1123: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 18
    //   #2	-> 55
    //   #3	-> 58
    //   #4	-> 147
    //   #5	-> 150
    //   #6	-> 499
    //   #7	-> 502
    //   #8	-> 617
    //   #9	-> 621
    //   #10	-> 624
    //   #11	-> 631
    //   #12	-> 634
    //   #13	-> 658
    //   #14	-> 661
    //   #15	-> 670
    //   #16	-> 673
    //   #17	-> 682
    //   #18	-> 685
    //   #19	-> 694
    //   #20	-> 697
    //   #21	-> 971
    //   #22	-> 974
  }
  
  public final zh0[] hu0() {
    return this.jy;
  }
  
  public final zh0[] fr() {
    return this.wu0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */