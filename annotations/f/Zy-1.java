/*  1 */ package f;public final class Zy extends DB0 implements iq0 { public final eF0 BE0(eF0 parameF0, int paramInt1, int paramInt2, int paramInt3) { float f2 = paramInt1, f3 = paramInt2; NC0 nC02; (nC02 = this.Ox).x = f2; this.Ox
/*  2 */       .y = f3;
/*  3 */     this.MT.qD0(nC02); NC0 nC01;
/*  4 */     f3 = (nC01 = this.Ox).x; float f4 = this.Ox.y;
/*  5 */     nC01
/*  6 */       .x = f3;
/*  7 */     nC01.y = f4;
/*  8 */     this.KC.XD(nC01); float f1 = this.Ox.x; eF0 eF01; if ((eF01 = this.KC.QI0(f1, this.Ox.y, true)) == parameF0) return parameF0;  if (parameF0 != null)
/*    */     
/* 10 */     { iW
/* 11 */         .OC0 = this;
/*    */       NC0 nC0;
/* 13 */       iW.Aa0 = (nC0 = this.Ox).x;
/*    */       
/* 15 */       iW.coM4 = nC0.y;
/* 16 */       iW.W00 = paramInt3;
/*    */       
/* 18 */       iW.Dd0 = MV.lD0;
/* 19 */       iW.getClass();
/* 20 */       parameF0.kZ(iW); iW iW; Lp0.Lj0(iW = (iW)Lp0.vu0(iW.class).obtain()); }  if (eF01 != null)
/*    */     
/* 22 */     { iW
/* 23 */         .OC0 = this;
/*    */       NC0 nC0;
/* 25 */       iW.Aa0 = (nC0 = this.Ox).x;
/*    */       
/* 27 */       iW.coM4 = this.y;
/* 28 */       iW.W00 = paramInt3;
/*    */       
/* 30 */       iW.Dd0 = MV.LA0;
/* 31 */       iW.getClass();
/* 32 */       eF01.kZ(iW); iW iW; Lp0.Lj0(iW = (iW)Lp0.vu0(iW.class).obtain()); }  return eF01; }
/*    */ 
/*    */   
/*    */   public Ur0 MT;
/*    */   public final M30 Fv0;
/*    */   public boolean hC;
/*    */   public c KC;
/*    */   public final NC0 Ox = new NC0();
/*    */   public final eF0[] in = new eF0[20];
/*    */   public final boolean[] LA0 = new boolean[20];
/*    */   public final int[] OI0 = new int[20];
/*    */   public final int[] Ec0 = new int[20];
/*    */   public int Rp0;
/*    */   public int Mu0;
/*    */   public eF0 com5;
/*    */   public eF0 re;
/*    */   public eF0 S6;
/*    */   public final d10 Sq = new d10(true, 4, Wn.class);
/*    */   public boolean Pp = true;
/*    */   
/*    */   public Zy() {
/*    */     this(new Sp(QJ0.Ww, UB0.M60.fG0(), UB0.M60.dL(), new Tm()), new JX());
/*    */     this.hC = true;
/*    */   }
/*    */   
/*    */   public Zy(Ur0 paramUr0) {
/*    */     this();
/*    */     JX jX;
/*    */     this(paramUr0, this);
/*    */     this.hC = true;
/*    */   }
/*    */   
/*    */   public Zy(Ur0 paramUr0, M30 paramM30) {
/*    */     if (paramUr0 != null) {
/*    */       if (paramM30 != null) {
/*    */         this.MT = paramUr0;
/*    */         this.Fv0 = paramM30;
/*    */         this();
/*    */         this.KC = c1;
/*    */         c c1;
/*    */         (c1 = new c()).Vs(this);
/*    */         paramUr0.cOM2(UB0.M60.fG0(), UB0.M60.dL());
/*    */         return;
/*    */       } 
/*    */       throw new IllegalArgumentException("batch cannot be null.");
/*    */     } 
/*    */     throw new IllegalArgumentException("viewport cannot be null.");
/*    */   }
/*    */   
/*    */   public final boolean bD0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     Ur0 ur0;
/*    */     int j, k = (j = (ur0 = this.MT).G80) + ur0.QQ;
/*    */     int m = this.MT.Cn0;
/*    */     int i = m + ur0.o6;
/*    */     j = UB0.M60.dL() - 1 - paramInt2;
/*    */     if (paramInt1 >= j && paramInt1 < k && j >= m && j < i) {
/*    */       i = 1;
/*    */     } else {
/*    */       i = 0;
/*    */     } 
/*    */     if (i == 0)
/*    */       return false; 
/*    */     this.LA0[paramInt3] = true;
/*    */     this.OI0[paramInt3] = paramInt1;
/*    */     this.Ec0[paramInt3] = paramInt2;
/*    */     float f1 = paramInt1, f3 = paramInt2;
/*    */     NC0 nC02;
/*    */     (nC02 = this.Ox).x = f1;
/*    */     this.Ox.y = f3;
/*    */     this.MT.qD0(nC02);
/*    */     iW.Dd0 = MV.Va0;
/*    */     iW.OC0 = this;
/*    */     float f4 = nC01.x;
/*    */     NC0 nC01;
/*    */     float f5 = (nC01 = this.Ox).y;
/*    */     iW.W00 = paramInt3;
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).so = paramInt4;
/*    */     boolean bool = true;
/*    */     nC01.x = f4;
/*    */     nC01.y = f5;
/*    */     this.KC.XD(nC01);
/*    */     float f2 = this.Ox.x;
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.KC.QI0(f2, this.Ox.y, bool)) == null) {
/*    */       c c1;
/*    */       if ((c1 = this.KC).iG0 == i80.s0)
/*    */         kZ(iW); 
/*    */     } else {
/*    */       eF01.kZ(iW);
/*    */     } 
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean Xe(int paramInt1, int paramInt2, int paramInt3) {
/*    */     this.OI0[paramInt3] = paramInt1;
/*    */     this.Ec0[paramInt3] = paramInt2;
/*    */     this.Rp0 = paramInt1;
/*    */     this.Mu0 = paramInt2;
/*    */     if (this.Sq.Z8 == 0)
/*    */       return false; 
/*    */     float f1 = paramInt1, f2 = paramInt2;
/*    */     NC0 nC02;
/*    */     (nC02 = this.Ox).x = f1;
/*    */     this.Ox.y = f2;
/*    */     this.MT.qD0(nC02);
/*    */     iW.Dd0 = MV.tE0;
/*    */     iW.OC0 = this;
/*    */     NC0 nC01;
/*    */     iW.Aa0 = (nC01 = this.Ox).x;
/*    */     iW.coM4 = this.y;
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).W00 = paramInt3;
/*    */     d10 d101;
/*    */     Wn[] arrayOfWn;
/*    */     byte b;
/*    */     int i;
/*    */     for (arrayOfWn = (Wn[])(d101 = this.Sq).Jv0(), b = 0, i = this.Sq.Z8; b < i; ) {
/*    */       iW.l0 = wn.me0;
/*    */       iW.Kx = wn.tq;
/*    */       Wn wn;
/*    */       if ((wn = arrayOfWn[b]).Fa0 == paramInt3 && mB(wn, true) && wn.Ra.Qi0(iW))
/*    */         iW.Aj0 = true; 
/*    */       b++;
/*    */     } 
/*    */     At0();
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean Di(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     this.LA0[paramInt3] = false;
/*    */     this.OI0[paramInt3] = paramInt1;
/*    */     this.Ec0[paramInt3] = paramInt2;
/*    */     if (this.Sq.Z8 == 0)
/*    */       return false; 
/*    */     float f1 = paramInt1, f2 = paramInt2;
/*    */     NC0 nC02;
/*    */     (nC02 = this.Ox).x = f1;
/*    */     this.Ox.y = f2;
/*    */     this.MT.qD0(nC02);
/*    */     iW.Dd0 = MV.H7;
/*    */     iW.OC0 = this;
/*    */     NC0 nC01;
/*    */     iW.Aa0 = (nC01 = this.Ox).x;
/*    */     iW.coM4 = this.y;
/*    */     iW.W00 = paramInt3;
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).so = paramInt4;
/*    */     d10 d101;
/*    */     Wn[] arrayOfWn;
/*    */     byte b;
/*    */     int i;
/*    */     for (arrayOfWn = (Wn[])(d101 = this.Sq).Jv0(), b = 0, i = this.Sq.Z8; b < i; ) {
/*    */       Wn wn;
/*    */       if ((wn = arrayOfWn[b]).Fa0 == paramInt3 && wn.yB == paramInt4 && Ct(wn, true)) {
/*    */         iW.l0 = wn.me0;
/*    */         iW.Kx = wn.tq;
/*    */         if (wn.Ra.Qi0(iW))
/*    */           iW.Aj0 = true; 
/*    */         Lp0.Lj0(wn);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     At0();
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean x80(int paramInt1, int paramInt2) {
/*    */     this.Rp0 = paramInt1;
/*    */     this.Mu0 = paramInt2;
/*    */     Ur0 ur0;
/*    */     int j, k = (j = (ur0 = this.MT).G80) + ur0.QQ;
/*    */     int m = this.MT.Cn0;
/*    */     int i = m + ur0.o6;
/*    */     j = UB0.M60.dL() - 1 - paramInt2;
/*    */     if (paramInt1 >= j && paramInt1 < k && j >= m && j < i) {
/*    */       i = 1;
/*    */     } else {
/*    */       i = 0;
/*    */     } 
/*    */     if (i == 0)
/*    */       return false; 
/*    */     float f1 = paramInt1, f3 = paramInt2;
/*    */     NC0 nC02;
/*    */     (nC02 = this.Ox).x = f1;
/*    */     this.Ox.y = f3;
/*    */     this.MT.qD0(nC02);
/*    */     iW.OC0 = this;
/*    */     iW.Dd0 = MV.NI0;
/*    */     float f4 = nC01.x;
/*    */     iW iW;
/*    */     NC0 nC01;
/*    */     float f5 = (nC01 = this.Ox).y;
/*    */     k = 1;
/*    */     nC01.x = f4;
/*    */     nC01.y = f5;
/*    */     this.KC.XD(nC01);
/*    */     float f2 = this.Ox.x;
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.KC.QI0(f2, this.Ox.y, k)) == null)
/*    */       eF01 = this.KC; 
/*    */     eF01.kZ(iW);
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean kG0(float paramFloat1, float paramFloat2) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.S6) == null)
/*    */       eF01 = this.KC; 
/*    */     float f = this.Mu0;
/*    */     NC0 nC02;
/*    */     (nC02 = this.Ox).x = this.Rp0;
/*    */     this.Ox.y = f;
/*    */     this.MT.qD0(nC02);
/*    */     iW.OC0 = this;
/*    */     iW.Dd0 = MV.EW;
/*    */     iW.Db = paramFloat1;
/*    */     iW.NQ = paramFloat2;
/*    */     NC0 nC01;
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).Aa0 = (nC01 = this.Ox).x;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).coM4 = this.y;
/*    */     eF01.kZ((iW)Lp0.vu0(iW.class).obtain());
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean Zp0(int paramInt) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.re) == null)
/*    */       eF01 = this.KC; 
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).OC0 = this;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).Dd0 = MV.rx;
/*    */     eF01.kZ((iW)Lp0.vu0(iW.class).obtain());
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean XM(int paramInt) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.re) == null)
/*    */       eF01 = this.KC; 
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).OC0 = this;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).Dd0 = MV.AY;
/*    */     eF01.kZ((iW)Lp0.vu0(iW.class).obtain());
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final boolean d70(char paramChar) {
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.re) == null)
/*    */       eF01 = this.KC; 
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).OC0 = this;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).Dd0 = MV.zV;
/*    */     eF01.kZ((iW)Lp0.vu0(iW.class).obtain());
/*    */     Lp0.Lj0(iW);
/*    */     return iW.Aj0;
/*    */   }
/*    */   
/*    */   public final void fL0(eF0 parameF0) {
/*    */     iW iW;
/*    */     d10 d101;
/*    */     Wn[] arrayOfWn;
/*    */     byte b;
/*    */     int i;
/*    */     for (iW = null, arrayOfWn = (Wn[])(d101 = this.Sq).Jv0(), b = 0, i = this.Sq.Z8; b < i; ) {
/*    */       Wn wn;
/*    */       if ((wn = arrayOfWn[b]).tq == parameF0 && d101.Ct(wn, true)) {
/*    */         if (iW == null) {
/*    */           (iW = (iW)Lp0.vu0(iW.class).obtain()).OC0 = this;
/*    */           ((iW)Lp0.vu0(iW.class).obtain()).Dd0 = MV.H7;
/*    */           ((iW)Lp0.vu0(iW.class).obtain()).Aa0 = -2.14748365E9F;
/*    */           ((iW)Lp0.vu0(iW.class).obtain()).coM4 = -2.14748365E9F;
/*    */         } 
/*    */         iW.l0 = wn.me0;
/*    */         iW.Kx = wn.tq;
/*    */         iW.W00 = wn.Fa0;
/*    */         iW.so = wn.yB;
/*    */         wn.Ra.Qi0(iW);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     d101.At0();
/*    */     if (iW != null)
/*    */       Lp0.Lj0(iW); 
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.S6) != null)
/*    */       if (parameF0 != null) {
/*    */         boolean bool;
/*    */         while (true) {
/*    */           boolean bool1;
/*    */           if (eF01 == parameF0) {
/*    */             bool1 = true;
/*    */             break;
/*    */           } 
/*    */           c c1;
/*    */           if ((c1 = bool1.rK0) == null) {
/*    */             bool = false;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */         if (bool)
/*    */           JL0(null); 
/*    */       } else {
/*    */         throw new IllegalArgumentException("actor cannot be null.");
/*    */       }  
/*    */     if ((eF01 = this.re) != null)
/*    */       if (parameF0 != null) {
/*    */         boolean bool;
/*    */         while (true) {
/*    */           if (eF01 == parameF0) {
/*    */             bool = true;
/*    */             break;
/*    */           } 
/*    */           if ((eF01 = eF01.rK0) == null) {
/*    */             bool = false;
/*    */             break;
/*    */           } 
/*    */         } 
/*    */         eF0 eF02 = null;
/*    */         if (bool && this.re != null) {
/*    */           SZ sZ;
/*    */           (sZ = (SZ)Lp0.vu0(SZ.class).obtain()).OC0 = this;
/*    */           eF0 eF03;
/*    */           if ((eF03 = this.re) != null)
/*    */             eF03.kZ(sZ); 
/*    */           this.re = eF02;
/*    */           Lp0.Lj0(sZ);
/*    */         } 
/*    */       } else {
/*    */         throw new IllegalArgumentException("actor cannot be null.");
/*    */       }  
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     JL0(null);
/*    */     eF0 eF01 = null;
/*    */     if (this.re != null) {
/*    */       SZ sZ;
/*    */       (sZ = (SZ)Lp0.vu0(SZ.class).obtain()).OC0 = this;
/*    */       eF0 eF02;
/*    */       if ((eF02 = this.re) != null)
/*    */         eF02.kZ(sZ); 
/*    */       this.re = eF01;
/*    */       Lp0.Lj0(sZ);
/*    */     } 
/*    */     yn0(null, null);
/*    */     for (int i = (eF01 = this.KC).AG0.Z8 - 1; i >= 0; ) {
/*    */       eF0 eF02 = null;
/*    */       u60 u60;
/*    */       if ((u60 = (u60)eF01.AG0.get(i)).DX == null)
/*    */         u60.DX = eF02; 
/*    */       i--;
/*    */     } 
/*    */     eF01.AG0.clear();
/*    */     eF01.kS.clear();
/*    */     eF01.Zg.clear();
/*    */     eF0[] arrayOfEF0;
/*    */     byte b;
/*    */     int j;
/*    */     for (arrayOfEF0 = (eF0[])((c)eF01).sl0.Jv0(), b = 0, j = ((c)eF01).sl0.Z8; b < j; ) {
/*    */       eF0 eF02 = arrayOfEF0[b];
/*    */       Zy zy;
/*    */       if ((zy = eF01.ih0) != null)
/*    */         zy.fL0(eF02); 
/*    */       eF02.Vs(null);
/*    */       eF02.rK0 = null;
/*    */       b++;
/*    */     } 
/*    */     ((c)eF01).sl0.At0();
/*    */     ((c)eF01).sl0.clear();
/*    */     if (this.hC)
/*    */       ((JX)this.Fv0).dispose(); 
/*    */   }
/*    */   
/*    */   public final void yn0(gu paramgu, eF0 parameF0) {
/*    */     iW iW;
/*    */     (iW = (iW)Lp0.vu0(iW.class).obtain()).OC0 = this;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).Dd0 = MV.H7;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).Aa0 = -2.14748365E9F;
/*    */     ((iW)Lp0.vu0(iW.class).obtain()).coM4 = -2.14748365E9F;
/*    */     d10 d101;
/*    */     Wn[] arrayOfWn;
/*    */     byte b;
/*    */     int i;
/*    */     for (arrayOfWn = (Wn[])(d101 = this.Sq).Jv0(), b = 0, i = this.Sq.Z8; b < i; ) {
/*    */       Wn wn;
/*    */       if (((wn = arrayOfWn[b]).Ra != paramgu || wn.tq != parameF0) && Ct(wn, true)) {
/*    */         iW.l0 = wn.me0;
/*    */         iW.Kx = wn.tq;
/*    */         iW.W00 = wn.Fa0;
/*    */         iW.so = wn.yB;
/*    */         wn.Ra.Qi0(iW);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     At0();
/*    */     Lp0.Lj0(iW);
/*    */   }
/*    */   
/*    */   public final void JL0(S60 paramS60) {
/*    */     if (this.S6 == paramS60)
/*    */       return; 
/*    */     SZ sZ;
/*    */     (sZ = (SZ)Lp0.vu0(SZ.class).obtain()).OC0 = this;
/*    */     eF0 eF01;
/*    */     if ((eF01 = this.S6) != null)
/*    */       eF01.kZ(sZ); 
/*    */     this.S6 = paramS60;
/*    */     if (paramS60 != null)
/*    */       paramS60.kZ(sZ); 
/*    */     Lp0.Lj0(sZ);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Zy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */