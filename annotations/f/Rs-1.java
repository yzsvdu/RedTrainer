package f;

import java.util.EnumMap;

public abstract class Rs {
  public static final EnumMap OS = new EnumMap<>(Ht0.class);
  
  static {
    Ht0[] arrayOfHt0;
    int i = (arrayOfHt0 = Ht0.Oa0).length;
    for (byte b = 0; b < i; b++) {
      pRn pRn = pRn.WHITE;
      Ht0 ht0;
      switch ((ht0 = arrayOfHt0[b]).ordinal()) {
        case 17:
          this(-12369050);
          break;
        case 16:
          this(-10259268);
          break;
        case 15:
          this((byte)-80, (byte)-66, (byte)-60, (byte)-1);
          break;
        case 14:
          this(-5928280);
          break;
        case 13:
          this((byte)-1, (byte)-12, (byte)126, (byte)-1);
          break;
        case 12:
          this((byte)126, (byte)-1, (byte)-106, (byte)-1);
          break;
        case 11:
          this((byte)0, (byte)-52, (byte)-1, (byte)-1);
          break;
        case 10:
          this((byte)-1, (byte)126, (byte)126, (byte)-1);
          break;
        case 7:
          this(-5659169);
          break;
        case 6:
          this(-5516419);
          break;
        case 5:
          this(-3884411);
          break;
        case 4:
          this(-1398141);
          break;
        case 3:
          this((byte)-46, (byte)-119, (byte)-45, (byte)-1);
          break;
        case 1:
          this(-554912);
          break;
        case 0:
          this((byte)-24, (byte)-49, (byte)-124, (byte)-1);
          break;
      } 
      OS.put(ht0, pRn);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */