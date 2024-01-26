/* 1 */ package f;public final class O7 extends GD { public final int gl(float[] paramArrayOffloat) { float f1 = paramArrayOffloat[0] / 360.0F, f2 = paramArrayOffloat[2] / 100.0F; float f3; if ((f3 = paramArrayOffloat[1] / 100.0F) > 0.0F) { if (f1 < 1.0F) { f1 *= 6.0F; } else { f1 = 0.0F; }  if (f2 > 0.5F) { f4 = 1.0F - f2; } else { f4 = f2; }  f2 = f3 * f4 + f2; f3 = f2 * 2.0F - f2; if (f1 < 4.0F) { f4 = f1 + 2.0F; } else { f4 = f1 - 4.0F; }  float f4 = dS(f2, f3, f4), f5 = dS(f2, f3, f1); if (f1 < 2.0F) { f1 += 4.0F; } else { f1 -= 2.0F; }  f3 = f2 = dS(f2, f3, f1); f1 = f5; f2 = f4; } else { f3 = f2; f1 = f2; }
/*   */     
/* 3 */     return Math.max(0, Math.min(255, (int)(f2 * 255.0F))) << 16 | Math.max(0, Math.min(255, (int)(f1 * 255.0F))) << 8 | Math.max(0, Math.min(255, (int)(f3 * 255.0F))); }
/*   */ 
/*   */   
/*   */   public O7() {
/*   */     super(this);
/*   */   }
/*   */   
/*   */   public static float dS(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     if (paramFloat3 < 1.0F)
/*   */       return NUL.df(paramFloat1, paramFloat2, paramFloat3, paramFloat2); 
/*   */     if (paramFloat3 < 3.0F)
/*   */       return paramFloat1; 
/*   */     if (paramFloat3 < 4.0F) {
/*   */       paramFloat1 -= paramFloat2;
/*   */       return NUL.df(4.0F, paramFloat3, paramFloat1, paramFloat2);
/*   */     } 
/*   */     return paramFloat2;
/*   */   }
/*   */   
/*   */   public final float m20(int paramInt) {
/*   */     return (paramInt == 0) ? 360.0F : 100.0F;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/O7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */