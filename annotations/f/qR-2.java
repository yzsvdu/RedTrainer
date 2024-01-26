package f;

public final class qR {
  public int mu0;
  
  public byte[] Do0;
  
  public int[] cW;
  
  public qR(int paramInt) {
    this.mu0 = paramInt;
    this.Do0 = new byte[paramInt * 2304];
    this.cW = new int[paramInt];
    CJ();
  }
  
  public final byte[] E4() {
    return this.Do0;
  }
  
  public final int CJ() {
    try {
      int i = this.mu0 - 1;
      i = this.cW[i] - i * 2;
      return i;
    } finally {
      for (byte b = 0; b < this.mu0; b++)
        this.cW[b] = b * 2; 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qR.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */