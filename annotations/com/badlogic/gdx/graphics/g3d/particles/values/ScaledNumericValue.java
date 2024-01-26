/*  1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class ScaledNumericValue extends RangedNumericValue { private float[] scaling; public float[] timeline; private float highMin; public float newHighValue() { float f = this.highMin; return nx0.Mc0.nextFloat() * (this.highMax - f) + f; } private float highMax; private boolean relative; public ScaledNumericValue() { float[] arrayOfFloat; (arrayOfFloat = new float[1])[0] = 1.0F; this.scaling = this; (arrayOfFloat = new float[1])[0] = 0.0F; this.timeline = this; this.relative = false; } public void setHigh(float paramFloat) { this.highMin = paramFloat; this.highMax = paramFloat; } public void setHigh(float paramFloat1, float paramFloat2) { this.highMin = paramFloat1; this.highMax = paramFloat2; } public float getHighMin() { return this.highMin; } public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); Class<float> clazz1 = float.class; this
/*  2 */       .highMin = ((Float)COm9.aD0(paramIt, parambM0, "highMin", this, null)).floatValue();
/*  3 */     bM0 bM02 = parambM0.Jb("highMax");
/*  4 */     this.highMax = ((Float)paramIt.Uj0(this, null, bM02)).floatValue(); Class<boolean> clazz = boolean.class;
/*  5 */     bM02 = parambM0.Jb("relative");
/*  6 */     this.relative = ((Boolean)paramIt.Uj0(this, null, bM02)).booleanValue();
/*  7 */     bM0 bM01 = parambM0.Jb("scaling");
/*  8 */     this.scaling = (float[])paramIt.Uj0(float[].class, null, this);
/*  9 */     bM01 = parambM0.Jb("timeline");
/* 10 */     this.timeline = (float[])paramIt.Uj0(float[].class, null, this); }
/*    */ 
/*    */   
/*    */   public void setHighMin(float paramFloat) {
/*    */     this.highMin = paramFloat;
/*    */   }
/*    */   
/*    */   public float getHighMax() {
/*    */     return this.highMax;
/*    */   }
/*    */   
/*    */   public void setHighMax(float paramFloat) {
/*    */     this.highMax = paramFloat;
/*    */   }
/*    */   
/*    */   public float[] getScaling() {
/*    */     return this.scaling;
/*    */   }
/*    */   
/*    */   public void setScaling(float[] paramArrayOffloat) {
/*    */     this.scaling = paramArrayOffloat;
/*    */   }
/*    */   
/*    */   public float[] getTimeline() {
/*    */     return this.timeline;
/*    */   }
/*    */   
/*    */   public void setTimeline(float[] paramArrayOffloat) {
/*    */     this.timeline = paramArrayOffloat;
/*    */   }
/*    */   
/*    */   public boolean isRelative() {
/*    */     return this.relative;
/*    */   }
/*    */   
/*    */   public void setRelative(boolean paramBoolean) {
/*    */     this.relative = paramBoolean;
/*    */   }
/*    */   
/*    */   public float getScale(float paramFloat) {
/*    */     byte b = -1;
/*    */     int j = this.timeline.length;
/*    */     for (byte b1 = 1; b1 < j; b1++) {
/*    */       if (this.timeline[b1] > paramFloat) {
/*    */         b = b1;
/*    */         break;
/*    */       } 
/*    */     } 
/*    */     if (b == -1)
/*    */       return this.scaling[j - 1]; 
/*    */     int i = b - 1;
/*    */     float f1 = arrayOfFloat[i];
/*    */     float[] arrayOfFloat;
/*    */     float f2 = (arrayOfFloat = this.timeline)[i];
/*    */     float f3 = (arrayOfFloat = this.scaling)[b] - f1;
/*    */     return (paramFloat - f2) / (arrayOfFloat[b] - f2) * f3 + f1;
/*    */   }
/*    */   
/*    */   public void load(ScaledNumericValue paramScaledNumericValue) {
/*    */     load(paramScaledNumericValue);
/*    */     this.highMax = paramScaledNumericValue.highMax;
/*    */     this.highMin = paramScaledNumericValue.highMin;
/*    */     float[] arrayOfFloat = new float[paramScaledNumericValue.scaling.length];
/*    */     int i = this.length;
/*    */     System.arraycopy(paramScaledNumericValue.scaling, 0, this, 0, i);
/*    */     this.timeline = arrayOfFloat = new float[paramScaledNumericValue.timeline.length];
/*    */     i = this.length;
/*    */     System.arraycopy(paramScaledNumericValue.timeline, 0, this, 0, i);
/*    */     this.relative = paramScaledNumericValue.relative;
/*    */   }
/*    */   
/*    */   public void write(It paramIt) {
/*    */     super.write(paramIt);
/*    */     paramIt.Jv0(Float.valueOf(this.highMin), "highMin");
/*    */     paramIt.Jv0(Float.valueOf(this.highMax), "highMax");
/*    */     paramIt.Jv0(Boolean.valueOf(this.relative), "relative");
/*    */     paramIt.Jv0(this.scaling, "scaling");
/*    */     paramIt.Jv0(this.timeline, "timeline");
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */