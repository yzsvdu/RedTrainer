/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public class GradientColorValue extends ParticleValue { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .colors = (float[])COm9.aD0(paramIt, parambM0, "colors", float[].class, null);
/* 3 */     bM0 bM01 = parambM0.Jb("timeline");
/* 4 */     this.timeline = (float[])paramIt.Uj0(float[].class, null, this); }
/*   */ 
/*   */   
/*   */   private static float[] temp = new float[3];
/*   */   private float[] colors;
/*   */   public float[] timeline;
/*   */   
/*   */   public GradientColorValue() {
/*   */     float[] arrayOfFloat;
/*   */     (arrayOfFloat = new float[3])[0] = 1.0F;
/*   */     (new float[3])[1] = 1.0F;
/*   */     (new float[3])[2] = 1.0F;
/*   */     this.colors = this;
/*   */     (arrayOfFloat = new float[1])[0] = 0.0F;
/*   */     this.timeline = this;
/*   */   }
/*   */   
/*   */   public float[] getTimeline() {
/*   */     return this.timeline;
/*   */   }
/*   */   
/*   */   public void setTimeline(float[] paramArrayOffloat) {
/*   */     this.timeline = paramArrayOffloat;
/*   */   }
/*   */   
/*   */   public float[] getColors() {
/*   */     return this.colors;
/*   */   }
/*   */   
/*   */   public void setColors(float[] paramArrayOffloat) {
/*   */     this.colors = paramArrayOffloat;
/*   */   }
/*   */   
/*   */   public float[] getColor(float paramFloat) {
/*   */     getColor(paramFloat, temp, 0);
/*   */     return temp;
/*   */   }
/*   */   
/*   */   public void getColor(float paramFloat, float[] paramArrayOffloat, int paramInt) {
/*   */     int j = 0;
/*   */     int k = -1;
/*   */     float[] arrayOfFloat1;
/*   */     int m = (arrayOfFloat1 = this.timeline).length;
/*   */     int n = 1;
/*   */     n = j;
/*   */     for (j = n; j < m; j = n) {
/*   */       if (arrayOfFloat1[j] > paramFloat) {
/*   */         k = j;
/*   */         break;
/*   */       } 
/*   */       n = j + 1;
/*   */       n = j;
/*   */     } 
/*   */     float f1 = arrayOfFloat1[n];
/*   */     j = n * 3;
/*   */     float f2 = arrayOfFloat2[j];
/*   */     float f3 = arrayOfFloat2[j + 1];
/*   */     float[] arrayOfFloat2;
/*   */     float f4 = (arrayOfFloat2 = this.colors)[j + 2];
/*   */     if (k == -1) {
/*   */       paramArrayOffloat[paramInt] = f2;
/*   */       paramArrayOffloat[paramInt + 1] = f3;
/*   */       paramArrayOffloat[paramInt + 2] = f4;
/*   */       return;
/*   */     } 
/*   */     f1 = (paramFloat - f1) / (arrayOfFloat1[k] - f1);
/*   */     paramArrayOffloat[paramInt] = NUL.df(arrayOfFloat2[i], f2, f1, f2);
/*   */     int i = paramInt + 1;
/*   */     paramArrayOffloat[i] = NUL.df(arrayOfFloat2[i + 1], f3, f1, f3);
/*   */     i = paramInt + 2;
/*   */     paramArrayOffloat[i] = NUL.df(arrayOfFloat2[(i = k * 3) + 2], f4, f1, f4);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(this.colors, "colors");
/*   */     paramIt.Jv0(this.timeline, "timeline");
/*   */   }
/*   */   
/*   */   public void load(GradientColorValue paramGradientColorValue) {
/*   */     load(paramGradientColorValue);
/*   */     float[] arrayOfFloat = new float[paramGradientColorValue.colors.length];
/*   */     int i = this.length;
/*   */     System.arraycopy(paramGradientColorValue.colors, 0, this, 0, i);
/*   */     this.timeline = arrayOfFloat = new float[paramGradientColorValue.timeline.length];
/*   */     i = this.length;
/*   */     System.arraycopy(paramGradientColorValue.timeline, 0, this, 0, i);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/GradientColorValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */