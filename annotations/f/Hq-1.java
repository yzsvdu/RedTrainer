package f;

public final class Hq implements Comparable {
  public final byte tO;
  
  public final byte h70;
  
  public final pM Fg;
  
  public final byte Ra;
  
  public byte WA0;
  
  public byte Ce;
  
  public short pl0;
  
  public byte Ee0;
  
  public byte Kn;
  
  public Hq(byte paramByte1, byte paramByte2, pM parampM, byte paramByte3, byte paramByte4, byte paramByte5, short paramShort, byte paramByte6, byte paramByte7) {
    this.tO = paramByte1;
    this.h70 = paramByte2;
    this.Fg = parampM;
    this.Ra = paramByte3;
    this.WA0 = paramByte4;
    this.Ce = paramByte5;
    this.pl0 = paramShort;
    this.Ee0 = paramByte6;
    this.Kn = paramByte7;
  }
  
  public final boolean gj() {
    if (Gj((byte)1) && Gj((byte)2) && Gj((byte)4))
      return false; 
    if (Gj((byte)1) || Gj((byte)2) || Gj((byte)4))
      return true; 
  }
  
  public final boolean Gj(byte paramByte) {
    return ((this.WA0 & paramByte) != 0);
  }
  
  public final boolean TG0(short paramShort) {
    return ((this.pl0 & paramShort) != 0);
  }
  
  public final int IS(Hq paramHq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield tO : B
    //   4: dup
    //   5: istore_2
    //   6: aload_1
    //   7: getfield tO : B
    //   10: dup
    //   11: istore_3
    //   12: if_icmpeq -> 19
    //   15: iload_2
    //   16: iload_3
    //   17: isub
    //   18: ireturn
    //   19: aload_1
    //   20: iload_2
    //   21: sipush #1000
    //   24: imul
    //   25: ldc 140000
    //   27: iadd
    //   28: aload_0
    //   29: getfield h70 : B
    //   32: sipush #255
    //   35: iand
    //   36: iadd
    //   37: ldc '???'
    //   39: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
    //   42: astore_2
    //   43: getfield tO : B
    //   46: sipush #1000
    //   49: imul
    //   50: ldc 140000
    //   52: iadd
    //   53: aload_1
    //   54: getfield h70 : B
    //   57: sipush #255
    //   60: iand
    //   61: iadd
    //   62: ldc '???'
    //   64: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
    //   67: dup
    //   68: astore_3
    //   69: aload_2
    //   70: iconst_0
    //   71: istore #4
    //   73: iconst_0
    //   74: istore #5
    //   76: invokevirtual length : ()I
    //   79: istore #6
    //   81: invokevirtual length : ()I
    //   84: istore #7
    //   86: iload #4
    //   88: iload #6
    //   90: if_icmpge -> 595
    //   93: iload #5
    //   95: iload #7
    //   97: if_icmpge -> 595
    //   100: aload_2
    //   101: new java/lang/StringBuilder
    //   104: dup
    //   105: astore #8
    //   107: invokespecial <init> : ()V
    //   110: iload #4
    //   112: invokevirtual charAt : (I)C
    //   115: dup
    //   116: istore #9
    //   118: aload #8
    //   120: iload #9
    //   122: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: iload #4
    //   128: iconst_1
    //   129: iadd
    //   130: istore #10
    //   132: bipush #48
    //   134: if_icmplt -> 148
    //   137: iload #9
    //   139: bipush #57
    //   141: if_icmpgt -> 148
    //   144: iconst_1
    //   145: goto -> 149
    //   148: iconst_0
    //   149: ifeq -> 205
    //   152: iload #10
    //   154: iload #6
    //   156: if_icmpge -> 258
    //   159: aload_2
    //   160: iload #10
    //   162: invokevirtual charAt : (I)C
    //   165: dup
    //   166: istore #9
    //   168: bipush #48
    //   170: if_icmplt -> 184
    //   173: iload #9
    //   175: bipush #57
    //   177: if_icmpgt -> 184
    //   180: iconst_1
    //   181: goto -> 185
    //   184: iconst_0
    //   185: ifne -> 191
    //   188: goto -> 258
    //   191: aload #8
    //   193: iload #9
    //   195: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: iinc #10, 1
    //   202: goto -> 152
    //   205: iload #10
    //   207: iload #6
    //   209: if_icmpge -> 258
    //   212: aload_2
    //   213: iload #10
    //   215: invokevirtual charAt : (I)C
    //   218: dup
    //   219: istore #9
    //   221: bipush #48
    //   223: if_icmplt -> 237
    //   226: iload #9
    //   228: bipush #57
    //   230: if_icmpgt -> 237
    //   233: iconst_1
    //   234: goto -> 238
    //   237: iconst_0
    //   238: ifeq -> 244
    //   241: goto -> 258
    //   244: aload #8
    //   246: iload #9
    //   248: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: iinc #10, 1
    //   255: goto -> 205
    //   258: aload_3
    //   259: iload #5
    //   261: aload #8
    //   263: invokevirtual toString : ()Ljava/lang/String;
    //   266: dup
    //   267: astore #8
    //   269: invokevirtual length : ()I
    //   272: iload #4
    //   274: iadd
    //   275: istore #4
    //   277: new java/lang/StringBuilder
    //   280: dup
    //   281: astore #9
    //   283: invokespecial <init> : ()V
    //   286: invokevirtual charAt : (I)C
    //   289: dup
    //   290: istore #10
    //   292: aload #9
    //   294: iload #10
    //   296: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: iload #5
    //   302: iconst_1
    //   303: iadd
    //   304: istore #11
    //   306: bipush #48
    //   308: if_icmplt -> 322
    //   311: iload #10
    //   313: bipush #57
    //   315: if_icmpgt -> 322
    //   318: iconst_1
    //   319: goto -> 323
    //   322: iconst_0
    //   323: ifeq -> 379
    //   326: iload #11
    //   328: iload #7
    //   330: if_icmpge -> 432
    //   333: aload_3
    //   334: iload #11
    //   336: invokevirtual charAt : (I)C
    //   339: dup
    //   340: istore #10
    //   342: bipush #48
    //   344: if_icmplt -> 358
    //   347: iload #10
    //   349: bipush #57
    //   351: if_icmpgt -> 358
    //   354: iconst_1
    //   355: goto -> 359
    //   358: iconst_0
    //   359: ifne -> 365
    //   362: goto -> 432
    //   365: aload #9
    //   367: iload #10
    //   369: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   372: pop
    //   373: iinc #11, 1
    //   376: goto -> 326
    //   379: iload #11
    //   381: iload #7
    //   383: if_icmpge -> 432
    //   386: aload_3
    //   387: iload #11
    //   389: invokevirtual charAt : (I)C
    //   392: dup
    //   393: istore #10
    //   395: bipush #48
    //   397: if_icmplt -> 411
    //   400: iload #10
    //   402: bipush #57
    //   404: if_icmpgt -> 411
    //   407: iconst_1
    //   408: goto -> 412
    //   411: iconst_0
    //   412: ifeq -> 418
    //   415: goto -> 432
    //   418: aload #9
    //   420: iload #10
    //   422: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   425: pop
    //   426: iinc #11, 1
    //   429: goto -> 379
    //   432: aload #8
    //   434: aload #9
    //   436: invokevirtual toString : ()Ljava/lang/String;
    //   439: dup
    //   440: astore #9
    //   442: invokevirtual length : ()I
    //   445: iload #5
    //   447: iadd
    //   448: istore #5
    //   450: iconst_0
    //   451: invokevirtual charAt : (I)C
    //   454: dup
    //   455: istore #10
    //   457: bipush #48
    //   459: if_icmplt -> 475
    //   462: iload #10
    //   464: bipush #57
    //   466: if_icmpgt -> 475
    //   469: iconst_1
    //   470: istore #10
    //   472: goto -> 478
    //   475: iconst_0
    //   476: istore #10
    //   478: iload #10
    //   480: ifeq -> 578
    //   483: aload #9
    //   485: iconst_0
    //   486: invokevirtual charAt : (I)C
    //   489: dup
    //   490: istore #10
    //   492: bipush #48
    //   494: if_icmplt -> 510
    //   497: iload #10
    //   499: bipush #57
    //   501: if_icmpgt -> 510
    //   504: iconst_1
    //   505: istore #10
    //   507: goto -> 513
    //   510: iconst_0
    //   511: istore #10
    //   513: iload #10
    //   515: ifeq -> 578
    //   518: aload #8
    //   520: invokevirtual length : ()I
    //   523: dup
    //   524: istore #10
    //   526: aload #9
    //   528: invokevirtual length : ()I
    //   531: isub
    //   532: dup
    //   533: istore #11
    //   535: ifne -> 587
    //   538: iconst_0
    //   539: istore #12
    //   541: iload #12
    //   543: iload #10
    //   545: if_icmpge -> 587
    //   548: aload #8
    //   550: iload #12
    //   552: invokevirtual charAt : (I)C
    //   555: aload #9
    //   557: iload #12
    //   559: invokevirtual charAt : (I)C
    //   562: isub
    //   563: dup
    //   564: istore #11
    //   566: ifeq -> 572
    //   569: goto -> 602
    //   572: iinc #12, 1
    //   575: goto -> 541
    //   578: aload #8
    //   580: aload #9
    //   582: invokevirtual compareTo : (Ljava/lang/String;)I
    //   585: istore #11
    //   587: iload #11
    //   589: ifeq -> 86
    //   592: goto -> 602
    //   595: iload #6
    //   597: iload #7
    //   599: isub
    //   600: istore #11
    //   602: iload #11
    //   604: ifeq -> 610
    //   607: iload #11
    //   609: ireturn
    //   610: aload_0
    //   611: getfield Fg : Lf/pM;
    //   614: aload_1
    //   615: getfield Fg : Lf/pM;
    //   618: invokevirtual compareTo : (Ljava/lang/Enum;)I
    //   621: dup
    //   622: istore_2
    //   623: ifeq -> 628
    //   626: iload_2
    //   627: ireturn
    //   628: aload_0
    //   629: invokevirtual gj : ()Z
    //   632: aload_1
    //   633: invokevirtual gj : ()Z
    //   636: if_icmpeq -> 649
    //   639: aload_0
    //   640: invokevirtual gj : ()Z
    //   643: aload_1
    //   644: invokevirtual gj : ()Z
    //   647: isub
    //   648: ireturn
    //   649: aload_0
    //   650: getfield Ee0 : B
    //   653: aload_1
    //   654: getfield Ee0 : B
    //   657: invokestatic compare : (II)I
    //   660: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 7
    //   #2	-> 29
    //   #3	-> 37
    //   #4	-> 43
    //   #5	-> 54
    //   #6	-> 62
    //   #7	-> 76
    //   #8	-> 101
    //   #9	-> 269
    //   #10	-> 277
    //   #11	-> 442
    //   #12	-> 611
    //   #13	-> 618
    //   #14	-> 650
    //   #15	-> 657
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */