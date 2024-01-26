package f;

import java.nio.ByteBuffer;

public final class Lw0 extends vO {
  public static final ik Cf0 = C00.gd(Lw0.class);
  
  public int Zz0;
  
  public int lPT5;
  
  public int iV;
  
  public int q4;
  
  public tf0[] zJ;
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.Vk = paramByteBuffer.getInt();
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.getInt() != 1128333386) {
      Cf0.getClass();
      return;
    } 
    this.Zz0 = paramByteBuffer.getShort();
    this.lPT5 = paramByteBuffer.getShort();
    paramByteBuffer.getInt();
    this.iV = paramByteBuffer.getInt();
    this.q4 = paramByteBuffer.getInt();
    int[] arrayOfInt = new int[this.lPT5];
    byte b;
    int i;
    for (b = 0; b < (i = this.lPT5); b++)
      arrayOfInt[b] = paramByteBuffer.getShort() & 0xFFFF; 
    this.zJ = new tf0[i];
    for (b = 0; b < this.lPT5; b++) {
      tf0 tf01;
      paramByteBuffer.position(this.Vk + arrayOfInt[b]);
      int j = this.Zz0;
      int k = this.Vk;
      int m = this.iV;
      int n = this.q4;
      this(j, k, m, n, paramByteBuffer);
      this.zJ[b] = tf01;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */