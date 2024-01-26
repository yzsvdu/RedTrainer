package f;

public abstract class Yr0 {
  public static int H50(long paramLong) {
    return (int)(paramLong ^ paramLong >>> 32L);
  }
  
  public static int Fg(float paramFloat) {
    int i;
    if (paramFloat - (i = (int)paramFloat) > 0.0F)
      i++; 
    return i;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yr0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */