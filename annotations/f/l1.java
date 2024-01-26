package f;

public final class l1 extends J30 {
  public final int th0;
  
  public int ed0 = -1;
  
  public l1(int paramInt) {
    this.th0 = paramInt;
  }
  
  public final int C0(s40 params40) {
    int j;
    if ((j = this.ed0) != -1)
      return j; 
    params40.pr().position(this.th0);
    int i;
    if (pN.pk0(i = params40.pr().getInt()))
      return this.ed0 = pN.tx0(i); 
    throw new RuntimeException("Invalid Offset");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/l1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */