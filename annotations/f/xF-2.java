/*  1 */ package f;public final class xF extends SI { public final void IA(tH paramtH) { long l; if (this.yo + 30L < (l = zm0.u20)) { this
/*  2 */         .yo = l;
/*  3 */       if (this.y00)
/*  4 */       { int m; if ((m = this.gO) > 0) this.gO = m - 10;  } else { int m; if ((m = this.gO) < 50) this.gO = m + 10;  }  }  if (this.gO < 1) {
/*    */       return;
/*    */     }
/*    */     
/*  8 */     int j = (int)(km.wI0.iJ0.vD()).pp0.x / 64 * 64 + -64 - (int)(zm0.u20 / 60L % 64L);
/*    */     
/* 10 */     float f1 = this.gO / 255.0F; paramtH.HK0(Xc0.Com4.cpy().mul(1.0F, 1.0F, 1.0F, f1)); Texture texture; (texture = (iU.mH()).KZ.HA0()).setWrap(A00.OW, A00.OW); f1 = j; float f2 = ((int)(km.wI0.iJ0.vD()).pp0.y / 64 * 64 + -64);
/* 11 */     int i = (int)(km.wI0.iJ0.vD()).LW.x + 512;
/* 12 */     int k = (int)(km.wI0.iJ0.vD()).LW.y + 512;
/* 13 */     paramtH.oS(texture, f1, f2, 0, 0, i, k); paramtH.og0(Xc0.Nn0); if (this.rf + 2500L < 
/* 14 */       zm0.u20) { i = 0; while (i < this
/* 15 */         .rB.length) { if (xi0.qX(100) < 25) { C30 c30; kT kT; NC0 nC03; this
/*    */             
/* 17 */             .rf = zm0.u20; this.rB[i].getClass();
/*    */ 
/*    */ 
/*    */           
/* 21 */           this((iU.mH()).cA0[2]); C30[] arrayOfC30; (arrayOfC30 = new C30[1])[0] = c30;
/*    */           
/* 23 */           int n = xi0.A90(0, (int)(km.wI0.iJ0.vD()).s60.x); k = (int)(km.wI0.iJ0.vD()).s60.y; int m = xi0.A90(0, 4) * 250; float f4 = n; this(f4, k); this(f4, 0.0F); this(arrayOfC30, m, xi0.A90(1, 3) * 500, nC03, nC02);
/* 24 */           m = (int)Math.floor(Math.abs((new kT()).az.lS(kT.ev) / 5.0F)); float f3; NC0 nC01, nC02; (new kT()).Fa = ((nC01 = (new kT()).ev).x - (nC02 = kT.az).x) / (f3 = m); (new kT()).e9 = (nC01.y - nC02.y) / f3;
/* 25 */           (this.rB[i]).Ql.add(kT); }  i++; }  }  i = 0; oK0[] arrayOfOK0; while (i < (
/* 26 */       arrayOfOK0 = this.rB).length) { arrayOfOK0[i].Yo0(paramtH); i++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public long yo = zm0.zg();
/*    */   public long rf = zm0.zg();
/*    */   public oK0[] rB;
/*    */   public int gO = 0;
/*    */   
/*    */   public xF(yE0 paramyE0, boolean paramBoolean) {
/*    */     super(paramyE0, paramBoolean);
/*    */   }
/*    */   
/*    */   public final void Zq() {
/*    */     if (this.CH0) {
/*    */       b = 50;
/*    */     } else {
/*    */       b = 0;
/*    */     } 
/*    */     this.gO = b;
/*    */     this.rB = new oK0[3];
/*    */     oK0[] arrayOfOK0;
/*    */     for (byte b = 0; b < (arrayOfOK0 = this.rB).length; b++) {
/*    */       oK0 oK01;
/*    */       this();
/*    */       arrayOfOK0[b] = oK01;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */