/*  1 */ package f;public final class kK extends Ip { public kK(sM paramsM, boolean paramBoolean) { dQ dQ1; Un un1, un2; StringBuilder stringBuilder; String str2; vF0 vF01; String str3; this.G9 = null; this.pI = null; this.SN = null; Xu("gameshop-item"); boolean bool = false; if (paramsM != null && System.currentTimeMillis() / 1000L - paramsM.DI() < 604800L) { Xu("gameshop-item-new"); bool = true; }  if (!km.XU() && paramsM != null && paramsM.Uf() > paramsM.IG()) { Xu("gameshop-item-sale"); bool = true; }  bool = true; Xu("gameshop-item-limited"); if (paramsM != null && paramsM.V4() != null && paramsM.k10() == 1) Xu("gameshop-item-seasonal");  U70 u70 = null; if (paramsM == null) { wI0(false); } else if (paramsM.sQ() == 1) { u70 = wm0.y8().ip0(Of.b20().On0(paramsM.i4())); } else if (paramsM.sQ() == 3) { byte b = lj0.ae(); lj0 lj0; LJ lJ; if ((lj0 = HQ.uA0().Qe(paramsM.i4())) != null && lj0.x5() > 0 && (lJ = G00.Yj0().zp(lj0.x5(), b)).V(0)) u70 = lJ.LT(0);  } else { u70 = wm0.y8().switch(paramsM.i4()); }  this(78, 32); this.Ge0 = new vF0(); vF01.ZH0().qt(new U70[] { u70 }); this.Ge0.ZH0().zT(26, 10); this.Ge0.ZH0().tL(24, 24); if (km.XU()) { this.Ge0.ZH0().Ii0(2.0F); this.Ge0.ZH0().zT(5, 5); }  if (bool) { this(57, 57); this.SN = vF02; vF0 vF02; (vF02 = new vF0()).Xu("label-special"); }  if (paramsM != null && paramsM.V4() != null) (this.G9 = new dQ(Ml0.Go(3010, LF.za(paramsM.V4().be())))).Xu("limited-time");  dQ dQ3 = new dQ(); if (paramsM == null) { str2 = ""; } else { str2 = paramsM.RI(); }  this(str2); this.zM = dQ3; if (paramsM != null && paramsM.Gi() > 1 && (paramsM.sQ() == 1 || paramsM.sQ() == 3 || paramsM.sQ() == 5)) this.zM
/*  2 */         .E1(B40.df("x").append(paramsM.Gi()).append(" ").append(paramsM.RI()).toString());  dQ3 = new dQ(); if (paramsM == null) { str2 = ""; } else { str2 = paramsM.W6(); }  this(str2); this.NA = dQ3; this(); this
/*    */ 
/*    */ 
/*    */       
/*  6 */       .aZ = new dQ(yh0.jJ0(3002, pv.X9(3001, stringBuilder, ": ").append(OC0()).append(" "), ".")); dQ dQ2 = new dQ(); char c = 'ழ'; if (paramsM == null) { str3 = ""; } else { str3 = Integer.toString(paramsM.IG()); }  this(Ml0.Go(c, str3)); this.hi0 = dQ2; if (paramsM != null && paramsM.Uf() > paramsM.IG()) { int i = (paramsM.Uf() - paramsM.IG()) * 100 / paramsM.Uf(); if (km.XU()) { (this.pI = new dQ(Ml0.Go(2995, Integer.toString(i)))).Xu("label-discount"); } else { this.hi0.E1(this.hi0.Xy() + " (" + Ml0.Go(2995, Integer.toString(i)) + ")"); }  }  String str1 = ""; if (paramsM != null && km.XU())
/*    */     {
/*  8 */       str1 = B40.df(" (").append(Ml0.Go(2994, Integer.toString(paramsM.IG()))).append(")").toString(); }  Un un3 = null; if (paramsM == null) { this(); } else if (un1.Lz() == Tx0.sE0) { Un un; StringBuilder stringBuilder1; this();
/*    */       
/* 10 */       this(yh0.jJ0(56, stringBuilder1, str1)); (new Un()).tW(new N9((sM)un1)); un1 = un; } else { Un un; StringBuilder stringBuilder1; this();
/*    */       
/* 12 */       this(yh0.jJ0(56, stringBuilder1, str1)); (new Un()).tW(new Oj0(this, (sM)un1)); if (un1.i4() == 1001) { this(Ml0.OH0(2991)); (un3 = new Un()).tW(un1::Li); }  if (un1.i4() == 1004) { this(Ml0.OH0(2991)); Un un4; (un4 = new Un()).tW(un1::v); un3 = un4; }  if (un1.Lz() == Tx0.KZ) { this(Ml0.OH0(3006)); (new Un()).tW(new Uv0((sM)un1)); un1 = un; } else { un1 = un; }  }  this(Ml0.OH0(3003).replace('\n', ' ')); (new Un()).tW(new oR(this)); if (paramBoolean) { if (km.Nr()) { (new U90[2])[0] = AUX(new JG0[] { this.SN, this.Ge0 }); arrayOfJG02[0] = this.zM; arrayOfJG02[1] = this.G9; arrayOfJG02[2] = this.NA; arrayOfJG02[3] = this.hi0; dQ dQ4 = this.pI; arrayOfJG02[4] = dQ4; arrayOfJG02[5] = dQ4; JG0[] arrayOfJG02; (arrayOfJG02 = new JG0[10])[6] = this.aZ; WN(mE0().cOM8(new U90[] { null, vo0(new JG0[] { null, null, null, null, null, null, null, un3, un1, un2 }) })); (new U90[2])[0] = vo0(new JG0[] { this.SN, this.Ge0 }); arrayOfJG01[0] = this.zM; arrayOfJG01[1] = this.G9; arrayOfJG01[2] = this.NA; arrayOfJG01[3] = this.hi0; dQ1 = this.pI; arrayOfJG01[4] = this; arrayOfJG01[5] = this; JG0[] arrayOfJG01; (arrayOfJG01 = new JG0[10])[6] = this.aZ; rK0(d7().cOM8(new U90[] { null, AUX(new JG0[] { null, null, null, null, null, null, null, un3, un1, un2 }) })); } else { (new U90[2])[0] = AUX(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }); arrayOfJG0[0] = ((kK)super).zM; arrayOfJG0[1] = ((kK)super).NA; arrayOfJG0[2] = ((kK)super).hi0; arrayOfJG0[3] = ((kK)super).aZ; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[8])[4] = ((kK)super).G9; WN(mE0().cOM8(new U90[] { null, vo0(new JG0[] { null, null, null, null, null, un3, un1, un2 }) })); (new U90[2])[0] = vo0(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }); arrayOfJG0[0] = ((kK)super).zM; arrayOfJG0[1] = ((kK)super).NA; arrayOfJG0[2] = ((kK)super).hi0; arrayOfJG0[3] = ((kK)super).aZ; (arrayOfJG0 = new JG0[8])[4] = ((kK)super).G9; rK0(d7().cOM8(new U90[] { null, AUX(new JG0[] { null, null, null, null, null, un3, un1, un2 }) })); }  } else if (km.Nr()) { (new U90[2])[0] = vo0(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }); arrayOfJG0[0] = ((kK)super).G9; arrayOfJG0[1] = ((kK)super).zM; JG0[] arrayOfJG0; (arrayOfJG0 = new JG0[3])[2] = ((kK)super).NA; WN(mE0().cOM8(new U90[] { null, vo0(new JG0[3]).Aq(12).Em0().Mg(new JG0[] { ((kK)super).hi0, ((kK)super).pI, un3, un1 }) })); (new U90[2])[0] = AUX(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }); arrayOfJG0[0] = ((kK)super).G9; arrayOfJG0[1] = ((kK)super).zM; arrayOfJG0[2] = ((kK)super).NA; arrayOfJG0[3] = ((kK)super).hi0; (arrayOfJG0 = new JG0[7])[4] = ((kK)super).pI; rK0(d7().cOM8(new U90[] { null, AUX(new JG0[] { null, null, null, null, null, un3, un1 }) })); } else { WN(d7().ee0(mE0().cOM8(new U90[] { vo0(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }), vo0(new JG0[] { ((kK)super).zM, ((kK)super).NA }).Em0() })).ee0(AUX(new JG0[] { ((kK)super).pI })).ee0(vo0(new JG0[] { ((kK)super).G9, un3, un1 }))); arrayOfU90[0] = d7().cOM8(new U90[] { AUX(new JG0[] { ((kK)super).SN, ((kK)super).Ge0 }), AUX(new JG0[] { ((kK)super).zM }).ee0(vo0(new JG0[] { ((kK)super).NA }).Em0()) }); arrayOfU90[1] = d7().Em0().Ya(((kK)super).pI); U90[] arrayOfU90; (arrayOfU90 = new U90[3])[2] = AUX(new JG0[] { ((kK)super).G9, un3, un1 }); rK0(mE0().cOM8(new U90[3])); }
/*    */      }
/*    */ 
/*    */   
/*    */   public vF0 Ge0;
/*    */   public dQ zM;
/*    */   public dQ NA;
/*    */   public dQ G9;
/*    */   public dQ hi0;
/*    */   public dQ pI;
/*    */   public dQ aZ;
/*    */   public vF0 SN;
/*    */   
/*    */   public static void v(sM paramsM) {
/*    */     boolean bool = true;
/*    */     short s = paramsM.Tk;
/*    */     pA pA;
/*    */     rg rg;
/*    */     if ((rg = (pA = js.vu0.MH0).hJ) != null) {
/*    */       rg.ra0();
/*    */       pA.hJ = null;
/*    */     } else {
/*    */       this(pA, bool, s);
/*    */       pA.hJ = rg;
/*    */       pA.J8(rg);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void Li(sM paramsM) {
/*    */     pA pA = js.vu0.MH0;
/*    */     boolean bool = true;
/*    */     short s = paramsM.Tk;
/*    */     if (pA.SM != null) {
/*    */       pA.Sc();
/*    */     } else {
/*    */       ld0 ld0;
/*    */       this(pA, bool, s);
/*    */       pA.SM = ld0;
/*    */       pA.J8(ld0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int OC0() {
/*    */     return km.u4.sE.TF0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */