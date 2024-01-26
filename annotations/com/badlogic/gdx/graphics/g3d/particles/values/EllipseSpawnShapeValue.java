/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class EllipseSpawnShapeValue extends PrimitiveSpawnShapeValue { public void spawnAux(eo parameo, float paramFloat) { float f3 = this.spawnWidth, f4 = this.spawnWidthDiff; f3 = oh.Zn(this.spawnWidthValue, paramFloat, f4, f3);
/*  2 */     f4 = this.spawnHeight; float f5 = this.spawnHeightDiff;
/*  3 */     f4 = oh.Zn(this.spawnHeightValue, paramFloat, f5, f4);
/*  4 */     f5 = this.spawnDepth; float f6 = this.spawnDepthDiff;
/*  5 */     paramFloat = oh.Zn(this.spawnDepthValue, paramFloat, f6, f5); f5 = 0.0F; f6 = 6.2831855F; PrimitiveSpawnShapeValue.SpawnSide spawnSide;
/*  6 */     if ((spawnSide = this.side) == PrimitiveSpawnShapeValue.SpawnSide.top) { f6 = 3.1415927F; } else if (spawnSide == PrimitiveSpawnShapeValue.SpawnSide.bottom) { f6 = -3.1415927F; }
/*  7 */      float f1 = NUL.df(f6, f5, nx0.Mc0.nextFloat(), f5);
/*  8 */     if (this.edges) { if (f3 == 0.0F) { f1 = f4 / 2.0F; f1 = nx0.E70(f1) * f1; f2 = paramFloat / 2.0F; f2 = nx0.zN(f1) * f2; parameo.TG0(0.0F, f1, f2); return; }  if (f4 == 0.0F) { f2 = f3 / 2.0F; f2 = nx0.zN(f1) * f2; paramFloat /= 2.0F; f2.TG0(f2, 0.0F, nx0.E70(f1) * paramFloat); return; }  if (paramFloat == 0.0F) { f2 = f3 / 2.0F; f2 = nx0.zN(f1) * f2; paramFloat = f4 / 2.0F; f2.TG0(f2, nx0.E70(f1) * paramFloat, 0.0F); return; }  paramFloat = f3 / 2.0F; f3 = f4 / 2.0F; f4 = paramFloat / 2.0F; } else { paramFloat = nx0.pq0(f3 / 2.0F); f3 = nx0.pq0(f4 / 2.0F); f4 = nx0.pq0(paramFloat / 2.0F); }
/*    */      float f2;
/* 10 */     f3 = paramFloat * (paramFloat = (float)Math.sqrt((1.0F - (nx0.Mc0.nextFloat() * 2.0F + -1.0F) * (f2 = nx0.Mc0.nextFloat() * 2.0F + -1.0F)))); paramFloat = nx0.zN(f1) * f3; f3 *= paramFloat; f1 = nx0.E70(f1) * f3; f2 = f4 * f2; f2.TG0(paramFloat, f1, f2); }
/*    */ 
/*    */   
/*    */   public PrimitiveSpawnShapeValue.SpawnSide side = PrimitiveSpawnShapeValue.SpawnSide.both;
/*    */   
/*    */   public EllipseSpawnShapeValue(EllipseSpawnShapeValue paramEllipseSpawnShapeValue) {
/*    */     super(paramEllipseSpawnShapeValue);
/*    */     load(paramEllipseSpawnShapeValue);
/*    */   }
/*    */   
/*    */   public EllipseSpawnShapeValue() {}
/*    */   
/*    */   public PrimitiveSpawnShapeValue.SpawnSide getSide() {
/*    */     return this.side;
/*    */   }
/*    */   
/*    */   public void setSide(PrimitiveSpawnShapeValue.SpawnSide paramSpawnSide) {
/*    */     this.side = paramSpawnSide;
/*    */   }
/*    */   
/*    */   public void load(ParticleValue paramParticleValue) {
/*    */     super.load(paramParticleValue);
/*    */     this.side = ((EllipseSpawnShapeValue)paramParticleValue).side;
/*    */   }
/*    */   
/*    */   public SpawnShapeValue copy() {
/*    */     return new EllipseSpawnShapeValue(this);
/*    */   }
/*    */   
/*    */   public void write(It paramIt) {
/*    */     super.write(paramIt);
/*    */     paramIt.Jv0(this.side, "side");
/*    */   }
/*    */   
/*    */   public void read(It paramIt, bM0 parambM0) {
/*    */     super.read(paramIt, parambM0);
/*    */     this.side = (PrimitiveSpawnShapeValue.SpawnSide)COm9.aD0(paramIt, parambM0, "side", PrimitiveSpawnShapeValue.SpawnSide.class, null);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/EllipseSpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */