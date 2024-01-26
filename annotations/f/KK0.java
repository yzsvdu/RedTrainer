/* 1 */ package f;public final class KK0 extends da { public long bY; public boolean d0; public KK0(String paramString, int paramInt) { MS mS; this.d0 = false; this(); this.volatile = new MS(); Ld(this); this.volatile
/* 2 */       .Oh(B40.df("<div style=\"display: inline; word-wrap: break-word;\">").append(dg.km0(paramString)).append("\n</div>").toString()); this.GK0 = paramInt; this.bY = System.currentTimeMillis() + 5000L; }
/* 3 */   public int GK0; public MS volatile; public final void close() { UB0.Kg0.fN(new kM(this)); } public final void No0() { this.d0 = true; (this.db0 = new I(new Ja0(this), pRn.WHITE))
/* 4 */       .oC0(250);
/* 5 */     this.db0
/* 6 */       .md(this::close); }
/*   */ 
/*   */   
/*   */   public final void V90(throws paramthrows) {
/*   */     if (System.currentTimeMillis() >= this.bY && !this.d0)
/*   */       No0(); 
/*   */     super.V90(paramthrows);
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     mM();
/*   */     super.d40();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */