/*  1 */ package f;public final class r30 extends Wl { public C30[] o6; public C30 jv; public C30[] Va; public C30 Y30; public C30 Cb; public C30 Nq; public final void hY() { int i = UB0.M60.fG0(), k = (i - 800) / 2; float f3 = '̠' * 0.33333334F, f4 = 'Ő' * 0.33333334F; this.a80 = new cx0(0.0F, 0.0F, f3, f4); float f1 = i, f2 = j; (this.fk = new Tm(f1, f2)).nUl = 0.33333334F; (new Tm(f1, f2)).Wt(f1, f2, true); Tm tm = this.fk; f2 = (k * -1) * 0.33333334F; int j; f3 = (((j = UB0.M60.dL()) - 500) / 4 * -1) * 0.33333334F; tm.H
/*  2 */       .Tz(f2, f3, 0.0F);
/*  3 */     this.fk
/*  4 */       .UX(true);
/*  5 */     this.yn0.d60(this.fk.VD0); } public y6 Tw; public final qq0 rx0; public mJ u40; public cx0 a80; public final Matrix4 Zn; public r30(Gp0 paramGp0, qq0 paramqq0) { super(paramqq0, paramGp0); Matrix4 matrix4; this(); this.Zn = this; this.rx0 = paramqq0; } public final void CH() { cx0 cx01; Matrix4 matrix4 = this.yn0.q0; cx0 cx02 = this.a80, cx03 = this.gt; float f1 = UB0.M60.fG0(), f2 = UB0.M60.dL(); Ye0.V5(this.fk, 0.0F, 0.0F, f1, f2, matrix4, cx02, cx03); Ye0.lf0(this.gt); this.yn0.getClass(); this.yn0.Tx(); if (this.rx0
/*  6 */       .b7 >= 0)
/*  7 */     { int i = UB0.M60.fG0(), k = (i - 720) / 2; float f5 = 'ː' * 0.33333334F; f1 = 'Ǡ' * 0.33333334F; this.a80 = new cx0(0.0F, 0.0F, f5, f1); float f3 = i, f4 = j; (this.fk = new Tm(f3, f4)).nUl = 0.33333334F; (new Tm(f3, f4)).Wt(f3, f4, true); Tm tm = this.fk; f4 = (k * -1) * 0.33333334F; int j; f5 = (((j = UB0.M60.dL()) - 500) / 4 * -1) * 0.33333334F; tm
/*  8 */         .H
/*  9 */         .Tz(f4, f5, 0.0F);
/* 10 */       this.fk
/* 11 */         .UX(true);
/* 12 */       this.yn0.d60(this.fk.VD0);
/* 13 */       this.Tw.Yo0(this.yn0); this.Nq
/* 14 */         .Xm0 = 1.0F;
/* 15 */       this.Nq.ad = 1.0F;
/* 16 */       this.Nq.Ah = 1.0F;
/* 17 */       this.Nq.dJ0 = 1.0F;
/* 18 */       this.Nq.KT(this.yn0, 0, 0); this.rx0.wI0(true); } else { this
/* 19 */         .yn0.d60(this.fk.VD0);
/* 20 */       this.o6[0].KT(this.yn0, 0, 0);
/*    */       
/*    */       long l;
/* 23 */       if ((l = zm0.u20 - this.rx0.c3) <= 2000L)
/* 24 */       { int i; if ((i = (int)((1000 - Math.abs(1000 - (int)l)) / 500.0F * 255.0F)) > 255) i = 255;  if (this.rx0
/* 25 */           .rc)
/*    */         
/* 27 */         { int j = (int)(zm0.u20 / 150L % 2L); this.o6[j].KT(this.yn0, 0, 0); (this.o6[j += 2])
/* 28 */             .ik = i;
/* 29 */           this.o6[j += 2].go0();
/* 30 */           this.o6[j].KT(this.yn0, 0, 0); } else { (this.o6[4])
/* 31 */             .ik = i;
/* 32 */           this.o6[4].go0();
/* 33 */           this.o6[4].KT(this.yn0, 0, 0); }  }  this.jv.KT(this.yn0, 80, 4); short s;
/* 34 */       if ((s = this.rx0.dl0) > -1) this
/* 35 */           .Va[s].KT(this.yn0, 88, 2); 
/* 36 */       Matrix4 matrix41 = this.fk.VD0; this.Zn.getClass();
/* 37 */       (this.Zn.Qw(matrix41.Z0))
/* 38 */         .Z0[0] = (this.Zn.Qw(matrix41.Z0)).Z0[0] * -1.0F; (this.Zn.Qw(matrix41.Z0)).Z0[5] = (this.Zn.Qw(matrix41.Z0)).Z0[5] * 1.0F; (this.Zn.Qw(matrix41.Z0)).Z0[10] = (this.Zn.Qw(matrix41.Z0)).Z0[10] * 1.0F;
/* 39 */       this.yn0.d60(this.Zn.Qw(matrix41.Z0).g7(-170.0F, 0.0F, 0.0F)); byte b = 0; while (b < this
/* 40 */         .P2.H3()) { ArrayList<C30> arrayList; this(); byte b1 = 0; Gp0 gp0; while (b1 < ((gp0 = this.P2)
/* 41 */           .cl[b]).length)
/*    */         
/* 43 */         { if (gp0.N0(b, b1) != null) arrayList
/*    */               
/* 45 */               .add((this.P2.N0(b, b1)).if);  b1 = (byte)(b1 + 1); }  for (Iterator<C30> iterator = arrayList.iterator(); iterator.hasNext(); ) { tH tH = this.yn0;
/* 46 */           int i = (iterator.next()).ec;
/* 47 */           int j = (iterator.next()).hv;
/* 48 */           ((C30)iterator.next()).KT(tH, i, j); }  b = (byte)(b + 1); }  this
/* 49 */         .yn0.d60(this.fk.VD0);
/* 50 */       this.Y30.Ht(this.yn0); }  this
/* 51 */       .yn0.ot(); this.yn0.end(); fQ fQ;
/* 52 */     if ((fQ = Ye0.qg).Z8 == 0) { fQ = null; } else { cx01 = (cx0)peek(); }  if (this != null)
/* 53 */       Ye0.Kw0();  }
/*    */ 
/*    */   
/*    */   public final void u7() {
/*    */     byte b1;
/*    */     for (b1 = 0; b1 < this.P2.H3(); ) {
/*    */       byte b2 = 0;
/*    */       Gp0 gp0;
/*    */       while (b2 < ((gp0 = this.P2).cl[b1]).length) {
/*    */         if (gp0.N0(b1, b2) != null)
/*    */           this.P2.N0(b1, b2).DS(true); 
/*    */         b2 = (byte)(b2 + 1);
/*    */       } 
/*    */       b1 = (byte)(b1 + 1);
/*    */     } 
/*    */     for (this.o6 = new C30[5], b1 = 0; b1 < 5; ) {
/*    */       C30 c30;
/*    */       this(a80.Oz0.dI[b1]);
/*    */       this.o6[b1] = c30;
/*    */       if (b1 > 1) {
/*    */         (this.o6[b1]).ik = 0;
/*    */         this.o6[b1].go0();
/*    */       } 
/*    */       b1++;
/*    */     } 
/*    */     a80 a802;
/*    */     this.jv = new C30((a802 = a80.Oz0).nA);
/*    */     byte b;
/*    */     C30[] arrayOfC30;
/*    */     for (this.Va = new C30[a802.i6.length], b = 0; b < (arrayOfC30 = this.Va).length; ) {
/*    */       C30 c30;
/*    */       this(a80.Oz0.i6[b]);
/*    */       arrayOfC30[b] = c30;
/*    */       b++;
/*    */     } 
/*    */     a80 a801;
/*    */     (this.Y30 = new C30((a801 = a80.Oz0).Ey)).ec = 20;
/*    */     (new C30((a801 = a80.Oz0).Ey)).hv = -8;
/*    */     (new C30((a801 = a80.Oz0).Ey)).yg = 256;
/*    */     (new C30((a801 = a80.Oz0).Ey)).aQ = 120;
/*    */     this.Cb = new C30(a801.Dg);
/*    */     this.Nq = new C30(a801.os);
/*    */     this(this.Cb);
/*    */     VG0 vG0;
/*    */     y6 y61;
/*    */     NC0 nC01;
/*    */     this(-256.0F, -256.0F);
/*    */     this(y61.sD0, new NC0(0.0F, 0.0F), nC01);
/*    */     int i = (int)Math.floor(Math.abs((new VG0()).EH.lS(this.Tj0) / 2.5F));
/*    */     float f;
/*    */     NC0 nC02, nC03;
/*    */     (new VG0()).gQ = new NC0(((nC02 = this.Tj0).x - (nC03 = this.EH).x) / (f = i), (nC02.y - nC03.y) / f);
/*    */     (new VG0()).on0 = true;
/*    */     (new y6()).Ql.add(this);
/*    */     this.Tw = new y6();
/*    */   }
/*    */   
/*    */   public final void update() {
/*    */     int i;
/*    */     if ((i = this.AJ0.ordinal()) != 0 && i != 2) {
/*    */       if (i != 9) {
/*    */         if (i == 10) {
/*    */           SI0 sI0;
/*    */           if (this.LW.pa() && ((sI0 = this.P2.W.poll()) != null || (sI0 = this.P2.Oq0.poll()) != null))
/*    */             sI0.p4(this.LW); 
/*    */           if (this.LW.pa()) {
/*    */             km.u4.UW();
/*    */             return;
/*    */           } 
/*    */         } 
/*    */       } else {
/*    */         if (this.u40 == null && this.LW.pa() && !this.LW.kv())
/*    */           this.u40 = this.P2.N00(); 
/*    */         byte b = mJ1.FI0;
/*    */         mJ mJ1;
/*    */         hm0 hm0;
/*    */         if ((mJ1 = this.u40) != null && (hm0 = this.P2.N0(b, mJ1.md)) != null) {
/*    */           if ((this.P2.Vg() ? km.u4.s40(this.P2.Q3) : km.u4.z2).de0(hm0.ih()) == null) {
/*    */             System.out.println(B40.df("Null slot: ").append(this.u40.FI0).append(" ").append(this.u40.md).toString());
/*    */           } else {
/*    */             this.LW.finally(this.u40);
/*    */           } 
/*    */           this.u40 = null;
/*    */         } 
/*    */         SI0 sI0;
/*    */         if (this.LW.pa() && (sI0 = this.P2.W.poll()) != null)
/*    */           sI0.p4(this.LW); 
/*    */         if (this.P2.uy0 && this.LW.pa()) {
/*    */           this.AJ0 = No0.yn0;
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } else {
/*    */       this.AJ0 = No0.JJ;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     super.dispose();
/*    */     this.Tw.getClass();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/r30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */