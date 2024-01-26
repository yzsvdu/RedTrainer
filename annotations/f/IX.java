package f;

public final class IX implements Comparable {
  public zp ze = null;
  
  public cu0 HF0;
  
  public cu0 OH0;
  
  public A00 FZ;
  
  public A00 COm4;
  
  public IX(zp paramzp, cu0 paramcu01, cu0 paramcu02, A00 paramA001, A00 paramA002) {
    vv0(paramzp, paramcu01, paramcu02, paramA001, paramA002);
  }
  
  public IX(zp paramzp) {
    this(paramzp, null, null, null, null);
  }
  
  public IX() {}
  
  public final void vv0(zp paramzp, cu0 paramcu01, cu0 paramcu02, A00 paramA001, A00 paramA002) {
    this.ze = paramzp;
    this.HF0 = paramcu01;
    this.OH0 = paramcu02;
    this.FZ = paramA001;
    this.COm4 = paramA002;
  }
  
  public final void jf0(IX paramIX) {
    this.ze = paramIX.ze;
    this.HF0 = paramIX.HF0;
    this.OH0 = paramIX.OH0;
    this.FZ = paramIX.FZ;
    this.COm4 = paramIX.COm4;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == null) ? false : ((paramObject == this) ? true : (!(paramObject instanceof IX) ? false : ((((IX)(paramObject = paramObject)).ze == this.ze && ((IX)paramObject).HF0 == this.HF0 && ((IX)paramObject).OH0 == this.OH0 && ((IX)paramObject).FZ == this.FZ && ((IX)paramObject).COm4 == this.COm4))));
  }
  
  public final int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ze : Lf/zp;
    //   4: dup
    //   5: astore_1
    //   6: ifnonnull -> 13
    //   9: iconst_0
    //   10: goto -> 17
    //   13: aload_1
    //   14: getfield glTarget : I
    //   17: i2l
    //   18: lstore_2
    //   19: aload_1
    //   20: lload_2
    //   21: ldc2_w 811
    //   24: lmul
    //   25: lstore_2
    //   26: ifnonnull -> 33
    //   29: iconst_0
    //   30: goto -> 37
    //   33: aload_1
    //   34: invokevirtual getTextureObjectHandle : ()I
    //   37: i2l
    //   38: lstore #4
    //   40: aload_0
    //   41: lload_2
    //   42: lload #4
    //   44: ladd
    //   45: ldc2_w 811
    //   48: lmul
    //   49: lstore_1
    //   50: getfield HF0 : Lf/cu0;
    //   53: dup
    //   54: astore_3
    //   55: ifnonnull -> 63
    //   58: iconst_0
    //   59: istore_3
    //   60: goto -> 68
    //   63: aload_3
    //   64: getfield Co0 : I
    //   67: istore_3
    //   68: aload_0
    //   69: lload_1
    //   70: iload_3
    //   71: i2l
    //   72: ladd
    //   73: ldc2_w 811
    //   76: lmul
    //   77: lstore_1
    //   78: getfield OH0 : Lf/cu0;
    //   81: dup
    //   82: astore_3
    //   83: ifnonnull -> 91
    //   86: iconst_0
    //   87: istore_3
    //   88: goto -> 96
    //   91: aload_3
    //   92: getfield Co0 : I
    //   95: istore_3
    //   96: aload_0
    //   97: lload_1
    //   98: iload_3
    //   99: i2l
    //   100: ladd
    //   101: ldc2_w 811
    //   104: lmul
    //   105: lstore_1
    //   106: getfield FZ : Lf/A00;
    //   109: dup
    //   110: astore_3
    //   111: ifnonnull -> 119
    //   114: iconst_0
    //   115: istore_3
    //   116: goto -> 124
    //   119: aload_3
    //   120: getfield UA0 : I
    //   123: istore_3
    //   124: aload_0
    //   125: lload_1
    //   126: iload_3
    //   127: i2l
    //   128: ladd
    //   129: ldc2_w 811
    //   132: lmul
    //   133: lstore_1
    //   134: getfield COm4 : Lf/A00;
    //   137: dup
    //   138: astore_0
    //   139: ifnonnull -> 147
    //   142: iconst_0
    //   143: istore_0
    //   144: goto -> 152
    //   147: aload_0
    //   148: getfield UA0 : I
    //   151: istore_0
    //   152: lload_1
    //   153: iload_0
    //   154: i2l
    //   155: ladd
    //   156: dup2
    //   157: bipush #32
    //   159: lshr
    //   160: lxor
    //   161: l2i
    //   162: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 64
    //   #2	-> 78
    //   #3	-> 92
    //   #4	-> 106
    //   #5	-> 120
    //   #6	-> 134
    //   #7	-> 148
  }
  
  public final int e10(IX paramIX) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: if_acmpne -> 7
    //   5: iconst_0
    //   6: ireturn
    //   7: aload_0
    //   8: getfield ze : Lf/zp;
    //   11: dup
    //   12: astore_2
    //   13: ifnonnull -> 21
    //   16: iconst_0
    //   17: istore_3
    //   18: goto -> 26
    //   21: aload_2
    //   22: getfield glTarget : I
    //   25: istore_3
    //   26: aload_1
    //   27: getfield ze : Lf/zp;
    //   30: dup
    //   31: astore #4
    //   33: ifnonnull -> 42
    //   36: iconst_0
    //   37: istore #4
    //   39: goto -> 49
    //   42: aload #4
    //   44: getfield glTarget : I
    //   47: istore #4
    //   49: iload_3
    //   50: iload #4
    //   52: if_icmpeq -> 60
    //   55: iload_3
    //   56: iload #4
    //   58: isub
    //   59: ireturn
    //   60: aload_2
    //   61: ifnonnull -> 69
    //   64: iconst_0
    //   65: istore_2
    //   66: goto -> 74
    //   69: aload_2
    //   70: invokevirtual getTextureObjectHandle : ()I
    //   73: istore_2
    //   74: aload_1
    //   75: getfield ze : Lf/zp;
    //   78: dup
    //   79: astore_3
    //   80: ifnonnull -> 88
    //   83: iconst_0
    //   84: istore_3
    //   85: goto -> 93
    //   88: aload_3
    //   89: invokevirtual getTextureObjectHandle : ()I
    //   92: istore_3
    //   93: iload_2
    //   94: iload_3
    //   95: if_icmpeq -> 102
    //   98: iload_2
    //   99: iload_3
    //   100: isub
    //   101: ireturn
    //   102: aload_0
    //   103: getfield HF0 : Lf/cu0;
    //   106: dup
    //   107: astore_2
    //   108: aload_1
    //   109: getfield HF0 : Lf/cu0;
    //   112: dup
    //   113: astore_3
    //   114: if_acmpeq -> 149
    //   117: aload_2
    //   118: ifnonnull -> 126
    //   121: iconst_0
    //   122: istore_0
    //   123: goto -> 131
    //   126: aload_2
    //   127: getfield Co0 : I
    //   130: istore_0
    //   131: aload_3
    //   132: ifnonnull -> 140
    //   135: iconst_0
    //   136: istore_1
    //   137: goto -> 145
    //   140: aload_3
    //   141: getfield Co0 : I
    //   144: istore_1
    //   145: iload_0
    //   146: iload_1
    //   147: isub
    //   148: ireturn
    //   149: aload_0
    //   150: getfield OH0 : Lf/cu0;
    //   153: dup
    //   154: astore_2
    //   155: aload_1
    //   156: getfield OH0 : Lf/cu0;
    //   159: dup
    //   160: astore_3
    //   161: if_acmpeq -> 196
    //   164: aload_2
    //   165: ifnonnull -> 173
    //   168: iconst_0
    //   169: istore_0
    //   170: goto -> 178
    //   173: aload_2
    //   174: getfield Co0 : I
    //   177: istore_0
    //   178: aload_3
    //   179: ifnonnull -> 187
    //   182: iconst_0
    //   183: istore_1
    //   184: goto -> 192
    //   187: aload_3
    //   188: getfield Co0 : I
    //   191: istore_1
    //   192: iload_0
    //   193: iload_1
    //   194: isub
    //   195: ireturn
    //   196: aload_0
    //   197: getfield FZ : Lf/A00;
    //   200: dup
    //   201: astore_2
    //   202: aload_1
    //   203: getfield FZ : Lf/A00;
    //   206: dup
    //   207: astore_3
    //   208: if_acmpeq -> 243
    //   211: aload_2
    //   212: ifnonnull -> 220
    //   215: iconst_0
    //   216: istore_0
    //   217: goto -> 225
    //   220: aload_2
    //   221: getfield UA0 : I
    //   224: istore_0
    //   225: aload_3
    //   226: ifnonnull -> 234
    //   229: iconst_0
    //   230: istore_1
    //   231: goto -> 239
    //   234: aload_3
    //   235: getfield UA0 : I
    //   238: istore_1
    //   239: iload_0
    //   240: iload_1
    //   241: isub
    //   242: ireturn
    //   243: aload_0
    //   244: getfield COm4 : Lf/A00;
    //   247: dup
    //   248: astore_0
    //   249: aload_1
    //   250: getfield COm4 : Lf/A00;
    //   253: dup
    //   254: astore_1
    //   255: if_acmpeq -> 290
    //   258: aload_0
    //   259: ifnonnull -> 267
    //   262: iconst_0
    //   263: istore_0
    //   264: goto -> 272
    //   267: aload_0
    //   268: getfield UA0 : I
    //   271: istore_0
    //   272: aload_1
    //   273: ifnonnull -> 281
    //   276: iconst_0
    //   277: istore_1
    //   278: goto -> 286
    //   281: aload_1
    //   282: getfield UA0 : I
    //   285: istore_1
    //   286: iload_0
    //   287: iload_1
    //   288: isub
    //   289: ireturn
    //   290: iconst_0
    //   291: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 127
    //   #2	-> 141
    //   #3	-> 150
    //   #4	-> 174
    //   #5	-> 188
    //   #6	-> 197
    //   #7	-> 221
    //   #8	-> 235
    //   #9	-> 244
    //   #10	-> 268
    //   #11	-> 282
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IX.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */