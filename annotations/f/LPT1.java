package f;

import java.util.function.Function;

public final class LPT1 {
  public static Function qG = LPT1::Ow;
  
  public static final short[] pm0 = new short[0];
  
  public final byte IM;
  
  public final byte Ng0;
  
  public byte UP = -1;
  
  public final short[] Kl0;
  
  public final int OK0;
  
  public final String OA0;
  
  public LPT1(byte paramByte1, byte paramByte2) {
    this.IM = paramByte1;
    this.Ng0 = paramByte2;
    this.Kl0 = pm0;
    this.OK0 = 0;
    this.OA0 = "";
  }
  
  public LPT1(byte paramByte1, byte paramByte2, short... paramVarArgs) {
    if (paramVarArgs.length >= 1) {
      this.IM = paramByte1;
      this.Ng0 = paramByte2;
      this.Kl0 = paramVarArgs;
      this.OK0 = 0;
      this.OA0 = "";
      return;
    } 
    throw new RuntimeException();
  }
  
  public LPT1(byte paramByte1, byte paramByte2, String paramString) {
    this.IM = paramByte1;
    this.Ng0 = paramByte2;
    this.Kl0 = pm0;
    this.OK0 = 0;
    this.OA0 = paramString;
  }
  
  public LPT1(byte paramByte1, byte paramByte2, int paramInt) {
    this.IM = paramByte1;
    this.Ng0 = paramByte2;
    short[] arrayOfShort;
    (arrayOfShort = new short[1])[0] = (short)paramInt;
    this.Kl0 = this;
    this.OK0 = paramInt;
    this.OA0 = "";
  }
  
  public final short A3(int paramInt) {
    short[] arrayOfShort;
    if ((arrayOfShort = this.Kl0).length < 1)
      return 0; 
    if (paramInt < 0 || paramInt >= this.length)
      paramInt = 0; 
    return this[paramInt];
  }
  
  public final String Na() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Ng0 : B
    //   4: tableswitch default -> 140, 0 -> 1038, 1 -> 1012, 2 -> 994, 3 -> 969, 4 -> 840, 5 -> 835, 6 -> 723, 7 -> 710, 8 -> 678, 9 -> 670, 10 -> 661, 11 -> 648, 12 -> 624, 13 -> 611, 14 -> 598, 15 -> 575, 16 -> 544, 17 -> 514, 18 -> 506, 19 -> 478, 20 -> 431, 21 -> 418, 22 -> 371, 23 -> 342, 24 -> 291, 25 -> 270, 26 -> 226, 27 -> 172, 28 -> 164, 29 -> 143
    //   140: ldc ''
    //   142: areturn
    //   143: getstatic f/LPT1.qG : Ljava/util/function/Function;
    //   146: aload_0
    //   147: iconst_0
    //   148: invokevirtual A3 : (I)S
    //   151: i2b
    //   152: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   155: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
    //   160: checkcast java/lang/String
    //   163: areturn
    //   164: aload_0
    //   165: getfield UP : B
    //   168: invokestatic kd0 : (B)Ljava/lang/String;
    //   171: areturn
    //   172: aload_0
    //   173: iconst_0
    //   174: invokevirtual A3 : (I)S
    //   177: istore_0
    //   178: getstatic f/Hu0.It : [Lf/Hu0;
    //   181: dup
    //   182: astore_1
    //   183: arraylength
    //   184: istore_2
    //   185: iconst_0
    //   186: istore_3
    //   187: iload_3
    //   188: iload_2
    //   189: if_icmpge -> 214
    //   192: aload_1
    //   193: iload_3
    //   194: aaload
    //   195: dup
    //   196: astore #4
    //   198: getfield od : B
    //   201: iload_0
    //   202: if_icmpne -> 208
    //   205: goto -> 217
    //   208: iinc #3, 1
    //   211: goto -> 187
    //   214: aconst_null
    //   215: astore #4
    //   217: aload #4
    //   219: getfield jC0 : I
    //   222: invokestatic OH0 : (I)Ljava/lang/String;
    //   225: areturn
    //   226: aload_0
    //   227: getfield UP : B
    //   230: aload_0
    //   231: getfield Kl0 : [S
    //   234: iconst_0
    //   235: saload
    //   236: i2b
    //   237: invokestatic ZD0 : (B)Lf/F40;
    //   240: invokestatic gn0 : (BLf/F40;)Lf/YK0;
    //   243: dup
    //   244: astore_1
    //   245: ifnonnull -> 251
    //   248: ldc ''
    //   250: areturn
    //   251: aload_1
    //   252: aload_0
    //   253: getfield Kl0 : [S
    //   256: dup
    //   257: iconst_1
    //   258: saload
    //   259: istore_0
    //   260: iconst_2
    //   261: saload
    //   262: istore_1
    //   263: iload_0
    //   264: iconst_0
    //   265: iload_1
    //   266: invokevirtual j0 : (III)Ljava/lang/String;
    //   269: areturn
    //   270: getstatic f/Of.eH : Lf/Of;
    //   273: aload_0
    //   274: iconst_0
    //   275: invokevirtual A3 : (I)S
    //   278: invokevirtual On0 : (S)Lf/LPT3;
    //   281: getfield Y8 : Lf/Hu0;
    //   284: getfield jC0 : I
    //   287: invokestatic OH0 : (I)Ljava/lang/String;
    //   290: areturn
    //   291: new java/lang/StringBuilder
    //   294: dup
    //   295: invokespecial <init> : ()V
    //   298: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   301: aload_0
    //   302: iconst_1
    //   303: invokevirtual A3 : (I)S
    //   306: i2l
    //   307: invokevirtual format : (J)Ljava/lang/String;
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: ldc 'x '
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: getstatic f/Of.eH : Lf/Of;
    //   321: aload_0
    //   322: iconst_0
    //   323: invokevirtual A3 : (I)S
    //   326: invokevirtual On0 : (S)Lf/LPT3;
    //   329: getfield Iu : I
    //   332: invokestatic OH0 : (I)Ljava/lang/String;
    //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: invokevirtual toString : ()Ljava/lang/String;
    //   341: areturn
    //   342: ldc '1x '
    //   344: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: getstatic f/Of.eH : Lf/Of;
    //   350: aload_0
    //   351: iconst_0
    //   352: invokevirtual A3 : (I)S
    //   355: invokevirtual On0 : (S)Lf/LPT3;
    //   358: getfield Iu : I
    //   361: invokestatic OH0 : (I)Ljava/lang/String;
    //   364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual toString : ()Ljava/lang/String;
    //   370: areturn
    //   371: getstatic f/Of.eH : Lf/Of;
    //   374: aload_0
    //   375: iconst_0
    //   376: invokevirtual A3 : (I)S
    //   379: invokevirtual On0 : (S)Lf/LPT3;
    //   382: dup
    //   383: astore_0
    //   384: getfield kx0 : S
    //   387: ifle -> 415
    //   390: invokestatic cw : ()Lf/yk0;
    //   393: aload_0
    //   394: getfield kx0 : S
    //   397: invokevirtual mP : (S)Lf/WD;
    //   400: dup
    //   401: astore_0
    //   402: ifnull -> 415
    //   405: aload_0
    //   406: getfield iz : I
    //   409: invokestatic OH0 : (I)Ljava/lang/String;
    //   412: goto -> 417
    //   415: ldc '--'
    //   417: areturn
    //   418: aload_0
    //   419: iconst_0
    //   420: invokevirtual A3 : (I)S
    //   423: i2b
    //   424: invokestatic wY : (B)Lf/Ht0;
    //   427: invokevirtual toString : ()Ljava/lang/String;
    //   430: areturn
    //   431: aload_0
    //   432: getstatic f/Z4.T0 : Lf/Z4;
    //   435: astore_1
    //   436: iconst_0
    //   437: invokevirtual A3 : (I)S
    //   440: i2b
    //   441: aload_1
    //   442: getfield Ab : Lf/ak;
    //   445: swap
    //   446: invokevirtual Ha0 : (B)Ljava/lang/Object;
    //   449: checkcast f/Md0
    //   452: dup
    //   453: astore_1
    //   454: ifnonnull -> 460
    //   457: ldc 'ERROR'
    //   459: areturn
    //   460: aload_0
    //   461: iconst_1
    //   462: invokevirtual A3 : (I)S
    //   465: ifle -> 473
    //   468: aload_1
    //   469: getfield cD0 : Ljava/lang/String;
    //   472: areturn
    //   473: aload_1
    //   474: getfield Al0 : Ljava/lang/String;
    //   477: areturn
    //   478: getstatic f/s10.hU : Lf/s10;
    //   481: aload_0
    //   482: dup
    //   483: dup
    //   484: getfield UP : B
    //   487: istore_0
    //   488: iconst_0
    //   489: invokevirtual A3 : (I)S
    //   492: i2b
    //   493: istore_1
    //   494: iconst_1
    //   495: invokevirtual A3 : (I)S
    //   498: istore_2
    //   499: iload_0
    //   500: iload_1
    //   501: iload_2
    //   502: invokevirtual vG0 : (BBI)Ljava/lang/String;
    //   505: areturn
    //   506: aload_0
    //   507: getfield OA0 : Ljava/lang/String;
    //   510: invokestatic LU : (Ljava/lang/String;)Ljava/lang/String;
    //   513: areturn
    //   514: new java/lang/StringBuilder
    //   517: dup
    //   518: invokespecial <init> : ()V
    //   521: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   524: aload_0
    //   525: getfield OK0 : I
    //   528: i2l
    //   529: invokevirtual format : (J)Ljava/lang/String;
    //   532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: ldc ''
    //   537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: invokevirtual toString : ()Ljava/lang/String;
    //   543: areturn
    //   544: getstatic f/T30.Qh : Lf/T30;
    //   547: aload_0
    //   548: dup
    //   549: getfield UP : B
    //   552: istore_0
    //   553: iconst_0
    //   554: invokevirtual A3 : (I)S
    //   557: iload_0
    //   558: swap
    //   559: invokevirtual Xr : (BS)Lf/Xk;
    //   562: dup
    //   563: astore_0
    //   564: ifnonnull -> 570
    //   567: ldc 'ERROR'
    //   569: areturn
    //   570: aload_0
    //   571: invokevirtual m20 : ()Ljava/lang/String;
    //   574: areturn
    //   575: aload_0
    //   576: dup
    //   577: getfield UP : B
    //   580: bipush #120
    //   582: imul
    //   583: ldc_w 190000
    //   586: iadd
    //   587: istore_0
    //   588: iconst_0
    //   589: invokevirtual A3 : (I)S
    //   592: iload_0
    //   593: iadd
    //   594: invokestatic OH0 : (I)Ljava/lang/String;
    //   597: areturn
    //   598: aload_0
    //   599: iconst_0
    //   600: invokevirtual A3 : (I)S
    //   603: ldc_w 270600
    //   606: iadd
    //   607: invokestatic OH0 : (I)Ljava/lang/String;
    //   610: areturn
    //   611: aload_0
    //   612: iconst_0
    //   613: invokevirtual A3 : (I)S
    //   616: ldc_w 100100
    //   619: iadd
    //   620: invokestatic OH0 : (I)Ljava/lang/String;
    //   623: areturn
    //   624: getstatic f/HQ.Z90 : Lf/HQ;
    //   627: aload_0
    //   628: iconst_0
    //   629: invokevirtual A3 : (I)S
    //   632: invokevirtual Qe : (S)Lf/lj0;
    //   635: dup
    //   636: astore_0
    //   637: ifnonnull -> 643
    //   640: ldc ''
    //   642: areturn
    //   643: aload_0
    //   644: invokevirtual s60 : ()Ljava/lang/String;
    //   647: areturn
    //   648: aload_0
    //   649: iconst_0
    //   650: invokevirtual A3 : (I)S
    //   653: ldc_w 210000
    //   656: iadd
    //   657: invokestatic OH0 : (I)Ljava/lang/String;
    //   660: areturn
    //   661: aload_0
    //   662: getfield OK0 : I
    //   665: iconst_2
    //   666: invokestatic Ya : (II)Ljava/lang/String;
    //   669: areturn
    //   670: aload_0
    //   671: getfield OK0 : I
    //   674: invokestatic OH0 : (I)Ljava/lang/String;
    //   677: areturn
    //   678: aload_0
    //   679: iconst_0
    //   680: invokevirtual A3 : (I)S
    //   683: i2b
    //   684: getstatic f/ZY.MX : Lf/ak;
    //   687: swap
    //   688: invokevirtual Ha0 : (B)Ljava/lang/Object;
    //   691: checkcast f/ZY
    //   694: dup
    //   695: astore_0
    //   696: ifnonnull -> 702
    //   699: ldc 'ERROR'
    //   701: areturn
    //   702: aload_0
    //   703: getfield UR : I
    //   706: invokestatic OH0 : (I)Ljava/lang/String;
    //   709: areturn
    //   710: aload_0
    //   711: iconst_0
    //   712: invokevirtual A3 : (I)S
    //   715: i2b
    //   716: invokestatic Gt0 : (B)Lf/Ht0;
    //   719: invokevirtual toString : ()Ljava/lang/String;
    //   722: areturn
    //   723: aload_0
    //   724: getfield UP : B
    //   727: invokestatic n80 : (B)Z
    //   730: ifeq -> 754
    //   733: getstatic f/fV.Ca : Lf/fV;
    //   736: aload_0
    //   737: iconst_0
    //   738: invokevirtual A3 : (I)S
    //   741: invokevirtual PJ0 : (S)Lf/MZ;
    //   744: dup
    //   745: astore_1
    //   746: ifnull -> 754
    //   749: aload_1
    //   750: invokevirtual iL0 : ()Ljava/lang/String;
    //   753: areturn
    //   754: aload_0
    //   755: getfield UP : B
    //   758: invokestatic sz0 : (B)Z
    //   761: ifeq -> 831
    //   764: aload_0
    //   765: getstatic f/fV.Ca : Lf/fV;
    //   768: astore_1
    //   769: getfield UP : B
    //   772: dup
    //   773: istore_2
    //   774: aload_0
    //   775: iconst_0
    //   776: invokevirtual A3 : (I)S
    //   779: istore_0
    //   780: iflt -> 815
    //   783: iload_2
    //   784: aload_1
    //   785: getfield kg : [Lf/By0;
    //   788: dup
    //   789: astore_1
    //   790: arraylength
    //   791: if_icmpge -> 820
    //   794: aload_1
    //   795: iload_2
    //   796: aaload
    //   797: dup
    //   798: astore_1
    //   799: ifnonnull -> 805
    //   802: goto -> 820
    //   805: aload_1
    //   806: getfield Z6 : [Lf/Ws0;
    //   809: iload_0
    //   810: aaload
    //   811: astore_0
    //   812: goto -> 822
    //   815: aload_1
    //   816: invokevirtual getClass : ()Ljava/lang/Class;
    //   819: pop
    //   820: aconst_null
    //   821: astore_0
    //   822: aload_0
    //   823: ifnull -> 831
    //   826: aload_0
    //   827: invokevirtual getName : ()Ljava/lang/String;
    //   830: areturn
    //   831: ldc_w '???'
    //   834: areturn
    //   835: aload_0
    //   836: getfield OA0 : Ljava/lang/String;
    //   839: areturn
    //   840: aload_0
    //   841: iconst_0
    //   842: invokevirtual A3 : (I)S
    //   845: tableswitch default -> 892, 1 -> 950, 2 -> 943, 3 -> 936, 4 -> 929, 5 -> 922, 6 -> 915, 7 -> 908, 8 -> 901
    //   892: ldc_w 'Badge #'
    //   895: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   898: goto -> 957
    //   901: ldc_w 300022
    //   904: invokestatic OH0 : (I)Ljava/lang/String;
    //   907: areturn
    //   908: ldc_w 300021
    //   911: invokestatic OH0 : (I)Ljava/lang/String;
    //   914: areturn
    //   915: ldc_w 300020
    //   918: invokestatic OH0 : (I)Ljava/lang/String;
    //   921: areturn
    //   922: ldc_w 300019
    //   925: invokestatic OH0 : (I)Ljava/lang/String;
    //   928: areturn
    //   929: ldc_w 300018
    //   932: invokestatic OH0 : (I)Ljava/lang/String;
    //   935: areturn
    //   936: ldc_w 300017
    //   939: invokestatic OH0 : (I)Ljava/lang/String;
    //   942: areturn
    //   943: ldc_w 300016
    //   946: invokestatic OH0 : (I)Ljava/lang/String;
    //   949: areturn
    //   950: ldc_w 300015
    //   953: invokestatic OH0 : (I)Ljava/lang/String;
    //   956: areturn
    //   957: aload_0
    //   958: iconst_0
    //   959: invokevirtual A3 : (I)S
    //   962: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   965: invokevirtual toString : ()Ljava/lang/String;
    //   968: areturn
    //   969: new java/lang/StringBuilder
    //   972: dup
    //   973: aload_0
    //   974: swap
    //   975: invokespecial <init> : ()V
    //   978: iconst_0
    //   979: invokevirtual A3 : (I)S
    //   982: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   985: ldc ''
    //   987: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   990: invokevirtual toString : ()Ljava/lang/String;
    //   993: areturn
    //   994: invokestatic cw : ()Lf/yk0;
    //   997: aload_0
    //   998: iconst_0
    //   999: invokevirtual A3 : (I)S
    //   1002: invokevirtual mP : (S)Lf/WD;
    //   1005: getfield iz : I
    //   1008: invokestatic OH0 : (I)Ljava/lang/String;
    //   1011: areturn
    //   1012: invokestatic v30 : ()Lf/On;
    //   1015: aload_0
    //   1016: iconst_0
    //   1017: invokevirtual A3 : (I)S
    //   1020: invokevirtual lpT3 : (S)Lf/UD0;
    //   1023: dup
    //   1024: astore_0
    //   1025: ifnonnull -> 1032
    //   1028: ldc_w '???'
    //   1031: areturn
    //   1032: aload_0
    //   1033: iconst_0
    //   1034: invokevirtual o60 : (Z)Ljava/lang/String;
    //   1037: areturn
    //   1038: getstatic f/Of.eH : Lf/Of;
    //   1041: aload_0
    //   1042: iconst_0
    //   1043: invokevirtual A3 : (I)S
    //   1046: invokevirtual On0 : (S)Lf/LPT3;
    //   1049: getfield Iu : I
    //   1052: invokestatic OH0 : (I)Ljava/lang/String;
    //   1055: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 140
    //   #3	-> 148
    //   #4	-> 152
    //   #5	-> 174
    //   #6	-> 178
    //   #7	-> 219
    //   #8	-> 222
    //   #9	-> 270
    //   #10	-> 275
    //   #11	-> 278
    //   #12	-> 281
    //   #13	-> 284
    //   #14	-> 287
    //   #15	-> 318
    //   #16	-> 323
    //   #17	-> 326
    //   #18	-> 329
    //   #19	-> 335
    //   #20	-> 342
    //   #21	-> 347
    //   #22	-> 352
    //   #23	-> 355
    //   #24	-> 358
    //   #25	-> 364
    //   #26	-> 371
    //   #27	-> 376
    //   #28	-> 379
    //   #29	-> 384
    //   #30	-> 406
    //   #31	-> 415
    //   #32	-> 420
    //   #33	-> 424
    //   #34	-> 432
    //   #35	-> 437
    //   #36	-> 442
    //   #37	-> 446
    //   #38	-> 457
    //   #39	-> 469
    //   #40	-> 474
    //   #41	-> 478
    //   #42	-> 484
    //   #43	-> 525
    //   #44	-> 529
    //   #45	-> 544
    //   #46	-> 549
    //   #47	-> 554
    //   #48	-> 559
    //   #49	-> 589
    //   #50	-> 594
    //   #51	-> 600
    //   #52	-> 607
    //   #53	-> 613
    //   #54	-> 620
    //   #55	-> 624
    //   #56	-> 629
    //   #57	-> 632
    //   #58	-> 650
    //   #59	-> 657
    //   #60	-> 666
    //   #61	-> 671
    //   #62	-> 680
    //   #63	-> 684
    //   #64	-> 699
    //   #65	-> 703
    //   #66	-> 706
    //   #67	-> 712
    //   #68	-> 716
    //   #69	-> 733
    //   #70	-> 738
    //   #71	-> 741
    //   #72	-> 765
    //   #73	-> 769
    //   #74	-> 776
    //   #75	-> 785
    //   #76	-> 790
    //   #77	-> 806
    //   #78	-> 810
    //   #79	-> 816
    //   #80	-> 842
    //   #81	-> 892
    //   #82	-> 904
    //   #83	-> 959
    //   #84	-> 962
    //   #85	-> 979
    //   #86	-> 982
    //   #87	-> 999
    //   #88	-> 1002
    //   #89	-> 1005
    //   #90	-> 1008
    //   #91	-> 1012
    //   #92	-> 1017
    //   #93	-> 1020
    //   #94	-> 1034
    //   #95	-> 1038
    //   #96	-> 1043
    //   #97	-> 1046
    //   #98	-> 1049
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPT1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */