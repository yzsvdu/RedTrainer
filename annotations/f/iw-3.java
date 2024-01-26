package f;

public final class iw {
  public sz0 lPt3;
  
  public final bs fe;
  
  public final EH0 gm0;
  
  public final AF CoN;
  
  public final long rF;
  
  public volatile boolean tI;
  
  public volatile boolean hv0;
  
  public volatile fQ Vr0;
  
  public volatile cd XI;
  
  public volatile cd uj;
  
  public volatile Object Ej;
  
  public volatile boolean z70;
  
  public iw(sz0 paramsz0, bs parambs, EH0 paramEH0, AF paramAF) {
    long l;
    this.lPt3 = paramsz0;
    this.fe = parambs;
    this.gm0 = paramEH0;
    this.CoN = paramAF;
    if (paramsz0.Sw0.sA0() == 3) {
      l = eI0.M90();
    } else {
      l = 0L;
    } 
    this.rF = l;
  }
  
  public static void qx0(fQ paramfQ) {
    boolean bool = paramfQ.Ru;
    paramfQ.Ru = true;
    for (byte b = 0; b < paramfQ.Z8; b++) {
      String str = ((bs)paramfQ.get(b)).bz;
      Class clazz = ((bs)paramfQ.get(b)).RA0;
      for (int i = paramfQ.Z8 - 1; i > b; i--) {
        if (clazz == ((bs)paramfQ.get(i)).RA0 && str.equals(((bs)paramfQ.get(i)).bz))
          paramfQ.Hc(i); 
      } 
    } 
    paramfQ.Ru = bool;
  }
  
  public final boolean Jd0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield gm0 : Lf/EH0;
    //   4: dup
    //   5: astore_1
    //   6: instanceof f/bB
    //   9: ifeq -> 195
    //   12: aload_0
    //   13: aload_1
    //   14: checkcast f/bB
    //   17: astore_1
    //   18: getfield hv0 : Z
    //   21: ifne -> 126
    //   24: aload_0
    //   25: dup
    //   26: dup
    //   27: iconst_1
    //   28: putfield hv0 : Z
    //   31: getfield fe : Lf/bs;
    //   34: dup
    //   35: astore_2
    //   36: getfield bz : Ljava/lang/String;
    //   39: astore_3
    //   40: getfield gm0 : Lf/EH0;
    //   43: astore #4
    //   45: aload_2
    //   46: getfield b7 : Lf/RD0;
    //   49: ifnonnull -> 62
    //   52: aload_2
    //   53: aload #4
    //   55: aload_3
    //   56: invokevirtual resolve : (Ljava/lang/String;)Lf/RD0;
    //   59: putfield b7 : Lf/RD0;
    //   62: aload_0
    //   63: dup
    //   64: aload_1
    //   65: aload_3
    //   66: aload_0
    //   67: aload_2
    //   68: getfield b7 : Lf/RD0;
    //   71: astore_2
    //   72: getfield fe : Lf/bs;
    //   75: getfield Rs : Lf/wP;
    //   78: aload_2
    //   79: swap
    //   80: invokevirtual getDependencies : (Ljava/lang/String;Lf/RD0;Lf/wP;)Lf/fQ;
    //   83: putfield Vr0 : Lf/fQ;
    //   86: getfield Vr0 : Lf/fQ;
    //   89: ifnonnull -> 95
    //   92: goto -> 126
    //   95: aload_0
    //   96: dup
    //   97: getfield Vr0 : Lf/fQ;
    //   100: invokestatic qx0 : (Lf/fQ;)V
    //   103: getfield lPt3 : Lf/sz0;
    //   106: aload_0
    //   107: dup
    //   108: getfield fe : Lf/bs;
    //   111: getfield bz : Ljava/lang/String;
    //   114: astore_1
    //   115: getfield Vr0 : Lf/fQ;
    //   118: aload_1
    //   119: swap
    //   120: invokevirtual Pb : (Ljava/lang/String;Lf/fQ;)V
    //   123: goto -> 626
    //   126: aload_0
    //   127: dup
    //   128: dup
    //   129: getfield lPt3 : Lf/sz0;
    //   132: astore_2
    //   133: getfield fe : Lf/bs;
    //   136: dup
    //   137: astore_3
    //   138: getfield bz : Ljava/lang/String;
    //   141: astore #4
    //   143: getfield gm0 : Lf/EH0;
    //   146: astore #5
    //   148: aload_3
    //   149: getfield b7 : Lf/RD0;
    //   152: ifnonnull -> 166
    //   155: aload_3
    //   156: aload #5
    //   158: aload #4
    //   160: invokevirtual resolve : (Ljava/lang/String;)Lf/RD0;
    //   163: putfield b7 : Lf/RD0;
    //   166: aload_0
    //   167: aload_1
    //   168: aload_2
    //   169: aload_0
    //   170: aload_3
    //   171: getfield b7 : Lf/RD0;
    //   174: astore_1
    //   175: getfield fe : Lf/bs;
    //   178: getfield Rs : Lf/wP;
    //   181: astore_2
    //   182: aload #4
    //   184: aload_1
    //   185: aload_2
    //   186: invokevirtual oH : (Lf/sz0;Ljava/lang/String;Lf/RD0;Lf/wP;)Ljava/lang/Object;
    //   189: putfield Ej : Ljava/lang/Object;
    //   192: goto -> 626
    //   195: aload_0
    //   196: aload_1
    //   197: checkcast f/Ar0
    //   200: astore_1
    //   201: getfield hv0 : Z
    //   204: ifne -> 365
    //   207: aload_0
    //   208: getfield XI : Lf/cd;
    //   211: ifnonnull -> 272
    //   214: aload_0
    //   215: getfield CoN : Lf/AF;
    //   218: dup
    //   219: astore_1
    //   220: getfield qj : Ljava/util/concurrent/ExecutorService;
    //   223: invokeinterface isShutdown : ()Z
    //   228: ifne -> 262
    //   231: aload_0
    //   232: new f/cd
    //   235: dup
    //   236: aload_1
    //   237: getfield qj : Ljava/util/concurrent/ExecutorService;
    //   240: new f/y50
    //   243: dup
    //   244: aload_0
    //   245: invokespecial <init> : (Lf/iw;)V
    //   248: invokeinterface submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   253: invokespecial <init> : (Ljava/util/concurrent/Future;)V
    //   256: putfield XI : Lf/cd;
    //   259: goto -> 626
    //   262: new f/JU
    //   265: dup
    //   266: ldc 'Cannot run tasks on an executor that has been shutdown (disposed)'
    //   268: invokespecial <init> : (Ljava/lang/String;)V
    //   271: athrow
    //   272: aload_0
    //   273: getfield XI : Lf/cd;
    //   276: getfield z8 : Ljava/util/concurrent/Future;
    //   279: invokeinterface isDone : ()Z
    //   284: ifeq -> 626
    //   287: aload_0
    //   288: getfield XI : Lf/cd;
    //   291: dup
    //   292: invokevirtual getClass : ()Ljava/lang/Class;
    //   295: pop
    //   296: getfield z8 : Ljava/util/concurrent/Future;
    //   299: invokeinterface get : ()Ljava/lang/Object;
    //   304: pop
    //   305: goto -> 322
    //   308: astore_1
    //   309: new f/JU
    //   312: dup
    //   313: aload_1
    //   314: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   317: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   320: athrow
    //   321: pop
    //   322: aload_0
    //   323: dup
    //   324: iconst_1
    //   325: putfield hv0 : Z
    //   328: getfield tI : Z
    //   331: ifeq -> 626
    //   334: goto -> 444
    //   337: astore_1
    //   338: new f/JU
    //   341: dup
    //   342: ldc 'Couldn't load dependencies of asset: '
    //   344: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: aload_0
    //   348: getfield fe : Lf/bs;
    //   351: getfield bz : Ljava/lang/String;
    //   354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: invokevirtual toString : ()Ljava/lang/String;
    //   360: aload_1
    //   361: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   364: athrow
    //   365: aload_0
    //   366: getfield uj : Lf/cd;
    //   369: ifnonnull -> 437
    //   372: aload_0
    //   373: getfield tI : Z
    //   376: ifne -> 437
    //   379: aload_0
    //   380: getfield CoN : Lf/AF;
    //   383: dup
    //   384: astore_1
    //   385: getfield qj : Ljava/util/concurrent/ExecutorService;
    //   388: invokeinterface isShutdown : ()Z
    //   393: ifne -> 427
    //   396: aload_0
    //   397: new f/cd
    //   400: dup
    //   401: aload_1
    //   402: getfield qj : Ljava/util/concurrent/ExecutorService;
    //   405: new f/y50
    //   408: dup
    //   409: aload_0
    //   410: invokespecial <init> : (Lf/iw;)V
    //   413: invokeinterface submit : (Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    //   418: invokespecial <init> : (Ljava/util/concurrent/Future;)V
    //   421: putfield uj : Lf/cd;
    //   424: goto -> 626
    //   427: new f/JU
    //   430: dup
    //   431: ldc 'Cannot run tasks on an executor that has been shutdown (disposed)'
    //   433: invokespecial <init> : (Ljava/lang/String;)V
    //   436: athrow
    //   437: aload_0
    //   438: getfield tI : Z
    //   441: ifeq -> 487
    //   444: aload_0
    //   445: dup
    //   446: dup
    //   447: getfield lPt3 : Lf/sz0;
    //   450: astore_2
    //   451: getfield fe : Lf/bs;
    //   454: dup
    //   455: astore_3
    //   456: getfield bz : Ljava/lang/String;
    //   459: astore #4
    //   461: getfield gm0 : Lf/EH0;
    //   464: astore #5
    //   466: aload_3
    //   467: getfield b7 : Lf/RD0;
    //   470: ifnonnull -> 569
    //   473: aload_3
    //   474: aload #5
    //   476: aload #4
    //   478: invokevirtual resolve : (Ljava/lang/String;)Lf/RD0;
    //   481: putfield b7 : Lf/RD0;
    //   484: goto -> 569
    //   487: aload_0
    //   488: getfield uj : Lf/cd;
    //   491: getfield z8 : Ljava/util/concurrent/Future;
    //   494: invokeinterface isDone : ()Z
    //   499: ifeq -> 626
    //   502: aload_0
    //   503: getfield uj : Lf/cd;
    //   506: dup
    //   507: invokevirtual getClass : ()Ljava/lang/Class;
    //   510: pop
    //   511: getfield z8 : Ljava/util/concurrent/Future;
    //   514: invokeinterface get : ()Ljava/lang/Object;
    //   519: pop
    //   520: goto -> 537
    //   523: astore_1
    //   524: new f/JU
    //   527: dup
    //   528: aload_1
    //   529: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   532: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   535: athrow
    //   536: pop
    //   537: aload_0
    //   538: dup
    //   539: dup
    //   540: getfield lPt3 : Lf/sz0;
    //   543: astore_2
    //   544: getfield fe : Lf/bs;
    //   547: dup
    //   548: astore_3
    //   549: getfield bz : Ljava/lang/String;
    //   552: astore #4
    //   554: getfield gm0 : Lf/EH0;
    //   557: astore #5
    //   559: aload_3
    //   560: getfield b7 : Lf/RD0;
    //   563: ifnonnull -> 569
    //   566: goto -> 473
    //   569: aload_0
    //   570: aload_1
    //   571: aload_2
    //   572: aload_0
    //   573: aload_3
    //   574: getfield b7 : Lf/RD0;
    //   577: astore_1
    //   578: getfield fe : Lf/bs;
    //   581: getfield Rs : Lf/wP;
    //   584: astore_2
    //   585: aload #4
    //   587: aload_1
    //   588: aload_2
    //   589: invokevirtual loadSync : (Lf/sz0;Ljava/lang/String;Lf/RD0;Lf/wP;)Ljava/lang/Object;
    //   592: putfield Ej : Ljava/lang/Object;
    //   595: goto -> 626
    //   598: astore_1
    //   599: new f/JU
    //   602: dup
    //   603: ldc 'Couldn't load asset: '
    //   605: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   608: aload_0
    //   609: getfield fe : Lf/bs;
    //   612: getfield bz : Ljava/lang/String;
    //   615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: invokevirtual toString : ()Ljava/lang/String;
    //   621: aload_1
    //   622: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   625: athrow
    //   626: aload_0
    //   627: getfield Ej : Ljava/lang/Object;
    //   630: ifnull -> 637
    //   633: iconst_1
    //   634: goto -> 638
    //   637: iconst_0
    //   638: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 14
    //   #2	-> 46
    //   #3	-> 72
    //   #4	-> 149
    //   #5	-> 175
    //   #6	-> 197
    //   #7	-> 220
    //   #8	-> 223
    //   #9	-> 256
    //   #10	-> 262
    //   #11	-> 273
    //   #12	-> 276
    //   #13	-> 279
    //   #14	-> 288
    //   #15	-> 296
    //   #16	-> 325
    //   #17	-> 342
    //   #18	-> 348
    //   #19	-> 385
    //   #20	-> 388
    //   #21	-> 421
    //   #22	-> 427
    //   #23	-> 438
    //   #24	-> 467
    //   #25	-> 488
    //   #26	-> 491
    //   #27	-> 494
    //   #28	-> 503
    //   #29	-> 511
    //   #30	-> 540
    //   #31	-> 560
    //   #32	-> 578
    //   #33	-> 603
    //   #34	-> 609
    //   #35	-> 627
    // Exception table:
    //   from	to	target	type
    //   287	295	337	java/lang/Exception
    //   296	304	321	java/lang/InterruptedException
    //   296	304	308	java/util/concurrent/ExecutionException
    //   296	304	337	java/lang/Exception
    //   309	321	337	java/lang/Exception
    //   502	510	598	java/lang/Exception
    //   511	519	536	java/lang/InterruptedException
    //   511	519	523	java/util/concurrent/ExecutionException
    //   511	519	598	java/lang/Exception
    //   524	536	598	java/lang/Exception
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iw.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */