/* 1 */ package f;public final class Pv0 extends wb { public sz0 Tz0; public final String te0; public final boolean gi0; public Pv0(hm0 paramhm0, boolean paramBoolean) { super(paramhm0); String str; this.gi0 = paramBoolean; if (paramBoolean) { str = "sprites/shiny_phantom/"; } else { str = "sprites/phantom/"; }  this.te0 = str; Wl wl; if (wl = km.wI0.qn() instanceof vH) { int i; for (this.Tz0 = ((vH)wl).gH0().Zf(), i = 0; i < 41; ) { String str1 = N.Gl0((new StringBuilder()).append(this.te0), ++i, ".png");
/* 2 */         if (!this.Tz0.az(str1)) this.Tz0.KJ(str1);  }  }  } public final wb O3() { String str; So so2 = So.k60().L5(); if (zc0()) { if (this.gi0) { str = "spawn_shiny_phantom_enemy"; } else { str = "spawn_phantom_enemy"; }  } else if (this.gi0) { str = "spawn_shiny_phantom"; } else { str = "spawn_phantom"; }  hm0 hm0 = this.xS; hm0 = this.xS; this.synchronized = so1; So so1; (so1 = so2.PL(Ur0(str)).Zo0(ia0((byte)10, (short)16, 1, 14, 900.0F, 0.9F, hm0)).Zo0(ia0((byte)10, (short)17, 1, 14, 3500.0F, 0.9F, hm0)).Kr())
/*   */ 
/*   */       
/* 5 */       .mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 6 */     tS();
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final boolean tF0(boolean paramBoolean) {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final Wz0 Ur0(String paramString) {
/*   */     ParticleEffectExt particleEffectExt;
/*   */     if (!(particleEffectExt = vR("custom/" + paramString)).isLoaded()) {
/*   */       ((Wz0)Wz0.xX.al()).sn0(null, -1, 0.0F);
/*   */       return (Wz0)Wz0.xX.al();
/*   */     } 
/*   */     BillboardParticleBatchExt billboardParticleBatchExt;
/*   */     Hc0 hc0;
/*   */     for (billboardParticleBatchExt = (BillboardParticleBatchExt)particleEffectExt.getBatches().get(0), hc0 = particleEffectExt.getControllers().r30(); hc0.hasNext();) {
/*   */       if ((particleController = (ParticleController)hc0.next()).name.equals("dummy")) {
/*   */         Wz wz;
/*   */         this(this, billboardParticleBatchExt);
/*   */         (new Wz()).set(particleController);
/*   */         (new Wz()).allocateChannels();
/*   */         particleController.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)wz);
/*   */         break;
/*   */       } 
/*   */     } 
/*   */     return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pv0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */