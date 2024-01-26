package f;

import java.util.ArrayList;

public final class G30 {
  public final ArrayList x;
  
  public G30() {
    ArrayList arrayList;
    this(20);
    this.x = this;
  }
  
  public final void cOm4(float paramFloat) {
    int i;
    for (i = this.x.size() - 1; i >= 0; i--) {
      sh sh;
      if ((sh = this.x.get(i)).DD() && sh.DP) {
        this.x.remove(i);
        sh.Cy0();
      } 
    } 
    if (paramFloat >= 0.0F) {
      i = 0;
      int j = this.x.size();
      while (i < j) {
        ((sh)this.x.get(i)).nO(paramFloat);
        i++;
      } 
    } else {
      for (i = this.x.size() - 1; i >= 0; i--)
        ((sh)this.x.get(i)).nO(paramFloat); 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/G30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */