package f;

public final class L extends JS {
  public final short kS;
  
  public final int ko0;
  
  public L(int paramInt, short paramShort1, short paramShort2) {
    super(paramShort2);
    this.kS = paramShort1;
    this.ko0 = paramInt;
  }
  
  public final byte YG0() {
    return 41;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: getstatic f/km.MR : Lf/Gp0;
    //   3: dup
    //   4: astore_3
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_0
    //   10: getfield kS : S
    //   13: dup
    //   14: istore #4
    //   16: sipush #273
    //   19: if_icmpeq -> 263
    //   22: iload #4
    //   24: sipush #361
    //   27: if_icmpeq -> 156
    //   30: iload #4
    //   32: sipush #461
    //   35: if_icmpeq -> 41
    //   38: goto -> 394
    //   41: aload #7
    //   43: aload_2
    //   44: aload_0
    //   45: aload #7
    //   47: dup
    //   48: dup
    //   49: new f/LV
    //   52: dup
    //   53: astore_0
    //   54: new f/By
    //   57: dup
    //   58: aload_2
    //   59: swap
    //   60: aload_1
    //   61: invokespecial <init> : (Lf/hm0;)V
    //   64: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   67: iconst_0
    //   68: swap
    //   69: invokespecial <init> : (BLf/wb;)V
    //   72: getfield YP : Ljava/util/LinkedList;
    //   75: aload_0
    //   76: invokevirtual add : (Ljava/lang/Object;)Z
    //   79: pop
    //   80: getstatic f/F40.ef0 : Lf/F40;
    //   83: astore_0
    //   84: bipush #14
    //   86: istore_1
    //   87: getfield AD : Lf/Gp0;
    //   90: sipush #694
    //   93: aload_2
    //   94: invokevirtual ex : (ILf/hm0;)I
    //   97: istore_3
    //   98: iconst_1
    //   99: anewarray java/lang/String
    //   102: dup
    //   103: astore #4
    //   105: aload_2
    //   106: invokevirtual fA : ()Ljava/lang/String;
    //   109: iconst_0
    //   110: swap
    //   111: aastore
    //   112: iconst_2
    //   113: aload_0
    //   114: iload_1
    //   115: iload_3
    //   116: aload #4
    //   118: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   121: invokevirtual Kq : (Ljava/lang/String;)V
    //   124: getfield cOM9 : S
    //   127: invokevirtual tx : (S)V
    //   130: new f/Gr0
    //   133: dup
    //   134: astore_0
    //   135: aload_2
    //   136: aload #7
    //   138: aload_2
    //   139: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   142: invokespecial <init> : (Lf/hm0;Lf/Hj;)V
    //   145: getfield YP : Ljava/util/LinkedList;
    //   148: aload_0
    //   149: invokevirtual add : (Ljava/lang/Object;)Z
    //   152: pop
    //   153: goto -> 394
    //   156: aload #7
    //   158: aload_2
    //   159: aload_0
    //   160: aload #7
    //   162: dup
    //   163: dup
    //   164: new f/LV
    //   167: dup
    //   168: astore_0
    //   169: new f/l00
    //   172: dup
    //   173: aload_2
    //   174: swap
    //   175: aload_1
    //   176: invokespecial <init> : (Lf/hm0;)V
    //   179: invokevirtual SK : (Lf/hm0;)Lf/wb;
    //   182: iconst_0
    //   183: swap
    //   184: invokespecial <init> : (BLf/wb;)V
    //   187: getfield YP : Ljava/util/LinkedList;
    //   190: aload_0
    //   191: invokevirtual add : (Ljava/lang/Object;)Z
    //   194: pop
    //   195: getstatic f/F40.ef0 : Lf/F40;
    //   198: astore_0
    //   199: bipush #14
    //   201: istore_1
    //   202: getfield AD : Lf/Gp0;
    //   205: sipush #697
    //   208: aload_2
    //   209: invokevirtual ex : (ILf/hm0;)I
    //   212: istore_3
    //   213: iconst_1
    //   214: anewarray java/lang/String
    //   217: dup
    //   218: astore #4
    //   220: aload_2
    //   221: invokevirtual fA : ()Ljava/lang/String;
    //   224: iconst_0
    //   225: swap
    //   226: aastore
    //   227: iconst_2
    //   228: aload_0
    //   229: iload_1
    //   230: iload_3
    //   231: aload #4
    //   233: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   236: invokevirtual Kq : (Ljava/lang/String;)V
    //   239: getfield cOM9 : S
    //   242: invokevirtual tx : (S)V
    //   245: new f/Gr0
    //   248: dup
    //   249: astore_0
    //   250: aload_2
    //   251: aload #7
    //   253: aload_2
    //   254: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   257: invokespecial <init> : (Lf/hm0;Lf/Hj;)V
    //   260: goto -> 145
    //   263: aload_3
    //   264: aload_0
    //   265: aload #7
    //   267: aload_2
    //   268: aload_0
    //   269: getfield cOM9 : S
    //   272: invokevirtual tx : (S)V
    //   275: new f/Gr0
    //   278: dup
    //   279: astore #4
    //   281: aload_2
    //   282: aload #7
    //   284: aload_2
    //   285: invokevirtual oD : (Lf/hm0;)Lf/Hj;
    //   288: invokespecial <init> : (Lf/hm0;Lf/Hj;)V
    //   291: getfield YP : Ljava/util/LinkedList;
    //   294: aload #4
    //   296: invokevirtual add : (Ljava/lang/Object;)Z
    //   299: pop
    //   300: ldc ''
    //   302: astore_2
    //   303: getfield ko0 : I
    //   306: invokevirtual fa : (I)Lf/hm0;
    //   309: dup
    //   310: astore #4
    //   312: ifnonnull -> 345
    //   315: aload_3
    //   316: aload_0
    //   317: getfield ko0 : I
    //   320: invokevirtual f70 : (I)Lf/cOm4;
    //   323: dup
    //   324: astore_0
    //   325: ifnull -> 351
    //   328: aload_0
    //   329: getfield gc : Lf/jd0;
    //   332: dup
    //   333: astore_0
    //   334: ifnull -> 351
    //   337: aload_0
    //   338: invokevirtual Qe : ()Ljava/lang/String;
    //   341: astore_2
    //   342: goto -> 351
    //   345: aload #4
    //   347: invokevirtual fA : ()Ljava/lang/String;
    //   350: astore_2
    //   351: aload #7
    //   353: dup
    //   354: getstatic f/F40.ef0 : Lf/F40;
    //   357: astore_0
    //   358: bipush #14
    //   360: istore_3
    //   361: getfield AD : Lf/Gp0;
    //   364: sipush #700
    //   367: aload_1
    //   368: invokevirtual ex : (ILf/hm0;)I
    //   371: istore_1
    //   372: iconst_1
    //   373: anewarray java/lang/String
    //   376: dup
    //   377: astore #4
    //   379: iconst_0
    //   380: aload_2
    //   381: aastore
    //   382: iconst_2
    //   383: aload_0
    //   384: iload_3
    //   385: iload_1
    //   386: aload #4
    //   388: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   391: invokevirtual Kq : (Ljava/lang/String;)V
    //   394: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 72
    //   #2	-> 76
    //   #3	-> 80
    //   #4	-> 87
    //   #5	-> 94
    //   #6	-> 118
    //   #7	-> 121
    //   #8	-> 124
    //   #9	-> 127
    //   #10	-> 145
    //   #11	-> 164
    //   #12	-> 187
    //   #13	-> 191
    //   #14	-> 195
    //   #15	-> 202
    //   #16	-> 209
    //   #17	-> 233
    //   #18	-> 236
    //   #19	-> 239
    //   #20	-> 242
    //   #21	-> 269
    //   #22	-> 272
    //   #23	-> 291
    //   #24	-> 300
    //   #25	-> 329
    //   #26	-> 338
    //   #27	-> 361
    //   #28	-> 368
    //   #29	-> 388
    //   #30	-> 391
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/L.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */