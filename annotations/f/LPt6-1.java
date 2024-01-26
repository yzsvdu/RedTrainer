/* 1 */ package f;public final class LPt6 implements Bu0 { public final void zr0() { if (!this.XU) { if (this.oi == null) { if (this.ev.il0().equals("cim")) { this.oi = pB.XH0(this.ev); } else { this.oi = new ZH(this.ev); }  ZH zH; Gdx2DPixmap gdx2DPixmap; this
/*   */           
/* 3 */           .o0 = (gdx2DPixmap = (zH = this.oi).Con).ju;
/*   */         
/* 5 */         this.qL = gdx2DPixmap.Og0; if (this.lH == null) this.lH = zH.TU();  }  this.XU = true; return; }  throw new JU("Already prepared"); }
/*   */ 
/*   */   
/*   */   public final RD0 ev;
/*   */   public int o0 = 0;
/*   */   public int qL = 0;
/*   */   public Uc lH;
/*   */   public ZH oi;
/*   */   public boolean us;
/*   */   public boolean XU = false;
/*   */   
/*   */   public LPt6(RD0 paramRD0, ZH paramZH, Uc paramUc, boolean paramBoolean) {
/*   */     this.ev = paramRD0;
/*   */     this.oi = paramZH;
/*   */     this.lH = paramUc;
/*   */     this.us = paramBoolean;
/*   */     this.o0 = paramZH.WD0();
/*   */     this.qL = this.oi.C20();
/*   */     if (paramZH != null && paramUc == null)
/*   */       this.lH = this.oi.TU(); 
/*   */   }
/*   */   
/*   */   public final boolean aF0() {
/*   */     return this.XU;
/*   */   }
/*   */   
/*   */   public final ZH Jw() {
/*   */     if (this.XU) {
/*   */       this.XU = false;
/*   */       this.oi = null;
/*   */       return this.oi;
/*   */     } 
/*   */     throw new JU("Call prepare() before calling getPixmap()");
/*   */   }
/*   */   
/*   */   public final boolean zb() {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final int Vb() {
/*   */     return this.o0;
/*   */   }
/*   */   
/*   */   public final int wu0() {
/*   */     return this.qL;
/*   */   }
/*   */   
/*   */   public final Uc getFormat() {
/*   */     return this.lH;
/*   */   }
/*   */   
/*   */   public final boolean wm0() {
/*   */     return this.us;
/*   */   }
/*   */   
/*   */   public final boolean k50() {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final EL getType() {
/*   */     return EL.DO;
/*   */   }
/*   */   
/*   */   public final void pk0(int paramInt) {
/*   */     throw new JU("This TextureData implementation does not upload data itself");
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     return this.ev.toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPt6.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */