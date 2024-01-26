/*  1 */ package f;public final class PF extends yp0 { public final void wL() { kf kf1 = this.B20; byte b = this.zB.Hf; Gp0 gp0 = this.AD; boolean bool; if (bool = this.I0)
/*    */     
/*  3 */     { byte b3 = 1; hm0[] arrayOfHm0; int i; byte b4;
/*  4 */       for (i = (arrayOfHm0 = gp0.cl[b]).length, b4 = 0; b4 < b3; ) { hm0 hm0 = arrayOfHm0[0]; int j = i - 1; System.arraycopy(arrayOfHm0, 1, arrayOfHm0, 0, j); arrayOfHm0[j] = hm0; b4++; }
/*    */        }
/*  6 */     else { byte b3 = 1; hm0[] arrayOfHm0; int i; byte b4;
/*  7 */       for (i = (arrayOfHm0 = gp0.cl[b]).length, b4 = 0; b4 < b3; ) { int j; hm0 hm0 = arrayOfHm0[j = i - 1]; System.arraycopy(arrayOfHm0, 0, arrayOfHm0, 1, j); arrayOfHm0[0] = hm0; b4++; }  }  byte b2 = 0; hm0[] arrayOfHm02; while (b2 < (
/*  8 */       arrayOfHm02 = gp0.cl[b]).length) { hm0 hm0; if ((hm0 = arrayOfHm02[b2]) != null) { hm0
/*  9 */           .ws = (byte)b2;
/* 10 */         hm0.jI(); }  b2++; }
/* 11 */      Wl wl; if ((wl = km.wI0.K7) != null) { boolean bool1; if (b == gp0
/* 12 */         .hG0()) { bool1 = true; } else { bool1 = false; }  wl.zt0(bool1, bool); }
/* 13 */      K9(false);
/*    */ 
/*    */     
/* 16 */     hm0[] arrayOfHm01 = this.AD.cl[b]; byte b1 = 0; while (b1 < arrayOfHm01.length) {
/* 17 */       Hj hj = Oh(b, (byte)b1); hm0 hm0; if ((hm0 = arrayOfHm01[b1]) != null && 
/*    */         
/* 19 */         !hm0.K0.AL()) { hj
/* 20 */           .CX(true); hj.Cg0(arrayOfHm01[b1]); } else { hj.CX(false); }  b1++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public PF(y40 paramy40, kf paramkf, boolean paramBoolean) {}
/*    */   
/*    */   public final boolean Ie() {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final int zE() {
/*    */     return 7;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */