package f;

import java.io.ByteArrayOutputStream;

public final class DE extends ByteArrayOutputStream {
  public DE(int paramInt) {
    super(paramInt);
  }
  
  public final synchronized byte[] toByteArray() {
    byte[] arrayOfByte;
    return (this.count == (arrayOfByte = this.buf).length) ? arrayOfByte : super.toByteArray();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DE.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */