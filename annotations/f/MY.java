/* 1 */ package f;public final class MY extends wb { public final wb O3() { this.yH0.eC().Wz0(this.Br0)
/*   */       
/* 3 */       .mg(this.pb.dr0);
/* 4 */     tS();
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final float Br0;
/*   */   public final So yH0;
/*   */   public ArrayList rK = new ArrayList();
/*   */   public boolean n8 = false;
/*   */   
/*   */   public MY(hm0 paramhm0, float paramFloat, Runnable paramRunnable) {
/*   */     super(paramhm0);
/*   */     this.Br0 = paramFloat;
/*   */     this.yH0 = So.k60();
/*   */     if (paramRunnable != null)
/*   */       this.rK.add(paramRunnable); 
/*   */   }
/*   */   
/*   */   public final boolean cw() {
/*   */     if (this.yH0.DD()) {
/*   */       if (!this.n8) {
/*   */         this.n8 = true;
/*   */         Iterator iterator = this.rK.iterator();
/*   */         while (hasNext())
/*   */           ((Runnable)next()).run(); 
/*   */       } 
/*   */       return true;
/*   */     } 
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean tF0(boolean paramBoolean) {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MY.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */