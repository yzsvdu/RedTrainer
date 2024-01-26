package f;

import java.nio.ByteBuffer;

public final class vn {
  public ByteBuffer rr;
  
  public int X9;
  
  public int jL;
  
  public vn(T7 paramT7) {
    ByteBuffer byteBuffer = paramT7.l2();
    this.X9 = byteBuffer.getInt();
    int i;
    if ((i = this.rr.getInt()) == 65792) {
      this.jL = 24;
    } else if (i == 65793) {
      this.jL = 36;
    } else if (i == 65536) {
      this.jL = 12;
    } else {
      throw new RuntimeException();
    } 
    if (this.rr.remaining() == this.X9 * this.jL)
      return; 
    throw new RuntimeException();
  }
  
  public final float P3(int paramInt1, int paramInt2) {
    int j;
    if (paramInt2 >= (j = this.X9))
      paramInt2 = j - 1; 
    int i = paramInt2 * this.jL + 8;
    return this.rr.getFloat(paramInt1 * 4 + i);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */