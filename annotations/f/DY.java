package f;

public final class DY extends GS implements Np0 {
  public final byte FZ;
  
  public final short z20;
  
  public DY(byte paramByte, short paramShort) {
    this.FZ = paramByte;
    this.z20 = paramShort;
  }
  
  public final byte YG0() {
    return 114;
  }
  
  public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic f/Of.eH : Lf/Of;
    //   4: aload_0
    //   5: getfield z20 : S
    //   8: invokevirtual On0 : (S)Lf/LPT3;
    //   11: astore_3
    //   12: ifnonnull -> 16
    //   15: return
    //   16: aload_0
    //   17: getfield FZ : B
    //   20: i2s
    //   21: dup
    //   22: istore_0
    //   23: ifeq -> 93
    //   26: iload_0
    //   27: iconst_1
    //   28: if_icmpeq -> 34
    //   31: goto -> 164
    //   34: aload #7
    //   36: dup
    //   37: getstatic f/F40.ef0 : Lf/F40;
    //   40: astore_0
    //   41: bipush #14
    //   43: istore_2
    //   44: getfield AD : Lf/Gp0;
    //   47: sipush #1038
    //   50: aload_1
    //   51: invokevirtual ex : (ILf/hm0;)I
    //   54: istore #4
    //   56: iconst_2
    //   57: anewarray java/lang/String
    //   60: dup
    //   61: dup
    //   62: astore #5
    //   64: aload_1
    //   65: invokevirtual fA : ()Ljava/lang/String;
    //   68: iconst_0
    //   69: swap
    //   70: aastore
    //   71: iconst_1
    //   72: aload_3
    //   73: getfield Iu : I
    //   76: invokestatic OH0 : (I)Ljava/lang/String;
    //   79: aastore
    //   80: iconst_2
    //   81: aload_0
    //   82: iload_2
    //   83: iload #4
    //   85: aload #5
    //   87: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   90: goto -> 161
    //   93: aload #7
    //   95: dup
    //   96: getstatic f/F40.ef0 : Lf/F40;
    //   99: astore_0
    //   100: bipush #14
    //   102: istore #4
    //   104: getfield AD : Lf/Gp0;
    //   107: sipush #1031
    //   110: aload_1
    //   111: aload_2
    //   112: invokevirtual Q40 : (ILf/hm0;Lf/hm0;)I
    //   115: istore #5
    //   117: iconst_3
    //   118: anewarray java/lang/String
    //   121: dup
    //   122: dup
    //   123: astore #6
    //   125: aload_2
    //   126: aload #6
    //   128: aload_1
    //   129: invokevirtual fA : ()Ljava/lang/String;
    //   132: iconst_0
    //   133: swap
    //   134: aastore
    //   135: invokevirtual fA : ()Ljava/lang/String;
    //   138: iconst_1
    //   139: swap
    //   140: aastore
    //   141: iconst_2
    //   142: aload_3
    //   143: getfield Iu : I
    //   146: invokestatic OH0 : (I)Ljava/lang/String;
    //   149: aastore
    //   150: iconst_2
    //   151: aload_0
    //   152: iload #4
    //   154: iload #5
    //   156: aload #6
    //   158: invokestatic lz : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
    //   161: invokevirtual Kq : (Ljava/lang/String;)V
    //   164: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 5
    //   #3	-> 8
    //   #4	-> 17
    //   #5	-> 37
    //   #6	-> 44
    //   #7	-> 51
    //   #8	-> 73
    //   #9	-> 79
    //   #10	-> 87
    //   #11	-> 96
    //   #12	-> 104
    //   #13	-> 112
    //   #14	-> 143
    //   #15	-> 149
    //   #16	-> 158
    //   #17	-> 161
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */