package f;

public abstract class dx {
  public static short l90(short paramShort) {
    if (paramShort >= 6000 && paramShort < 7000)
      paramShort = (short)(paramShort - 1000); 
    if (paramShort >= 7000 && paramShort < 8000)
      paramShort = (short)(paramShort - 6000); 
    return (paramShort == 1125) ? 1018 : paramShort;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */