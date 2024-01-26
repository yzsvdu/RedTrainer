/* 1 */ package f;public final class RC0 extends yp0 { public final void wL() { Dk0 dk0 = this.hv0; String str = this.Qb; this.R
/* 2 */       .add(new Rb(str)); }
/*   */ 
/*   */   
/*   */   public String Qb;
/*   */   public Dk0 hv0;
/*   */   public ArrayList OI;
/*   */   public boolean Eb;
/*   */   
/*   */   public RC0(String paramString, Dk0 paramDk0, Runnable paramRunnable) {
/*   */     ArrayList arrayList;
/*   */     this();
/*   */     this.OI = this;
/*   */     this.Eb = false;
/*   */     this.Qb = paramString;
/*   */     this.hv0 = paramDk0;
/*   */     if (paramRunnable != null)
/*   */       add((E)paramRunnable); 
/*   */   }
/*   */   
/*   */   public final boolean Ie() {
/*   */     if (this.hv0.bA0()) {
/*   */       if (this.Eb)
/*   */         return true; 
/*   */       this.Eb = true;
/*   */       Iterator iterator = this.OI.iterator();
/*   */       while (hasNext()) {
/*   */         Runnable runnable;
/*   */         if ((runnable = (Runnable)next()) != null)
/*   */           runnable.run(); 
/*   */       } 
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean xA0() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final int zE() {
/*   */     return 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */