/* 1 */ package f;public final class fX extends me { public final void Ad0(short[] paramArrayOfshort) { lpt1 arrayOfLpt12[], lpt12, arrayOfLpt11[], lpt11; float f; if (paramArrayOfshort.length < 2) return;  short s1 = paramArrayOfshort[1]; short s2; switch (s2 = paramArrayOfshort[0]) { default: return;case 392: if (s1 > (arrayOfLpt12 = this.kf0).length) return;  (lpt12 = this[s1]).k = 1.0F; rd(0, false, null);case 391: case 393: if (s1 > (arrayOfLpt11 = ((fX)super).HS[1]).length) return;  lpt11 = this[s1]; if (s2 == 391) { f = 1.0F; } else { f = 0.0F; }  this.k = f; rd(0, false, null);case 390: break; }  s2 = 0; lpt1[] arrayOfLpt13; while (s2 < (
/* 2 */       arrayOfLpt13 = ((fX)super).kf0).length) { if ((f & 1 << s2) != 0) { (arrayOfLpt13[s2]).k = 1.0E8F; arrayOfLpt13[s2]
/* 3 */           .rd(0, false, null); }  s2++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public lpt1[] kf0 = new lpt1[3];
/*   */   public lpt1[][] HS = new lpt1[2][9];
/*   */   
/*   */   public fX(pI parampI) {
/*   */     super(parampI);
/*   */     byte b;
/*   */     for (b = 0; b < 3; b++) {
/*   */       Ve0.Mw().getClass();
/*   */       this.kf0[b] = Ve0.XI0(b);
/*   */       float f = (((2 - b) * 10) + 14.5F) * 0.25F;
/*   */       (this.kf0[b]).mh.g7(3.125F, -0.01F, f);
/*   */       kc(this.kf0[b]);
/*   */     } 
/*   */     for (b = 0; b < 2; b++) {
/*   */       for (int i = 0; i < 9; i = k) {
/*   */         int j = i % 3;
/*   */         Ve0.Mw().getClass();
/*   */         this.HS[b][i] = Ve0.Dq0(j);
/*   */         float f1 = 16.5F;
/*   */         switch (i) {
/*   */           case 2:
/*   */           case 4:
/*   */           case 6:
/*   */             f1 = 26.5F;
/*   */             break;
/*   */           case 1:
/*   */           case 3:
/*   */           case 5:
/*   */             f1 = 36.5F;
/*   */             break;
/*   */         } 
/*   */         int k;
/*   */         float f2 = ((k = i + 1) % 3 * 3);
/*   */         f1 = (f2 + 9.5F) * 0.25F;
/*   */         f2 = b * 0.001F;
/*   */         float f3 = f1 * 0.25F;
/*   */         (this.HS[b][i]).mh.g7(f1, f2, f3);
/*   */         kc(this.HS[b][i]);
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */