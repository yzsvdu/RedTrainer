package f;

public final class Qp0 extends gT {
  public static final iq[] wu = new iq[0];
  
  public static final String[] f60 = new String[] { Ml0.OH0(7901), Ml0.OH0(7902), Ml0.OH0(7903), Ml0.OH0(7904), Ml0.OH0(7905) };
  
  public iq[] NA = wu;
  
  public final int Z80() {
    return this.NA.length;
  }
  
  public final int ED0() {
    return f60.length;
  }
  
  public final String zd(int paramInt) {
    return f60[paramInt];
  }
  
  public final Object Kx0(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield NA : [Lf/iq;
    //   4: iload_1
    //   5: aaload
    //   6: astore_0
    //   7: getstatic f/km.u4 : Lf/R8;
    //   10: getfield fF0 : Lf/BF;
    //   13: aload_0
    //   14: dup
    //   15: getfield Gp0 : B
    //   18: istore_1
    //   19: getfield Nf0 : S
    //   22: iload_1
    //   23: swap
    //   24: invokevirtual y5 : (BS)Z
    //   27: ifeq -> 54
    //   30: aload_0
    //   31: getfield HL0 : I
    //   34: dup
    //   35: istore_1
    //   36: ifeq -> 49
    //   39: getstatic f/Ml0.nW : Lf/Ut0;
    //   42: iload_1
    //   43: invokevirtual return : (I)Z
    //   46: ifeq -> 54
    //   49: iconst_1
    //   50: istore_1
    //   51: goto -> 56
    //   54: iconst_0
    //   55: istore_1
    //   56: iload_2
    //   57: tableswitch default -> 92, 0 -> 194, 1 -> 182, 2 -> 151, 3 -> 121, 4 -> 95
    //   92: ldc ''
    //   94: areturn
    //   95: iload_1
    //   96: ifne -> 102
    //   99: ldc '???'
    //   101: areturn
    //   102: invokestatic getInstance : ()Ljava/text/NumberFormat;
    //   105: aload_0
    //   106: getfield MW : S
    //   109: i2l
    //   110: invokevirtual format : (J)Ljava/lang/String;
    //   113: sipush #7911
    //   116: swap
    //   117: invokestatic Go : (ILjava/lang/String;)Ljava/lang/String;
    //   120: areturn
    //   121: iload_1
    //   122: ifne -> 128
    //   125: ldc '???'
    //   127: areturn
    //   128: aload_0
    //   129: invokevirtual d50 : ()I
    //   132: dup
    //   133: istore_0
    //   134: iconst_1
    //   135: if_icmpge -> 145
    //   138: sipush #7910
    //   141: invokestatic OH0 : (I)Ljava/lang/String;
    //   144: areturn
    //   145: iload_0
    //   146: iconst_1
    //   147: invokestatic Ya : (II)Ljava/lang/String;
    //   150: areturn
    //   151: iload_1
    //   152: ifne -> 158
    //   155: ldc '???'
    //   157: areturn
    //   158: new java/lang/StringBuilder
    //   161: dup
    //   162: aload_0
    //   163: swap
    //   164: invokespecial <init> : ()V
    //   167: invokevirtual Fk0 : ()B
    //   170: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   173: ldc '+'
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual toString : ()Ljava/lang/String;
    //   181: areturn
    //   182: iload_1
    //   183: ifne -> 189
    //   186: ldc '???'
    //   188: areturn
    //   189: aload_0
    //   190: invokevirtual Wa0 : ()Ljava/lang/String;
    //   193: areturn
    //   194: aload_0
    //   195: getfield hW : B
    //   198: ldc 250000
    //   200: iadd
    //   201: invokestatic OH0 : (I)Ljava/lang/String;
    //   204: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 10
    //   #2	-> 15
    //   #3	-> 19
    //   #4	-> 31
    //   #5	-> 39
    //   #6	-> 43
    //   #7	-> 92
    //   #8	-> 106
    //   #9	-> 110
    //   #10	-> 195
    //   #11	-> 201
  }
  
  public final Object ms(int paramInt1, int paramInt2) {
    return "";
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */