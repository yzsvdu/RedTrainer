package f;

public final class Jy implements mX, VK0, P80 {
  public final mX DJ;
  
  public final uE0 qH;
  
  public final boolean Er0;
  
  public final boolean l10;
  
  public final P80 KD;
  
  public Jy(mX parammX, uE0 paramuE0, boolean paramBoolean1, boolean paramBoolean2) {
    if (COm4 || paramBoolean1 || paramBoolean2) {
      this.DJ = parammX;
      this.qH = paramuE0;
      this.Er0 = paramBoolean1;
      this.l10 = paramBoolean2;
      if (parammX instanceof P80) {
        this.KD = (P80)parammX;
      } else {
        this.KD = this;
      } 
      return;
    } 
    throw new AssertionError();
  }
  
  public final int Vb() {
    return this.DJ.Vb();
  }
  
  public final int wu0() {
    return this.DJ.wu0();
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {
    this.DJ.Gt0(paramuP, paramInt1, paramInt2);
  }
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool1;
    boolean bool2;
    if (this.Er0) {
      bool1 = Math.max(1, paramInt3 / this.DJ.Vb());
    } else {
      bool1 = true;
    } 
    if (this.l10) {
      bool2 = Math.max(1, paramInt4 / this.DJ.wu0());
    } else {
      bool2 = true;
    } 
    this.KD.O2(paramfB0, paramInt1, paramInt2, paramInt3, paramInt4, bool1, bool2);
  }
  
  public final void O2(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    while (paramInt6 > 0) {
      int i = paramInt4 / paramInt6;
      int j = 0;
      int k = 0;
      while (k < paramInt5) {
        int m = ++k * paramInt3 / paramInt5;
        j = paramInt1 + j;
        int n = m - j;
        this.DJ.W8(paramfB0, j, paramInt2, n, i);
        j = m;
      } 
      paramInt2 += i;
      paramInt4 -= i;
      paramInt6--;
    } 
  }
  
  public final uE0 mJ0() {
    return this.qH;
  }
  
  public final mX rv0(pRn parampRn) {
    mX mX1 = this.DJ.rv0(parampRn);
    uE0 uE01 = this.qH;
    boolean bool1 = this.Er0;
    boolean bool2 = this.l10;
    return new Jy(this, uE01, bool1, bool2);
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Jy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */