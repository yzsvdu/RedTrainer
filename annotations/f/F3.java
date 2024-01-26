package f;

public final class F3 extends W2 {
  public final float kb(float paramFloat) {
    return (paramFloat < 1.0E-6F) ? 0.0F : ((paramFloat > 1.0F) ? 1.0F : (1.0F - (float)Math.sqrt(-(paramFloat - 1.0F))));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */