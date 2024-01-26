/*  1 */ package f;public abstract class la0 implements iq0 { public final void QT(ql0 paramql0) { lb lb; if (!paramql0.CG0) return;  if (paramql0 instanceof si0)
/*    */     
/*  3 */     { lb = ((si0)paramql0).VI; byte b = 0; fQ fQ; while (b < 
/*  4 */         (fQ = lb.VD0)
/*  5 */         .Z8)
/*  6 */       { ql0 ql01; if ((ql01 = (ql0)fQ.get(b))
/*  7 */           .CG0)
/*  8 */           QT(ql01);  b++; }  } else if (lb instanceof YN) { ih0((YN)lb); } else { float f; if (lb instanceof Jv)
/*    */       
/*    */       { 
/* 11 */         float f2 = color.g, f3 = color.b;
/*    */         Color color;
/* 13 */         float f1 = Color.toFloatBits((color = ((JX)this.BM).Bm).r, f2, f3, color.a * jv.ln0), arrayOfFloat[] = this.OM; Jv jv; pe0 pe0;
/* 14 */         if ((pe0 = (jv = (Jv)lb).ST) != null) {
/* 15 */           f = jv.vH0;
/*    */           
/* 17 */           float f4 = f * (f = this.Gx), f5 = jv.d70 * f;
/* 18 */           float f6 = pe0.H0 * f + f4;
/* 19 */           f = pe0.Vn0 * f + f5;
/* 20 */           float f8 = f6 - f4, f10 = f - f5; this.dv.jG(f4, f5, f8, f10); cx0 cx02 = this.K7; cx02.getClass();
/* 21 */           float f12 = f11 + cx04.af; float f13, f9 = (f13 = cx04.zA0) + cx04.sf0;
/* 22 */           cx0 cx03 = this.dv; float f7; cx0 cx01, cx04; float f11, f14;
/* 23 */           if ((((f11 = (cx04 = this.dv).dA) > (f14 = cx02.dA) && f11 < (f11 = f14 + cx02.af) && f12 > f14 && f12 < f11 && f13 > (f11 = cx02.zA0) && f13 < (f7 = f11 + cx02.sf0) && f9 > f11 && f9 < f7)) || (((f11 = (cx01 = this.K7).dA) < (
/* 24 */             f12 = cx03.dA) + cx03.af && f11 + cx01.af > f12 && (f11 = cx01.zA0) < (f12 = cx03.zA0) + cx03.sf0 && f11 + cx01.sf0 > f12))) {
/* 25 */             float f15 = pe0.mP;
/* 26 */             float f16 = pe0.bh0;
/* 27 */             float f17 = pe0.zV;
/* 28 */             f11 = pe0.WT; arrayOfFloat[0] = f4;
/* 29 */             arrayOfFloat[1] = f5; arrayOfFloat[2] = f1; arrayOfFloat[3] = f15; arrayOfFloat[4] = f16; arrayOfFloat[5] = f4; arrayOfFloat[6] = f; arrayOfFloat[7] = f1; arrayOfFloat[8] = f15; arrayOfFloat[9] = f11; arrayOfFloat[10] = f6; arrayOfFloat[11] = f; arrayOfFloat[12] = f1; arrayOfFloat[13] = f17; arrayOfFloat[14] = f11; arrayOfFloat[15] = f6; arrayOfFloat[16] = f5; arrayOfFloat[17] = f1; arrayOfFloat[18] = f17; arrayOfFloat[19] = f16; this.BM
/*    */               
/* 31 */               .xu(pe0.G3, arrayOfFloat, 20);
/*    */           } 
/*    */         }  }
/* 34 */       else { Hc0 hc0 = f.TM.e80.r30();
/* 35 */         for (; hasNext(); (Nu)next()); }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public pB0 Vc;
/*    */   public float Gx;
/*    */   public M30 BM;
/*    */   public cx0 K7;
/*    */   public cx0 dv = new cx0();
/*    */   public boolean qq0;
/*    */   public float[] OM = new float[20];
/*    */   
/*    */   public la0(pB0 parampB0) {
/*    */     this(parampB0, 1.0F);
/*    */   }
/*    */   
/*    */   public la0(pB0 parampB0, float paramFloat) {
/*    */     this.Vc = parampB0;
/*    */     this.Gx = paramFloat;
/*    */     this.K7 = new cx0();
/*    */     this.BM = new JX();
/*    */     this.qq0 = true;
/*    */   }
/*    */   
/*    */   public la0(pB0 parampB0, M30 paramM30) {
/*    */     this(parampB0, 1.0F, paramM30);
/*    */   }
/*    */   
/*    */   public la0(pB0 parampB0, float paramFloat, M30 paramM30) {
/*    */     this.Vc = parampB0;
/*    */     this.Gx = paramFloat;
/*    */     this.K7 = new cx0();
/*    */     this.BM = paramM30;
/*    */     this.qq0 = false;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     if (this.qq0)
/*    */       ((JX)this.BM).dispose(); 
/*    */   }
/*    */   
/*    */   public abstract void ih0(YN paramYN); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/la0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */