/* 1 */ package f;public class Tp extends W2 { public Tp(int paramInt) { float[] arrayOfFloat; if (paramInt >= 2 && paramInt <= 5) { this.RR = arrayOfFloat = new float[paramInt]; this.Ye0 = arrayOfFloat1; float[] arrayOfFloat1; (arrayOfFloat1 = new float[paramInt])[0] = 1.0F; switch (paramInt) { case 5: arrayOfFloat[0] = 0.3F; arrayOfFloat[1] = 0.3F; arrayOfFloat[2] = 0.2F; arrayOfFloat[3] = 0.1F; arrayOfFloat[4] = 0.1F; arrayOfFloat1[1] = 0.45F; arrayOfFloat1[2] = 0.3F; arrayOfFloat1[3] = 0.15F; arrayOfFloat1[4] = 0.06F; break;case 4: arrayOfFloat[0] = 0.34F; arrayOfFloat[1] = 0.34F; arrayOfFloat[2] = 0.2F; arrayOfFloat[3] = 0.15F; arrayOfFloat1[1] = 0.26F; arrayOfFloat1[2] = 0.11F; arrayOfFloat1[3] = 0.03F; break;case 3: arrayOfFloat[0] = 0.4F; arrayOfFloat[1] = 0.4F; arrayOfFloat[2] = 0.2F; arrayOfFloat1[1] = 0.33F; arrayOfFloat1[2] = 0.1F; break;case 2: arrayOfFloat[0] = 0.6F; arrayOfFloat[1] = 0.4F; arrayOfFloat1[1] = 0.33F; break; }  arrayOfFloat[0] = arrayOfFloat[0] * 2.0F; return; }  throw new IllegalArgumentException(XD0.SD0("bounces cannot be < 2 or > 5: ", arrayOfFloat)); }
/*   */ 
/*   */   
/*   */   public final float[] RR;
/*   */   public final float[] Ye0;
/*   */   
/*   */   public Tp(float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
/*   */     if (paramArrayOffloat1.length == paramArrayOffloat2.length) {
/*   */       this.RR = paramArrayOffloat1;
/*   */       this.Ye0 = paramArrayOffloat2;
/*   */       return;
/*   */     } 
/*   */     throw new IllegalArgumentException("Must be the same number of widths and heights.");
/*   */   }
/*   */   
/*   */   public float kb(float paramFloat) {
/*   */     if (paramFloat == 1.0F)
/*   */       return 1.0F; 
/*   */     paramFloat = this.RR[0] / 2.0F + paramFloat;
/*   */     float f2 = 0.0F;
/*   */     float f3 = 0.0F;
/*   */     byte b = 0;
/*   */     int i = this.RR.length;
/*   */     while (b < i) {
/*   */       if (paramFloat <= (f2 = this.RR[b])) {
/*   */         f3 = this.Ye0[b];
/*   */         break;
/*   */       } 
/*   */       paramFloat -= f2;
/*   */       b++;
/*   */     } 
/*   */     float f1 = paramFloat / f2;
/*   */     return 1.0F - (4.0F / f2 * f3 * f1 - 4.0F / f2 * f3 * f1 * f1) * f2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */