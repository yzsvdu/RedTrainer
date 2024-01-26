package f;

import java.nio.ByteBuffer;

public final class M20 {
  public final short[] cl = new short[4];
  
  public M20(short paramShort, ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    for (paramShort = 0; paramShort < 4; paramShort++)
      this.cl[paramShort] = paramByteBuffer.getShort(); 
    hh.qu0.f60(paramByteBuffer.get());
    paramByteBuffer.get();
    nV.Y4(paramByteBuffer.get());
    paramByteBuffer.position(paramByteBuffer.position() + 3);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/M20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */