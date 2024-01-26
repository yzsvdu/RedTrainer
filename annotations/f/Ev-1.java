package f;

import java.nio.ByteBuffer;

public final class Ev {
  public int M;
  
  public wS[] Zf0;
  
  public Ev(short paramShort, ByteBuffer paramByteBuffer) {
    this.M = paramByteBuffer.getInt();
    paramByteBuffer.position();
    this.Zf0 = new wS[this.M];
    for (byte b = 0; b < this.M; b = (byte)(b + 1)) {
      wS wS1;
      this(b, paramByteBuffer, paramShort);
      this.Zf0[b] = wS1;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */