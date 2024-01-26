package f;

import java.nio.channels.SelectionKey;
import java.util.Iterator;

public final class wz extends Con {
  public wz() {
    super("Accept Dispatcher", null);
  }
  
  public final void ok0() {
    if (this.hr0.selectNow() != 0) {
      Iterator<SelectionKey> iterator = this.hr0.selectedKeys().iterator();
      while (hasNext()) {
        SelectionKey selectionKey = (SelectionKey)next();
        remove();
        if (selectionKey.isValid())
          Con.kp0(selectionKey); 
      } 
    } 
  }
  
  public final void xl(LPt3 paramLPt3) {
    throw new UnsupportedOperationException("This method should never be called!");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */