package f;

public final class vW extends iu0 {
  public vW(float paramFloat1, float paramFloat2, int paramInt, float paramFloat3) {
    super(paramFloat1, paramFloat2, paramInt, paramFloat3);
  }
  
  public final float kb(float paramFloat) {
    if (paramFloat >= 0.99D)
      return 1.0F; 
    paramFloat = this.Ih0;
    paramFloat = (float)Math.pow(this.x70, ((paramFloat - 1.0F) * paramFloat));
    return nx0.E70(paramFloat * this.cn) * paramFloat * this.Cy;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vW.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */