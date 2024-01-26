/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.batches;public class PointSpriteParticleBatch extends BufferedParticleBatch { private static boolean pointSpritesEnabled = false; public static final eo TMP_V1 = new eo(); public static final int sizeAndRotationUsage = 512; public static final Ao CPU_ATTRIBUTES; public static final int CPU_VERTEX_SIZE; public static final int CPU_POSITION_OFFSET; public static final int CPU_COLOR_OFFSET; public static final int CPU_REGION_OFFSET; public static final int CPU_SIZE_AND_ROTATION_OFFSET; private float[] vertices; public Xw0 renderable; public zc blendingAttribute; public IF depthTestAttribute; public PointSpriteParticleBatch() { this(1000); } public PointSpriteParticleBatch(int paramInt) { this(ParticleShader.ParticleType.Point); ParticleShader.Config config; this(paramInt, this); } public PointSpriteParticleBatch(int paramInt, ParticleShader.Config paramConfig) { this(paramInt, paramConfig, null, null); } private static void enablePointSprites() { UB0.go.glEnable(34370); UB0.Kg0.getClass();
/* 2 */     UB0.go.glEnable(34913); pointSpritesEnabled = true; } public PointSpriteParticleBatch(int paramInt, ParticleShader.Config paramConfig, zc paramzc, IF paramIF) { super(PointSpriteControllerRenderData.class); if (!pointSpritesEnabled) enablePointSprites();  this.blendingAttribute = paramzc; this.depthTestAttribute = paramIF; if (paramzc == null) { this(1, 771, 1.0F); this.blendingAttribute = paramzc; }  if (this.depthTestAttribute == null) { IF iF; this(515, false); this.depthTestAttribute = iF; }  allocRenderable(); ensureCapacity(paramInt); this.renderable.Yc = (R40)new ParticleShader(this.renderable, paramConfig); this.renderable.Yc.init(); } static { this(1, 3, "a_position"); lw0 lw0; (new lw0[4])[0] = lw0; this(2, 4, "a_color"); (new lw0[4])[1] = lw0; this(16, 4, "a_region"); (new lw0[4])[2] = lw0; this(512, 3, "a_sizeAndRotation"); CPU_VERTEX_SIZE = (short)((CPU_ATTRIBUTES = new Ao(new lw0[] { null, null, null, lw0 })).Nb / 4); CPU_POSITION_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(1)).TZ / 4); CPU_COLOR_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(2)).TZ / 4); CPU_REGION_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(16)).TZ / 4); CPU_SIZE_AND_ROTATION_OFFSET = (short)(((new Ao(new lw0[] { null, null, null, lw0 })).kA(512)).TZ / 4); } public void allocParticlesData(int paramInt) { this.vertices = new float[paramInt * CPU_VERTEX_SIZE]; re0 re0; if ((re0 = this.renderable.L90.u90) != null) re0.dispose();  Ao ao = CPU_ATTRIBUTES; this.renderable.L90.u90 = new re0(false, paramInt, 0, this); } public void allocRenderable() { (this.renderable = new Xw0()).L90.lm = 0; (this.renderable = new Xw0()).L90.xI0 = 0; (new dj[3])[0] = (dj)this.blendingAttribute; (new dj[3])[1] = (dj)this.depthTestAttribute; this = null; this(O80.Jg0, (Texture)this); O80 o80; (new Xw0()).bL = new T0(new dj[] { null, null, (dj)o80 }); } public void setTexture(Texture paramTexture) { ((O80)this.renderable.bL.cOM1(O80.Jg0)).cv0.ze = (zp)paramTexture; } public Texture getTexture() { return (Texture)((O80)this.renderable.bL.cOM1(O80.Jg0)).cv0.ze; } public zc getBlendingAttribute() { return this.blendingAttribute; } public void flush(int[] paramArrayOfint) { int i; Hc0 hc0; for (i = 0, hc0 = this.renderData.r30(); hc0.hasNext();) { for (floatChannel1 = (pointSpriteControllerRenderData = (PointSpriteControllerRenderData)hc0.next()).scaleChannel, floatChannel2 = ((PointSpriteControllerRenderData)hc0.next()).regionChannel, floatChannel3 = ((PointSpriteControllerRenderData)hc0.next()).positionChannel, floatChannel4 = ((PointSpriteControllerRenderData)hc0.next()).colorChannel, floatChannel5 = ((PointSpriteControllerRenderData)hc0.next()).rotationChannel, b = 0; b < ((ParticleControllerRenderData)pointSpriteControllerRenderData).controller.particles.size; ) { int k = paramArrayOfint[i] * CPU_VERTEX_SIZE, m = b * ((ParallelArray.Channel)floatChannel2).strideSize, n = b * ((ParallelArray.Channel)floatChannel3).strideSize, i1 = b * ((ParallelArray.Channel)floatChannel4).strideSize, i2 = b * ((ParallelArray.Channel)floatChannel5).strideSize; int i3, i4 = k + (i3 = CPU_POSITION_OFFSET); arrayOfFloat2[i4] = arrayOfFloat5[n + 0]; n = k + i3 + 1; arrayOfFloat2[n] = arrayOfFloat5[n + 1]; n = k + i3 + 2; float[] arrayOfFloat5; arrayOfFloat2[n] = (arrayOfFloat5 = floatChannel3.data)[n + 2]; i3 = k + (n = CPU_COLOR_OFFSET); arrayOfFloat2[i3] = arrayOfFloat4[i1 + 0]; n = k + n + 1; arrayOfFloat2[n] = arrayOfFloat4[i1 + 1]; n = k + n + 2; arrayOfFloat2[n] = arrayOfFloat4[i1 + 2]; n = k + n + 3; float[] arrayOfFloat4; arrayOfFloat2[n] = (arrayOfFloat4 = floatChannel4.data)[i1 + 3]; arrayOfFloat2[k + (n = CPU_SIZE_AND_ROTATION_OFFSET)] = floatChannel1.data[b * ((ParallelArray.Channel)floatChannel1).strideSize]; i1 = k + n + 1; arrayOfFloat2[i1] = arrayOfFloat3[i2 + 0]; n = k + n + 2; float[] arrayOfFloat3; arrayOfFloat2[n] = (arrayOfFloat3 = floatChannel5.data)[i2 + 1]; i1 = k + (n = CPU_REGION_OFFSET); arrayOfFloat2[i1] = arrayOfFloat1[m + 0]; k = k + n + 1; arrayOfFloat2[k] = arrayOfFloat1[m + 1]; k = k + n + 2; arrayOfFloat2[k] = arrayOfFloat1[m + 2]; k = k + n + 3; float[] arrayOfFloat1, arrayOfFloat2; (arrayOfFloat2 = this.vertices)[k] = (arrayOfFloat1 = floatChannel2.data)[m + 3]; b++; i++; }  }  COM6 cOM6 = this.renderable.L90; cOM6.Dr = i; re0 re0 = cOM6.u90; float[] arrayOfFloat = this.vertices; i = 0; int j = (i = this.bufferedParticlesCount) * CPU_VERTEX_SIZE; this.Dt0.Dc(i, j, arrayOfFloat);
/* 3 */     this.renderable.L90.H90(); }
/*   */ 
/*   */   
/*   */   public void getRenderables(fQ paramfQ, Lc paramLc) {
/*   */     if (this.bufferedParticlesCount > 0)
/*   */       paramfQ.Com3(((Xw0)paramLc.obtain()).wz(this.renderable)); 
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     paramResourceData.createSaveData("pointSpriteBatch").saveAsset(paramsz0.kF((iq0)getTexture()), Texture.class);
/*   */   }
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {
/*   */     // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: ldc_w 'pointSpriteBatch'
/*   */     //   4: invokevirtual getSaveData : (Ljava/lang/String;)Lcom/badlogic/gdx/graphics/g3d/particles/ResourceData$SaveData;
/*   */     //   7: dup
/*   */     //   8: astore_2
/*   */     //   9: ifnull -> 48
/*   */     //   12: aload_0
/*   */     //   13: aload_1
/*   */     //   14: dup
/*   */     //   15: aload_2
/*   */     //   16: invokevirtual loadAsset : ()Lf/bs;
/*   */     //   19: dup
/*   */     //   20: aload_1
/*   */     //   21: monitorenter
/*   */     //   22: getfield bz : Ljava/lang/String;
/*   */     //   25: astore_0
/*   */     //   26: getfield RA0 : Ljava/lang/Class;
/*   */     //   29: aload_0
/*   */     //   30: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*   */     //   33: astore_0
/*   */     //   34: monitorexit
/*   */     //   35: aload_0
/*   */     //   36: checkcast com/badlogic/gdx/graphics/Texture
/*   */     //   39: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*   */     //   42: goto -> 48
/*   */     //   45: aload_1
/*   */     //   46: monitorexit
/*   */     //   47: athrow
/*   */     //   48: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 22
/*   */     //   #2	-> 36
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   22	25	45	finally
/*   */     //   26	33	45	finally
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/batches/PointSpriteParticleBatch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */