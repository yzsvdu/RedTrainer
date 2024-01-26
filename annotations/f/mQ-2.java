/*  1 */ package f;public final class mQ implements sF { public mQ(rS paramrS) {} public final void V90() { this.ze.VK0 = 0.0F; } public final boolean FN(float paramFloat1, float paramFloat2) { return false; } public final boolean nQ(float paramFloat1, float paramFloat2) { return false; } public final boolean KF(int paramInt, float paramFloat1, float paramFloat2) { rS rS1; if ((rS1 = this.ze).fr0 == null || rS1
/*  2 */       .Bo0 == null || 
/*  3 */       this.ze
/*  4 */       .Bo0
/*  5 */       .fC())
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 18 */       return false; }  if (System.currentTimeMillis() - (rS1 = this.ze).Ep > 2000L || !rS1.p3()) return false;  float f2 = rS1.er0; float f3 = rS1.xY; float f4 = rS1.HC; (rS1 = this.ze).gl.jG(rS1.Kd, f2, f3, f4); cx0.getClass(); float f1 = rS.F2.x; cx0 cx0; if (!(cx0 = this.ze.gl).ob0(f1, rS.F2.y)) return false;  Ja ja; if (Math.abs(paramFloat1) > 150.0F && (ja = this.ze.Fd0).dP) { boolean bool; if (System.currentTimeMillis() - ja.Uo0 < 100L) { bool = true; } else { bool = false; }  if (bool) return false;  this.ze.VK0 = this.ze.V10; this.ze.Fz0 = paramFloat1; }  if (Math.abs(paramFloat2) > 150.0F && (ja = this.ze.PB).dP) { boolean bool; if (System.currentTimeMillis() - ja.Uo0 < 100L) { bool = true; } else { bool = false; }  if (bool) return false;  this.ze.VK0 = this.ze.V10; this.ze.tv = paramFloat2; }  return false; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean AL(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     rS rS2;
/*    */     if ((rS2 = this.ze).fr0 == null || rS2.Bo0 == null || this.ze.Bo0.fC())
/* 32 */       return false;  if (System.currentTimeMillis() - (rS2 = this.ze).Ep > 2000L || !rS2.p3()) return false;  nC0.x = paramFloat1; NC0 nC0; (nC0 = rS.F2).y = paramFloat2; ((tw)this.ze.Bo0.IB0).P9.qD0(nC0); float f2 = rS1.er0; paramFloat2 = rS1.xY; float f3 = rS1.HC; rS rS1; (rS1 = this.ze).gl.jG(rS1.Kd, f2, paramFloat2, f3); cx0.getClass(); float f1 = nC0.x; cx0 cx0; if ((cx0 = this.ze.gl).ob0(f1, nC0.y)) { f1 = -paramFloat3; this.ze.Fd0.Fk0(this.ze.Fd0.Ny0 + (int)f1, true); f1 = -paramFloat4; this.ze.PB.Fk0(this.ze.PB.Ny0 + (int)f1, true); rS rS3; Ja ja; if ((ja = (rS3 = this.ze).Fd0).kN && ja.dP) rS3.ze0 += paramFloat3;  if ((ja = rS3.PB).kN && ja.dP) rS3.qs += paramFloat4;  if (!rS3.EG0 && (Math.abs(rS3.ze0) > 50.0F || Math.abs(this.ze.qs) > 50.0F)) { this.ze.EG0 = true; this.ze.D8(); }  return false; }  return false;
/*    */   }
/*    */   
/*    */   public final boolean Ux(float paramFloat1, float paramFloat2) {
/*    */     this.ze.ze0 = 0.0F;
/*    */     this.ze.qs = 0.0F;
/*    */     this.ze.EG0 = false;
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean me0(float paramFloat1, float paramFloat2) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Uu(NC0 paramNC01, NC0 paramNC02, NC0 paramNC03, NC0 paramNC04) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final void Lo0() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */