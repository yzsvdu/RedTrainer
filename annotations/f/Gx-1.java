package f;

public abstract class Gx {
  public static final float[] U30 = new float[16384];
  
  static {
    for (byte b = 0; b < '䀀'; b++)
      U30[b] = (float)Math.sin(((b + 0.5F) / 16384.0F * 6.2831855F)); 
    U30[0] = 0.0F;
    U30[4096] = 1.0F;
    U30[8192] = 0.0F;
    U30[12288] = -1.0F;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */