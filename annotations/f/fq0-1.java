/*  1 */ package f;public final class fq0 extends wb { public hm0 pd0; public oq lC; private void Uy0(int paramInt, sh paramsh) { vH vH; if ((vH = this.pb) != null && this.ju0) vH.Ji0
/*  2 */         .remove(this.lC);  }
/*  3 */   public boolean ju0 = true; public fq0(hm0 paramhm0) { super(paramhm0); this.pd0 = paramhm0; } public final boolean cw() { return !this.ju0 ? true : this.i5; } public final wb O3() { if (this.ju0) { oq oq2 = oq.wU(this.pb.We.Dr(this.pd0.oi())[10]); this.pb
/*  4 */         .Ji0
/*  5 */         .add(oq2); }
/*  6 */      uT[] arrayOfUT = this.pd0.qf;
/*  7 */     (this.synchronized = So.k60()).Wz0(0.25F);
/*    */ 
/*    */     
/* 10 */     eo eo = V1.w3(this.pd0.rF0.He0, this.pd0.rF0.He0);
/* 11 */     this.synchronized
/*    */       
/* 13 */       .PL(wb.cOM2((short)1383)); oq oq1; if ((oq1 = this.lC) != null) { float f = eo.y - 0.45F; this.synchronized.PL(Wz0.aG(4, oq1).qw0(eo.x - 0.1F, f, eo.z - 0.05F)).PL(Wz0.aG(7, this.lC).n20(0.5F, 0.5F)); }  this.synchronized.L5(); int i; byte b; for (i = arrayOfUT.length, b = 0; b < i; ) { uT uT = arrayOfUT[b];
/*    */       
/* 15 */       float f1 = uT.He0.x, f2 = uT.He0.y - 0.5F, f3 = uT.He0.z; this.synchronized.PL(Wz0.aG(8, uT).qY(new float[] { 1.0F, 1.0F, 1.0F, 1.0F })).PL(Wz0.aG(10, uT).qY(new float[] { 1.0F, 1.0F, 1.0F, 0.0F })).eC().L5().PL(Wz0.gq(uT, 4, 1.2F).qw0(f1, f2, f3)).PL(Wz0.gq(uT, 7, 1.2F).n20(0.0F, 0.0F)).PL(Wz0.gq(uT, 11, 1.2F).a(1.0F)).Kr().Kr(); b++; }  this.synchronized.Kr(); this.synchronized.PL(Wz0.OC(this::Uy0)); this.synchronized
/*    */ 
/*    */       
/* 18 */       .mg(this.pb.dr0);
/* 19 */     tS();
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public final boolean tF0(boolean paramBoolean) {
/*    */     return (km.MR == null) ? false : ((zc0() && paramBoolean) ? true : ((!zc0() && !paramBoolean)));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */