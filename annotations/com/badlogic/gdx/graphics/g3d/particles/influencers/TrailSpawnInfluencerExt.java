/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public class TrailSpawnInfluencerExt extends Influencer { public void read(It paramIt, bM0 parambM0) { this
/*  2 */       .copyParentColor = ((Boolean)COm9.aD0(paramIt, parambM0, "copyParentColor", Boolean.class, null)).booleanValue(); if (parambM0.Ua("copyParentColorAlpha"))
/*  3 */     { bM0 bM02 = parambM0.Jb("copyParentColorAlpha");
/*  4 */       this.copyParentColorAlpha = ((Boolean)paramIt.Uj0(Boolean.class, null, bM02)).booleanValue(); }  if (parambM0.Ua("copyParentColorAlpha")) {
/*  5 */       bM0 bM02 = parambM0.Jb("copyParentColorDynamic");
/*  6 */       this.copyParentColorDynamic = ((Boolean)paramIt.Uj0(Boolean.class, null, bM02)).booleanValue();
/*  7 */     }  bM0 bM01 = parambM0.Jb("copyParentRotation");
/*  8 */     this.copyParentRotation = ((Boolean)paramIt.Uj0(Boolean.class, null, this)).booleanValue();
/*  9 */     bM01 = parambM0.Jb("copyParentRotationDynamic");
/* 10 */     this.copyParentRotationDynamic = ((Boolean)paramIt.Uj0(Boolean.class, null, this)).booleanValue(); }
/*    */ 
/*    */   
/*    */   private ParallelArray.FloatChannel positionChannel;
/*    */   private ParallelArray.FloatChannel colorChannel;
/*    */   private ParallelArray.FloatChannel rotationChannel;
/*    */   private ParallelArray.IntChannel colorParentOffsetChannel;
/*    */   private ParallelArray.IntChannel rotationParentOffsetChannel;
/*    */   public eo spawnPosition;
/*    */   public ParallelArray.FloatChannel parent;
/*    */   public ParallelArray.FloatChannel positionChannelParent;
/*    */   public ParallelArray.FloatChannel parentColor;
/*    */   public int parentColorOffset;
/*    */   public ParallelArray.FloatChannel parentRotation;
/*    */   public int parentRotationOffset;
/*    */   public boolean copyParentColor;
/*    */   public boolean copyParentColorAlpha;
/*    */   public boolean copyParentColorDynamic;
/*    */   public boolean copyParentRotation;
/*    */   public boolean copyParentRotationDynamic;
/*    */   
/*    */   public TrailSpawnInfluencerExt() {
/*    */     eo eo1;
/*    */     this.copyParentColor = true;
/*    */     this.copyParentColorAlpha = true;
/*    */     this.copyParentColorDynamic = false;
/*    */     this.copyParentRotation = true;
/*    */     this.copyParentRotationDynamic = false;
/*    */     this();
/*    */     this.spawnPosition = this;
/*    */   }
/*    */   
/*    */   public TrailSpawnInfluencerExt(TrailSpawnInfluencerExt paramTrailSpawnInfluencerExt) {
/*    */     this.copyParentColor = true;
/*    */     this.copyParentColorAlpha = true;
/*    */     this.copyParentColorDynamic = false;
/*    */     this.copyParentRotation = true;
/*    */     this.copyParentRotationDynamic = false;
/*    */     this.spawnPosition = new eo();
/*    */     this.copyParentColor = paramTrailSpawnInfluencerExt.copyParentColor;
/*    */     this.copyParentColorDynamic = paramTrailSpawnInfluencerExt.copyParentColorDynamic;
/*    */     this.copyParentRotation = paramTrailSpawnInfluencerExt.copyParentRotation;
/*    */     this.copyParentRotationDynamic = paramTrailSpawnInfluencerExt.copyParentRotationDynamic;
/*    */   }
/*    */   
/*    */   public void init() {}
/*    */   
/*    */   public void allocateChannels() {
/*    */     this.positionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Position);
/*    */     this.colorChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Color);
/*    */     this.colorParentOffsetChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.ColorParentId);
/*    */     this.rotationChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Rotation2D);
/*    */     this.rotationParentOffsetChannel = (ParallelArray.IntChannel)this.controller.particles.addChannel(ParticleChannelsExt.RotationParentId);
/*    */   }
/*    */   
/*    */   public void start() {}
/*    */   
/*    */   public void update() {
/*    */     super.update();
/*    */     if (this.positionChannelParent != null) {
/*    */       int i = 0;
/*    */       int j = this.controller.particles.size * ((ParallelArray.Channel)this.positionChannel).strideSize;
/*    */       while (i < j) {
/*    */         int m = i + 0;
/*    */         arrayOfFloat1[m] = arrayOfFloat2[m];
/*    */         int k;
/*    */         arrayOfFloat1[k] = arrayOfFloat2[k = i + 1];
/*    */         float[] arrayOfFloat1;
/*    */         float[] arrayOfFloat2;
/*    */         (arrayOfFloat1 = this.positionChannel.data)[i] = (arrayOfFloat2 = this.positionChannelParent.data)[i += 2] - 0.001F;
/*    */         i += ((ParallelArray.Channel)this.positionChannel).strideSize;
/*    */       } 
/*    */     } 
/*    */     if (this.parentColor != null && this.copyParentColor && this.copyParentColorDynamic) {
/*    */       int i = 0;
/*    */       int j = 0;
/*    */       int k = this.controller.particles.size * ((ParallelArray.Channel)this.colorChannel).strideSize;
/*    */       while (i < k) {
/*    */         int m = i + 0;
/*    */         arrayOfFloat1[m] = arrayOfFloat2[j + 0];
/*    */         j = i + 1;
/*    */         arrayOfFloat1[j] = arrayOfFloat2[j + 1];
/*    */         j = i + 2;
/*    */         arrayOfFloat1[j] = arrayOfFloat2[j + 2];
/*    */         i += 3;
/*    */         float[] arrayOfFloat1;
/*    */         float[] arrayOfFloat2;
/*    */         ParallelArray.IntChannel intChannel;
/*    */         (arrayOfFloat1 = this.colorChannel.data)[i] = (arrayOfFloat2 = this.parentColor.data)[(j = (intChannel = this.colorParentOffsetChannel).data[j]) + 3];
/*    */         i += ((ParallelArray.Channel)this.colorChannel).strideSize;
/*    */         j += ((ParallelArray.Channel)intChannel).strideSize;
/*    */       } 
/*    */     } 
/*    */     if (this.parentColor != null && (this.copyParentColor || this.copyParentColorAlpha) && this.copyParentColorDynamic) {
/*    */       int i = 0;
/*    */       int j = 0;
/*    */       int k = this.controller.particles.size * ((ParallelArray.Channel)this.colorChannel).strideSize;
/*    */       while (i < k) {
/*    */         if (this.copyParentColor) {
/*    */           int n = i + 0;
/*    */           arrayOfFloat1[n] = arrayOfFloat2[i1 + 0];
/*    */           int m = i + 1;
/*    */           arrayOfFloat1[m] = arrayOfFloat2[i1 + 1];
/*    */           m = i + 2;
/*    */           float[] arrayOfFloat1;
/*    */           float[] arrayOfFloat2;
/*    */           int i1;
/*    */           (arrayOfFloat1 = this.colorChannel.data)[m] = (arrayOfFloat2 = this.parentColor.data)[(i1 = this.colorParentOffsetChannel.data[j]) + 2];
/*    */         } 
/*    */         if (this.copyParentColorAlpha)
/*    */           this.colorChannel.data[i + 3] = this.parentColor.data[this.colorParentOffsetChannel.data[j] + 3]; 
/*    */         i += ((ParallelArray.Channel)this.colorChannel).strideSize;
/*    */         j += ((ParallelArray.Channel)this.colorParentOffsetChannel).strideSize;
/*    */       } 
/*    */     } 
/*    */     if (this.copyParentRotation && this.copyParentRotationDynamic && this.parentRotation != null) {
/*    */       int i = 0;
/*    */       int j = 0;
/*    */       int k = this.controller.particles.size * ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*    */       while (i < k) {
/*    */         ParallelArray.IntChannel intChannel;
/*    */         j = (intChannel = this.rotationParentOffsetChannel).data[j];
/*    */         int m = i + 1;
/*    */         arrayOfFloat1[m] = arrayOfFloat2[j + 1];
/*    */         i += 0;
/*    */         float[] arrayOfFloat1;
/*    */         float[] arrayOfFloat2;
/*    */         (arrayOfFloat1 = this.rotationChannel.data)[i] = (arrayOfFloat2 = this.parentRotation.data)[j + 0];
/*    */         i += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*    */         j += ((ParallelArray.Channel)intChannel).strideSize;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void activateParticles(int paramInt1, int paramInt2) {
/*    */     if (this.positionChannelParent != null) {
/*    */       paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.positionChannel).strideSize);
/*    */       paramInt1 = paramInt2 * paramInt1 + paramInt2;
/*    */       while (paramInt2 < paramInt1) {
/*    */         ParticleControllerComponent.TMP_V1.JL(this.spawnPosition);
/*    */         int j = paramInt2 + 0;
/*    */         arrayOfFloat1[j] = arrayOfFloat2[j];
/*    */         int i;
/*    */         arrayOfFloat1[i] = arrayOfFloat2[i = paramInt2 + 1];
/*    */         float[] arrayOfFloat1;
/*    */         float[] arrayOfFloat2;
/*    */         (arrayOfFloat1 = this.positionChannel.data)[paramInt2] = (arrayOfFloat2 = this.positionChannelParent.data)[paramInt2 += 2] - 0.01F;
/*    */         paramInt2 += ((ParallelArray.Channel)this.positionChannel).strideSize;
/*    */       } 
/*    */     } else {
/*    */       int i;
/*    */       int j = paramInt1 * (i = ((ParallelArray.Channel)this.positionChannel).strideSize);
/*    */       i = paramInt2 * i + j;
/*    */       while (j < i) {
/*    */         eo eo1;
/*    */         (eo1 = ParticleControllerComponent.TMP_V1).JL(this.spawnPosition);
/*    */         int k = j + 0;
/*    */         arrayOfFloat[k] = eo1.x;
/*    */         k = j + 1;
/*    */         arrayOfFloat[k] = eo1.y;
/*    */         j += 2;
/*    */         float[] arrayOfFloat;
/*    */         (arrayOfFloat = this.positionChannel.data)[j] = eo1.z;
/*    */         j += ((ParallelArray.Channel)this.positionChannel).strideSize;
/*    */       } 
/*    */       if ((this.copyParentColor || this.copyParentColorAlpha) && this.parentColor != null) {
/*    */         j = paramInt1 * (i = ((ParallelArray.Channel)this.colorParentOffsetChannel).strideSize);
/*    */         i = paramInt2 * i + j;
/*    */         while (j < i) {
/*    */           this.colorParentOffsetChannel.data[j] = this.parentColorOffset;
/*    */           j += ((ParallelArray.Channel)this.colorParentOffsetChannel).strideSize;
/*    */         } 
/*    */         j = paramInt1 * (i = ((ParallelArray.Channel)this.colorChannel).strideSize);
/*    */         i = paramInt2 * i + j;
/*    */         while (j < i) {
/*    */           if (this.copyParentColor) {
/*    */             int m = j + 0;
/*    */             arrayOfFloat1[m] = arrayOfFloat2[n + 0];
/*    */             int k = j + 1;
/*    */             arrayOfFloat1[k] = arrayOfFloat2[n + 1];
/*    */             k = j + 2;
/*    */             float[] arrayOfFloat1;
/*    */             float[] arrayOfFloat2;
/*    */             int n;
/*    */             (arrayOfFloat1 = this.colorChannel.data)[k] = (arrayOfFloat2 = this.parentColor.data)[(n = this.parentColorOffset) + 2];
/*    */           } 
/*    */           if (this.copyParentColorAlpha)
/*    */             this.colorChannel.data[j + 3] = this.parentColor.data[this.parentColorOffset + 3]; 
/*    */           j += ((ParallelArray.Channel)this.colorChannel).strideSize;
/*    */         } 
/*    */       } 
/*    */       if (this.copyParentRotation && this.parentRotation != null) {
/*    */         j = paramInt1 * (i = ((ParallelArray.Channel)this.rotationParentOffsetChannel).strideSize);
/*    */         i = paramInt2 * i + j;
/*    */         while (j < i) {
/*    */           this.rotationParentOffsetChannel.data[j] = this.parentRotationOffset;
/*    */           j += ((ParallelArray.Channel)this.rotationParentOffsetChannel).strideSize;
/*    */         } 
/*    */         paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.rotationChannel).strideSize);
/*    */         paramInt1 = paramInt2 * paramInt1 + paramInt2;
/*    */         while (paramInt2 < paramInt1) {
/*    */           j = paramInt2 + 1;
/*    */           arrayOfFloat1[j] = arrayOfFloat2[k + 1];
/*    */           paramInt2 += 0;
/*    */           float[] arrayOfFloat1;
/*    */           float[] arrayOfFloat2;
/*    */           int k;
/*    */           (arrayOfFloat1 = this.rotationChannel.data)[paramInt2] = (arrayOfFloat2 = this.parentRotation.data)[(k = this.parentRotationOffset) + 0];
/*    */           paramInt2 += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*    */         } 
/*    */       } else {
/*    */         paramInt2 = paramInt1 * (paramInt1 = ((ParallelArray.Channel)this.rotationChannel).strideSize);
/*    */         paramInt1 = paramInt2 * paramInt1 + paramInt2;
/*    */         while (paramInt2 < paramInt1) {
/*    */           this.rotationChannel.data[paramInt2 + 1] = 0.0F;
/*    */           this.rotationChannel.data[paramInt2 + 0] = 1.0F;
/*    */           paramInt2 += ((ParallelArray.Channel)this.rotationChannel).strideSize;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public TrailSpawnInfluencerExt copy() {
/*    */     return new TrailSpawnInfluencerExt(this);
/*    */   }
/*    */   
/*    */   public void write(It paramIt) {
/*    */     paramIt.Jv0(Boolean.valueOf(this.copyParentColor), "copyParentColor");
/*    */     paramIt.Jv0(Boolean.valueOf(this.copyParentColorAlpha), "copyParentColorAlpha");
/*    */     paramIt.Jv0(Boolean.valueOf(this.copyParentColorDynamic), "copyParentColorDynamic");
/*    */     paramIt.Jv0(Boolean.valueOf(this.copyParentRotation), "copyParentRotation");
/*    */     paramIt.Jv0(Boolean.valueOf(this.copyParentRotationDynamic), "copyParentRotationDynamic");
/*    */   }
/*    */   
/*    */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*    */   
/*    */   public void load(sz0 paramsz0, ResourceData paramResourceData) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/TrailSpawnInfluencerExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */