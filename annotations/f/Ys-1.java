package f;

import java.nio.ByteBuffer;

public final class Ys extends lpT3 {
  public int Sj0;
  
  public Qc0[] G;
  
  public final void rC(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    this.G = new Qc0[i];
    for (i = 0; i < this.Sj0; i++) {
      Qc0 qc0;
      paramByteBuffer.getInt();
      paramByteBuffer.getInt();
      this();
      this.G[i] = qc0;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */