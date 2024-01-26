/*  1 */ package f;public final class g extends oF0 { public final synchronized cx0 EI0(String paramString, ZH paramZH) { if (paramZH == null) { this.v8.add(new qr()); return on; }  if (this.d) return null; 
/*  2 */     float f1 = paramZH.Con.ju;
/*  3 */     float f2 = paramZH.Con.Og0;
/*  4 */     this(0.0F, 0.0F, f1, f2); cx0 cx01;
/*  5 */     if ((new cx0()).af <= this
/*  6 */       .ts0 && cx01
/*  7 */       .sf0 <= this
/*  8 */       .WW) { jk0 jk0 = this.g8.sF0(this, cx01); int i = (int)cx01.dA, j = (int)cx01.zA0, k = (int)cx01.af, m = (int)cx01.sf0; Texture texture; if (this.GH0 && !this.p80 && (texture = jk0.MO) != null && !jk0.as) { texture.bind(); int n = ((zp)jk0.MO).glTarget, i1 = paramZH.qf(), i2 = paramZH.i5(); ByteBuffer byteBuffer = paramZH.tp0(); UB0.go.glTexSubImage2D(n, 0, i, j, k, m, i1, i2, byteBuffer); } else { jk0.as = true; }  jk0.Af0.r1(y1.Zj); jk0.Af0.fL(paramZH, i, j); if (this.p80)
/*    */       { Gdx2DPixmap gdx2DPixmap;
/* 10 */         int n = (gdx2DPixmap = paramZH.Con).ju;
/*    */         
/* 12 */         ZH zH2 = jk0.Af0; int i3 = i - 1, i4 = j - 1; zH2
/* 13 */           .Con
/* 14 */           .fj(gdx2DPixmap, 0, 0, 1, 1, i3, i4, 1, 1);
/* 15 */         ZH zH1 = jk0.Af0; int i2 = n - 1, i5 = i + k; zH1
/* 16 */           .Con
/* 17 */           .fj(paramZH.Con, i2, 0, 1, 1, i5, i4, 1, 1);
/* 18 */         zH1 = jk0.Af0; int i1, i6 = (i1 = paramZH.Con.Og0) - 1, i7 = j + m; zH1
/* 19 */           .Con
/* 20 */           .fj(paramZH.Con, 0, i6, 1, 1, i3, i7, 1, 1);
/* 21 */         jk0.Af0
/* 22 */           .Con
/* 23 */           .fj(paramZH.Con, i2, i6, 1, 1, i5, i7, 1, 1);
/* 24 */         jk0.Af0
/* 25 */           .Con
/* 26 */           .fj(paramZH.Con, 0, 0, n, 1, i, i4, k, 1);
/* 27 */         jk0.Af0
/* 28 */           .Con
/* 29 */           .fj(paramZH.Con, 0, i6, n, 1, i, i7, k, 1);
/* 30 */         jk0.Af0
/* 31 */           .Con
/* 32 */           .fj(paramZH.Con, 0, 0, 1, i1, i3, j, 1, m);
/* 33 */         jk0.Af0
/* 34 */           .Con
/* 35 */           .fj(paramZH.Con, i2, 0, 1, i1, i5, j, 1, m); }  this
/* 36 */         .v8.add(new qr(jk0, i, j, k, m)); return cx01; }  throw new JU("Page size too small for pixmap."); }
/*    */ 
/*    */   
/*    */   public static final cx0 on = new cx0();
/*    */   public ArrayDeque v8;
/*    */   
/*    */   public g(int paramInt1, int paramInt2, Uc paramUc, int paramInt3, boolean paramBoolean) {
/*    */     this();
/*    */     bw0 bw0;
/*    */     this(paramInt1, paramInt2, paramUc, paramInt3, paramBoolean, this);
/*    */   }
/*    */   
/*    */   public g(int paramInt1, int paramInt2, Uc paramUc, int paramInt3, boolean paramBoolean, eB0 parameB0) {
/*    */     super(paramInt1, paramInt2, paramUc, paramInt3, paramBoolean, parameB0);
/*    */     ArrayDeque arrayDeque;
/*    */     this(1024);
/*    */     this.v8 = this;
/*    */   }
/*    */   
/*    */   public final pe0 Fm0() {
/*    */     qr qr;
/*    */     if ((qr = this.v8.poll()).Kq0)
/*    */       return null; 
/*    */     Texture texture = this.E80.MO;
/*    */     int i = this.F7, j = this.ct0, k = this.ff0, m = this.rv0;
/*    */     return new pe0(this, i, j, k, m);
/*    */   }
/*    */   
/*    */   public final synchronized void dispose() {
/*    */     super.dispose();
/*    */     Hc0 hc0 = this.dA.r30();
/*    */     while (hasNext()) {
/*    */       Texture texture;
/*    */       if ((texture = ((jk0)next()).MO) != null)
/*    */         texture.dispose(); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */