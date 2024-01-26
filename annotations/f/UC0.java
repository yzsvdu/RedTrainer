package f;

public final class UC0 {
  public static int[] pc = new int[256];
  
  public byte[] nS;
  
  public int ZC0;
  
  public int GB;
  
  public byte[] qV;
  
  public int vt0;
  
  public int ej0;
  
  static {
    int[] arrayOfInt;
    for (byte b = 0; b < (arrayOfInt = pc).length; b++) {
      int i = b << 24;
      for (byte b1 = 0; b1 < 8; b1++) {
        if ((i & Integer.MIN_VALUE) != 0) {
          i = i << 1 ^ 0x4C11DB7;
        } else {
          i <<= 1;
        } 
      } 
      arrayOfInt[b] = i & 0xFFFFFFFF;
    } 
  }
  
  public final int Tg() {
    int i;
    byte[] arrayOfByte;
    return (arrayOfByte = this.nS)[(i = this.ZC0) + 14] & 0xFF | (arrayOfByte[i + 15] & 0xFF) << 8 | (arrayOfByte[i + 16] & 0xFF) << 16 | (arrayOfByte[i + 17] & 0xFF) << 24;
  }
  
  public final void n50() {
    int j = 0;
    byte b;
    for (b = 0; b < this.GB; b++)
      j = j << 8 ^ pc[j >>> 24 & 0xFF ^ this.nS[this.ZC0 + b] & 0xFF]; 
    for (b = 0; b < this.ej0; b++)
      j = j << 8 ^ pc[j >>> 24 & 0xFF ^ this.qV[this.vt0 + b] & 0xFF]; 
    int i;
    j = (i = this.ZC0) + 22;
    arrayOfByte[j] = (byte)j;
    j = i + 23;
    arrayOfByte[j] = (byte)(j >>> 8);
    j = i + 24;
    arrayOfByte[j] = (byte)(j >>> 16);
    i += 25;
    byte[] arrayOfByte;
    (arrayOfByte = this.nS)[i] = (byte)(j >>> 24);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/UC0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */