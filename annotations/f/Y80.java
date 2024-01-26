package f;

public enum Y80 {
  public static final ak uj0;
  
  public final byte cC;
  
  Y80(int paramInt1) {
    this.cC = (byte)paramInt1;
  }
  
  public static Y80 io(byte paramByte) {
    return (Y80)uj0.Ha0(paramByte);
  }
  
  static {
    this("RANDOM", 0, 0);
    Y80 y801;
    Y80 y802;
    Y80 y803;
    Y80 y804;
    Y80 y805;
    Y80 y806;
    Y80 y807;
    Y80 y808;
    Y80 y809;
    this("GYM_STYLE", 1, 1);
    this("VILLIAN_TEAM_STYLE", 2, 2);
    this("UNKNOWN_0x03", 3, 3);
    this("TOP_4_1", 4, 4);
    this("TOP_4_2", 5, 5);
    this("TOP_4_3", 6, 6);
    this("TOP_4_4", 7, 7);
    this("BIG_RED_BALL", 8, 8);
    qi0 = new Y80[] { y801, y802, y803, y804, y805, y806, y807, y808, y809 };
    uj0 = new ak();
    Y80[] arrayOfY80;
    int i = (arrayOfY80 = values()).length;
    for (byte b = 0; b < i; b++) {
      y804 = arrayOfY80[b];
      uj0.VF(y804.cC, y804);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Y80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */