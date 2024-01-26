package f;

import com.badlogic.gdx.graphics.Color;
import java.nio.ByteBuffer;

public final class tC extends vO {
  public static final ik Sj = C00.gd(tC.class);
  
  public long xC;
  
  public long MW;
  
  public long db;
  
  public long gf0;
  
  public int sn;
  
  public int jw0;
  
  public int lpt6;
  
  public float hh0 = 1.0F;
  
  public float mc0 = 1.0F;
  
  public float[] bJ0;
  
  public int Go;
  
  public int aB0;
  
  public int LpT7 = 0;
  
  public int gw = 515;
  
  public Color nA;
  
  public boolean kI;
  
  public boolean MC;
  
  public float g30;
  
  public String JZ;
  
  public String C0;
  
  public int SS;
  
  public int T1;
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.Vk = paramByteBuffer.getInt();
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.xC = paramByteBuffer.getInt() & 0xFFFFFFFFL;
    this.MW = paramByteBuffer.getInt() & 0xFFFFFFFFL;
    this.db = paramByteBuffer.getInt() & 0xFFFFFFFFL;
    paramByteBuffer.getInt();
    this.gf0 = paramByteBuffer.getInt() & 0xFFFFFFFFL;
    paramByteBuffer.getInt();
    paramByteBuffer.getShort();
    this.sn = paramByteBuffer.getShort() & 0xFFFF;
    this.jw0 = paramByteBuffer.getShort() & 0xFFFF;
    this.lpt6 = paramByteBuffer.getShort() & 0xFFFF;
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.Go = (int)(l >> 18L & 0x1L);
    long l;
    this.aB0 = (int)((l = this.gf0) >> 19L & 0x1L);
    this.g30 = (float)(l >> 16L & 0x1FL) / 31.0F;
    switch ((int)((l = this.db) >> 6L & 0x3L)) {
      case 3:
        this.LpT7 = 0;
        break;
      case 2:
        this.LpT7 = 1029;
        break;
      case 1:
        this.LpT7 = 1028;
        break;
      case 0:
        this.LpT7 = 1032;
        break;
    } 
    int i;
    if ((i = (int)(l >> 4L & 0x1L)) != 0) {
      if (i == 1)
        this.gw = 514; 
    } else {
      this.gw = 513;
    } 
    if ((this.sn & 0x2) == 0) {
      this.hh0 = dL.Jd0(paramByteBuffer.getInt());
      this.mc0 = dL.Jd0(paramByteBuffer.getInt());
    } 
    if ((this.sn & 0x4) == 0) {
      dL.jv0(paramByteBuffer.getShort());
      dL.jv0(paramByteBuffer.getShort());
    } 
    if ((this.sn & 0x8) == 0) {
      paramByteBuffer.getInt();
      paramByteBuffer.getInt();
    } 
    if ((this.sn & 0x2000) == 8192) {
      this.bJ0 = new float[16];
      for (i = 0; i < 16; i++)
        this.bJ0[i] = dL.Jd0(paramByteBuffer.getInt()); 
    } 
    if ((this.sn & 0x40) == 64)
      dL.z2((int)this.xC >> 16 & 0x7FFF); 
    if ((this.sn & 0x80) == 128)
      dL.z2((int)this.xC >> 16 & 0x7FFF); 
    if ((this.sn & 0x200) == 512)
      dL.z2((int)this.MW & 0x7FFF); 
    if ((this.sn & 0x400) == 1024) {
      this.nA = dL.z2((int)this.MW >> 16 & 0x7FFF);
      this.kI = true;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */