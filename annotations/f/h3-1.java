package f;

public abstract class h3 {
  public static final eM AZ = new eM();
  
  public static fQ jS = new fQ(false, 16);
  
  public static lpt1 RP(eo parameo, float paramFloat, int paramInt) {
    // Byte code:
    //   0: getstatic f/h3.AZ : Lf/eM;
    //   3: dup
    //   4: astore_3
    //   5: iload_2
    //   6: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9: aconst_null
    //   10: invokevirtual MF : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   13: checkcast f/lpt1
    //   16: dup
    //   17: astore #4
    //   19: getstatic f/km.mI0 : Lf/P1;
    //   22: getfield MT : Lf/gD;
    //   25: getfield EI0 : Lf/Jj;
    //   28: iload_2
    //   29: invokevirtual jw : (I)Lf/fn;
    //   32: astore #5
    //   34: ifnonnull -> 446
    //   37: getstatic f/km.mI0 : Lf/P1;
    //   40: getfield MT : Lf/gD;
    //   43: getfield EI0 : Lf/Jj;
    //   46: iload_2
    //   47: invokevirtual vn0 : (I)Lf/Q1;
    //   50: dup
    //   51: astore #6
    //   53: ifnonnull -> 58
    //   56: aconst_null
    //   57: areturn
    //   58: iload_2
    //   59: sipush #221
    //   62: if_icmpeq -> 77
    //   65: new f/Iq
    //   68: dup
    //   69: astore #7
    //   71: invokespecial <init> : ()V
    //   74: goto -> 86
    //   77: new f/u10
    //   80: dup
    //   81: astore #7
    //   83: invokespecial <init> : ()V
    //   86: aload #7
    //   88: aload #6
    //   90: dup
    //   91: aload #7
    //   93: dup
    //   94: iload_2
    //   95: sipush #1000
    //   98: iadd
    //   99: putfield td0 : I
    //   102: iconst_3
    //   103: putfield zm0 : B
    //   106: getstatic f/h3.jS : Lf/fQ;
    //   109: aload #7
    //   111: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   114: getfield Nt : [Lf/hC;
    //   117: iconst_0
    //   118: aaload
    //   119: astore #8
    //   121: getfield Qo0 : Lf/Wd;
    //   124: aload #8
    //   126: swap
    //   127: invokevirtual yq : (Lf/hC;Lf/Wd;)V
    //   130: getstatic f/h1.Pm : Z
    //   133: ifeq -> 225
    //   136: getstatic f/km.ln : Lf/ei;
    //   139: iconst_3
    //   140: istore #8
    //   142: getfield dh0 : [Lf/IZ;
    //   145: iload #8
    //   147: aaload
    //   148: dup
    //   149: astore #8
    //   151: ifnull -> 160
    //   154: iconst_1
    //   155: istore #9
    //   157: goto -> 163
    //   160: iconst_0
    //   161: istore #9
    //   163: iload #9
    //   165: ifeq -> 225
    //   168: aload #8
    //   170: iload_2
    //   171: aload #7
    //   173: invokevirtual TA : (ILf/Iq;)Lf/lpt1;
    //   176: dup
    //   177: astore #4
    //   179: ifnull -> 225
    //   182: aload #5
    //   184: getfield ok0 : Lf/fQ;
    //   187: getfield Z8 : I
    //   190: ifle -> 225
    //   193: aload #4
    //   195: invokestatic Lj : ()Lf/eI;
    //   198: aload #5
    //   200: aload #6
    //   202: getfield Qo0 : Lf/Wd;
    //   205: astore #8
    //   207: getfield ok0 : Lf/fQ;
    //   210: astore #9
    //   212: invokevirtual getClass : ()Ljava/lang/Class;
    //   215: pop
    //   216: aload #8
    //   218: aload #7
    //   220: aload #9
    //   222: invokestatic aI : (Lf/lpt1;Lf/Wd;Lf/Ew;Lf/fQ;)V
    //   225: aload #4
    //   227: ifnull -> 236
    //   230: getstatic f/h1.Pm : Z
    //   233: ifne -> 309
    //   236: aload #6
    //   238: dup
    //   239: getfield Nt : [Lf/hC;
    //   242: iconst_0
    //   243: aaload
    //   244: aload #6
    //   246: getfield Qo0 : Lf/Wd;
    //   249: invokestatic DG0 : (Lf/hC;Lf/Wd;)V
    //   252: invokestatic Lj : ()Lf/eI;
    //   255: astore #4
    //   257: getfield Nt : [Lf/hC;
    //   260: iconst_0
    //   261: aaload
    //   262: dup
    //   263: astore #8
    //   265: aload #7
    //   267: aload #4
    //   269: fload_1
    //   270: aload #8
    //   272: aload #5
    //   274: aload #6
    //   276: getfield Qo0 : Lf/Wd;
    //   279: astore_1
    //   280: getfield ok0 : Lf/fQ;
    //   283: astore #4
    //   285: getfield Sw : F
    //   288: fdiv
    //   289: fstore #6
    //   291: invokevirtual getClass : ()Ljava/lang/Class;
    //   294: pop
    //   295: aload_1
    //   296: aload #4
    //   298: fload #6
    //   300: iconst_1
    //   301: iconst_0
    //   302: invokestatic Q9 : (Lf/hC;Lf/Ew;Lf/Wd;Lf/fQ;FZZ)Lf/lpt1;
    //   305: astore_1
    //   306: aload_1
    //   307: astore #4
    //   309: iload_2
    //   310: aload #4
    //   312: dup
    //   313: dup
    //   314: aload #7
    //   316: putfield Cx0 : Lf/Ew;
    //   319: iload_2
    //   320: putfield jx : I
    //   323: aload #5
    //   325: putfield NT : Lf/fn;
    //   328: bipush #22
    //   330: if_icmpeq -> 413
    //   333: iload_2
    //   334: bipush #23
    //   336: if_icmpeq -> 413
    //   339: iload_2
    //   340: sipush #228
    //   343: if_icmpeq -> 393
    //   346: iload_2
    //   347: sipush #236
    //   350: if_icmpeq -> 413
    //   353: iload_2
    //   354: sipush #586
    //   357: if_icmpeq -> 363
    //   360: goto -> 436
    //   363: aload #4
    //   365: getfield xl0 : Lf/fQ;
    //   368: iconst_4
    //   369: invokevirtual get : (I)Ljava/lang/Object;
    //   372: checkcast f/T0
    //   375: new f/Ra
    //   378: dup
    //   379: getstatic f/Ra.SG0 : J
    //   382: bipush #6
    //   384: invokespecial <init> : (JI)V
    //   387: invokevirtual Tz0 : (Lf/dj;)V
    //   390: goto -> 436
    //   393: aload #4
    //   395: getfield xl0 : Lf/fQ;
    //   398: invokevirtual first : ()Ljava/lang/Object;
    //   401: checkcast f/T0
    //   404: getstatic f/qo.iu0 : J
    //   407: invokevirtual Ng0 : (J)V
    //   410: goto -> 436
    //   413: aload #4
    //   415: getfield vC0 : Lf/fQ;
    //   418: iconst_0
    //   419: invokevirtual get : (I)Ljava/lang/Object;
    //   422: checkcast f/zP
    //   425: iconst_0
    //   426: invokevirtual kv0 : (I)Lf/zP;
    //   429: iconst_0
    //   430: invokevirtual kv0 : (I)Lf/zP;
    //   433: invokevirtual ZF : ()V
    //   436: aload_3
    //   437: iload_2
    //   438: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   441: aload #4
    //   443: invokevirtual Ed0 : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   446: aload_0
    //   447: aload #4
    //   449: invokevirtual ro0 : ()Lf/lpt1;
    //   452: astore_0
    //   453: ldc 0.25
    //   455: invokevirtual uu : (F)Lf/eo;
    //   458: astore_1
    //   459: aload_0
    //   460: getfield lz : Lf/fQ;
    //   463: getfield Z8 : I
    //   466: ifle -> 493
    //   469: aload #5
    //   471: getfield pC0 : Z
    //   474: ifeq -> 493
    //   477: aload #5
    //   479: getfield r1 : B
    //   482: ifne -> 493
    //   485: aload_0
    //   486: iconst_0
    //   487: iconst_1
    //   488: aconst_null
    //   489: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   492: pop
    //   493: aload_0
    //   494: dup
    //   495: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
    //   498: dup
    //   499: astore_0
    //   500: aload_1
    //   501: dup
    //   502: dup
    //   503: aload_0
    //   504: invokevirtual getClass : ()Ljava/lang/Class;
    //   507: pop
    //   508: getfield x : F
    //   511: fstore_0
    //   512: getfield y : F
    //   515: fstore_1
    //   516: getfield z : F
    //   519: fstore_2
    //   520: fload_0
    //   521: fload_1
    //   522: fload_2
    //   523: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
    //   526: pop
    //   527: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 13
    //   #3	-> 25
    //   #4	-> 29
    //   #5	-> 43
    //   #6	-> 47
    //   #7	-> 99
    //   #8	-> 103
    //   #9	-> 106
    //   #10	-> 142
    //   #11	-> 147
    //   #12	-> 173
    //   #13	-> 316
    //   #14	-> 320
    //   #15	-> 489
    //   #16	-> 495
    //   #17	-> 508
  }
  
  public static lpt1 gt(eo parameo, float paramFloat, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic f/h3.AZ : Lf/eM;
    //   3: dup
    //   4: astore #4
    //   6: iload_2
    //   7: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10: aconst_null
    //   11: invokevirtual MF : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   14: checkcast f/lpt1
    //   17: dup
    //   18: astore #5
    //   20: getstatic f/km.mI0 : Lf/P1;
    //   23: getfield yE : Lf/BE;
    //   26: iload_3
    //   27: invokevirtual sM : (Z)Lf/Jj;
    //   30: iload_2
    //   31: invokevirtual jw : (I)Lf/fn;
    //   34: astore #6
    //   36: ifnonnull -> 433
    //   39: getstatic f/km.mI0 : Lf/P1;
    //   42: getfield yE : Lf/BE;
    //   45: iload_3
    //   46: invokevirtual sM : (Z)Lf/Jj;
    //   49: iload_2
    //   50: invokevirtual vn0 : (I)Lf/Q1;
    //   53: dup
    //   54: astore #7
    //   56: ifnonnull -> 61
    //   59: aconst_null
    //   60: areturn
    //   61: new f/Iq
    //   64: dup
    //   65: astore #8
    //   67: aload #7
    //   69: dup
    //   70: aload #8
    //   72: dup
    //   73: iload_2
    //   74: aload #8
    //   76: invokespecial <init> : ()V
    //   79: sipush #1000
    //   82: iadd
    //   83: putfield td0 : I
    //   86: iconst_4
    //   87: putfield zm0 : B
    //   90: getstatic f/h3.jS : Lf/fQ;
    //   93: aload #8
    //   95: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   98: getfield Nt : [Lf/hC;
    //   101: iconst_0
    //   102: aaload
    //   103: astore #9
    //   105: getfield Qo0 : Lf/Wd;
    //   108: aload #9
    //   110: swap
    //   111: invokevirtual yq : (Lf/hC;Lf/Wd;)V
    //   114: getstatic f/h1.Pm : Z
    //   117: ifeq -> 228
    //   120: getstatic f/km.ln : Lf/ei;
    //   123: iconst_4
    //   124: istore #9
    //   126: getfield dh0 : [Lf/IZ;
    //   129: iload #9
    //   131: aaload
    //   132: dup
    //   133: astore #9
    //   135: ifnull -> 144
    //   138: iconst_1
    //   139: istore #10
    //   141: goto -> 147
    //   144: iconst_0
    //   145: istore #10
    //   147: iload #10
    //   149: ifeq -> 228
    //   152: iload_3
    //   153: ifeq -> 164
    //   156: getstatic f/VV.i60 : Lf/VV;
    //   159: astore #5
    //   161: goto -> 169
    //   164: getstatic f/VV.transient : Lf/VV;
    //   167: astore #5
    //   169: aload #9
    //   171: aload #5
    //   173: iload_2
    //   174: aload #8
    //   176: invokevirtual oL0 : (Lf/VV;ILf/Iq;)Lf/lpt1;
    //   179: dup
    //   180: astore #5
    //   182: ifnull -> 228
    //   185: aload #6
    //   187: getfield ok0 : Lf/fQ;
    //   190: getfield Z8 : I
    //   193: ifle -> 228
    //   196: aload #5
    //   198: invokestatic Lj : ()Lf/eI;
    //   201: aload #6
    //   203: aload #7
    //   205: getfield Qo0 : Lf/Wd;
    //   208: astore #9
    //   210: getfield ok0 : Lf/fQ;
    //   213: astore #10
    //   215: invokevirtual getClass : ()Ljava/lang/Class;
    //   218: pop
    //   219: aload #9
    //   221: aload #8
    //   223: aload #10
    //   225: invokestatic aI : (Lf/lpt1;Lf/Wd;Lf/Ew;Lf/fQ;)V
    //   228: aload #5
    //   230: ifnull -> 239
    //   233: getstatic f/h1.Pm : Z
    //   236: ifne -> 396
    //   239: iload_3
    //   240: iconst_0
    //   241: istore #5
    //   243: ifne -> 277
    //   246: iload_2
    //   247: sipush #146
    //   250: if_icmpeq -> 274
    //   253: iload_2
    //   254: sipush #147
    //   257: if_icmpeq -> 274
    //   260: iload_2
    //   261: sipush #173
    //   264: if_icmpeq -> 274
    //   267: iload_2
    //   268: sipush #174
    //   271: if_icmpne -> 277
    //   274: iconst_1
    //   275: istore #5
    //   277: iload_3
    //   278: dup
    //   279: iconst_1
    //   280: ixor
    //   281: istore #9
    //   283: ifeq -> 321
    //   286: iload_2
    //   287: bipush #117
    //   289: if_icmpeq -> 318
    //   292: iload_2
    //   293: sipush #169
    //   296: if_icmpeq -> 318
    //   299: iload_2
    //   300: sipush #186
    //   303: if_icmpeq -> 318
    //   306: iload_2
    //   307: bipush #64
    //   309: if_icmplt -> 321
    //   312: iload_2
    //   313: bipush #70
    //   315: if_icmpgt -> 321
    //   318: iconst_1
    //   319: istore #9
    //   321: aload #7
    //   323: dup
    //   324: getfield Nt : [Lf/hC;
    //   327: iconst_0
    //   328: aaload
    //   329: aload #7
    //   331: getfield Qo0 : Lf/Wd;
    //   334: invokestatic DG0 : (Lf/hC;Lf/Wd;)V
    //   337: invokestatic Lj : ()Lf/eI;
    //   340: astore #10
    //   342: getfield Nt : [Lf/hC;
    //   345: iconst_0
    //   346: aaload
    //   347: dup
    //   348: astore #11
    //   350: aload #8
    //   352: aload #10
    //   354: fload_1
    //   355: aload #11
    //   357: aload #6
    //   359: aload #7
    //   361: getfield Qo0 : Lf/Wd;
    //   364: astore_1
    //   365: getfield ok0 : Lf/fQ;
    //   368: astore #7
    //   370: getfield Sw : F
    //   373: fdiv
    //   374: fstore #10
    //   376: invokevirtual getClass : ()Ljava/lang/Class;
    //   379: pop
    //   380: aload_1
    //   381: aload #7
    //   383: fload #10
    //   385: iload #9
    //   387: iload #5
    //   389: invokestatic Q9 : (Lf/hC;Lf/Ew;Lf/Wd;Lf/fQ;FZZ)Lf/lpt1;
    //   392: astore_1
    //   393: aload_1
    //   394: astore #5
    //   396: aload #4
    //   398: iload_2
    //   399: aload #5
    //   401: aload #6
    //   403: aload #5
    //   405: iload_3
    //   406: aload #5
    //   408: iload_2
    //   409: aload #5
    //   411: aload #8
    //   413: putfield Cx0 : Lf/Ew;
    //   416: putfield jx : I
    //   419: putfield bv : Z
    //   422: putfield NT : Lf/fn;
    //   425: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   428: aload #5
    //   430: invokevirtual Ed0 : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   433: iload_3
    //   434: aload_0
    //   435: aload #5
    //   437: invokevirtual ro0 : ()Lf/lpt1;
    //   440: astore_0
    //   441: ldc 0.25
    //   443: invokevirtual uu : (F)Lf/eo;
    //   446: astore_1
    //   447: ifeq -> 765
    //   450: iload_2
    //   451: bipush #12
    //   453: if_icmpne -> 520
    //   456: aload_0
    //   457: ldc_w 'polygon3_h_kage'
    //   460: iconst_1
    //   461: invokevirtual kB0 : (Ljava/lang/String;Z)Lf/zP;
    //   464: dup
    //   465: astore_2
    //   466: ifnull -> 783
    //   469: aload_2
    //   470: dup
    //   471: dup
    //   472: getfield z7 : Lf/eo;
    //   475: dup
    //   476: getfield y : F
    //   479: ldc_w 0.01
    //   482: fsub
    //   483: putfield y : F
    //   486: invokevirtual kJ0 : ()V
    //   489: getfield zx0 : Lf/fQ;
    //   492: iconst_0
    //   493: invokevirtual get : (I)Ljava/lang/Object;
    //   496: checkcast f/R70
    //   499: getfield Zz0 : Lf/T0;
    //   502: new f/Ra
    //   505: dup
    //   506: getstatic f/Ra.SG0 : J
    //   509: bipush #6
    //   511: invokespecial <init> : (JI)V
    //   514: invokevirtual Tz0 : (Lf/dj;)V
    //   517: goto -> 783
    //   520: iload_2
    //   521: bipush #31
    //   523: if_icmpne -> 569
    //   526: aload_0
    //   527: aload_1
    //   528: dup
    //   529: getfield y : F
    //   532: ldc_w 0.01
    //   535: fsub
    //   536: putfield y : F
    //   539: ldc_w 'h_kage'
    //   542: invokevirtual else : (Ljava/lang/String;)Lf/T0;
    //   545: dup
    //   546: astore_2
    //   547: ifnull -> 783
    //   550: aload_2
    //   551: new f/Ra
    //   554: dup
    //   555: getstatic f/Ra.SG0 : J
    //   558: bipush #6
    //   560: invokespecial <init> : (JI)V
    //   563: invokevirtual Tz0 : (Lf/dj;)V
    //   566: goto -> 783
    //   569: iload_2
    //   570: bipush #55
    //   572: if_icmpne -> 584
    //   575: aload_0
    //   576: ldc 0.25
    //   578: putfield k : F
    //   581: goto -> 783
    //   584: iload_2
    //   585: bipush #88
    //   587: if_icmpeq -> 722
    //   590: iload_2
    //   591: bipush #75
    //   593: if_icmpne -> 599
    //   596: goto -> 722
    //   599: iload_2
    //   600: bipush #95
    //   602: if_icmpne -> 620
    //   605: aload_1
    //   606: dup
    //   607: getfield y : F
    //   610: ldc_w 0.005
    //   613: fsub
    //   614: putfield y : F
    //   617: goto -> 783
    //   620: iload_2
    //   621: bipush #121
    //   623: if_icmpne -> 673
    //   626: aload_0
    //   627: ldc_w 'lambert5'
    //   630: invokevirtual else : (Ljava/lang/String;)Lf/T0;
    //   633: dup
    //   634: astore_2
    //   635: ifnull -> 783
    //   638: aload_2
    //   639: new f/qo
    //   642: dup
    //   643: astore_2
    //   644: getstatic f/qo.A80 : J
    //   647: lstore #4
    //   649: new com/badlogic/gdx/graphics/Color
    //   652: dup
    //   653: astore_3
    //   654: ldc_w -842150449
    //   657: invokespecial <init> : (I)V
    //   660: lload #4
    //   662: aload_3
    //   663: invokespecial <init> : (JLcom/badlogic/gdx/graphics/Color;)V
    //   666: aload_2
    //   667: invokevirtual Tz0 : (Lf/dj;)V
    //   670: goto -> 783
    //   673: iload_2
    //   674: bipush #52
    //   676: if_icmpne -> 783
    //   679: aload_0
    //   680: aload_1
    //   681: dup
    //   682: getfield y : F
    //   685: ldc_w 0.01
    //   688: fsub
    //   689: putfield y : F
    //   692: ldc_w 'h_kage'
    //   695: invokevirtual else : (Ljava/lang/String;)Lf/T0;
    //   698: dup
    //   699: astore_2
    //   700: ifnull -> 783
    //   703: aload_2
    //   704: new f/Ra
    //   707: dup
    //   708: getstatic f/Ra.SG0 : J
    //   711: bipush #6
    //   713: invokespecial <init> : (JI)V
    //   716: invokevirtual Tz0 : (Lf/dj;)V
    //   719: goto -> 783
    //   722: aload_0
    //   723: aload_1
    //   724: dup
    //   725: getfield y : F
    //   728: ldc_w 0.005
    //   731: fsub
    //   732: putfield y : F
    //   735: ldc_w 'h_kage'
    //   738: invokevirtual else : (Ljava/lang/String;)Lf/T0;
    //   741: dup
    //   742: astore_2
    //   743: ifnull -> 783
    //   746: aload_2
    //   747: new f/Ra
    //   750: dup
    //   751: getstatic f/Ra.SG0 : J
    //   754: bipush #6
    //   756: invokespecial <init> : (JI)V
    //   759: invokevirtual Tz0 : (Lf/dj;)V
    //   762: goto -> 783
    //   765: iload_2
    //   766: bipush #78
    //   768: if_icmpne -> 783
    //   771: aload_1
    //   772: dup
    //   773: getfield y : F
    //   776: ldc_w 0.005
    //   779: fadd
    //   780: putfield y : F
    //   783: aload_0
    //   784: getfield lz : Lf/fQ;
    //   787: getfield Z8 : I
    //   790: ifle -> 905
    //   793: aload #6
    //   795: getfield pC0 : Z
    //   798: ifeq -> 905
    //   801: aload #6
    //   803: getfield r1 : B
    //   806: dup
    //   807: istore_2
    //   808: ifne -> 822
    //   811: aload_0
    //   812: iconst_0
    //   813: iconst_1
    //   814: aconst_null
    //   815: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   818: pop
    //   819: goto -> 905
    //   822: iload_2
    //   823: bipush #8
    //   825: if_icmpne -> 905
    //   828: getstatic f/L70.gq : Lf/L70;
    //   831: invokevirtual CE0 : ()I
    //   834: invokestatic yE : (I)I
    //   837: tableswitch default -> 872, 0 -> 811, 1 -> 897, 2 -> 886, 3 -> 875, 4 -> 875
    //   872: goto -> 905
    //   875: aload_0
    //   876: iconst_3
    //   877: iconst_1
    //   878: aconst_null
    //   879: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   882: pop
    //   883: goto -> 905
    //   886: aload_0
    //   887: iconst_2
    //   888: iconst_1
    //   889: aconst_null
    //   890: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   893: pop
    //   894: goto -> 905
    //   897: aload_0
    //   898: iconst_1
    //   899: iconst_1
    //   900: aconst_null
    //   901: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   904: pop
    //   905: aload_0
    //   906: dup
    //   907: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
    //   910: dup
    //   911: astore_0
    //   912: aload_1
    //   913: dup
    //   914: dup
    //   915: aload_0
    //   916: invokevirtual getClass : ()Ljava/lang/Class;
    //   919: pop
    //   920: getfield x : F
    //   923: fstore_0
    //   924: getfield y : F
    //   927: fstore_1
    //   928: getfield z : F
    //   931: fstore_2
    //   932: fload_0
    //   933: fload_1
    //   934: fload_2
    //   935: invokevirtual g7 : (FFF)Lcom/badlogic/gdx/math/Matrix4;
    //   938: pop
    //   939: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 14
    //   #3	-> 83
    //   #4	-> 87
    //   #5	-> 90
    //   #6	-> 126
    //   #7	-> 131
    //   #8	-> 156
    //   #9	-> 413
    //   #10	-> 416
    //   #11	-> 457
    //   #12	-> 472
    //   #13	-> 815
    //   #14	-> 828
    //   #15	-> 831
    //   #16	-> 879
    //   #17	-> 907
    //   #18	-> 920
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */