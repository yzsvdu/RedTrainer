/* 1 */ package com.badlogic.gdx.graphics.g2d.freetype;public class OZ extends vQ implements iq0 { public final void t30(zj paramzj, CharSequence paramCharSequence, int paramInt1, int paramInt2, Jk0 paramJk0) { oF0 oF01; if ((oF01 = this.dh0) != null) oF01.GH0 = true;  super
/* 2 */       .t30(paramzj, paramCharSequence, paramInt1, paramInt2, paramJk0); if (this.Com7) { this.Com7 = false; fQ fQ1 = this.B0; cu0 cu0 = this.nP.uX; this.dh0.LK(this, this, this.nP.IS); }
/*   */      }
/*   */ 
/*   */   
/*   */   public fQ B0;
/*   */   public Gf rL0;
/*   */   public G nP;
/*   */   public FreeType.Stroker yJ0;
/*   */   public oF0 dh0;
/*   */   public fQ IW;
/*   */   public boolean Com7;
/*   */   
/*   */   public Jk0 LF(char paramChar) {
/*   */     Jk0 jk0;
/*   */     Gf gf;
/*   */     if ((jk0 = super.LF(paramChar)) == null && (gf = this.rL0) != null) {
/*   */       gf.Qk0(this.nP.A);
/*   */       if (this.wI) {
/*   */         f = -this.nO;
/*   */       } else {
/*   */         f = this.nO;
/*   */       } 
/*   */       float f = (f + this.Y5) / this.jw;
/*   */       G g = this.nP;
/*   */       FreeType.Stroker stroker = this.yJ0;
/*   */       oF0 oF01 = this.dh0;
/*   */       if ((jk0 = this.rL0.AJ0(paramChar, this, g, stroker, f, oF01)) == null)
/*   */         return this.OB0; 
/*   */       KU(jk0, (pe0)this.B0.get(jk0.R80));
/*   */       tD(paramChar, jk0);
/*   */       this.IW.Com3(jk0);
/*   */       this.Com7 = true;
/*   */       FreeType.Face face = this.rL0.x60;
/*   */       if (this.nP.Bd) {
/*   */         int i = face.HK0(paramChar);
/*   */         byte b = 0;
/*   */         int j = this.IW.Z8;
/*   */         while (b < j) {
/*   */           Jk0 jk01;
/*   */           int k;
/*   */           int m;
/*   */           if ((m = face.bk(i, k = face.HK0((jk01 = (Jk0)this.IW.get(b)).xU))) != 0) {
/*   */             m = jk01.xU;
/*   */             jk0.Js0(m, FreeType.Xx0(m));
/*   */           } 
/*   */           if ((k = face.bk(k, i)) != 0)
/*   */             jk01.Js0(paramChar, FreeType.Xx0(k)); 
/*   */           b++;
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     return jk0;
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     FreeType.Stroker stroker;
/*   */     if ((stroker = this.yJ0) != null)
/*   */       stroker.dispose(); 
/*   */     oF0 oF01;
/*   */     if ((oF01 = this.dh0) != null)
/*   */       dispose(); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g2d/freetype/OZ.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */