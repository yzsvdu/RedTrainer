package f;

public final class U3 extends yp0 {
  public boolean Lp0 = false;
  
  public mJ zj;
  
  public hm0 bg;
  
  public ET cR;
  
  public U3(hm0 paramhm0, mJ parammJ, ET paramET) {
    this.bg = paramhm0;
    this.zj = parammJ;
    this.cR = paramET;
  }
  
  public final boolean Ie() {
    return this.Lp0;
  }
  
  public final void wL() {
    // Byte code:
    //   0: aload_0
    //   1: getfield zj : Lf/mJ;
    //   4: getfield FI0 : B
    //   7: getstatic f/km.MR : Lf/Gp0;
    //   10: invokevirtual hG0 : ()B
    //   13: if_icmpne -> 21
    //   16: iconst_1
    //   17: istore_1
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_1
    //   23: aload_0
    //   24: dup
    //   25: getstatic f/km.MR : Lf/Gp0;
    //   28: astore_2
    //   29: getfield zj : Lf/mJ;
    //   32: dup
    //   33: getfield FI0 : B
    //   36: istore_3
    //   37: getfield md : B
    //   40: istore #4
    //   42: getfield bg : Lf/hm0;
    //   45: astore #5
    //   47: aload_2
    //   48: getfield cl : [[Lf/hm0;
    //   51: iload_3
    //   52: aaload
    //   53: iload #4
    //   55: aaload
    //   56: dup
    //   57: astore #6
    //   59: ifnull -> 67
    //   62: aload #6
    //   64: invokevirtual lG0 : ()V
    //   67: aload_0
    //   68: dup
    //   69: aload_2
    //   70: getfield cl : [[Lf/hm0;
    //   73: iload_3
    //   74: aaload
    //   75: iload #4
    //   77: aload #5
    //   79: aastore
    //   80: getstatic f/km.wI0 : Lf/Pw;
    //   83: getfield K7 : Lf/Wl;
    //   86: getfield LW : Lf/kf;
    //   89: dup
    //   90: astore_2
    //   91: iconst_0
    //   92: invokevirtual K9 : (Z)V
    //   95: iconst_1
    //   96: putfield Lp0 : Z
    //   99: getfield bg : Lf/hm0;
    //   102: dup
    //   103: astore_3
    //   104: getfield h2 : Z
    //   107: ifeq -> 155
    //   110: getstatic f/F40.ef0 : Lf/F40;
    //   113: getstatic f/km.MR : Lf/Gp0;
    //   116: sipush #845
    //   119: aload_3
    //   120: invokevirtual ex : (ILf/hm0;)I
    //   123: istore_3
    //   124: iconst_1
    //   125: anewarray java/lang/String
    //   128: dup
    //   129: astore #4
    //   131: aload_0
    //   132: getfield bg : Lf/hm0;
    //   135: invokevirtual fA : ()Ljava/lang/String;
    //   138: iconst_0
    //   139: swap
    //   140: aastore
    //   141: iconst_2
    //   142: swap
    //   143: bipush #14
    //   145: iload_3
    //   146: aload #4
    //   148: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   151: astore_3
    //   152: goto -> 744
    //   155: iload_1
    //   156: ifeq -> 308
    //   159: getstatic f/km.MR : Lf/Gp0;
    //   162: aload_0
    //   163: getfield zj : Lf/mJ;
    //   166: getfield FI0 : B
    //   169: invokestatic Sr0 : (B)B
    //   172: aload_0
    //   173: getfield zj : Lf/mJ;
    //   176: getfield md : B
    //   179: invokevirtual N0 : (BB)Lf/hm0;
    //   182: dup
    //   183: astore_3
    //   184: ifnull -> 271
    //   187: aload_3
    //   188: invokevirtual XW : ()S
    //   191: i2d
    //   192: aload_3
    //   193: getfield K0 : Lf/jd0;
    //   196: getfield hp0 : S
    //   199: i2d
    //   200: ldc2_w 0.75
    //   203: dmul
    //   204: dcmpl
    //   205: iflt -> 211
    //   208: goto -> 271
    //   211: aload_3
    //   212: invokevirtual XW : ()S
    //   215: i2d
    //   216: aload_3
    //   217: getfield K0 : Lf/jd0;
    //   220: getfield hp0 : S
    //   223: i2d
    //   224: ldc2_w 0.5
    //   227: dmul
    //   228: dcmpl
    //   229: iflt -> 238
    //   232: bipush #21
    //   234: istore_3
    //   235: goto -> 274
    //   238: aload_3
    //   239: invokevirtual XW : ()S
    //   242: i2d
    //   243: aload_3
    //   244: getfield K0 : Lf/jd0;
    //   247: getfield hp0 : S
    //   250: i2d
    //   251: ldc2_w 0.25
    //   254: dmul
    //   255: dcmpl
    //   256: iflt -> 265
    //   259: bipush #22
    //   261: istore_3
    //   262: goto -> 274
    //   265: bipush #24
    //   267: istore_3
    //   268: goto -> 274
    //   271: bipush #11
    //   273: istore_3
    //   274: getstatic f/F40.ef0 : Lf/F40;
    //   277: iconst_1
    //   278: anewarray java/lang/String
    //   281: dup
    //   282: astore #4
    //   284: aload_0
    //   285: getfield bg : Lf/hm0;
    //   288: invokevirtual fA : ()Ljava/lang/String;
    //   291: iconst_0
    //   292: swap
    //   293: aastore
    //   294: iconst_2
    //   295: swap
    //   296: bipush #15
    //   298: iload_3
    //   299: aload #4
    //   301: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   304: astore_3
    //   305: goto -> 744
    //   308: aload_0
    //   309: getfield cR : Lf/ET;
    //   312: getstatic f/ET.gX : Lf/ET;
    //   315: if_acmpne -> 620
    //   318: ldc ''
    //   320: astore_3
    //   321: iconst_0
    //   322: istore #4
    //   324: getstatic f/km.MR : Lf/Gp0;
    //   327: aload_0
    //   328: getfield zj : Lf/mJ;
    //   331: getfield FI0 : B
    //   334: istore #5
    //   336: getfield cl : [[Lf/hm0;
    //   339: iload #5
    //   341: aaload
    //   342: dup
    //   343: astore #5
    //   345: aconst_null
    //   346: astore #6
    //   348: aconst_null
    //   349: astore #7
    //   351: arraylength
    //   352: istore #8
    //   354: iconst_0
    //   355: istore #9
    //   357: iload #9
    //   359: iload #8
    //   361: if_icmpge -> 434
    //   364: aload #5
    //   366: iload #9
    //   368: aaload
    //   369: dup
    //   370: astore #10
    //   372: ifnull -> 428
    //   375: aload #10
    //   377: getfield K0 : Lf/jd0;
    //   380: invokevirtual AL : ()Z
    //   383: ifne -> 428
    //   386: aload #10
    //   388: aload_0
    //   389: getfield bg : Lf/hm0;
    //   392: if_acmpne -> 398
    //   395: goto -> 428
    //   398: aload #10
    //   400: getfield K0 : Lf/jd0;
    //   403: getfield ta : Lf/Q90;
    //   406: getfield Jg : Z
    //   409: ifeq -> 419
    //   412: aload #10
    //   414: astore #6
    //   416: goto -> 428
    //   419: aload #7
    //   421: ifnonnull -> 428
    //   424: aload #10
    //   426: astore #7
    //   428: iinc #9, 1
    //   431: goto -> 357
    //   434: aload #6
    //   436: ifnull -> 497
    //   439: aload #6
    //   441: invokevirtual Jx : ()S
    //   444: dup
    //   445: istore_3
    //   446: sipush #1023
    //   449: if_icmpeq -> 483
    //   452: iload_3
    //   453: tableswitch default -> 480, 1000 -> 483, 1001 -> 483, 1002 -> 483
    //   480: goto -> 488
    //   483: iconst_1
    //   484: istore_3
    //   485: iload_3
    //   486: istore #4
    //   488: aload #6
    //   490: invokevirtual I9 : ()Ljava/lang/String;
    //   493: astore_3
    //   494: goto -> 508
    //   497: aload #7
    //   499: ifnull -> 508
    //   502: aload #7
    //   504: invokevirtual I9 : ()Ljava/lang/String;
    //   507: astore_3
    //   508: iload #4
    //   510: ifeq -> 547
    //   513: iconst_2
    //   514: anewarray java/lang/String
    //   517: dup
    //   518: astore #4
    //   520: aload_0
    //   521: aload #4
    //   523: iconst_0
    //   524: aload_3
    //   525: aastore
    //   526: getfield bg : Lf/hm0;
    //   529: invokevirtual I9 : ()Ljava/lang/String;
    //   532: iconst_1
    //   533: swap
    //   534: aastore
    //   535: sipush #5037
    //   538: aload #4
    //   540: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
    //   543: astore_3
    //   544: goto -> 744
    //   547: aload_3
    //   548: invokevirtual isEmpty : ()Z
    //   551: ifne -> 588
    //   554: iconst_2
    //   555: anewarray java/lang/String
    //   558: dup
    //   559: astore #4
    //   561: aload_0
    //   562: aload #4
    //   564: iconst_0
    //   565: aload_3
    //   566: aastore
    //   567: getfield bg : Lf/hm0;
    //   570: invokevirtual I9 : ()Ljava/lang/String;
    //   573: iconst_1
    //   574: swap
    //   575: aastore
    //   576: sipush #5036
    //   579: aload #4
    //   581: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
    //   584: astore_3
    //   585: goto -> 744
    //   588: getstatic f/F40.ef0 : Lf/F40;
    //   591: iconst_1
    //   592: anewarray java/lang/String
    //   595: dup
    //   596: astore_3
    //   597: aload_0
    //   598: getfield bg : Lf/hm0;
    //   601: invokevirtual I9 : ()Ljava/lang/String;
    //   604: iconst_0
    //   605: swap
    //   606: aastore
    //   607: iconst_2
    //   608: swap
    //   609: bipush #15
    //   611: iconst_1
    //   612: aload_3
    //   613: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   616: astore_3
    //   617: goto -> 744
    //   620: aload_0
    //   621: getstatic f/F40.ef0 : Lf/F40;
    //   624: astore_3
    //   625: bipush #15
    //   627: istore #4
    //   629: bipush #17
    //   631: istore #5
    //   633: iconst_2
    //   634: anewarray java/lang/String
    //   637: astore #6
    //   639: iconst_0
    //   640: istore #7
    //   642: getstatic f/km.MR : Lf/Gp0;
    //   645: astore #8
    //   647: getfield zj : Lf/mJ;
    //   650: dup
    //   651: astore #9
    //   653: getfield FI0 : B
    //   656: dup
    //   657: istore #10
    //   659: aload #9
    //   661: getfield md : B
    //   664: istore #9
    //   666: iflt -> 701
    //   669: iload #10
    //   671: aload #8
    //   673: getfield ta0 : [Lf/QZ;
    //   676: dup
    //   677: astore #8
    //   679: arraylength
    //   680: if_icmple -> 686
    //   683: goto -> 707
    //   686: aload #8
    //   688: iload #10
    //   690: aaload
    //   691: iload #9
    //   693: invokevirtual cP : (B)Lf/QZ;
    //   696: astore #8
    //   698: goto -> 710
    //   701: aload #8
    //   703: invokevirtual getClass : ()Ljava/lang/Class;
    //   706: pop
    //   707: aconst_null
    //   708: astore #8
    //   710: aload #6
    //   712: aload_0
    //   713: aload #6
    //   715: iload #7
    //   717: aload #8
    //   719: invokevirtual dy : ()Ljava/lang/String;
    //   722: aastore
    //   723: getfield bg : Lf/hm0;
    //   726: invokevirtual I9 : ()Ljava/lang/String;
    //   729: iconst_1
    //   730: swap
    //   731: aastore
    //   732: iconst_2
    //   733: aload_3
    //   734: iload #4
    //   736: iload #5
    //   738: aload #6
    //   740: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   743: astore_3
    //   744: aload_0
    //   745: aload_2
    //   746: dup
    //   747: aload_3
    //   748: invokevirtual cr : (Ljava/lang/String;)V
    //   751: new f/Hd0
    //   754: dup
    //   755: aload_0
    //   756: dup
    //   757: getstatic f/km.MR : Lf/Gp0;
    //   760: astore_3
    //   761: getfield bg : Lf/hm0;
    //   764: astore #4
    //   766: getfield cR : Lf/ET;
    //   769: astore #5
    //   771: aload_3
    //   772: aload #4
    //   774: iload_1
    //   775: aload #5
    //   777: invokespecial <init> : (Lf/Gp0;Lf/hm0;ZLf/ET;)V
    //   780: invokevirtual t80 : (Lf/wb;)V
    //   783: getfield bg : Lf/hm0;
    //   786: getfield K0 : Lf/jd0;
    //   789: invokevirtual j20 : ()Z
    //   792: ifeq -> 826
    //   795: aload_2
    //   796: new f/x70
    //   799: dup
    //   800: astore_1
    //   801: aload_0
    //   802: getstatic f/km.MR : Lf/Gp0;
    //   805: astore_3
    //   806: getfield bg : Lf/hm0;
    //   809: astore #4
    //   811: aload_3
    //   812: aconst_null
    //   813: aload #4
    //   815: invokespecial <init> : (Lf/Gp0;Lf/mA;Lf/hm0;)V
    //   818: getfield YP : Ljava/util/LinkedList;
    //   821: aload_1
    //   822: invokevirtual add : (Ljava/lang/Object;)Z
    //   825: pop
    //   826: aload_2
    //   827: aload_0
    //   828: getfield bg : Lf/hm0;
    //   831: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   834: dup
    //   835: astore_1
    //   836: ifnull -> 861
    //   839: aload_1
    //   840: dup
    //   841: aload_0
    //   842: getfield bg : Lf/hm0;
    //   845: dup
    //   846: astore_0
    //   847: invokevirtual XW : ()S
    //   850: istore_1
    //   851: aload_0
    //   852: iconst_0
    //   853: iload_1
    //   854: invokevirtual COM8 : (Lf/hm0;ZS)V
    //   857: iconst_1
    //   858: invokevirtual CX : (Z)V
    //   861: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 4
    //   #2	-> 7
    //   #3	-> 33
    //   #4	-> 37
    //   #5	-> 42
    //   #6	-> 48
    //   #7	-> 52
    //   #8	-> 80
    //   #9	-> 83
    //   #10	-> 86
    //   #11	-> 92
    //   #12	-> 104
    //   #13	-> 110
    //   #14	-> 148
    //   #15	-> 159
    //   #16	-> 166
    //   #17	-> 169
    //   #18	-> 176
    //   #19	-> 179
    //   #20	-> 193
    //   #21	-> 196
    //   #22	-> 212
    //   #23	-> 217
    //   #24	-> 220
    //   #25	-> 239
    //   #26	-> 244
    //   #27	-> 247
    //   #28	-> 274
    //   #29	-> 301
    //   #30	-> 309
    //   #31	-> 331
    //   #32	-> 336
    //   #33	-> 341
    //   #34	-> 351
    //   #35	-> 377
    //   #36	-> 389
    //   #37	-> 400
    //   #38	-> 403
    //   #39	-> 406
    //   #40	-> 441
    //   #41	-> 613
    //   #42	-> 621
    //   #43	-> 653
    //   #44	-> 661
    //   #45	-> 673
    //   #46	-> 679
    //   #47	-> 703
    //   #48	-> 740
    //   #49	-> 748
    //   #50	-> 786
    //   #51	-> 789
    //   #52	-> 796
    //   #53	-> 815
    //   #54	-> 818
    //   #55	-> 828
  }
  
  public final int zE() {
    return 8;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/U3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */