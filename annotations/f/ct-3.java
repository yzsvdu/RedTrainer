/*  1 */ package f;public final class ct extends Kl0 { public hm0[][] vy0; public ct(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { byte b; this
/*  2 */       .vy0 = new hm0[b = this.Ws.get()][]; Gp0 gp0; if ((gp0 = km.MR) == null)
/*  3 */       return;  R00 r00 = gp0.q20; byte b1;
/*  4 */     for (hR[] arrayOfHR = gp0.de0; b1 < b; ) { if (gp0
/*  5 */         .wB(b1) != null)
/*  6 */       { byte b2 = this.Ws.get(); int i;
/*  7 */         for (this.vy0[b1] = new hm0[b2], i = 0; i < b2; )
/*  8 */         { int j; if ((j = this.Ws.getInt()) != 0)
/*    */           { hm0 hm02;
/* 10 */             short s1 = this.Ws.getShort();
/* 11 */             byte b3 = this.Ws.get();
/* 12 */             String str = au();
/* 13 */             byte b4 = this.Ws.get(), b5 = this.Ws.get(), b6 = this.Ws.get();
/* 14 */             short s2 = this.Ws.getShort();
/* 15 */             byte b7 = this.Ws.get();
/* 16 */             mA mA = mA.qq(this.Ws.get());
/* 17 */             short s3 = this.Ws.getShort(), s4 = this.Ws.getShort();
/* 18 */             byte b8 = this.Ws.get(), b9 = this.Ws.get();
/* 19 */             this(b1, i, j, s1, b3, str, b4, b5, b6, s2, b7, mA, s3, s4, b8, b9); this.vy0[b1][i] = hm02; hm0 hm01 = this.vy0[b1][i];
/*    */ 
/*    */             
/* 22 */             if (!(hm01.El0 = gp0.rx.cF(i))) { hm01
/* 23 */                 .Nd0(); } else { hm01.xz0(); }  }  i = (byte)(i + 1); }  for (b2 = 0; b2 < 6; )
/*    */         
/* 25 */         { cOm4 cOm4 = gp0.iC0(b1, b2, i); if ((i = this.Ws.getInt()) == 0 || i == -1 || i == -2)
/*    */           
/*    */           { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 55 */             cOm4
/* 56 */               .k60 = (byte)i; } else { jd0 jd0; byte b3; short s1 = this.Ws.getShort(); byte b4 = this.Ws.get(); String str = au(); byte b5 = this.Ws.get(), b6 = this.Ws.get(); short s2 = this.Ws.getShort(), s3 = this.Ws.getShort(), s4 = this.Ws.getShort(); byte b7 = this.Ws.get(); hm0 hm01 = null; hm0[] arrayOfHm0; int j; byte b8; for (j = (arrayOfHm0 = this.vy0[b1]).length, b8 = 0; b8 < j; ) { hm0 hm02; if ((hm02 = arrayOfHm0[b8]) != null && hm02.ih() == i) { hm01 = hm02; break; }  b8++; }  if (hm01 != null) { b3 = jd0.ta.eH; s1 = jd0.y6; s2 = hm01.oi(); mA mA = hm01.K0.M6; (jd0 = hm01.K0).nH(s1, b4, str, b3, b5, b6, s1, s2, mA, s3, s4, b7); hm01.k8(cOm4); } else { this(jd0); b3.gc = jd01; b3.k60 = 1; jd0 jd01; (jd01 = new jd0()).sm = b3; mA mA = mA.uZ; b3.gc.nH(s1, b4, str, (byte)0, b5, b6, s2, (byte)0, mA, s3, s4, b7); b3.k60 = 1; b3.gc.sm = b3; jd0 = jd01; }  if (r00 != null && arrayOfHR.length > 0) { int k = arrayOfHR.length; s1 = 0; while (true) { if (s1 < k) { hR hR = arrayOfHR[s1]; int m; if ((m = r00.ordinal()) != 0) if (m != 1) { if (m != 2) throw new UnsupportedOperationException("");  } else { short[] arrayOfShort1; (arrayOfShort1 = new short[1])[0] = this.Ws.getShort(); jd0.Zf.put(hR, arrayOfShort1); s1++; }   arrayOfShort[0] = this.Ws.getShort(); short[] arrayOfShort; (arrayOfShort = new short[2])[1] = this.Ws.getShort(); jd0.Zf.put(hR, arrayOfShort); } else { break; }  s1++; }  }  }  b2 = (byte)(b2 + 1); }  }  b1 = (byte)(b1 + 1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void Cx() {
/*    */     Gp0 gp0 = km.MR;
/*    */     Wl wl;
/*    */     if ((wl = km.wI0.K7) == null)
/*    */       return; 
/*    */     kf kf = wl.LW;
/*    */     if (gp0 == null || kf == null || !gp0.Ja.fQ)
/*    */       return; 
/*    */     hm0[][] arrayOfHm0 = this.vy0;
/*    */     if (gp0.cl != null) {
/*    */       byte b1;
/*    */       for (b1 = 0; b1 < gp0.cl.length; ) {
/*    */         byte b2;
/*    */         hm0[] arrayOfHm01;
/*    */         for (b2 = 0; b2 < (arrayOfHm01 = gp0.cl[b1]).length; ) {
/*    */           hm0 hm01;
/*    */           if ((hm01 = arrayOfHm01[b2]) != null)
/*    */             hm01.lG0(); 
/*    */           b2 = (byte)(b2 + 1);
/*    */         } 
/*    */         b1 = (byte)(b1 + 1);
/*    */       } 
/*    */     } 
/*    */     gp0.cl = this;
/*    */     gp0.Ja = Mn.YI;
/*    */     eq0 eq0;
/*    */     if ((eq0 = gp0.CJ0) != null) {
/*    */       boolean bool;
/*    */       if (bool = this.wm0) {
/*    */         if (!bool) {
/*    */           RuntimeException runtimeException;
/*    */           this();
/*    */           eq0.LPT9.error("Attempt to stop timer which is not running.", runtimeException);
/*    */         } 
/*    */         this.wm0 = false;
/*    */       } 
/*    */       gp0.CJ0 = null;
/*    */     } 
/*    */     gp0.kS();
/*    */     wl.AJ0 = No0.jw;
/*    */     byte b = 0;
/*    */     while (b < kf.Js.length) {
/*    */       Hj[] arrayOfHj;
/*    */       for (byte b1 = 0; b1 < (arrayOfHj = kf.Js[b]).length; ) {
/*    */         arrayOfHj[b1].CX(false);
/*    */         b1 = (byte)(b1 + 1);
/*    */       } 
/*    */       cOm4[] arrayOfCOm4;
/*    */       int i;
/*    */       byte b2;
/*    */       for (i = (arrayOfCOm4 = kf.AD.Xt0(b)).length, b2 = 0; b2 < i; ) {
/*    */         kf.DQ(arrayOfCOm4[b2]);
/*    */         b2++;
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */     kf.r50();
/*    */     kf.Lq0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */