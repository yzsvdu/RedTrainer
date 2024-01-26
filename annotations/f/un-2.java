package f;

import java.nio.ByteBuffer;

public final class un {
  public int ob;
  
  public float AJ0;
  
  public float DF0;
  
  public un(ByteBuffer paramByteBuffer) {
    paramByteBuffer.position();
    this.ob = paramByteBuffer.getInt();
    this.AJ0 = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.DF0 = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort();
    paramByteBuffer.position(paramByteBuffer.position() + 20);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/un.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */