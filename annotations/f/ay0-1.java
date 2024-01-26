/*   */ package f;public final class ay0 extends Hx implements Serializable { public final String toString() {
/* 2 */     return ay0.class.getSimpleName() + "(" + this.lPt1.toString() + ")";
/*   */   }
/*   */   
/*   */   private static final long serialVersionUID = 6131563330944994230L;
/*   */   public final Fj lPt1;
/*   */   
/*   */   public ay0(Hx paramHx) {
/*   */     if (paramHx != null) {
/*   */       this.lPt1 = paramHx;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("The filter must not be null");
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile) {
/*   */     return this.lPt1.accept(paramFile) ^ true;
/*   */   }
/*   */   
/*   */   public final boolean accept(File paramFile, String paramString) {
/*   */     return this.lPt1.accept(paramFile, paramString) ^ true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ay0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */