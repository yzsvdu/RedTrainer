package f;

import java.util.Iterator;

public final class eL implements Iterable {
  public final String F2;
  
  public final eL aF;
  
  public eL(String paramString, eL parameL) {
    if (paramString != null) {
      this.F2 = paramString;
      this.aF = parameL;
      return;
    } 
    throw new NullPointerException("value");
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof eL))
      return false; 
    paramObject = paramObject;
    return (this.F2.equals(((eL)paramObject).F2) && ((this = this.aF) == (paramObject = ((eL)paramObject).aF) || (this != null && equals(paramObject))));
  }
  
  public final int hashCode() {
    int i = this.F2.hashCode();
    eL eL1;
    if ((eL1 = this.aF) != null) {
      i *= 67;
      i = eL1.hashCode() + i;
    } 
    return i;
  }
  
  public final String toString() {
    if (this.aF == null)
      return this.F2; 
    this();
    StringBuilder stringBuilder;
    (stringBuilder = new StringBuilder()).append(this.F2);
    for (this = this.aF; this != null; this = this.aF)
      stringBuilder.append(", ").append(this.F2); 
    return stringBuilder.toString();
  }
  
  public final Iterator iterator() {
    return new dI0(this);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */