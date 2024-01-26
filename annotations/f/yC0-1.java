/*  1 */ package f;public final class yC0 extends wb { public final wb O3() { String str; hm0 hm0 = this.xS;
/*  2 */     hm0 = this.xS;
/*    */     
/*  4 */     hm0 = this.xS;
/*    */     
/*  6 */     hm0 = this.xS;
/*    */     
/*  8 */     So so = So.k60().L5().Zo0(ia0((byte)2, (short)1702, 1, 14, 900.0F, 0.1F, hm0)).Zo0(ia0((byte)2, (short)1408, 2, 14, 7500.0F, 0.25F, hm0)).Zo0(ia0((byte)2, (short)1429, 2, 14, 8000.0F, 0.5F, hm0)).Zo0(ia0((byte)2, (short)1001, 1, 14, 7500.0F, 0.1F, hm0)); if (this.fv) { str = "spawn_shiny_menacing_spirit_enemy"; } else { str = "spawn_menacing_spirit_enemy"; }  this.synchronized = so; (so = so.PL(Ur0(str)).Kr())
/*    */ 
/*    */       
/* 11 */       .mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 12 */     tS();
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public boolean fv;
/*    */   
/*    */   public yC0(hm0 paramhm0, boolean paramBoolean) {
/*    */     super(paramhm0);
/*    */     this.fv = paramBoolean;
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(yC0.class);
/*    */   }
/*    */   
/*    */   public final Wz0 Ur0(String paramString) {
/*    */     ParticleEffectExt particleEffectExt;
/*    */     BillboardParticleBatchExt billboardParticleBatchExt = (BillboardParticleBatchExt)(particleEffectExt = vR("custom/" + paramString)).getBatches().get(0);
/*    */     Hc0 hc0 = vR("custom/" + paramString).getControllers().r30();
/*    */     while (hc0.hasNext()) {
/*    */       ParticleController particleController;
/*    */       if ((particleController = (ParticleController)hc0.next()).name.equals("spirit")) {
/*    */         boolean bool = this.fv;
/*    */         int i = zc0() ^ true;
/*    */         this(this, billboardParticleBatchExt, bool, i);
/*    */         g9 g9;
/*    */         (g9 = new g9()).set(particleController);
/*    */         (new g9()).allocateChannels();
/*    */         particleController.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)g9);
/*    */       } 
/*    */     } 
/*    */     return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt));
/*    */   }
/*    */   
/*    */   public final boolean tF0(boolean paramBoolean) {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */