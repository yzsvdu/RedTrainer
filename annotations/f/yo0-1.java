package f;

public final class yo0 extends qk0 {
  public qc[] R8;
  
  public int cI;
  
  public yo0(yE0 paramyE0, boolean paramBoolean) {
    super(paramyE0, paramBoolean);
  }
  
  public final void Zq() {
    super.Zq();
    this.cI = 20;
    this.cI = 35;
    double d = ((this.LPT7 == yE0.JF) ? 40 : 30);
    this.R8 = new qc[(int)(d * 1.4D)];
    qc[] arrayOfQc;
    for (byte b = 0; b < (arrayOfQc = this.R8).length; b++) {
      qc qc1;
      this(this);
      arrayOfQc[b] = qc1;
      this.R8[b].DI0(this.CH0);
    } 
  }
  
  public final void IA(tH paramtH) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: aload_1
    //   3: invokespecial IA : (Lf/tH;)V
    //   6: getfield R8 : [Lf/qc;
    //   9: dup
    //   10: astore_0
    //   11: arraylength
    //   12: istore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: iload_2
    //   17: if_icmpge -> 330
    //   20: aload_0
    //   21: iload_3
    //   22: aaload
    //   23: dup
    //   24: astore #4
    //   26: getfield vX : Z
    //   29: ifeq -> 35
    //   32: goto -> 324
    //   35: aload #4
    //   37: getfield zu0 : J
    //   40: aload #4
    //   42: getfield AO : Lf/yo0;
    //   45: dup
    //   46: astore #5
    //   48: getfield cI : I
    //   51: i2l
    //   52: ladd
    //   53: getstatic f/zm0.u20 : J
    //   56: dup2
    //   57: lstore #6
    //   59: lcmp
    //   60: ifge -> 252
    //   63: aload #4
    //   65: dup
    //   66: lload #6
    //   68: putfield zu0 : J
    //   71: getfield CX : I
    //   74: dup
    //   75: istore #6
    //   77: aload #4
    //   79: getfield b20 : I
    //   82: if_icmple -> 109
    //   85: aload #4
    //   87: dup
    //   88: dup
    //   89: iload #6
    //   91: bipush #16
    //   93: isub
    //   94: putfield CX : I
    //   97: getfield vO : I
    //   100: bipush #32
    //   102: iadd
    //   103: putfield vO : I
    //   106: goto -> 252
    //   109: aload #5
    //   111: getfield LPT7 : Lf/yE0;
    //   114: dup
    //   115: astore #5
    //   117: getstatic f/yE0.qs : Lf/yE0;
    //   120: if_acmpeq -> 187
    //   123: aload #5
    //   125: getstatic f/yE0.xt0 : Lf/yE0;
    //   128: if_acmpne -> 134
    //   131: goto -> 187
    //   134: aload #4
    //   136: getfield hG : I
    //   139: dup
    //   140: istore #5
    //   142: tableswitch default -> 172, 0 -> 175, 1 -> 175, 2 -> 175, 3 -> 219
    //   172: goto -> 252
    //   175: aload #4
    //   177: iload #5
    //   179: iconst_1
    //   180: iadd
    //   181: putfield hG : I
    //   184: goto -> 252
    //   187: aload #4
    //   189: getfield hG : I
    //   192: dup
    //   193: istore #5
    //   195: ifeq -> 246
    //   198: iload #5
    //   200: iconst_1
    //   201: if_icmpeq -> 237
    //   204: iload #5
    //   206: iconst_4
    //   207: if_icmpeq -> 228
    //   210: iload #5
    //   212: iconst_5
    //   213: if_icmpeq -> 219
    //   216: goto -> 252
    //   219: aload #4
    //   221: iconst_0
    //   222: invokevirtual DI0 : (Z)V
    //   225: goto -> 252
    //   228: aload #4
    //   230: iconst_5
    //   231: putfield hG : I
    //   234: goto -> 252
    //   237: aload #4
    //   239: iconst_4
    //   240: putfield hG : I
    //   243: goto -> 252
    //   246: aload #4
    //   248: iconst_1
    //   249: putfield hG : I
    //   252: aload #4
    //   254: invokestatic mH : ()Lf/iU;
    //   257: astore #5
    //   259: getfield hG : I
    //   262: dup
    //   263: istore #6
    //   265: iflt -> 293
    //   268: iload #6
    //   270: aload #5
    //   272: getfield K3 : [Lf/zh0;
    //   275: dup
    //   276: astore #5
    //   278: arraylength
    //   279: if_icmplt -> 285
    //   282: goto -> 299
    //   285: aload #5
    //   287: iload #6
    //   289: aaload
    //   290: goto -> 300
    //   293: aload #5
    //   295: invokevirtual getClass : ()Ljava/lang/Class;
    //   298: pop
    //   299: aconst_null
    //   300: invokevirtual Uu0 : ()Lf/pe0;
    //   303: aload_1
    //   304: swap
    //   305: aload #4
    //   307: dup
    //   308: getfield CX : I
    //   311: i2f
    //   312: fstore #4
    //   314: getfield vO : I
    //   317: i2f
    //   318: fload #4
    //   320: swap
    //   321: invokevirtual TB : (Lf/pe0;FF)V
    //   324: iinc #3, 1
    //   327: goto -> 15
    //   330: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 26
    //   #2	-> 37
    //   #3	-> 53
    //   #4	-> 68
    //   #5	-> 111
    //   #6	-> 117
    //   #7	-> 272
    //   #8	-> 278
    //   #9	-> 295
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */