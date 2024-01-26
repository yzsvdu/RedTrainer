package f;

public enum ZG0 {
  public static final ak fc;
  
  public byte J20;
  
  ZG0(String paramString) {
    this.J20 = this$enum$name;
  }
  
  static {
    this((byte)0, 0, "PLAYER_NAME");
    ZG0 zG01;
    ZG0 zG02;
    ZG0 zG03;
    this((byte)1, 1, "GUILD_NAME");
    this((byte)2, 2, "GUILD_TAG");
    gl0 = new ZG0[] { zG01, zG02, zG03 };
    fc = new ak();
    ZG0[] arrayOfZG0;
    int i = (arrayOfZG0 = values()).length;
    for (byte b = 0; b < i; b++) {
      ZG0 zG0 = arrayOfZG0[b];
      fc.VF(zG0.J20, zG0);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */