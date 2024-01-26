package f;

public final class ei0 extends GS implements Np0 {
  public final short Xv;
  
  public final short Ml;
  
  public final byte gK;
  
  public final byte VK0;
  
  public final byte KX;
  
  public final short[] Yh0;
  
  public final byte[] Dt0;
  
  public final Ht0 zb0;
  
  public final Ht0 ud;
  
  public ei0(short paramShort1, byte paramByte1, short[] paramArrayOfshort, short paramShort2, byte paramByte2, byte paramByte3, byte[] paramArrayOfbyte, Ht0 paramHt01, Ht0 paramHt02) {
    this.Xv = paramShort1;
    this.gK = paramByte1;
    this.Yh0 = paramArrayOfshort;
    this.Ml = paramShort2;
    this.VK0 = paramByte2;
    this.KX = paramByte3;
    this.Dt0 = paramArrayOfbyte;
    if (paramHt01 == null)
      paramHt01 = Ht0.P00; 
    this.zb0 = paramHt01;
    if (paramHt02 == null)
      paramHt02 = Ht0.P00; 
    this.ud = paramHt02;
  }
  
  public final byte YG0() {
    return 31;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_1
    //   3: aload_0
    //   4: aload #7
    //   6: dup
    //   7: dup
    //   8: aload_1
    //   9: aload_0
    //   10: aload_1
    //   11: aload_0
    //   12: dup
    //   13: dup
    //   14: dup2
    //   15: getfield Xv : S
    //   18: istore_3
    //   19: getfield gK : B
    //   22: istore #4
    //   24: getfield Yh0 : [S
    //   27: astore #5
    //   29: getfield VK0 : B
    //   32: istore #6
    //   34: getfield KX : B
    //   37: istore #8
    //   39: iload_3
    //   40: iload #4
    //   42: aload #5
    //   44: aconst_null
    //   45: iload #6
    //   47: iload #8
    //   49: invokevirtual x10 : (SB[S[BBB)V
    //   52: getfield Ml : S
    //   55: putfield BC : S
    //   58: new f/pL
    //   61: dup
    //   62: astore_3
    //   63: aload_1
    //   64: dup
    //   65: getfield FT : B
    //   68: aload_1
    //   69: getfield ws : B
    //   72: invokestatic Vs0 : (BB)Lf/mJ;
    //   75: invokespecial <init> : (Lf/hm0;Lf/mJ;)V
    //   78: getfield YP : Ljava/util/LinkedList;
    //   81: aload_3
    //   82: invokevirtual add : (Ljava/lang/Object;)Z
    //   85: pop
    //   86: getstatic f/F40.ef0 : Lf/F40;
    //   89: astore_3
    //   90: getfield AD : Lf/Gp0;
    //   93: sipush #644
    //   96: aload_1
    //   97: aload_2
    //   98: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   101: istore_2
    //   102: iconst_2
    //   103: anewarray java/lang/String
    //   106: dup
    //   107: astore #4
    //   109: aload_0
    //   110: aload #4
    //   112: aload_1
    //   113: invokevirtual fA : ()Ljava/lang/String;
    //   116: iconst_0
    //   117: swap
    //   118: aastore
    //   119: getfield Xv : S
    //   122: ldc 150000
    //   124: iadd
    //   125: invokestatic OH0 : (I)Ljava/lang/String;
    //   128: iconst_1
    //   129: swap
    //   130: aastore
    //   131: iconst_2
    //   132: aload_3
    //   133: bipush #14
    //   135: iload_2
    //   136: aload #4
    //   138: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   141: invokevirtual Kq : (Ljava/lang/String;)V
    //   144: getfield zb0 : Lf/Ht0;
    //   147: putfield lPt1 : Lf/Ht0;
    //   150: getfield ud : Lf/Ht0;
    //   153: putfield se : Lf/Ht0;
    //   156: iconst_0
    //   157: istore_2
    //   158: iload_2
    //   159: aload_0
    //   160: getfield Dt0 : [B
    //   163: dup
    //   164: astore_3
    //   165: arraylength
    //   166: if_icmpge -> 197
    //   169: aload_1
    //   170: aload_3
    //   171: iload_2
    //   172: getstatic f/hR.Tt0 : [Lf/hR;
    //   175: iload_2
    //   176: aaload
    //   177: astore_3
    //   178: baload
    //   179: istore #4
    //   181: getfield wt : [B
    //   184: aload_3
    //   185: getfield dL : B
    //   188: iload #4
    //   190: bastore
    //   191: iinc #2, 1
    //   194: goto -> 158
    //   197: getstatic f/UB0.Kg0 : Lf/Q50;
    //   200: aload #7
    //   202: aload_1
    //   203: <illegal opcode> run : (Lf/kf;Lf/hm0;)Ljava/lang/Runnable;
    //   208: invokevirtual fN : (Ljava/lang/Runnable;)V
    //   211: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 55
    //   #2	-> 58
    //   #3	-> 65
    //   #4	-> 69
    //   #5	-> 72
    //   #6	-> 78
    //   #7	-> 82
    //   #8	-> 86
    //   #9	-> 90
    //   #10	-> 98
    //   #11	-> 138
    //   #12	-> 141
    //   #13	-> 147
    //   #14	-> 150
    //   #15	-> 153
    //   #16	-> 160
    //   #17	-> 181
    //   #18	-> 185
    //   #19	-> 190
    //   #20	-> 197
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ei0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */