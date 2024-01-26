package f;

public abstract class X2 {
  public static YH0 zz;
  
  public static void ra(String paramString1, String paramString2) {
    YH0 yH0;
    if ((yH0 = zz) != null) {
      yH0.put(paramString1, paramString2);
      return;
    } 
    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
  }
  
  public static void wy0(String paramString) {
    YH0 yH0;
    if ((yH0 = zz) != null) {
      yH0.remove(paramString);
      return;
    } 
    throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
  }
  
  static {
    BV bV;
    if ((bV = C00.Rs0()) != null) {
      zz = bV.getMDCAdapter();
    } else {
      z2.MJ("Failed to find provider.");
      z2.MJ("Defaulting to no-operation MDCAdapter implementation.");
      zz = new OF();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */