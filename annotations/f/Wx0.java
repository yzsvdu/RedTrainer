package f;

import com.badlogic.gdx.graphics.Texture;
import java.util.HashMap;
import java.util.Iterator;

public final class Wx0 {
  public static Wx0 i4 = new Wx0();
  
  public HashMap Pb;
  
  public Wx0() {
    HashMap<Object, Object> hashMap;
    this();
    this.Pb = this;
  }
  
  public final void TV() {
    Iterator<Texture> iterator = this.Pb.values().iterator();
    while (iterator.hasNext())
      ((Texture)iterator.next()).dispose(); 
    this.Pb.clear();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */