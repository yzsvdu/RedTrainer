/* 1 */ package f;public class Gi0 implements Vj { private static final long serialVersionUID = 3L; public final int hashCode() { int j, k; byte b = 31; o80 o802; if ((o802 = this.PRN) == null) { k = 0; } else { k = k.oj; }  int i = (b + k) * 31; o80 o801;
/* 2 */     if ((o801 = this.Jd0) == null) { j = 0; }
/* 3 */     else { j = j.oj; }  return i + j; } public final o80 PRN; public final o80 Jd0; public String toString() {
/* 4 */     return String.format("%s - %s", new Object[] { this.PRN.toString(), this.Jd0.toString() });
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (this == paramObject)
/*   */       return true; 
/*   */     if (paramObject == null)
/*   */       return false; 
/*   */     if (!(paramObject instanceof Gi0))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     o80 o801;
/*   */     o80 o802;
/*   */     return ((o801 = this.PRN) != null && (o802 = ((Gi0)paramObject).PRN) != null && this.Jd0 != null && ((Gi0)paramObject).Jd0 != null && o801.equals(o802) && this.Jd0.equals(((Gi0)paramObject).Jd0));
/*   */   }
/*   */   
/*   */   public final Iterator qg0() {
/*   */     return new K9(this);
/*   */   }
/*   */   
/*   */   public Gi0(o80 paramo801, o80 paramo802) {
/*   */     this.PRN = paramo801;
/*   */     this.Jd0 = paramo802;
/*   */     if (paramo801 != null && paramo802 != null) {
/*   */       if (paramo801.H00(paramo802) <= 0)
/*   */         return; 
/*   */       arrayOfObject[0] = paramo801.toString();
/*   */       Object[] arrayOfObject;
/*   */       (arrayOfObject = new Object[2])[1] = paramo802.toString();
/*   */       throw new IllegalArgumentException(String.format("The first address in the range (%s) has to be lower than the last address (%s)", arrayOfObject));
/*   */     } 
/*   */     throw new NullPointerException("Neither the first nor the last address can be null");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Gi0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */