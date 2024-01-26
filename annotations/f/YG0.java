package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class YG0 {
  public eJ rh0;
  
  public int[] Hi;
  
  public int[] Tr0;
  
  public YG0(eJ parameJ) {
    this.rh0 = parameJ;
    ByteBuffer byteBuffer;
    (byteBuffer = parameJ.te()).position(56);
    int i;
    if ((i = parameJ.te().getInt()) > 0 && i < 10000) {
      this.Hi = new int[i];
      this.Tr0 = new int[i];
      byteBuffer.position(60);
      for (byte b = 0; b < i; b++)
        this.Hi[b] = byteBuffer.getInt(); 
      int j;
      for (j = 0; j < i - 1; j = k) {
        int[] arrayOfInt;
        int k;
        this.Tr0[j] = (arrayOfInt = this.Hi)[k = j + 1] - arrayOfInt[j];
      } 
      this.Tr0[j] = parameJ.vY() - this.Hi[j];
    } else {
      this.Hi = new int[0];
      this.Tr0 = new int[0];
    } 
  }
  
  public final ej bk() {
    boolean bool = false;
    int[] arrayOfInt;
    if ((arrayOfInt = this.Hi).length <= 0)
      return null; 
    int i;
    if ((i = arrayOfInt[bool]) < 0 || i >= this.rh0.te().limit())
      return null; 
    ByteBuffer byteBuffer;
    (byteBuffer = this.rh0.te()).position(this.Hi[bool]);
    this.rh0.te().limit(Math.min(this.rh0.te().limit(), this.Hi[bool] + this.Tr0[bool]));
    return new ej(byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */