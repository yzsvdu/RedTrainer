package f;

import java.nio.ByteBuffer;

public final class wS {
  public int fk0;
  
  public int mL;
  
  public short[][][] RH;
  
  public wS(byte paramByte, ByteBuffer paramByteBuffer, short paramShort) {
    this.mL = paramByteBuffer.getShort();
    short s = paramByteBuffer.getShort();
    if (paramShort == 9 && paramByte == 30)
      this.mL += 2; 
    int i = this.mL;
    this.RH = new short[2][s][i];
    for (s = 0; s < this.fk0; s++) {
      int j;
      for (i = 0; i < (j = this.mL); i++) {
        if (paramShort == 9 && paramByte == 30 && (i == 0 || i == j - 1)) {
          this.RH[0][s][i] = 1;
          this.RH[1][s][i] = 129;
        } else {
          for (j = 0; j < 2; j++)
            this.RH[j][s][i] = paramByteBuffer.getShort(); 
        } 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */