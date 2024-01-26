package f;

public abstract class qi {
  public static boolean ml(Class paramClass1, Class paramClass2) {
    if (paramClass1 == paramClass2)
      return true; 
    if (paramClass1 != null) {
      while (paramClass1 != null) {
        if (paramClass1 == paramClass2)
          return true; 
        if (paramClass2.isInterface()) {
          Class[] arrayOfClass;
          int i = (arrayOfClass = paramClass1.getInterfaces()).length;
          for (byte b = 0; b < i; b++) {
            if (ml(arrayOfClass[b], paramClass2))
              return true; 
          } 
        } 
        paramClass1 = paramClass1.getSuperclass();
      } 
      return false;
    } 
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */