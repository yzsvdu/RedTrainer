/* 1 */ package f;public final class MB0 extends CF { public final synchronized void Qf() { GI0 gI0; while ((gI0 = (GI0)this.ss0.poll()) != null) { Object object = gI0.Wl0; this
/* 2 */         .oa.remove(object); }
/*   */      }
/*   */ 
/*   */   
/*   */   static {
/*   */     C00.gd(MB0.class);
/*   */   }
/*   */   
/*   */   public final Reference Oc(Integer paramInteger, f1 paramf1, ReferenceQueue paramReferenceQueue) {
/*   */     return new GI0(paramInteger, paramf1, paramReferenceQueue);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */