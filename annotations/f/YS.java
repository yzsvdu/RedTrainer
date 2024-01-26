package f;

public final class YS extends W2 {
  public final float w1;
  
  public YS(float paramFloat) {
    this.w1 = paramFloat * 2.0F;
  }
  
  public final float kb(float paramFloat) {
    // Byte code:
    //   0: fload_1
    //   1: ldc 0.5
    //   3: fcmpg
    //   4: ifgt -> 32
    //   7: aload_0
    //   8: fload_1
    //   9: fconst_2
    //   10: fmul
    //   11: dup
    //   12: dup
    //   13: fstore_0
    //   14: fmul
    //   15: fstore_1
    //   16: getfield w1 : F
    //   19: dup
    //   20: fstore_2
    //   21: fconst_1
    //   22: fadd
    //   23: fload_0
    //   24: fmul
    //   25: fload_2
    //   26: fsub
    //   27: fload_1
    //   28: fmul
    //   29: fconst_2
    //   30: fdiv
    //   31: freturn
    //   32: aload_0
    //   33: fload_1
    //   34: fconst_1
    //   35: fsub
    //   36: fconst_2
    //   37: fmul
    //   38: dup
    //   39: dup
    //   40: fstore_0
    //   41: fmul
    //   42: fstore_1
    //   43: getfield w1 : F
    //   46: dup
    //   47: fstore_2
    //   48: fconst_1
    //   49: fadd
    //   50: fload_0
    //   51: fmul
    //   52: fload_2
    //   53: fadd
    //   54: fload_1
    //   55: fmul
    //   56: fconst_2
    //   57: fdiv
    //   58: fconst_1
    //   59: fadd
    //   60: freturn
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YS.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */