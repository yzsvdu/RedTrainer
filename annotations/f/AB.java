/*   */ package f;
/* 2 */ public final class AB implements Bu0 { public final ZH sB0; public final Uc OA; public final boolean FP; public final boolean MX; public final int Vb() { return this.sB0.Con.ju; } public final boolean me; public AB(ZH paramZH, Uc paramUc, boolean paramBoolean1, boolean paramBoolean2) { this(paramZH, paramUc, paramBoolean1, paramBoolean2, false); } public AB(ZH paramZH, Uc paramUc, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { this.sB0 = paramZH; if (paramUc == null) paramUc = paramZH.TU();  this.OA = paramUc; this.FP = paramBoolean1; this.MX = paramBoolean2; this.me = paramBoolean3; } public final boolean zb() { return this.MX; } public final ZH Jw() { return this.sB0; } public final int wu0() { return this.sB0.Con.Og0; }
/*   */ 
/*   */   
/*   */   public final Uc getFormat() {
/*   */     return this.OA;
/*   */   }
/*   */   
/*   */   public final boolean wm0() {
/*   */     return this.FP;
/*   */   }
/*   */   
/*   */   public final boolean k50() {
/*   */     return this.me;
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
/*   */   public final boolean aF0() {
/*   */     return true;
/*   */   }
/*   */   
/*   */   public final void zr0() {
/*   */     throw new JU("prepare() must not be called on a PixmapTextureData instance as it is already prepared.");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AB.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */