package f;

public final class Mt0 implements Comparable {
  public final int XZ;
  
  public final int oi;
  
  public Mt0(int paramInt1, int paramInt2) {
    this.XZ = paramInt1;
    this.oi = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject == null || !(paramObject instanceof Mt0)) ? false : ((((Mt0)(paramObject = paramObject)).XZ == this.XZ && ((Mt0)paramObject).oi == this.oi));
  }
  
  public final int hashCode() {
    return this.XZ | this.oi << 16;
  }
  
  public final String toString() {
    this(32);
    stringBuilder.append(this.XZ);
    stringBuilder.append(" x ");
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append(this.oi);
    return (new StringBuilder()).toString();
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: checkcast f/Mt0
    //   5: astore_1
    //   6: getfield oi : I
    //   9: dup
    //   10: istore_2
    //   11: aload_1
    //   12: getfield oi : I
    //   15: dup
    //   16: istore_3
    //   17: if_icmpeq -> 27
    //   20: iload_3
    //   21: iload_2
    //   22: isub
    //   23: istore_0
    //   24: goto -> 37
    //   27: aload_1
    //   28: getfield XZ : I
    //   31: aload_0
    //   32: getfield XZ : I
    //   35: isub
    //   36: istore_0
    //   37: iload_0
    //   38: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Mt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */