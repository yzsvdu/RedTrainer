package f;

import java.util.Iterator;

public final class Gt extends rX implements Iterable, Iterator {
  public final cOm8 k70;
  
  public Gt(y10 paramy10) {
    super(paramy10);
    cOm8 cOm81;
    this();
    this.k70 = this;
  }
  
  public final boolean hasNext() {
    if (this.Jc)
      return this.gt0; 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Iterator iterator() {
    return this;
  }
  
  public final Object next() {
    // Byte code:
    //   0: aload_0
    //   1: getfield gt0 : Z
    //   4: ifeq -> 134
    //   7: aload_0
    //   8: getfield Jc : Z
    //   11: ifeq -> 124
    //   14: aload_0
    //   15: dup
    //   16: getfield dv0 : Lf/y10;
    //   19: dup
    //   20: astore_1
    //   21: getfield PG0 : [I
    //   24: astore_2
    //   25: getfield xn : I
    //   28: dup
    //   29: istore_3
    //   30: iconst_m1
    //   31: if_icmpne -> 54
    //   34: aload_0
    //   35: getfield k70 : Lf/cOm8;
    //   38: dup
    //   39: aload_1
    //   40: swap
    //   41: iconst_0
    //   42: putfield COm2 : I
    //   45: getfield vf0 : Ljava/lang/Object;
    //   48: putfield bH : Ljava/lang/Object;
    //   51: goto -> 75
    //   54: aload_0
    //   55: getfield k70 : Lf/cOm8;
    //   58: dup
    //   59: aload_1
    //   60: swap
    //   61: aload_2
    //   62: iload_3
    //   63: iaload
    //   64: putfield COm2 : I
    //   67: getfield Bu : [Ljava/lang/Object;
    //   70: iload_3
    //   71: aaload
    //   72: putfield bH : Ljava/lang/Object;
    //   75: aload_2
    //   76: aload_0
    //   77: iload_3
    //   78: putfield T1 : I
    //   81: arraylength
    //   82: istore_1
    //   83: aload_0
    //   84: getfield xn : I
    //   87: iconst_1
    //   88: iadd
    //   89: dup
    //   90: istore_3
    //   91: iload_1
    //   92: aload_0
    //   93: iload_3
    //   94: putfield xn : I
    //   97: if_icmpge -> 114
    //   100: aload_2
    //   101: iload_3
    //   102: iaload
    //   103: ifeq -> 83
    //   106: aload_0
    //   107: iconst_1
    //   108: putfield gt0 : Z
    //   111: goto -> 119
    //   114: aload_0
    //   115: iconst_0
    //   116: putfield gt0 : Z
    //   119: aload_0
    //   120: getfield k70 : Lf/cOm8;
    //   123: areturn
    //   124: new f/JU
    //   127: dup
    //   128: ldc '#iterator() cannot be used nested.'
    //   130: invokespecial <init> : (Ljava/lang/String;)V
    //   133: athrow
    //   134: new java/util/NoSuchElementException
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 81
    //   #3	-> 120
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */