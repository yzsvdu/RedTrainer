package f;

public final class zG extends GS implements Np0 {
  public byte GC0;
  
  public byte ud0;
  
  public short gk0;
  
  public short hh0;
  
  public int WI;
  
  public zG(byte paramByte1, byte paramByte2, short paramShort1, short paramShort2) {
    this.GC0 = paramByte1;
    this.gk0 = paramShort1;
    this.hh0 = paramShort2;
    this.ud0 = paramByte2;
  }
  
  public zG(byte paramByte1, byte paramByte2, int paramInt) {
    this.GC0 = paramByte1;
    this.WI = paramInt;
    this.ud0 = paramByte2;
  }
  
  public final byte YG0() {
    return 76;
  }
  
  public final boolean Lt() {
    return (this.GC0 == 0) ? false : super.Lt();
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: ldc ''
    //   3: astore_3
    //   4: getfield ud0 : B
    //   7: dup
    //   8: istore #4
    //   10: ifne -> 493
    //   13: aload_0
    //   14: getfield GC0 : B
    //   17: tableswitch default -> 60, 1 -> 425, 2 -> 359, 3 -> 268, 4 -> 225, 5 -> 201, 6 -> 174, 7 -> 83
    //   60: getstatic f/F40.ef0 : Lf/F40;
    //   63: aload_0
    //   64: dup
    //   65: getfield gk0 : S
    //   68: istore_0
    //   69: getfield hh0 : S
    //   72: iload_0
    //   73: swap
    //   74: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
    //   77: astore_0
    //   78: aload_0
    //   79: astore_3
    //   80: goto -> 787
    //   83: aload_2
    //   84: aload #7
    //   86: aload_0
    //   87: getstatic f/F40.ef0 : Lf/F40;
    //   90: astore_3
    //   91: getfield gk0 : S
    //   94: istore #4
    //   96: getfield AD : Lf/Gp0;
    //   99: aload_0
    //   100: getfield hh0 : S
    //   103: aload_2
    //   104: aload_1
    //   105: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   108: istore_0
    //   109: iconst_2
    //   110: anewarray java/lang/String
    //   113: astore #5
    //   115: iconst_0
    //   116: istore #6
    //   118: ifnonnull -> 127
    //   121: ldc ''
    //   123: astore_2
    //   124: goto -> 132
    //   127: aload_2
    //   128: invokevirtual fA : ()Ljava/lang/String;
    //   131: astore_2
    //   132: aload_1
    //   133: aload #5
    //   135: iload #6
    //   137: aload_2
    //   138: aastore
    //   139: iconst_1
    //   140: istore_2
    //   141: ifnonnull -> 150
    //   144: ldc ''
    //   146: astore_1
    //   147: goto -> 155
    //   150: aload_1
    //   151: invokevirtual fA : ()Ljava/lang/String;
    //   154: astore_1
    //   155: aload #5
    //   157: iload_2
    //   158: aload_1
    //   159: aastore
    //   160: iconst_2
    //   161: aload_3
    //   162: iload #4
    //   164: iload_0
    //   165: aload #5
    //   167: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   170: astore_0
    //   171: goto -> 488
    //   174: aload_1
    //   175: ifnonnull -> 183
    //   178: iconst_0
    //   179: istore_1
    //   180: goto -> 191
    //   183: aload_1
    //   184: getfield FT : B
    //   187: invokestatic Sr0 : (B)B
    //   190: istore_1
    //   191: getstatic f/F40.ef0 : Lf/F40;
    //   194: aload_0
    //   195: getfield gk0 : S
    //   198: goto -> 246
    //   201: aload_1
    //   202: ifnonnull -> 210
    //   205: iconst_0
    //   206: istore_1
    //   207: goto -> 215
    //   210: aload_1
    //   211: getfield FT : B
    //   214: istore_1
    //   215: getstatic f/F40.ef0 : Lf/F40;
    //   218: aload_0
    //   219: getfield gk0 : S
    //   222: goto -> 246
    //   225: aload_2
    //   226: ifnonnull -> 234
    //   229: iconst_0
    //   230: istore_1
    //   231: goto -> 239
    //   234: aload_2
    //   235: getfield FT : B
    //   238: istore_1
    //   239: getstatic f/F40.ef0 : Lf/F40;
    //   242: aload_0
    //   243: getfield gk0 : S
    //   246: aload #7
    //   248: getfield AD : Lf/Gp0;
    //   251: aload_0
    //   252: getfield hh0 : S
    //   255: iload_1
    //   256: invokevirtual iD : (IB)I
    //   259: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
    //   262: astore_0
    //   263: aload_0
    //   264: astore_3
    //   265: goto -> 787
    //   268: aload_1
    //   269: aload #7
    //   271: aload_0
    //   272: getstatic f/F40.ef0 : Lf/F40;
    //   275: astore_3
    //   276: getfield gk0 : S
    //   279: istore #4
    //   281: getfield AD : Lf/Gp0;
    //   284: aload_0
    //   285: getfield hh0 : S
    //   288: aload_1
    //   289: aload_2
    //   290: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   293: istore_0
    //   294: iconst_2
    //   295: anewarray java/lang/String
    //   298: astore #5
    //   300: iconst_0
    //   301: istore #6
    //   303: ifnonnull -> 312
    //   306: ldc ''
    //   308: astore_1
    //   309: goto -> 317
    //   312: aload_1
    //   313: invokevirtual fA : ()Ljava/lang/String;
    //   316: astore_1
    //   317: aload_2
    //   318: aload #5
    //   320: iload #6
    //   322: aload_1
    //   323: aastore
    //   324: iconst_1
    //   325: istore_1
    //   326: ifnonnull -> 335
    //   329: ldc ''
    //   331: astore_2
    //   332: goto -> 340
    //   335: aload_2
    //   336: invokevirtual fA : ()Ljava/lang/String;
    //   339: astore_2
    //   340: aload #5
    //   342: iload_1
    //   343: aload_2
    //   344: aastore
    //   345: iconst_2
    //   346: aload_3
    //   347: iload #4
    //   349: iload_0
    //   350: aload #5
    //   352: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   355: astore_0
    //   356: goto -> 488
    //   359: aload_1
    //   360: aload #7
    //   362: aload_0
    //   363: getstatic f/F40.ef0 : Lf/F40;
    //   366: astore_2
    //   367: getfield gk0 : S
    //   370: istore_3
    //   371: getfield AD : Lf/Gp0;
    //   374: aload_0
    //   375: getfield hh0 : S
    //   378: aload_1
    //   379: invokevirtual ex : (ILf/hm0;)I
    //   382: istore_0
    //   383: iconst_1
    //   384: anewarray java/lang/String
    //   387: astore #4
    //   389: iconst_0
    //   390: istore #5
    //   392: ifnonnull -> 401
    //   395: ldc ''
    //   397: astore_1
    //   398: goto -> 406
    //   401: aload_1
    //   402: invokevirtual fA : ()Ljava/lang/String;
    //   405: astore_1
    //   406: aload #4
    //   408: iload #5
    //   410: aload_1
    //   411: aastore
    //   412: iconst_2
    //   413: aload_2
    //   414: iload_3
    //   415: iload_0
    //   416: aload #4
    //   418: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   421: astore_0
    //   422: goto -> 488
    //   425: aload_2
    //   426: aload #7
    //   428: aload_0
    //   429: getstatic f/F40.ef0 : Lf/F40;
    //   432: astore_1
    //   433: getfield gk0 : S
    //   436: istore_3
    //   437: getfield AD : Lf/Gp0;
    //   440: aload_0
    //   441: getfield hh0 : S
    //   444: aload_2
    //   445: invokevirtual ex : (ILf/hm0;)I
    //   448: istore_0
    //   449: iconst_1
    //   450: anewarray java/lang/String
    //   453: astore #4
    //   455: iconst_0
    //   456: istore #5
    //   458: ifnonnull -> 467
    //   461: ldc ''
    //   463: astore_2
    //   464: goto -> 472
    //   467: aload_2
    //   468: invokevirtual fA : ()Ljava/lang/String;
    //   471: astore_2
    //   472: aload #4
    //   474: iload #5
    //   476: aload_2
    //   477: aastore
    //   478: iconst_2
    //   479: aload_1
    //   480: iload_3
    //   481: iload_0
    //   482: aload #4
    //   484: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   487: astore_0
    //   488: aload_0
    //   489: astore_3
    //   490: goto -> 787
    //   493: iload #4
    //   495: iconst_1
    //   496: if_icmpne -> 787
    //   499: aload_0
    //   500: getfield GC0 : B
    //   503: tableswitch default -> 544, 1 -> 761, 2 -> 741, 3 -> 678, 4 -> 651, 5 -> 636, 6 -> 618, 7 -> 555
    //   544: aload_0
    //   545: getfield WI : I
    //   548: invokestatic OH0 : (I)Ljava/lang/String;
    //   551: astore_3
    //   552: goto -> 787
    //   555: aload_2
    //   556: aload_0
    //   557: getfield WI : I
    //   560: istore_0
    //   561: iconst_2
    //   562: anewarray java/lang/String
    //   565: astore_3
    //   566: iconst_0
    //   567: istore #4
    //   569: ifnonnull -> 578
    //   572: ldc ''
    //   574: astore_2
    //   575: goto -> 583
    //   578: aload_2
    //   579: invokevirtual fA : ()Ljava/lang/String;
    //   582: astore_2
    //   583: aload_1
    //   584: aload_3
    //   585: iload #4
    //   587: aload_2
    //   588: aastore
    //   589: iconst_1
    //   590: istore_2
    //   591: ifnonnull -> 600
    //   594: ldc ''
    //   596: astore_1
    //   597: goto -> 605
    //   600: aload_1
    //   601: invokevirtual fA : ()Ljava/lang/String;
    //   604: astore_1
    //   605: iload_0
    //   606: aload_3
    //   607: iload_2
    //   608: aload_1
    //   609: aastore
    //   610: aload_3
    //   611: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
    //   614: astore_3
    //   615: goto -> 787
    //   618: aload_1
    //   619: ifnonnull -> 625
    //   622: goto -> 655
    //   625: aload_1
    //   626: getfield FT : B
    //   629: invokestatic Sr0 : (B)B
    //   632: istore_1
    //   633: goto -> 665
    //   636: aload_1
    //   637: ifnonnull -> 643
    //   640: goto -> 655
    //   643: aload_1
    //   644: getfield FT : B
    //   647: istore_1
    //   648: goto -> 665
    //   651: aload_2
    //   652: ifnonnull -> 660
    //   655: iconst_0
    //   656: istore_1
    //   657: goto -> 665
    //   660: aload_2
    //   661: getfield FT : B
    //   664: istore_1
    //   665: aload_0
    //   666: getfield WI : I
    //   669: iload_1
    //   670: iadd
    //   671: invokestatic OH0 : (I)Ljava/lang/String;
    //   674: astore_3
    //   675: goto -> 787
    //   678: aload_1
    //   679: aload_0
    //   680: getfield WI : I
    //   683: istore_0
    //   684: iconst_2
    //   685: anewarray java/lang/String
    //   688: astore_3
    //   689: iconst_0
    //   690: istore #4
    //   692: ifnonnull -> 701
    //   695: ldc ''
    //   697: astore_1
    //   698: goto -> 706
    //   701: aload_1
    //   702: invokevirtual fA : ()Ljava/lang/String;
    //   705: astore_1
    //   706: aload_2
    //   707: aload_3
    //   708: iload #4
    //   710: aload_1
    //   711: aastore
    //   712: iconst_1
    //   713: istore_1
    //   714: ifnonnull -> 723
    //   717: ldc ''
    //   719: astore_2
    //   720: goto -> 728
    //   723: aload_2
    //   724: invokevirtual fA : ()Ljava/lang/String;
    //   727: astore_2
    //   728: iload_0
    //   729: aload_3
    //   730: iload_1
    //   731: aload_2
    //   732: aastore
    //   733: aload_3
    //   734: invokestatic sB : (I[Ljava/lang/String;)Ljava/lang/String;
    //   737: astore_3
    //   738: goto -> 787
    //   741: aload_1
    //   742: aload_0
    //   743: getfield WI : I
    //   746: istore_0
    //   747: ifnonnull -> 753
    //   750: goto -> 770
    //   753: aload_1
    //   754: invokevirtual fA : ()Ljava/lang/String;
    //   757: astore_1
    //   758: goto -> 781
    //   761: aload_2
    //   762: aload_0
    //   763: getfield WI : I
    //   766: istore_0
    //   767: ifnonnull -> 776
    //   770: ldc ''
    //   772: astore_1
    //   773: goto -> 781
    //   776: aload_2
    //   777: invokevirtual fA : ()Ljava/lang/String;
    //   780: astore_1
    //   781: iload_0
    //   782: aload_1
    //   783: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   786: astore_3
    //   787: aload #7
    //   789: aload_3
    //   790: invokevirtual Kq : (Ljava/lang/String;)V
    //   793: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 96
    //   #2	-> 100
    //   #3	-> 167
    //   #4	-> 184
    //   #5	-> 187
    //   #6	-> 211
    //   #7	-> 215
    //   #8	-> 235
    //   #9	-> 239
    //   #10	-> 248
    //   #11	-> 252
    //   #12	-> 281
    //   #13	-> 285
    //   #14	-> 352
    //   #15	-> 363
    //   #16	-> 371
    //   #17	-> 375
    //   #18	-> 418
    //   #19	-> 429
    //   #20	-> 437
    //   #21	-> 441
    //   #22	-> 484
    //   #23	-> 500
    //   #24	-> 626
    //   #25	-> 629
    //   #26	-> 644
    //   #27	-> 661
    //   #28	-> 666
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */