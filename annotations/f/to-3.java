package f;

public final class to {
  public final fQ h6;
  
  public final fQ O80;
  
  public to() {
    fQ fQ1;
    this();
    this.h6 = this;
    this();
    this.O80 = this;
  }
  
  public to(RD0 paramRD01, RD0 paramRD02, boolean paramBoolean) {
    fQ fQ1;
    this();
    this.h6 = this;
    this();
    this.O80 = this;
    h7(paramRD01, paramRD02, paramBoolean);
  }
  
  public static int LPt9(String paramString, String[] paramArrayOfString) {
    if (paramString == null)
      return 0; 
    if ((paramString = paramString.trim()).length() == 0)
      return 0; 
    int i;
    if ((i = paramString.indexOf(':')) == -1)
      return 0; 
    paramArrayOfString[0] = paramString.substring(0, i).trim();
    byte b = 1;
    i++;
    while (true) {
      int j;
      if ((j = paramString.indexOf(',', i)) == -1) {
        paramArrayOfString[b] = paramString.substring(i).trim();
        return b;
      } 
      paramArrayOfString[b] = paramString.substring(i, j).trim();
      i = j + 1;
      if (b == 4)
        return 4; 
      b++;
    } 
  }
  
  public final void h7(RD0 paramRD01, RD0 paramRD02, boolean paramBoolean) {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #4
    //   6: new f/f7
    //   9: dup
    //   10: dup
    //   11: dup2
    //   12: dup2
    //   13: astore #5
    //   15: bipush #15
    //   17: ldc 0.99
    //   19: invokespecial <init> : (IF)V
    //   22: new f/U7
    //   25: dup
    //   26: astore #6
    //   28: aload #4
    //   30: invokespecial <init> : ([Ljava/lang/String;)V
    //   33: ldc 'size'
    //   35: aload #6
    //   37: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   40: pop
    //   41: new f/f90
    //   44: dup
    //   45: astore #6
    //   47: aload #4
    //   49: invokespecial <init> : ([Ljava/lang/String;)V
    //   52: ldc 'format'
    //   54: aload #6
    //   56: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: new f/uJ
    //   63: dup
    //   64: astore #6
    //   66: aload #4
    //   68: invokespecial <init> : ([Ljava/lang/String;)V
    //   71: ldc 'filter'
    //   73: aload #6
    //   75: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   78: pop
    //   79: new f/P60
    //   82: dup
    //   83: astore #6
    //   85: aload #4
    //   87: invokespecial <init> : ([Ljava/lang/String;)V
    //   90: ldc 'repeat'
    //   92: aload #6
    //   94: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   97: pop
    //   98: new f/mA0
    //   101: dup
    //   102: astore #6
    //   104: aload #4
    //   106: invokespecial <init> : ([Ljava/lang/String;)V
    //   109: ldc 'pma'
    //   111: aload #6
    //   113: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: iconst_1
    //   118: newarray boolean
    //   120: dup
    //   121: astore #6
    //   123: iconst_0
    //   124: iconst_0
    //   125: bastore
    //   126: new f/f7
    //   129: dup
    //   130: dup2
    //   131: dup2
    //   132: dup2
    //   133: dup2
    //   134: astore #7
    //   136: bipush #127
    //   138: ldc 0.99
    //   140: invokespecial <init> : (IF)V
    //   143: new f/jW
    //   146: dup
    //   147: astore #8
    //   149: aload #4
    //   151: invokespecial <init> : ([Ljava/lang/String;)V
    //   154: ldc 'xy'
    //   156: aload #8
    //   158: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: new f/if0
    //   165: dup
    //   166: astore #8
    //   168: aload #4
    //   170: invokespecial <init> : ([Ljava/lang/String;)V
    //   173: ldc 'size'
    //   175: aload #8
    //   177: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   180: pop
    //   181: new f/Wy0
    //   184: dup
    //   185: astore #8
    //   187: aload #4
    //   189: invokespecial <init> : ([Ljava/lang/String;)V
    //   192: ldc 'bounds'
    //   194: aload #8
    //   196: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   199: pop
    //   200: new f/Ak0
    //   203: dup
    //   204: astore #8
    //   206: aload #4
    //   208: invokespecial <init> : ([Ljava/lang/String;)V
    //   211: ldc 'offset'
    //   213: aload #8
    //   215: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: new f/l40
    //   222: dup
    //   223: astore #8
    //   225: aload #4
    //   227: invokespecial <init> : ([Ljava/lang/String;)V
    //   230: ldc 'orig'
    //   232: aload #8
    //   234: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   237: pop
    //   238: new f/WR
    //   241: dup
    //   242: astore #8
    //   244: aload #4
    //   246: invokespecial <init> : ([Ljava/lang/String;)V
    //   249: ldc 'offsets'
    //   251: aload #8
    //   253: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   256: pop
    //   257: new f/le0
    //   260: dup
    //   261: astore #8
    //   263: aload #4
    //   265: invokespecial <init> : ([Ljava/lang/String;)V
    //   268: ldc 'rotate'
    //   270: aload #8
    //   272: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   275: pop
    //   276: new f/kX
    //   279: dup
    //   280: astore #8
    //   282: aload #4
    //   284: aload #6
    //   286: invokespecial <init> : ([Ljava/lang/String;[Z)V
    //   289: ldc 'index'
    //   291: aload #8
    //   293: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   296: pop
    //   297: new java/io/BufferedReader
    //   300: dup
    //   301: dup
    //   302: astore #8
    //   304: new java/io/InputStreamReader
    //   307: dup
    //   308: aload_1
    //   309: invokevirtual Yc : ()Ljava/io/InputStream;
    //   312: invokespecial <init> : (Ljava/io/InputStream;)V
    //   315: sipush #1024
    //   318: invokespecial <init> : (Ljava/io/Reader;I)V
    //   321: invokevirtual readLine : ()Ljava/lang/String;
    //   324: astore #9
    //   326: aload #9
    //   328: ifnull -> 350
    //   331: aload #9
    //   333: invokevirtual trim : ()Ljava/lang/String;
    //   336: invokevirtual length : ()I
    //   339: ifne -> 350
    //   342: aload #8
    //   344: invokevirtual readLine : ()Ljava/lang/String;
    //   347: goto -> 324
    //   350: aload #9
    //   352: ifnull -> 392
    //   355: aload #9
    //   357: invokevirtual trim : ()Ljava/lang/String;
    //   360: invokevirtual length : ()I
    //   363: ifne -> 369
    //   366: goto -> 392
    //   369: aload #9
    //   371: aload #4
    //   373: invokestatic LPt9 : (Ljava/lang/String;[Ljava/lang/String;)I
    //   376: ifne -> 382
    //   379: goto -> 392
    //   382: aload #8
    //   384: invokevirtual readLine : ()Ljava/lang/String;
    //   387: astore #9
    //   389: goto -> 350
    //   392: aconst_null
    //   393: astore #10
    //   395: aconst_null
    //   396: astore #11
    //   398: aconst_null
    //   399: astore #12
    //   401: aload #9
    //   403: ifnonnull -> 433
    //   406: aload #6
    //   408: aload #8
    //   410: invokestatic JC0 : (Ljava/io/Closeable;)V
    //   413: iconst_0
    //   414: baload
    //   415: ifeq -> 432
    //   418: aload_0
    //   419: getfield O80 : Lf/fQ;
    //   422: new f/Mi
    //   425: dup
    //   426: invokespecial <init> : ()V
    //   429: invokevirtual sort : (Ljava/util/Comparator;)V
    //   432: return
    //   433: aload #9
    //   435: invokevirtual trim : ()Ljava/lang/String;
    //   438: invokevirtual length : ()I
    //   441: ifne -> 457
    //   444: aload #8
    //   446: aconst_null
    //   447: astore #10
    //   449: invokevirtual readLine : ()Ljava/lang/String;
    //   452: astore #9
    //   454: goto -> 401
    //   457: aload #10
    //   459: ifnonnull -> 540
    //   462: new f/Is
    //   465: dup
    //   466: astore #10
    //   468: aload_2
    //   469: aload #9
    //   471: aload #10
    //   473: invokespecial <init> : ()V
    //   476: invokevirtual f0 : (Ljava/lang/String;)Lf/RD0;
    //   479: putfield DL : Lf/RD0;
    //   482: aload #8
    //   484: invokevirtual readLine : ()Ljava/lang/String;
    //   487: dup
    //   488: astore #9
    //   490: aload #4
    //   492: invokestatic LPt9 : (Ljava/lang/String;[Ljava/lang/String;)I
    //   495: ifne -> 510
    //   498: aload_0
    //   499: getfield h6 : Lf/fQ;
    //   502: aload #10
    //   504: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   507: goto -> 401
    //   510: aload #5
    //   512: aload #4
    //   514: iconst_0
    //   515: aaload
    //   516: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
    //   519: checkcast f/Tc
    //   522: dup
    //   523: astore #9
    //   525: ifnull -> 482
    //   528: aload #9
    //   530: aload #10
    //   532: invokeinterface pK0 : (Ljava/lang/Object;)V
    //   537: goto -> 482
    //   540: iload_3
    //   541: new f/Se0
    //   544: dup
    //   545: astore #13
    //   547: aload #9
    //   549: aload #13
    //   551: aload #10
    //   553: aload #13
    //   555: invokespecial <init> : ()V
    //   558: putfield V10 : Lf/Is;
    //   561: invokevirtual trim : ()Ljava/lang/String;
    //   564: putfield Lk : Ljava/lang/String;
    //   567: ifeq -> 576
    //   570: aload #13
    //   572: iconst_1
    //   573: putfield Sa0 : Z
    //   576: aload #8
    //   578: invokevirtual readLine : ()Ljava/lang/String;
    //   581: dup
    //   582: astore #9
    //   584: aload #4
    //   586: invokestatic LPt9 : (Ljava/lang/String;[Ljava/lang/String;)I
    //   589: dup
    //   590: istore #14
    //   592: ifne -> 692
    //   595: aload #13
    //   597: getfield eq0 : I
    //   600: ifne -> 627
    //   603: aload #13
    //   605: getfield public : I
    //   608: ifne -> 627
    //   611: aload #13
    //   613: dup
    //   614: dup2
    //   615: getfield Q6 : I
    //   618: putfield eq0 : I
    //   621: getfield lI : I
    //   624: putfield public : I
    //   627: aload #11
    //   629: ifnull -> 680
    //   632: aload #11
    //   634: getfield Z8 : I
    //   637: ifle -> 680
    //   640: aload #12
    //   642: aload #11
    //   644: aload #13
    //   646: aload #12
    //   648: aload #13
    //   650: aload #11
    //   652: ldc java/lang/String
    //   654: invokevirtual Ib : (Ljava/lang/Class;)[Ljava/lang/Object;
    //   657: checkcast [Ljava/lang/String;
    //   660: putfield Gu : [Ljava/lang/String;
    //   663: ldc [I
    //   665: invokevirtual Ib : (Ljava/lang/Class;)[Ljava/lang/Object;
    //   668: checkcast [[I
    //   671: putfield m4 : [[I
    //   674: invokevirtual clear : ()V
    //   677: invokevirtual clear : ()V
    //   680: aload_0
    //   681: getfield O80 : Lf/fQ;
    //   684: aload #13
    //   686: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   689: goto -> 401
    //   692: aload #7
    //   694: aload #4
    //   696: iconst_0
    //   697: aaload
    //   698: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
    //   701: checkcast f/Tc
    //   704: dup
    //   705: astore #9
    //   707: ifnull -> 722
    //   710: aload #9
    //   712: aload #13
    //   714: invokeinterface pK0 : (Ljava/lang/Object;)V
    //   719: goto -> 576
    //   722: aload #11
    //   724: ifnonnull -> 749
    //   727: new f/fQ
    //   730: dup
    //   731: astore #11
    //   733: bipush #8
    //   735: invokespecial <init> : (I)V
    //   738: new f/fQ
    //   741: dup
    //   742: astore #12
    //   744: bipush #8
    //   746: invokespecial <init> : (I)V
    //   749: iload #14
    //   751: aload #11
    //   753: aload #4
    //   755: iconst_0
    //   756: aaload
    //   757: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   760: newarray int
    //   762: astore #9
    //   764: iconst_0
    //   765: istore #15
    //   767: iload #15
    //   769: iload #14
    //   771: if_icmpge -> 799
    //   774: aload #9
    //   776: iload #15
    //   778: aload #4
    //   780: iload #15
    //   782: iconst_1
    //   783: iadd
    //   784: dup
    //   785: istore #15
    //   787: aaload
    //   788: invokestatic parseInt : (Ljava/lang/String;)I
    //   791: iastore
    //   792: goto -> 767
    //   795: pop
    //   796: goto -> 767
    //   799: aload #12
    //   801: aload #9
    //   803: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   806: goto -> 576
    //   809: astore_0
    //   810: goto -> 843
    //   813: astore_0
    //   814: new f/JU
    //   817: dup
    //   818: new java/lang/StringBuilder
    //   821: dup
    //   822: invokespecial <init> : ()V
    //   825: ldc_w 'Error reading texture atlas file: '
    //   828: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: aload_1
    //   832: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   835: invokevirtual toString : ()Ljava/lang/String;
    //   838: aload_0
    //   839: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   842: athrow
    //   843: aload_0
    //   844: aload #8
    //   846: invokestatic JC0 : (Ljava/io/Closeable;)V
    //   849: athrow
    // Exception table:
    //   from	to	target	type
    //   321	324	813	java/lang/Exception
    //   321	324	809	finally
    //   331	339	813	java/lang/Exception
    //   331	339	809	finally
    //   342	350	813	java/lang/Exception
    //   342	350	809	finally
    //   355	363	813	java/lang/Exception
    //   355	363	809	finally
    //   369	376	813	java/lang/Exception
    //   369	376	809	finally
    //   382	387	813	java/lang/Exception
    //   382	387	809	finally
    //   433	441	813	java/lang/Exception
    //   433	441	809	finally
    //   449	452	813	java/lang/Exception
    //   449	452	809	finally
    //   462	465	813	java/lang/Exception
    //   462	465	809	finally
    //   468	487	813	java/lang/Exception
    //   468	487	809	finally
    //   490	495	813	java/lang/Exception
    //   490	495	809	finally
    //   498	522	813	java/lang/Exception
    //   498	522	809	finally
    //   528	544	813	java/lang/Exception
    //   528	544	809	finally
    //   547	567	813	java/lang/Exception
    //   547	567	809	finally
    //   570	581	813	java/lang/Exception
    //   570	581	809	finally
    //   584	589	813	java/lang/Exception
    //   584	589	809	finally
    //   595	600	813	java/lang/Exception
    //   595	600	809	finally
    //   603	608	813	java/lang/Exception
    //   603	608	809	finally
    //   611	627	813	java/lang/Exception
    //   611	627	809	finally
    //   632	637	813	java/lang/Exception
    //   632	637	809	finally
    //   640	704	813	java/lang/Exception
    //   640	704	809	finally
    //   710	722	813	java/lang/Exception
    //   710	722	809	finally
    //   727	730	813	java/lang/Exception
    //   727	730	809	finally
    //   733	741	813	java/lang/Exception
    //   733	741	809	finally
    //   744	762	813	java/lang/Exception
    //   744	762	809	finally
    //   787	795	795	java/lang/NumberFormatException
    //   787	795	813	java/lang/Exception
    //   787	795	809	finally
    //   799	809	813	java/lang/Exception
    //   799	809	809	finally
    //   814	843	809	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/to.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */