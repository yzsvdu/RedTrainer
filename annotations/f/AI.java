package f;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class AI {
  public ArrayList mq = new ArrayList();
  
  public AI(short paramShort, int paramInt, Do0 paramDo0) {
    ByteBuffer byteBuffer;
    (byteBuffer = paramDo0.aF0()).position(paramInt - paramDo0.h90);
    int i;
    for (paramInt = 0; paramInt < 20 && (i = byteBuffer.getInt()) != 0; paramInt++) {
      p70 p70;
      this(i, paramDo0);
      QU(p70);
    } 
  }
  
  public final ArrayList jp0() {
    return this.mq;
  }
  
  public final void QU(p70 paramp70) {
    this.mq.add(paramp70);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */