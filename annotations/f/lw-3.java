package f;

import com.badlogic.gdx.graphics.Color;
import java.nio.ByteBuffer;

public final class lw {
  public short ct0;
  
  public short Xp0;
  
  public short tu;
  
  public float Bg;
  
  public float I40;
  
  public float O4;
  
  public short nB0;
  
  public short V;
  
  public final Color Mj;
  
  public final Color vo0;
  
  public final Color Jb0;
  
  public final Color GB0;
  
  public final Color vX;
  
  public final eo hF0;
  
  public lw(Color paramColor1, Color paramColor2, Color paramColor3, Color paramColor4, Color paramColor5, eo parameo) {
    this.Mj = paramColor1;
    this.vo0 = paramColor2;
    this.Jb0 = paramColor3;
    this.GB0 = paramColor4;
    this.vX = paramColor5;
    this.hF0 = parameo;
  }
  
  public lw(ByteBuffer paramByteBuffer) {
    paramByteBuffer.position();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.ct0 = paramByteBuffer.getShort();
    this.Xp0 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.tu = paramByteBuffer.getShort();
    paramByteBuffer.get();
    this.Bg = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F;
    this.I40 = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F;
    this.O4 = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F;
    paramByteBuffer.get();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.nB0 = paramByteBuffer.getShort();
    this.V = paramByteBuffer.getShort();
    this.Mj = dL.z2(this.ct0);
    this.vo0 = dL.z2(this.nB0);
    this.Jb0 = dL.z2(this.V);
    this.GB0 = dL.z2(this.Xp0);
    this.vX = dL.z2(this.tu);
    float f = -this.I40;
    this.hF0 = new eo(-this.Bg, f, -this.O4);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */