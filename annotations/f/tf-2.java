/*  1 */ package f;public final class tf extends dw { public boolean fn = false; public j40 LPT7; public oq cM; public UA0 tz0 = null; public final void Al(nf paramnf, Ih0 paramIh0) { if (this.cM != null) { UA0 uA0; if ((uA0 = this.tz0) != null) UB0.Kg0.fN(uA0);  eo eo1; (eo1 = paramIh0.I70).getClass();
/*  2 */       eo1 = (new eo(eo1)).Tz(-0.14F, 0.45F, 0.0F);
/*  3 */       eo2
/*  4 */         .getClass();
/*  5 */       float f1 = eo1.x, f2 = eo1.y, f3 = eo1.z; eo eo2; (eo2 = this.cM.PL).TG0(f1, f2, f3);
/*  6 */       this.cM.Ka0 = false;
/*  7 */       this.cM.m20(0.025F / this.Pu0); this.cM
/*    */         
/*  9 */         .m40(); paramnf.Zx(this.cM); }  }
/* 10 */   public Bw[] com6 = null; public int Pu0 = 1; public tf(j40 paramj40) { super(0); this.LPT7 = paramj40; } public final void dispose() { UA0 uA0; if ((uA0 = this.tz0) != null) uA0.dispose();  Bw[] arrayOfBw; if ((arrayOfBw = this.com6) != null) { int i = arrayOfBw.length; for (byte b = 0; b < i; b++) arrayOfBw[b].gH0(this);  this.com6 = null; }  } public final void Yo0(JX paramJX) { if (!this.fn) JK();  super.Yo0(paramJX); } public final dw JK() { short s = this.LPT7.Zs.Vf0(); if (um0.Kt0.rE0(this.LPT7.s5(), s, false, this.LPT7.Zs.tm0())) { s = this.LPT7.Zs.Vf0(); zh0[] arrayOfZh0; int i; pe0[] arrayOfPe0;
/*    */       byte b;
/* 12 */       for (this.com6 = (Bw[])arrayOfZh0, arrayOfPe0 = new pe0[i = (arrayOfZh0 = um0.Kt0.H9(this.LPT7.s5(), s, false, this.LPT7.Zs.tm0())).length], b = 0; b < i; ) { arrayOfPe0[b] = arrayOfZh0[b].Uu0(); arrayOfZh0[b].lu(this); b++; }
/* 13 */        this(); oq2.OK = new float[28]; (oq2.fd = new R30(0.2F, (Object[])arrayOfPe0))
/* 14 */         .sI = Qb.RW; oq oq2;
/* 15 */       (oq2 = new oq()).rv0(arrayOfPe0[0]);
/* 16 */       (new oq()).PQ.rb0 = 770; (new oq()).PQ.X50 = 771; pe0 pe0;
/* 17 */       (new oq()).TC
/*    */         
/* 19 */         .x = (pe0 = arrayOfPe0[0]).H0;
/*    */       
/* 21 */       (new oq()).TC.y = pe0.Vn0; (new oq()).m20(0.01F); (new oq()).Lx(1.0F, 1.0F, 1.0F, 1.0F);
/* 22 */       this.cM = new oq();
/*    */ 
/*    */ 
/*    */       
/* 26 */       short s1 = this.LPT7.Zs.Vf0();
/*    */       
/* 28 */       if (um0.Kt0.F7(this.LPT7.s5(), s1, false, this.LPT7.Zs.tm0()))
/*    */       
/*    */       { 
/*    */         
/* 32 */         s1 = this.LPT7.Zs.Vf0();
/*    */         int[] arrayOfInt;
/* 34 */         if ((arrayOfInt = um0.Kt0.Hr(this.LPT7.s5(), s1, false, this.LPT7.Zs.tm0())) != null && arrayOfInt[0] > 0) { int j; for (i = 0, j = arrayOfInt.length, b = 0; b < j; ) { i += arrayOfInt[b]; b++; }  float f1 = (i / arrayOfInt.length) / 1000.0F; R30 r301;
/* 35 */           if ((r301 = this.cM.fd) != null) { r301
/* 36 */               .aB = f1; r301.Bs.length; }  }
/* 37 */         else { float f1 = 0.05F; R30 r301;
/* 38 */           if ((r301 = this.cM.fd) != null) { r301
/* 39 */               .aB = f1; r301.Bs.length; }
/*    */            }
/* 41 */          R30 r30; if ((r30 = this.cM.fd) != null) r30
/*    */             
/* 43 */             .sI = Qb.RW;  }  } else { this
/* 44 */         .Pu0 = 2;
/*    */ 
/*    */ 
/*    */       
/* 48 */       s = this.LPT7.Zs.Vf0();
/*    */       
/* 50 */       this.tz0 = uA0; UA0 uA0; (uA0 = um0.Kt0.vt(this.LPT7.s5(), s, false, this.LPT7.Zs.tm0())).Zz(this.Pu0); this.cM = oq.wU(this.tz0.OB0()); }  this.cM.qf0(0.0F, 1.0F, 0.0F); this
/* 51 */       .Hl0
/* 52 */       .set(Color.CLEAR); float f = Color.CLEAR.toFloatBits(); oq oq1; (oq1 = this.cM).OK[3] = f; (oq1 = this.cM).OK[10] = f; (oq1 = this.cM).OK[17] = f; (oq1 = this.cM).OK[24] = f;
/* 53 */     this.AK0 = 1000000000;
/* 54 */     this.fn = true;
/*    */     return this; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */