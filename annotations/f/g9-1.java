/* 1 */ package f;public final class g9 extends RegionInfluencerExt.AnimatedExt { public final void update() { for (int i = 0, j = 2, k = ((ParticleControllerComponent)this).controller.particles.size * ((ParallelArray.Channel)this.Zx0).strideSize; i < k; ) { RegionInfluencer.AspectTextureRegion[] arrayOfAspectTextureRegion; j = Math.min((arrayOfAspectTextureRegion = this.Bf0).length - 1, (int)(this.q20.data[j] * arrayOfAspectTextureRegion.length)); RegionInfluencer.AspectTextureRegion aspectTextureRegion = this.Bf0[j]; this.Ho0
/* 2 */         .setTexture((this.Dj0[j]).G3); int m = i + 0; arrayOfFloat[m] = aspectTextureRegion.u; m = i + 1; arrayOfFloat[m] = aspectTextureRegion.v; m = i + 2; arrayOfFloat[m] = aspectTextureRegion.u2; m = i + 3; arrayOfFloat[m] = aspectTextureRegion.v2; arrayOfFloat[i + 4] = 0.5F; i += 5; float[] arrayOfFloat; (arrayOfFloat = this.Zx0.data)[i] = aspectTextureRegion.halfInvAspectRatio; i += ((ParallelArray.Channel)this.Zx0).strideSize; m = j + ((ParallelArray.Channel)this.q20).strideSize; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final yC0 xn0;
/*   */   public ParallelArray.FloatChannel Zx0;
/*   */   public ParallelArray.FloatChannel q20;
/*   */   public pe0[] Dj0;
/*   */   public RegionInfluencer.AspectTextureRegion[] Bf0;
/*   */   public BillboardParticleBatchExt Ho0;
/*   */   public UA0 qY;
/*   */   public boolean Wc0;
/*   */   public boolean fu;
/*   */   
/*   */   public g9(yC0 paramyC0, BillboardParticleBatchExt paramBillboardParticleBatchExt, boolean paramBoolean1, boolean paramBoolean2) {
/*   */     this.xn0 = paramyC0;
/*   */     UA0 uA0 = um0.TK0().vt((byte)0, (short)442, paramBoolean2, paramBoolean1);
/*   */     fQ fQ1 = uA0.dZ().Uw0();
/*   */     if (paramBoolean2) {
/*   */       int i;
/*   */       this.Dj0 = new pe0[i = fQ1.Z8 * 11];
/*   */       this.Bf0 = new RegionInfluencer.AspectTextureRegion[i];
/*   */     } else {
/*   */       this.Dj0 = new pe0[88];
/*   */       this.Bf0 = new RegionInfluencer.AspectTextureRegion[88];
/*   */     } 
/*   */     this(false, this.Bf0.length, RegionInfluencer.AspectTextureRegion.class);
/*   */     ((RegionInfluencer)this).regions = fQ2;
/*   */     fQ fQ2;
/*   */     (fQ2 = new fQ()).ZY(this.Bf0.length);
/*   */     pe0[] arrayOfPe0;
/*   */     for (byte b = 0; b < (arrayOfPe0 = this.Dj0).length; b++) {
/*   */       int i;
/*   */       arrayOfPe0[b] = (pe0)fQ1.get(i = b % fQ1.Z8);
/*   */       this.Bf0[b] = new RegionInfluencer.AspectTextureRegion((pe0)fQ1.get(i));
/*   */       ((RegionInfluencer)this).regions.Com3(this.Bf0[b]);
/*   */     } 
/*   */     this.Ho0 = paramBillboardParticleBatchExt;
/*   */     this.Wc0 = paramBoolean1;
/*   */     this.fu = paramBoolean2;
/*   */   }
/*   */   
/*   */   public final RegionInfluencerExt.AnimatedExt copy() {
/*   */     yC0 yC01 = this.xn0;
/*   */     BillboardParticleBatchExt billboardParticleBatchExt = this.Ho0;
/*   */     boolean bool1 = this.Wc0;
/*   */     boolean bool2 = this.fu;
/*   */     return new g9(this, billboardParticleBatchExt, bool1, bool2);
/*   */   }
/*   */   
/*   */   public final void allocateChannels() {
/*   */     this.q20 = (ParallelArray.FloatChannel)((ParticleControllerComponent)this).controller.particles.addChannel(ParticleChannels.Life);
/*   */     this.Zx0 = (ParallelArray.FloatChannel)((ParticleControllerComponent)this).controller.particles.addChannel(ParticleChannels.TextureRegion);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     this.qY.dispose();
/*   */     super.dispose();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/g9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */