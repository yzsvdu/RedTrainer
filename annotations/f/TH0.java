/*  1 */ package f;public final class TH0 implements Xo0 { public final Bu0[] HT; public TH0() { this((Bu0)null, (Bu0)null, (Bu0)null, (Bu0)null, (Bu0)null, (Bu0)null); } public TH0(RD0 paramRD01, RD0 paramRD02, RD0 paramRD03, RD0 paramRD04, RD0 paramRD05, RD0 paramRD06) { this(this, bu02, bu03, bu04, bu05, bu06); } public TH0(RD0 paramRD01, RD0 paramRD02, RD0 paramRD03, RD0 paramRD04, RD0 paramRD05, RD0 paramRD06, boolean paramBoolean) { this(this, bu02, bu03, bu04, bu05, bu06); } public TH0(ZH paramZH1, ZH paramZH2, ZH paramZH3, ZH paramZH4, ZH paramZH5, ZH paramZH6) { this(paramZH1, paramZH2, paramZH3, paramZH4, paramZH5, paramZH6, false); } public final void zr0() { byte b = 0; while (true) { Bu0[] arrayOfBu0; if (b < (arrayOfBu0 = this.HT).length) { if (arrayOfBu0[b] == null) { b = 0; break; }  b++; continue; }  b = 1; break; }  if (b != 0) { b = 0; Bu0[] arrayOfBu0; while (b < (
/*  2 */         arrayOfBu0 = this.HT).length) { if (!arrayOfBu0[b].aF0()) this.HT[b].zr0();  b++; }  return; }  throw new JU("You need to complete your cubemap data before using it"); } public TH0(ZH paramZH1, ZH paramZH2, ZH paramZH3, ZH paramZH4, ZH paramZH5, ZH paramZH6, boolean paramBoolean) { this(aB1, aB2, aB3, aB4, aB5, aB6); } public TH0(int paramInt1, int paramInt2, int paramInt3, Uc paramUc) { this(paramInt3, paramInt2, paramUc); AB aB1; AB aB2; ZH zH1; AB aB3; ZH zH2; AB aB4; ZH zH3; AB aB5; ZH zH4; AB aB6; ZH zH5; this(zH1, null, false, true); this(paramInt3, paramInt2, paramUc); this(zH2, null, false, true); this(paramInt1, paramInt3, paramUc); this(zH3, null, false, true); this(paramInt1, paramInt3, paramUc); this(zH4, null, false, true); this(paramInt1, paramInt2, paramUc); this(zH4, null, false, true); this(paramInt1, paramInt2, paramUc); this(zH5, null, false, true); this(this, aB3, aB4, aB5, aB2, aB6); } public TH0(Bu0 paramBu01, Bu0 paramBu02, Bu0 paramBu03, Bu0 paramBu04, Bu0 paramBu05, Bu0 paramBu06) { (this.HT = new Bu0[6])[0] = paramBu01; (new Bu0[6])[1] = paramBu02; (new Bu0[6])[2] = paramBu03; (new Bu0[6])[3] = paramBu04; (new Bu0[6])[4] = paramBu05; (new Bu0[6])[5] = paramBu06; } public final boolean k50() { Bu0[] arrayOfBu0; int i = (arrayOfBu0 = this.HT).length; for (byte b = 0; b < i; b++) { if (!this[b].k50()) return false;  }  return true; } public final boolean aF0() { return false; } public final void QI() { Bu0[] arrayOfBu0; for (byte b = 0; b < (arrayOfBu0 = this.HT).length; ) { if (arrayOfBu0[b].getType() == EL.Lu0) { this.HT[b].pk0(b + 34069); } else { ZH zH = this.HT[b].Jw(); int i = this.HT[b].zb(); if (this.HT[b].getFormat() != zH.TU()) { ZH zH1; int i2 = zH.Con.ju;
/*  3 */           int i3 = zH.Con.Og0;
/*  4 */           this(i2, i3, this.HT[b].getFormat()); (new ZH()).r1(y1.Zj); i2 = 0; i3 = 0; boolean bool1 = false, bool2 = false;
/*  5 */           Gdx2DPixmap gdx2DPixmap = zH.Con;
/*  6 */           int i4 = gdx2DPixmap.ju;
/*  7 */           int i5 = gdx2DPixmap.Og0;
/*  8 */           zH1.Con.nM(gdx2DPixmap, bool1, bool2, i2, i3, i4, i5);
/*  9 */           if (this.HT[b].zb()) zH.dispose();  byte b1 = 1; zH = zH1; }  UB0.go.glPixelStorei(3317, 1); i = b + 34069; boolean bool = false; int j = zH.PB();
/*    */         
/* 11 */         int k = zH.Con.ju;
/* 12 */         int m = zH.Con.Og0;
/* 13 */         int n = zH.qf(), i1 = zH.i5(); ByteBuffer byteBuffer = zH.tp0(); UB0.go.glTexImage2D(i, bool, j, k, m, 0, n, i1, byteBuffer); if (i != 0) zH.dispose();  }  b++; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TH0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */