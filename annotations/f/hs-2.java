package f;

public final class hs implements mX {
  public final pRn Or;
  
  public final int ZM;
  
  public final int Gk;
  
  public hs(nK paramnK, int paramInt1, int paramInt2, pRn parampRn, boolean paramBoolean) {
    this.ZM = paramInt1;
    this.Gk = paramInt2;
    if (parampRn == null)
      parampRn = pRn.WHITE; 
    this.Or = parampRn;
  }
  
  public hs(hs paramhs, pRn parampRn) {
    this.ZM = paramhs.ZM;
    this.Gk = paramhs.Gk;
    this.Or = parampRn;
  }
  
  public final int wu0() {
    return this.Gk;
  }
  
  public final int Vb() {
    return this.ZM;
  }
  
  public final void Gt0(uP paramuP, int paramInt1, int paramInt2) {}
  
  public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public final mX rv0(pRn parampRn) {
    if (parampRn != null)
      return (parampRn = this.Or.o10(parampRn)).equals(this.Or) ? this : new hs(this, parampRn); 
    throw new NullPointerException("color");
  }
  
  public final pe0 LPT8() {
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */