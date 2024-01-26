package f;

import com.badlogic.gdx.graphics.Color;

public abstract class dL {
  public static final float[] Rb0 = new float[] { 
      0.0F, 2.0F, 4.0F, 8.0F, 16.0F, 32.0F, 64.0F, 128.0F, 256.0F, 512.0F, 
      1024.0F, 2048.0F, 4096.0F };
  
  public static Color z2(int paramInt) {
    float f1 = (paramInt & 0x1F) / 31.0F;
    float f2 = (paramInt >> 5 & 0x1F) / 31.0F;
    float f3 = (paramInt >> 10 & 0x1F) / 31.0F;
    return new Color(f1, f2, f3, 1.0F);
  }
  
  public static int AC0(int paramInt) {
    return (int)((paramInt & 0x1F) / 31.0F * 255.0F) << 24 | (int)((paramInt >> 5 & 0x1F) / 31.0F * 255.0F) << 16 | (int)((paramInt >> 10 & 0x1F) / 31.0F * 255.0F) << 8 | 0xFF;
  }
  
  public static float jv0(short paramShort) {
    return cOm4(3, 12, paramShort);
  }
  
  public static float cOm4(int paramInt1, int paramInt2, short paramShort) {
    int i;
    if ((paramShort & 1 << (paramInt1 = 1 + paramInt1 + paramInt2) - 1) != 0)
      i = paramShort | -1 << paramInt1; 
    return i / Rb0[paramInt2];
  }
  
  public static float Jd0(int paramInt) {
    return paramInt / Rb0[12];
  }
  
  public static float T50(int paramInt) {
    paramInt = 12;
    return paramInt / Rb0[paramInt];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */