package f;

public final class zz0 {
  public int GM;
  
  public int Yx0;
  
  public float[] OX;
  
  public int[] jl;
  
  public float[] Fv = new float[1024];
  
  public float[] Nq = new float[1024];
  
  public final void c6(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: iload_1
    //   3: aload_0
    //   4: iload_1
    //   5: aload_0
    //   6: iload_1
    //   7: aload_0
    //   8: iload_1
    //   9: iconst_4
    //   10: idiv
    //   11: dup
    //   12: istore_2
    //   13: newarray int
    //   15: putfield jl : [I
    //   18: iload_2
    //   19: iadd
    //   20: newarray float
    //   22: putfield OX : [F
    //   25: i2d
    //   26: dup2
    //   27: dstore_3
    //   28: invokestatic log : (D)D
    //   31: ldc2_w 2.0
    //   34: invokestatic log : (D)D
    //   37: ddiv
    //   38: invokestatic rint : (D)D
    //   41: d2i
    //   42: putfield Yx0 : I
    //   45: putfield GM : I
    //   48: iconst_0
    //   49: istore #5
    //   51: iconst_1
    //   52: istore #6
    //   54: iconst_2
    //   55: idiv
    //   56: dup
    //   57: istore #7
    //   59: iload #5
    //   61: iadd
    //   62: dup
    //   63: istore #8
    //   65: iload #7
    //   67: iload #8
    //   69: iconst_1
    //   70: iadd
    //   71: istore #7
    //   73: iadd
    //   74: dup
    //   75: istore #9
    //   77: iconst_1
    //   78: iadd
    //   79: istore #10
    //   81: iconst_0
    //   82: istore #11
    //   84: iload #11
    //   86: iload_2
    //   87: if_icmpge -> 201
    //   90: aload_0
    //   91: dup
    //   92: dup2
    //   93: getfield OX : [F
    //   96: iload #5
    //   98: iload #11
    //   100: iconst_2
    //   101: imul
    //   102: dup
    //   103: istore #12
    //   105: iadd
    //   106: ldc2_w 3.141592653589793
    //   109: dload_3
    //   110: ddiv
    //   111: iload #11
    //   113: iconst_4
    //   114: imul
    //   115: i2d
    //   116: dmul
    //   117: dup2
    //   118: dstore #13
    //   120: invokestatic cos : (D)D
    //   123: d2f
    //   124: fastore
    //   125: getfield OX : [F
    //   128: iload #6
    //   130: iload #12
    //   132: iadd
    //   133: dup
    //   134: istore #15
    //   136: dload #13
    //   138: invokestatic sin : (D)D
    //   141: dneg
    //   142: d2f
    //   143: fastore
    //   144: getfield OX : [F
    //   147: iload_1
    //   148: iload #8
    //   150: iload #12
    //   152: iadd
    //   153: istore #13
    //   155: iconst_2
    //   156: imul
    //   157: i2d
    //   158: dstore #16
    //   160: iload #13
    //   162: ldc2_w 3.141592653589793
    //   165: dload #16
    //   167: ddiv
    //   168: iload #15
    //   170: i2d
    //   171: dmul
    //   172: dup2
    //   173: dstore #13
    //   175: invokestatic cos : (D)D
    //   178: d2f
    //   179: fastore
    //   180: getfield OX : [F
    //   183: iload #7
    //   185: iload #12
    //   187: iadd
    //   188: dload #13
    //   190: invokestatic sin : (D)D
    //   193: d2f
    //   194: fastore
    //   195: iinc #11, 1
    //   198: goto -> 84
    //   201: iconst_0
    //   202: istore_2
    //   203: iload_2
    //   204: iload_1
    //   205: bipush #8
    //   207: idiv
    //   208: dup
    //   209: istore #5
    //   211: if_icmpge -> 270
    //   214: aload_0
    //   215: dup
    //   216: getfield OX : [F
    //   219: iload #9
    //   221: iload_2
    //   222: iconst_2
    //   223: imul
    //   224: dup
    //   225: istore #5
    //   227: iadd
    //   228: ldc2_w 3.141592653589793
    //   231: dload_3
    //   232: ddiv
    //   233: iload_2
    //   234: iconst_4
    //   235: imul
    //   236: iconst_2
    //   237: iadd
    //   238: i2d
    //   239: dmul
    //   240: dup2
    //   241: dstore #6
    //   243: invokestatic cos : (D)D
    //   246: d2f
    //   247: fastore
    //   248: getfield OX : [F
    //   251: iload #10
    //   253: iload #5
    //   255: iadd
    //   256: dload #6
    //   258: invokestatic sin : (D)D
    //   261: dneg
    //   262: d2f
    //   263: fastore
    //   264: iinc #2, 1
    //   267: goto -> 203
    //   270: aload_0
    //   271: getfield Yx0 : I
    //   274: dup
    //   275: iconst_1
    //   276: isub
    //   277: iconst_1
    //   278: swap
    //   279: ishl
    //   280: iconst_1
    //   281: isub
    //   282: istore_1
    //   283: iconst_2
    //   284: isub
    //   285: iconst_1
    //   286: swap
    //   287: ishl
    //   288: istore_2
    //   289: iconst_0
    //   290: istore_3
    //   291: iload_3
    //   292: iload #5
    //   294: if_icmpge -> 367
    //   297: iconst_0
    //   298: istore #4
    //   300: iconst_0
    //   301: istore #6
    //   303: iload_2
    //   304: iload #6
    //   306: iushr
    //   307: dup
    //   308: istore #7
    //   310: ifeq -> 335
    //   313: iload #7
    //   315: iload_3
    //   316: iand
    //   317: ifeq -> 329
    //   320: iload #4
    //   322: iconst_1
    //   323: iload #6
    //   325: ishl
    //   326: ior
    //   327: istore #4
    //   329: iinc #6, 1
    //   332: goto -> 303
    //   335: aload_0
    //   336: getfield jl : [I
    //   339: dup
    //   340: astore #6
    //   342: iload_3
    //   343: iconst_2
    //   344: imul
    //   345: dup
    //   346: aload #6
    //   348: swap
    //   349: iload #4
    //   351: iconst_m1
    //   352: ixor
    //   353: iload_1
    //   354: iand
    //   355: iastore
    //   356: iconst_1
    //   357: iadd
    //   358: iload #4
    //   360: iastore
    //   361: iinc #3, 1
    //   364: goto -> 291
    //   367: return
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */