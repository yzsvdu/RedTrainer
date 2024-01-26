/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public abstract class SpawnShapeValue extends ParticleValue implements ResourceData.Configurable { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .xOffsetValue = (RangedNumericValue)COm9.aD0(paramIt, parambM0, "xOffsetValue", RangedNumericValue.class, null);
/* 3 */     bM0 bM01 = parambM0.Jb("yOffsetValue");
/* 4 */     this.yOffsetValue = (RangedNumericValue)paramIt.Uj0(RangedNumericValue.class, null, this);
/* 5 */     bM01 = parambM0.Jb("zOffsetValue");
/* 6 */     this.zOffsetValue = (RangedNumericValue)paramIt.Uj0(RangedNumericValue.class, null, this); }
/*   */ 
/*   */   
/*   */   public RangedNumericValue xOffsetValue;
/*   */   public RangedNumericValue yOffsetValue;
/*   */   public RangedNumericValue zOffsetValue;
/*   */   
/*   */   public SpawnShapeValue() {
/*   */     RangedNumericValue rangedNumericValue;
/*   */     this();
/*   */     this.xOffsetValue = this;
/*   */     this();
/*   */     this.yOffsetValue = this;
/*   */     this();
/*   */     this.zOffsetValue = this;
/*   */   }
/*   */   
/*   */   public SpawnShapeValue(SpawnShapeValue paramSpawnShapeValue) {
/*   */     this();
/*   */   }
/*   */   
/*   */   public abstract void spawnAux(eo parameo, float paramFloat);
/*   */   
/*   */   public final eo spawn(eo parameo, float paramFloat) {
/*   */     spawnAux(parameo, paramFloat);
/*   */     RangedNumericValue rangedNumericValue2;
/*   */     if ((rangedNumericValue2 = this.xOffsetValue).active) {
/*   */       float f = parameo.x;
/*   */       parameo.x = rangedNumericValue2.newLowValue() + f;
/*   */     } 
/*   */     if ((rangedNumericValue2 = this.yOffsetValue).active) {
/*   */       float f = parameo.y;
/*   */       parameo.y = rangedNumericValue2.newLowValue() + f;
/*   */     } 
/*   */     RangedNumericValue rangedNumericValue1;
/*   */     if ((rangedNumericValue1 = this.zOffsetValue).active) {
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
/*   */     this = (SpawnShapeValue)paramParticleValue;
/*   */     this.xOffsetValue.load(this.xOffsetValue);
/*   */     this.yOffsetValue.load(this.yOffsetValue);
/*   */     this.zOffsetValue.load(this.zOffsetValue);
/*   */   }
/*   */   
/*   */   public abstract SpawnShapeValue copy();
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(this.xOffsetValue, "xOffsetValue");
/*   */     paramIt.Jv0(this.yOffsetValue, "yOffsetValue");
/*   */     paramIt.Jv0(this.zOffsetValue, "zOffsetValue");
/*   */   }
/*   */   
/*   */   public void save(sz0 paramsz0, ResourceData paramResourceData) {}
/*   */   
/*   */   public void load(sz0 paramsz0, ResourceData paramResourceData) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/SpawnShapeValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */