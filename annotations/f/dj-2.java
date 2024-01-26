/* 1 */ package f;public abstract class dj implements Comparable { public static final long tv0(String paramString) { fQ fQ1; long l; byte b = 0; while (true) { if (b < (fQ1 = tC).Z8) { if (((String)fQ1.get(b)).compareTo(paramString) == 0) { long l1 = 1L << b; break; }  b++; continue; }  l = 0L; break; }  if (l > 0L) return l;  fQ1
/* 2 */       .Com3(paramString); int i = fQ1.Z8 - 1; return 1L << i; }
/*   */ 
/*   */   
/*   */   public static final fQ tC = new fQ();
/*   */   public final long tL;
/*   */   public final int lPt1;
/*   */   
/*   */   public dj(long paramLong) {
/*   */     this.tL = paramLong;
/*   */     this.lPt1 = Long.numberOfTrailingZeros(paramLong);
/*   */   }
/*   */   
/*   */   public abstract dj Mi0();
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     boolean bool;
/*   */     if (paramObject == null)
/*   */       return false; 
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!(paramObject instanceof dj))
/*   */       return false; 
/*   */     paramObject = paramObject;
/*   */     if (this.tL != ((dj)paramObject).tL)
/*   */       return false; 
/*   */     if (paramObject.hashCode() == hashCode()) {
/*   */       bool = true;
/*   */     } else {
/*   */       bool = false;
/*   */     } 
/*   */     return bool;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     Object object;
/*   */     int i;
/*   */     for (long l = this.tL; l != 0L && ++i < 63 && (l >> i & 0x1L) == 0L;);
/*   */     fQ fQ1;
/*   */     if (i >= 0 && i < (fQ1 = tC).Z8) {
/*   */       object = fQ1.get(i);
/*   */     } else {
/*   */       object = null;
/*   */     } 
/*   */     return (String)this;
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.lPt1 * 7489;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dj.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */