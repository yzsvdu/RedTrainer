package f;

import java.nio.ByteBuffer;

public final class rD {
  public int Nw;
  
  public byte[] A0;
  
  public int[] dE;
  
  public int[] Av;
  
  public eo Sx;
  
  public int i0;
  
  public rD(int paramInt, ByteBuffer paramByteBuffer) {
    V6 v6;
    this.A0 = new byte[4];
    this.dE = new int[4];
    this.Av = new int[4];
    this.Nw = paramInt;
    paramByteBuffer.position();
    for (paramInt = 0; paramInt < 4; paramInt++) {
      this.A0[paramInt] = paramByteBuffer.get();
      paramByteBuffer.position(paramByteBuffer.position() + 3);
    } 
    this();
    for (byte b2 = 0; b2 < 4; b2++) {
      int i;
      if ((i = paramByteBuffer.getInt()) != 0 && v6.return(i))
        i = 0; 
      v6.uX(i);
      this.dE[b2] = i;
    } 
    for (byte b1 = 0; b1 < 4; b1++)
      this.Av[b1] = paramByteBuffer.getInt() >> 4; 
    float f = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort();
    this.Sx = new eo((paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort(), f, (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort());
    this.i0 = paramByteBuffer.getInt();
    byte[] arrayOfByte;
    paramByteBuffer.get(arrayOfByte = new byte[48]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */