package f;

import java.nio.ByteBuffer;

public final class sl {
  public B5[] Nr;
  
  public sl(ByteBuffer paramByteBuffer) {
    int i;
    this.Nr = new B5[i = paramByteBuffer.getInt()];
    for (byte b = 0; b < i; b++) {
      B5 b5;
      this(paramByteBuffer);
      this.Nr[b] = b5;
    } 
  }
  
  public final B5 Td(short paramShort) {
    B5[] arrayOfB5;
    int i = (arrayOfB5 = this.Nr).length;
    for (byte b = 0; b < i; b++) {
      B5 b5;
      if ((b5 = this[b]).h20 == paramShort)
        return b5; 
    } 
    return null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */