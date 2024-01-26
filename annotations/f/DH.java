/*  1 */ package f;public final class DH extends wb { public static final eo Hf0 = new eo(); public final hm0 Ll; public final int E10; private void IB(int paramInt, sh paramsh) { vH vH; if ((vH = this.pb) != null) vH.Ji0
/*  2 */         .remove(this.NN);  } public final int uu0; public oq NN; public DH(hm0 paramhm0, int paramInt1, int paramInt2) { super(paramhm0); this.Ll = paramhm0; this.E10 = paramInt1; this.uu0 = paramInt2; } public final wb O3() { pe0[] arrayOfPe0; (arrayOfPe0 = new pe0[1])[0] = this.pb.We.Dr(this.E10)[10];
/*  3 */     this(0.1F, (Object[])arrayOfPe0); R30 r302; eo eo2; QX qX; eo eo4;
/*  4 */     (new R30()).sI = Qb.RW; R30 r301;
/*  5 */     (this.NN = oq.s2(r301 = this.pb.We.o3(4, this.E10))).a40("spin", r301); this.NN.a40("shake1", this.pb.We.o3(1, this.E10)); this.NN.a40("shake2", this.pb.We.o3(2, this.E10)); this.NN.a40("shake3", this.pb.We.o3(3, this.E10)); this.NN.a40("stop", this.pb.We.o3(0, this.E10)); this.NN.a40("open", r302);
/*  6 */     Ih0 ih0 = this.pb.fq;
/*    */     
/*  8 */     uT[] arrayOfUT = this.Ll.qf;
/*    */ 
/*    */     
/* 11 */     eo eo1 = V1.w3(this.Ll.rF0.He0, this.Ll.rF0.He0);
/* 12 */     this.pb
/* 13 */       .Ji0
/* 14 */       .add(this.NN); float f10 = vH.AUX.x, f11 = vH.AUX.y, f13 = vH.AUX.z; f10 = vH.Lu.x; f11 = vH.Lu.y; f13 = vH.Lu.z; this.synchronized = So.k60().L5().PL(Wz0.gq(ih0, 4, 0.5F).qw0(f10, f11, f13)).PL(Wz0.gq(ih0, 9, 0.5F).qw0(f10, f11, f13)).Kr(); eo eo3 = vH.Zu; float f14 = eo3.y + 0.75F; this(eo3.x, f14, eo3.z + 1.0F); eo[] arrayOfEo; (arrayOfEo = new eo[5])[0] = eo4; f14 = eo3.y + 0.5F; this(eo3.x, f14, eo3.z + 1.0F); (new eo[5])[1] = eo4; float f9 = eo3.y + 1.0F; this(eo3.x + 0.5F, f9, eo3.z - 2.0F); (new eo[5])[2] = eo4; float f12 = eo1.x + 0.05F; this(f12, eo1.y, eo1.z + 0.1F); (new eo[5])[3] = eo2; f12 = eo1.x + 0.05F; this(f12, eo1.y, eo1.z + 0.1F); (new eo[5])[4] = eo2; this((Ou0[])arrayOfEo, false); So so3; (so3 = this.synchronized.eC())
/*    */       
/* 16 */       .PL(wb.A50((short)1382, true)); for (f12 = 0.0F; f12 < 1.0F; ) { eo eo5; qX.Gc0(eo5 = Hf0, f12); f12 = eo5.x; float f15 = eo5.y, f16 = eo5.z; so3.PL(Wz0.gq(this.NN, 4, 0.005F).qw0(f12, f15, f16)); f12 += 0.01F; }  so3.Kr(); float f8 = eo1.y + 0.5F; f8 = eo1.y - 1.0F; this.synchronized.Wz0(-0.25F).L5().PL(Wz0.gq(ih0, 4, 0.25F).qw0(eo1.x, f8, eo1.z + 1.0F)).PL(Wz0.gq(ih0, 9, 0.25F).qw0(eo1.x - 0.5F, f8, eo1.z - 1.0F)).Kr().PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("open")))
/*    */       
/* 18 */       .PL(wb.A50((short)1383, false)).eC().L5(); int i; byte b3; for (i = arrayOfUT.length, b3 = 0; b3 < i; ) { uT uT = arrayOfUT[b3]; this.synchronized.PL(Wz0.aG(10, uT).qY(new float[] { 1.0F, 1.0F, 1.0F, 0.0F })).PL(Wz0.aG(7, uT).n20(1.0F, 1.0F)).L5().PL(Wz0.gq(uT, 11, 0.2F).a(1.0F)).PL(Wz0.gq(uT, 7, 0.5F).n20(0.0F, 0.0F)).Kr(); b3++; }
/*    */     
/* 20 */     float f6 = eo1.y - 0.35F; (Wz0.gq(this.NN, 4, 1.0F).qw0(eo1.x + 0.05F, f6, eo1.z + 0.1F))
/* 21 */       .st = (i0)Bounce.OUT;
/* 22 */     this.synchronized.PL(Wz0.gq(this.NN, 7, 0.5F).n20(1.0F, 1.1F)).Kr().PL(Wz0.gq(this.NN, 7, 0.5F).n20(1.0F, 1.0F)).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("stop"))).Kr().Wz0(0.25F).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("spin"))).PL(wb.A50((short)1385, false)).PL(Wz0.gq(this.NN, 4, 1.0F).qw0(eo1.x + 0.05F, f6, eo1.z + 0.1F)).Wz0(-0.2F).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("stop"))).Wz0(0.2F); if (this.uu0 > 0) this.synchronized.Wz0(0.5F)
/*    */         
/* 24 */         .PL(wb.A50((short)1384, false)).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("shake1"))).Wz0(0.75F);  if (this.uu0 > 1) this.synchronized.Wz0(0.5F)
/*    */         
/* 26 */         .PL(wb.A50((short)1384, false)).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("shake2"))).Wz0(0.75F);  if (this.uu0 > 2) this.synchronized.Wz0(0.5F)
/*    */         
/* 28 */         .PL(wb.A50((short)1384, false)).PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("shake1"))).Wz0(0.75F);  if (this.uu0 < 4) { this.synchronized.Wz0(0.5F)
/*    */         
/* 30 */         .PL(wb.A50((short)1383, false)).eC().PL(Wz0.OC((paramInt, paramsh) -> this.NN.zM("open"))).L5(); for (int j = arrayOfUT.length; i < j; )
/* 31 */       { uT uT; eo eo5 = (uT = arrayOfUT[i]).He0;
/* 32 */         f14 = eo5.x; float f17 = eo5.y - 0.5F, f18 = eo5.z, f15 = eo5.x, f16 = eo5.y; f14 = eo5.z; this.synchronized.PL(Wz0.aG(4, uT).qw0(f14, f17, f18)).L5().PL(Wz0.gq(uT, 11, 1.0F).a(0.0F)).PL(Wz0.gq(uT, 7, 0.5F).n20(1.0F, 1.0F)).PL(Wz0.gq(uT, 4, 0.5F).qw0(f15, f16, f14)).Kr(); i++; }  this.synchronized.Kr().Wz0(-0.5F).PL(Wz0.gq(this.NN, 7, 0.01F).n20(0.0F, 0.0F)).Kr(); } else { this.synchronized
/*    */         
/* 34 */         .PL(wb.A50((short)1396, false)).eC().PL(Wz0.aG(8, this.NN).qY(new float[] { 0.0F, 0.0F, 0.0F, 0.0F })).PL(Wz0.gq(this.NN, 8, 0.2F).qY(new float[] { 0.0F, 0.0F, 0.0F, 0.6F })).Kr().PL(Wz0.OC(DH::H)); }  So so2 = this.synchronized.Wz0(1.0F).L5(); byte b2 = 4; if (this.uu0 == 4) { f7 = 1.5F; } else { f7 = 0.5F; }  float f3 = vH.AUX.x, f5 = vH.AUX.y, f7 = vH.AUX.z; So so1 = so2.PL(Wz0.gq(ih0, b2, f7).qw0(f3, f5, f7)); byte b1 = 9; if (this.uu0 == 4) { f7 = 1.5F; } else { f7 = 0.5F; }  float f1 = vH.Lu.x, f2 = vH.Lu.y, f4 = vH.Lu.z; so1.PL(Wz0.gq(ih0, b1, f7).qw0(f1, f2, f4)).Kr(); this.synchronized.PL(Wz0.OC(this::IB)); this.synchronized
/*    */ 
/*    */       
/* 37 */       .mg(this.pb.dr0);
/* 38 */     tS();
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public final boolean tF0(boolean paramBoolean) {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/DH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */