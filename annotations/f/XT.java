package f;

import java.nio.ByteBuffer;

public final class XT {
  public short[] nul = new short[4];
  
  public XT(QA0 paramQA0, ByteBuffer paramByteBuffer) {
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    if (paramQA0.fv()) {
      short[] arrayOfShort;
      for (byte b = 0; b < (arrayOfShort = this.nul).length; b++)
        arrayOfShort[b] = paramByteBuffer.getShort(); 
    } 
    if (paramQA0.v4())
      paramByteBuffer.getShort(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */