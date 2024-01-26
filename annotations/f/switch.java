package f;

public final class switch {
  public static switch TK = new switch();
  
  public Wo SA;
  
  public Ut0 kl0 = new Ut0();
  
  public Ut0 dA0 = new Ut0();
  
  public qw0 FK = new qw0();
  
  public byte Dy0 = 0;
  
  public byte LPt4 = 0;
  
  public byte[][] AG0 = new byte[4][4];
  
  public final zh0[] e4(short paramShort, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic Ym0 : (S)S
    //   4: dup
    //   5: istore #4
    //   7: ifle -> 149
    //   10: getstatic f/G00.Av0 : Lf/G00;
    //   13: bipush #10
    //   15: iload #4
    //   17: iconst_0
    //   18: invokevirtual Cx0 : (BIZ)Lf/LJ;
    //   21: dup
    //   22: astore #4
    //   24: instanceof f/Yq0
    //   27: ifeq -> 149
    //   30: aload #4
    //   32: checkcast f/Yq0
    //   35: dup
    //   36: astore_0
    //   37: getfield dw0 : Lf/Ut0;
    //   40: invokevirtual YJ0 : ()[I
    //   43: dup
    //   44: dup
    //   45: astore_1
    //   46: invokestatic sort : ([I)V
    //   49: arraylength
    //   50: dup
    //   51: istore_2
    //   52: anewarray f/U70
    //   55: astore_3
    //   56: iconst_0
    //   57: istore #4
    //   59: iload #4
    //   61: aload_1
    //   62: arraylength
    //   63: if_icmpge -> 90
    //   66: aload_3
    //   67: iload #4
    //   69: aload_0
    //   70: getfield dw0 : Lf/Ut0;
    //   73: aload_1
    //   74: iload #4
    //   76: iaload
    //   77: invokevirtual Z6 : (I)Ljava/lang/Object;
    //   80: checkcast f/U70
    //   83: aastore
    //   84: iinc #4, 1
    //   87: goto -> 59
    //   90: iload_2
    //   91: anewarray f/zh0
    //   94: astore_0
    //   95: iconst_0
    //   96: istore_1
    //   97: iload_1
    //   98: iload_2
    //   99: if_icmpge -> 147
    //   102: aload_0
    //   103: new f/zh0
    //   106: dup
    //   107: astore #4
    //   109: aload_3
    //   110: iload_1
    //   111: aaload
    //   112: dup
    //   113: dup
    //   114: astore #5
    //   116: getfield mv : I
    //   119: istore #6
    //   121: getfield s7 : I
    //   124: istore #7
    //   126: aload #5
    //   128: iconst_0
    //   129: iconst_0
    //   130: iload #6
    //   132: iload #7
    //   134: invokespecial <init> : (Lf/U70;IIII)V
    //   137: iload_1
    //   138: aload #4
    //   140: aastore
    //   141: iinc #1, 1
    //   144: goto -> 97
    //   147: aload_0
    //   148: areturn
    //   149: iload_2
    //   150: ifeq -> 241
    //   153: aload_0
    //   154: getfield dA0 : Lf/Ut0;
    //   157: iload_1
    //   158: iload_3
    //   159: bipush #16
    //   161: ishl
    //   162: ior
    //   163: dup
    //   164: istore_2
    //   165: invokevirtual Z6 : (I)Ljava/lang/Object;
    //   168: checkcast f/Sp0
    //   171: dup
    //   172: astore #4
    //   174: ifnull -> 241
    //   177: aload_0
    //   178: getfield kl0 : Lf/Ut0;
    //   181: iload_2
    //   182: invokevirtual Z6 : (I)Ljava/lang/Object;
    //   185: checkcast [Lf/zh0;
    //   188: ifnull -> 203
    //   191: aload_0
    //   192: getfield kl0 : Lf/Ut0;
    //   195: iload_2
    //   196: invokevirtual Z6 : (I)Ljava/lang/Object;
    //   199: checkcast [Lf/zh0;
    //   202: areturn
    //   203: aload #4
    //   205: aload_0
    //   206: dup
    //   207: getfield Dy0 : B
    //   210: istore #4
    //   212: getfield LPt4 : B
    //   215: iload #4
    //   217: swap
    //   218: invokevirtual VC : (BB)[Lf/zh0;
    //   221: dup
    //   222: astore #4
    //   224: ifnull -> 241
    //   227: aload #4
    //   229: aload_0
    //   230: getfield kl0 : Lf/Ut0;
    //   233: iload_2
    //   234: aload #4
    //   236: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
    //   239: pop
    //   240: areturn
    //   241: iload_3
    //   242: bipush #32
    //   244: iand
    //   245: dup
    //   246: istore_2
    //   247: ifeq -> 256
    //   250: iconst_1
    //   251: istore #4
    //   253: goto -> 259
    //   256: iconst_0
    //   257: istore #4
    //   259: iload_1
    //   260: iload #4
    //   262: iload_3
    //   263: bipush #31
    //   265: iand
    //   266: dup
    //   267: istore #4
    //   269: invokestatic Uw0 : (SZI)S
    //   272: iconst_1
    //   273: isub
    //   274: i2s
    //   275: ifge -> 280
    //   278: aconst_null
    //   279: areturn
    //   280: iload #4
    //   282: iload_1
    //   283: invokestatic NH : (IS)S
    //   286: dup
    //   287: istore #5
    //   289: ifle -> 305
    //   292: aload_0
    //   293: getfield SA : Lf/Wo;
    //   296: iload #5
    //   298: invokevirtual AuX : (S)Lf/IB;
    //   301: astore_0
    //   302: goto -> 352
    //   305: iload_2
    //   306: ifeq -> 314
    //   309: iconst_1
    //   310: istore_2
    //   311: goto -> 316
    //   314: iconst_0
    //   315: istore_2
    //   316: iload_3
    //   317: iload_1
    //   318: iload_2
    //   319: iload #4
    //   321: invokestatic Uw0 : (SZI)S
    //   324: sipush #4095
    //   327: iadd
    //   328: i2s
    //   329: istore_1
    //   330: bipush #64
    //   332: iand
    //   333: ifeq -> 343
    //   336: iload_1
    //   337: sipush #2000
    //   340: iadd
    //   341: i2s
    //   342: istore_1
    //   343: aload_0
    //   344: getfield SA : Lf/Wo;
    //   347: iload_1
    //   348: invokevirtual AuX : (S)Lf/IB;
    //   351: astore_0
    //   352: aload_0
    //   353: getfield w70 : [Lf/U70;
    //   356: arraylength
    //   357: dup
    //   358: istore_1
    //   359: anewarray f/zh0
    //   362: astore_2
    //   363: iconst_0
    //   364: istore_3
    //   365: iload_3
    //   366: iload_1
    //   367: if_icmpge -> 400
    //   370: aload_2
    //   371: iload_3
    //   372: new f/zh0
    //   375: dup
    //   376: astore #4
    //   378: aload_0
    //   379: getfield w70 : [Lf/U70;
    //   382: iload_3
    //   383: aaload
    //   384: iconst_0
    //   385: iconst_0
    //   386: iconst_m1
    //   387: iconst_m1
    //   388: invokespecial <init> : (Lf/U70;IIII)V
    //   391: aload #4
    //   393: aastore
    //   394: iinc #3, 1
    //   397: goto -> 365
    //   400: aload_2
    //   401: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 18
    //   #3	-> 37
    //   #4	-> 40
    //   #5	-> 91
    //   #6	-> 116
    //   #7	-> 121
    //   #8	-> 134
    //   #9	-> 321
    //   #10	-> 344
    //   #11	-> 353
    //   #12	-> 356
    //   #13	-> 379
    //   #14	-> 383
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */