package f;

public final class os0 implements Comparable {
  public final byte OF;
  
  public final float G1;
  
  public final int Ku;
  
  public os0(byte paramByte, float paramFloat, int paramInt) {
    this.OF = paramByte;
    this.G1 = paramFloat;
    this.Ku = paramInt;
  }
  
  public final int compareTo(Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast f/os0
    //   4: dup
    //   5: astore_1
    //   6: getfield OF : B
    //   9: dup
    //   10: istore_2
    //   11: aload_0
    //   12: getfield OF : B
    //   15: dup
    //   16: istore_3
    //   17: if_icmpeq -> 27
    //   20: iload_2
    //   21: iload_3
    //   22: isub
    //   23: istore_0
    //   24: goto -> 76
    //   27: aload_1
    //   28: getfield G1 : F
    //   31: dup
    //   32: fstore_2
    //   33: aload_0
    //   34: getfield G1 : F
    //   37: dup
    //   38: fstore_3
    //   39: fcmpl
    //   40: ifeq -> 52
    //   43: fload_2
    //   44: fload_3
    //   45: invokestatic compare : (FF)I
    //   48: istore_0
    //   49: goto -> 76
    //   52: aload_1
    //   53: getfield Ku : I
    //   56: dup
    //   57: istore_1
    //   58: aload_0
    //   59: getfield Ku : I
    //   62: dup
    //   63: istore_0
    //   64: if_icmpeq -> 74
    //   67: iload_1
    //   68: iload_0
    //   69: isub
    //   70: istore_0
    //   71: goto -> 76
    //   74: iconst_0
    //   75: istore_0
    //   76: iload_0
    //   77: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 6
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/os0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */