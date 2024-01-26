/* 1 */ package f;public abstract class Bw { public final void CH() { this
/* 2 */       .mk = zm0.u20; }
/*   */ 
/*   */   
/*   */   public long mk = zm0.zg();
/*   */   public HashSet nw = null;
/*   */   
/*   */   public long cB0() {
/*   */     return this.mk;
/*   */   }
/*   */   
/*   */   public abstract void yM();
/*   */   
/*   */   public final void lu(Object paramObject) {
/*   */     if (this.nw == null) {
/*   */       HashSet hashSet;
/*   */       this();
/*   */       this.nw = hashSet;
/*   */     } 
/*   */     this.nw.add(paramObject);
/*   */   }
/*   */   
/*   */   public final void gH0(Object paramObject) {
/*   */     HashSet hashSet;
/*   */     if ((hashSet = this.nw) == null)
/*   */       return; 
/*   */     hashSet.remove(paramObject);
/*   */     if (this.nw.isEmpty())
/*   */       this.nw = null; 
/*   */   }
/*   */   
/*   */   public boolean G50() {
/*   */     HashSet hashSet;
/*   */     return ((hashSet = this.nw) != null && !isEmpty());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */