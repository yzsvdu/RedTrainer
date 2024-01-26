package f;

public final class Sv0 implements mX, VK0 {
  public final mX[] Prn;
  
  public final vc bi;
  
  public final uE0 H7;
  
  public Sv0(vc paramvc, uE0 paramuE0, mX... paramVarArgs) {
    boolean bool;
    if ((bool = HA) || paramVarArgs.length >= paramvc.Lpt2()) {
      if (bool || paramVarArgs.length <= paramvc.Lpt2() + 1) {
        this.Prn = paramVarArgs;
        this.bi = paramvc;
        this.H7 = paramuE0;
        return;
      } 
      throw new AssertionError();
    } 
    throw new AssertionError();
  }
  
  public final int Vb() {
    return this.Prn[0].Vb();
  }
  
  public final int wu0() {
    return this.Prn[0].wu0();
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
    int i = Vb();
    int j = wu0();
    W8(paramuP, paramInt1, paramInt2, i, j);
  }
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    mX[] arrayOfMX;
    int i;
    if ((i = this.bi.iX(paramfB0)) < (arrayOfMX = this.Prn).length)
      this[i].W8(paramfB0, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final uE0 mJ0() {
    return this.H7;
  }
  
  public final mX rv0(pRn parampRn) {
    int i;
    mX[] arrayOfMX = new mX[i = this.Prn.length];
    for (byte b = 0; b < i; b++)
      arrayOfMX[b] = this.Prn[b].rv0(parampRn); 
    vc vc1 = this.bi;
    return new Sv0(this, this.H7, arrayOfMX);
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sv0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */