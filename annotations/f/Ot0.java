package f;

import com.badlogic.gdx.math.Matrix4;
import java.nio.ByteBuffer;

public final class Ot0 {
  public Matrix4 cy0 = (new Matrix4()).WU();
  
  public Matrix4 qV = (new Matrix4()).WU();
  
  public Ot0(ByteBuffer paramByteBuffer) {
    byte b;
    for (b = 0; b < 4; b++) {
      for (byte b1 = 0; b1 < 3; b1++)
        this.cy0.Z0[b * 4 + b1] = dL.Jd0(paramByteBuffer.getInt()); 
    } 
    for (b = 0; b < 3; b++) {
      for (byte b1 = 0; b1 < 3; b1++)
        this.qV.Z0[b * 4 + b1] = dL.Jd0(paramByteBuffer.getInt()); 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ot0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */