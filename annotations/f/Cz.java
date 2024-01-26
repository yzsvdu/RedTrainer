package f;

public final class Cz extends OQ {
  public int tx;
  
  public float j40;
  
  public int gh0;
  
  public float qP;
  
  public float KP;
  
  public float G4;
  
  public Cz(int paramInt) {
    super(paramInt);
  }
  
  public final void rH(AH0 paramAH0, Ym0 paramYm0, ls0 paramls0) {
    this.rd0 = paramAH0.Ze0(4);
    this.tx = paramAH0.Ze0(4);
    if (paramls0 != null) {
      paramls0.Zc0(this.rd0, 4);
      paramls0.Zc0(this.tx, 4);
    } 
    int i;
    if ((i = this.rd0) != 0) {
      this.cl = i + 1;
      this.bv0 = OQ.W9[i];
      this.Iz = OQ.lPT2[i];
    } 
    if ((i = this.tx) != 0) {
      this.gh0 = i + 1;
      this.KP = OQ.W9[i];
      this.G4 = OQ.lPT2[i];
    } 
  }
  
  public final void ai0(AH0 paramAH0, Ym0 paramYm0) {
    if (this.rd0 != 0)
      this.qL = K30.dr0[paramAH0.Ze0(6)]; 
    if (this.tx != 0)
      this.j40 = K30.dr0[paramAH0.Ze0(6)]; 
  }
  
  public final boolean Pg0(AH0 paramAH0) {
    boolean bool = super.Pg0(paramAH0);
    if (this.tx != 0)
      this.qP = paramAH0.Ze0(this.gh0); 
    return bool;
  }
  
  public final boolean cOM7(int paramInt, Va paramVa1, Va paramVa2) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: iload_1
    //   3: aload_2
    //   4: aload_3
    //   5: invokespecial cOM7 : (ILf/Va;Lf/Va;)Z
    //   8: pop
    //   9: getfield tx : I
    //   12: ifeq -> 71
    //   15: iload_1
    //   16: iconst_1
    //   17: if_icmpeq -> 71
    //   20: iload_1
    //   21: aload_0
    //   22: getfield qP : F
    //   25: aload_0
    //   26: getfield KP : F
    //   29: fmul
    //   30: aload_0
    //   31: getfield G4 : F
    //   34: fadd
    //   35: aload_0
    //   36: getfield j40 : F
    //   39: fmul
    //   40: fstore_1
    //   41: ifne -> 59
    //   44: aload_3
    //   45: aload_0
    //   46: getfield E7 : I
    //   49: istore_0
    //   50: getfield z0 : [F
    //   53: iload_0
    //   54: fload_1
    //   55: fastore
    //   56: goto -> 71
    //   59: aload_2
    //   60: aload_0
    //   61: getfield E7 : I
    //   64: istore_0
    //   65: getfield z0 : [F
    //   68: iload_0
    //   69: fload_1
    //   70: fastore
    //   71: iconst_1
    //   72: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 50
    //   #2	-> 55
    //   #3	-> 61
    //   #4	-> 65
    //   #5	-> 70
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */