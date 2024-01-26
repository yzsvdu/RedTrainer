/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class SpawnInfluencerExt extends Influencer { public void read(It paramIt, bM0 parambM0) { this
/* 2 */       .spawnShapeValue = (SpawnShapeValueExt)COm9.aD0(paramIt, parambM0, "spawnShape", SpawnShapeValueExt.class, null); }
/*   */ 
/*   */   
/*   */   public SpawnShapeValueExt spawnShapeValue;
/*   */   
/*   */   public ParallelArray.FloatChannel positionChannel;
/*   */   
/*   */   public SpawnInfluencerExt() {
/*   */     PointSpawnShapeValueExt pointSpawnShapeValueExt;
/*   */     this();
/*   */     this.spawnShapeValue = (SpawnShapeValueExt)this;
/*   */   }
/*   */   
/*   */   public SpawnInfluencerExt(SpawnShapeValueExt paramSpawnShapeValueExt) {
/*   */     this.spawnShapeValue = paramSpawnShapeValueExt;
/*   */   }
/*   */   
/*   */   public SpawnInfluencerExt(SpawnInfluencerExt paramSpawnInfluencerExt) {
/*   */     this.spawnShapeValue = paramSpawnInfluencerExt.spawnShapeValue.copy();
/*   */   }
/*   */   
/*   */   public void init() {
/*   */     this.spawnShapeValue.init();
/*   */   }
/*   */   
/*   */   public void allocateChannels() {
/*   */     this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
/*   */   }
/*   */   
/*   */   public void start() {
/*   */     this.spawnShapeValue.start();
/*   */     this.spawnShapeValue.reSeed();
/*   */   }
/*   */   
/*   */   public void activateParticles(int paramInt1, int paramInt2) {
/*   */     paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.positionChannel).strideSize);
/*   */     paramInt1 = paramInt2 * paramInt1 + paramInt2;
/*   */     while (paramInt2 < paramInt1) {
/*   */       SpawnShapeValueExt spawnShapeValueExt = this.spawnShapeValue;
/*   */       spawnShapeValueExt.spawn(eo, this.controller.emitter.percent);
/*   */       eo eo;
/*   */       (eo = ParticleControllerComponent.TMP_V1).eM(this.controller.transform);
/*   */       int i = paramInt2 + 0;
/*   */       arrayOfFloat[i] = eo.x;
/*   */       i = paramInt2 + 1;
/*   */       arrayOfFloat[i] = eo.y;
/*   */       paramInt2 += 2;
/*   */       float[] arrayOfFloat;
/*   */       (arrayOfFloat = this.positionChannel.data)[paramInt2] = eo.z;
/*   */       paramInt2 += ((ParallelArray.Channel)this.positionChannel).strideSize;
/*   */     } 
/*   */   }
/*   */   
/*   */   public SpawnInfluencerExt copy() {
/*   */     return new SpawnInfluencerExt(this);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     paramIt.Zg(SpawnShapeValueExt.class, this.spawnShapeValue, "spawnShape");
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     this.spawnShapeValue.save(paramsz0, paramResourceData);
/*   */   }
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     this.spawnShapeValue.load(paramsz0, paramResourceData);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/SpawnInfluencerExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */