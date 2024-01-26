package f;

public class aI extends W2 {
  public final float by0;
  
  public final float u8;
  
  public final float Hh0;
  
  public final float jn;
  
  public aI(float paramFloat1, float paramFloat2) {
    this.by0 = paramFloat1;
    this.u8 = paramFloat2;
    float f = (float)Math.pow(paramFloat1, -paramFloat2);
    this.jn = 1.0F / (1.0F - f);
  }
  
  public float kb(float paramFloat) {
    if (paramFloat <= 0.5F) {
      paramFloat = this.u8;
      return ((float)Math.pow(this.by0, ((paramFloat * 2.0F - 1.0F) * paramFloat)) - this.Hh0) * this.jn / 2.0F;
    } 
    paramFloat = -this.u8;
    return (2.0F - ((float)Math.pow(this.by0, ((paramFloat * 2.0F - 1.0F) * paramFloat)) - this.Hh0) * this.jn) / 2.0F;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */