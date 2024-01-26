package f;

public final class Z2 extends Tp {
  public Z2(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    super(paramArrayOffloat1, paramArrayOffloat2);
  }
  
  public Z2(int paramInt) {
    super(paramInt);
  }
  
  public final float kb(float paramFloat) {
    // Byte code:
    //   0: fload_1
    //   1: ldc 0.5
    //   3: fcmpg
    //   4: ifgt -> 58
    //   7: aload_0
    //   8: fload_1
    //   9: fconst_2
    //   10: fmul
    //   11: fconst_1
    //   12: swap
    //   13: fsub
    //   14: fstore_1
    //   15: getfield RR : [F
    //   18: iconst_0
    //   19: faload
    //   20: dup
    //   21: fstore_2
    //   22: fconst_2
    //   23: fdiv
    //   24: dup
    //   25: fstore_3
    //   26: fload_1
    //   27: fadd
    //   28: dup
    //   29: fstore #4
    //   31: fload_2
    //   32: fcmpg
    //   33: ifge -> 46
    //   36: fload #4
    //   38: fload_3
    //   39: fdiv
    //   40: fconst_1
    //   41: fsub
    //   42: fstore_0
    //   43: goto -> 52
    //   46: aload_0
    //   47: fload_1
    //   48: invokespecial kb : (F)F
    //   51: fstore_0
    //   52: fconst_1
    //   53: fload_0
    //   54: fsub
    //   55: fconst_2
    //   56: fdiv
    //   57: freturn
    //   58: aload_0
    //   59: fload_1
    //   60: fconst_2
    //   61: fmul
    //   62: fconst_1
    //   63: fsub
    //   64: fstore_1
    //   65: getfield RR : [F
    //   68: iconst_0
    //   69: faload
    //   70: dup
    //   71: fstore_2
    //   72: fconst_2
    //   73: fdiv
    //   74: dup
    //   75: fstore_3
    //   76: fload_1
    //   77: fadd
    //   78: dup
    //   79: fstore #4
    //   81: fload_2
    //   82: fcmpg
    //   83: ifge -> 96
    //   86: fload #4
    //   88: fload_3
    //   89: fdiv
    //   90: fconst_1
    //   91: fsub
    //   92: fstore_0
    //   93: goto -> 102
    //   96: aload_0
    //   97: fload_1
    //   98: invokespecial kb : (F)F
    //   101: fstore_0
    //   102: fload_0
    //   103: fconst_2
    //   104: fdiv
    //   105: ldc 0.5
    //   107: fadd
    //   108: freturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 15
    //   #2	-> 65
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Z2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */