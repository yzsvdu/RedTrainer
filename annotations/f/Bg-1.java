package f;

public final class Bg {
  public Bg() {}
  
  public Bg(float[] paramArrayOffloat) {
    if (paramArrayOffloat.length >= 4)
      return; 
    throw new IllegalArgumentException("polylines must contain at least 2 points.");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bg.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */