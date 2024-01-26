package f;

import java.nio.ByteBuffer;

public final class j00 extends Kl0 {
  public byte[] Ck;
  
  public U50[] bJ0;
  
  public j00(c4 paramc4, ByteBuffer paramByteBuffer) {
    super(paramc4, paramByteBuffer);
  }
  
  public final void sM() {
    this.Ck = ee0(R00());
    this.bJ0 = new U50[R00()];
    U50[] arrayOfU50;
    for (byte b = 0; b < (arrayOfU50 = this.bJ0).length; b++)
      arrayOfU50[b] = eD(); 
  }
  
  public final void Cx() {
    byte[] arrayOfByte = this.Ck;
    r8().Q4(this, this.bJ0);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/j00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */