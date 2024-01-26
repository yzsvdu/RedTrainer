package f;

public final class dF0 extends GS implements Np0 {
  public final Ht0 VT;
  
  public final Ht0 bG0;
  
  public final short Li0;
  
  public dF0(Ht0 paramHt01, Ht0 paramHt02, short paramShort) {
    this.VT = paramHt01;
    this.bG0 = paramHt02;
    this.Li0 = paramShort;
  }
  
  public final byte YG0() {
    return 62;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_0
    //   6: getfield Li0 : S
    //   9: dup
    //   10: istore_3
    //   11: ifge -> 155
    //   14: iload_3
    //   15: iconst_m1
    //   16: imul
    //   17: i2s
    //   18: dup
    //   19: istore_1
    //   20: sipush #161
    //   23: if_icmpeq -> 304
    //   26: iload_1
    //   27: sipush #521
    //   30: if_icmpeq -> 94
    //   33: aload #7
    //   35: dup
    //   36: getstatic f/F40.ef0 : Lf/F40;
    //   39: astore_1
    //   40: bipush #14
    //   42: istore_3
    //   43: getfield AD : Lf/Gp0;
    //   46: sipush #896
    //   49: aload_2
    //   50: invokevirtual ex : (ILf/hm0;)I
    //   53: istore #4
    //   55: iconst_2
    //   56: anewarray java/lang/String
    //   59: dup
    //   60: astore #5
    //   62: aload_0
    //   63: aload #5
    //   65: aload_2
    //   66: invokevirtual fA : ()Ljava/lang/String;
    //   69: iconst_0
    //   70: swap
    //   71: aastore
    //   72: getfield VT : Lf/Ht0;
    //   75: invokevirtual mn0 : ()Ljava/lang/String;
    //   78: iconst_1
    //   79: swap
    //   80: aastore
    //   81: iconst_2
    //   82: aload_1
    //   83: iload_3
    //   84: iload #4
    //   86: aload #5
    //   88: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   91: goto -> 220
    //   94: aload #7
    //   96: dup
    //   97: getstatic f/F40.ef0 : Lf/F40;
    //   100: astore_1
    //   101: bipush #14
    //   103: istore_3
    //   104: getfield AD : Lf/Gp0;
    //   107: sipush #896
    //   110: aload_2
    //   111: invokevirtual ex : (ILf/hm0;)I
    //   114: istore #4
    //   116: iconst_2
    //   117: anewarray java/lang/String
    //   120: dup
    //   121: astore #5
    //   123: aload_0
    //   124: aload #5
    //   126: aload_2
    //   127: invokevirtual fA : ()Ljava/lang/String;
    //   130: iconst_0
    //   131: swap
    //   132: aastore
    //   133: getfield bG0 : Lf/Ht0;
    //   136: invokevirtual mn0 : ()Ljava/lang/String;
    //   139: iconst_1
    //   140: swap
    //   141: aastore
    //   142: iconst_2
    //   143: aload_1
    //   144: iload_3
    //   145: iload #4
    //   147: aload #5
    //   149: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   152: goto -> 220
    //   155: iload_3
    //   156: sipush #513
    //   159: if_icmpeq -> 226
    //   162: aload #7
    //   164: dup
    //   165: getstatic f/F40.ef0 : Lf/F40;
    //   168: astore_1
    //   169: bipush #14
    //   171: istore_3
    //   172: getfield AD : Lf/Gp0;
    //   175: sipush #896
    //   178: aload_2
    //   179: invokevirtual ex : (ILf/hm0;)I
    //   182: istore #4
    //   184: iconst_2
    //   185: anewarray java/lang/String
    //   188: dup
    //   189: astore #5
    //   191: aload_0
    //   192: aload #5
    //   194: aload_2
    //   195: invokevirtual fA : ()Ljava/lang/String;
    //   198: iconst_0
    //   199: swap
    //   200: aastore
    //   201: getfield VT : Lf/Ht0;
    //   204: invokevirtual mn0 : ()Ljava/lang/String;
    //   207: iconst_1
    //   208: swap
    //   209: aastore
    //   210: iconst_2
    //   211: aload_1
    //   212: iload_3
    //   213: iload #4
    //   215: aload #5
    //   217: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   220: invokevirtual Kq : (Ljava/lang/String;)V
    //   223: goto -> 304
    //   226: aload_1
    //   227: aload #7
    //   229: getstatic f/F40.ef0 : Lf/F40;
    //   232: astore_3
    //   233: bipush #14
    //   235: istore #4
    //   237: getfield AD : Lf/Gp0;
    //   240: sipush #1089
    //   243: aload_1
    //   244: aload_2
    //   245: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   248: istore #5
    //   250: iconst_2
    //   251: anewarray java/lang/String
    //   254: astore #6
    //   256: iconst_0
    //   257: istore #8
    //   259: ifnonnull -> 268
    //   262: ldc ''
    //   264: astore_1
    //   265: goto -> 273
    //   268: aload_1
    //   269: invokevirtual fA : ()Ljava/lang/String;
    //   272: astore_1
    //   273: aload #7
    //   275: aload #6
    //   277: aload_2
    //   278: aload #6
    //   280: iload #8
    //   282: aload_1
    //   283: aastore
    //   284: invokevirtual fA : ()Ljava/lang/String;
    //   287: iconst_1
    //   288: swap
    //   289: aastore
    //   290: iconst_2
    //   291: aload_3
    //   292: iload #4
    //   294: iload #5
    //   296: aload #6
    //   298: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   301: goto -> 220
    //   304: aload #7
    //   306: aload_2
    //   307: dup
    //   308: aload_0
    //   309: aload_2
    //   310: aload_0
    //   311: getfield VT : Lf/Ht0;
    //   314: putfield lPt1 : Lf/Ht0;
    //   317: getfield bG0 : Lf/Ht0;
    //   320: putfield se : Lf/Ht0;
    //   323: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   326: invokevirtual Eh : ()V
    //   329: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 43
    //   #2	-> 50
    //   #3	-> 88
    //   #4	-> 97
    //   #5	-> 104
    //   #6	-> 111
    //   #7	-> 149
    //   #8	-> 165
    //   #9	-> 172
    //   #10	-> 179
    //   #11	-> 217
    //   #12	-> 220
    //   #13	-> 237
    //   #14	-> 245
    //   #15	-> 298
    //   #16	-> 311
    //   #17	-> 314
    //   #18	-> 317
    //   #19	-> 320
    //   #20	-> 323
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */