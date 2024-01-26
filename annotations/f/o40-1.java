package f;

public abstract class o40 {
  public static byte[] TD0(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length * 2];
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      int i = b * 2;
      arrayOfByte[i] = (byte)(paramArrayOfbyte[b] & 0xF);
      arrayOfByte[++i] = (byte)((paramArrayOfbyte[b] & 0xF0) >> 4);
    } 
    return arrayOfByte;
  }
  
  public static byte[] LF0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length];
    paramInt2 = paramInt4 * paramInt3 / 8;
    paramInt3 = paramInt1 / paramInt4;
    int i = paramInt2 / paramInt4;
    int j = 0;
    for (byte b = 0; b < i; b++) {
      for (byte b1 = 0; b1 < paramInt3; b1++) {
        for (byte b2 = 0; b2 < paramInt4; b2++) {
          for (byte b3 = 0; b3 < paramInt2; b3++) {
            int k = b2 * paramInt2 * paramInt3 + b3;
            k = b1 * paramInt2 + k;
            if ((k = b * paramInt3 * paramInt4 * paramInt2 + k) < paramArrayOfbyte.length && j < paramArrayOfbyte.length) {
              int m = j + 1;
              arrayOfByte[k] = paramArrayOfbyte[j];
              j = m;
            } 
          } 
        } 
      } 
    } 
    return arrayOfByte;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/o40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */