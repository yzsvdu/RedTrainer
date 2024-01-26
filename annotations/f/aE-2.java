package f;

import java.nio.ByteBuffer;

public final class aE {
  public final a4[] g3;
  
  public aE(int paramInt1, int paramInt2, DC0 paramDC0, int paramInt3, byte paramByte, ByteBuffer paramByteBuffer) {
    paramByteBuffer.position(paramInt1);
    this.g3 = new a4[paramInt3];
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++) {
      int i;
      a4[] arrayOfA4 = this.g3;
      a4 a41 = new a4();
      if (paramDC0 == null) {
        i = 0;
      } else {
        i = paramDC0.CoM9();
      } 
      this(paramInt1 + i, paramByteBuffer);
      arrayOfA4[paramInt1] = a41;
    } 
  }
  
  public final a4[] Zb() {
    return this.g3;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/aE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */