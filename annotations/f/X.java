/* 1 */ package f;public final class X extends zv0 { public X(S60 paramS60) {} public final boolean UI0(float paramFloat1, float paramFloat2) { this.nul.eB0(); S60 s60; boolean bool; if ((bool = (s60 = this.nul).Cf) || s60.h50) { S60 s602; if (bool) { if (!s60.h50 && paramFloat2 == 0.0F) { paramFloat2 = paramFloat1; float f1 = s60.kB; s60
/*   */ 
/*   */             
/* 4 */             .kB = nx0.SA0(Math.min(s60.GI0.sf0, Math.max(s60.GI0.sf0 * 0.9F, s60.nn * 0.1F) / 4.0F) * paramFloat1 + f1, 0.0F, s60.nn);
/* 5 */           paramFloat1 = (s602 = this.nul).LY; this.nul
/*   */ 
/*   */ 
/*   */             
/* 9 */             .LY = nx0.SA0(Math.min(this.nul.GI0.af, Math.max(this.nul.GI0.af * 0.9F, this.OH0 * 0.1F) / 4.0F) * paramFloat2 + paramFloat1, 0.0F, this.OH0); return true; }  } else if (s60.h50 && paramFloat1 == 0.0F) { paramFloat1 = paramFloat2; float f1 = s60.kB; s60.kB = nx0.SA0(Math.min(s60.GI0.sf0, Math.max(s60.GI0.sf0 * 0.9F, s60.nn * 0.1F) / 4.0F) * paramFloat1 + f1, 0.0F, s60.nn); paramFloat1 = (s602 = ((X)super).nul).LY; ((X)super).nul.LY = nx0.SA0(Math.min(((X)super).nul.GI0.af, Math.max(((X)super).nul.GI0.af * 0.9F, this.OH0 * 0.1F) / 4.0F) * paramFloat2 + paramFloat1, 0.0F, this.OH0); return true; }  paramFloat1 = paramFloat2 = paramFloat1; float f = s60.kB; s60.kB = nx0.SA0(Math.min(s60.GI0.sf0, Math.max(s60.GI0.sf0 * 0.9F, s60.nn * 0.1F) / 4.0F) * paramFloat1 + f, 0.0F, s60.nn); S60 s601; paramFloat1 = (s601 = ((X)super).nul).LY; ((X)super).nul.LY = nx0.SA0(Math.min(((X)super).nul.GI0.af, Math.max(((X)super).nul.GI0.af * 0.9F, this.OH0 * 0.1F) / 4.0F) * paramFloat2 + paramFloat1, 0.0F, this.OH0); return true; }
/*   */     
/*   */     return false; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */