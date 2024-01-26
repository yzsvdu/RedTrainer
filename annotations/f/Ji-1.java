package f;

public final class Ji extends Ty {
  public final Object I9(Pp0 paramPp0, E7 paramE7) {
    this();
    this.hp = paramE7.else(8);
    this.vj = paramE7.else(16);
    this.Aj = paramE7.else(16);
    this.oE0 = paramE7.else(6);
    this.r6 = paramE7.else(8);
    J8 j8;
    int i = paramE7.else(4) + 1;
    if ((new J8()).hp < 1 || this.vj < 1 || this.Aj < 1 || i < 1)
      return null; 
    for (i = 0; i < this.ls; i++) {
      this.K10[i] = paramE7.else(8);
      int j;
      if ((j = this.K10[i]) < 0 || j >= paramPp0.K3)
        return null; 
    } 
    return this;
  }
  
  public final Object M8(eX parameX, ag paramag, Object paramObject) {
    // Byte code:
    //   0: aload_3
    //   1: aload_1
    //   2: getfield M50 : Lf/Pp0;
    //   5: astore_0
    //   6: checkcast f/J8
    //   9: dup
    //   10: astore_1
    //   11: new f/ul0
    //   14: dup
    //   15: astore_3
    //   16: aload_0
    //   17: aload_3
    //   18: aload_1
    //   19: aload_3
    //   20: invokespecial <init> : ()V
    //   23: getfield hp : I
    //   26: putfield qr0 : I
    //   29: getfield OF : [I
    //   32: aload_2
    //   33: getfield OZ : I
    //   36: iaload
    //   37: iconst_2
    //   38: idiv
    //   39: putfield Wr : I
    //   42: getfield Aj : I
    //   45: dup
    //   46: istore_0
    //   47: aload_3
    //   48: dup
    //   49: aload_1
    //   50: aload_3
    //   51: iload_0
    //   52: putfield Zu0 : I
    //   55: putfield up : Lf/J8;
    //   58: getfield Ns0 : Lf/dq;
    //   61: getfield FD : Lf/coM5;
    //   64: astore_0
    //   65: iconst_2
    //   66: imul
    //   67: dup
    //   68: dup
    //   69: istore_2
    //   70: aload_0
    //   71: invokevirtual getClass : ()Ljava/lang/Class;
    //   74: pop
    //   75: iconst_3
    //   76: imul
    //   77: newarray float
    //   79: astore_0
    //   80: bipush #32
    //   82: newarray int
    //   84: astore #4
    //   86: iconst_1
    //   87: if_icmpne -> 93
    //   90: goto -> 492
    //   93: iconst_0
    //   94: istore #5
    //   96: iconst_m1
    //   97: istore #6
    //   99: iconst_0
    //   100: istore #7
    //   102: bipush #101
    //   104: istore #8
    //   106: iload_2
    //   107: istore #9
    //   109: iload #8
    //   111: bipush #101
    //   113: if_icmpeq -> 140
    //   116: iload #8
    //   118: bipush #104
    //   120: if_icmpeq -> 165
    //   123: iload #8
    //   125: bipush #107
    //   127: if_icmpeq -> 133
    //   130: goto -> 109
    //   133: iload #9
    //   135: istore #8
    //   137: goto -> 274
    //   140: iload #6
    //   142: iconst_1
    //   143: iadd
    //   144: dup
    //   145: istore #6
    //   147: iconst_4
    //   148: if_icmpge -> 162
    //   151: getstatic f/coM5.qY : [I
    //   154: iload #6
    //   156: iaload
    //   157: istore #5
    //   159: goto -> 165
    //   162: iinc #5, 2
    //   165: iload #9
    //   167: iload #5
    //   169: iload #9
    //   171: iload #5
    //   173: idiv
    //   174: dup
    //   175: istore #8
    //   177: imul
    //   178: isub
    //   179: ifeq -> 189
    //   182: bipush #101
    //   184: istore #8
    //   186: goto -> 109
    //   189: iload #5
    //   191: aload #4
    //   193: iload #7
    //   195: iconst_1
    //   196: iadd
    //   197: dup
    //   198: istore #7
    //   200: iconst_1
    //   201: iadd
    //   202: iload #5
    //   204: iastore
    //   205: iconst_2
    //   206: if_icmpeq -> 212
    //   209: goto -> 218
    //   212: iload #7
    //   214: iconst_1
    //   215: if_icmpne -> 233
    //   218: bipush #107
    //   220: istore #9
    //   222: iload #9
    //   224: iload #8
    //   226: istore #9
    //   228: istore #8
    //   230: goto -> 109
    //   233: iconst_1
    //   234: istore #9
    //   236: iload #9
    //   238: iload #7
    //   240: if_icmpge -> 269
    //   243: aload #4
    //   245: dup
    //   246: iload #7
    //   248: iload #9
    //   250: isub
    //   251: iconst_1
    //   252: iadd
    //   253: dup
    //   254: iconst_1
    //   255: iadd
    //   256: istore #10
    //   258: iaload
    //   259: iload #10
    //   261: swap
    //   262: iastore
    //   263: iinc #9, 1
    //   266: goto -> 236
    //   269: aload #4
    //   271: iconst_2
    //   272: iconst_2
    //   273: iastore
    //   274: iload #8
    //   276: iconst_1
    //   277: if_icmpeq -> 295
    //   280: bipush #104
    //   282: istore #9
    //   284: iload #9
    //   286: iload #8
    //   288: istore #9
    //   290: istore #8
    //   292: goto -> 109
    //   295: iload #7
    //   297: iload_2
    //   298: aload #4
    //   300: dup
    //   301: iconst_0
    //   302: iload_2
    //   303: iastore
    //   304: iconst_1
    //   305: iload #7
    //   307: iastore
    //   308: i2f
    //   309: ldc 6.2831855
    //   311: swap
    //   312: fdiv
    //   313: fstore #5
    //   315: iconst_0
    //   316: istore #6
    //   318: iconst_1
    //   319: isub
    //   320: dup
    //   321: istore #7
    //   323: iconst_1
    //   324: istore #8
    //   326: ifne -> 332
    //   329: goto -> 492
    //   332: iconst_0
    //   333: istore #9
    //   335: iload #9
    //   337: iload #7
    //   339: if_icmpge -> 492
    //   342: aload #4
    //   344: iload #9
    //   346: iconst_2
    //   347: iadd
    //   348: iaload
    //   349: dup
    //   350: istore #10
    //   352: iload_2
    //   353: iload #8
    //   355: iload #10
    //   357: iconst_0
    //   358: istore #10
    //   360: imul
    //   361: dup
    //   362: istore #11
    //   364: idiv
    //   365: istore #12
    //   367: iconst_1
    //   368: isub
    //   369: istore #13
    //   371: iconst_0
    //   372: istore #14
    //   374: iload #14
    //   376: iload #13
    //   378: if_icmpge -> 482
    //   381: iload #10
    //   383: iload #8
    //   385: iadd
    //   386: dup
    //   387: istore #10
    //   389: i2f
    //   390: fload #5
    //   392: fmul
    //   393: fstore #15
    //   395: fconst_0
    //   396: fstore #16
    //   398: iconst_2
    //   399: istore #17
    //   401: iload #6
    //   403: istore #18
    //   405: iload #17
    //   407: iload #12
    //   409: if_icmpge -> 469
    //   412: aload_0
    //   413: iload_2
    //   414: aload_0
    //   415: fload #16
    //   417: fconst_1
    //   418: fadd
    //   419: dup
    //   420: fstore #16
    //   422: fload #15
    //   424: fmul
    //   425: iload_2
    //   426: iload #18
    //   428: dup
    //   429: iconst_1
    //   430: iadd
    //   431: istore #18
    //   433: iadd
    //   434: istore #19
    //   436: f2d
    //   437: dstore #20
    //   439: iload #19
    //   441: dload #20
    //   443: invokestatic cos : (D)D
    //   446: d2f
    //   447: fastore
    //   448: iload #18
    //   450: dup
    //   451: iconst_1
    //   452: iadd
    //   453: istore #18
    //   455: iadd
    //   456: dload #20
    //   458: invokestatic sin : (D)D
    //   461: d2f
    //   462: fastore
    //   463: iinc #17, 2
    //   466: goto -> 405
    //   469: iload #6
    //   471: iload #12
    //   473: iadd
    //   474: istore #6
    //   476: iinc #14, 1
    //   479: goto -> 374
    //   482: iinc #9, 1
    //   485: iload #11
    //   487: istore #8
    //   489: goto -> 335
    //   492: aload_3
    //   493: dup
    //   494: dup
    //   495: getfield Zu0 : I
    //   498: i2f
    //   499: aload_1
    //   500: getfield vj : I
    //   503: i2d
    //   504: ldc2_w 2.0
    //   507: ddiv
    //   508: d2f
    //   509: dup
    //   510: fstore_0
    //   511: f2d
    //   512: dup2
    //   513: dstore #4
    //   515: fload_0
    //   516: dup
    //   517: dload #4
    //   519: ldc2_w 7.4E-4
    //   522: dmul
    //   523: invokestatic atan : (D)D
    //   526: ldc2_w 13.1
    //   529: dmul
    //   530: dstore #4
    //   532: fmul
    //   533: f2d
    //   534: ldc2_w 1.85E-8
    //   537: dmul
    //   538: invokestatic atan : (D)D
    //   541: ldc2_w 2.24
    //   544: dmul
    //   545: dload #4
    //   547: dadd
    //   548: dstore #4
    //   550: ldc2_w 1.0E-4
    //   553: dmul
    //   554: dload #4
    //   556: dadd
    //   557: d2f
    //   558: fdiv
    //   559: fstore_0
    //   560: getfield Wr : I
    //   563: newarray int
    //   565: putfield Wa : [I
    //   568: iconst_0
    //   569: istore_2
    //   570: iload_2
    //   571: aload_3
    //   572: getfield Wr : I
    //   575: dup
    //   576: istore #4
    //   578: if_icmpge -> 687
    //   581: aload_1
    //   582: getfield vj : I
    //   585: i2d
    //   586: ldc2_w 2.0
    //   589: ddiv
    //   590: iload #4
    //   592: i2d
    //   593: ddiv
    //   594: iload_2
    //   595: i2d
    //   596: dmul
    //   597: d2f
    //   598: dup
    //   599: fstore #4
    //   601: f2d
    //   602: dup2
    //   603: dstore #5
    //   605: fload #4
    //   607: dup
    //   608: dload #5
    //   610: ldc2_w 7.4E-4
    //   613: dmul
    //   614: invokestatic atan : (D)D
    //   617: ldc2_w 13.1
    //   620: dmul
    //   621: dstore #4
    //   623: fmul
    //   624: f2d
    //   625: ldc2_w 1.85E-8
    //   628: dmul
    //   629: invokestatic atan : (D)D
    //   632: ldc2_w 2.24
    //   635: dmul
    //   636: dload #4
    //   638: dadd
    //   639: dstore #4
    //   641: ldc2_w 1.0E-4
    //   644: dmul
    //   645: dload #4
    //   647: dadd
    //   648: d2f
    //   649: fload_0
    //   650: fmul
    //   651: f2d
    //   652: invokestatic floor : (D)D
    //   655: d2i
    //   656: dup
    //   657: istore #4
    //   659: aload_3
    //   660: getfield Zu0 : I
    //   663: dup
    //   664: istore #5
    //   666: if_icmplt -> 673
    //   669: iload #5
    //   671: istore #4
    //   673: aload_3
    //   674: getfield Wa : [I
    //   677: iload_2
    //   678: iload #4
    //   680: iastore
    //   681: iinc #2, 1
    //   684: goto -> 570
    //   687: aload_3
    //   688: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 61
    //   #2	-> 71
    //   #3	-> 77
    //   #4	-> 151
    //   #5	-> 495
    //   #6	-> 523
    //   #7	-> 560
    //   #8	-> 614
    //   #9	-> 652
  }
  
  public final void Qk0() {}
  
  public final Object try(m6 paramm6, Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_3
    //   1: aload_2
    //   2: checkcast f/ul0
    //   5: dup
    //   6: astore_0
    //   7: getfield up : Lf/J8;
    //   10: astore_2
    //   11: aconst_null
    //   12: astore #4
    //   14: instanceof [F
    //   17: ifeq -> 26
    //   20: aload_3
    //   21: checkcast [F
    //   24: astore #4
    //   26: aload_1
    //   27: getfield Nh : Lf/E7;
    //   30: aload_2
    //   31: getfield oE0 : I
    //   34: invokevirtual else : (I)I
    //   37: dup
    //   38: istore_3
    //   39: ifle -> 352
    //   42: aload_1
    //   43: iload_3
    //   44: aload_2
    //   45: getfield oE0 : I
    //   48: iconst_1
    //   49: swap
    //   50: ishl
    //   51: iconst_1
    //   52: isub
    //   53: istore_3
    //   54: i2f
    //   55: iload_3
    //   56: i2f
    //   57: fdiv
    //   58: aload_2
    //   59: getfield r6 : I
    //   62: i2f
    //   63: fmul
    //   64: fstore_3
    //   65: getfield Nh : Lf/E7;
    //   68: aload_2
    //   69: getfield ls : I
    //   72: invokestatic TV : (I)I
    //   75: invokevirtual else : (I)I
    //   78: dup
    //   79: istore #5
    //   81: iconst_m1
    //   82: if_icmpeq -> 352
    //   85: iload #5
    //   87: aload_2
    //   88: getfield ls : I
    //   91: if_icmpge -> 352
    //   94: aload #4
    //   96: aload_1
    //   97: getfield qK0 : Lf/eX;
    //   100: getfield Qa : [Lf/tF0;
    //   103: aload_2
    //   104: getfield K10 : [I
    //   107: iload #5
    //   109: iaload
    //   110: aaload
    //   111: astore_2
    //   112: fconst_0
    //   113: fstore #5
    //   115: ifnull -> 156
    //   118: aload #4
    //   120: arraylength
    //   121: aload_0
    //   122: getfield qr0 : I
    //   125: iconst_1
    //   126: iadd
    //   127: if_icmpge -> 133
    //   130: goto -> 156
    //   133: iconst_0
    //   134: istore #6
    //   136: iload #6
    //   138: aload #4
    //   140: arraylength
    //   141: if_icmpge -> 166
    //   144: aload #4
    //   146: iload #6
    //   148: fconst_0
    //   149: fastore
    //   150: iinc #6, 1
    //   153: goto -> 136
    //   156: aload_0
    //   157: getfield qr0 : I
    //   160: iconst_1
    //   161: iadd
    //   162: newarray float
    //   164: astore #4
    //   166: iconst_0
    //   167: istore #6
    //   169: iload #6
    //   171: aload_0
    //   172: getfield qr0 : I
    //   175: if_icmpge -> 288
    //   178: aload_2
    //   179: aload_1
    //   180: getfield Nh : Lf/E7;
    //   183: astore #7
    //   185: getfield PR : I
    //   188: istore #8
    //   190: iconst_0
    //   191: istore #9
    //   193: iload #9
    //   195: iload #8
    //   197: if_icmpge -> 269
    //   200: aload_2
    //   201: aload #7
    //   203: invokevirtual rB : (Lf/E7;)I
    //   206: dup
    //   207: istore #10
    //   209: iconst_m1
    //   210: if_icmpne -> 217
    //   213: iconst_m1
    //   214: goto -> 270
    //   217: iload #10
    //   219: aload_2
    //   220: getfield PR : I
    //   223: imul
    //   224: istore #10
    //   226: iconst_0
    //   227: istore #11
    //   229: iload #11
    //   231: aload_2
    //   232: getfield PR : I
    //   235: if_icmpge -> 193
    //   238: aload #4
    //   240: iload #6
    //   242: iload #9
    //   244: dup
    //   245: iconst_1
    //   246: iadd
    //   247: istore #9
    //   249: iadd
    //   250: aload_2
    //   251: getfield eS : [F
    //   254: iload #10
    //   256: iload #11
    //   258: dup
    //   259: iconst_1
    //   260: iadd
    //   261: istore #11
    //   263: iadd
    //   264: faload
    //   265: fastore
    //   266: goto -> 229
    //   269: iconst_0
    //   270: iconst_m1
    //   271: if_icmpne -> 276
    //   274: aconst_null
    //   275: areturn
    //   276: iload #6
    //   278: aload_2
    //   279: getfield PR : I
    //   282: iadd
    //   283: istore #6
    //   285: goto -> 169
    //   288: iconst_0
    //   289: istore_1
    //   290: iload_1
    //   291: aload_0
    //   292: getfield qr0 : I
    //   295: dup
    //   296: istore #6
    //   298: if_icmpge -> 344
    //   301: iconst_0
    //   302: istore #6
    //   304: iload #6
    //   306: aload_2
    //   307: getfield PR : I
    //   310: if_icmpge -> 333
    //   313: aload #4
    //   315: iload_1
    //   316: aload #4
    //   318: iload_1
    //   319: faload
    //   320: fload #5
    //   322: fadd
    //   323: fastore
    //   324: iinc #6, 1
    //   327: iinc #1, 1
    //   330: goto -> 304
    //   333: aload #4
    //   335: iload_1
    //   336: iconst_1
    //   337: isub
    //   338: faload
    //   339: fstore #5
    //   341: goto -> 290
    //   344: aload #4
    //   346: dup
    //   347: iload #6
    //   349: fload_3
    //   350: fastore
    //   351: areturn
    //   352: aconst_null
    //   353: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 203
    //   #2	-> 279
  }
  
  public final int z9(m6 paramm6, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
    // Byte code:
    //   0: aload_3
    //   1: aload_2
    //   2: checkcast f/ul0
    //   5: dup
    //   6: astore_0
    //   7: getfield up : Lf/J8;
    //   10: astore_1
    //   11: ifnull -> 576
    //   14: aload_0
    //   15: dup
    //   16: dup
    //   17: aload_3
    //   18: checkcast [F
    //   21: dup
    //   22: astore_2
    //   23: aload_0
    //   24: getfield qr0 : I
    //   27: dup
    //   28: istore_0
    //   29: faload
    //   30: fstore_3
    //   31: getfield Wa : [I
    //   34: astore #5
    //   36: getfield Wr : I
    //   39: istore #6
    //   41: getfield Zu0 : I
    //   44: aload_1
    //   45: getfield r6 : I
    //   48: i2f
    //   49: fstore_1
    //   50: i2f
    //   51: ldc 3.1415927
    //   53: swap
    //   54: fdiv
    //   55: fstore #7
    //   57: iconst_0
    //   58: istore #8
    //   60: iload #8
    //   62: iload_0
    //   63: if_icmpge -> 127
    //   66: aload_2
    //   67: iload #8
    //   69: aload_2
    //   70: iload #8
    //   72: faload
    //   73: f2d
    //   74: ldc2_w 40.74366592
    //   77: dmul
    //   78: dup2
    //   79: dstore #9
    //   81: d2i
    //   82: istore #11
    //   84: getstatic f/QU.CI : [F
    //   87: dup
    //   88: astore #12
    //   90: iload #11
    //   92: dload #9
    //   94: iload #11
    //   96: aload #12
    //   98: iload #11
    //   100: faload
    //   101: fstore #9
    //   103: i2d
    //   104: dsub
    //   105: d2f
    //   106: fstore #10
    //   108: iconst_1
    //   109: iadd
    //   110: faload
    //   111: fload #9
    //   113: fload #10
    //   115: fload #9
    //   117: invokestatic df : (FFFF)F
    //   120: fastore
    //   121: iinc #8, 1
    //   124: goto -> 60
    //   127: iload_0
    //   128: iconst_2
    //   129: idiv
    //   130: iconst_2
    //   131: imul
    //   132: istore #8
    //   134: iconst_0
    //   135: istore #9
    //   137: iload #9
    //   139: iload #6
    //   141: if_icmpge -> 574
    //   144: fload #7
    //   146: aload #5
    //   148: iload #9
    //   150: iaload
    //   151: dup
    //   152: istore #10
    //   154: ldc 0.70710677
    //   156: fstore #11
    //   158: ldc 0.70710677
    //   160: fstore #12
    //   162: i2f
    //   163: fmul
    //   164: f2d
    //   165: ldc2_w 40.74366592
    //   168: dmul
    //   169: dup2
    //   170: dstore #13
    //   172: d2i
    //   173: istore #15
    //   175: getstatic f/QU.CI : [F
    //   178: dup
    //   179: astore #16
    //   181: iload #15
    //   183: dload #13
    //   185: iload #15
    //   187: aload #16
    //   189: iload #15
    //   191: faload
    //   192: fstore #13
    //   194: i2d
    //   195: dsub
    //   196: d2f
    //   197: fstore #14
    //   199: iconst_1
    //   200: iadd
    //   201: faload
    //   202: fload #13
    //   204: fload #14
    //   206: fload #13
    //   208: invokestatic df : (FFFF)F
    //   211: fstore #13
    //   213: iconst_0
    //   214: istore #14
    //   216: iload #14
    //   218: iload #8
    //   220: if_icmpge -> 255
    //   223: aload_2
    //   224: iload #14
    //   226: aload_2
    //   227: iload #14
    //   229: faload
    //   230: fload #13
    //   232: fsub
    //   233: fload #12
    //   235: fmul
    //   236: fstore #12
    //   238: iconst_1
    //   239: iadd
    //   240: faload
    //   241: fload #13
    //   243: fsub
    //   244: fload #11
    //   246: fmul
    //   247: fstore #11
    //   249: iinc #14, 2
    //   252: goto -> 216
    //   255: iload_0
    //   256: iconst_1
    //   257: iand
    //   258: ifeq -> 292
    //   261: fload #13
    //   263: dup
    //   264: aload_2
    //   265: iload_0
    //   266: iconst_1
    //   267: isub
    //   268: faload
    //   269: fload #13
    //   271: fsub
    //   272: fload #12
    //   274: fmul
    //   275: dup
    //   276: fmul
    //   277: fstore #12
    //   279: fmul
    //   280: fconst_1
    //   281: swap
    //   282: fsub
    //   283: fload #11
    //   285: fmul
    //   286: fload #11
    //   288: fmul
    //   289: goto -> 314
    //   292: fload #13
    //   294: fconst_1
    //   295: fadd
    //   296: fload #12
    //   298: fmul
    //   299: fload #12
    //   301: fmul
    //   302: fstore #12
    //   304: fconst_1
    //   305: fload #13
    //   307: fsub
    //   308: fload #11
    //   310: fmul
    //   311: fload #11
    //   313: fmul
    //   314: fload #12
    //   316: fadd
    //   317: dup
    //   318: fstore #11
    //   320: invokestatic floatToIntBits : (F)I
    //   323: dup
    //   324: istore #12
    //   326: ldc 2147483647
    //   328: iand
    //   329: dup
    //   330: istore #13
    //   332: iconst_0
    //   333: istore #14
    //   335: ldc 2139095040
    //   337: if_icmpge -> 404
    //   340: iload #13
    //   342: ifne -> 348
    //   345: goto -> 404
    //   348: iload #13
    //   350: ldc 8388608
    //   352: if_icmpge -> 378
    //   355: fload #11
    //   357: f2d
    //   358: ldc2_w 3.3554432E7
    //   361: dmul
    //   362: d2f
    //   363: invokestatic floatToIntBits : (F)I
    //   366: dup
    //   367: istore #12
    //   369: ldc 2147483647
    //   371: iand
    //   372: istore #13
    //   374: bipush #-25
    //   376: istore #14
    //   378: iload #12
    //   380: iload #13
    //   382: bipush #23
    //   384: iushr
    //   385: bipush #126
    //   387: isub
    //   388: iload #14
    //   390: iadd
    //   391: istore #14
    //   393: ldc -2139095041
    //   395: iand
    //   396: ldc 1056964608
    //   398: ior
    //   399: invokestatic intBitsToFloat : (I)F
    //   402: fstore #11
    //   404: fload #11
    //   406: ldc 64.0
    //   408: fmul
    //   409: ldc 32.0
    //   411: fsub
    //   412: f2d
    //   413: dup2
    //   414: dstore #11
    //   416: d2i
    //   417: istore #13
    //   419: getstatic f/QU.COm5 : [F
    //   422: dup
    //   423: astore #15
    //   425: iload #13
    //   427: dload #11
    //   429: iload #13
    //   431: aload #15
    //   433: iload #13
    //   435: faload
    //   436: fstore #11
    //   438: i2d
    //   439: dsub
    //   440: d2f
    //   441: fstore #12
    //   443: iconst_1
    //   444: iadd
    //   445: faload
    //   446: fload #11
    //   448: fsub
    //   449: fload #12
    //   451: fmul
    //   452: fload #11
    //   454: fadd
    //   455: fload_3
    //   456: fmul
    //   457: iload #14
    //   459: iload_0
    //   460: iadd
    //   461: getstatic f/QU.J40 : [F
    //   464: swap
    //   465: bipush #-32
    //   467: isub
    //   468: faload
    //   469: fmul
    //   470: fload_1
    //   471: fsub
    //   472: ldc -8.0
    //   474: fmul
    //   475: f2i
    //   476: dup
    //   477: istore #11
    //   479: ifge -> 488
    //   482: fconst_1
    //   483: fstore #11
    //   485: goto -> 522
    //   488: iload #11
    //   490: sipush #1120
    //   493: if_icmplt -> 502
    //   496: fconst_0
    //   497: fstore #11
    //   499: goto -> 522
    //   502: getstatic f/QU.WH0 : [F
    //   505: iload #11
    //   507: iconst_5
    //   508: iushr
    //   509: faload
    //   510: getstatic f/QU.IL0 : [F
    //   513: iload #11
    //   515: bipush #31
    //   517: iand
    //   518: faload
    //   519: fmul
    //   520: fstore #11
    //   522: iload #9
    //   524: iconst_1
    //   525: iadd
    //   526: dup
    //   527: istore #12
    //   529: iload #6
    //   531: aload #4
    //   533: iload #9
    //   535: aload #4
    //   537: iload #9
    //   539: faload
    //   540: fload #11
    //   542: fmul
    //   543: fastore
    //   544: if_icmpge -> 567
    //   547: aload #5
    //   549: iload #12
    //   551: iaload
    //   552: iload #10
    //   554: if_icmpeq -> 560
    //   557: goto -> 567
    //   560: iload #12
    //   562: istore #9
    //   564: goto -> 522
    //   567: iload #12
    //   569: istore #9
    //   571: goto -> 137
    //   574: iconst_1
    //   575: ireturn
    //   576: iconst_0
    //   577: istore_1
    //   578: iload_1
    //   579: aload_0
    //   580: getfield Wr : I
    //   583: if_icmpge -> 597
    //   586: aload #4
    //   588: iload_1
    //   589: fconst_0
    //   590: fastore
    //   591: iinc #1, 1
    //   594: goto -> 578
    //   597: iconst_0
    //   598: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 72
    //   #2	-> 84
    //   #3	-> 120
    //   #4	-> 175
    //   #5	-> 229
    //   #6	-> 419
    //   #7	-> 461
    //   #8	-> 502
    //   #9	-> 539
    //   #10	-> 580
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */