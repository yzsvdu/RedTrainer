package f;

import java.nio.ByteBuffer;

public final class Jw0 {
  public float rv0;
  
  public long nf;
  
  public int dd;
  
  public zB[] mL0;
  
  public lq0[] B70;
  
  public Jw0(ByteBuffer paramByteBuffer, int paramInt1, boolean paramBoolean, int paramInt2) {
    if (paramBoolean) {
      this.rv0 = paramByteBuffer.getInt() / 4096.0F;
      paramByteBuffer.getInt();
    } else {
      this.nf = paramByteBuffer.getInt() & 0xFFFFFFFFL;
      this.dd = paramByteBuffer.getInt();
      int i = paramByteBuffer.position();
      paramByteBuffer.position(this.dd + paramInt1);
      if ((this.nf & 0x20000000L) != 0L) {
        this.mL0 = new zB[paramInt2];
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
          zB zB1;
          this(paramByteBuffer);
          this.mL0[paramInt1] = zB1;
        } 
      } else {
        this.B70 = new lq0[paramInt2];
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
          lq0 lq01;
          this(paramByteBuffer);
          this.B70[paramInt1] = lq01;
        } 
      } 
      paramByteBuffer.position(i);
    } 
  }
  
  public final float wg0(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield mL0 : [Lf/zB;
    //   4: dup
    //   5: astore_2
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: getfield B70 : [Lf/lq0;
    //   13: ifnonnull -> 24
    //   16: aload_0
    //   17: getfield rv0 : F
    //   20: fstore_0
    //   21: goto -> 468
    //   24: aload_0
    //   25: getfield nf : J
    //   28: dup2
    //   29: dup2
    //   30: lstore_3
    //   31: ldc2_w 536805376
    //   34: land
    //   35: bipush #16
    //   37: lshr
    //   38: l2i
    //   39: istore #5
    //   41: ldc2_w 3221225472
    //   44: land
    //   45: lconst_0
    //   46: lcmp
    //   47: ifne -> 75
    //   50: aload_2
    //   51: ifnonnull -> 66
    //   54: aload_0
    //   55: getfield B70 : [Lf/lq0;
    //   58: iload_1
    //   59: aaload
    //   60: getfield Wz0 : F
    //   63: goto -> 20
    //   66: aload_2
    //   67: iload_1
    //   68: aaload
    //   69: getfield tB : F
    //   72: goto -> 20
    //   75: lload_3
    //   76: ldc2_w 1073741824
    //   79: land
    //   80: lconst_0
    //   81: lcmp
    //   82: ifeq -> 218
    //   85: iload_1
    //   86: iconst_1
    //   87: iand
    //   88: ifeq -> 189
    //   91: iload_1
    //   92: iload #5
    //   94: if_icmple -> 132
    //   97: aload_2
    //   98: ifnonnull -> 118
    //   101: aload_0
    //   102: getfield B70 : [Lf/lq0;
    //   105: iload #5
    //   107: iconst_1
    //   108: ishr
    //   109: iconst_1
    //   110: iadd
    //   111: aaload
    //   112: getfield Wz0 : F
    //   115: goto -> 20
    //   118: aload_2
    //   119: iload #5
    //   121: iconst_1
    //   122: ishr
    //   123: iconst_1
    //   124: iadd
    //   125: aaload
    //   126: getfield tB : F
    //   129: goto -> 20
    //   132: aload_2
    //   133: ifnonnull -> 165
    //   136: aload_0
    //   137: getfield B70 : [Lf/lq0;
    //   140: dup
    //   141: astore_0
    //   142: iload_1
    //   143: iconst_1
    //   144: ishr
    //   145: dup
    //   146: istore_1
    //   147: aaload
    //   148: getfield Wz0 : F
    //   151: aload_0
    //   152: iload_1
    //   153: iconst_1
    //   154: iadd
    //   155: aaload
    //   156: getfield Wz0 : F
    //   159: fadd
    //   160: fconst_2
    //   161: fdiv
    //   162: goto -> 20
    //   165: aload_2
    //   166: iload_1
    //   167: iconst_1
    //   168: ishr
    //   169: dup
    //   170: istore_0
    //   171: aaload
    //   172: getfield tB : F
    //   175: aload_2
    //   176: iload_0
    //   177: iconst_1
    //   178: iadd
    //   179: aaload
    //   180: getfield tB : F
    //   183: fadd
    //   184: fconst_2
    //   185: fdiv
    //   186: goto -> 20
    //   189: aload_2
    //   190: ifnonnull -> 207
    //   193: aload_0
    //   194: getfield B70 : [Lf/lq0;
    //   197: iload_1
    //   198: iconst_1
    //   199: ishr
    //   200: aaload
    //   201: getfield Wz0 : F
    //   204: goto -> 20
    //   207: aload_2
    //   208: iload_1
    //   209: iconst_1
    //   210: ishr
    //   211: aaload
    //   212: getfield tB : F
    //   215: goto -> 20
    //   218: lload_3
    //   219: ldc2_w 2147483648
    //   222: land
    //   223: lconst_0
    //   224: lcmp
    //   225: ifeq -> 464
    //   228: iload_1
    //   229: iconst_3
    //   230: iand
    //   231: dup
    //   232: istore_3
    //   233: ifeq -> 435
    //   236: iload_1
    //   237: iload #5
    //   239: if_icmple -> 277
    //   242: aload_2
    //   243: ifnonnull -> 263
    //   246: aload_0
    //   247: getfield B70 : [Lf/lq0;
    //   250: iload #5
    //   252: iconst_2
    //   253: ishr
    //   254: iload_3
    //   255: iadd
    //   256: aaload
    //   257: getfield Wz0 : F
    //   260: goto -> 20
    //   263: aload_2
    //   264: iload #5
    //   266: iconst_2
    //   267: ishr
    //   268: iload_3
    //   269: iadd
    //   270: aaload
    //   271: getfield tB : F
    //   274: goto -> 20
    //   277: iload_1
    //   278: iconst_1
    //   279: iand
    //   280: ifeq -> 375
    //   283: iload_1
    //   284: iconst_2
    //   285: iand
    //   286: ifeq -> 300
    //   289: iload_1
    //   290: iconst_2
    //   291: ishr
    //   292: dup
    //   293: istore_1
    //   294: iconst_1
    //   295: iadd
    //   296: istore_3
    //   297: goto -> 308
    //   300: iload_1
    //   301: iconst_2
    //   302: ishr
    //   303: dup
    //   304: istore_3
    //   305: iconst_1
    //   306: iadd
    //   307: istore_1
    //   308: aload_2
    //   309: ifnull -> 339
    //   312: aload_2
    //   313: iload_3
    //   314: aaload
    //   315: getfield tB : F
    //   318: dup
    //   319: dup
    //   320: fstore_0
    //   321: aload_2
    //   322: iload_1
    //   323: aaload
    //   324: getfield tB : F
    //   327: fstore_1
    //   328: fadd
    //   329: fload_0
    //   330: fadd
    //   331: fload_1
    //   332: fadd
    //   333: ldc 4.0
    //   335: fdiv
    //   336: goto -> 20
    //   339: aload_0
    //   340: getfield B70 : [Lf/lq0;
    //   343: dup
    //   344: astore_0
    //   345: iload_3
    //   346: aaload
    //   347: getfield Wz0 : F
    //   350: aload_0
    //   351: iload_1
    //   352: aaload
    //   353: getfield Wz0 : F
    //   356: fstore_0
    //   357: f2d
    //   358: dup2
    //   359: dup2
    //   360: dstore_2
    //   361: dadd
    //   362: dload_2
    //   363: dadd
    //   364: fload_0
    //   365: f2d
    //   366: dadd
    //   367: ldc2_w 2.0
    //   370: ddiv
    //   371: d2f
    //   372: goto -> 20
    //   375: aload_2
    //   376: ifnonnull -> 411
    //   379: aload_0
    //   380: getfield B70 : [Lf/lq0;
    //   383: dup
    //   384: astore_0
    //   385: iload_1
    //   386: iconst_2
    //   387: ishr
    //   388: dup
    //   389: aload_0
    //   390: swap
    //   391: aaload
    //   392: getfield Wz0 : F
    //   395: fconst_2
    //   396: fdiv
    //   397: fstore_0
    //   398: iconst_1
    //   399: iadd
    //   400: aaload
    //   401: getfield Wz0 : F
    //   404: fconst_2
    //   405: fdiv
    //   406: fload_0
    //   407: fadd
    //   408: goto -> 20
    //   411: aload_2
    //   412: iload_1
    //   413: iconst_2
    //   414: ishr
    //   415: dup
    //   416: istore_0
    //   417: aaload
    //   418: getfield tB : F
    //   421: aload_2
    //   422: iload_0
    //   423: iconst_1
    //   424: iadd
    //   425: aaload
    //   426: getfield tB : F
    //   429: fadd
    //   430: fconst_2
    //   431: fdiv
    //   432: goto -> 20
    //   435: aload_2
    //   436: ifnonnull -> 453
    //   439: aload_0
    //   440: getfield B70 : [Lf/lq0;
    //   443: iload_1
    //   444: iconst_2
    //   445: ishr
    //   446: aaload
    //   447: getfield Wz0 : F
    //   450: goto -> 20
    //   453: aload_2
    //   454: iload_1
    //   455: iconst_2
    //   456: ishr
    //   457: aaload
    //   458: getfield tB : F
    //   461: goto -> 20
    //   464: fconst_1
    //   465: goto -> 20
    //   468: fload_0
    //   469: freturn
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */