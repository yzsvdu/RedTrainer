package f;

import java.nio.ByteBuffer;

public final class oz0 {
  public qw0 b50 = new qw0();
  
  public oz0(gD paramgD) {
    Do0 do0;
    ByteBuffer byteBuffer;
    LF.Db(byteBuffer = (do0 = paramgD.Gc0(9)).aF0(), 705180424, 536927222, 1187006320);
    (do0 = paramgD.Gc0(9)).aF0().position((do0 = paramgD.Gc0(9)).aF0().getInt() - do0.h90);
    for (byte b = 0; b < 8; b++) {
      AI aI;
      short s = (short)byteBuffer.getInt();
      int i = byteBuffer.getInt();
      this(s, i, do0);
      this.b50.Vh0(s, aI);
    } 
  }
  
  public final AI K40(short paramShort) {
    return (AI)this.b50.Z90(paramShort);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */