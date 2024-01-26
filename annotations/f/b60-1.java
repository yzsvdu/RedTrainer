package f;

import java.util.ArrayList;

public final class b60 {
  public int a0;
  
  public short hV;
  
  public ArrayList JX;
  
  public b60(int paramInt, short paramShort) {
    ArrayList arrayList;
    this();
    this.JX = this;
    this.a0 = paramInt;
    this.hV = paramShort;
  }
  
  static {
    C00.gd(b60.class);
  }
  
  public final boolean Fc0(short paramShort) {
    return ((this.hV & paramShort) != 0);
  }
  
  public final boolean vt0(short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramBoolean1 && paramBoolean2)
      return false; 
    if (Fc0((short)-32627))
      return false; 
    switch (paramShort) {
      default:
        return true;
      case 191:
      case 201:
      case 240:
      case 241:
      case 258:
      case 390:
      case 446:
        return false;
      case 57:
      case 507:
      case 1017:
      case 1018:
      case 1038:
        break;
    } 
    return paramBoolean2 ^ true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/b60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */