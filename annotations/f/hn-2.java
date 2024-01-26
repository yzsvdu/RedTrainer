package f;

public abstract class hn {
  public static byte ZB0(boolean paramBoolean1, boolean paramBoolean2) {
    byte b;
    paramBoolean1 = false;
    if (paramBoolean1)
      b = (byte)Byte.MIN_VALUE; 
    if (paramBoolean2)
      b = (byte)(b | 0x40); 
    return b;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */