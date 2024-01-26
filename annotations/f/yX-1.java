package f;

import java.util.ArrayList;

public final class yX implements Comparable {
  public final DO mJ0;
  
  public final ArrayList U30;
  
  public yX(DO paramDO) {
    ArrayList arrayList;
    this();
    this.U30 = this;
    this.mJ0 = paramDO;
  }
  
  public final DO WT() {
    return this.mJ0;
  }
  
  public final ArrayList d6() {
    return this.U30;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/yX
    //   4: getfield mJ0 : Lf/DO;
    //   7: dup
    //   8: astore_1
    //   9: ifnull -> 39
    //   12: aload_0
    //   13: getfield mJ0 : Lf/DO;
    //   16: dup
    //   17: astore_0
    //   18: ifnonnull -> 24
    //   21: goto -> 39
    //   24: aload_1
    //   25: getfield y1 : B
    //   28: aload_0
    //   29: getfield y1 : B
    //   32: invokestatic compare : (II)I
    //   35: istore_0
    //   36: goto -> 50
    //   39: aload_1
    //   40: ifnonnull -> 48
    //   43: iconst_1
    //   44: istore_0
    //   45: goto -> 50
    //   48: iconst_m1
    //   49: istore_0
    //   50: iload_0
    //   51: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 4
    //   #2	-> 13
    //   #3	-> 25
    //   #4	-> 32
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */