package f;

public final class Xf0 extends dj {
  public static final long xZ = dj.tv0("cullface");
  
  public int S90;
  
  public Xf0(long paramLong) {
    super(paramLong);
  }
  
  public Xf0(long paramLong, int paramInt) {
    super(paramLong);
    this.S90 = paramInt;
  }
  
  public final dj Mi0() {
    long l = this.tL;
    int i = this.S90;
    return new Xf0(l, i);
  }
  
  public final int hashCode() {
    return super.hashCode() * 983 + this.S90;
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
    //   28: goto -> 44
    //   31: aload_0
    //   32: getfield S90 : I
    //   35: aload_1
    //   36: checkcast f/Xf0
    //   39: getfield S90 : I
    //   42: isub
    //   43: istore_0
    //   44: iload_0
    //   45: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xf0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */