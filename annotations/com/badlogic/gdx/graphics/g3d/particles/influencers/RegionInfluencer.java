/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.influencers;public abstract class RegionInfluencer extends Influencer { private static final String ASSET_DATA = "atlasAssetData"; public fQ regions; public ParallelArray.FloatChannel regionChannel; public String atlasName; public RegionInfluencer(int paramInt) { fQ fQ1; this(false, paramInt, AspectTextureRegion.class); this.regions = this; } public RegionInfluencer() { this(1); AspectTextureRegion aspectTextureRegion; this(); (new AspectTextureRegion()).v = 0.0F; (new AspectTextureRegion()).u = 0.0F; (new AspectTextureRegion()).v2 = 1.0F; (new AspectTextureRegion()).u2 = 1.0F; (new AspectTextureRegion()).halfInvAspectRatio = 0.5F; this.regions.Com3(this); } public RegionInfluencer(pe0... paramVarArgs) { fQ fQ1; setAtlasName(null); this(false, paramVarArgs.length, AspectTextureRegion.class); this.regions = this; add(paramVarArgs); } public RegionInfluencer(Texture paramTexture) { this(paramTexture); pe0 pe0; pe0[] arrayOfPe0; (arrayOfPe0 = new pe0[1])[0] = pe0; this(this); } public void read(It paramIt, bM0 parambM0) { this.regions.clear(); this.regions
/*  2 */       .OG0((fQ)COm9.aD0(paramIt, parambM0, "regions", fQ.class, AspectTextureRegion.class)); } public RegionInfluencer(RegionInfluencer paramRegionInfluencer) { this(paramRegionInfluencer.regions.Z8); this.regions.ZY(paramRegionInfluencer.regions.Z8); fQ fQ1; for (byte b = 0; b < (fQ1 = paramRegionInfluencer.regions).Z8; b++) this.regions.Com3(new AspectTextureRegion((AspectTextureRegion)fQ1.get(b)));  } public void setAtlasName(String paramString) { this.atlasName = paramString; } public void add(pe0... paramVarArgs) { this.regions.ZY(paramVarArgs.length); int i = paramVarArgs.length; for (byte b = 0; b < i; b++) { pe0 pe01 = paramVarArgs[b]; this.regions.Com3(new AspectTextureRegion(pe01)); }  } public void clear() { this.atlasName = null; this.regions.clear(); } public void load(sz0 paramsz0, ResourceData paramResourceData) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_0
/*    */     //   2: aload_1
/*    */     //   3: aload_2
/*    */     //   4: invokespecial load : (Lf/sz0;Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData;)V
/*    */     //   7: ldc 'atlasAssetData'
/*    */     //   9: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*    */     //   12: dup
/*    */     //   13: astore_2
/*    */     //   14: ifnonnull -> 18
/*    */     //   17: return
/*    */     //   18: aload_0
/*    */     //   19: aload_1
/*    */     //   20: aload_2
/*    */     //   21: invokevirtual loadAsset : ()Lf/bs;
/*    */     //   24: dup
/*    */     //   25: aload_1
/*    */     //   26: monitorenter
/*    */     //   27: getfield bz : Ljava/lang/String;
/*    */     //   30: astore_0
/*    */     //   31: getfield RA0 : Ljava/lang/Class;
/*    */     //   34: aload_0
/*    */     //   35: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   38: aload_1
/*    */     //   39: monitorexit
/*    */     //   40: checkcast f/COm1
/*    */     //   43: astore_0
/*    */     //   44: getfield regions : Lf/fQ;
/*    */     //   47: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   50: astore_1
/*    */     //   51: aload_1
/*    */     //   52: invokevirtual hasNext : ()Z
/*    */     //   55: ifeq -> 72
/*    */     //   58: aload_1
/*    */     //   59: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   62: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/RegionInfluencer$AspectTextureRegion
/*    */     //   65: aload_0
/*    */     //   66: invokevirtual updateUV : (Lf/COm1;)V
/*    */     //   69: goto -> 51
/*    */     //   72: return
/*    */     //   73: aload_1
/*    */     //   74: monitorexit
/*    */     //   75: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 40
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   27	30	73	finally
/*  2 */     //   31	38	73	finally } public void save(sz0 paramsz0, ResourceData paramResourceData) { super.save(paramsz0, paramResourceData); if (this.atlasName != null) { ResourceData.SaveData saveData; if ((saveData = paramResourceData.getSaveData("atlasAssetData")) == null) saveData = paramResourceData.createSaveData("atlasAssetData");  saveData.saveAsset(this.atlasName, COm1.class); }  } public void allocateChannels() { this.regionChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.TextureRegion); } public void write(It paramIt) { paramIt.Vp0("regions", this.regions, fQ.class, AspectTextureRegion.class); } public static class AspectTextureRegion { public float u; public float v; public float u2; public float v2; public float halfInvAspectRatio; public String imageName; public AspectTextureRegion() {} public AspectTextureRegion(AspectTextureRegion param1AspectTextureRegion) { set(param1AspectTextureRegion); } public AspectTextureRegion(pe0 param1pe0) { set(param1pe0); } public void set(pe0 param1pe0) { this.u = param1pe0.mP;
/*    */       
/*  4 */       this.v = param1pe0.WT;
/*    */       
/*  6 */       this.u2 = param1pe0.zV;
/*    */       
/*  8 */       this.v2 = param1pe0.bh0; float f = 0.5F;
/*    */ 
/*    */       
/* 11 */       this.halfInvAspectRatio = param1pe0.Vn0 / param1pe0.H0 * f; if (param1pe0 instanceof P70) this.imageName = ((P70)param1pe0).Pk;  } public void set(AspectTextureRegion param1AspectTextureRegion) { this.u = param1AspectTextureRegion.u; this.v = param1AspectTextureRegion.v; this.u2 = param1AspectTextureRegion.u2; this.v2 = param1AspectTextureRegion.v2; this.halfInvAspectRatio = param1AspectTextureRegion.halfInvAspectRatio; this.imageName = param1AspectTextureRegion.imageName; }
/*    */     public void updateUV(COm1 param1COm1) { String str; if ((str = this.imageName) == null)
/* 13 */         return;  byte b = 0; int i = param1COm1.ui0.Z8; while (true) { if (b < i) { if (((P70)param1COm1.ui0.get(b)).Pk.equals(str)) { P70 p70 = (P70)param1COm1.ui0.get(b); break; }  b++; continue; }  param1COm1 = null; break; }  this.u = ((pe0)param1COm1).mP; this.v = ((pe0)param1COm1).WT; this.u2 = ((pe0)param1COm1).zV; this.v2 = ((pe0)param1COm1).bh0; this.halfInvAspectRatio = ((pe0)param1COm1).Vn0 / ((pe0)param1COm1).H0 * 0.5F; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static class Animated extends RegionInfluencer {
/*    */     public ParallelArray.FloatChannel lifeChannel;
/*    */     
/*    */     public Animated() {}
/*    */     
/*    */     public Animated(Animated param1Animated) {
/*    */       super(param1Animated);
/*    */     }
/*    */     
/*    */     public Animated(pe0 param1pe0) {
/*    */       super(this);
/*    */     }
/*    */     
/*    */     public Animated(Texture param1Texture) {
/*    */       super(param1Texture);
/*    */     }
/*    */     
/*    */     public void allocateChannels() {
/*    */       super.allocateChannels();
/*    */       this.lifeChannel = (ParallelArray.FloatChannel)this.controller.particles.addChannel(ParticleChannels.Life);
/*    */     }
/*    */     
/*    */     public void update() {
/*    */       int i = 0;
/*    */       byte b = 2;
/*    */       int j = this.controller.particles.size * ((ParallelArray.Channel)this.regionChannel).strideSize;
/*    */       while (i < j) {
/*    */         RegionInfluencer.AspectTextureRegion aspectTextureRegion = (RegionInfluencer.AspectTextureRegion)this.regions.get((int)(this.lifeChannel.data[b] * (this.regions.Z8 - 1)));
/*    */         int k = i + 0;
/*    */         arrayOfFloat[k] = aspectTextureRegion.u;
/*    */         k = i + 1;
/*    */         arrayOfFloat[k] = aspectTextureRegion.v;
/*    */         k = i + 2;
/*    */         arrayOfFloat[k] = aspectTextureRegion.u2;
/*    */         k = i + 3;
/*    */         arrayOfFloat[k] = aspectTextureRegion.v2;
/*    */         arrayOfFloat[i + 4] = 0.5F;
/*    */         i += 5;
/*    */         float[] arrayOfFloat;
/*    */         (arrayOfFloat = this.regionChannel.data)[i] = aspectTextureRegion.halfInvAspectRatio;
/*    */         i += ((ParallelArray.Channel)this.regionChannel).strideSize;
/*    */         k = b + ((ParallelArray.Channel)this.lifeChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public Animated copy() {
/*    */       return new Animated(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Random extends RegionInfluencer {
/*    */     public Random() {}
/*    */     
/*    */     public Random(Random param1Random) {
/*    */       super(param1Random);
/*    */     }
/*    */     
/*    */     public Random(pe0 param1pe0) {
/*    */       super(this);
/*    */     }
/*    */     
/*    */     public Random(Texture param1Texture) {
/*    */       super(param1Texture);
/*    */     }
/*    */     
/*    */     public void activateParticles(int param1Int1, int param1Int2) {
/*    */       for (param1Int2 = param1Int1 * (param1Int1 = ((ParallelArray.Channel)this.regionChannel).strideSize), param1Int1 = param1Int2 * param1Int1 + param1Int2; param1Int2 < param1Int1; ) {
/*    */         Object object;
/*    */         int j;
/*    */         if ((j = (object = this.regions).Z8) == 0) {
/*    */           object = null;
/*    */         } else {
/*    */           object = ((fQ)object).Uq0[nx0.Mc0.nextInt(j - 1 - 0 + 1) + 0];
/*    */         } 
/*    */         object = object;
/*    */         int i = param1Int2 + 0;
/*    */         arrayOfFloat[i] = ((RegionInfluencer.AspectTextureRegion)object).u;
/*    */         i = param1Int2 + 1;
/*    */         arrayOfFloat[i] = ((RegionInfluencer.AspectTextureRegion)object).v;
/*    */         i = param1Int2 + 2;
/*    */         arrayOfFloat[i] = ((RegionInfluencer.AspectTextureRegion)object).u2;
/*    */         i = param1Int2 + 3;
/*    */         arrayOfFloat[i] = ((RegionInfluencer.AspectTextureRegion)object).v2;
/*    */         arrayOfFloat[param1Int2 + 4] = 0.5F;
/*    */         param1Int2 += 5;
/*    */         float[] arrayOfFloat;
/*    */         (arrayOfFloat = this.regionChannel.data)[param1Int2] = ((RegionInfluencer.AspectTextureRegion)object).halfInvAspectRatio;
/*    */         param1Int2 += ((ParallelArray.Channel)this.regionChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public Random copy() {
/*    */       return new Random(this);
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Single extends RegionInfluencer {
/*    */     public Single() {}
/*    */     
/*    */     public Single(Single param1Single) {
/*    */       super(param1Single);
/*    */     }
/*    */     
/*    */     public Single(pe0 param1pe0) {
/*    */       super(this);
/*    */     }
/*    */     
/*    */     public Single(Texture param1Texture) {
/*    */       super(param1Texture);
/*    */     }
/*    */     
/*    */     public void init() {
/*    */       RegionInfluencer.AspectTextureRegion aspectTextureRegion = ((RegionInfluencer.AspectTextureRegion[])this.regions.Uq0)[0];
/*    */       int i = 0;
/*    */       int j = this.controller.emitter.maxParticleCount * ((ParallelArray.Channel)this.regionChannel).strideSize;
/*    */       while (i < j) {
/*    */         int k = i + 0;
/*    */         arrayOfFloat[k] = aspectTextureRegion.u;
/*    */         k = i + 1;
/*    */         arrayOfFloat[k] = aspectTextureRegion.v;
/*    */         k = i + 2;
/*    */         arrayOfFloat[k] = aspectTextureRegion.u2;
/*    */         k = i + 3;
/*    */         arrayOfFloat[k] = aspectTextureRegion.v2;
/*    */         arrayOfFloat[i + 4] = 0.5F;
/*    */         i += 5;
/*    */         float[] arrayOfFloat;
/*    */         (arrayOfFloat = this.regionChannel.data)[i] = aspectTextureRegion.halfInvAspectRatio;
/*    */         i += ((ParallelArray.Channel)this.regionChannel).strideSize;
/*    */       } 
/*    */     }
/*    */     
/*    */     public Single copy() {
/*    */       return new Single(this);
/*    */     }
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/influencers/RegionInfluencer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */