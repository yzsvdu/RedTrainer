package f;

public enum vD0 {
  public static final ak Wf;
  
  public final byte jK;
  
  vD0(int paramInt1) {
    this.jK = (byte)paramInt1;
  }
  
  static {
    this("RED", 0, 0);
    vD0 vD01;
    vD0 vD02;
    vD0 vD03;
    vD0 vD04;
    vD0 vD05;
    vD0 vD06;
    vD0 vD07;
    vD0 vD08;
    vD0 vD09;
    vD0 vD010;
    vD0 vD011;
    this("BLUE", 1, 1);
    this("YELLOW", 2, 2);
    this("GREEN", 3, 3);
    this("BLACK", 4, 4);
    this("BROWN", 5, 5);
    this("PURPLE", 6, 6);
    this("GRAY", 7, 7);
    this("WHITE", 8, 8);
    this("PINK", 9, 9);
    this("NONE", 10, 10);
    e60 = new vD0[] { 
        vD01, vD02, vD03, vD04, vD05, vD06, vD07, vD08, vD09, vD010, 
        vD011 };
    Wf = new ak();
    vD0[] arrayOfVD0;
    int i = (arrayOfVD0 = values()).length;
    for (byte b = 0; b < i; b++) {
      vD04 = arrayOfVD0[b];
      Wf.VF(vD04.jK, vD04);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */