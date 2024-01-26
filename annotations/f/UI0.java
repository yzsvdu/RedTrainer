package f;

import java.util.Comparator;

public final class UI0 {
  public Object[] ie0;
  
  public Comparator g9;
  
  public int cn = 7;
  
  public Object[] Jf0 = new Object[256];
  
  public int LPT2;
  
  public int sj = 0;
  
  public final int[] Sf0 = new int[40];
  
  public final int[] EQ = new int[40];
  
  public static void BJ(Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, Comparator<Object> paramComparator) {
    if (paramInt3 == paramInt1)
      paramInt3++; 
    while (true) {
      int i;
      if (paramInt3 < paramInt2) {
        Object object = paramArrayOfObject[paramInt3];
        int k = paramInt3;
        for (i = paramInt1; i < k; i = m + 1) {
          int m;
          if (paramComparator.compare(object, paramArrayOfObject[m = i + k >>> 1]) < 0) {
            k = m;
            continue;
          } 
        } 
        if ((k = paramInt3 - i) != 1) {
          if (k != 2) {
            int m = i + 1;
            System.arraycopy(paramArrayOfObject, i, paramArrayOfObject, m, k);
          } else {
            k = i + 2;
            paramArrayOfObject[k] = paramArrayOfObject[i + 1];
            k = i + 1;
            paramArrayOfObject[k] = paramArrayOfObject[i];
          } 
          continue;
        } 
      } else {
        break;
      } 
      int j = i + 1;
      paramArrayOfObject[j] = paramArrayOfObject[i];
      paramArrayOfObject[SYNTHETIC_LOCAL_VARIABLE_6] = SYNTHETIC_LOCAL_VARIABLE_5;
      paramInt3++;
    } 
  }
  
  public static int ve0(int paramInt1, int paramInt2, Comparator<Object> paramComparator, Object[] paramArrayOfObject) {
    // Byte code:
    //   0: iload_0
    //   1: iconst_1
    //   2: iadd
    //   3: dup
    //   4: istore #4
    //   6: iload_1
    //   7: if_icmpne -> 12
    //   10: iconst_1
    //   11: ireturn
    //   12: aload_2
    //   13: aload_3
    //   14: iload_0
    //   15: aload_3
    //   16: iload #4
    //   18: dup
    //   19: iconst_1
    //   20: iadd
    //   21: istore #4
    //   23: aaload
    //   24: astore #5
    //   26: aaload
    //   27: aload #5
    //   29: swap
    //   30: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   35: ifge -> 119
    //   38: iload #4
    //   40: iload_1
    //   41: if_icmpge -> 74
    //   44: aload_2
    //   45: aload_3
    //   46: iload #4
    //   48: aload_3
    //   49: iload #4
    //   51: aaload
    //   52: astore #5
    //   54: iconst_1
    //   55: isub
    //   56: aaload
    //   57: aload #5
    //   59: swap
    //   60: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   65: ifge -> 74
    //   68: iinc #4, 1
    //   71: goto -> 38
    //   74: iload #4
    //   76: iconst_m1
    //   77: iadd
    //   78: istore_1
    //   79: iload_0
    //   80: istore_2
    //   81: iload_2
    //   82: iload_1
    //   83: if_icmpge -> 155
    //   86: aload_3
    //   87: dup
    //   88: dup2
    //   89: iload_2
    //   90: aaload
    //   91: astore #5
    //   93: iload_2
    //   94: iconst_1
    //   95: iadd
    //   96: istore #6
    //   98: iload_1
    //   99: aaload
    //   100: iload_2
    //   101: swap
    //   102: aastore
    //   103: iload_1
    //   104: iconst_m1
    //   105: iadd
    //   106: istore_2
    //   107: iload_1
    //   108: aload #5
    //   110: aastore
    //   111: iload #6
    //   113: iload_2
    //   114: istore_1
    //   115: istore_2
    //   116: goto -> 81
    //   119: iload #4
    //   121: iload_1
    //   122: if_icmpge -> 155
    //   125: aload_2
    //   126: aload_3
    //   127: iload #4
    //   129: aload_3
    //   130: iload #4
    //   132: aaload
    //   133: astore #5
    //   135: iconst_1
    //   136: isub
    //   137: aaload
    //   138: aload #5
    //   140: swap
    //   141: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   146: iflt -> 155
    //   149: iinc #4, 1
    //   152: goto -> 119
    //   155: iload #4
    //   157: iload_0
    //   158: isub
    //   159: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 90
    //   #2	-> 132
  }
  
  public static int Jp(Object paramObject, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, Comparator<Object> paramComparator) {
    int i = 0;
    int j = 1;
    int k;
    if (paramComparator.compare(paramObject, paramArrayOfObject[k = paramInt1 + paramInt3]) > 0) {
      paramInt2 -= paramInt3;
      j = i;
      for (i = j; i < paramInt2 && paramComparator.compare(paramObject, paramArrayOfObject[k + i]) > 0; i = j) {
        if ((j = (i << 1) + 1) <= 0) {
          j = i;
          i = paramInt2;
          continue;
        } 
        j = i;
      } 
      if (i <= paramInt2)
        paramInt2 = i; 
      paramInt2 = j + paramInt3;
      paramInt3 = paramInt2 + paramInt3;
    } else {
      paramInt2 = paramInt3 + 1;
      j = i;
      for (i = j; i < paramInt2 && paramComparator.compare(paramObject, paramArrayOfObject[k - i]) <= 0; i = j) {
        if ((j = (i << 1) + 1) <= 0) {
          j = i;
          i = paramInt2;
          continue;
        } 
        j = i;
      } 
      if (i <= paramInt2)
        paramInt2 = i; 
      paramInt2 = paramInt3 - paramInt2;
      paramInt3 -= j;
    } 
    while (++paramInt2 < paramInt3) {
      if (paramComparator.compare(paramObject, paramArrayOfObject[paramInt1 + (i = paramInt2 + (paramInt3 - paramInt2 >>> 1))]) > 0) {
        paramInt2 = i + 1;
        continue;
      } 
      paramInt3 = i;
    } 
    return paramInt3;
  }
  
  public static int eM(Object paramObject, Object[] paramArrayOfObject, int paramInt1, int paramInt2, int paramInt3, Comparator<Object> paramComparator) {
    int i = 1;
    int j = 0;
    int k;
    if (paramComparator.compare(paramObject, paramArrayOfObject[k = paramInt1 + paramInt3]) < 0) {
      paramInt2 = paramInt3 + 1;
      i = j;
      for (j = i; j < paramInt2 && paramComparator.compare(paramObject, paramArrayOfObject[k - j]) < 0; j = i) {
        if ((i = (j << 1) + 1) <= 0) {
          i = j;
          j = paramInt2;
          continue;
        } 
        i = j;
      } 
      if (j <= paramInt2)
        paramInt2 = j; 
      paramInt2 = paramInt3 - paramInt2;
      paramInt3 -= i;
    } else {
      paramInt2 -= paramInt3;
      i = j;
      for (j = i; j < paramInt2 && paramComparator.compare(paramObject, paramArrayOfObject[k + j]) >= 0; j = i) {
        if ((i = (j << 1) + 1) <= 0) {
          i = j;
          j = paramInt2;
          continue;
        } 
        i = j;
      } 
      if (j <= paramInt2)
        paramInt2 = j; 
      paramInt2 = i + paramInt3;
      paramInt3 = paramInt2 + paramInt3;
    } 
    while (++paramInt2 < paramInt3) {
      if (paramComparator.compare(paramObject, paramArrayOfObject[paramInt1 + (i = paramInt2 + (paramInt3 - paramInt2 >>> 1))]) < 0) {
        paramInt3 = i;
        continue;
      } 
      paramInt2 = i + 1;
    } 
    return paramInt3;
  }
  
  public final void jd0(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: dup
    //   3: dup
    //   4: getfield Sf0 : [I
    //   7: dup
    //   8: astore_2
    //   9: iload_1
    //   10: iaload
    //   11: istore_3
    //   12: getfield EQ : [I
    //   15: dup
    //   16: astore #4
    //   18: iload_1
    //   19: aload #4
    //   21: iload_1
    //   22: iaload
    //   23: dup
    //   24: istore #5
    //   26: aload #4
    //   28: aload_2
    //   29: iload_1
    //   30: iconst_1
    //   31: iadd
    //   32: dup
    //   33: istore #6
    //   35: iaload
    //   36: istore #7
    //   38: iload #6
    //   40: iaload
    //   41: dup
    //   42: istore #8
    //   44: iadd
    //   45: iastore
    //   46: getfield sj : I
    //   49: dup
    //   50: istore #9
    //   52: iconst_3
    //   53: isub
    //   54: if_icmpne -> 78
    //   57: aload #4
    //   59: dup
    //   60: aload_2
    //   61: dup
    //   62: iload_1
    //   63: iconst_2
    //   64: iadd
    //   65: dup
    //   66: istore_1
    //   67: iaload
    //   68: iload #6
    //   70: swap
    //   71: iastore
    //   72: iload_1
    //   73: iaload
    //   74: iload #6
    //   76: swap
    //   77: iastore
    //   78: iload #5
    //   80: iload_3
    //   81: aload_0
    //   82: dup
    //   83: iload #9
    //   85: iconst_1
    //   86: isub
    //   87: putfield sj : I
    //   90: getfield ie0 : [Ljava/lang/Object;
    //   93: dup
    //   94: astore_1
    //   95: iload #7
    //   97: aaload
    //   98: aload_1
    //   99: aload_0
    //   100: getfield g9 : Ljava/util/Comparator;
    //   103: astore_1
    //   104: iload_3
    //   105: iload #5
    //   107: iconst_0
    //   108: aload_1
    //   109: invokestatic eM : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   112: dup
    //   113: istore_1
    //   114: iadd
    //   115: istore_2
    //   116: iload_1
    //   117: isub
    //   118: dup
    //   119: istore_1
    //   120: ifne -> 124
    //   123: return
    //   124: aload_0
    //   125: getfield ie0 : [Ljava/lang/Object;
    //   128: dup
    //   129: astore_3
    //   130: iload_2
    //   131: iload_1
    //   132: iadd
    //   133: iconst_1
    //   134: isub
    //   135: dup
    //   136: istore #4
    //   138: aaload
    //   139: aload_3
    //   140: aload_0
    //   141: iload #8
    //   143: iconst_1
    //   144: isub
    //   145: istore_3
    //   146: getfield g9 : Ljava/util/Comparator;
    //   149: astore #5
    //   151: iload #7
    //   153: iload #8
    //   155: iload_3
    //   156: aload #5
    //   158: invokestatic Jp : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   161: dup
    //   162: istore_3
    //   163: ifne -> 167
    //   166: return
    //   167: iload_1
    //   168: iload_3
    //   169: if_icmpgt -> 820
    //   172: aload_0
    //   173: getfield ie0 : [Ljava/lang/Object;
    //   176: dup
    //   177: dup2
    //   178: astore #5
    //   180: aload_0
    //   181: iload_1
    //   182: invokevirtual OS : (I)[Ljava/lang/Object;
    //   185: astore #6
    //   187: iload_2
    //   188: aload #6
    //   190: iconst_0
    //   191: iload_1
    //   192: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   195: iconst_0
    //   196: istore #4
    //   198: iload_2
    //   199: iconst_1
    //   200: iadd
    //   201: istore #8
    //   203: iload #7
    //   205: iconst_1
    //   206: iadd
    //   207: istore #9
    //   209: iload #7
    //   211: aaload
    //   212: iload_2
    //   213: swap
    //   214: aastore
    //   215: iload_3
    //   216: iconst_m1
    //   217: iadd
    //   218: dup
    //   219: istore_2
    //   220: ifne -> 238
    //   223: aload #6
    //   225: iload #4
    //   227: aload #5
    //   229: iload #8
    //   231: iload_1
    //   232: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   235: goto -> 1466
    //   238: iload_1
    //   239: iconst_1
    //   240: if_icmpne -> 273
    //   243: aload #5
    //   245: aload #6
    //   247: iload #8
    //   249: aload #5
    //   251: iload #9
    //   253: aload #5
    //   255: iload #8
    //   257: iload_2
    //   258: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   261: iload_2
    //   262: iadd
    //   263: istore_0
    //   264: iload #4
    //   266: aaload
    //   267: iload_0
    //   268: swap
    //   269: aastore
    //   270: goto -> 1466
    //   273: aload_0
    //   274: dup
    //   275: getfield g9 : Ljava/util/Comparator;
    //   278: astore #10
    //   280: getfield cn : I
    //   283: istore_3
    //   284: iload_3
    //   285: iload #8
    //   287: istore_3
    //   288: istore #8
    //   290: iconst_0
    //   291: istore #7
    //   293: iconst_0
    //   294: istore #11
    //   296: aload #10
    //   298: aload #6
    //   300: iload #4
    //   302: aload #5
    //   304: iload #9
    //   306: aaload
    //   307: astore #12
    //   309: aaload
    //   310: aload #12
    //   312: swap
    //   313: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   318: ifge -> 381
    //   321: aload #5
    //   323: dup
    //   324: iload_3
    //   325: iconst_1
    //   326: iadd
    //   327: istore #7
    //   329: iload #9
    //   331: iconst_1
    //   332: iadd
    //   333: istore #12
    //   335: iload #9
    //   337: aaload
    //   338: iload_3
    //   339: swap
    //   340: aastore
    //   341: iload #11
    //   343: iconst_1
    //   344: iadd
    //   345: istore_3
    //   346: iconst_0
    //   347: istore #9
    //   349: iload_2
    //   350: iconst_m1
    //   351: iadd
    //   352: dup
    //   353: istore_2
    //   354: ifne -> 364
    //   357: iload #12
    //   359: istore #9
    //   361: goto -> 659
    //   364: iload #9
    //   366: iload_3
    //   367: iload #7
    //   369: iload #12
    //   371: istore #9
    //   373: istore_3
    //   374: istore #11
    //   376: istore #7
    //   378: goto -> 444
    //   381: aload #5
    //   383: aload #6
    //   385: iload_3
    //   386: iconst_1
    //   387: iadd
    //   388: istore #11
    //   390: iload #4
    //   392: iconst_1
    //   393: iadd
    //   394: istore #12
    //   396: iload #4
    //   398: aaload
    //   399: iload_3
    //   400: swap
    //   401: aastore
    //   402: iload #7
    //   404: iconst_1
    //   405: iadd
    //   406: istore_3
    //   407: iconst_0
    //   408: istore #4
    //   410: iload_1
    //   411: iconst_m1
    //   412: iadd
    //   413: dup
    //   414: istore_1
    //   415: iconst_1
    //   416: if_icmpne -> 430
    //   419: iload #11
    //   421: iload #12
    //   423: istore #4
    //   425: istore #7
    //   427: goto -> 659
    //   430: iload_3
    //   431: iload #4
    //   433: iload #12
    //   435: iload #11
    //   437: istore_3
    //   438: istore #4
    //   440: istore #11
    //   442: istore #7
    //   444: iload #7
    //   446: iload #11
    //   448: ior
    //   449: iload #8
    //   451: if_icmplt -> 296
    //   454: aload #5
    //   456: iload #9
    //   458: aaload
    //   459: aload #6
    //   461: iload #4
    //   463: iload_1
    //   464: iconst_0
    //   465: aload #10
    //   467: invokestatic eM : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   470: dup
    //   471: istore #7
    //   473: ifeq -> 516
    //   476: iload_1
    //   477: iload #4
    //   479: iload_3
    //   480: aload #6
    //   482: iload #4
    //   484: aload #5
    //   486: iload_3
    //   487: iload #7
    //   489: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   492: iload #7
    //   494: iadd
    //   495: istore_3
    //   496: iload #7
    //   498: iadd
    //   499: istore #4
    //   501: iload #7
    //   503: isub
    //   504: dup
    //   505: istore_1
    //   506: iconst_1
    //   507: if_icmpgt -> 516
    //   510: iload_3
    //   511: istore #7
    //   513: goto -> 659
    //   516: aload #5
    //   518: dup
    //   519: iload_3
    //   520: iconst_1
    //   521: iadd
    //   522: istore #11
    //   524: iload #9
    //   526: iconst_1
    //   527: iadd
    //   528: istore #12
    //   530: iload #9
    //   532: aaload
    //   533: iload_3
    //   534: swap
    //   535: aastore
    //   536: iload_2
    //   537: iconst_m1
    //   538: iadd
    //   539: dup
    //   540: istore_2
    //   541: ifne -> 555
    //   544: iload #11
    //   546: iload #12
    //   548: istore #9
    //   550: istore #7
    //   552: goto -> 659
    //   555: aload #6
    //   557: iload #4
    //   559: aaload
    //   560: aload #5
    //   562: iload #12
    //   564: iload_2
    //   565: iconst_0
    //   566: aload #10
    //   568: invokestatic Jp : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   571: dup
    //   572: istore_3
    //   573: ifeq -> 615
    //   576: iload_2
    //   577: iload #12
    //   579: iload #11
    //   581: aload #5
    //   583: iload #12
    //   585: aload #5
    //   587: iload #11
    //   589: iload_3
    //   590: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   593: iload_3
    //   594: iadd
    //   595: istore #11
    //   597: iload_3
    //   598: iadd
    //   599: istore #9
    //   601: iload_3
    //   602: isub
    //   603: dup
    //   604: istore_2
    //   605: ifne -> 619
    //   608: iload #11
    //   610: istore #7
    //   612: goto -> 659
    //   615: iload #12
    //   617: istore #9
    //   619: aload #5
    //   621: aload #6
    //   623: iload #11
    //   625: iconst_1
    //   626: iadd
    //   627: istore #12
    //   629: iload #4
    //   631: iconst_1
    //   632: iadd
    //   633: istore #13
    //   635: iload #4
    //   637: aaload
    //   638: iload #11
    //   640: swap
    //   641: aastore
    //   642: iload_1
    //   643: iconst_m1
    //   644: iadd
    //   645: dup
    //   646: istore_1
    //   647: iconst_1
    //   648: if_icmpne -> 738
    //   651: iload #12
    //   653: iload #13
    //   655: istore #4
    //   657: istore #7
    //   659: iload #8
    //   661: iconst_1
    //   662: if_icmpge -> 668
    //   665: iconst_1
    //   666: istore #8
    //   668: iload_1
    //   669: aload_0
    //   670: iload #8
    //   672: putfield cn : I
    //   675: iconst_1
    //   676: if_icmpne -> 709
    //   679: aload #5
    //   681: aload #6
    //   683: iload #7
    //   685: aload #5
    //   687: iload #9
    //   689: aload #5
    //   691: iload #7
    //   693: iload_2
    //   694: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   697: iload_2
    //   698: iadd
    //   699: istore_0
    //   700: iload #4
    //   702: aaload
    //   703: iload_0
    //   704: swap
    //   705: aastore
    //   706: goto -> 1466
    //   709: iload_1
    //   710: ifeq -> 728
    //   713: aload #6
    //   715: iload #4
    //   717: aload #5
    //   719: iload #7
    //   721: iload_1
    //   722: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   725: goto -> 1466
    //   728: new java/lang/IllegalArgumentException
    //   731: dup
    //   732: ldc 'Comparison method violates its general contract!'
    //   734: invokespecial <init> : (Ljava/lang/String;)V
    //   737: athrow
    //   738: iload #7
    //   740: iload #8
    //   742: iconst_m1
    //   743: iadd
    //   744: istore #4
    //   746: bipush #7
    //   748: if_icmplt -> 757
    //   751: iconst_1
    //   752: istore #7
    //   754: goto -> 760
    //   757: iconst_0
    //   758: istore #7
    //   760: iload_3
    //   761: bipush #7
    //   763: if_icmplt -> 771
    //   766: iconst_1
    //   767: istore_3
    //   768: goto -> 773
    //   771: iconst_0
    //   772: istore_3
    //   773: iload #7
    //   775: iload_3
    //   776: ior
    //   777: ifne -> 806
    //   780: iload #4
    //   782: ifge -> 788
    //   785: iconst_0
    //   786: istore #4
    //   788: iload #4
    //   790: iconst_2
    //   791: iadd
    //   792: istore_3
    //   793: iload_3
    //   794: iload #13
    //   796: iload #12
    //   798: istore_3
    //   799: istore #4
    //   801: istore #8
    //   803: goto -> 290
    //   806: iload #13
    //   808: iload #12
    //   810: iload #4
    //   812: istore #8
    //   814: istore_3
    //   815: istore #4
    //   817: goto -> 454
    //   820: aload_0
    //   821: getfield ie0 : [Ljava/lang/Object;
    //   824: dup
    //   825: dup
    //   826: astore #5
    //   828: iload #4
    //   830: iload #7
    //   832: iload_3
    //   833: dup
    //   834: aload #5
    //   836: iload #7
    //   838: aload_0
    //   839: iload_3
    //   840: invokevirtual OS : (I)[Ljava/lang/Object;
    //   843: dup
    //   844: astore #6
    //   846: iconst_0
    //   847: iload_3
    //   848: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   851: iconst_1
    //   852: isub
    //   853: istore #7
    //   855: iadd
    //   856: iconst_1
    //   857: isub
    //   858: dup
    //   859: istore #8
    //   861: iconst_m1
    //   862: iadd
    //   863: istore #9
    //   865: iinc #4, -1
    //   868: aaload
    //   869: iload #8
    //   871: swap
    //   872: aastore
    //   873: iload_1
    //   874: iconst_m1
    //   875: iadd
    //   876: dup
    //   877: istore_1
    //   878: ifne -> 900
    //   881: aload #6
    //   883: iload #9
    //   885: iload #7
    //   887: isub
    //   888: istore_0
    //   889: iconst_0
    //   890: aload #5
    //   892: iload_0
    //   893: iload_3
    //   894: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   897: goto -> 1466
    //   900: iload_3
    //   901: iconst_1
    //   902: if_icmpne -> 940
    //   905: aload #5
    //   907: aload #6
    //   909: iload #7
    //   911: aload #5
    //   913: iload #4
    //   915: iload_1
    //   916: iload #9
    //   918: iload_1
    //   919: isub
    //   920: istore_0
    //   921: isub
    //   922: iconst_1
    //   923: iadd
    //   924: aload #5
    //   926: iload_0
    //   927: iconst_1
    //   928: iadd
    //   929: iload_1
    //   930: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   933: aaload
    //   934: iload_0
    //   935: swap
    //   936: aastore
    //   937: goto -> 1466
    //   940: aload_0
    //   941: dup
    //   942: getfield g9 : Ljava/util/Comparator;
    //   945: astore #8
    //   947: getfield cn : I
    //   950: istore #10
    //   952: iconst_0
    //   953: istore #11
    //   955: iconst_0
    //   956: istore #12
    //   958: aload #8
    //   960: aload #5
    //   962: iload #4
    //   964: aload #6
    //   966: iload #7
    //   968: aaload
    //   969: astore #13
    //   971: aaload
    //   972: aload #13
    //   974: swap
    //   975: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   980: ifge -> 1048
    //   983: aload #5
    //   985: dup
    //   986: iload #9
    //   988: iconst_m1
    //   989: iadd
    //   990: istore #12
    //   992: iload #4
    //   994: iconst_m1
    //   995: iadd
    //   996: istore #13
    //   998: iload #4
    //   1000: aaload
    //   1001: iload #9
    //   1003: swap
    //   1004: aastore
    //   1005: iload #11
    //   1007: iconst_1
    //   1008: iadd
    //   1009: istore #4
    //   1011: iconst_0
    //   1012: istore #9
    //   1014: iload_1
    //   1015: iconst_m1
    //   1016: iadd
    //   1017: dup
    //   1018: istore_1
    //   1019: ifne -> 1029
    //   1022: iload #13
    //   1024: istore #4
    //   1026: goto -> 1390
    //   1029: iload #4
    //   1031: iload #9
    //   1033: iload #13
    //   1035: iload #12
    //   1037: istore #9
    //   1039: istore #4
    //   1041: istore #12
    //   1043: istore #11
    //   1045: goto -> 1116
    //   1048: aload #5
    //   1050: aload #6
    //   1052: iload #9
    //   1054: iconst_m1
    //   1055: iadd
    //   1056: istore #11
    //   1058: iload #7
    //   1060: iconst_m1
    //   1061: iadd
    //   1062: istore #13
    //   1064: iload #7
    //   1066: aaload
    //   1067: iload #9
    //   1069: swap
    //   1070: aastore
    //   1071: iload #12
    //   1073: iconst_1
    //   1074: iadd
    //   1075: istore #7
    //   1077: iconst_0
    //   1078: istore #9
    //   1080: iload_3
    //   1081: iconst_m1
    //   1082: iadd
    //   1083: dup
    //   1084: istore_3
    //   1085: iconst_1
    //   1086: if_icmpne -> 1100
    //   1089: iload #13
    //   1091: iload #11
    //   1093: istore #12
    //   1095: istore #7
    //   1097: goto -> 1390
    //   1100: iload #9
    //   1102: iload #7
    //   1104: iload #13
    //   1106: iload #11
    //   1108: istore #9
    //   1110: istore #7
    //   1112: istore #12
    //   1114: istore #11
    //   1116: iload #11
    //   1118: iload #12
    //   1120: ior
    //   1121: iload #10
    //   1123: if_icmplt -> 958
    //   1126: iload_1
    //   1127: aload #6
    //   1129: iload #7
    //   1131: aaload
    //   1132: aload #5
    //   1134: iload_1
    //   1135: iconst_1
    //   1136: isub
    //   1137: istore #11
    //   1139: iload_2
    //   1140: iload_1
    //   1141: iload #11
    //   1143: aload #8
    //   1145: invokestatic eM : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   1148: isub
    //   1149: dup
    //   1150: istore #11
    //   1152: ifeq -> 1210
    //   1155: iload_1
    //   1156: iload #4
    //   1158: iload #9
    //   1160: iload #11
    //   1162: isub
    //   1163: istore #9
    //   1165: iload #11
    //   1167: isub
    //   1168: istore #4
    //   1170: iload #11
    //   1172: isub
    //   1173: dup
    //   1174: istore_1
    //   1175: aload #5
    //   1177: iload #4
    //   1179: iconst_1
    //   1180: iadd
    //   1181: istore #12
    //   1183: iload #9
    //   1185: iconst_1
    //   1186: iadd
    //   1187: istore #13
    //   1189: iload #12
    //   1191: aload #5
    //   1193: iload #13
    //   1195: iload #11
    //   1197: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1200: ifne -> 1210
    //   1203: iload #9
    //   1205: istore #12
    //   1207: goto -> 1390
    //   1210: aload #5
    //   1212: aload #6
    //   1214: iload #9
    //   1216: iconst_m1
    //   1217: iadd
    //   1218: istore #12
    //   1220: iload #7
    //   1222: iconst_m1
    //   1223: iadd
    //   1224: istore #13
    //   1226: iload #7
    //   1228: aaload
    //   1229: iload #9
    //   1231: swap
    //   1232: aastore
    //   1233: iload_3
    //   1234: iconst_m1
    //   1235: iadd
    //   1236: dup
    //   1237: istore_3
    //   1238: iconst_1
    //   1239: if_icmpne -> 1249
    //   1242: iload #13
    //   1244: istore #7
    //   1246: goto -> 1390
    //   1249: iload_3
    //   1250: aload #5
    //   1252: iload #4
    //   1254: aaload
    //   1255: aload #6
    //   1257: iload_3
    //   1258: iconst_1
    //   1259: isub
    //   1260: istore #7
    //   1262: iconst_0
    //   1263: iload_3
    //   1264: iload #7
    //   1266: aload #8
    //   1268: invokestatic Jp : (Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I
    //   1271: isub
    //   1272: dup
    //   1273: istore #7
    //   1275: ifeq -> 1344
    //   1278: iload_3
    //   1279: iload #13
    //   1281: iload #12
    //   1283: iload #7
    //   1285: isub
    //   1286: istore #12
    //   1288: iload #7
    //   1290: isub
    //   1291: istore_3
    //   1292: iload #7
    //   1294: isub
    //   1295: dup
    //   1296: istore #9
    //   1298: aload #6
    //   1300: iload_3
    //   1301: iconst_1
    //   1302: iadd
    //   1303: istore #13
    //   1305: iload #12
    //   1307: iconst_1
    //   1308: iadd
    //   1309: istore #14
    //   1311: iload #13
    //   1313: aload #5
    //   1315: iload #14
    //   1317: iload #7
    //   1319: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1322: iconst_1
    //   1323: if_icmpgt -> 1335
    //   1326: iload #9
    //   1328: iload_3
    //   1329: istore #7
    //   1331: istore_3
    //   1332: goto -> 1390
    //   1335: iload_3
    //   1336: iload #9
    //   1338: istore_3
    //   1339: istore #9
    //   1341: goto -> 1348
    //   1344: iload #13
    //   1346: istore #9
    //   1348: aload #5
    //   1350: dup
    //   1351: iload #12
    //   1353: iconst_m1
    //   1354: iadd
    //   1355: istore #13
    //   1357: iload #4
    //   1359: iconst_m1
    //   1360: iadd
    //   1361: istore #14
    //   1363: iload #4
    //   1365: aaload
    //   1366: iload #12
    //   1368: swap
    //   1369: aastore
    //   1370: iload_1
    //   1371: iconst_m1
    //   1372: iadd
    //   1373: dup
    //   1374: istore_1
    //   1375: ifne -> 1477
    //   1378: iload #9
    //   1380: iload #14
    //   1382: iload #13
    //   1384: istore #12
    //   1386: istore #4
    //   1388: istore #7
    //   1390: iload #10
    //   1392: iconst_1
    //   1393: if_icmpge -> 1399
    //   1396: iconst_1
    //   1397: istore #10
    //   1399: iload_3
    //   1400: aload_0
    //   1401: iload #10
    //   1403: putfield cn : I
    //   1406: iconst_1
    //   1407: if_icmpne -> 1445
    //   1410: aload #5
    //   1412: aload #6
    //   1414: iload #7
    //   1416: aload #5
    //   1418: iload #4
    //   1420: iload_1
    //   1421: iload #12
    //   1423: iload_1
    //   1424: isub
    //   1425: istore_0
    //   1426: isub
    //   1427: iconst_1
    //   1428: iadd
    //   1429: aload #5
    //   1431: iload_0
    //   1432: iconst_1
    //   1433: iadd
    //   1434: iload_1
    //   1435: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1438: aaload
    //   1439: iload_0
    //   1440: swap
    //   1441: aastore
    //   1442: goto -> 1466
    //   1445: iload_3
    //   1446: ifeq -> 1467
    //   1449: aload #6
    //   1451: iload #12
    //   1453: iload_3
    //   1454: iconst_1
    //   1455: isub
    //   1456: isub
    //   1457: istore_0
    //   1458: iconst_0
    //   1459: aload #5
    //   1461: iload_0
    //   1462: iload_3
    //   1463: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1466: return
    //   1467: new java/lang/IllegalArgumentException
    //   1470: dup
    //   1471: ldc 'Comparison method violates its general contract!'
    //   1473: invokespecial <init> : (Ljava/lang/String;)V
    //   1476: athrow
    //   1477: iload #11
    //   1479: iload #10
    //   1481: iconst_m1
    //   1482: iadd
    //   1483: istore #4
    //   1485: bipush #7
    //   1487: if_icmplt -> 1496
    //   1490: iconst_1
    //   1491: istore #10
    //   1493: goto -> 1499
    //   1496: iconst_0
    //   1497: istore #10
    //   1499: iload #7
    //   1501: bipush #7
    //   1503: if_icmplt -> 1512
    //   1506: iconst_1
    //   1507: istore #7
    //   1509: goto -> 1515
    //   1512: iconst_0
    //   1513: istore #7
    //   1515: iload #10
    //   1517: iload #7
    //   1519: ior
    //   1520: ifne -> 1552
    //   1523: iload #4
    //   1525: ifge -> 1531
    //   1528: iconst_0
    //   1529: istore #4
    //   1531: iload #4
    //   1533: iconst_2
    //   1534: iadd
    //   1535: istore #10
    //   1537: iload #14
    //   1539: iload #9
    //   1541: iload #13
    //   1543: istore #9
    //   1545: istore #7
    //   1547: istore #4
    //   1549: goto -> 952
    //   1552: iload #9
    //   1554: iload #14
    //   1556: iload #13
    //   1558: iload #4
    //   1560: istore #10
    //   1562: istore #9
    //   1564: istore #4
    //   1566: istore #7
    //   1568: goto -> 1126
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 173
    //   #2	-> 821
  }
  
  public final Object[] OS(int paramInt) {
    this.LPT2 = Math.max(this.LPT2, paramInt);
    if (this.Jf0.length < paramInt) {
      int i;
      if ((i = (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2) >> 4 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2) >> 4) >> 8 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2) >> 4 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2 | (paramInt | paramInt >> 1 | (paramInt | paramInt >> 1) >> 2) >> 4) >> 8) >> 16) + 1) >= 0)
        paramInt = Math.min(i, this.ie0.length >>> 1); 
      this.Jf0 = new Object[paramInt];
    } 
    return this.Jf0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UI0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */