package f;

public final class C1 extends ZK0 {
  public int s30;
  
  public int mR;
  
  public int c00;
  
  public C1(ZJ paramZJ, int paramInt1, int paramInt2, int paramInt3) {
    this.s30 = paramInt1;
    this.mR = paramInt2;
    this.c00 = paramInt3;
  }
  
  public final boolean kA0(xr0 paramxr0, tc paramtc, byte paramByte) {
    // Byte code:
    //   0: iload_3
    //   1: iconst_1
    //   2: if_icmpeq -> 7
    //   5: iconst_0
    //   6: ireturn
    //   7: aload_2
    //   8: getstatic f/km.a3 : Lf/vh0;
    //   11: getfield Ct : Lf/Jo;
    //   14: if_acmpeq -> 19
    //   17: iconst_0
    //   18: ireturn
    //   19: aload_0
    //   20: getfield c00 : I
    //   23: dup
    //   24: istore_1
    //   25: iconst_m1
    //   26: if_icmpeq -> 47
    //   29: iload_1
    //   30: aload_0
    //   31: getfield gr0 : Lf/ZJ;
    //   34: getfield Qf : [I
    //   37: aload_0
    //   38: getfield s30 : I
    //   41: iaload
    //   42: if_icmpeq -> 47
    //   45: iconst_1
    //   46: ireturn
    //   47: aload_0
    //   48: getfield gr0 : Lf/ZJ;
    //   51: dup
    //   52: astore_3
    //   53: getfield Zy : [I
    //   56: aload_0
    //   57: getfield s30 : I
    //   60: dup
    //   61: istore #4
    //   63: iaload
    //   64: dup
    //   65: istore #5
    //   67: iconst_m1
    //   68: if_icmpeq -> 308
    //   71: iload_1
    //   72: iconst_m1
    //   73: if_icmpne -> 81
    //   76: iconst_0
    //   77: istore_1
    //   78: goto -> 83
    //   81: iconst_1
    //   82: istore_1
    //   83: iload #5
    //   85: iload_1
    //   86: if_icmpeq -> 92
    //   89: goto -> 308
    //   92: aload_0
    //   93: getfield mR : I
    //   96: istore_1
    //   97: iconst_0
    //   98: istore #5
    //   100: iload #5
    //   102: aload_3
    //   103: getfield Cp0 : [[[S
    //   106: iload #4
    //   108: aaload
    //   109: dup
    //   110: astore #6
    //   112: arraylength
    //   113: if_icmpge -> 163
    //   116: iload #5
    //   118: iload_1
    //   119: if_icmpne -> 125
    //   122: goto -> 157
    //   125: aload #6
    //   127: iload #5
    //   129: aaload
    //   130: dup
    //   131: astore #6
    //   133: iconst_2
    //   134: saload
    //   135: dup
    //   136: istore #7
    //   138: iconst_m1
    //   139: if_icmpeq -> 169
    //   142: iload #7
    //   144: aload_3
    //   145: getfield Qf : [I
    //   148: iload #4
    //   150: iaload
    //   151: if_icmpne -> 157
    //   154: goto -> 169
    //   157: iinc #5, 1
    //   160: goto -> 100
    //   163: aload #6
    //   165: iload_1
    //   166: aaload
    //   167: astore #6
    //   169: aload_0
    //   170: dup
    //   171: aload_2
    //   172: getfield HW : Lf/G5;
    //   175: invokevirtual Ef0 : ()Lf/G5;
    //   178: dup
    //   179: astore_1
    //   180: iconst_1
    //   181: putfield g50 : B
    //   184: getfield gr0 : Lf/ZJ;
    //   187: dup
    //   188: getfield bJ0 : [Z
    //   191: aload_0
    //   192: getfield s30 : I
    //   195: dup
    //   196: istore_3
    //   197: iconst_1
    //   198: bastore
    //   199: getfield B : [Lf/lpt1;
    //   202: iload_3
    //   203: aaload
    //   204: iconst_2
    //   205: iconst_0
    //   206: aconst_null
    //   207: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   210: pop
    //   211: getstatic f/km.u4 : Lf/R8;
    //   214: iconst_1
    //   215: putfield tN : Z
    //   218: new f/T9
    //   221: dup
    //   222: astore_3
    //   223: aload_2
    //   224: invokespecial <init> : (Lf/tc;)V
    //   227: invokestatic k6 : ()Lf/HC;
    //   230: aload_3
    //   231: ldc 0.15
    //   233: invokevirtual S : (Lf/oo;F)Lf/oo;
    //   236: pop
    //   237: new f/x8
    //   240: dup
    //   241: astore_3
    //   242: aload_0
    //   243: aload_2
    //   244: invokespecial <init> : (Lf/C1;Lf/tc;)V
    //   247: getstatic f/nl.j : Lf/nl;
    //   250: getfield qf0 : I
    //   253: sipush #150
    //   256: iadd
    //   257: getstatic f/nl.Qj0 : Lf/nl;
    //   260: getfield qf0 : I
    //   263: iadd
    //   264: bipush #100
    //   266: iadd
    //   267: i2f
    //   268: ldc 1000.0
    //   270: fdiv
    //   271: fstore #4
    //   273: invokestatic k6 : ()Lf/HC;
    //   276: aload_3
    //   277: fload #4
    //   279: invokevirtual S : (Lf/oo;F)Lf/oo;
    //   282: pop
    //   283: getfield gr0 : Lf/ZJ;
    //   286: getfield Hk0 : [Ljava/lang/Runnable;
    //   289: aload_0
    //   290: getfield s30 : I
    //   293: new f/AP
    //   296: dup
    //   297: aload_0
    //   298: aload_2
    //   299: aload #6
    //   301: aload_1
    //   302: invokespecial <init> : (Lf/C1;Lf/tc;[SLf/G5;)V
    //   305: aastore
    //   306: iconst_1
    //   307: ireturn
    //   308: iconst_1
    //   309: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 11
    //   #2	-> 20
    //   #3	-> 103
    //   #4	-> 108
    //   #5	-> 172
    //   #6	-> 175
    //   #7	-> 181
    //   #8	-> 184
    //   #9	-> 207
    //   #10	-> 211
    //   #11	-> 215
    //   #12	-> 218
    //   #13	-> 227
    //   #14	-> 237
    //   #15	-> 250
    //   #16	-> 257
    //   #17	-> 260
    //   #18	-> 273
    //   #19	-> 283
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */