/* 1 */ package f;public final class Je extends wb { public sz0 Lz; public Je(hm0 paramhm0) { super(paramhm0); Wl wl; if (wl = km.wI0.qn() instanceof vH) { int i; for (this.Lz = ((vH)wl).gH0().Zf(), i = 0; i < 24; )
/* 2 */       { String str = N.Gl0(B40.df("sprites/way_of_the_dragon/"), ++i, ".png");
/* 3 */         if (!this.Lz.az(str)) this.Lz.KJ(str);  }  }  } public final wb O3() { if (zc0()) { hm0 hm0 = this.xS; this.synchronized = So.k60().L5().PL(Ur0("way_of_the_dragon_enemy")).Zo0(ia0((byte)10, (short)8, 3, 14, 1400.0F, 0.8F, hm0)).Kr(); } else { hm0 hm0 = this.xS; this.synchronized = So.k60().L5().PL(Ur0("way_of_the_dragon")).Zo0(ia0((byte)10, (short)8, 3, 14, 1400.0F, 0.8F, hm0)).Kr(); }  this.synchronized.mg(this.pb.dr0); this.pb.t9(this.synchronized);
/* 4 */     tS();
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final boolean tF0(boolean paramBoolean) {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final Wz0 Ur0(String paramString) {
/*   */     ParticleEffectExt particleEffectExt;
/*   */     BillboardParticleBatchExt billboardParticleBatchExt = (BillboardParticleBatchExt)(particleEffectExt = vR("custom/" + paramString)).getBatches().get(0);
/*   */     Hc0 hc0 = vR("custom/" + paramString).getControllers().r30();
/*   */     while (hc0.hasNext()) {
/*   */       ParticleController particleController;
/*   */       if ((particleController = (ParticleController)hc0.next()).name.equals("dummy")) {
/*   */         S2 s2;
/*   */         this(this, billboardParticleBatchExt);
/*   */         (new S2()).set(particleController);
/*   */         (new S2()).allocateChannels();
/*   */         particleController.replaceInfluencer(RegionInfluencerExt.AnimatedExt.class, (Influencer)s2);
/*   */         break;
/*   */       } 
/*   */     } 
/*   */     return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Je.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */