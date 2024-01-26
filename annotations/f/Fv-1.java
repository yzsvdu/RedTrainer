package f;

public final class Fv extends JS {
  public final byte aI0;
  
  public final short ix0;
  
  public Fv(byte paramByte, short paramShort1, short paramShort2) {
    super(paramShort2);
    this.aI0 = paramByte;
    this.ix0 = paramShort1;
  }
  
  public final byte YG0() {
    return 24;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic cw : ()Lf/yk0;
    //   4: aload_0
    //   5: getfield ix0 : S
    //   8: invokevirtual mP : (S)Lf/WD;
    //   11: astore_3
    //   12: getfield aI0 : B
    //   15: dup
    //   16: istore #4
    //   18: ifeq -> 471
    //   21: iload #4
    //   23: iconst_1
    //   24: if_icmpeq -> 114
    //   27: iload #4
    //   29: iconst_2
    //   30: if_icmpeq -> 36
    //   33: goto -> 739
    //   36: aload_3
    //   37: aload #7
    //   39: getstatic f/F40.ef0 : Lf/F40;
    //   42: astore_0
    //   43: bipush #14
    //   45: istore_1
    //   46: getfield AD : Lf/Gp0;
    //   49: sipush #375
    //   52: aload_2
    //   53: invokevirtual ex : (ILf/hm0;)I
    //   56: istore #4
    //   58: iconst_2
    //   59: anewarray java/lang/String
    //   62: dup
    //   63: astore #5
    //   65: aload_2
    //   66: invokevirtual fA : ()Ljava/lang/String;
    //   69: iconst_0
    //   70: swap
    //   71: aastore
    //   72: iconst_1
    //   73: istore_2
    //   74: ifnonnull -> 83
    //   77: ldc ''
    //   79: astore_3
    //   80: goto -> 91
    //   83: aload_3
    //   84: getfield iz : I
    //   87: invokestatic OH0 : (I)Ljava/lang/String;
    //   90: astore_3
    //   91: aload #7
    //   93: aload #5
    //   95: iload_2
    //   96: aload_3
    //   97: aastore
    //   98: iconst_2
    //   99: aload_0
    //   100: iload_1
    //   101: iload #4
    //   103: aload #5
    //   105: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   108: invokevirtual Kq : (Ljava/lang/String;)V
    //   111: goto -> 739
    //   114: aload_3
    //   115: aload #7
    //   117: getstatic f/F40.ef0 : Lf/F40;
    //   120: astore #4
    //   122: bipush #14
    //   124: istore #5
    //   126: getfield AD : Lf/Gp0;
    //   129: sipush #372
    //   132: aload_2
    //   133: invokevirtual ex : (ILf/hm0;)I
    //   136: istore #6
    //   138: iconst_2
    //   139: anewarray java/lang/String
    //   142: dup
    //   143: astore #8
    //   145: aload_2
    //   146: invokevirtual fA : ()Ljava/lang/String;
    //   149: iconst_0
    //   150: swap
    //   151: aastore
    //   152: iconst_1
    //   153: istore #9
    //   155: ifnonnull -> 164
    //   158: ldc ''
    //   160: astore_3
    //   161: goto -> 172
    //   164: aload_3
    //   165: getfield iz : I
    //   168: invokestatic OH0 : (I)Ljava/lang/String;
    //   171: astore_3
    //   172: aload_0
    //   173: aload #7
    //   175: aload #8
    //   177: iload #9
    //   179: aload_3
    //   180: aastore
    //   181: iconst_2
    //   182: aload #4
    //   184: iload #5
    //   186: iload #6
    //   188: aload #8
    //   190: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   193: invokevirtual Kq : (Ljava/lang/String;)V
    //   196: getfield ix0 : S
    //   199: lookupswitch default -> 256, 35 -> 407, 83 -> 379, 128 -> 351, 250 -> 323, 328 -> 295, 463 -> 259
    //   256: goto -> 435
    //   259: aload #7
    //   261: new f/LV
    //   264: dup
    //   265: astore_3
    //   266: new f/coM6
    //   269: dup
    //   270: aload_2
    //   271: swap
    //   272: aload_1
    //   273: invokespecial <init> : (Lf/hm0;)V
    //   276: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   279: iconst_0
    //   280: swap
    //   281: invokespecial <init> : (BLf/wb;)V
    //   284: getfield YP : Ljava/util/LinkedList;
    //   287: aload_3
    //   288: invokevirtual add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: goto -> 435
    //   295: aload #7
    //   297: new f/LV
    //   300: dup
    //   301: astore_3
    //   302: new f/b7
    //   305: dup
    //   306: aload_2
    //   307: swap
    //   308: aload_1
    //   309: invokespecial <init> : (Lf/hm0;)V
    //   312: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   315: iconst_0
    //   316: swap
    //   317: invokespecial <init> : (BLf/wb;)V
    //   320: goto -> 284
    //   323: aload #7
    //   325: new f/LV
    //   328: dup
    //   329: astore_3
    //   330: new f/Am
    //   333: dup
    //   334: aload_2
    //   335: swap
    //   336: aload_1
    //   337: invokespecial <init> : (Lf/hm0;)V
    //   340: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   343: iconst_0
    //   344: swap
    //   345: invokespecial <init> : (BLf/wb;)V
    //   348: goto -> 284
    //   351: aload #7
    //   353: new f/LV
    //   356: dup
    //   357: astore_3
    //   358: new f/KH0
    //   361: dup
    //   362: aload_2
    //   363: swap
    //   364: aload_1
    //   365: invokespecial <init> : (Lf/hm0;)V
    //   368: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   371: iconst_0
    //   372: swap
    //   373: invokespecial <init> : (BLf/wb;)V
    //   376: goto -> 284
    //   379: aload #7
    //   381: new f/LV
    //   384: dup
    //   385: astore_3
    //   386: new f/com7
    //   389: dup
    //   390: aload_2
    //   391: swap
    //   392: aload_1
    //   393: invokespecial <init> : (Lf/hm0;)V
    //   396: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   399: iconst_0
    //   400: swap
    //   401: invokespecial <init> : (BLf/wb;)V
    //   404: goto -> 284
    //   407: aload #7
    //   409: new f/LV
    //   412: dup
    //   413: astore_3
    //   414: new f/nF0
    //   417: dup
    //   418: aload_2
    //   419: swap
    //   420: aload_1
    //   421: invokespecial <init> : (Lf/hm0;)V
    //   424: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   427: iconst_0
    //   428: swap
    //   429: invokespecial <init> : (BLf/wb;)V
    //   432: goto -> 284
    //   435: aload #7
    //   437: aload_2
    //   438: aload_0
    //   439: getfield cOM9 : S
    //   442: invokevirtual tx : (S)V
    //   445: new f/Gr0
    //   448: dup
    //   449: astore_0
    //   450: aload_2
    //   451: aload #7
    //   453: aload_2
    //   454: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   457: invokespecial <init> : (Lf/hm0;Lf/Hj;)V
    //   460: getfield YP : Ljava/util/LinkedList;
    //   463: aload_0
    //   464: invokevirtual add : (Ljava/lang/Object;)Z
    //   467: pop
    //   468: goto -> 739
    //   471: aload_0
    //   472: iconst_0
    //   473: istore #4
    //   475: getfield ix0 : S
    //   478: lookupswitch default -> 536, 35 -> 628, 83 -> 609, 128 -> 601, 250 -> 582, 328 -> 563, 463 -> 544
    //   536: sipush #803
    //   539: istore #5
    //   541: goto -> 633
    //   544: sipush #830
    //   547: istore #4
    //   549: iconst_1
    //   550: istore #5
    //   552: iload #5
    //   554: iload #4
    //   556: istore #5
    //   558: istore #4
    //   560: goto -> 633
    //   563: sipush #833
    //   566: istore #4
    //   568: iconst_1
    //   569: istore #5
    //   571: iload #5
    //   573: iload #4
    //   575: istore #5
    //   577: istore #4
    //   579: goto -> 633
    //   582: sipush #824
    //   585: istore #4
    //   587: iconst_1
    //   588: istore #5
    //   590: iload #5
    //   592: iload #4
    //   594: istore #5
    //   596: istore #4
    //   598: goto -> 633
    //   601: sipush #817
    //   604: istore #5
    //   606: goto -> 633
    //   609: sipush #827
    //   612: istore #4
    //   614: iconst_1
    //   615: istore #5
    //   617: iload #5
    //   619: iload #4
    //   621: istore #5
    //   623: istore #4
    //   625: goto -> 633
    //   628: sipush #810
    //   631: istore #5
    //   633: iload #4
    //   635: ifeq -> 654
    //   638: aload #7
    //   640: getfield AD : Lf/Gp0;
    //   643: iload #5
    //   645: aload_2
    //   646: invokevirtual ex : (ILf/hm0;)I
    //   649: istore #4
    //   651: goto -> 668
    //   654: aload #7
    //   656: getfield AD : Lf/Gp0;
    //   659: iload #5
    //   661: aload_2
    //   662: aload_1
    //   663: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   666: istore #4
    //   668: aload_0
    //   669: getstatic f/F40.ef0 : Lf/F40;
    //   672: astore_0
    //   673: bipush #14
    //   675: istore #5
    //   677: iconst_2
    //   678: anewarray java/lang/String
    //   681: dup
    //   682: astore #6
    //   684: aload_2
    //   685: invokevirtual fA : ()Ljava/lang/String;
    //   688: iconst_0
    //   689: swap
    //   690: aastore
    //   691: iconst_1
    //   692: istore_2
    //   693: getfield ix0 : S
    //   696: sipush #1003
    //   699: if_icmpne -> 713
    //   702: aload_3
    //   703: getfield iz : I
    //   706: invokestatic OH0 : (I)Ljava/lang/String;
    //   709: astore_1
    //   710: goto -> 718
    //   713: aload_1
    //   714: invokevirtual fA : ()Ljava/lang/String;
    //   717: astore_1
    //   718: aload #7
    //   720: aload #6
    //   722: iload_2
    //   723: aload_1
    //   724: aastore
    //   725: iconst_2
    //   726: aload_0
    //   727: iload #5
    //   729: iload #4
    //   731: aload #6
    //   733: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   736: goto -> 108
    //   739: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 5
    //   #2	-> 8
    //   #3	-> 12
    //   #4	-> 39
    //   #5	-> 46
    //   #6	-> 53
    //   #7	-> 84
    //   #8	-> 97
    //   #9	-> 105
    //   #10	-> 108
    //   #11	-> 126
    //   #12	-> 133
    //   #13	-> 165
    //   #14	-> 180
    //   #15	-> 190
    //   #16	-> 193
    //   #17	-> 196
    //   #18	-> 261
    //   #19	-> 284
    //   #20	-> 297
    //   #21	-> 439
    //   #22	-> 442
    //   #23	-> 460
    //   #24	-> 475
    //   #25	-> 640
    //   #26	-> 646
    //   #27	-> 656
    //   #28	-> 663
    //   #29	-> 693
    //   #30	-> 703
    //   #31	-> 706
    //   #32	-> 714
    //   #33	-> 733
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */