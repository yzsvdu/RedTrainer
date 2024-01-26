/* 1 */ package f;public final class Bo0 extends RegionInfluencerExt.AnimatedExt { public final void update() { for (int i = 0, j = 2, k = ((ParticleControllerComponent)this).controller.particles.size * ((ParallelArray.Channel)this.Fp).strideSize; i < k; ) { RegionInfluencer.AspectTextureRegion[] arrayOfAspectTextureRegion; j = Math.min((arrayOfAspectTextureRegion = this.XG).length - 1, (int)(this.nN.data[j] * arrayOfAspectTextureRegion.length)); RegionInfluencer.AspectTextureRegion aspectTextureRegion = this.XG[j]; this.Pm0
/*   */ 
/*   */         
/* 4 */         .setTexture(((P70)this.Com2.ui0.get(j)).G3); int m = i + 0; arrayOfFloat[m] = aspectTextureRegion.u; m = i + 1; arrayOfFloat[m] = aspectTextureRegion.v; m = i + 2; arrayOfFloat[m] = aspectTextureRegion.u2; m = i + 3; arrayOfFloat[m] = aspectTextureRegion.v2; arrayOfFloat[i + 4] = 0.5F; i += 5; float[] arrayOfFloat; (arrayOfFloat = this.Fp.data)[i] = aspectTextureRegion.halfInvAspectRatio; i += ((ParallelArray.Channel)this.Fp).strideSize; m = j + ((ParallelArray.Channel)this.nN).strideSize; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final Zm Bh;
/*   */   public ParallelArray.FloatChannel Fp;
/*   */   public ParallelArray.FloatChannel nN;
/*   */   public pe0[] nk0;
/*   */   public RegionInfluencer.AspectTextureRegion[] XG;
/*   */   public BillboardParticleBatchExt Pm0;
/*   */   public COm1 Com2;
/*   */   public UA0 o20;
/*   */   public short eM;
/*   */   public boolean hE0;
/*   */   public boolean COM9;
/*   */   
/*   */   public Bo0(Zm paramZm, BillboardParticleBatchExt paramBillboardParticleBatchExt, short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
/*   */     this.Bh = paramZm;
/*   */     fQ fQ1;
/*   */     int i;
/*   */     this.nk0 = new pe0[i = (fQ1 = (this.Com2 = (this.o20 = um0.TK0().vt((byte)0, paramShort, paramBoolean2, paramBoolean1)).dZ()).Uw0()).Z8];
/*   */     this.XG = new RegionInfluencer.AspectTextureRegion[i];
/*   */     this(false, i, RegionInfluencer.AspectTextureRegion.class);
/*   */     ((RegionInfluencer)this).regions = fQ2;
/*   */     fQ fQ2;
/*   */     (fQ2 = new fQ()).ZY(fQ1.Z8);
/*   */     for (i = 0; i < fQ1.Z8; i++) {
/*   */       this.nk0[i] = (pe0)fQ1.get(i);
/*   */       this.XG[i] = new RegionInfluencer.AspectTextureRegion((pe0)fQ1.get(i));
/*   */       ((RegionInfluencer)this).regions.Com3(this.XG[i]);
/*   */     } 
/*   */     this.Pm0 = paramBillboardParticleBatchExt;
/*   */     this.eM = paramShort;
/*   */     this.hE0 = paramBoolean1;
/*   */     this.COM9 = paramBoolean2;
/*   */   }
/*   */   
/*   */   public final RegionInfluencerExt.AnimatedExt copy() {
/*   */     Zm zm = this.Bh;
/*   */     BillboardParticleBatchExt billboardParticleBatchExt = this.Pm0;
/*   */     short s = this.eM;
/*   */     boolean bool1 = this.hE0;
/*   */     boolean bool2 = this.COM9;
/*   */     return new Bo0(this, billboardParticleBatchExt, s, bool1, bool2);
/*   */   }
/*   */   
/*   */   public final void allocateChannels() {
/*   */     this.nN = (ParallelArray.FloatChannel)((ParticleControllerComponent)this).controller.particles.addChannel(ParticleChannels.Life);
/*   */     this.Fp = (ParallelArray.FloatChannel)((ParticleControllerComponent)this).controller.particles.addChannel(ParticleChannels.TextureRegion);
/*   */   }
/*   */   
/*   */   public final void end() {
/*   */     super.end();
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     this.o20.dispose();
/*   */     super.dispose();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */