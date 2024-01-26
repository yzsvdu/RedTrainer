package f;

public abstract class Qx {
  public static short mF(byte paramByte1, byte paramByte2) {
    return (short)(paramByte1 & 0xFF | (paramByte2 & 0xFF) << 8);
  }
  
  public static int Zg0(byte paramByte1, byte paramByte2, byte paramByte3) {
    return paramByte1 | (paramByte2 & 0xFF) << 8 | (paramByte3 & 0xFF) << 16;
  }
  
  public static byte Pi0(short paramShort) {
    return (byte)(paramShort & 0xFF);
  }
  
  public static byte SG0(short paramShort) {
    return (byte)(paramShort >> 8 & 0xFF);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */