package f;

public enum QF {
  public static QF[] Com2;
  
  public final byte c40;
  
  QF(int paramInt1) {
    this.c40 = (byte)paramInt1;
  }
  
  static {
    this("TRADE", 0, 0);
    QF qF1;
    QF qF2;
    QF qF3;
    QF qF4;
    this("MAIL", 1, 1);
    this("AUCTION", 2, 2);
    this("NPC", 3, 3);
    Lw = new QF[] { qF1, qF2, qF3, qF4 };
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */