package f;

public final class k00 implements Bu0 {
  public int CoM2;
  
  public int p70;
  
  public boolean QE0 = false;
  
  public int sP;
  
  public int mn;
  
  public int bb0;
  
  public int rX;
  
  public k00(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.CoM2 = paramInt1;
    this.p70 = paramInt2;
    this.sP = paramInt3;
    this.mn = paramInt4;
    this.bb0 = paramInt5;
    this.rX = paramInt6;
  }
  
  public final EL getType() {
    return EL.Lu0;
  }
  
  public final boolean aF0() {
    return this.QE0;
  }
  
  public final void zr0() {
    if (!this.QE0) {
      this.QE0 = true;
      return;
    } 
    throw new JU("Already prepared");
  }
  
  public final void pk0(int paramInt) {
    int i = this.sP;
    paramInt = this.mn;
    int j = this.CoM2;
    int k = this.p70;
    int m = this.bb0;
    int n = this.rX;
    UB0.go.glTexImage2D(paramInt, i, paramInt, j, k, 0, m, n, null);
  }
  
  public final ZH Jw() {
    throw new JU("This TextureData implementation does not return a Pixmap");
  }
  
  public final boolean zb() {
    throw new JU("This TextureData implementation does not return a Pixmap");
  }
  
  public final int Vb() {
    return this.CoM2;
  }
  
  public final int wu0() {
    return this.p70;
  }
  
  public final Uc getFormat() {
    return Uc.xi0;
  }
  
  public final boolean wm0() {
    return false;
  }
  
  public final boolean k50() {
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/k00.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */