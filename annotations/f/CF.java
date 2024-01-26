package f;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;

public abstract class CF {
  public final HashMap oa;
  
  public final ReferenceQueue ss0;
  
  public CF() {
    HashMap<Object, Object> hashMap;
    ReferenceQueue referenceQueue;
    this();
    this.oa = this;
    this();
    this.ss0 = this;
  }
  
  public abstract void Qf();
  
  public abstract Reference Oc(Integer paramInteger, f1 paramf1, ReferenceQueue paramReferenceQueue);
  
  public final void Qn0(Integer paramInteger, f1 paramf1) {
    Qf();
    if (!this.oa.containsKey(paramInteger)) {
      Reference reference = Oc(paramInteger, paramf1, this.ss0);
      this.oa.put(paramInteger, this);
      return;
    } 
    throw new IllegalArgumentException("Key: " + paramInteger + " already exists in map");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */