package f;

import java.nio.ByteBuffer;

public final class p70 {
  public short dM;
  
  public short fi;
  
  public short rg;
  
  public short f;
  
  public short RU;
  
  public int Nw;
  
  public p70(int paramInt, Do0 paramDo0) {
    byteBuffer.position(paramInt - paramDo0.h90);
    this.dM = byteBuffer.getShort();
    this.fi = byteBuffer.getShort();
    this.rg = byteBuffer.getShort();
    this.f = byteBuffer.getShort();
    byteBuffer.getShort();
    this.RU = byteBuffer.getShort();
    byteBuffer.getInt();
    this.Nw = byteBuffer.getInt();
    ByteBuffer byteBuffer;
    (byteBuffer = paramDo0.aF0()).getInt();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */