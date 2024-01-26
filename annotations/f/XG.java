package f;

import java.io.File;

public final class XG implements lpt2 {
  public static final String com5;
  
  public static final String OE;
  
  static {
    String str;
    com5 = System.getProperty("user.home") + (str = File.separator);
    OE = (new File("")).getAbsolutePath() + str;
  }
  
  public final hZ VH(String paramString, G20 paramG20) {
    return new hZ(paramString, paramG20);
  }
  
  public final hZ cw(String paramString) {
    return new hZ(paramString, G20.Uc);
  }
  
  public final hZ aP(String paramString) {
    return new hZ(paramString, G20.iD);
  }
  
  public final hZ lPT1(String paramString) {
    return new hZ(paramString, G20.O30);
  }
  
  public final hZ N0(String paramString) {
    return new hZ(paramString, G20.XS);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */