package f;

public final class tm0 {
  public tm0() {}
  
  public tm0(float[] paramArrayOffloat) {
    if (paramArrayOffloat.length >= 6)
      return; 
    throw new IllegalArgumentException("polygons must contain at least 3 points.");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tm0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */