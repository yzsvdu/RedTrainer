package f;

public final class TI0 {
  public final int H70;
  
  public final int j7;
  
  public final int th0;
  
  public TI0(int paramInt) {
    this(paramInt, paramInt, paramInt);
  }
  
  public TI0(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0) {
      if (paramInt2 >= paramInt1) {
        if (paramInt3 >= 0 && (paramInt3 <= 0 || paramInt3 >= paramInt2)) {
          this.H70 = paramInt1;
          this.j7 = paramInt2;
          this.th0 = paramInt3;
          return;
        } 
        throw new IllegalArgumentException("max");
      } 
      throw new IllegalArgumentException("preferred");
    } 
    throw new IllegalArgumentException("min");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */