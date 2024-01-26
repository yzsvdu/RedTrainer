package f;

import java.nio.ByteBuffer;

public final class mF extends lF0 {
  public float[][] fa0;
  
  public boolean aj0;
  
  public mF(short paramShort, T7 paramT7) {
    byte b1;
    byte b2;
    this.sa0 = paramShort;
    ByteBuffer byteBuffer;
    this.X7 = (short)(byteBuffer = paramT7.l2()).get();
    this.cB0 = (short)byteBuffer.get();
    if (byteBuffer.get() == 1) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (byteBuffer.get() == 1) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    this.aj0 = b2;
    if (b1 == b2) {
      byte[] arrayOfByte;
      byteBuffer.get(arrayOfByte = new byte[byteBuffer.get()]);
      if (b1) {
        this.H80 = new int[this.X7][this.cB0];
        for (byte b3 = 0; b3 < this.cB0; b3++) {
          for (b2 = 0; b2 < this.X7; b2++)
            this.H80[b2][b3] = byteBuffer.getShort(); 
        } 
      } 
      if (this.aj0) {
        this.fa0 = new float[this.X7][this.cB0];
        for (byte b3 = 0; b3 < this.cB0; b3++) {
          for (b2 = 0; b2 < this.X7; b2++)
            this.fa0[b2][b3] = byteBuffer.get() / 8.0F; 
        } 
      } 
      this.U1 = new int[this.X7][this.cB0];
      for (byte b = 0; b < this.cB0; b++) {
        for (b2 = 0; b2 < this.X7; b2++)
          this.U1[b2][b] = byteBuffer.getShort(); 
      } 
      return;
    } 
    throw new RuntimeException();
  }
  
  public final boolean B1() {
    return this.aj0;
  }
  
  public final float Dk(int paramInt1, int paramInt2) {
    return !this.aj0 ? 0.0F : this.fa0[paramInt1][paramInt2];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */