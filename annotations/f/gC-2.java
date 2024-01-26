/* 1 */ package f;public final class gC extends sH { public final void jL() { if (System.currentTimeMillis() - this.oq < 3000L)
/* 2 */       return;  if (!this.HF) { this.HF = true; if (km.MR != null) { this.y20
/* 3 */           .pm
/*   */           
/* 5 */           .vE(nl.rm, false);
/* 6 */         km.kH0.jN(Ml0.Qf0(F40.wI, 263, 3)); }
/* 7 */       else { this.y20.pm
/* 8 */           .Mv = null;
/* 9 */         km.kH0.jN(Ml0.Qf0(F40.wI, 263, 4)); }  km.u4.TA0(false); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final Jo y20;
/*   */   public final long oq = System.currentTimeMillis();
/*   */   public boolean HF = false;
/*   */   
/*   */   public gC(Jo paramJo) {
/*   */     this.y20 = paramJo;
/*   */     km.u4.TA0(true);
/*   */     paramJo.kz0().Ko0(nl.Qt);
/*   */   }
/*   */   
/*   */   public final void Y20() {
/*   */     this.y20.pm.Mv = null;
/*   */   }
/*   */   
/*   */   public final boolean CoM9() {
/*   */     return (this.HF && !km.kH0.xy0());
/*   */   }
/*   */   
/*   */   public final byte coM9() {
/*   */     throw new UnsupportedOperationException();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */