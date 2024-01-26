package f;

import java.io.Reader;

public final class Ti extends Reader {
  public final String[] eN;
  
  public String dB0;
  
  public int TG;
  
  public int F10;
  
  public Ti(String... paramVarArgs) {
    this.eN = paramVarArgs;
  }
  
  public final int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    while (true) {
      String str;
      if ((str = this.dB0) == null || this.F10 == str.length()) {
        int m;
        String[] arrayOfString;
        if ((m = this.TG) == (arrayOfString = this.eN).length)
          return -1; 
        this.TG = m + 1;
        this.dB0 = arrayOfString[m];
        this.F10 = 0;
        continue;
      } 
      int j;
      int k;
      if (paramInt2 > (k = this.dB0.length() - (j = this.F10)))
        paramInt2 = k; 
      int i = j + paramInt2;
      this.dB0.getChars(j, i, paramArrayOfchar, paramInt1);
      return paramInt2;
    } 
  }
  
  public final void close() {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ti.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */