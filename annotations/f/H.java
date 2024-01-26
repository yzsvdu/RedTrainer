package f;

public final class H implements ob {
  public fQ pP;
  
  public Ou0 C40;
  
  public Ou0 HJ;
  
  public Ou0 KT;
  
  public H() {
    fQ fQ1;
    this();
    this.pP = this;
  }
  
  public H(Ou0... paramVarArgs) {
    fQ fQ1;
    this();
    this.pP = this;
    Rx(paramVarArgs);
  }
  
  public H(Ou0[] paramArrayOfOu0, int paramInt1, int paramInt2) {
    fQ fQ1;
    this();
    this.pP = this;
    bS(paramArrayOfOu0, paramInt1, paramInt2);
  }
  
  public H(fQ paramfQ, int paramInt1, int paramInt2) {
    fQ fQ1;
    this();
    this.pP = this;
    q4(paramfQ, paramInt1, paramInt2);
  }
  
  public final void Rx(Ou0... paramVarArgs) {
    int i = paramVarArgs.length;
    bS(paramVarArgs, 0, i);
  }
  
  public final H bS(Ou0[] paramArrayOfOu0, int paramInt1, int paramInt2) {
    if (paramInt2 >= 2 && paramInt2 <= 4) {
      if (this.C40 == null)
        this.C40 = paramArrayOfOu0[0].b3(); 
      if (this.HJ == null)
        this.HJ = paramArrayOfOu0[0].b3(); 
      if (this.KT == null)
        this.KT = paramArrayOfOu0[0].b3(); 
      this.pP.clear();
      this.pP.tu0((Object[])paramArrayOfOu0, paramInt1, paramInt2);
      return this;
    } 
    throw new JU("Only first, second and third degree Bezier curves are supported.");
  }
  
  public final void q4(fQ paramfQ, int paramInt1, int paramInt2) {
    if (paramInt2 >= 2 && paramInt2 <= 4) {
      if (this.C40 == null)
        this.C40 = ((Ou0)paramfQ.get(0)).b3(); 
      if (this.HJ == null)
        this.HJ = ((Ou0)paramfQ.get(0)).b3(); 
      if (this.KT == null)
        this.KT = ((Ou0)paramfQ.get(0)).b3(); 
      this.pP.clear();
      this.pP.wV(paramfQ, paramInt1, paramInt2);
      return;
    } 
    throw new JU("Only first, second and third degree Bezier curves are supported.");
  }
  
  public final Ou0 Il(float paramFloat, eo parameo) {
    // Byte code:
    //   0: aload_0
    //   1: getfield pP : Lf/fQ;
    //   4: dup
    //   5: astore_3
    //   6: getfield Z8 : I
    //   9: dup
    //   10: istore #4
    //   12: iconst_2
    //   13: if_icmpne -> 81
    //   16: aload_2
    //   17: aload_0
    //   18: dup
    //   19: aload_3
    //   20: iconst_0
    //   21: invokevirtual get : (I)Ljava/lang/Object;
    //   24: checkcast f/Ou0
    //   27: astore_0
    //   28: getfield pP : Lf/fQ;
    //   31: iconst_1
    //   32: invokevirtual get : (I)Ljava/lang/Object;
    //   35: checkcast f/Ou0
    //   38: astore_3
    //   39: getfield C40 : Lf/Ou0;
    //   42: astore #4
    //   44: aload_0
    //   45: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   50: fconst_1
    //   51: fload_1
    //   52: fsub
    //   53: invokeinterface cm0 : (F)Lf/Ou0;
    //   58: aload #4
    //   60: aload_3
    //   61: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   66: fload_1
    //   67: invokeinterface cm0 : (F)Lf/Ou0;
    //   72: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   77: pop
    //   78: goto -> 361
    //   81: iload #4
    //   83: iconst_3
    //   84: if_icmpne -> 195
    //   87: aload_2
    //   88: aload_0
    //   89: dup
    //   90: dup
    //   91: aload_3
    //   92: iconst_0
    //   93: invokevirtual get : (I)Ljava/lang/Object;
    //   96: checkcast f/Ou0
    //   99: astore_0
    //   100: getfield pP : Lf/fQ;
    //   103: iconst_1
    //   104: invokevirtual get : (I)Ljava/lang/Object;
    //   107: checkcast f/Ou0
    //   110: astore_3
    //   111: getfield pP : Lf/fQ;
    //   114: iconst_2
    //   115: invokevirtual get : (I)Ljava/lang/Object;
    //   118: checkcast f/Ou0
    //   121: astore #4
    //   123: getfield C40 : Lf/Ou0;
    //   126: astore #5
    //   128: aload_0
    //   129: fconst_1
    //   130: fload_1
    //   131: fsub
    //   132: fstore_0
    //   133: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   138: fload_0
    //   139: dup
    //   140: fmul
    //   141: invokeinterface cm0 : (F)Lf/Ou0;
    //   146: aload #5
    //   148: aload_3
    //   149: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   154: fload_0
    //   155: fconst_2
    //   156: fmul
    //   157: fload_1
    //   158: fmul
    //   159: invokeinterface cm0 : (F)Lf/Ou0;
    //   164: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   169: aload #5
    //   171: aload #4
    //   173: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   178: fload_1
    //   179: dup
    //   180: fmul
    //   181: invokeinterface cm0 : (F)Lf/Ou0;
    //   186: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   191: pop
    //   192: goto -> 361
    //   195: iload #4
    //   197: iconst_4
    //   198: if_icmpne -> 361
    //   201: aload_2
    //   202: fload_1
    //   203: dup
    //   204: aload_0
    //   205: dup
    //   206: dup2
    //   207: aload_3
    //   208: iconst_0
    //   209: invokevirtual get : (I)Ljava/lang/Object;
    //   212: checkcast f/Ou0
    //   215: astore_0
    //   216: getfield pP : Lf/fQ;
    //   219: iconst_1
    //   220: invokevirtual get : (I)Ljava/lang/Object;
    //   223: checkcast f/Ou0
    //   226: astore_3
    //   227: getfield pP : Lf/fQ;
    //   230: iconst_2
    //   231: invokevirtual get : (I)Ljava/lang/Object;
    //   234: checkcast f/Ou0
    //   237: astore #4
    //   239: getfield pP : Lf/fQ;
    //   242: iconst_3
    //   243: invokevirtual get : (I)Ljava/lang/Object;
    //   246: checkcast f/Ou0
    //   249: astore #5
    //   251: getfield C40 : Lf/Ou0;
    //   254: astore #6
    //   256: fconst_1
    //   257: fload_1
    //   258: fsub
    //   259: dup
    //   260: dup
    //   261: fstore #7
    //   263: fmul
    //   264: fstore #8
    //   266: fmul
    //   267: fstore #9
    //   269: aload_0
    //   270: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   275: fload #8
    //   277: fload #7
    //   279: fmul
    //   280: invokeinterface cm0 : (F)Lf/Ou0;
    //   285: aload #6
    //   287: aload_3
    //   288: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   293: fload #8
    //   295: ldc 3.0
    //   297: fmul
    //   298: fload_1
    //   299: fmul
    //   300: invokeinterface cm0 : (F)Lf/Ou0;
    //   305: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   310: aload #6
    //   312: aload #4
    //   314: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   319: fload #7
    //   321: ldc 3.0
    //   323: fmul
    //   324: fload #9
    //   326: fmul
    //   327: invokeinterface cm0 : (F)Lf/Ou0;
    //   332: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   337: aload #6
    //   339: aload #5
    //   341: invokeinterface hH : (Lf/Ou0;)Lf/Ou0;
    //   346: fload #9
    //   348: fload_1
    //   349: fmul
    //   350: invokeinterface cm0 : (F)Lf/Ou0;
    //   355: invokeinterface WX : (Lf/Ou0;)Lf/Ou0;
    //   360: pop
    //   361: aload_2
    //   362: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 45
    //   #3	-> 93
    //   #4	-> 133
    //   #5	-> 209
    //   #6	-> 270
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */