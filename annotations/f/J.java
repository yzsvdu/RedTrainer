package f;

import java.nio.ByteBuffer;

public final class J {
  public int kC0;
  
  public int[] rh;
  
  public lpT3[] Dw;
  
  public J(ByteBuffer paramByteBuffer, ut paramut) {
    int i = paramByteBuffer.getInt();
    this.rh = new int[i];
    this.Dw = new lpT3[i];
    for (i = 0; i < this.kC0; i++)
      this.rh[i] = paramByteBuffer.getInt(); 
    for (i = 0; i < this.kC0; i++) {
      this.Dw[i] = paramut.get();
      if (this.rh[i] != 0 || this.Dw[i].getClass() != Ys.class) {
        paramByteBuffer.position(this.rh[i]);
        this.Dw[i].rC(paramByteBuffer);
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */