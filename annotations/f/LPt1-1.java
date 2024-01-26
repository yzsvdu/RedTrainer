/*  1 */ package f;public final class LPt1 extends JG0 { public sM hG0; public vF0 D20; public dQ Dq0; public dQ X7; public dQ ki0; public vF0 W20; public dQ UI0; public LPt1(sM paramsM, boolean paramBoolean) { Ip ip; StringBuilder stringBuilder; byte b3; this.X7 = null; this.ki0 = null; this.W20 = null; this.UI0 = null; this.EF = 0L; this.hG0 = paramsM; Xu("gameshop-item-addon"); vF0 vF01 = new vF0(); if (km.XU()) { b2 = 136; } else { b2 = 100; }  if (km.XU()) { b3 = 136; } else { b3 = 80; }  this(b2, b3); this.D20 = vF01; rH rH = vF01.ZH0(); byte b2 = 2; if (km.XU()) { b3 = 20; } else { b3 = 3; }  rH.zT(b2, b3); this.D20.ZH0().tL(24, 24); (this.BY = new Dn0(this.D20, km.a3.wQ())).gT(2); this.C50 = paramsM.Ga0().bk0(); short s = paramsM.Ga0().Zj(); this.BY.X7((byte)-2, this.C50, s); if (this.C50 == Vp0.MP) this.BY.Ul(true);  this.eh0 = vC0.Tn(Of.b20().On0(paramsM.i4())); s = 0; if (System.currentTimeMillis() / 1000L - paramsM.DI() < 604800L) { Xu("gameshop-item-addon-new"); s = 1; }  if (!km.XU() && paramsM.Uf() > paramsM.IG()) { Xu("gameshop-item-addon-sale"); s = 1; }  s = 1; Xu("gameshop-item-addon-limited"); if (paramsM.V4() != null && paramsM.k10() == 1) Xu("gameshop-item-addon-seasonal");  String str2; if ((str2 = paramsM.RI()).contains("(") && km.XU()) { str2 = str2.split("\\(")[0]; String str = str2.split("\\(")[1].replace(")", ""); (this.X7 = new dQ(str)).Xu("item-name-extra"); }  this(str2); this.Dq0 = dQ1; dQ dQ1; (dQ1 = new dQ()).Xu("item-name"); if (paramBoolean && km.XU()) this.Dq0.Xu("item-name-mixed");  if (paramsM.V4() != null) (this.ki0 = new dQ(Ml0.Go(3010, LF.za(paramsM.V4().be())))).Xu("limited-time");  if (s != 0) { super(57, 57); this.W20 = (vF0)dQ1; (dQ1 = new vF0()).Xu("label-special"); }  this(Ml0.Go(2996, Integer.toString(paramsM.IG()))); if (paramsM.Uf() > paramsM.IG()) { int j = (paramsM.Uf() - paramsM.IG()) * 100 / paramsM.Uf(); if (km.XU()) { (this.UI0 = new dQ(Ml0.Go(2995, Integer.toString(j)))).Xu("label-discount"); } else { dQ1.E1(dQ1.Xy() + " (" + Ml0.Go(2995, Integer.toString(j)) + ")"); }  }  String str1 = ""; if (km.XU())
/*  2 */       str1 = B40.df(" (").append(Ml0.Go(2994, Integer.toString(paramsM.IG()))).append(")").toString();  this(); (this
/*    */       
/*  4 */       .COM3 = new Un(yh0.jJ0(56, stringBuilder, str1))).tW(new na0(paramsM)); this(); this.JL = new Ip(); J8(ip); if (km.Nr()) { U90 u901, u902; g0 g0 = (ip = this.JL).mE0(); U90[] arrayOfU90; (arrayOfU90 = new U90[2])[0] = this.JL.vo0(new JG0[] { this.W20, this.D20 }); b3 = 1; if (this.ki0 == null) { u902 = this.JL.d7().Mg(new JG0[] { this.Dq0 }).Em0().Ya(dQ1).Ya(this.COM3); } else { u902 = this.JL.d7().Mg(new JG0[] { this.ki0 }).Em0().Mg(new JG0[] { this.Dq0 }).Ya(dQ1).Ya(this.COM3); }  arrayOfU90[b3] = u902; ip.WN(g0.cOM8(arrayOfU90)); cr0 cr0 = (ip = this.JL).d7(); (arrayOfU90 = new U90[2])[0] = this.JL.AUX(new JG0[] { this.W20, this.D20 }); b3 = 1; dQ dQ2; if ((dQ2 = this.ki0) == null) { u901 = this.JL.AUX(new JG0[] { this.Dq0, dQ1, this.COM3 }); } else { u901 = this.JL.AUX(new JG0[] { this.Dq0, dQ2, (JG0)u901, this.COM3 }); }  arrayOfU90[b3] = u901; ip.rK0(cr0.cOM8(arrayOfU90)); } else { U90 u903, u902, u901 = (ip = this.JL).vo0(new JG0[] { this.Dq0, this.X7 }); arrayOfJG0[0] = this.UI0; arrayOfJG0[1] = this.W20; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[3])[2] = this.D20; U90[] arrayOfU90; (arrayOfU90 = new U90[2])[0] = this.JL.AUX(new JG0[3]); byte b = 1; if (this.ki0 == null) { u903 = this.JL.d7().Ya(this.COM3); } else { u903 = this.JL.d7().Mg(new JG0[] { this.ki0 }).Ya(this.COM3); }  arrayOfU90[b] = u903; ip.WN(u901.cOM8(arrayOfU90)); u901 = (ip = this.JL).mE0(); arrayOfU90[0] = this.JL.d7().Em0().Ya(this.Dq0).Em0(); arrayOfU90[1] = this.JL.d7().Em0().Ya(this.X7).Em0(); arrayOfU90[2] = this.JL.mE0().lW(et.dw0, this.UI0).Mg(new JG0[] { this.W20 }); (arrayOfU90 = new U90[5])[3] = this.JL.d7().lW(et.Wi0, this.D20); b = 4; dQ dQ2; if ((dQ2 = this.ki0) == null) { u902 = this.JL.mE0().Ya(this.COM3); } else { u902 = this.JL.AUX(new JG0[] { (JG0)u902, this.COM3 }); }  arrayOfU90[b] = u902; ip.rK0(u901.cOM8(arrayOfU90)); }  vF0[] arrayOfVF0; int i; byte b1; for (i = (arrayOfVF0 = this.eh0).length, b1 = 0; b1 < i; ) { vF0 vF02 = arrayOfVF0[b1]; if (km.XU()) vF02.ZH0().Ii0(2.0F);  J8(vF02); b1++; }  } public short tZ; public Vp0 C50; public Un COM3; public Ip JL; public Dn0 BY; public long EF; public vF0[] eh0; public final void d40() { this.JL.mM(); int j = this.Kd; int i = JO.Se0(this.xY, ip.xY, 2, j);
/*    */     Ip ip;
/*  6 */     (ip = this.JL).ME(i, this.er0); i = 0; vF0[] arrayOfVF0; while (i < (
/*  7 */       arrayOfVF0 = this.eh0).length) { vF0 vF01; int k, m; arrayOfVF0[i].mM(); if (km.XU()) { vF01 = this.eh0[i]; k = this.D20.RS() - 50;
/*  8 */         m = this.D20.er0; m = i * 38 + m; }
/*  9 */       else { vF01 = this.eh0[i]; k = this.D20.RS() + 2; m = this.D20.e3(); m = i * 19 + m + 5; }  vF01
/* 10 */         .ME(k, m); i++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     byte b;
/*    */     int i;
/*    */     if (km.Nr()) {
/*    */       b = -6;
/*    */       Vp0 vp01;
/*    */       if ((vp01 = this.C50) == Vp0.MP || vp01 == Vp0.bG || vp01 == Vp0.K7 || vp01 == Vp0.Pa0) {
/*    */         i = -16;
/*    */       } else {
/*    */         i = -24;
/*    */       } 
/*    */     } else {
/*    */       this.BY.Dd = 4;
/*    */       b = -46;
/*    */       Vp0 vp01;
/*    */       if ((vp01 = this.C50) == Vp0.MP || vp01 == Vp0.bG || vp01 == Vp0.K7 || vp01 == Vp0.Pa0) {
/*    */       
/*    */       } else {
/*    */       
/*    */       } 
/*    */       i = -24 + -32;
/*    */     } 
/*    */     if (this.tZ == 82)
/*    */       i += 10; 
/*    */     if (this.ki0 != null && System.currentTimeMillis() - this.EF > 1000L) {
/*    */       this.EF = System.currentTimeMillis();
/*    */       this.ki0.E1(Ml0.Go(3010, LF.za(this.hG0.Jc0.be())));
/*    */       this.COM3.sk0(this.hG0.Jc0.AA0());
/*    */     } 
/*    */     Vp0 vp0;
/*    */     if ((vp0 = this.C50) == Vp0.bG || vp0 == Vp0.K7 || vp0 == Vp0.Pa0 || vp0 == Vp0.MP) {
/*    */       this.BY.gy(b, i);
/*    */       return;
/*    */     } 
/*    */     if (vp0 == Vp0.c6) {
/*    */       this.BY.FD0((byte)20, b, i);
/*    */     } else {
/*    */       this.BY.FD0((byte)0, b, i);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPt1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */