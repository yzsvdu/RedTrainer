package f;

import java.nio.ByteBuffer;

public final class U5 extends eJ {
  public int So;
  
  public int m3;
  
  public int HC;
  
  public int k4;
  
  public int yb;
  
  public int R7;
  
  public int S7;
  
  public int cK;
  
  public dc[] Dz0;
  
  public U5(E4 paramE4) {
    super(paramE4, i, paramE4.m4);
    byteBuffer.get(new byte[4]);
    byteBuffer.getInt();
    this.So = byteBuffer.getInt();
    this.m3 = byteBuffer.getInt();
    this.HC = byteBuffer.getInt();
    this.k4 = byteBuffer.getInt();
    this.yb = byteBuffer.getInt();
    this.R7 = byteBuffer.getInt();
    this.S7 = byteBuffer.getInt();
    this.cK = byteBuffer.getInt();
    ByteBuffer byteBuffer;
    te().position((byteBuffer = te()).position() + 24);
    this.Dz0 = new dc[8];
    arrayOfInt[0] = this.So;
    arrayOfInt[1] = this.m3;
    arrayOfInt[2] = this.HC;
    arrayOfInt[3] = this.k4;
    arrayOfInt[4] = this.yb;
    arrayOfInt[5] = this.R7;
    arrayOfInt[6] = this.S7;
    byte b1;
    int[] arrayOfInt;
    (arrayOfInt = new int[b1 = 8])[7] = this.cK;
    for (byte b2 = 0; b2 < b1; b2++) {
      byteBuffer.position(arrayOfInt[b2]);
      if (b2 == 1) {
        Jh jh;
        this(byteBuffer);
        this.Dz0[b2] = jh;
      } else {
        dc dc1;
        this(byteBuffer);
        this.Dz0[b2] = dc1;
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/U5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */