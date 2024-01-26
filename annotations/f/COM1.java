package f;

public final class COM1 extends H00 {
  public final mA Dk0;
  
  public COM1(mA parammA) {
    super((byte)12, parammA.cQ());
    this.Dk0 = parammA;
  }
  
  public final boolean fy(Q90 paramQ90, UD0 paramUD0) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Dk0 : Lf/mA;
    //   4: dup
    //   5: astore_0
    //   6: getstatic f/mA.IF : Lf/mA;
    //   9: if_acmpne -> 31
    //   12: aload_1
    //   13: dup
    //   14: getfield wH : [Lf/mA;
    //   17: arraylength
    //   18: istore_0
    //   19: invokevirtual tm0 : ()Z
    //   22: iload_0
    //   23: iadd
    //   24: i2b
    //   25: ifle -> 59
    //   28: goto -> 54
    //   31: aload_0
    //   32: getstatic f/mA.uZ : Lf/mA;
    //   35: if_acmpne -> 64
    //   38: aload_1
    //   39: dup
    //   40: getfield wH : [Lf/mA;
    //   43: arraylength
    //   44: istore_0
    //   45: invokevirtual tm0 : ()Z
    //   48: iload_0
    //   49: iadd
    //   50: i2b
    //   51: ifne -> 59
    //   54: iconst_1
    //   55: istore_0
    //   56: goto -> 115
    //   59: iconst_0
    //   60: istore_0
    //   61: goto -> 115
    //   64: aload_0
    //   65: aload_1
    //   66: invokevirtual getClass : ()Ljava/lang/Class;
    //   69: pop
    //   70: getstatic f/mA.Wh0 : Lf/mA;
    //   73: if_acmpne -> 84
    //   76: aload_1
    //   77: invokevirtual tm0 : ()Z
    //   80: istore_0
    //   81: goto -> 115
    //   84: aload_1
    //   85: getfield wH : [Lf/mA;
    //   88: dup
    //   89: astore_1
    //   90: arraylength
    //   91: istore_2
    //   92: iconst_0
    //   93: istore_3
    //   94: iload_3
    //   95: iload_2
    //   96: if_icmpge -> 59
    //   99: aload_1
    //   100: iload_3
    //   101: aaload
    //   102: aload_0
    //   103: if_acmpne -> 109
    //   106: goto -> 54
    //   109: iinc #3, 1
    //   112: goto -> 94
    //   115: iload_0
    //   116: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 14
    //   #3	-> 17
    //   #4	-> 32
    //   #5	-> 40
    //   #6	-> 43
    //   #7	-> 66
    //   #8	-> 70
  }
  
  public final boolean UW() {
    return this.Dk0.zL0() ^ true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COM1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */