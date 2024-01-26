/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public abstract class SpawnShapeValueExt extends ParticleValue implements ResourceData.Configurable { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .xOffsetValue = (RangedNumericValueExt)COm9.aD0(paramIt, parambM0, "xOffsetValue", RangedNumericValueExt.class, null);
/* 3 */     bM0 bM01 = parambM0.Jb("yOffsetValue");
/* 4 */     this.yOffsetValue = (RangedNumericValueExt)paramIt.Uj0(RangedNumericValueExt.class, null, this);
/* 5 */     bM01 = parambM0.Jb("zOffsetValue");
/* 6 */     this.zOffsetValue = (RangedNumericValueExt)paramIt.Uj0(RangedNumericValueExt.class, null, this);
/* 7 */     bM01 = parambM0.Jb("seed");
/* 8 */     this.seed = (LongNumericValue)paramIt.Uj0(LongNumericValue.class, null, this); }
/*   */ 
/*   */   
/*   */   public RangedNumericValueExt xOffsetValue = new RangedNumericValueExt();
/*   */   public RangedNumericValueExt yOffsetValue = new RangedNumericValueExt();
/*   */   public RangedNumericValueExt zOffsetValue = new RangedNumericValueExt();
/*   */   public LongNumericValue seed;
/*   */   
/*   */   public SpawnShapeValueExt() {
/*   */     (this.seed = new LongNumericValue()).setValue(System.nanoTime());
/*   */   }
/*   */   
/*   */   public SpawnShapeValueExt(SpawnShapeValueExt paramSpawnShapeValueExt) {
/*   */     this();
/*   */   }
/*   */   
/*   */   public void reSeed() {
/*   */     if (this.seed.isActive()) {
/*   */       this.xOffsetValue.setSeed(this.seed.getValue());
/*   */       this.yOffsetValue.setSeed(this.seed.getValue());
/*   */       this.zOffsetValue.setSeed(this.seed.getValue());
/*   */     } 
/*   */   }
/*   */   
/*   */   public abstract void spawnAux(eo parameo, float paramFloat);
/*   */   
/*   */   public final eo spawn(eo parameo, float paramFloat) {
/*   */     spawnAux(parameo, paramFloat);
/*   */     RangedNumericValueExt rangedNumericValueExt2;
/*   */     if ((rangedNumericValueExt2 = this.xOffsetValue).active) {
/*   */       float f = parameo.x;
/*   */       parameo.x = rangedNumericValueExt2.newLowValue() + f;
/*   */     } 
/*   */     if ((rangedNumericValueExt2 = this.yOffsetValue).active) {
/*   */       float f = parameo.y;
/*   */       parameo.y = rangedNumericValueExt2.newLowValue() + f;
/*   */     } 
/*   */     RangedNumericValueExt rangedNumericValueExt1;
/*   */     if ((rangedNumericValueExt1 = this.zOffsetValue).active) {
/*   */       float f = parameo.z;
/*   */       parameo.z = newLowValue() + f;
/*   */     } 
/*   */     return parameo;
/*   */   }
/*   */   
/*   */   public void init() {}
/*   */   
/*   */   public void start() {}
/*   */   
/*   */   public void load(ParticleValue paramParticleValue) {
/*   */     super.load(paramParticleValue);
/*   */     this = (SpawnShapeValueExt)paramParticleValue;
/*   */     this.xOffsetValue.load(this.xOffsetValue);
/*   */     this.yOffsetValue.load(this.yOffsetValue);
/*   */     this.zOffsetValue.load(this.zOffsetValue);
/*   */     this.seed.load(this.seed);
/*   */   }
/*   */   
/*   */   public abstract SpawnShapeValueExt copy();
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(this.xOffsetValue, "xOffsetValue");
/*   */     paramIt.Jv0(this.yOffsetValue, "yOffsetValue");
/*   */     paramIt.Jv0(this.zOffsetValue, "zOffsetValue");
/*   */     paramIt.Jv0(this.seed, "seed");
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/SpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */