/* 1 */ package f;public final class COm6 extends SI { public final void IA(tH paramtH) { MC[] arrayOfMC; int i; byte b; for (i = (arrayOfMC = this.QK).length, b = 0; b < i; ) { MC mC; if (!(mC = this[b]).nO) { Texture texture; long l; if (mC
/* 2 */           .pe0 + mC.QT.X9 < (
/* 3 */           l = zm0.u20)) { mC
/* 4 */             .pe0 = l; int k; if ((k = mC.ie0) > mC.Dt0) { mC.ie0 = k - 1; mC.zW += 3; } else if ((k = mC.oa) != 0) { if (k != 1) { if (k == 2 && ++mC.n7 > 8) { mC.n7 = 0; mC.oa = 1; }  } else if (++mC.n7 > 8) { mC.n7 = 0; mC.oa = 0; }  } else if (++mC.n7 > 8) { mC.n7 = 0; mC.Of(false); }  }  interface interface = interface.ZZ(); int j; if ((j = mC.oa) < 0 || j > 3) j = 0;  Texture[] arrayOfTexture;
/* 5 */         if ((arrayOfTexture = interface.d5).length <= (
/* 6 */           j += 3)) { texture = interface.xo; } else { texture = arrayOfTexture[j]; }
/* 7 */          float f = mC.ie0; paramtH.VI(texture, f, mC.zW); }  b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public MC[] QK;
/*   */   public int X9;
/*   */   
/*   */   public COm6(yE0 paramyE0, boolean paramBoolean) {
/*   */     super(paramyE0, paramBoolean);
/*   */   }
/*   */   
/*   */   public final void Zq() {
/*   */     this.X9 = 18;
/*   */     this.QK = new MC[80];
/*   */     MC[] arrayOfMC;
/*   */     for (byte b = 0; b < (arrayOfMC = this.QK).length; b++) {
/*   */       MC mC;
/*   */       this(this);
/*   */       arrayOfMC[b] = mC;
/*   */       this.QK[b].Of(this.CH0);
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/COm6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */