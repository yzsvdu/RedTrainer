package f;

public abstract class Lc {
  public final int max;
  
  public int peak;
  
  private final fQ freeObjects;
  
  public Lc() {
    this(16, 2147483647);
  }
  
  public Lc(int paramInt) {
    this(paramInt, 2147483647);
  }
  
  public Lc(int paramInt1, int paramInt2) {
    fQ fQ1;
    this(false, paramInt1);
    this.freeObjects = this;
    this.max = paramInt2;
  }
  
  public abstract Object newObject();
  
  public Object obtain() {
    fQ fQ1;
    return ((fQ1 = this.freeObjects).Z8 == 0) ? newObject() : fQ1.pop();
  }
  
  public void free(Object paramObject) {
    if (paramObject != null) {
      fQ fQ1;
      if ((fQ1 = this.freeObjects).Z8 < this.max) {
        fQ1.Com3(paramObject);
        this.peak = Math.max(this.peak, this.freeObjects.Z8);
        reset(paramObject);
      } else {
        discard(paramObject);
      } 
      return;
    } 
    throw new IllegalArgumentException("object cannot be null.");
  }
  
  public void fill(int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      fQ fQ1;
      if ((fQ1 = this.freeObjects).Z8 < this.max)
        fQ1.Com3(newObject()); 
    } 
    this.peak = Math.max(this.peak, this.freeObjects.Z8);
  }
  
  public void reset(Object paramObject) {
    if (paramObject instanceof qd0)
      ((qd0)paramObject).reset(); 
  }
  
  public void discard(Object paramObject) {
    reset(paramObject);
  }
  
  public void freeAll(fQ paramfQ) {
    if (paramfQ != null) {
      fQ fQ1 = this.freeObjects;
      int i = this.max;
      byte b = 0;
      int j = paramfQ.Z8;
      while (b < j) {
        Object object;
        if ((object = paramfQ.get(b)) != null)
          if (fQ1.Z8 < i) {
            fQ1.Com3(object);
            reset(object);
          } else {
            discard(object);
          }  
        b++;
      } 
      this.peak = Math.max(this.peak, fQ1.Z8);
      return;
    } 
    throw new IllegalArgumentException("objects cannot be null.");
  }
  
  public void clear() {
    byte b = 0;
    fQ fQ1;
    int i = (fQ1 = this.freeObjects).Z8;
    while (b < i) {
      discard(fQ1.get(b));
      b++;
    } 
    fQ1.clear();
  }
  
  public int getFree() {
    return this.freeObjects.Z8;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */