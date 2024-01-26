/*  1 */ package f;public final class vf extends zv0 { public final boolean LPt8(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) { S60 s601; float f; S60 s603; if ((s603 = this.wq0).aF != -1) return false;  if (paramInt1 == 0 && paramInt2 != 0) return false;  Zy zy; if ((zy = s603.ih0) != null) zy
/*  2 */         .JL0(s603);  S60 s602; if (!(s602 = this.wq0).WY) s602.eB0();  if ((s602 = this.wq0).xz0 == 0.0F) return false;  if (s602.lPt4 && s602.h50 && s602.Fb.ob0(paramFloat1, paramFloat2)) { paramiW
/*  3 */         .Hy = true;
/*  4 */       this.wq0.eB0(); if (this.wq0.uh.ob0(paramFloat1, paramFloat2)) { s60.PH
/*  5 */           .x = paramFloat1;
/*  6 */         s60.PH.y = paramFloat2;
/*  7 */         this.yJ0 = s60.uh.dA; s60.Ad0 = true; S60 s60; (s60 = this.wq0).aF = paramInt1; return true; }  f = (s601 = this.wq0).LY; paramFloat1 = this.wq0.GI0.af; paramFloat2 = ((paramFloat1 < this.wq0.uh.dA) ? -1 : true); this
/*    */         
/*  9 */         .LY = nx0.SA0(paramFloat1 * paramFloat2 + f, 0.0F, this.OH0); return true; }
/* 10 */      if ((s602 = ((vf)super).wq0).lPt4 && s602.Cf && s602.continue.ob0(paramFloat1, paramFloat2)) { f
/* 11 */         .Hy = true;
/* 12 */       ((vf)super).wq0.eB0(); if (((vf)super).wq0.Qt.ob0(paramFloat1, paramFloat2)) { s60.PH
/* 13 */           .x = paramFloat1;
/* 14 */         s60.PH.y = paramFloat2;
/* 15 */         ((vf)super).yJ0 = s60.Qt.zA0; s60.hf0 = true; S60 s60; (s60 = ((vf)super).wq0).aF = paramInt1; return true; }  f = (s601 = ((vf)super).wq0).kB; paramFloat1 = ((vf)super).wq0.GI0.sf0; paramFloat2 = ((paramFloat2 < ((vf)super).wq0.Qt.zA0) ? true : -1); this
/*    */         
/* 17 */         .kB = nx0.SA0(paramFloat1 * paramFloat2 + f, 0.0F, this.nn); return true; }  return false; }
/*    */ 
/*    */   
/*    */   public float yJ0;
/*    */   
/*    */   public vf(S60 paramS60) {}
/*    */   
/*    */   public final void ga(iW paramiW, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/*    */     S60 s60;
/*    */     if (paramInt1 != (s60 = this.wq0).aF)
/*    */       return; 
/*    */     this.aF = -1;
/*    */     this.Ad0 = false;
/*    */     this.hf0 = false;
/*    */     this.S70.gq.SH0.uw0();
/*    */     this.S70.gq.Cp0 = true;
/*    */   }
/*    */   
/*    */   public final void Si(iW paramiW, float paramFloat1, float paramFloat2, int paramInt) {
/*    */     float f;
/*    */     S60 s60;
/*    */     if (paramInt != (s60 = this.wq0).aF)
/*    */       return; 
/*    */     if (s60.Ad0) {
/*    */       f = paramFloat1 - s60.PH.x;
/*    */       this.yJ0 = f = this.yJ0 + f;
/*    */       f = Math.max(s60.Fb.dA, f);
/*    */       S60 s601;
/*    */       cx0 cx0;
/*    */       f = Math.min((cx0 = (s601 = this.wq0).Fb).dA + cx0.af - s601.uh.af, f);
/*    */       float f1;
/*    */       if ((f1 = (cx0 = (s601 = this.wq0).Fb).af - s601.uh.af) != 0.0F) {
/*    */         f = s601.OH0;
/*    */         s601.LY = nx0.SA0((f - cx0.dA) / f1, 0.0F, 1.0F) * f;
/*    */       } 
/*    */     } else if (f.hf0) {
/*    */       f = paramFloat2 - f.PH.y;
/*    */       this.yJ0 = f = this.yJ0 + f;
/*    */       f = Math.max(f.continue.zA0, f);
/*    */       S60 s601;
/*    */       cx0 cx0;
/*    */       f = Math.min((cx0 = (s601 = this.wq0).continue).zA0 + cx0.sf0 - s601.Qt.sf0, f);
/*    */       float f1;
/*    */       if ((f1 = (cx0 = (s601 = this.wq0).continue).sf0 - s601.Qt.sf0) != 0.0F) {
/*    */         f = s601.nn;
/*    */         s601.kB = nx0.SA0(1.0F - (f - cx0.zA0) / f1, 0.0F, 1.0F) * f;
/*    */       } 
/*    */     } else {
/*    */       return;
/*    */     } 
/*    */     this.wq0.PH.x = paramFloat1;
/*    */     this.wq0.PH.y = paramFloat2;
/*    */   }
/*    */   
/*    */   public final void ci0() {
/*    */     S60 s60;
/*    */     if (!(s60 = this.wq0).WY)
/*    */       eB0(); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vf.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */