package f;

import java.util.Comparator;

public final class d10 extends fQ {
  public Object[] B70;
  
  public Object[] jp0;
  
  public int Hx0;
  
  public d10() {}
  
  public d10(fQ paramfQ) {
    super(paramfQ);
  }
  
  public d10(boolean paramBoolean, int paramInt, Class paramClass) {
    super(paramBoolean, paramInt, paramClass);
  }
  
  public d10(boolean paramBoolean, int paramInt) {
    super(paramBoolean, paramInt);
  }
  
  public d10(boolean paramBoolean, Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
    super(paramBoolean, paramArrayOfObject, paramInt1, paramInt2);
  }
  
  public d10(Class paramClass) {
    super(paramClass);
  }
  
  public d10(int paramInt) {
    super(paramInt);
  }
  
  public d10(Object[] paramArrayOfObject) {
    super(paramArrayOfObject);
  }
  
  public final Object[] Jv0() {
    DM();
    this.B70 = arrayOfObject;
    this.Hx0++;
    Object[] arrayOfObject;
    return arrayOfObject = this.Uq0;
  }
  
  public final void At0() {
    int i = Math.max(0, this.Hx0 - 1);
    Object[] arrayOfObject;
    if ((arrayOfObject = this.B70) == null)
      return; 
    if (arrayOfObject != this.Uq0 && i == 0) {
      this.jp0 = arrayOfObject;
      i = 0;
      int j = arrayOfObject.length;
      while (i < j) {
        this.jp0[i] = null;
        i++;
      } 
    } 
    this.B70 = null;
  }
  
  public final void Bz0(int paramInt, Object paramObject) {
    DM();
    super.Bz0(paramInt, paramObject);
  }
  
  public final void Tc(int paramInt, Object paramObject) {
    DM();
    super.Tc(paramInt, paramObject);
  }
  
  public final boolean Ct(Object paramObject, boolean paramBoolean) {
    DM();
    return super.Ct(paramObject, paramBoolean);
  }
  
  public final Object Hc(int paramInt) {
    DM();
    return super.Hc(paramInt);
  }
  
  public final void il(int paramInt) {
    DM();
    super.il(paramInt);
  }
  
  public final boolean tF(fQ paramfQ, boolean paramBoolean) {
    DM();
    return super.tF(paramfQ, paramBoolean);
  }
  
  public final Object pop() {
    DM();
    return super.pop();
  }
  
  public final void clear() {
    DM();
    super.clear();
  }
  
  public final void sort(Comparator paramComparator) {
    DM();
    super.sort(paramComparator);
  }
  
  public final void OU() {
    DM();
    super.OU();
  }
  
  public final void pL0(int paramInt) {
    DM();
    super.pL0(paramInt);
  }
  
  public final void DM() {
    Object[] arrayOfObject1;
    if ((arrayOfObject1 = this.B70) == null || arrayOfObject1 != (arrayOfObject1 = this.Uq0))
      return; 
    Object[] arrayOfObject2;
    int i;
    if ((arrayOfObject2 = this.jp0) != null && arrayOfObject2.length >= (i = this.Z8)) {
      System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, i);
      this.Uq0 = this.jp0;
      this.jp0 = null;
    } else {
      mt(arrayOfObject1.length);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/d10.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */