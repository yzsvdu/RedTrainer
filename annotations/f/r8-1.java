package f;

import java.nio.ByteBuffer;

public final class r8 extends Bi {
  public final String qZ;
  
  public final String p3;
  
  public r8(String paramString1, String paramString2) {
    super(128);
    this.qZ = paramString1;
    this.p3 = paramString2;
  }
  
  public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) {
    e6.Ti(this.qZ, paramByteBuffer);
    e6.Ti(this.p3, paramByteBuffer);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/r8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */