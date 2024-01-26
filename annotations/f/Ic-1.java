package f;

public class Ic extends W2 {
  public final int zK0;
  
  public Ic(int paramInt) {
    this.zK0 = paramInt;
  }
  
  public float kb(float paramFloat) {
    if (paramFloat <= 0.5F)
      return (float)Math.pow((paramFloat * 2.0F), this.zK0) / 2.0F; 
    float f = (float)Math.pow(((paramFloat - 1.0F) * 2.0F), this.zK0);
    return f / ((this.zK0 % 2 == 0) ? -2 : 2) + 1.0F;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ic.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */