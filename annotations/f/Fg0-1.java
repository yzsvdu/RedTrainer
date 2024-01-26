package f;

import java.nio.ByteBuffer;

public final class Fg0 extends By0 {
  public Fg0(HI paramHI) {
    T7 t7 = paramHI.Vz().B8("/fielddata/maptable/mapname.bin");
    ByteBuffer byteBuffer = paramHI.HB0();
    if (paramHI.bO() == 3) {
      LF.ps0(1573448, 1573449, byteBuffer);
    } else if (paramHI.bO() == 4) {
      LF.ps0(33489410, 11076050, byteBuffer);
      byteBuffer.position(byteBuffer.position() + 8);
    } else {
      this.Z6 = (Ws0[])new iy0[0];
      return;
    } 
    this.Z6 = (Ws0[])new iy0[t7.zu0 / 16];
    Ws0[] arrayOfWs0;
    for (short s = 0; s < ((iy0[])(arrayOfWs0 = this.Z6)).length; s = (short)(s + 1)) {
      iy0 iy0;
      this(s, paramHI, byteBuffer);
      ((iy0[])arrayOfWs0)[s] = iy0;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */