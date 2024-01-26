package f;

import java.nio.ByteBuffer;

public final class eA0 {
  public int HQ;
  
  public lw[] R10;
  
  public eA0(int paramInt, ByteBuffer paramByteBuffer) {
    this.HQ = paramInt;
    this.R10 = new lw[15];
    for (paramInt = 0; paramInt < 15; paramInt++) {
      lw lw1;
      this(paramByteBuffer);
      this.R10[paramInt] = lw1;
    } 
  }
  
  public static int W70(int paramInt) {
    return (paramInt < 360) ? 1 : ((paramInt < 390) ? 2 : ((paramInt < 420) ? 3 : ((paramInt < 600) ? 4 : ((paramInt < 690) ? 5 : ((paramInt < 720) ? 6 : ((paramInt < 930) ? 7 : ((paramInt < 960) ? 8 : ((paramInt < 1020) ? 9 : ((paramInt < 1080) ? 10 : ((paramInt < 1110) ? 11 : ((paramInt < 1200) ? 12 : ((paramInt < 1260) ? 13 : ((paramInt < 1380) ? 14 : 0)))))))))))));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */