package f;

import java.nio.ByteBuffer;

public final class M00 {
  public int VR;
  
  public XL[] Hg0;
  
  public M00(short paramShort, ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    this.Hg0 = new XL[i];
    for (i = 0; i < this.VR; i++) {
      XL xL;
      this();
      this.Hg0[i] = xL;
      paramByteBuffer.getInt();
      paramByteBuffer.getInt();
      this.Hg0[i].getClass();
      (this.Hg0[i]).T60 = paramByteBuffer.getInt();
      (this.Hg0[i]).Dd = paramByteBuffer.getInt();
      (this.Hg0[i]).Uj0 = paramByteBuffer.getInt();
      (this.Hg0[i]).fv0 = paramByteBuffer.getInt();
    } 
    if (paramByteBuffer.hasRemaining())
      System.out.println("more bytes found camera boundary file @" + paramShort); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/M00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */