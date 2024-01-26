package f;

public abstract class py {
  public static boolean c7(short paramShort, short[] paramArrayOfshort) {
    int i = paramArrayOfshort.length;
    for (byte b = 0; b < i; b++) {
      if (paramArrayOfshort[b] == paramShort)
        return true; 
    } 
    return false;
  }
  
  public static boolean Gw0(Object paramObject, Object[] paramArrayOfObject) {
    int i;
    if (paramObject == null) {
      i = paramArrayOfObject.length;
      for (byte b = 0; b < i; b++) {
        if (paramArrayOfObject[b] == null)
          return true; 
      } 
    } else {
      int j = paramArrayOfObject.length;
      for (byte b = 0; b < j; b++) {
        if (paramArrayOfObject[b].equals(i))
          return true; 
      } 
    } 
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/py.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */