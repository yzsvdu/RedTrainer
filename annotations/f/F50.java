package f;

public final class F50 extends Fy0 {
  public F50(i parami, boolean paramBoolean) {
    super("", 160, 32);
    String str;
    StringBuilder stringBuilder;
    Xu("market-button");
    this();
    if (parami.zn() > 1 || paramBoolean) {
      str = parami.zn() + "x ";
    } else {
      str = "";
    } 
    s6(stringBuilder.append(str).append(parami.WQ()).toString());
    if (parami.jz0() == null) {
      zY().qt(new U70[] { wm0.y8().ip0(parami.Nm0()) });
      zY().zT(123, 3);
      zY().tL(24, 24);
    } 
    if (km.XU()) {
      AL(500, 64);
      zY().zT(3, HY() / 2 - 24);
      zY().tL(48, 48);
    } 
  }
  
  public F50(UD0 paramUD0) {
    super("", 160, 32);
    Xu("market-button");
    s6(paramUD0.wp());
    zY().sm(um0.TK0().lb(paramUD0.Uf(), false, (byte)0));
    zY().zT(123, -7);
    zY().tL(36, 36);
    if (km.XU())
      AL(320, 64); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/F50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */