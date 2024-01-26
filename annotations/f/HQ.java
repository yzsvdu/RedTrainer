/* 1 */ package f;public final class HQ { public final void Ji(lj0 paramlj0) { this.gr
/* 2 */       .put(Short.valueOf(paramlj0.Pu0), paramlj0); }
/*   */ 
/*   */   
/*   */   public static final HQ Z90 = new HQ();
/*   */   public TreeMap gr;
/*   */   
/*   */   public HQ() {
/*   */     TreeMap<Object, Object> treeMap;
/*   */     this();
/*   */     this.gr = this;
/*   */   }
/*   */   
/*   */   public static HQ uA0() {
/*   */     return Z90;
/*   */   }
/*   */   
/*   */   public final lj0 Qe(short paramShort) {
/*   */     lj0 lj0;
/*   */     TreeMap treeMap;
/*   */     if ((treeMap = this.gr) == null) {
/*   */       treeMap = null;
/*   */     } else if ((lj0 = (lj0)get(Short.valueOf(paramShort))) == null) {
/*   */       this(paramShort, false);
/*   */     } 
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */