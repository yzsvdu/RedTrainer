package f;

import java.nio.ByteBuffer;

public final class Do0 {
  public final int sZ;
  
  public final int h90;
  
  public final int c20;
  
  public TF UG;
  
  public final boolean iB;
  
  public Do0(boolean paramBoolean, ByteBuffer paramByteBuffer) {
    this.sZ = paramByteBuffer.getInt();
    this.h90 = paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.c20 = paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.iB = paramBoolean;
  }
  
  public final ByteBuffer aF0() {
    return this.UG.rb(this.iB);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Do0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */