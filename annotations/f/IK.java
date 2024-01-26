package f;

public final class IK extends Tp {
  public IK(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    super(paramArrayOffloat1, paramArrayOffloat2);
  }
  
  public IK(int paramInt) {
    super(paramInt);
  }
  
  public final float kb(float paramFloat) {
    return 1.0F - super.kb(1.0F - paramFloat);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IK.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */