package f;

import java.util.Iterator;

public final class j10 extends rX implements Iterable, Iterator {
  public j10(y10 paramy10) {
    super(paramy10);
  }
  
  public final boolean hasNext() {
    if (this.Jc)
      return this.gt0; 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Object next() {
    // Byte code:
    //   0: aload_0
    //   1: getfield gt0 : Z
    //   4: ifeq -> 112
    //   7: aload_0
    //   8: getfield Jc : Z
    //   11: ifeq -> 102
    //   14: aload_0
    //   15: getfield xn : I
    //   18: dup
    //   19: istore_1
    //   20: iconst_m1
    //   21: if_icmpne -> 35
    //   24: aload_0
    //   25: getfield dv0 : Lf/y10;
    //   28: getfield vf0 : Ljava/lang/Object;
    //   31: astore_2
    //   32: goto -> 45
    //   35: aload_0
    //   36: getfield dv0 : Lf/y10;
    //   39: getfield Bu : [Ljava/lang/Object;
    //   42: iload_1
    //   43: aaload
    //   44: astore_2
    //   45: aload_0
    //   46: dup
    //   47: iload_1
    //   48: putfield T1 : I
    //   51: getfield dv0 : Lf/y10;
    //   54: getfield PG0 : [I
    //   57: dup
    //   58: astore_1
    //   59: arraylength
    //   60: istore_3
    //   61: aload_0
    //   62: getfield xn : I
    //   65: iconst_1
    //   66: iadd
    //   67: dup
    //   68: istore #4
    //   70: iload_3
    //   71: aload_0
    //   72: iload #4
    //   74: putfield xn : I
    //   77: if_icmpge -> 95
    //   80: aload_1
    //   81: iload #4
    //   83: iaload
    //   84: ifeq -> 61
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield gt0 : Z
    //   92: goto -> 100
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield gt0 : Z
    //   100: aload_2
    //   101: areturn
    //   102: new f/JU
    //   105: dup
    //   106: ldc '#iterator() cannot be used nested.'
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: athrow
    //   112: new java/util/NoSuchElementException
    //   115: dup
    //   116: invokespecial <init> : ()V
    //   119: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 51
    //   #2	-> 102
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j10.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */