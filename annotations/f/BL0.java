package f;

public final class BL0 extends of {
  public BL0() {
    Xu("editfield");
    JD0(this::K60);
  }
  
  private void K60(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield F2 : Lf/ak0;
    //   4: invokevirtual toString : ()Ljava/lang/String;
    //   7: dup
    //   8: astore_1
    //   9: ifnull -> 43
    //   12: iconst_0
    //   13: istore_2
    //   14: iload_2
    //   15: aload_1
    //   16: invokevirtual length : ()I
    //   19: if_icmpge -> 43
    //   22: aload_1
    //   23: iload_2
    //   24: invokevirtual charAt : (I)C
    //   27: invokestatic isWhitespace : (C)Z
    //   30: ifeq -> 37
    //   33: iconst_1
    //   34: goto -> 44
    //   37: iinc #2, 1
    //   40: goto -> 14
    //   43: iconst_0
    //   44: ifeq -> 53
    //   47: aload_0
    //   48: ldc ''
    //   50: invokevirtual Zh : (Ljava/lang/String;)V
    //   53: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 16
    //   #3	-> 48
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */