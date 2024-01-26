/*    */ package f;public final class AI0 extends Qa0 implements r60 { public final boolean i2(oa0 paramoa0) {
/*  2 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO() && (
/*    */       
/*  5 */       h1.J20(paramoa0.GG0, BM.bC) || 
/*    */       
/*  7 */       h1.J20(paramoa0.GG0, BM.lc))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.Ri0.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final Ip hW;
/*    */   public final Un Ri0;
/*    */   public Runnable e8;
/*    */   
/*    */   public AI0(String paramString) {
/*    */     super(false, false);
/*    */     dQ dQ;
/*    */     Xu("confirm-widget");
/*    */     (this.hW = new Ip()).Xu("confirm-panel");
/*    */     this(paramString);
/*    */     this(Ml0.OH0(52));
/*    */     this.Ri0 = un;
/*    */     Un un;
/*    */     (un = new Un()).tW(() -> {
/*    */           ra0();
/*    */           Runnable runnable;
/*    */           if ((runnable = this.e8) != null)
/*    */             run(); 
/*    */         });
/*    */     (new Ip()).WN((new Ip()).d7().Ya(dQ).Ya(un).Em0());
/*    */     (new Ip()).rK0((new Ip()).mE0().Ya(dQ).Ya(un));
/*    */     J8(new Ip());
/*    */     this.eh = km.XU();
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     VA0.c90(this.Ri0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.hW.mM();
/*    */     QI();
/*    */     this.hW.js0(et.Wi0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */