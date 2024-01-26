package f;

public final class Y8 {
  public int ME0;
  
  public int T20;
  
  public int[] Me;
  
  public int qo0;
  
  public int Gv;
  
  public int SM;
  
  public int RY;
  
  public int Wl;
  
  public int[] Ng;
  
  public final int M0() {
    double d = this.ME0;
    for (int i = (int)Math.floor(Math.pow(this.T20, 1.0D / d));; i++) {
      int j = 1;
      int k = 1;
      int m;
      for (m = 0; m < this.ME0; m++) {
        j *= i;
        k = (i + 1) * k;
      } 
      if (j <= (m = this.T20) && k > m)
        return i; 
      if (j > m) {
        i--;
        continue;
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Y8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */