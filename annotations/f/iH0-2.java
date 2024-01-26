package f;

public final class iH0 extends iN {
  public static final float[] vz = new float[] { 
      1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 
      1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F };
  
  public static final eo NY = new eo();
  
  public final s7 cOm1;
  
  public final int QD0;
  
  public final int N1;
  
  public iH0() {
    s7 s71;
    this();
    this.cOm1 = this;
    this.QD0 = 2;
    this.N1 = 5;
  }
  
  public final void set(Nr paramNr, int paramInt, Xw0 paramXw0, b70 paramb70) {
    // Byte code:
    //   0: aload_3
    //   1: getfield kw : Lf/fo0;
    //   4: ifnonnull -> 41
    //   7: aload_1
    //   8: getfield program : Lf/Rm0;
    //   11: aload_1
    //   12: iload_2
    //   13: invokevirtual loc : (I)I
    //   16: istore_0
    //   17: getstatic f/iH0.vz : [F
    //   20: astore_1
    //   21: invokevirtual getClass : ()Ljava/lang/Class;
    //   24: pop
    //   25: getstatic f/UB0.re0 : Lf/hj0;
    //   28: iload_0
    //   29: bipush #6
    //   31: aload_1
    //   32: iconst_0
    //   33: invokeinterface glUniform3fv : (II[FI)V
    //   38: goto -> 591
    //   41: aload #4
    //   43: aload_3
    //   44: getfield kD0 : Lcom/badlogic/gdx/math/Matrix4;
    //   47: getstatic f/iH0.NY : Lf/eo;
    //   50: invokevirtual on0 : (Lf/eo;)Lf/eo;
    //   53: pop
    //   54: getstatic f/qo.iu0 : J
    //   57: dup2
    //   58: lstore #5
    //   60: invokevirtual gV : (J)Z
    //   63: ifeq -> 152
    //   66: aload #4
    //   68: lload #5
    //   70: aload_0
    //   71: getfield cOm1 : Lf/s7;
    //   74: astore_3
    //   75: invokevirtual cOM1 : (J)Lf/dj;
    //   78: checkcast f/qo
    //   81: getfield vF0 : Lcom/badlogic/gdx/graphics/Color;
    //   84: dup
    //   85: dup
    //   86: aload_3
    //   87: invokevirtual getClass : ()Ljava/lang/Class;
    //   90: pop
    //   91: getfield r : F
    //   94: fstore #5
    //   96: getfield g : F
    //   99: fstore #6
    //   101: getfield b : F
    //   104: fstore #7
    //   106: iconst_0
    //   107: istore #8
    //   109: iload #8
    //   111: bipush #18
    //   113: if_icmpge -> 152
    //   116: aload_3
    //   117: getfield Wc0 : [F
    //   120: dup
    //   121: astore #9
    //   123: iload #8
    //   125: aload #9
    //   127: iload #8
    //   129: aload #9
    //   131: iload #8
    //   133: fload #5
    //   135: fastore
    //   136: iconst_1
    //   137: iadd
    //   138: fload #6
    //   140: fastore
    //   141: iconst_2
    //   142: iadd
    //   143: fload #7
    //   145: fastore
    //   146: iinc #8, 3
    //   149: goto -> 109
    //   152: aload #4
    //   154: getstatic f/uu.N1 : J
    //   157: dup2
    //   158: lstore #5
    //   160: invokevirtual gV : (J)Z
    //   163: ifeq -> 292
    //   166: aload_0
    //   167: aload #4
    //   169: lload #5
    //   171: invokevirtual cOM1 : (J)Lf/dj;
    //   174: checkcast f/uu
    //   177: getfield GE : Lf/fQ;
    //   180: astore_3
    //   181: getfield QD0 : I
    //   184: istore #5
    //   186: iload #5
    //   188: aload_3
    //   189: getfield Z8 : I
    //   192: if_icmpge -> 292
    //   195: aload_0
    //   196: getfield cOm1 : Lf/s7;
    //   199: dup
    //   200: astore #6
    //   202: aload_3
    //   203: iload #5
    //   205: aload_3
    //   206: iload #5
    //   208: invokevirtual get : (I)Ljava/lang/Object;
    //   211: checkcast f/vm
    //   214: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
    //   217: astore #7
    //   219: invokevirtual get : (I)Ljava/lang/Object;
    //   222: checkcast f/vm
    //   225: getfield wd : Lf/eo;
    //   228: dup
    //   229: dup
    //   230: aload #7
    //   232: dup
    //   233: dup
    //   234: aload #6
    //   236: invokevirtual getClass : ()Ljava/lang/Class;
    //   239: pop
    //   240: getfield r : F
    //   243: fstore #6
    //   245: getfield g : F
    //   248: fstore #7
    //   250: getfield b : F
    //   253: fstore #8
    //   255: getfield x : F
    //   258: fstore #9
    //   260: getfield y : F
    //   263: fstore #10
    //   265: getfield z : F
    //   268: fstore #11
    //   270: fload #6
    //   272: fload #7
    //   274: fload #8
    //   276: fload #9
    //   278: fload #10
    //   280: fload #11
    //   282: invokevirtual LE0 : (FFFFFF)Lf/s7;
    //   285: pop
    //   286: iinc #5, 1
    //   289: goto -> 186
    //   292: aload #4
    //   294: getstatic f/H60.JM : J
    //   297: dup2
    //   298: lstore #5
    //   300: invokevirtual gV : (J)Z
    //   303: ifeq -> 489
    //   306: aload_0
    //   307: aload #4
    //   309: lload #5
    //   311: invokevirtual cOM1 : (J)Lf/dj;
    //   314: checkcast f/H60
    //   317: getfield O1 : Lf/fQ;
    //   320: astore_3
    //   321: getfield N1 : I
    //   324: istore #4
    //   326: iload #4
    //   328: aload_3
    //   329: getfield Z8 : I
    //   332: if_icmpge -> 489
    //   335: aload_0
    //   336: getfield cOm1 : Lf/s7;
    //   339: dup
    //   340: astore #5
    //   342: aload_3
    //   343: iload #4
    //   345: aload_3
    //   346: iload #4
    //   348: aload_3
    //   349: iload #4
    //   351: invokevirtual get : (I)Ljava/lang/Object;
    //   354: checkcast f/rN
    //   357: getfield sL0 : Lcom/badlogic/gdx/graphics/Color;
    //   360: astore #6
    //   362: invokevirtual get : (I)Ljava/lang/Object;
    //   365: checkcast f/rN
    //   368: getfield BN : Lf/eo;
    //   371: astore #7
    //   373: getstatic f/iH0.NY : Lf/eo;
    //   376: astore #8
    //   378: invokevirtual get : (I)Ljava/lang/Object;
    //   381: checkcast f/rN
    //   384: getfield Mx0 : F
    //   387: aload #8
    //   389: aload #7
    //   391: aload #5
    //   393: invokevirtual getClass : ()Ljava/lang/Class;
    //   396: pop
    //   397: invokevirtual u50 : (Lf/eo;)F
    //   400: fconst_1
    //   401: fadd
    //   402: fdiv
    //   403: fstore #5
    //   405: aload #6
    //   407: getfield r : F
    //   410: fload #5
    //   412: fmul
    //   413: aload #8
    //   415: dup
    //   416: dup
    //   417: aload #6
    //   419: dup
    //   420: getfield g : F
    //   423: fload #5
    //   425: fmul
    //   426: fstore #6
    //   428: getfield b : F
    //   431: fload #5
    //   433: fmul
    //   434: fstore #5
    //   436: getfield x : F
    //   439: aload #7
    //   441: getfield x : F
    //   444: fsub
    //   445: fstore #8
    //   447: getfield y : F
    //   450: aload #7
    //   452: getfield y : F
    //   455: fsub
    //   456: fstore #9
    //   458: getfield z : F
    //   461: aload #7
    //   463: getfield z : F
    //   466: fsub
    //   467: fstore #7
    //   469: fload #6
    //   471: fload #5
    //   473: fload #8
    //   475: fload #9
    //   477: fload #7
    //   479: invokevirtual LE0 : (FFFFFF)Lf/s7;
    //   482: pop
    //   483: iinc #4, 1
    //   486: goto -> 326
    //   489: aload_0
    //   490: getfield cOm1 : Lf/s7;
    //   493: astore_3
    //   494: iconst_0
    //   495: istore #4
    //   497: iload #4
    //   499: aload_3
    //   500: getfield Wc0 : [F
    //   503: dup
    //   504: astore #5
    //   506: arraylength
    //   507: if_icmpge -> 552
    //   510: aload #5
    //   512: iload #4
    //   514: faload
    //   515: dup
    //   516: fstore #6
    //   518: fconst_0
    //   519: fcmpg
    //   520: ifge -> 529
    //   523: fconst_0
    //   524: fstore #6
    //   526: goto -> 539
    //   529: fload #6
    //   531: fconst_1
    //   532: fcmpl
    //   533: ifle -> 539
    //   536: fconst_1
    //   537: fstore #6
    //   539: aload #5
    //   541: iload #4
    //   543: fload #6
    //   545: fastore
    //   546: iinc #4, 1
    //   549: goto -> 497
    //   552: aload_1
    //   553: getfield program : Lf/Rm0;
    //   556: aload_0
    //   557: aload_1
    //   558: iload_2
    //   559: invokevirtual loc : (I)I
    //   562: istore_0
    //   563: getfield cOm1 : Lf/s7;
    //   566: getfield Wc0 : [F
    //   569: dup
    //   570: astore_1
    //   571: arraylength
    //   572: istore_2
    //   573: invokevirtual getClass : ()Ljava/lang/Class;
    //   576: pop
    //   577: getstatic f/UB0.re0 : Lf/hj0;
    //   580: iload_0
    //   581: iload_2
    //   582: iconst_3
    //   583: idiv
    //   584: aload_1
    //   585: iconst_0
    //   586: invokeinterface glUniform3fv : (II[FI)V
    //   591: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 25
    //   #2	-> 44
    //   #3	-> 91
    //   #4	-> 117
    //   #5	-> 154
    //   #6	-> 240
    //   #7	-> 294
    //   #8	-> 397
    //   #9	-> 490
    //   #10	-> 500
    //   #11	-> 506
    //   #12	-> 553
    //   #13	-> 577
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */