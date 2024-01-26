package f;

public final class f70 {
  public boolean coM5;
  
  public final S4 mr;
  
  public int Mz;
  
  public boolean jK = true;
  
  public f70(S4 paramS4) {
    this.mr = paramS4;
    uy();
  }
  
  public final void uy() {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iconst_m1
    //   3: putfield Mz : I
    //   6: getfield mr : Lf/S4;
    //   9: dup
    //   10: astore_1
    //   11: getfield sJ : Z
    //   14: ifeq -> 25
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield coM5 : Z
    //   22: goto -> 69
    //   25: aload_1
    //   26: getfield k4 : [I
    //   29: dup
    //   30: astore_1
    //   31: arraylength
    //   32: istore_2
    //   33: aload_0
    //   34: getfield Mz : I
    //   37: iconst_1
    //   38: iadd
    //   39: dup
    //   40: istore_3
    //   41: iload_2
    //   42: aload_0
    //   43: iload_3
    //   44: putfield Mz : I
    //   47: if_icmpge -> 64
    //   50: aload_1
    //   51: iload_3
    //   52: iaload
    //   53: ifeq -> 33
    //   56: aload_0
    //   57: iconst_1
    //   58: putfield coM5 : Z
    //   61: goto -> 69
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield coM5 : Z
    //   69: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 26
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */