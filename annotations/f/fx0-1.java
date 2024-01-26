package f;

public final class fx0 {
  public final throws RM;
  
  public int Sa0;
  
  public int package = 10;
  
  public boolean bo;
  
  public Runnable NY;
  
  public fx0(throws paramthrows) {
    this.RM = paramthrows;
  }
  
  public final void rl0(int paramInt) {
    if (paramInt >= 1) {
      this.package = paramInt;
      return;
    } 
    throw new IllegalArgumentException("delay < 1");
  }
  
  public final void ha() {
    int i;
    if ((i = this.Sa0) == 0) {
      this.Sa0 = this.package;
      this.RM.BT.add(this);
    } else if (i < 0) {
      this.Sa0 = -2;
    } 
  }
  
  public final void vI() {
    int i;
    if ((i = this.Sa0) > 0) {
      this.Sa0 = 0;
      this.RM.BT.remove(this);
    } else if (i < 0) {
      this.Sa0 = -3;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */