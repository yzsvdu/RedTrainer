package f;

public abstract class Nm0 {
  public boolean vS;
  
  public static Nm0 DQ(ru0 paramru0) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: astore_1
    //   5: invokespecial <init> : ()V
    //   8: bipush #32
    //   10: istore_2
    //   11: aload_0
    //   12: invokevirtual At : ()Z
    //   15: ifeq -> 628
    //   18: aload_0
    //   19: invokevirtual Bn : ()C
    //   22: dup
    //   23: istore_3
    //   24: bipush #33
    //   26: if_icmpne -> 35
    //   29: iconst_1
    //   30: istore #4
    //   32: goto -> 38
    //   35: iconst_0
    //   36: istore #4
    //   38: iload #4
    //   40: ifeq -> 74
    //   43: aload_0
    //   44: dup
    //   45: dup
    //   46: getfield Qq : I
    //   49: iconst_1
    //   50: iadd
    //   51: putfield Qq : I
    //   54: invokevirtual At : ()Z
    //   57: ifeq -> 68
    //   60: aload_0
    //   61: invokevirtual Bn : ()C
    //   64: istore_3
    //   65: goto -> 74
    //   68: aload_0
    //   69: invokevirtual ds : ()V
    //   72: aconst_null
    //   73: athrow
    //   74: iload_3
    //   75: invokestatic isJavaIdentifierStart : (C)Z
    //   78: ifeq -> 162
    //   81: aload_0
    //   82: new f/x2
    //   85: astore_3
    //   86: getfield Qq : I
    //   89: istore #5
    //   91: aload_0
    //   92: getfield Qq : I
    //   95: aload_0
    //   96: getfield ae0 : Ljava/lang/String;
    //   99: invokevirtual length : ()I
    //   102: if_icmpge -> 109
    //   105: iconst_1
    //   106: goto -> 110
    //   109: iconst_0
    //   110: ifeq -> 136
    //   113: aload_0
    //   114: invokevirtual Bn : ()C
    //   117: invokestatic isJavaIdentifierPart : (C)Z
    //   120: ifeq -> 136
    //   123: aload_0
    //   124: dup
    //   125: getfield Qq : I
    //   128: iconst_1
    //   129: iadd
    //   130: putfield Qq : I
    //   133: goto -> 91
    //   136: aload_3
    //   137: aload_0
    //   138: getfield ae0 : Ljava/lang/String;
    //   141: iload #5
    //   143: aload_0
    //   144: getfield Qq : I
    //   147: invokevirtual substring : (II)Ljava/lang/String;
    //   150: invokevirtual intern : ()Ljava/lang/String;
    //   153: invokestatic F10 : (Ljava/lang/String;)Lf/Ll;
    //   156: invokespecial <init> : (Lf/Ll;)V
    //   159: goto -> 227
    //   162: iload_3
    //   163: bipush #40
    //   165: if_icmpne -> 535
    //   168: aload_0
    //   169: dup
    //   170: dup2
    //   171: getfield Qq : I
    //   174: iconst_1
    //   175: iadd
    //   176: putfield Qq : I
    //   179: invokestatic DQ : (Lf/ru0;)Lf/Nm0;
    //   182: astore_3
    //   183: bipush #41
    //   185: istore #5
    //   187: getfield Qq : I
    //   190: aload_0
    //   191: getfield ae0 : Ljava/lang/String;
    //   194: invokevirtual length : ()I
    //   197: if_icmpge -> 204
    //   200: iconst_1
    //   201: goto -> 205
    //   204: iconst_0
    //   205: ifeq -> 437
    //   208: aload_0
    //   209: invokevirtual Bn : ()C
    //   212: iload #5
    //   214: if_icmpne -> 437
    //   217: aload_0
    //   218: dup
    //   219: getfield Qq : I
    //   222: iconst_1
    //   223: iadd
    //   224: putfield Qq : I
    //   227: aload_0
    //   228: aload_1
    //   229: aload_3
    //   230: dup
    //   231: iload #4
    //   233: putfield vS : Z
    //   236: invokevirtual add : (Ljava/lang/Object;)Z
    //   239: pop
    //   240: invokevirtual At : ()Z
    //   243: ifne -> 249
    //   246: goto -> 541
    //   249: aload_0
    //   250: invokevirtual Bn : ()C
    //   253: istore_3
    //   254: ldc '|+^'
    //   256: iload_3
    //   257: invokevirtual indexOf : (I)I
    //   260: ifge -> 266
    //   263: goto -> 541
    //   266: aload_1
    //   267: invokevirtual size : ()I
    //   270: iconst_1
    //   271: if_icmpne -> 279
    //   274: iload_3
    //   275: istore_2
    //   276: goto -> 424
    //   279: iload_2
    //   280: iload_3
    //   281: if_icmpeq -> 424
    //   284: aload_0
    //   285: getfield Qq : I
    //   288: aload_0
    //   289: getfield ae0 : Ljava/lang/String;
    //   292: invokevirtual length : ()I
    //   295: if_icmpge -> 302
    //   298: iconst_1
    //   299: goto -> 303
    //   302: iconst_0
    //   303: ifeq -> 327
    //   306: aload_0
    //   307: invokevirtual Bn : ()C
    //   310: iload_2
    //   311: if_icmpne -> 327
    //   314: aload_0
    //   315: dup
    //   316: getfield Qq : I
    //   319: iconst_1
    //   320: iadd
    //   321: putfield Qq : I
    //   324: goto -> 424
    //   327: aload_0
    //   328: new java/text/ParseException
    //   331: astore_1
    //   332: new java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial <init> : ()V
    //   339: ldc 'Expected ''
    //   341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: iload_2
    //   345: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   348: ldc '' got '
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: astore_2
    //   354: getfield Qq : I
    //   357: aload_0
    //   358: getfield ae0 : Ljava/lang/String;
    //   361: invokevirtual length : ()I
    //   364: if_icmplt -> 373
    //   367: ldc 'end of expression'
    //   369: astore_3
    //   370: goto -> 403
    //   373: ldc '''
    //   375: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: aload_0
    //   379: invokevirtual Bn : ()C
    //   382: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   385: ldc '' at '
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: aload_0
    //   391: getfield Qq : I
    //   394: iconst_1
    //   395: iadd
    //   396: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   399: invokevirtual toString : ()Ljava/lang/String;
    //   402: astore_3
    //   403: aload_1
    //   404: dup
    //   405: aload_0
    //   406: aload_2
    //   407: aload_3
    //   408: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   411: invokevirtual toString : ()Ljava/lang/String;
    //   414: astore_0
    //   415: getfield Qq : I
    //   418: aload_0
    //   419: swap
    //   420: invokespecial <init> : (Ljava/lang/String;I)V
    //   423: athrow
    //   424: aload_0
    //   425: dup
    //   426: getfield Qq : I
    //   429: iconst_1
    //   430: iadd
    //   431: putfield Qq : I
    //   434: goto -> 11
    //   437: aload_0
    //   438: new java/text/ParseException
    //   441: astore_1
    //   442: new java/lang/StringBuilder
    //   445: dup
    //   446: invokespecial <init> : ()V
    //   449: ldc 'Expected ''
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: iload #5
    //   456: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   459: ldc '' got '
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: astore_2
    //   465: getfield Qq : I
    //   468: aload_0
    //   469: getfield ae0 : Ljava/lang/String;
    //   472: invokevirtual length : ()I
    //   475: if_icmplt -> 484
    //   478: ldc 'end of expression'
    //   480: astore_3
    //   481: goto -> 514
    //   484: ldc '''
    //   486: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   489: aload_0
    //   490: invokevirtual Bn : ()C
    //   493: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   496: ldc '' at '
    //   498: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: aload_0
    //   502: getfield Qq : I
    //   505: iconst_1
    //   506: iadd
    //   507: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   510: invokevirtual toString : ()Ljava/lang/String;
    //   513: astore_3
    //   514: aload_1
    //   515: dup
    //   516: aload_0
    //   517: aload_2
    //   518: aload_3
    //   519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: invokevirtual toString : ()Ljava/lang/String;
    //   525: astore_0
    //   526: getfield Qq : I
    //   529: aload_0
    //   530: swap
    //   531: invokespecial <init> : (Ljava/lang/String;I)V
    //   534: athrow
    //   535: iload_3
    //   536: bipush #41
    //   538: if_icmpne -> 622
    //   541: aload_1
    //   542: invokevirtual isEmpty : ()Z
    //   545: ifne -> 616
    //   548: getstatic f/Nm0.wu0 : Z
    //   551: ifne -> 579
    //   554: iload_2
    //   555: bipush #32
    //   557: if_icmpne -> 579
    //   560: aload_1
    //   561: invokevirtual size : ()I
    //   564: iconst_1
    //   565: if_icmpne -> 571
    //   568: goto -> 579
    //   571: new java/lang/AssertionError
    //   574: dup
    //   575: invokespecial <init> : ()V
    //   578: athrow
    //   579: aload_1
    //   580: invokevirtual size : ()I
    //   583: iconst_1
    //   584: if_icmpne -> 596
    //   587: aload_1
    //   588: iconst_0
    //   589: invokevirtual get : (I)Ljava/lang/Object;
    //   592: checkcast f/Nm0
    //   595: areturn
    //   596: new f/YL
    //   599: dup
    //   600: iload_2
    //   601: aload_1
    //   602: iconst_0
    //   603: anewarray f/Nm0
    //   606: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   609: checkcast [Lf/Nm0;
    //   612: invokespecial <init> : (C[Lf/Nm0;)V
    //   615: areturn
    //   616: aload_0
    //   617: invokevirtual ds : ()V
    //   620: aconst_null
    //   621: athrow
    //   622: aload_0
    //   623: invokevirtual ds : ()V
    //   626: aconst_null
    //   627: athrow
    //   628: aload_0
    //   629: invokevirtual ds : ()V
    //   632: aconst_null
    //   633: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 86
    //   #2	-> 92
    //   #3	-> 114
    //   #4	-> 153
    //   #5	-> 187
    //   #6	-> 209
    //   #7	-> 233
    //   #8	-> 285
    //   #9	-> 307
    //   #10	-> 354
    //   #11	-> 373
    //   #12	-> 379
    //   #13	-> 408
    //   #14	-> 426
    //   #15	-> 438
    //   #16	-> 465
    //   #17	-> 484
    //   #18	-> 490
    //   #19	-> 519
    //   #20	-> 542
  }
  
  public abstract boolean aU(fB0 paramfB0);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */