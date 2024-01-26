/*  1 */ package f;public final class AH extends Qa0 implements r60 { public final Ip OM; public final JG0 eg0; public final Q90 X00; public AH(Y paramY, Q90 paramQ90) { super(false, false); dQ dQ1; StringBuilder stringBuilder; Xu("confirm-widget"); this.eg0 = null; this.X00 = paramQ90; this.p00 = paramY; this.ZW = paramY.Ng().ZE(); this(); this.OM = ip; Ip ip; (ip = new Ip()).Xu("confirm-panel"); this(); dQ2.E1("label-title"); ip.WN(ip.vo0(new JG0[] { dQ2 })); ip.rK0(ip.AUX(new JG0[] { dQ2 })); dQ dQ2; (dQ2 = new dQ()).E1(Ml0.OH0(5613)); UD0 uD0 = On.v30().lpT3(paramQ90.u60()); this();
/*  2 */     this(pv.X9(59, stringBuilder, " ").append(paramQ90.Y20()).append(" ").append(uD0.wp()).toString()); (new Ip()).xh().Ya(dQ2); (new Ip()).iJ0().Ya(dQ2); this(Ml0.OH0(1849)); (new Ip()).xh().Ya(dQ1); (new Ip()).iJ0().Ya(dQ1); dQ[] arrayOfDQ; byte b; hR[] arrayOfHR; for (arrayOfDQ = new dQ[6], this.Yj0 = new Rm[6], b = 0; b < (arrayOfHR = hR.Tm0).length; ) { zT zT; boolean bool1; lPt7 lPt7; boolean bool2; this(hR.toString()); arrayOfDQ[b] = dQ3; dQ dQ3; (dQ3 = new dQ()).Xu("label-title"); this(0, 31, b1); this(this, zT); this.Yj0[b] = lPt7; this.Yj0[b].Xu("valueadjuster-small"); Un un2 = (this.Yj0[b]).Xx; byte b1; hR hR; if ((b1 = paramQ90.Hc(hR = arrayOfHR[b])) < 31) { bool2 = true; } else { bool2 = false; }  un2.sk0(bool2); Un un1 = (this.Yj0[b]).mc0; if (b1 > 0) { bool1 = true; } else { bool1 = false; }  un1.sk0(bool1); b++; }  U90 u901 = this.OM.d7().ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[0], this.Yj0[0] })).ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[1], this.Yj0[1] })).ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[2], this.Yj0[2] })).ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[3], this.Yj0[3] })).ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[4], this.Yj0[4] })).ee0(this.OM.mE0().Mg(new JG0[] { arrayOfDQ[5], this.Yj0[5] })), u902 = this.OM.mE0().ee0(this.OM.d7().Ya(arrayOfDQ[0]).Em0().Mg(new JG0[] { this.Yj0[0] })).ee0(this.OM.d7().Ya(arrayOfDQ[1]).Em0().Mg(new JG0[] { this.Yj0[1] })).ee0(this.OM.d7().Ya(arrayOfDQ[2]).Em0().Mg(new JG0[] { this.Yj0[2] })).ee0(this.OM.d7().Ya(arrayOfDQ[3]).Em0().Mg(new JG0[] { this.Yj0[3] })).ee0(this.OM.d7().Ya(arrayOfDQ[4]).Em0().Mg(new JG0[] { this.Yj0[4] })).ee0(this.OM.d7().Ya(arrayOfDQ[5]).Em0().Mg(new JG0[] { this.Yj0[5] })); this.OM.xh().ee0(u901); this.OM.iJ0().ee0(u902); String[] arrayOfString; (arrayOfString = new String[2])[0] = paramY.JG0(); (new String[2])[1] = String.valueOf(0); (this.Ce0 = new dQ(Ml0.sB(5638, arrayOfString))).Xu("label-title"); this.OM.xh().Ya(this.Ce0); this.OM.iJ0().Ya(this.Ce0); this(Ml0.OH0(52)); Un un; (un = new Un()).tW(this::TG); this.OM.xh().Ya(un); this.OM.iJ0().Ya(un); this(Ml0.OH0(53)); (un = new Un()).tW(this::ra0); this.OM.xh().Aq(25).Ya(un); this.OM.iJ0().Ya(un); J8(this.OM); } public final Y p00; public Rm[] Yj0; public dQ Ce0; public byte ZW; public final void TG() { hR[] arrayOfHR; byte[] arrayOfByte; int i; byte b; for (arrayOfByte = new byte[(arrayOfHR = hR.ka).length], i = hR.ka.length, b = 0; b < i; )
/*  3 */     { byte b1 = (byte)(this.Yj0[(arrayOfHR[b]).It0]).T8;
/*  4 */       arrayOfByte[(arrayOfHR[b]).dL] = b1;
/*  5 */       b++; }  this(this.X00, arrayOfByte);
/*    */     mV mV;
/*  7 */     short s = this.p00.Lh.p1;
/*  8 */     km.u4.e20
/*  9 */       .W3(new Fk0(s, mV));
/* 10 */     ra0(); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.OM.mM();
/*    */     QI();
/*    */     this.OM.js0(et.Wi0);
/*    */   }
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */     JG0 jG0;
/*    */     if ((jG0 = this.eg0) != null)
/*    */       VA0.c90(this); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */