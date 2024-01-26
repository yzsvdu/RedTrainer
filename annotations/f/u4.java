package f;

public final class u4 extends v40 {
  public u4(wo0 paramwo0) {}
  
  public final boolean KL(BI paramBI, int paramInt) {
    wo0 wo01 = this.lc0;
    this(wo01.Qf0);
    wo01.yZ = prn;
    Prn prn;
    (prn = new Prn()).yH0(paramInt);
    UB0.Kg0.fN(() -> this.lc0.Jx0(this.lc0.yZ));
    return false;
  }
  
  public final boolean CoM2(BI paramBI, int paramInt, float paramFloat) {
    if (Math.abs(paramFloat) > 0.5F) {
      boolean bool;
      Prn prn;
      this(wo01.Qf0);
      wo0 wo01;
      (wo01 = this.lc0).yZ = new Prn();
      if (paramFloat > 0.0F) {
        bool = true;
      } else {
        bool = false;
      } 
      prn.nx(paramInt, bool);
      UB0.Kg0.fN(() -> this.lc0.Jx0(this.lc0.yZ));
    } 
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/u4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */