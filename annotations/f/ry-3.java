package f;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class ry extends RD0 {
  public byte[] static;
  
  public int Y50;
  
  public int Bt0;
  
  public ry(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    super(paramString, G20.O30);
    this.static = paramArrayOfbyte;
    this.Y50 = 0;
    this.Bt0 = paramInt;
  }
  
  public final InputStream Yc() {
    byte[] arrayOfByte = this.static;
    int i = this.Y50;
    int j = this.Bt0;
    return new ByteArrayInputStream(this, i, j);
  }
  
  public final byte[] iy0() {
    try {
      return LF.ld0(Yc());
    } catch (IOException iOException) {
      throw new RuntimeException(this);
    } 
  }
  
  public final void m30(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = false;
    try {
      Yc().read(paramArrayOfbyte, bool, paramInt);
      return;
    } catch (IOException iOException) {
      throw new RuntimeException(this);
    } 
  }
  
  public final OutputStream hh() {
    throw new RuntimeException("Unsupported");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */