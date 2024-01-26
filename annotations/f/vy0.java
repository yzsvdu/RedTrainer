package f;

public final class vy0 {
  public final char[] Ir0 = new char[64];
  
  public final byte[] Tx0 = new byte[128];
  
  public vy0(char paramChar1, char paramChar2) {
    int i = 0;
    int j;
    for (j = 65; j <= 90; j = (char)(j + 1))
      this.Ir0[i++] = j; 
    for (j = 97; j <= 122; j = (char)(j + 1))
      this.Ir0[i++] = j; 
    for (j = 48; j <= 57; j = (char)(j + 1))
      this.Ir0[i++] = j; 
    j = i + 1;
    this.Ir0[i] = paramChar1;
    this.Ir0[j] = paramChar2;
    byte[] arrayOfByte;
    for (paramChar1 = Character.MIN_VALUE; paramChar1 < (arrayOfByte = this.Tx0).length; paramChar1++)
      arrayOfByte[paramChar1] = -1; 
    for (paramChar1 = Character.MIN_VALUE; paramChar1 < '@'; paramChar1++) {
      char c = this.Ir0[paramChar1];
      this.Tx0[c] = (byte)paramChar1;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vy0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */