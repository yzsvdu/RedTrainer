package f;

public final class kG0 extends yd {
  public final G5 Pm;
  
  public final byte ac0;
  
  public kG0(G5 paramG5, byte paramByte) {
    this.Pm = paramG5;
    this.ac0 = paramByte;
  }
  
  public final void Hb0(d7 paramd7) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: dup
    //   3: getfield Pm : Lf/G5;
    //   6: astore_0
    //   7: getfield ac0 : B
    //   10: istore_2
    //   11: getfield OF0 : Lf/tc;
    //   14: getfield HW : Lf/G5;
    //   17: dup
    //   18: astore_3
    //   19: getfield g50 : B
    //   22: aload_0
    //   23: getfield g50 : B
    //   26: dup
    //   27: istore #4
    //   29: if_icmpeq -> 44
    //   32: iload #4
    //   34: iconst_m1
    //   35: if_icmpeq -> 44
    //   38: aload_3
    //   39: iload #4
    //   41: putfield g50 : B
    //   44: iload_2
    //   45: bipush #-128
    //   47: iand
    //   48: ifeq -> 57
    //   51: iconst_1
    //   52: istore #4
    //   54: goto -> 60
    //   57: iconst_0
    //   58: istore #4
    //   60: iload_2
    //   61: bipush #64
    //   63: iand
    //   64: ifeq -> 73
    //   67: iconst_1
    //   68: istore #5
    //   70: goto -> 76
    //   73: iconst_0
    //   74: istore #5
    //   76: iload_2
    //   77: iconst_4
    //   78: iand
    //   79: ifeq -> 88
    //   82: iconst_1
    //   83: istore #6
    //   85: goto -> 91
    //   88: iconst_0
    //   89: istore #6
    //   91: aload_3
    //   92: aload_1
    //   93: dup
    //   94: iload #6
    //   96: putfield J4 : Z
    //   99: iload #5
    //   101: putfield eF : Z
    //   104: invokevirtual CJ0 : ()Lf/xr0;
    //   107: dup
    //   108: astore_3
    //   109: ifnull -> 156
    //   112: aload_3
    //   113: invokevirtual Y00 : ()Z
    //   116: ifeq -> 156
    //   119: aload_1
    //   120: dup
    //   121: getfield aA0 : Lf/eo;
    //   124: aload_3
    //   125: invokevirtual j5 : ()Lf/eo;
    //   128: invokevirtual JL : (Lf/eo;)Lf/eo;
    //   131: pop
    //   132: getfield aA0 : Lf/eo;
    //   135: dup
    //   136: dup2
    //   137: getfield y : F
    //   140: fstore #7
    //   142: getfield z : F
    //   145: putfield y : F
    //   148: fload #7
    //   150: putfield z : F
    //   153: goto -> 488
    //   156: aload_3
    //   157: instanceof f/il
    //   160: ifeq -> 212
    //   163: aload_1
    //   164: getfield aA0 : Lf/eo;
    //   167: aload_1
    //   168: getfield OF0 : Lf/tc;
    //   171: dup
    //   172: getfield HW : Lf/G5;
    //   175: dup
    //   176: getfield mm : S
    //   179: i2f
    //   180: ldc 0.5
    //   182: fadd
    //   183: fstore #7
    //   185: getfield Yu0 : S
    //   188: i2f
    //   189: ldc 0.5
    //   191: fadd
    //   192: fstore #8
    //   194: invokevirtual aJ0 : ()F
    //   197: fstore #9
    //   199: fload #7
    //   201: fload #8
    //   203: fload #9
    //   205: invokevirtual TG0 : (FFF)Lf/eo;
    //   208: pop
    //   209: goto -> 488
    //   212: aload_1
    //   213: getfield OF0 : Lf/tc;
    //   216: dup
    //   217: astore #7
    //   219: getfield HW : Lf/G5;
    //   222: dup
    //   223: astore #8
    //   225: getfield FB : B
    //   228: aload_0
    //   229: getfield FB : B
    //   232: if_icmpne -> 276
    //   235: aload #8
    //   237: getfield kD0 : B
    //   240: aload_0
    //   241: getfield kD0 : B
    //   244: if_icmpne -> 276
    //   247: aload #8
    //   249: getfield vu0 : B
    //   252: aload_0
    //   253: getfield vu0 : B
    //   256: if_icmpne -> 276
    //   259: aload #8
    //   261: aload_1
    //   262: getfield aA0 : Lf/eo;
    //   265: astore #9
    //   267: getfield mm : S
    //   270: i2f
    //   271: fstore #10
    //   273: goto -> 464
    //   276: aload_3
    //   277: ifnonnull -> 286
    //   280: aconst_null
    //   281: astore #7
    //   283: goto -> 301
    //   286: aload_3
    //   287: invokevirtual Q4 : ()Lf/KI;
    //   290: aload_3
    //   291: aload_0
    //   292: getfield g50 : B
    //   295: iconst_1
    //   296: invokevirtual COm3 : (Lf/xr0;BI)Lf/xr0;
    //   299: astore #7
    //   301: aload #7
    //   303: ifnull -> 439
    //   306: aload_0
    //   307: aload_1
    //   308: getfield aA0 : Lf/eo;
    //   311: aload #7
    //   313: invokevirtual Ka : ()S
    //   316: i2f
    //   317: aload_1
    //   318: aload #7
    //   320: invokevirtual hA0 : ()S
    //   323: i2f
    //   324: fstore #7
    //   326: getfield OF0 : Lf/tc;
    //   329: invokevirtual aJ0 : ()F
    //   332: fload #7
    //   334: swap
    //   335: invokevirtual TG0 : (FFF)Lf/eo;
    //   338: pop
    //   339: getfield g50 : B
    //   342: tableswitch default -> 372, 0 -> 423, 1 -> 407, 2 -> 391, 3 -> 375
    //   372: goto -> 488
    //   375: aload_1
    //   376: getfield aA0 : Lf/eo;
    //   379: dup
    //   380: getfield x : F
    //   383: fconst_1
    //   384: fsub
    //   385: putfield x : F
    //   388: goto -> 488
    //   391: aload_1
    //   392: getfield aA0 : Lf/eo;
    //   395: dup
    //   396: getfield x : F
    //   399: fconst_1
    //   400: fadd
    //   401: putfield x : F
    //   404: goto -> 488
    //   407: aload_1
    //   408: getfield aA0 : Lf/eo;
    //   411: dup
    //   412: getfield y : F
    //   415: fconst_1
    //   416: fadd
    //   417: putfield y : F
    //   420: goto -> 488
    //   423: aload_1
    //   424: getfield aA0 : Lf/eo;
    //   427: dup
    //   428: getfield y : F
    //   431: fconst_1
    //   432: fsub
    //   433: putfield y : F
    //   436: goto -> 488
    //   439: aload_1
    //   440: dup
    //   441: getfield aA0 : Lf/eo;
    //   444: astore #9
    //   446: getfield OF0 : Lf/tc;
    //   449: dup
    //   450: astore #7
    //   452: getfield HW : Lf/G5;
    //   455: dup
    //   456: astore #8
    //   458: getfield mm : S
    //   461: i2f
    //   462: fstore #10
    //   464: aload #9
    //   466: fload #10
    //   468: aload #7
    //   470: aload #8
    //   472: getfield Yu0 : S
    //   475: i2f
    //   476: fstore #7
    //   478: invokevirtual aJ0 : ()F
    //   481: fload #7
    //   483: swap
    //   484: invokevirtual TG0 : (FFF)Lf/eo;
    //   487: pop
    //   488: aload_1
    //   489: dup
    //   490: dup2
    //   491: iconst_1
    //   492: putfield n3 : Z
    //   495: getfield OF0 : Lf/tc;
    //   498: iload #4
    //   500: putfield dh : Z
    //   503: lconst_0
    //   504: invokevirtual j10 : (J)V
    //   507: getfield OF0 : Lf/tc;
    //   510: getfield HW : Lf/G5;
    //   513: aload_0
    //   514: invokevirtual equals : (Ljava/lang/Object;)Z
    //   517: ifeq -> 523
    //   520: goto -> 869
    //   523: getstatic f/km.a3 : Lf/vh0;
    //   526: aload_1
    //   527: getfield OF0 : Lf/tc;
    //   530: getfield HW : Lf/G5;
    //   533: dup
    //   534: dup
    //   535: getfield FB : B
    //   538: istore #7
    //   540: getfield kD0 : B
    //   543: istore #8
    //   545: getfield vu0 : B
    //   548: istore #9
    //   550: iload #7
    //   552: iload #8
    //   554: iload #9
    //   556: invokevirtual COm8 : (BBB)Lf/KI;
    //   559: getstatic f/km.a3 : Lf/vh0;
    //   562: aload_0
    //   563: dup
    //   564: dup
    //   565: getfield FB : B
    //   568: istore #7
    //   570: getfield kD0 : B
    //   573: istore #8
    //   575: getfield vu0 : B
    //   578: istore #9
    //   580: iload #7
    //   582: iload #8
    //   584: iload #9
    //   586: invokevirtual COm8 : (BBB)Lf/KI;
    //   589: astore #7
    //   591: ifnull -> 869
    //   594: aload #7
    //   596: ifnonnull -> 602
    //   599: goto -> 869
    //   602: aload_0
    //   603: getfield LB0 : Z
    //   606: ifeq -> 643
    //   609: aload #7
    //   611: aload_0
    //   612: dup
    //   613: dup
    //   614: getfield Qf0 : B
    //   617: istore #7
    //   619: getfield mm : S
    //   622: istore #8
    //   624: getfield Yu0 : S
    //   627: istore #9
    //   629: iload #7
    //   631: iload #8
    //   633: iload #9
    //   635: invokevirtual v4 : (BSS)Lf/xr0;
    //   638: astore #7
    //   640: goto -> 684
    //   643: aload_3
    //   644: aload_0
    //   645: dup
    //   646: getfield mm : S
    //   649: istore #8
    //   651: getfield Yu0 : S
    //   654: istore #9
    //   656: ifnonnull -> 665
    //   659: fconst_0
    //   660: fstore #10
    //   662: goto -> 671
    //   665: aload_3
    //   666: invokevirtual i00 : ()F
    //   669: fstore #10
    //   671: aload #7
    //   673: iload #8
    //   675: iload #9
    //   677: fload #10
    //   679: invokevirtual U30 : (SSF)Lf/xr0;
    //   682: astore #7
    //   684: aload_1
    //   685: aload_3
    //   686: aload_0
    //   687: getfield g50 : B
    //   690: aload #7
    //   692: swap
    //   693: iload #4
    //   695: iload #5
    //   697: iload #6
    //   699: invokevirtual Dx0 : (Lf/xr0;Lf/xr0;BZZZ)Z
    //   702: ifne -> 722
    //   705: aload_1
    //   706: getfield OF0 : Lf/tc;
    //   709: getfield HW : Lf/G5;
    //   712: aload_0
    //   713: getfield g50 : B
    //   716: putfield g50 : B
    //   719: goto -> 869
    //   722: aload_3
    //   723: aload_1
    //   724: dup
    //   725: dup
    //   726: dup2
    //   727: getfield OF0 : Lf/tc;
    //   730: aload_3
    //   731: invokevirtual d1 : (Lf/tc;Lf/xr0;)V
    //   734: getfield OF0 : Lf/tc;
    //   737: getfield HW : Lf/G5;
    //   740: aload_0
    //   741: invokevirtual Ic : (Lf/G5;)V
    //   744: getstatic f/zm0.u20 : J
    //   747: putfield xc : J
    //   750: invokevirtual Q80 : ()V
    //   753: ifnull -> 805
    //   756: aload_3
    //   757: invokevirtual hz : ()Lf/ZK0;
    //   760: aload_3
    //   761: aload_1
    //   762: getfield OF0 : Lf/tc;
    //   765: getfield HW : Lf/G5;
    //   768: getfield g50 : B
    //   771: pop
    //   772: aload #7
    //   774: invokevirtual VP : (Lf/xr0;Lf/xr0;)I
    //   777: ifle -> 805
    //   780: aload_1
    //   781: aload_3
    //   782: invokevirtual hz : ()Lf/ZK0;
    //   785: aload_3
    //   786: aload_1
    //   787: getfield OF0 : Lf/tc;
    //   790: getfield HW : Lf/G5;
    //   793: getfield g50 : B
    //   796: pop
    //   797: aload #7
    //   799: invokevirtual VP : (Lf/xr0;Lf/xr0;)I
    //   802: putfield tD0 : I
    //   805: aload_3
    //   806: aload #7
    //   808: if_acmpeq -> 855
    //   811: aload_3
    //   812: aload #7
    //   814: iload_2
    //   815: iconst_1
    //   816: ior
    //   817: i2b
    //   818: istore_0
    //   819: invokevirtual hz : ()Lf/ZK0;
    //   822: aload #7
    //   824: aload_1
    //   825: getfield OF0 : Lf/tc;
    //   828: aload_3
    //   829: swap
    //   830: iload_0
    //   831: invokevirtual com4 : (Lf/xr0;Lf/xr0;Lf/tc;B)Z
    //   834: pop
    //   835: ifnull -> 855
    //   838: aload_1
    //   839: aload_3
    //   840: dup
    //   841: invokevirtual hz : ()Lf/ZK0;
    //   844: aload_1
    //   845: getfield OF0 : Lf/tc;
    //   848: aload_3
    //   849: invokevirtual Uk0 : (Lf/tc;Lf/xr0;)V
    //   852: invokevirtual Bg : (Lf/xr0;)V
    //   855: aload_1
    //   856: getfield OF0 : Lf/tc;
    //   859: getfield HW : Lf/G5;
    //   862: dup
    //   863: getfield g50 : B
    //   866: putfield ZJ0 : B
    //   869: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 14
    //   #3	-> 19
    //   #4	-> 41
    //   #5	-> 96
    //   #6	-> 172
    //   #7	-> 176
    //   #8	-> 185
    //   #9	-> 194
    //   #10	-> 219
    //   #11	-> 225
    //   #12	-> 229
    //   #13	-> 237
    //   #14	-> 241
    //   #15	-> 249
    //   #16	-> 253
    //   #17	-> 262
    //   #18	-> 267
    //   #19	-> 287
    //   #20	-> 292
    //   #21	-> 296
    //   #22	-> 339
    //   #23	-> 376
    //   #24	-> 452
    //   #25	-> 458
    //   #26	-> 472
    //   #27	-> 478
    //   #28	-> 500
    //   #29	-> 504
    //   #30	-> 507
    //   #31	-> 510
    //   #32	-> 514
    //   #33	-> 530
    //   #34	-> 535
    //   #35	-> 540
    //   #36	-> 545
    //   #37	-> 556
    //   #38	-> 565
    //   #39	-> 570
    //   #40	-> 575
    //   #41	-> 586
    //   #42	-> 603
    //   #43	-> 614
    //   #44	-> 619
    //   #45	-> 624
    //   #46	-> 635
    //   #47	-> 646
    //   #48	-> 651
    //   #49	-> 666
    //   #50	-> 687
    //   #51	-> 699
    //   #52	-> 709
    //   #53	-> 713
    //   #54	-> 716
    //   #55	-> 727
    //   #56	-> 737
    //   #57	-> 741
    //   #58	-> 744
    //   #59	-> 747
    //   #60	-> 765
    //   #61	-> 768
    //   #62	-> 774
    //   #63	-> 790
    //   #64	-> 793
    //   #65	-> 799
    //   #66	-> 859
    //   #67	-> 863
    //   #68	-> 866
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */