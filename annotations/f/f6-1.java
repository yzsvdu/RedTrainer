/* 1 */ package f;public final class f6 extends me { public static void d6(zP paramzP) { if ("polygon14_msg_r10".equals(paramzP.v30) && paramzP.coM1
/* 2 */       .cq
/* 3 */       .Ct(paramzP, true)) paramzP.coM1 = null;
/*   */     
/* 5 */     Hc0 hc0 = paramzP.cq.r30(); for (; hc0
/* 6 */       .hasNext(); d6((zP)hc0.next())); }
/*   */ 
/*   */   
/*   */   public boolean sw0;
/*   */   
/*   */   public f6(hB0 paramhB0) {
/*   */     super(paramhB0);
/*   */   }
/*   */   
/*   */   public final void Ic0(float paramFloat) {
/*   */     super.Ic0(paramFloat);
/*   */     if (!this.sw0)
/*   */       for (Hc0 hc0 = km.wI0.iJ0.wN.r30(); hc0.hasNext(); ) {
/*   */         Ah ah;
/*   */         if ((ah = (Ah)hc0.next()).wg0.Ga != this.im0.Xg0())
/*   */           continue; 
/*   */         this.sw0 = true;
/*   */         for (Hc0 hc02 = ah.K9.vC0.r30(); hc02.hasNext(); d6((zP)hc02.next()));
/*   */         for (Hc0 hc01 = ah.W7.r30(); hc01.hasNext();) {
/*   */           if ("poster_fs01".equals((lpt1 = (lpt1)hc01.next()).Zl0)) {
/*   */             lpt1.mh.g7(1000.0F, 1000.0F, 1000.0F);
/*   */             lpt1.C50();
/*   */           } 
/*   */         } 
/*   */       }  
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/f6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */