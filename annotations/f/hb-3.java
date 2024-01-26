package f;

import java.util.ArrayList;

public abstract class hb {
  public final ArrayList QT;
  
  public final Rz0 Hi0;
  
  public hb(int paramInt, Rz0 paramRz0) {
    ArrayList arrayList;
    this(paramInt);
    this.QT = this;
    this.Hi0 = paramRz0;
  }
  
  public abstract Object pu0();
  
  public final Object al() {
    Object object = null;
    try {
      if (this.QT.isEmpty()) {
      
      } else {
      
      } 
      object = this.QT.remove(0);
    } catch (Exception exception) {}
    if (object == null)
      object = pu0(); 
    Rz0 rz0;
    if ((rz0 = this.Hi0) != null)
      js0(object); 
    return object;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */