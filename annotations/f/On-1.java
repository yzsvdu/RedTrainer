package f;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public final class On {
  public static On COM2 = new On();
  
  public HashMap iI0;
  
  public HashMap t9;
  
  public On() {
    HashMap<Object, Object> hashMap;
    this();
    this.iI0 = this;
    this();
    this.t9 = this;
  }
  
  public static On v30() {
    if (COM2 == null)
      COM2 = new On(); 
    return COM2;
  }
  
  public final UD0 lpT3(short paramShort) {
    return (UD0)this.iI0.get(Short.valueOf(paramShort));
  }
  
  public final ArrayList K6(byte paramByte) {
    this();
    ArrayList arrayList;
    Iterator<UD0> iterator = this.t9.values().iterator();
    while (iterator.hasNext()) {
      UD0 uD0;
      if ((uD0 = iterator.next()).PP(paramByte) < 1)
        continue; 
      add((E)uD0);
    } 
    Collections.sort(this, Comparator.comparingInt(paramByte::lpT2));
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/On.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */