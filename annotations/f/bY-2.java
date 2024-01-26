package f;

import com.badlogic.gdx.graphics.Texture;
import java.util.ArrayList;
import java.util.Iterator;

public final class bY implements iq0 {
  public RD0 u00;
  
  public ArrayList gE0;
  
  public bY(hZ paramhZ) {
    ArrayList arrayList;
    this();
    this.gE0 = this;
    this.u00 = paramhZ;
  }
  
  public final void dispose() {
    Iterator<Texture> iterator = this.gE0.iterator();
    while (iterator.hasNext())
      ((Texture)iterator.next()).dispose(); 
    this.gE0.clear();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */