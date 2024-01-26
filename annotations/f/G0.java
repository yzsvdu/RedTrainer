package f;

public final class G0 extends GS implements Np0 {
  public final byte tn;
  
  public final short vu0;
  
  public G0(byte paramByte, short paramShort) {
    this.tn = paramByte;
    this.vu0 = paramShort;
  }
  
  public final byte YG0() {
    return 46;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_0
    //   1: getfield tn : B
    //   4: dup
    //   5: istore_1
    //   6: ifeq -> 144
    //   9: iload_1
    //   10: iconst_1
    //   11: if_icmpeq -> 77
    //   14: iload_1
    //   15: iconst_2
    //   16: if_icmpeq -> 22
    //   19: goto -> 216
    //   22: aload_2
    //   23: aload #7
    //   25: dup
    //   26: getstatic f/F40.ef0 : Lf/F40;
    //   29: astore_0
    //   30: bipush #14
    //   32: istore_1
    //   33: getfield AD : Lf/Gp0;
    //   36: sipush #598
    //   39: aload_2
    //   40: invokevirtual ex : (ILf/hm0;)I
    //   43: istore_3
    //   44: iconst_1
    //   45: anewarray java/lang/String
    //   48: dup
    //   49: astore #4
    //   51: aload_2
    //   52: invokevirtual fA : ()Ljava/lang/String;
    //   55: iconst_0
    //   56: swap
    //   57: aastore
    //   58: iconst_2
    //   59: aload_0
    //   60: iload_1
    //   61: iload_3
    //   62: aload #4
    //   64: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   67: invokevirtual Kq : (Ljava/lang/String;)V
    //   70: iconst_m1
    //   71: putfield yj0 : S
    //   74: goto -> 216
    //   77: aload #7
    //   79: dup
    //   80: getstatic f/F40.ef0 : Lf/F40;
    //   83: astore_1
    //   84: bipush #14
    //   86: istore_3
    //   87: getfield AD : Lf/Gp0;
    //   90: sipush #595
    //   93: aload_2
    //   94: invokevirtual ex : (ILf/hm0;)I
    //   97: istore #4
    //   99: iconst_2
    //   100: anewarray java/lang/String
    //   103: dup
    //   104: dup
    //   105: astore #5
    //   107: aload_2
    //   108: invokevirtual fA : ()Ljava/lang/String;
    //   111: iconst_0
    //   112: swap
    //   113: aastore
    //   114: iconst_1
    //   115: aload_0
    //   116: ldc 110000
    //   118: istore_0
    //   119: getfield vu0 : S
    //   122: iload_0
    //   123: iadd
    //   124: invokestatic OH0 : (I)Ljava/lang/String;
    //   127: aastore
    //   128: iconst_2
    //   129: aload_1
    //   130: iload_3
    //   131: iload #4
    //   133: aload #5
    //   135: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   138: invokevirtual Kq : (Ljava/lang/String;)V
    //   141: goto -> 216
    //   144: aload_2
    //   145: aload_0
    //   146: aload #7
    //   148: dup
    //   149: getstatic f/F40.ef0 : Lf/F40;
    //   152: astore_1
    //   153: bipush #14
    //   155: istore_3
    //   156: getfield AD : Lf/Gp0;
    //   159: sipush #592
    //   162: aload_2
    //   163: invokevirtual ex : (ILf/hm0;)I
    //   166: istore #4
    //   168: iconst_2
    //   169: anewarray java/lang/String
    //   172: dup
    //   173: dup
    //   174: astore #5
    //   176: aload_2
    //   177: invokevirtual fA : ()Ljava/lang/String;
    //   180: iconst_0
    //   181: swap
    //   182: aastore
    //   183: iconst_1
    //   184: aload_0
    //   185: ldc 110000
    //   187: istore_0
    //   188: getfield vu0 : S
    //   191: iload_0
    //   192: iadd
    //   193: invokestatic OH0 : (I)Ljava/lang/String;
    //   196: aastore
    //   197: iconst_2
    //   198: aload_1
    //   199: iload_3
    //   200: iload #4
    //   202: aload #5
    //   204: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   207: invokevirtual Kq : (Ljava/lang/String;)V
    //   210: getfield vu0 : S
    //   213: goto -> 71
    //   216: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 26
    //   #3	-> 33
    //   #4	-> 40
    //   #5	-> 64
    //   #6	-> 67
    //   #7	-> 71
    //   #8	-> 80
    //   #9	-> 87
    //   #10	-> 94
    //   #11	-> 119
    //   #12	-> 124
    //   #13	-> 135
    //   #14	-> 138
    //   #15	-> 156
    //   #16	-> 163
    //   #17	-> 188
    //   #18	-> 193
    //   #19	-> 204
    //   #20	-> 207
    //   #21	-> 210
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */