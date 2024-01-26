/* 1 */ package f;public final class s7 { public final String toString() { String str; byte b; for (str = "", b = 0; b < this.Wc0.length; )
/* 2 */     { str = B40.df(str).append(Float.toString(this.Wc0[b])).append(", ").append(Float.toString(this.Wc0[b + 1])).append(", ").append(Float.toString(this.Wc0[b + 2])).append("\n").toString(); b += 3; }  return str; }
/*   */ 
/*   */   
/*   */   public final float[] Wc0;
/*   */   
/*   */   public s7() {
/*   */     this.Wc0 = new float[18];
/*   */   }
/*   */   
/*   */   public s7(float[] paramArrayOffloat) {
/*   */     if (paramArrayOffloat.length == 18) {
/*   */       this.Wc0 = paramArrayOffloat;
/*   */       int i = (paramArrayOffloat = new float[paramArrayOffloat.length]).length;
/*   */       System.arraycopy(paramArrayOffloat, 0, paramArrayOffloat, 0, i);
/*   */       return;
/*   */     } 
/*   */     throw new JU("Incorrect array size");
/*   */   }
/*   */   
/*   */   public s7(s7 params7) {
/*   */     this(params7.Wc0);
/*   */   }
/*   */   
/*   */   public final s7 LE0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*   */     int j;
/*   */     float f5 = paramFloat5 * paramFloat5;
/*   */     float f6 = paramFloat6 * paramFloat6;
/*   */     float f4;
/*   */     float f7;
/*   */     if ((f7 = (f4 = paramFloat4 * paramFloat4) + f5 + f6) == 0.0F)
/*   */       return this; 
/*   */     paramFloat1 = 1.0F / f7;
/*   */     paramFloat2 = paramFloat1 * (paramFloat1 = (f7 + 1.0F) * paramFloat1);
/*   */     paramFloat3 = paramFloat2 * paramFloat1;
/*   */     paramFloat1 = paramFloat3 * paramFloat1;
/*   */     if (paramFloat4 > 0.0F) {
/*   */       j = 0;
/*   */     } else {
/*   */       j = 3;
/*   */     } 
/*   */     f4 = arrayOfFloat[j];
/*   */     arrayOfFloat[j] = f4 * paramFloat2 + f4;
/*   */     int m;
/*   */     f7 = arrayOfFloat[m = j + 1];
/*   */     arrayOfFloat[m] = f4 * paramFloat3 + f7;
/*   */     float f3 = arrayOfFloat[j += 2];
/*   */     float[] arrayOfFloat;
/*   */     (arrayOfFloat = this.Wc0)[j] = f4 * paramFloat1 + f3;
/*   */     if (paramFloat5 > 0.0F) {
/*   */       j = 6;
/*   */     } else {
/*   */       j = 9;
/*   */     } 
/*   */     paramFloat6 = arrayOfFloat[j];
/*   */     arrayOfFloat[j] = f5 * paramFloat2 + paramFloat6;
/*   */     int k;
/*   */     f3 = arrayOfFloat[k = j + 1];
/*   */     arrayOfFloat[k] = f5 * paramFloat3 + f3;
/*   */     float f2 = arrayOfFloat[j += 2];
/*   */     arrayOfFloat[j] = f5 * paramFloat1 + f2;
/*   */     if (paramFloat6 > 0.0F) {
/*   */       j = 12;
/*   */     } else {
/*   */       j = 15;
/*   */     } 
/*   */     float f1 = arrayOfFloat[j];
/*   */     arrayOfFloat[j] = f6 * paramFloat2 + f1;
/*   */     int i;
/*   */     paramFloat1 = arrayOfFloat[i = j + 1];
/*   */     arrayOfFloat[i] = f6 * paramFloat3 + paramFloat1;
/*   */     paramFloat1 = arrayOfFloat[i = j + 2];
/*   */     arrayOfFloat[i] = f6 * paramFloat1 + paramFloat1;
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/s7.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */