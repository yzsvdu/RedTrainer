package f;

import java.util.Comparator;

public final class ph0 {
  public static final Comparator Jy0 = Comparator.comparingInt(ph0::Nl0);
  
  public int VE;
  
  public String CON;
  
  public int TC;
  
  public String Gg;
  
  public ph0(int paramInt1, String paramString, int paramInt2) {
    this.VE = paramInt1;
    if (paramString.length() > 255) {
      this.CON = paramString.substring(0, 254);
    } else {
      this.CON = paramString;
    } 
    this.TC = paramInt2;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ph0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */