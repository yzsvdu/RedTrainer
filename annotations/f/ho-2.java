/*  1 */ package f;public final class ho extends wb { public final kf rk; public final hm0 ts; private void LC0(int paramInt, sh paramsh) { this.ts.ZE((byte)0); this.rk.AD
/*  2 */       .tp(this.ts); Hj hj; if ((hj = this.rk.oD(this.ts)) != null) CX(false);  }
/*    */   public final boolean dz; public ho(kf paramkf, hm0 paramhm0, boolean paramBoolean) { super(paramhm0); this.ts = paramhm0; this.rk = paramkf; this.dz = paramBoolean; } public final wb O3() { uT[] arrayOfUT = this.ts.qf;
/*  4 */     eo eo = V1.w3(this.ts.rF0.He0, this.ts.rF0.He0);
/*  5 */     if (this.dz) this.ts.xy0(0.75F);  So so = So.k60(); ((So)so.eC().Vq(D0.BR(this.ts.Jx()) / 1000.0F + 0.25F))
/*    */       
/*  7 */       .PL(wb.A50((short)1388, this.ts.Si())); this.synchronized.L5(); int i; byte b; for (i = arrayOfUT.length, b = 0; b < i; ) { uT uT = arrayOfUT[b]; float f1 = eo.x, f2 = eo.y - 1.0F, f3 = eo.z; this.synchronized.eC().L5().PL(Wz0.gq(uT, 4, 0.2F).qw0(f1, f2, f3)).Kr().PL(Wz0.OC(this::LC0)).Kr(); b++; }  this.synchronized.Kr(); this.synchronized.Kr(); this.synchronized
/*    */ 
/*    */       
/* 10 */       .mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 11 */     tS();
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public final boolean tF0(boolean paramBoolean) {
/*    */     Gp0 gp0;
/*    */     if ((gp0 = km.MR) != null)
/*    */       return (gp0.rx == ky.We0 && !zc0()); 
/*    */     return super.tF0(paramBoolean);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */