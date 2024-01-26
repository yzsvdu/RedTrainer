package f;

public final class super {
  public byte Nd0;
  
  public String Z5;
  
  public int[] Ss;
  
  public super(byte paramByte, String paramString, int... paramVarArgs) {
    this.Nd0 = paramByte;
    this.Z5 = paramString;
    this.Ss = paramVarArgs;
    if (paramVarArgs.length == 6)
      return; 
    throw new IllegalArgumentException("");
  }
  
  public static byte Gc(byte paramByte) {
    return (byte)(paramByte * 3 + 6);
  }
  
  public final byte w4() {
    return this.Nd0;
  }
  
  public final boolean com6() {
    int[] arrayOfInt;
    int i = (arrayOfInt = this.Ss).length;
    for (byte b = 0; b < i; b++) {
      if (this[b] > 0)
        return true; 
    } 
    return false;
  }
  
  public final String toString() {
    return !this.Z5.isEmpty() ? this.Z5 : Ml0.Go(2360, Byte.toString((byte)(this.Nd0 + 1)));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/super.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */