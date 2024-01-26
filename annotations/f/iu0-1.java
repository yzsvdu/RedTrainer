package f;

public class iu0 extends W2 {
  public final float x70;
  
  public final float Ih0;
  
  public final float Cy;
  
  public final float cn;
  
  public iu0(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3) {
    this.x70 = paramFloat1;
    this.Ih0 = paramFloat2;
    this.Cy = paramFloat3;
    paramFloat1 = paramInt * 3.1415927F;
    paramFloat2 = ((paramInt % 2 == 0) ? true : -1);
    this.cn = paramFloat1 * paramFloat2;
  }
  
  public float kb(float paramFloat) {
    if (paramFloat <= 0.5F) {
      paramFloat = this.Ih0;
      paramFloat = (float)Math.pow(this.x70, ((paramFloat - 1.0F) * paramFloat));
      return nx0.E70((paramFloat *= 2.0F) * this.cn) * paramFloat * this.Cy / 2.0F;
    } 
    paramFloat = this.Ih0;
    paramFloat = (float)Math.pow(this.x70, ((paramFloat - 1.0F) * paramFloat));
    return 1.0F - nx0.E70((paramFloat = (1.0F - paramFloat) * 2.0F) * this.cn) * paramFloat * this.Cy / 2.0F;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iu0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */