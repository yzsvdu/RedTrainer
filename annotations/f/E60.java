package f;

import java.nio.ByteBuffer;

public final class E60 {
  public final int Ex;
  
  public final int dh0;
  
  public E60(ByteBuffer paramByteBuffer) {
    this.Ex = paramByteBuffer.position();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.dh0 = j;
    int i = paramByteBuffer.position();
    int j;
    paramByteBuffer.position((j = paramByteBuffer.getInt()) * 8 + i);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/E60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */