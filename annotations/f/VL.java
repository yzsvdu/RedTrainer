/*  1 */ package f;public final class VL extends wb { public final wb hh0() { So so2, so3, so1 = So.k60().L5().PL(QI0(Ht0.Ku)).eC().Wz0(0.1F).L5(); float f1 = 0.0F, f2 = 0.1F, f3 = 1.1F, f4 = 0.5F; uT[] arrayOfUT; if ((arrayOfUT = (uT[])this.jN.Ib(uT.class)) == null && this.jN != null) { float f; Hc0 hc0; for (f = 0.25F, so3 = So.k60().eC().Wz0(f1).L5(), hc0 = this.jN.r30(); hc0.hasNext(); ) { uT uT = (uT)hc0.next(); so3.eC().L5().PL(Wz0.gq(uT, 7, f2).n20(f3, f4))
/*    */           
/*  3 */           .PL(Wz0.gq(uT, 2, f2).a(uT.He0.y - f)).Kr().L5().PL(Wz0.gq(uT, 7, f2).n20(1.0F, 1.0F))
/*    */           
/*  5 */           .PL(Wz0.gq(uT, 2, f2).a(uT.He0.y)).Kr().Kr(); }  so2 = so3.Kr().Kr(); } else if (so2 != null) { float f; So so; int i; byte b; for (f = 0.25F, so = So.k60(), i = so2.length, b = 0; b < i; ) { So so4 = so2[b]; so.eC().Wz0(so3).L5().PL(Wz0.gq(so4, 7, f2).n20(f3, f4))
/*    */           
/*  7 */           .PL(Wz0.gq(so4, 2, f2).a(((uT)so4).He0.y - f)).Kr().L5().PL(Wz0.gq(so4, 7, f2).n20(1.0F, 1.0F))
/*    */           
/*  9 */           .PL(Wz0.gq(so4, 2, f2).a(((uT)so4).He0.y)).Kr().Kr(); b++; }  so2 = so; } else { wb.eC.info(toString() + " called getHitAnimation animation with null targetDecal."); so2 = So.k60(); }
/* 10 */      this.synchronized = so1; (so1 = so1.Zo0(so2).Kr().Kr().Kr())
/*    */ 
/*    */       
/* 13 */       .mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 14 */     tS();
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public VL(hm0 paramhm0) {
/*    */     super(paramhm0);
/*    */   }
/*    */   
/*    */   public final boolean tF0(boolean paramBoolean) {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */