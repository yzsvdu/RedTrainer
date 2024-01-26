package f;

public final class ED0 extends dj {
  public static final long AH;
  
  public static long YA0 = AH = dj.tv0("environmentCubemap");
  
  public final IX ep;
  
  public static final boolean Z2(long paramLong) {
    return ((paramLong & YA0) != 0L);
  }
  
  public ED0(long paramLong) {
    super(paramLong);
    if (Z2(paramLong)) {
      IX iX;
      this();
      this.ep = this;
      return;
    } 
    throw new JU("Invalid type specified");
  }
  
  public ED0(long paramLong, IX paramIX) {
    this(paramLong);
    this.ep.jf0(paramIX);
  }
  
  public ED0(long paramLong, Am0 paramAm0) {
    this(paramLong);
    this.ep.ze = paramAm0;
  }
  
  public ED0(ED0 paramED0) {
    this(l, iX);
  }
  
  public final dj Mi0() {
    return new ED0(this);
  }
  
  public final int hashCode() {
    int i = super.hashCode() * 967;
    return this.ep.hashCode() + i;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: checkcast f/dj
    //   5: astore_1
    //   6: getfield tL : J
    //   9: dup2
    //   10: lstore_2
    //   11: aload_1
    //   12: getfield tL : J
    //   15: dup2
    //   16: lstore #4
    //   18: lcmp
    //   19: ifeq -> 31
    //   22: lload_2
    //   23: lload #4
    //   25: lsub
    //   26: l2i
    //   27: istore_0
    //   28: goto -> 46
    //   31: aload_0
    //   32: getfield ep : Lf/IX;
    //   35: aload_1
    //   36: checkcast f/ED0
    //   39: getfield ep : Lf/IX;
    //   42: invokevirtual e10 : (Lf/IX;)I
    //   45: istore_0
    //   46: iload_0
    //   47: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ED0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */