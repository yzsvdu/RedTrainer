package f;

import java.util.ArrayList;
import java.util.HashMap;

public final class Ll {
  public static final HashMap rm = new HashMap<>();
  
  public static final ArrayList E6 = new ArrayList();
  
  public final String cU;
  
  public final int fK;
  
  public Ll(String paramString, int paramInt) {
    this.cU = paramString;
    this.fK = paramInt;
  }
  
  public static synchronized Ll F10(String paramString) {
    if (paramString.length() != 0) {
      HashMap<?, Ll> hashMap;
      Ll ll;
      if ((ll = (hashMap = rm).get(paramString)) == null) {
        this(paramString, hashMap.size());
        hashMap.put(paramString, new Ll());
        E6.add(ll);
      } 
      return ll;
    } 
    throw new IllegalArgumentException("name");
  }
  
  public final String G8() {
    return this.cU;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof Ll) {
      this = (Ll)paramObject;
      return (this.fK == this.fK);
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.fK;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ll.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */