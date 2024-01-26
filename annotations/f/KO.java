package f;

public final class KO implements I7 {
  public final Sa0 TZ;
  
  public final Ll Qu;
  
  public KO(Sa0 paramSa0, Ll paramLl) {
    if (paramSa0 != null) {
      if (paramLl != null) {
        this.TZ = paramSa0;
        this.Qu = paramLl;
        return;
      } 
      throw new NullPointerException("animStateKey");
    } 
    throw new NullPointerException("animState");
  }
  
  public final int lh0() {
    return this.TZ.Fj0(this.Qu);
  }
  
  public final void PI0() {
    this.TZ.Ym0(this.Qu);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */