package f;

public final class Nj extends Un {
  public int Ga;
  
  public int K2;
  
  public boolean jV;
  
  public c30 a4;
  
  public Nj() {}
  
  public Nj(Sa0 paramSa0) {
    super(paramSa0, 0);
  }
  
  public final String TI() {
    return "draggablebutton";
  }
  
  public final void p9(c30 paramc30) {
    this.a4 = paramc30;
  }
  
  public final boolean i2(oa0 paramoa0) {
    // Byte code:
    //   0: aload_1
    //   1: getfield cz0 : I
    //   4: dup
    //   5: istore_2
    //   6: invokestatic Pg : (I)Z
    //   9: ifeq -> 124
    //   12: aload_0
    //   13: getfield jV : Z
    //   16: ifeq -> 124
    //   19: iload_2
    //   20: bipush #6
    //   22: if_icmpne -> 58
    //   25: aload_0
    //   26: getfield a4 : Lf/c30;
    //   29: dup
    //   30: astore_2
    //   31: ifnull -> 58
    //   34: aload_2
    //   35: aload_1
    //   36: getfield aK : I
    //   39: aload_0
    //   40: getfield Ga : I
    //   43: isub
    //   44: aload_1
    //   45: getfield gk0 : I
    //   48: aload_0
    //   49: getfield K2 : I
    //   52: isub
    //   53: invokeinterface lG0 : (II)V
    //   58: aload_1
    //   59: invokevirtual Ud : ()Z
    //   62: ifeq -> 122
    //   65: aload_0
    //   66: getfield a4 : Lf/c30;
    //   69: dup
    //   70: astore_2
    //   71: ifnull -> 80
    //   74: aload_2
    //   75: invokeinterface Hk : ()V
    //   80: aload_0
    //   81: dup
    //   82: dup2
    //   83: iconst_0
    //   84: putfield jV : Z
    //   87: getfield TG0 : Lf/protected;
    //   90: iconst_0
    //   91: invokevirtual Bq : (Z)V
    //   94: getfield TG0 : Lf/protected;
    //   97: iconst_0
    //   98: invokevirtual hB : (Z)V
    //   101: getfield TG0 : Lf/protected;
    //   104: aload_0
    //   105: aload_1
    //   106: dup
    //   107: getfield aK : I
    //   110: istore_0
    //   111: getfield gk0 : I
    //   114: iload_0
    //   115: swap
    //   116: invokevirtual mu0 : (II)Z
    //   119: invokevirtual zb : (Z)V
    //   122: iconst_1
    //   123: ireturn
    //   124: iload_2
    //   125: invokestatic yE : (I)I
    //   128: dup
    //   129: istore_2
    //   130: iconst_2
    //   131: if_icmpeq -> 203
    //   134: iload_2
    //   135: iconst_5
    //   136: if_icmpeq -> 142
    //   139: goto -> 219
    //   142: getstatic f/Nj.gy : Z
    //   145: ifne -> 166
    //   148: aload_0
    //   149: getfield jV : Z
    //   152: ifne -> 158
    //   155: goto -> 166
    //   158: new java/lang/AssertionError
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: athrow
    //   166: aload_0
    //   167: dup
    //   168: dup2
    //   169: iconst_1
    //   170: putfield jV : Z
    //   173: getfield TG0 : Lf/protected;
    //   176: iconst_0
    //   177: invokevirtual Bq : (Z)V
    //   180: getfield TG0 : Lf/protected;
    //   183: iconst_1
    //   184: invokevirtual hB : (Z)V
    //   187: getfield a4 : Lf/c30;
    //   190: dup
    //   191: astore_0
    //   192: ifnull -> 201
    //   195: aload_0
    //   196: invokeinterface U8 : ()V
    //   201: iconst_1
    //   202: ireturn
    //   203: aload_0
    //   204: aload_1
    //   205: aload_0
    //   206: aload_1
    //   207: getfield aK : I
    //   210: putfield Ga : I
    //   213: getfield gk0 : I
    //   216: putfield K2 : I
    //   219: aload_0
    //   220: aload_1
    //   221: invokespecial i2 : (Lf/oa0;)Z
    //   224: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 6
    //   #3	-> 13
    //   #4	-> 36
    //   #5	-> 40
    //   #6	-> 45
    //   #7	-> 49
    //   #8	-> 66
    //   #9	-> 87
    //   #10	-> 91
    //   #11	-> 94
    //   #12	-> 98
    //   #13	-> 101
    //   #14	-> 107
    //   #15	-> 111
    //   #16	-> 116
    //   #17	-> 119
    //   #18	-> 125
    //   #19	-> 173
    //   #20	-> 177
    //   #21	-> 180
    //   #22	-> 184
    //   #23	-> 207
    //   #24	-> 210
    //   #25	-> 213
    //   #26	-> 216
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */