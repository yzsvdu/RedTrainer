package f;

public final class dY {
  public final int pu;
  
  public final int Xb;
  
  public final char nS;
  
  public final String Es0;
  
  public dY(int paramInt1, int paramInt2, char paramChar, String paramString) {
    this.pu = paramInt1;
    this.Xb = paramInt2;
    this.nS = paramChar;
    this.Es0 = paramString;
  }
  
  public static dY IF0(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 352
    //   4: aload_1
    //   5: ifnull -> 342
    //   8: aload_0
    //   9: dup
    //   10: invokevirtual length : ()I
    //   13: iconst_0
    //   14: swap
    //   15: invokestatic rB : (Ljava/lang/CharSequence;II)I
    //   18: istore_2
    //   19: iconst_0
    //   20: istore_3
    //   21: iconst_0
    //   22: istore #4
    //   24: iconst_0
    //   25: istore #5
    //   27: iconst_0
    //   28: istore #6
    //   30: iconst_0
    //   31: istore #7
    //   33: iload_2
    //   34: aload_0
    //   35: invokevirtual length : ()I
    //   38: if_icmpge -> 313
    //   41: aload_0
    //   42: bipush #32
    //   44: iload_2
    //   45: invokevirtual indexOf : (II)I
    //   48: dup
    //   49: istore #8
    //   51: ifge -> 60
    //   54: aload_0
    //   55: invokevirtual length : ()I
    //   58: istore #8
    //   60: iload #7
    //   62: aload_0
    //   63: iload_2
    //   64: iload #8
    //   66: invokevirtual substring : (II)Ljava/lang/String;
    //   69: astore_2
    //   70: ifne -> 299
    //   73: iload #6
    //   75: ifeq -> 124
    //   78: aload_2
    //   79: invokevirtual length : ()I
    //   82: iconst_1
    //   83: if_icmpne -> 114
    //   86: aload_2
    //   87: iconst_0
    //   88: invokevirtual charAt : (I)C
    //   91: dup
    //   92: istore #4
    //   94: ifeq -> 100
    //   97: goto -> 252
    //   100: new java/lang/IllegalArgumentException
    //   103: dup
    //   104: ldc 'Unknown character: '
    //   106: aload_2
    //   107: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    //   114: new java/lang/IllegalArgumentException
    //   117: dup
    //   118: ldc 'Expected single character after 'typed''
    //   120: invokespecial <init> : (Ljava/lang/String;)V
    //   123: athrow
    //   124: ldc 'ctrl'
    //   126: aload_2
    //   127: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   130: ifne -> 274
    //   133: ldc 'control'
    //   135: aload_2
    //   136: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   139: ifeq -> 145
    //   142: goto -> 274
    //   145: ldc 'shift'
    //   147: aload_2
    //   148: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   151: ifeq -> 163
    //   154: iload_3
    //   155: iconst_1
    //   156: ior
    //   157: istore_2
    //   158: iload_2
    //   159: istore_3
    //   160: goto -> 280
    //   163: ldc 'meta'
    //   165: aload_2
    //   166: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   169: ifeq -> 181
    //   172: iload_3
    //   173: iconst_4
    //   174: ior
    //   175: istore_2
    //   176: iload_2
    //   177: istore_3
    //   178: goto -> 280
    //   181: ldc 'cmd'
    //   183: aload_2
    //   184: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   187: ifeq -> 200
    //   190: iload_3
    //   191: bipush #20
    //   193: ior
    //   194: istore_2
    //   195: iload_2
    //   196: istore_3
    //   197: goto -> 280
    //   200: ldc 'alt'
    //   202: aload_2
    //   203: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   206: ifeq -> 219
    //   209: iload_3
    //   210: bipush #8
    //   212: ior
    //   213: istore_2
    //   214: iload_2
    //   215: istore_3
    //   216: goto -> 280
    //   219: ldc 'typed'
    //   221: aload_2
    //   222: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   225: ifeq -> 236
    //   228: iconst_1
    //   229: istore_2
    //   230: iload_2
    //   231: istore #6
    //   233: goto -> 280
    //   236: aload_2
    //   237: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   240: invokevirtual toUpperCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   243: invokestatic RB : (Ljava/lang/String;)I
    //   246: dup
    //   247: istore #5
    //   249: ifeq -> 260
    //   252: iconst_1
    //   253: istore_2
    //   254: iload_2
    //   255: istore #7
    //   257: goto -> 280
    //   260: new java/lang/IllegalArgumentException
    //   263: dup
    //   264: ldc 'Unknown key: '
    //   266: aload_2
    //   267: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   270: invokespecial <init> : (Ljava/lang/String;)V
    //   273: athrow
    //   274: iload_3
    //   275: iconst_2
    //   276: ior
    //   277: istore_2
    //   278: iload_2
    //   279: istore_3
    //   280: aload_0
    //   281: dup
    //   282: iload #8
    //   284: iconst_1
    //   285: iadd
    //   286: istore_2
    //   287: invokevirtual length : ()I
    //   290: iload_2
    //   291: swap
    //   292: invokestatic rB : (Ljava/lang/CharSequence;II)I
    //   295: istore_2
    //   296: goto -> 33
    //   299: new java/lang/IllegalArgumentException
    //   302: dup
    //   303: ldc 'Unexpected: '
    //   305: aload_2
    //   306: invokestatic tF0 : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   309: invokespecial <init> : (Ljava/lang/String;)V
    //   312: athrow
    //   313: iload #7
    //   315: ifeq -> 332
    //   318: new f/dY
    //   321: dup
    //   322: iload_3
    //   323: iload #5
    //   325: iload #4
    //   327: aload_1
    //   328: invokespecial <init> : (IICLjava/lang/String;)V
    //   331: areturn
    //   332: new java/lang/IllegalArgumentException
    //   335: dup
    //   336: ldc 'Unexpected end of string'
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: athrow
    //   342: new java/lang/NullPointerException
    //   345: dup
    //   346: ldc 'action'
    //   348: invokespecial <init> : (Ljava/lang/String;)V
    //   351: athrow
    //   352: new java/lang/NullPointerException
    //   355: dup
    //   356: ldc 'stroke'
    //   358: invokespecial <init> : (Ljava/lang/String;)V
    //   361: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 35
    //   #3	-> 45
    //   #4	-> 66
    //   #5	-> 104
    //   #6	-> 110
    //   #7	-> 264
    //   #8	-> 270
    //   #9	-> 287
    //   #10	-> 299
    //   #11	-> 303
    //   #12	-> 309
  }
  
  public final String bk() {
    this();
    StringBuilder stringBuilder;
    if ((this.pu & 0x1) == 1)
      stringBuilder.append("shift "); 
    if ((this.pu & 0x2) == 2)
      stringBuilder.append("ctrl "); 
    if ((this.pu & 0x8) == 8)
      stringBuilder.append("alt "); 
    int i;
    if (((i = this.pu) & 0x14) == 20) {
      stringBuilder.append("cmd ");
    } else if ((i & 0x4) == 4) {
      stringBuilder.append("meta ");
    } 
    if ((i = this.Xb) != 0) {
      stringBuilder.append(oa0.v40(i));
    } else {
      stringBuilder.append("typed ").append(this.nS);
    } 
    return stringBuilder.toString();
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof dY) {
      paramObject = paramObject;
      return (this.pu == ((dY)paramObject).pu && this.Xb == ((dY)paramObject).Xb && this.nS == ((dY)paramObject).nS);
    } 
    return false;
  }
  
  public final int hashCode() {
    return ((415 + this.pu) * 83 + this.Xb) * 83 + this.nS;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */