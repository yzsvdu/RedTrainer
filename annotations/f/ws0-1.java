package f;

public final class ws0 {
  public final pe0 HI;
  
  public ws0(pe0 parampe0, float[] paramArrayOffloat, short[] paramArrayOfshort) {
    this.HI = parampe0;
    float[] arrayOfFloat = new float[paramArrayOffloat.length];
    float f1 = parampe0.mP;
    float f2 = parampe0.WT;
    float f3 = parampe0.zV - f1;
    float f4 = parampe0.bh0 - f2;
    int i = parampe0.H0;
    int j = parampe0.Vn0;
    byte b = 0;
    int k = paramArrayOffloat.length;
    while (b < k) {
      this[b] = paramArrayOffloat[b] / i * f3 + f1;
      int m;
      float f = paramArrayOffloat[m = b + 1] / j;
      this[m] = (1.0F - f) * f4 + f2;
      b += 2;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ws0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */