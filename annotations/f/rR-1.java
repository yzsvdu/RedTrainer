/* 1 */ package f;public final class rR extends Rm0 { public float Ws; public float ep; public Color a7; public final int S50; public final int VN; public rR() { super("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n", Uu.Rm().mM()); this.Ws = 1.75F; this.ep = 0.1F; this.a7 = Color.RED.cpy(); if (d8()) { float f; bind(); this.S50 = LPt9("glowSize"); this.VN = LPt9("glowPass"); this.cOm2 = LPt9("glowColor"); this.AE0 = LPt9("glowIntensity"); this.S = LPt9("glowThreshold"); this.Kx0 = LPt9("glowInvTexSize"); this.Qw0 = LPt9("glowTexSize"); w30(this.Ws); Mz(this.ep); Ws0(0.0F); cn0(this.a7); if (h1.YJ == 1) { f = 9.0F; } else { f = 3.0F; }  zW(f); return; }  throw new IllegalArgumentException(B40.df("Error compiling shader: ")
/* 2 */         .append(ET()).toString()); } public final int cOm2; public final int AE0; public final int S; public final int Kx0; public final int Qw0; public final void iu0(int paramInt1, int paramInt2) { paramInt1 = this.Qw0; float f1 = paramInt1, f2 = paramInt2; oM(); UB0.re0.glUniform2f(paramInt1, f1, f2); paramInt1 = this.Kx0; f1 = 1.0F / (paramInt1 - 1); f2 = 1.0F / (paramInt2 - 1);
/* 3 */     oM(); UB0.re0.glUniform2f(paramInt1, f1, f2); }
/*   */ 
/*   */   
/*   */   public final void Ws0(float paramFloat) {
/*   */     rp(this.S50, paramFloat);
/*   */     if (h1.YJ == 1) {
/*   */       paramFloat = 9.0F;
/*   */     } else {
/*   */       paramFloat = 3.0F;
/*   */     } 
/*   */     rp(this.VN, paramFloat);
/*   */   }
/*   */   
/*   */   public final void zW(float paramFloat) {
/*   */     rp(this.VN, paramFloat);
/*   */   }
/*   */   
/*   */   public final void w30(float paramFloat) {
/*   */     rp(this.AE0, paramFloat);
/*   */   }
/*   */   
/*   */   public final void Mz(float paramFloat) {
/*   */     rp(this.S, paramFloat);
/*   */   }
/*   */   
/*   */   public final void cn0(Color paramColor) {
/*   */     int i = this.cOm2;
/*   */     float f1 = paramColor.r;
/*   */     float f2 = paramColor.g;
/*   */     float f3 = paramColor.b;
/*   */     IB(i, f1, f2, f3);
/*   */   }
/*   */   
/*   */   public final int LPt9(String paramString) {
/*   */     return mm0(paramString, false);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */