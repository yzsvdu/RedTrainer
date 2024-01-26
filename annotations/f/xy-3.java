package f;

public final class xy {
  public float[] HQ;
  
  public xy(float[] paramArrayOffloat) {
    this.HQ = paramArrayOffloat;
  }
  
  public final void se(int paramInt1, int paramInt2, float paramFloat) {
    this.HQ[paramInt2 * 4 + paramInt1] = paramFloat;
  }
  
  public final float Qr(int paramInt1, int paramInt2) {
    return this.HQ[paramInt2 * 4 + paramInt1];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */