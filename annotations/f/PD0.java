/*   */ package f;public final class PD0 implements YH0 {
/* 2 */   public final JE gy0 = new JE();
/*   */   
/*   */   public final void put(String paramString1, String paramString2) {
/*   */     Map<Object, Object> map;
/*   */     if ((map = this.gy0.get()) == null) {
/*   */       super();
/*   */       this.gy0.set(map);
/*   */     } 
/*   */     map.put(paramString1, paramString2);
/*   */   }
/*   */   
/*   */   public final String get(String paramString) {
/*   */     Map map;
/*   */     return ((map = this.gy0.get()) != null && paramString != null) ? (String)get(paramString) : null;
/*   */   }
/*   */   
/*   */   public final void remove(String paramString) {
/*   */     Map map;
/*   */     if ((map = this.gy0.get()) != null)
/*   */       remove(paramString); 
/*   */   }
/*   */   
/*   */   public final Map getCopyOfContextMap() {
/*   */     Map map;
/*   */     return ((map = this.gy0.get()) != null) ? new HashMap<>(this) : null;
/*   */   }
/*   */ }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */