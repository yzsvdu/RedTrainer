package f;

public final class nv0 implements Comparable {
  public final boolean v10;
  
  public final WD rd0;
  
  public final int ik0;
  
  public nv0(WD paramWD, boolean paramBoolean, int paramInt) {
    this.rd0 = paramWD;
    this.v10 = paramBoolean;
    this.ik0 = paramInt;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/nv0
    //   4: dup
    //   5: astore_1
    //   6: getfield v10 : Z
    //   9: dup
    //   10: istore_2
    //   11: aload_0
    //   12: getfield v10 : Z
    //   15: dup
    //   16: istore_3
    //   17: if_icmpeq -> 29
    //   20: iload_2
    //   21: iload_3
    //   22: invokestatic compare : (ZZ)I
    //   25: istore_0
    //   26: goto -> 53
    //   29: aload_0
    //   30: getfield rd0 : Lf/WD;
    //   33: getfield iz : I
    //   36: invokestatic OH0 : (I)Ljava/lang/String;
    //   39: aload_1
    //   40: getfield rd0 : Lf/WD;
    //   43: getfield iz : I
    //   46: invokestatic OH0 : (I)Ljava/lang/String;
    //   49: invokevirtual compareTo : (Ljava/lang/String;)I
    //   52: istore_0
    //   53: iload_0
    //   54: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
    //   #2	-> 33
    //   #3	-> 36
    //   #4	-> 40
    //   #5	-> 43
    //   #6	-> 46
    //   #7	-> 49
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nv0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */