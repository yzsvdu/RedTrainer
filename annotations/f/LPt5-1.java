package f;

public final class LPt5 implements mX, VK0 {
  public final mX[] sn;
  
  public final uE0 Wk0;
  
  public LPt5(mX[] paramArrayOfmX, uE0 paramuE0) {
    this.sn = paramArrayOfmX;
    this.Wk0 = paramuE0;
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
    int i = Vb();
    int j = wu0();
    W8(paramuP, paramInt1, paramInt2, i, j);
  }
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    mX[] arrayOfMX;
    int i = (arrayOfMX = this.sn).length;
    for (byte b = 0; b < i; b++)
      this[b].W8(paramfB0, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final int wu0() {
    return this.sn[0].wu0();
  }
  
  public final int Vb() {
    return this.sn[0].Vb();
  }
  
  public final uE0 mJ0() {
    return this.Wk0;
  }
  
  public final mX rv0(pRn parampRn) {
    int i;
    mX[] arrayOfMX = new mX[i = this.sn.length];
    for (byte b = 0; b < i; b++)
      arrayOfMX[b] = this.sn[b].rv0(parampRn); 
    return new LPt5(arrayOfMX, this.Wk0);
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPt5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */