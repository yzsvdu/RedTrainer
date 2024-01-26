package f;

public final class sN extends Fy0 implements Runnable {
  public final fr s;
  
  public final j60 Pe;
  
  public int md0;
  
  public int Ie;
  
  public boolean bs;
  
  public sN(fr paramfr, x4 paramx4) {
    super("", paramfr.J1, paramfr.J1);
    this.md0 = -1;
    this.Ie = -1;
    this.bs = false;
    this.s = paramfr;
    Xu("townmap-cursor");
    this.Pe = paramx4;
    switch (paramx4.mE0) {
      default:
        this.md0 = 20;
        this.Ie = 21;
        break;
      case 4:
        this.md0 = 20;
        this.Ie = 6;
        break;
      case 3:
        this.md0 = 19;
        this.Ie = 6;
        break;
      case 2:
        this.Ie = 6;
        break;
      case 0:
        this.md0 = 4;
        this.Ie = 5;
        break;
      case 1:
        break;
    } 
    nB0();
    int i;
    int j;
    Ol0(paramx4.p20 * (i = paramfr.Rt) - (j = i * 4), paramx4.LK * i - j);
    tW(this);
  }
  
  public sN(fr paramfr, LPT7 paramLPT7) {
    super("", paramfr.J1, paramfr.J1);
    this.md0 = -1;
    this.Ie = -1;
    this.bs = false;
    this.s = paramfr;
    Xu("townmap-cursor");
    this.Pe = paramLPT7;
    nB0();
    int i;
    Ol0(paramLPT7.p20 * (i = paramfr.J1) + paramfr.fX, paramLPT7.LK * i + paramfr.rq0);
    tW(this);
    mM();
  }
  
  public sN(fr paramfr, T6 paramT6) {
    super("", paramfr.J1, paramfr.J1);
    int i;
    this.md0 = -1;
    this.Ie = -1;
    this.bs = false;
    this.s = paramfr;
    Xu("townmap-cursor");
    this.Pe = paramT6;
    nB0();
    if (paramT6.mE0 == 0) {
      int j;
      Ol0(paramT6.ba * (i = paramfr.Rt) - (j = i * 4), paramT6.RO * i - j);
    } else {
      int j;
      Ol0(paramT6.p20 * (j = i.J1) + i.fX, paramT6.LK * j + i.rq0);
    } 
    tW(this);
    mM();
  }
  
  public final void nB0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Pe : Lf/j60;
    //   4: dup
    //   5: astore_1
    //   6: getfield ka : B
    //   9: dup
    //   10: istore_2
    //   11: iconst_2
    //   12: if_icmpne -> 222
    //   15: aload_0
    //   16: getfield s : Lf/fr;
    //   19: dup
    //   20: astore_3
    //   21: getfield com1 : Lf/sN;
    //   24: aload_0
    //   25: if_acmpne -> 46
    //   28: aload_3
    //   29: getfield F : Z
    //   32: ifeq -> 46
    //   35: aload_1
    //   36: getfield RE0 : Z
    //   39: ifeq -> 46
    //   42: iconst_1
    //   43: goto -> 47
    //   46: iconst_0
    //   47: ifeq -> 58
    //   50: aload_0
    //   51: getfield Ie : I
    //   54: istore_3
    //   55: goto -> 63
    //   58: aload_0
    //   59: getfield md0 : I
    //   62: istore_3
    //   63: aload_1
    //   64: getfield fP : S
    //   67: dup
    //   68: istore_1
    //   69: iconst_m1
    //   70: if_icmpeq -> 95
    //   73: getstatic f/km.u4 : Lf/R8;
    //   76: getfield fF0 : Lf/BF;
    //   79: iload_2
    //   80: iload_1
    //   81: invokevirtual y5 : (BS)Z
    //   84: ifeq -> 90
    //   87: goto -> 95
    //   90: iconst_0
    //   91: istore_1
    //   92: goto -> 97
    //   95: iconst_1
    //   96: istore_1
    //   97: iload_3
    //   98: aload_0
    //   99: iload_1
    //   100: putfield bs : Z
    //   103: iconst_1
    //   104: if_icmplt -> 214
    //   107: iload_1
    //   108: ifne -> 114
    //   111: goto -> 214
    //   114: aload_0
    //   115: dup
    //   116: dup
    //   117: getstatic f/km.mI0 : Lf/P1;
    //   120: getfield AN : Lf/Wo;
    //   123: getfield Xo : [Lf/U70;
    //   126: iload_3
    //   127: aaload
    //   128: dup
    //   129: astore_1
    //   130: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
    //   133: pop
    //   134: getfield As : Lf/rH;
    //   137: iconst_1
    //   138: anewarray f/U70
    //   141: dup
    //   142: iconst_0
    //   143: aload_1
    //   144: aastore
    //   145: invokevirtual qt : ([Lf/U70;)Lf/JG0;
    //   148: pop
    //   149: getfield As : Lf/rH;
    //   152: aload_1
    //   153: getfield mv : I
    //   156: aload_0
    //   157: getfield s : Lf/fr;
    //   160: getfield Rt : I
    //   163: dup
    //   164: istore_2
    //   165: imul
    //   166: aload_1
    //   167: getfield s7 : I
    //   170: iload_2
    //   171: imul
    //   172: invokevirtual tL : (II)V
    //   175: getfield As : Lf/rH;
    //   178: aload_0
    //   179: aload_1
    //   180: getfield mv : I
    //   183: istore_0
    //   184: getfield s : Lf/fr;
    //   187: getfield Rt : I
    //   190: dup
    //   191: iload_0
    //   192: swap
    //   193: imul
    //   194: iconst_2
    //   195: idiv
    //   196: iconst_m1
    //   197: imul
    //   198: istore_0
    //   199: bipush #8
    //   201: imul
    //   202: iconst_2
    //   203: idiv
    //   204: iload_0
    //   205: iadd
    //   206: dup
    //   207: invokevirtual zT : (II)Lf/JG0;
    //   210: pop
    //   211: goto -> 643
    //   214: aload_0
    //   215: getfield As : Lf/rH;
    //   218: invokevirtual H : ()V
    //   221: return
    //   222: iload_2
    //   223: iconst_3
    //   224: if_icmpne -> 440
    //   227: aload_1
    //   228: getstatic f/oD.zE0 : [[I
    //   231: aload_1
    //   232: getfield p20 : S
    //   235: aaload
    //   236: aload_1
    //   237: getfield LK : S
    //   240: iaload
    //   241: istore_1
    //   242: getfield fP : S
    //   245: dup
    //   246: istore_3
    //   247: iconst_m1
    //   248: if_icmpeq -> 273
    //   251: getstatic f/km.u4 : Lf/R8;
    //   254: getfield fF0 : Lf/BF;
    //   257: iload_2
    //   258: iload_3
    //   259: invokevirtual y5 : (BS)Z
    //   262: ifeq -> 268
    //   265: goto -> 273
    //   268: iconst_0
    //   269: istore_2
    //   270: goto -> 275
    //   273: iconst_1
    //   274: istore_2
    //   275: iload_1
    //   276: aload_0
    //   277: iload_2
    //   278: putfield bs : Z
    //   281: ifle -> 643
    //   284: iload_1
    //   285: aload_0
    //   286: dup
    //   287: dup
    //   288: getstatic f/km.mI0 : Lf/P1;
    //   291: getfield MT : Lf/gD;
    //   294: getfield i0 : [[Lf/U70;
    //   297: iload_2
    //   298: iconst_1
    //   299: ixor
    //   300: aaload
    //   301: iload_1
    //   302: iconst_1
    //   303: isub
    //   304: aaload
    //   305: dup
    //   306: astore_2
    //   307: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
    //   310: pop
    //   311: getfield As : Lf/rH;
    //   314: iconst_1
    //   315: anewarray f/U70
    //   318: dup
    //   319: iconst_0
    //   320: aload_2
    //   321: aastore
    //   322: invokevirtual qt : ([Lf/U70;)Lf/JG0;
    //   325: pop
    //   326: getfield As : Lf/rH;
    //   329: aload_2
    //   330: dup
    //   331: getfield mv : I
    //   334: istore_2
    //   335: getfield s7 : I
    //   338: iload_2
    //   339: swap
    //   340: invokevirtual tL : (II)V
    //   343: getfield As : Lf/rH;
    //   346: dup
    //   347: astore_2
    //   348: aload_0
    //   349: getfield s : Lf/fr;
    //   352: getfield Rt : I
    //   355: dup
    //   356: istore_0
    //   357: i2f
    //   358: putfield V1 : F
    //   361: iconst_1
    //   362: if_icmpeq -> 421
    //   365: iload_1
    //   366: iconst_2
    //   367: if_icmpeq -> 408
    //   370: iload_1
    //   371: bipush #6
    //   373: if_icmpeq -> 394
    //   376: iload_1
    //   377: bipush #7
    //   379: if_icmpeq -> 421
    //   382: aload_2
    //   383: iload_0
    //   384: iconst_m1
    //   385: imul
    //   386: iconst_0
    //   387: invokevirtual zT : (II)Lf/JG0;
    //   390: pop
    //   391: goto -> 643
    //   394: aload_2
    //   395: iload_0
    //   396: bipush #-3
    //   398: imul
    //   399: iconst_0
    //   400: swap
    //   401: invokevirtual zT : (II)Lf/JG0;
    //   404: pop
    //   405: goto -> 643
    //   408: aload_2
    //   409: iload_0
    //   410: bipush #-4
    //   412: imul
    //   413: iconst_0
    //   414: invokevirtual zT : (II)Lf/JG0;
    //   417: pop
    //   418: goto -> 643
    //   421: aload_2
    //   422: iload_0
    //   423: dup
    //   424: bipush #-4
    //   426: imul
    //   427: istore_0
    //   428: bipush #-3
    //   430: imul
    //   431: iload_0
    //   432: swap
    //   433: invokevirtual zT : (II)Lf/JG0;
    //   436: pop
    //   437: goto -> 643
    //   440: iload_2
    //   441: iconst_4
    //   442: if_icmpne -> 643
    //   445: aload_1
    //   446: getfield fP : S
    //   449: dup
    //   450: istore_1
    //   451: iconst_m1
    //   452: if_icmpeq -> 474
    //   455: getstatic f/km.u4 : Lf/R8;
    //   458: getfield fF0 : Lf/BF;
    //   461: iload_2
    //   462: iload_1
    //   463: invokevirtual y5 : (BS)Z
    //   466: ifeq -> 474
    //   469: iconst_1
    //   470: istore_1
    //   471: goto -> 476
    //   474: iconst_0
    //   475: istore_1
    //   476: aload_0
    //   477: dup
    //   478: iload_1
    //   479: putfield bs : Z
    //   482: getfield Pe : Lf/j60;
    //   485: checkcast f/T6
    //   488: dup
    //   489: astore_1
    //   490: getfield Ya0 : I
    //   493: sipush #432
    //   496: if_icmpne -> 520
    //   499: getstatic f/km.u4 : Lf/R8;
    //   502: getfield fF0 : Lf/BF;
    //   505: iconst_4
    //   506: sipush #1490
    //   509: invokevirtual y5 : (BS)Z
    //   512: ifne -> 520
    //   515: aload_0
    //   516: iconst_1
    //   517: putfield bs : Z
    //   520: aload_0
    //   521: getfield bs : Z
    //   524: ifeq -> 535
    //   527: aload_0
    //   528: getfield As : Lf/rH;
    //   531: invokevirtual H : ()V
    //   534: return
    //   535: aload_0
    //   536: dup
    //   537: dup
    //   538: new f/zh0
    //   541: dup
    //   542: astore_2
    //   543: aload_1
    //   544: dup
    //   545: dup2
    //   546: getstatic f/km.mI0 : Lf/P1;
    //   549: getfield yE : Lf/BE;
    //   552: getfield pm0 : Lf/U70;
    //   555: astore_1
    //   556: getfield Ya0 : I
    //   559: istore_3
    //   560: getfield Ok0 : I
    //   563: istore #4
    //   565: getfield Wl : I
    //   568: istore #5
    //   570: getfield DO : I
    //   573: istore #6
    //   575: aload_1
    //   576: iload_3
    //   577: iload #4
    //   579: iload #5
    //   581: iload #6
    //   583: invokespecial <init> : (Lf/U70;IIII)V
    //   586: getfield As : Lf/rH;
    //   589: iconst_1
    //   590: anewarray f/zh0
    //   593: dup
    //   594: iconst_0
    //   595: aload_2
    //   596: aastore
    //   597: invokevirtual sm : ([Lf/zh0;)V
    //   600: getfield As : Lf/rH;
    //   603: aload_2
    //   604: dup
    //   605: getfield Ys0 : I
    //   608: istore_1
    //   609: getfield Fj : I
    //   612: iload_1
    //   613: swap
    //   614: invokevirtual tL : (II)V
    //   617: getfield As : Lf/rH;
    //   620: dup
    //   621: astore_1
    //   622: aload_0
    //   623: getfield s : Lf/fr;
    //   626: getfield Rt : I
    //   629: dup
    //   630: aload_1
    //   631: swap
    //   632: i2f
    //   633: putfield V1 : F
    //   636: iconst_4
    //   637: imul
    //   638: dup
    //   639: invokevirtual zT : (II)Lf/JG0;
    //   642: pop
    //   643: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 76
    //   #2	-> 81
    //   #3	-> 134
    //   #4	-> 138
    //   #5	-> 149
    //   #6	-> 153
    //   #7	-> 157
    //   #8	-> 167
    //   #9	-> 172
    //   #10	-> 175
    //   #11	-> 180
    //   #12	-> 184
    //   #13	-> 215
    //   #14	-> 218
    //   #15	-> 254
    //   #16	-> 259
    //   #17	-> 311
    //   #18	-> 315
    //   #19	-> 326
    //   #20	-> 331
    //   #21	-> 335
    //   #22	-> 340
    //   #23	-> 343
    //   #24	-> 349
    //   #25	-> 358
    //   #26	-> 387
    //   #27	-> 458
    //   #28	-> 463
    //   #29	-> 502
    //   #30	-> 509
    //   #31	-> 528
    //   #32	-> 531
    //   #33	-> 586
    //   #34	-> 590
    //   #35	-> 600
    //   #36	-> 605
    //   #37	-> 609
    //   #38	-> 614
    //   #39	-> 617
    //   #40	-> 623
    //   #41	-> 633
    //   #42	-> 639
  }
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Lf/fr;
    //   4: dup
    //   5: astore_1
    //   6: getfield com1 : Lf/sN;
    //   9: aload_0
    //   10: if_acmpne -> 71
    //   13: aload_0
    //   14: getfield bs : Z
    //   17: ifeq -> 76
    //   20: aload_0
    //   21: getfield Pe : Lf/j60;
    //   24: dup
    //   25: astore_1
    //   26: getfield RE0 : Z
    //   29: ifeq -> 76
    //   32: aload_0
    //   33: aload_1
    //   34: getstatic f/km.u4 : Lf/R8;
    //   37: astore_0
    //   38: getfield tp0 : B
    //   41: istore_1
    //   42: aload_0
    //   43: getfield e20 : Lf/c4;
    //   46: new f/pK0
    //   49: dup
    //   50: iload_1
    //   51: invokespecial <init> : (B)V
    //   54: invokevirtual W3 : (Lf/Bi;)V
    //   57: getfield s : Lf/fr;
    //   60: getfield Zu : Lf/pA;
    //   63: iconst_0
    //   64: aconst_null
    //   65: invokevirtual U10 : (ZLf/R2;)V
    //   68: goto -> 76
    //   71: aload_1
    //   72: aload_0
    //   73: invokevirtual WQ : (Lf/sN;)V
    //   76: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 43
    //   #2	-> 46
    //   #3	-> 57
    //   #4	-> 65
    //   #5	-> 73
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */