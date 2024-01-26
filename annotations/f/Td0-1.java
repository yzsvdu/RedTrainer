package f;

public final class Td0 {
  public final o0 Ou;
  
  public final o0 t4;
  
  public long ip0;
  
  public Td0() {
    o0 o01;
    this();
    this.Ou = this;
    this();
    this.t4 = this;
  }
  
  public final void iC0(LpT8 paramLpT8) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: monitorenter
    //   3: ifnonnull -> 17
    //   6: aload_0
    //   7: dup
    //   8: getfield Ou : Lf/o0;
    //   11: iconst_0
    //   12: putfield mG0 : I
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield t4 : Lf/o0;
    //   21: dup
    //   22: dup
    //   23: astore_2
    //   24: aload_0
    //   25: getfield Ou : Lf/o0;
    //   28: dup
    //   29: aload_2
    //   30: invokevirtual getClass : ()Ljava/lang/Class;
    //   33: pop
    //   34: getfield Ky : [I
    //   37: astore_3
    //   38: getfield mG0 : I
    //   41: istore #4
    //   43: iconst_0
    //   44: istore #5
    //   46: getfield Ky : [I
    //   49: astore #6
    //   51: getfield mG0 : I
    //   54: iload #4
    //   56: iadd
    //   57: dup
    //   58: istore #7
    //   60: aload #6
    //   62: arraylength
    //   63: if_icmple -> 98
    //   66: aload_2
    //   67: bipush #8
    //   69: iload #7
    //   71: invokestatic max : (II)I
    //   74: aload_2
    //   75: getfield mG0 : I
    //   78: i2f
    //   79: ldc 1.75
    //   81: fmul
    //   82: f2i
    //   83: invokestatic max : (II)I
    //   86: invokevirtual YK0 : (I)[I
    //   89: astore #6
    //   91: goto -> 98
    //   94: astore_1
    //   95: goto -> 566
    //   98: aload_0
    //   99: dup
    //   100: dup
    //   101: aload_2
    //   102: dup
    //   103: aload_3
    //   104: iload #5
    //   106: aload_2
    //   107: getfield mG0 : I
    //   110: aload #6
    //   112: swap
    //   113: iload #4
    //   115: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   118: getfield mG0 : I
    //   121: iload #4
    //   123: iadd
    //   124: putfield mG0 : I
    //   127: getfield Ou : Lf/o0;
    //   130: iconst_0
    //   131: putfield mG0 : I
    //   134: monitorexit
    //   135: getfield t4 : Lf/o0;
    //   138: dup
    //   139: getfield Ky : [I
    //   142: astore_2
    //   143: iconst_0
    //   144: istore_3
    //   145: getfield mG0 : I
    //   148: istore #4
    //   150: iload_3
    //   151: iload #4
    //   153: if_icmpge -> 557
    //   156: aload_2
    //   157: iload_3
    //   158: dup
    //   159: iconst_1
    //   160: iadd
    //   161: istore_3
    //   162: iaload
    //   163: aload_0
    //   164: aload_2
    //   165: iload_3
    //   166: dup
    //   167: iconst_1
    //   168: iadd
    //   169: istore_3
    //   170: iaload
    //   171: i2l
    //   172: bipush #32
    //   174: lshl
    //   175: aload_2
    //   176: iload_3
    //   177: dup
    //   178: iconst_1
    //   179: iadd
    //   180: istore_3
    //   181: iaload
    //   182: i2l
    //   183: ldc2_w 4294967295
    //   186: land
    //   187: lor
    //   188: putfield ip0 : J
    //   191: tableswitch default -> 240, -1 -> 548, 0 -> 531, 1 -> 514, 2 -> 496, 3 -> 432, 4 -> 368, 5 -> 317, 6 -> 283, 7 -> 248
    //   240: new java/lang/RuntimeException
    //   243: dup
    //   244: invokespecial <init> : ()V
    //   247: athrow
    //   248: aload_1
    //   249: aload_2
    //   250: dup
    //   251: iload_3
    //   252: dup
    //   253: iconst_1
    //   254: iadd
    //   255: istore_3
    //   256: iaload
    //   257: invokestatic intBitsToFloat : (I)F
    //   260: fstore #5
    //   262: iload_3
    //   263: dup
    //   264: iconst_1
    //   265: iadd
    //   266: istore_3
    //   267: iaload
    //   268: invokestatic intBitsToFloat : (I)F
    //   271: fload #5
    //   273: swap
    //   274: invokeinterface kG0 : (FF)Z
    //   279: pop
    //   280: goto -> 150
    //   283: aload_1
    //   284: aload_2
    //   285: dup
    //   286: iload_3
    //   287: iconst_1
    //   288: iadd
    //   289: istore #5
    //   291: iload_3
    //   292: iaload
    //   293: istore_3
    //   294: iload #5
    //   296: iconst_1
    //   297: iadd
    //   298: istore #6
    //   300: iload #5
    //   302: iaload
    //   303: iload_3
    //   304: swap
    //   305: invokeinterface x80 : (II)Z
    //   310: pop
    //   311: iload #6
    //   313: istore_3
    //   314: goto -> 150
    //   317: aload_1
    //   318: aload_2
    //   319: dup
    //   320: dup
    //   321: iload_3
    //   322: iconst_1
    //   323: iadd
    //   324: istore #5
    //   326: iload_3
    //   327: iaload
    //   328: istore_3
    //   329: iload #5
    //   331: iconst_1
    //   332: iadd
    //   333: istore #6
    //   335: iload #5
    //   337: iaload
    //   338: istore #5
    //   340: iload #6
    //   342: iconst_1
    //   343: iadd
    //   344: istore #7
    //   346: iload #6
    //   348: iaload
    //   349: istore #6
    //   351: iload_3
    //   352: iload #5
    //   354: iload #6
    //   356: invokeinterface Xe : (III)Z
    //   361: pop
    //   362: iload #7
    //   364: istore_3
    //   365: goto -> 150
    //   368: aload_1
    //   369: aload_2
    //   370: dup
    //   371: dup2
    //   372: iload_3
    //   373: iconst_1
    //   374: iadd
    //   375: istore #5
    //   377: iload_3
    //   378: iaload
    //   379: istore_3
    //   380: iload #5
    //   382: iconst_1
    //   383: iadd
    //   384: istore #6
    //   386: iload #5
    //   388: iaload
    //   389: istore #5
    //   391: iload #6
    //   393: iconst_1
    //   394: iadd
    //   395: istore #7
    //   397: iload #6
    //   399: iaload
    //   400: istore #6
    //   402: iload #7
    //   404: iconst_1
    //   405: iadd
    //   406: istore #8
    //   408: iload #7
    //   410: iaload
    //   411: istore #7
    //   413: iload_3
    //   414: iload #5
    //   416: iload #6
    //   418: iload #7
    //   420: invokeinterface Di : (IIII)Z
    //   425: pop
    //   426: iload #8
    //   428: istore_3
    //   429: goto -> 150
    //   432: aload_1
    //   433: aload_2
    //   434: dup
    //   435: dup2
    //   436: iload_3
    //   437: iconst_1
    //   438: iadd
    //   439: istore #5
    //   441: iload_3
    //   442: iaload
    //   443: istore_3
    //   444: iload #5
    //   446: iconst_1
    //   447: iadd
    //   448: istore #6
    //   450: iload #5
    //   452: iaload
    //   453: istore #5
    //   455: iload #6
    //   457: iconst_1
    //   458: iadd
    //   459: istore #7
    //   461: iload #6
    //   463: iaload
    //   464: istore #6
    //   466: iload #7
    //   468: iconst_1
    //   469: iadd
    //   470: istore #8
    //   472: iload #7
    //   474: iaload
    //   475: istore #7
    //   477: iload_3
    //   478: iload #5
    //   480: iload #6
    //   482: iload #7
    //   484: invokeinterface bD0 : (IIII)Z
    //   489: pop
    //   490: iload #8
    //   492: istore_3
    //   493: goto -> 150
    //   496: aload_1
    //   497: aload_2
    //   498: iload_3
    //   499: dup
    //   500: iconst_1
    //   501: iadd
    //   502: istore_3
    //   503: iaload
    //   504: i2c
    //   505: invokeinterface d70 : (C)Z
    //   510: pop
    //   511: goto -> 150
    //   514: aload_1
    //   515: aload_2
    //   516: iload_3
    //   517: dup
    //   518: iconst_1
    //   519: iadd
    //   520: istore_3
    //   521: iaload
    //   522: invokeinterface XM : (I)Z
    //   527: pop
    //   528: goto -> 150
    //   531: aload_1
    //   532: aload_2
    //   533: iload_3
    //   534: dup
    //   535: iconst_1
    //   536: iadd
    //   537: istore_3
    //   538: iaload
    //   539: invokeinterface Zp0 : (I)Z
    //   544: pop
    //   545: goto -> 150
    //   548: iload_3
    //   549: aload_2
    //   550: iload_3
    //   551: iaload
    //   552: iadd
    //   553: istore_3
    //   554: goto -> 150
    //   557: aload_0
    //   558: getfield t4 : Lf/o0;
    //   561: iconst_0
    //   562: putfield mG0 : I
    //   565: return
    //   566: aload_1
    //   567: aload_0
    //   568: monitorexit
    //   569: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 12
    //   #2	-> 15
    //   #3	-> 34
    //   #4	-> 46
    //   #5	-> 127
    //   #6	-> 131
    //   #7	-> 134
    //   #8	-> 257
    //   #9	-> 267
    //   #10	-> 268
    //   #11	-> 274
    //   #12	-> 562
    //   #13	-> 568
    // Exception table:
    //   from	to	target	type
    //   6	16	94	finally
    //   17	21	94	finally
    //   24	33	94	finally
    //   34	37	94	finally
    //   38	41	94	finally
    //   46	49	94	finally
    //   51	54	94	finally
    //   60	63	94	finally
    //   66	78	94	finally
    //   83	89	94	finally
    //   98	121	94	finally
    //   124	135	94	finally
    //   566	569	94	finally
  }
  
  public final synchronized int Pg(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.Ou.Ky;
    int i = this.Ou.mG0;
    while (paramInt2 < i) {
      int j;
      if ((j = this[paramInt2]) == paramInt1)
        return paramInt2; 
      paramInt2 += 3;
      switch (j) {
        default:
          throw new RuntimeException();
        case 6:
        case 7:
          paramInt2 += 2;
          continue;
        case 5:
          paramInt2 += 3;
          continue;
        case 3:
        case 4:
          paramInt2 += 4;
          continue;
        case 0:
        case 1:
        case 2:
          paramInt2++;
          continue;
        case -1:
          break;
      } 
      paramInt2 += this[paramInt2];
    } 
    return -1;
  }
  
  public final void Jo0(long paramLong) {
    this.Ou.oU((int)(paramLong >> 32L));
    this.Ou.oU((int)paramLong);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Td0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */