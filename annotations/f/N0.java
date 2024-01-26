/*  1 */ package f;public final class N0 extends Ij implements r60 { public dQ VE0; public dQ BE; public dQ fF; public dQ H3; public dQ Y10; public dQ dS; public dQ Zw; public vF0 rO; public N0(pA parampA) { SimpleDateFormat simpleDateFormat; vF0 vF01; Date date; StringBuilder stringBuilder; this.u80 = 0; TG0(new mc0(parampA)); Xu("trainercard"); Lo(""); EP(1); this.VE0 = new dQ(); this.BE = new dQ(); this.fF = new dQ(); this.H3 = new dQ(); this.Y10 = new dQ(); this.dS = new dQ(); this.VE0.Xu("trainer-name"); this.cOm8 = (vF0)(new vF0(32, 32)).ZH0().Pn(new pe0[] { interface.ZZ().fb() }); this.rA0 = (vF0)(new vF0(32, 32)).ZH0().Pn(new pe0[] { interface.ZZ().cOM3() }); this.Sd = (vF0)(new vF0(32, 32)).ZH0().Pn(new pe0[] { interface.ZZ().he() }); vF0 vF02 = (vF0)(new vF0(32, 32)).ZH0().qt(new U70[] { wm0.y8().eM0((short)5431) }); vF02.ZH0().tL(24, 24); this.bn0 = vF02 = (vF0)(new vF0(32, 32)).ZH0().qt(new U70[] { wm0.y8().eM0((short)5216) }); vF02.ZH0().tL(24, 24); this("yyyy-MM-dd"); this(); (new Date()).setTime(km.u4.IQ().PY() * 1000L); this(); (this
/*  2 */       .Zw = new dQ(pv.X9(1606, stringBuilder, " ").append(simpleDateFormat.format(date)).toString())).Xu("label-centered"); this.nt = new Zg(); byte b = 0; KI kI; if ((kI = km.a3.Jr0()) != null) b = kI.m6();  byte b1; for (this.ZD0 = new vF0[8], b1 = 0; b1 < 8; ) { this.ZD0[b1] = new vF0(32, 32); if (km.u4.vC().y5(b, Bh0.interface(b1, b))) { float f; this.ZD0[b1].ZH0().sm(new zh0[] { h90.Kw0().Xu0(b1, b) }); rH rH = this.ZD0[b1].ZH0(); if (b == 2 || b == 3 || b == 4) { f = 1.0F; } else { f = 2.0F; }  rH.Ii0(f); if (b != 2) { if (b == 3) this.ZD0[b1].ZH0().zT(-4, -4);  } else { this.ZD0[b1].ZH0().zT(8, 0); this.ZD0[b1].ZH0().tL(16, 32); }  }  this.nt.J8(this.ZD0[b1]); b1++; }  this.nt.J8(this.VE0); this.nt.J8(this.BE); this.nt.J8(this.fF); this.nt.J8(this.H3); this.nt.J8(this.Y10); this.nt.J8(this.Zw); this.nt.J8(this.dS); this.nt.J8(this.cOm8); this.nt.J8(this.i90); this.nt.J8(this.Sd); this.nt.J8(this.rA0); this.nt.J8(this.bn0); this(256, 256); this.rO = new vF0(); vF01.ZH0().zT(0, -10); this.rO.Xu("spritelabeltop"); this.rO.ZH0().tL(512, 512); J8(this.nt); update(); (this.vn = new Dn0(this, km.a3.wQ())).rY(); this.vn.gT(2); } public vF0[] ZD0; public Zg nt; public vF0 i90; public vF0 Sd; public vF0 rA0; public vF0 cOm8; public vF0 bn0; public Dn0 vn; public byte u80; public final void update() { vh0 vh0; R8 r8; if ((r8 = km.u4) == null || r8.OK == null || (vh0 = km.a3) == null)
/*  3 */       return;  Jo jo; if ((jo = vh0.Ct) == null) return;  byte b; Iterator iterator; for (this
/*    */       
/*  5 */       .u80 = jo.Eh0, b = 0, iterator = On.v30().K6((byte)-1).iterator(); iterator.hasNext();) { if (km.u4
/*  6 */         .OK
/*    */         
/*  8 */         .JO((byte)1, ((UD0)iterator.next()).AP)) b++;
/*    */        }
/*    */     
/* 11 */     int i = km.u4.Lz.SZ / 3600; if (km.XU())
/*    */     {
/* 13 */       Lo(jo.ED0); }  this.VE0
/*    */       
/* 15 */       .E1(jo.ED0); this(); StringBuilder stringBuilder; this.BE
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 20 */       .E1(pv.X9(1602, this, " $").append(NumberFormat.getInstance().format(km.u4.Lz.Ii)).toString()); this(); this.fF
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 25 */       .E1(pv.X9(1605, this, " ").append(NumberFormat.getInstance().format(km.u4.Lz.NC0)).toString()); this.H3.E1(Ml0.OH0(1) + ": " + b); this.Y10.E1(Ml0.Go(1603, NumberFormat.getInstance().format(i))); this.dS
/*    */ 
/*    */ 
/*    */       
/* 29 */       .E1(Ml0.Go(1607, km.u4.fF0.ry0(jo.HW.FB) + "")); } public final void d40() { this.nt.mM(); this.VE0.mM(); int j = this.Kd + 4; int k = this.er0 + 42; this.Zw.ME(j + 83, k + 45); this.VE0.ME(j + 10, k + 3); int m; for (m = 0; m < 8; ) { int n = j + 38; n = m * 48 + n; this.ZD0[m].ME(n, k + 223); m++; }  int i = this.Kd + 36; j = k + -27; this.i90.ME(k = i + 134, (m = j + 100) - 12 - 4); i += 160; this.H3.ME(i, m - 4); this.Sd.ME(k, (m = j + 128) - 12 - 4); this.BE.ME(i, m - 4); this.rA0.ME(k, (m = j + 156) - 12 - 4); this.fF.ME(i, m - 4); this.cOm8.ME(k, (m = j + 184) - 12 - 4); this.Y10.ME(i, m - 4); this.bn0.ME(k, (j += 212) - 12 - 4); this.dS.ME(i, j - 4);
/* 30 */     super.d40(); Tm(454, 317); }
/*    */ 
/*    */   
/*    */   public final void IG0() {
/*    */     VA0.c90(this);
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     update();
/*    */     this.vn.FD0(this.u80, 5, 80);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       if (js.com3(this))
/*    */         return super.i2(paramoa0); 
/*    */       if (h1.J20(paramoa0.GG0, BM.lc)) {
/*    */         pA.Dg0.cJ0();
/*    */         return true;
/*    */       } 
/*    */     } else {
/*    */       int i;
/*    */       if (B8.Pg(i = paramoa0.cz0) && i == 5) {
/*    */         pA.Dg0.cJ0();
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/N0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */