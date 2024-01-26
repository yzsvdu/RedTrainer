package f;

public abstract class B70 extends JG0 {
  public boolean FY = true;
  
  public int RQ = 1;
  
  public int e4;
  
  public int Mn0;
  
  public int p70;
  
  public int UD0;
  
  public int sh;
  
  public int pb;
  
  public boolean i2(oa0 paramoa0) {
    // Byte code:
    //   0: aload_1
    //   1: getfield cz0 : I
    //   4: invokestatic Pg : (I)Z
    //   7: ifeq -> 22
    //   10: aload_1
    //   11: getfield vl : I
    //   14: iflt -> 22
    //   17: aload_0
    //   18: invokevirtual BA : ()Z
    //   21: pop
    //   22: aload_0
    //   23: getfield RQ : I
    //   26: iconst_1
    //   27: dup
    //   28: istore_2
    //   29: if_icmpeq -> 361
    //   32: aload_1
    //   33: invokevirtual Ud : ()Z
    //   36: ifeq -> 47
    //   39: aload_0
    //   40: iload_2
    //   41: putfield RQ : I
    //   44: goto -> 359
    //   47: aload_1
    //   48: getfield cz0 : I
    //   51: bipush #6
    //   53: if_icmpne -> 359
    //   56: aload_0
    //   57: dup
    //   58: dup
    //   59: dup2
    //   60: dup2
    //   61: aload_1
    //   62: dup
    //   63: getfield aK : I
    //   66: aload_0
    //   67: getfield e4 : I
    //   70: isub
    //   71: istore_1
    //   72: getfield gk0 : I
    //   75: aload_0
    //   76: getfield Mn0 : I
    //   79: isub
    //   80: istore_2
    //   81: invokevirtual AW : ()I
    //   84: pop
    //   85: invokevirtual HY : ()I
    //   88: pop
    //   89: getfield p70 : I
    //   92: istore_3
    //   93: getfield UD0 : I
    //   96: istore #4
    //   98: getfield sh : I
    //   101: istore #5
    //   103: getfield pb : I
    //   106: istore #6
    //   108: getfield fr0 : Lf/JG0;
    //   111: dup
    //   112: astore #7
    //   114: ifnull -> 179
    //   117: aload_0
    //   118: aload #7
    //   120: invokevirtual RS : ()I
    //   123: istore #7
    //   125: getfield fr0 : Lf/JG0;
    //   128: invokevirtual m40 : ()I
    //   131: dup
    //   132: istore #8
    //   134: iload #7
    //   136: dup
    //   137: iload #8
    //   139: aload_0
    //   140: getfield sh : I
    //   143: aload_0
    //   144: getfield p70 : I
    //   147: isub
    //   148: dup
    //   149: istore #7
    //   151: isub
    //   152: iload_3
    //   153: iload_1
    //   154: iadd
    //   155: invokestatic min : (II)I
    //   158: invokestatic max : (II)I
    //   161: istore_3
    //   162: iload #7
    //   164: iadd
    //   165: iload #5
    //   167: iload_1
    //   168: iadd
    //   169: invokestatic max : (II)I
    //   172: invokestatic min : (II)I
    //   175: istore_1
    //   176: goto -> 188
    //   179: iload #5
    //   181: iload_3
    //   182: iload_1
    //   183: iadd
    //   184: istore_3
    //   185: iload_1
    //   186: iadd
    //   187: istore_1
    //   188: aload_0
    //   189: getfield fr0 : Lf/JG0;
    //   192: dup
    //   193: astore #5
    //   195: ifnull -> 262
    //   198: aload_0
    //   199: aload #5
    //   201: invokevirtual e3 : ()I
    //   204: istore #5
    //   206: getfield fr0 : Lf/JG0;
    //   209: invokevirtual mD : ()I
    //   212: dup
    //   213: istore #7
    //   215: iload #5
    //   217: dup
    //   218: iload #7
    //   220: aload_0
    //   221: getfield pb : I
    //   224: aload_0
    //   225: getfield UD0 : I
    //   228: isub
    //   229: dup
    //   230: istore #5
    //   232: isub
    //   233: iload #4
    //   235: iload_2
    //   236: iadd
    //   237: invokestatic min : (II)I
    //   240: invokestatic max : (II)I
    //   243: istore #4
    //   245: iload #5
    //   247: iadd
    //   248: iload #6
    //   250: iload_2
    //   251: iadd
    //   252: invokestatic max : (II)I
    //   255: invokestatic min : (II)I
    //   258: istore_2
    //   259: goto -> 273
    //   262: iload #6
    //   264: iload #4
    //   266: iload_2
    //   267: iadd
    //   268: istore #4
    //   270: iload_2
    //   271: iadd
    //   272: istore_2
    //   273: aload_0
    //   274: getfield fr0 : Lf/JG0;
    //   277: dup
    //   278: astore #5
    //   280: ifnull -> 325
    //   283: iload_2
    //   284: aload #5
    //   286: iload_1
    //   287: aload #5
    //   289: iload_3
    //   290: aload #5
    //   292: iload #4
    //   294: aload #5
    //   296: invokevirtual e3 : ()I
    //   299: invokestatic max : (II)I
    //   302: istore #4
    //   304: invokevirtual RS : ()I
    //   307: invokestatic max : (II)I
    //   310: istore_3
    //   311: invokevirtual m40 : ()I
    //   314: invokestatic min : (II)I
    //   317: istore_1
    //   318: invokevirtual mD : ()I
    //   321: invokestatic min : (II)I
    //   324: istore_2
    //   325: aload_0
    //   326: dup
    //   327: dup
    //   328: iload_3
    //   329: iload #4
    //   331: invokevirtual ME : (II)Z
    //   334: pop
    //   335: invokevirtual AW : ()I
    //   338: iload_1
    //   339: iload_3
    //   340: isub
    //   341: invokestatic max : (II)I
    //   344: aload_0
    //   345: invokevirtual HY : ()I
    //   348: iload_2
    //   349: iload #4
    //   351: isub
    //   352: invokestatic max : (II)I
    //   355: invokevirtual Tm : (II)Z
    //   358: pop
    //   359: iconst_1
    //   360: ireturn
    //   361: aload_1
    //   362: getfield Ua : Z
    //   365: ifne -> 627
    //   368: aload_1
    //   369: getfield cz0 : I
    //   372: iconst_3
    //   373: if_icmpne -> 627
    //   376: aload_1
    //   377: getfield vl : I
    //   380: ifne -> 627
    //   383: aload_1
    //   384: getfield aK : I
    //   387: dup
    //   388: istore_3
    //   389: aload_0
    //   390: dup
    //   391: dup
    //   392: dup2
    //   393: dup2
    //   394: dup2
    //   395: dup2
    //   396: iload_3
    //   397: aload_1
    //   398: getfield gk0 : I
    //   401: istore #4
    //   403: putfield e4 : I
    //   406: iload #4
    //   408: putfield Mn0 : I
    //   411: getfield Kd : I
    //   414: putfield p70 : I
    //   417: getfield er0 : I
    //   420: putfield UD0 : I
    //   423: invokevirtual Xq : ()I
    //   426: putfield sh : I
    //   429: invokevirtual yR : ()I
    //   432: putfield pb : I
    //   435: invokevirtual RS : ()I
    //   438: if_icmpge -> 447
    //   441: iconst_1
    //   442: istore #5
    //   444: goto -> 450
    //   447: iconst_0
    //   448: istore #5
    //   450: iload_3
    //   451: aload_0
    //   452: invokevirtual m40 : ()I
    //   455: if_icmplt -> 464
    //   458: iconst_1
    //   459: istore #6
    //   461: goto -> 467
    //   464: iconst_0
    //   465: istore #6
    //   467: iload #4
    //   469: aload_0
    //   470: invokevirtual mD : ()I
    //   473: if_icmplt -> 482
    //   476: iconst_1
    //   477: istore #7
    //   479: goto -> 485
    //   482: iconst_0
    //   483: istore #7
    //   485: aload_0
    //   486: iload_3
    //   487: iload #4
    //   489: invokevirtual mu0 : (II)Z
    //   492: ifeq -> 508
    //   495: aload_0
    //   496: getfield FY : Z
    //   499: ifeq -> 605
    //   502: bipush #10
    //   504: istore_3
    //   505: goto -> 607
    //   508: iload #4
    //   510: aload_0
    //   511: getfield er0 : I
    //   514: if_icmpge -> 522
    //   517: iconst_1
    //   518: istore_3
    //   519: goto -> 524
    //   522: iconst_0
    //   523: istore_3
    //   524: iload #5
    //   526: ifeq -> 555
    //   529: iload_3
    //   530: ifeq -> 539
    //   533: bipush #6
    //   535: istore_3
    //   536: goto -> 607
    //   539: iload #7
    //   541: ifeq -> 550
    //   544: bipush #9
    //   546: istore_3
    //   547: goto -> 607
    //   550: iconst_2
    //   551: istore_3
    //   552: goto -> 607
    //   555: iload #6
    //   557: ifeq -> 586
    //   560: iload_3
    //   561: ifeq -> 570
    //   564: bipush #7
    //   566: istore_3
    //   567: goto -> 607
    //   570: iload #7
    //   572: ifeq -> 581
    //   575: bipush #8
    //   577: istore_3
    //   578: goto -> 607
    //   581: iconst_4
    //   582: istore_3
    //   583: goto -> 607
    //   586: iload_3
    //   587: ifeq -> 595
    //   590: iconst_3
    //   591: istore_3
    //   592: goto -> 607
    //   595: iload #7
    //   597: ifeq -> 605
    //   600: iconst_5
    //   601: istore_3
    //   602: goto -> 607
    //   605: iload_2
    //   606: istore_3
    //   607: iload_3
    //   608: aload_0
    //   609: iload_3
    //   610: putfield RQ : I
    //   613: iload_2
    //   614: if_icmpeq -> 621
    //   617: iconst_1
    //   618: goto -> 622
    //   621: iconst_0
    //   622: ifeq -> 627
    //   625: iconst_1
    //   626: ireturn
    //   627: aload_0
    //   628: aload_1
    //   629: invokespecial i2 : (Lf/oa0;)Z
    //   632: ifeq -> 637
    //   635: iconst_1
    //   636: ireturn
    //   637: aload_1
    //   638: getfield cz0 : I
    //   641: invokestatic Pg : (I)Z
    //   644: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 4
    //   #3	-> 11
    //   #4	-> 18
    //   #5	-> 48
    //   #6	-> 63
    //   #7	-> 67
    //   #8	-> 72
    //   #9	-> 76
    //   #10	-> 108
    //   #11	-> 120
    //   #12	-> 125
    //   #13	-> 128
    //   #14	-> 189
    //   #15	-> 201
    //   #16	-> 206
    //   #17	-> 209
    //   #18	-> 274
    //   #19	-> 296
    //   #20	-> 331
    //   #21	-> 335
    //   #22	-> 362
    //   #23	-> 369
    //   #24	-> 377
    //   #25	-> 384
    //   #26	-> 398
    //   #27	-> 403
    //   #28	-> 411
    //   #29	-> 414
    //   #30	-> 417
    //   #31	-> 420
    //   #32	-> 435
    //   #33	-> 511
    //   #34	-> 610
    //   #35	-> 629
    //   #36	-> 638
  }
  
  public final void b7(boolean paramBoolean) {
    this.FY = paramBoolean;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */