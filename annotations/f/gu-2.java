package f;

public class gu implements E6 {
  public static final NC0 jj = new NC0();
  
  public static final NC0 qi0 = new NC0();
  
  public final YG gq;
  
  public iW LPT8;
  
  public eF0 NY;
  
  public gu() {
    this(20.0F, 0.4F, 1.1F, 2.14748365E9F);
  }
  
  public gu(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    YG yG;
    qr0 qr0;
    this(this);
    this(paramFloat1, paramFloat2, paramFloat3, paramFloat4, qr0);
    this.gq = yG;
  }
  
  public boolean Qi0(V80 paramV80) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof f/iW
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_1
    //   10: checkcast f/iW
    //   13: astore_1
    //   14: getstatic f/Yt.OD0 : [I
    //   17: aload_1
    //   18: getfield Dd0 : Lf/MV;
    //   21: invokevirtual ordinal : ()I
    //   24: iaload
    //   25: dup
    //   26: istore_2
    //   27: iconst_1
    //   28: if_icmpeq -> 217
    //   31: iload_2
    //   32: iconst_2
    //   33: if_icmpeq -> 82
    //   36: iload_2
    //   37: iconst_3
    //   38: if_icmpeq -> 43
    //   41: iconst_0
    //   42: ireturn
    //   43: aload_0
    //   44: dup
    //   45: aload_1
    //   46: aload_0
    //   47: aload_1
    //   48: putfield LPT8 : Lf/iW;
    //   51: getfield Kx : Lf/eF0;
    //   54: putfield NY : Lf/eF0;
    //   57: getfield gq : Lf/YG;
    //   60: aload_1
    //   61: dup
    //   62: dup
    //   63: getfield Aa0 : F
    //   66: fstore_0
    //   67: getfield coM4 : F
    //   70: fstore_1
    //   71: getfield W00 : I
    //   74: fload_0
    //   75: fload_1
    //   76: invokevirtual coM9 : (IFF)Z
    //   79: pop
    //   80: iconst_1
    //   81: ireturn
    //   82: aload_1
    //   83: getfield Aa0 : F
    //   86: dup
    //   87: fstore_2
    //   88: ldc -2.14748365E9
    //   90: fcmpl
    //   91: ifeq -> 112
    //   94: aload_1
    //   95: getfield coM4 : F
    //   98: ldc -2.14748365E9
    //   100: fcmpl
    //   101: ifne -> 107
    //   104: goto -> 112
    //   107: iconst_0
    //   108: istore_3
    //   109: goto -> 114
    //   112: iconst_1
    //   113: istore_3
    //   114: iload_3
    //   115: ifeq -> 145
    //   118: aload_0
    //   119: getfield gq : Lf/YG;
    //   122: dup
    //   123: dup2
    //   124: lconst_0
    //   125: putfield Lb : J
    //   128: iconst_0
    //   129: putfield Sj0 : Z
    //   132: iconst_0
    //   133: putfield vr0 : Z
    //   136: getfield Fc : Lf/vP;
    //   139: lconst_0
    //   140: putfield ew0 : J
    //   143: iconst_0
    //   144: ireturn
    //   145: aload_0
    //   146: dup
    //   147: dup
    //   148: aload_1
    //   149: aload_0
    //   150: aload_1
    //   151: putfield LPT8 : Lf/iW;
    //   154: getfield Kx : Lf/eF0;
    //   157: putfield NY : Lf/eF0;
    //   160: getfield gq : Lf/YG;
    //   163: aload_1
    //   164: dup
    //   165: dup
    //   166: getfield coM4 : F
    //   169: fstore_0
    //   170: getfield W00 : I
    //   173: istore_3
    //   174: getfield so : I
    //   177: iload_3
    //   178: swap
    //   179: fload_2
    //   180: fload_0
    //   181: invokevirtual uH0 : (IIFF)Z
    //   184: pop
    //   185: getfield NY : Lf/eF0;
    //   188: getstatic f/gu.jj : Lf/NC0;
    //   191: dup
    //   192: dup
    //   193: aload_1
    //   194: dup
    //   195: getfield Aa0 : F
    //   198: fstore_0
    //   199: getfield coM4 : F
    //   202: fstore_1
    //   203: fload_0
    //   204: putfield x : F
    //   207: fload_1
    //   208: putfield y : F
    //   211: invokevirtual pT : (Lf/NC0;)Lf/NC0;
    //   214: pop
    //   215: iconst_1
    //   216: ireturn
    //   217: aload_1
    //   218: dup
    //   219: dup
    //   220: aload_0
    //   221: dup
    //   222: dup
    //   223: aload_1
    //   224: getfield Kx : Lf/eF0;
    //   227: putfield NY : Lf/eF0;
    //   230: getfield gq : Lf/YG;
    //   233: aload_1
    //   234: dup
    //   235: dup2
    //   236: getfield Aa0 : F
    //   239: fstore_2
    //   240: getfield coM4 : F
    //   243: fstore_3
    //   244: getfield W00 : I
    //   247: istore #4
    //   249: getfield so : I
    //   252: iload #4
    //   254: swap
    //   255: fload_2
    //   256: fload_3
    //   257: invokevirtual Eb : (IIFF)Z
    //   260: pop
    //   261: getfield NY : Lf/eF0;
    //   264: getstatic f/gu.jj : Lf/NC0;
    //   267: dup
    //   268: dup
    //   269: aload_1
    //   270: dup
    //   271: getfield Aa0 : F
    //   274: fstore_2
    //   275: getfield coM4 : F
    //   278: fstore_3
    //   279: fload_2
    //   280: putfield x : F
    //   283: fload_3
    //   284: putfield y : F
    //   287: invokevirtual pT : (Lf/NC0;)Lf/NC0;
    //   290: pop
    //   291: getfield W00 : I
    //   294: istore_2
    //   295: getfield so : I
    //   298: istore_3
    //   299: getfield KF0 : Z
    //   302: ifeq -> 376
    //   305: aload_1
    //   306: getfield OC0 : Lf/Zy;
    //   309: dup
    //   310: aload_1
    //   311: dup
    //   312: getfield Kx : Lf/eF0;
    //   315: astore_1
    //   316: getfield l0 : Lf/eF0;
    //   319: astore #4
    //   321: invokevirtual getClass : ()Ljava/lang/Class;
    //   324: pop
    //   325: ldc f/Wn
    //   327: invokestatic vu0 : (Ljava/lang/Class;)Lf/Lc;
    //   330: invokevirtual obtain : ()Ljava/lang/Object;
    //   333: checkcast f/Wn
    //   336: dup
    //   337: astore #5
    //   339: iload_3
    //   340: aload #5
    //   342: iload_2
    //   343: aload #5
    //   345: aload_0
    //   346: aload #5
    //   348: aload #4
    //   350: aload #5
    //   352: aload_1
    //   353: putfield tq : Lf/eF0;
    //   356: putfield me0 : Lf/eF0;
    //   359: putfield Ra : Lf/E6;
    //   362: putfield Fa0 : I
    //   365: putfield yB : I
    //   368: getfield Sq : Lf/d10;
    //   371: aload #5
    //   373: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   376: iconst_1
    //   377: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 18
    //   #2	-> 21
    //   #3	-> 51
    //   #4	-> 54
    //   #5	-> 63
    //   #6	-> 67
    //   #7	-> 71
    //   #8	-> 76
    //   #9	-> 83
    //   #10	-> 119
    //   #11	-> 125
    //   #12	-> 129
    //   #13	-> 151
    //   #14	-> 154
    //   #15	-> 157
    //   #16	-> 166
    //   #17	-> 170
    //   #18	-> 174
    //   #19	-> 181
    //   #20	-> 195
    //   #21	-> 199
    //   #22	-> 204
    //   #23	-> 208
    //   #24	-> 211
    //   #25	-> 224
    //   #26	-> 227
    //   #27	-> 236
    //   #28	-> 240
    //   #29	-> 244
    //   #30	-> 249
    //   #31	-> 257
    //   #32	-> 271
    //   #33	-> 275
    //   #34	-> 280
    //   #35	-> 284
    //   #36	-> 287
    //   #37	-> 291
    //   #38	-> 295
    //   #39	-> 299
    //   #40	-> 306
    //   #41	-> 312
    //   #42	-> 316
    //   #43	-> 321
    //   #44	-> 325
    //   #45	-> 333
  }
  
  public void L5(float paramFloat1, float paramFloat2) {}
  
  public void Zg(float paramFloat1, float paramFloat2) {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */