package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class eJ {
  public E4 p2;
  
  public int fR;
  
  public int Yo;
  
  public eJ(E4 paramE4, int paramInt1, int paramInt2) {
    this.p2 = paramE4;
    this.fR = paramInt1;
    this.Yo = paramInt2;
  }
  
  public final ByteBuffer te() {
    ByteBuffer byteBuffer;
    (byteBuffer = this.p2.R80()).position(this.fR);
    if (this.Yo > 0)
      byteBuffer.limit(Math.min(byteBuffer.limit(), this.fR + this.Yo)); 
    return byteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN);
  }
  
  public final int vY() {
    return this.Yo;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */