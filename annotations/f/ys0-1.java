/*  1 */ package f;public final class ys0 extends Un { public final Zg Ka; public vF0[] LA0; public dQ y30; public dQ nD0; public ys0(T60 paramT60) { boolean bool; dQ dQ1; SimpleDateFormat simpleDateFormat; StringBuilder stringBuilder; this.Gw0 = 1; Xu("character-select-button"); if (km.XU()) { bool = true; } else { bool = true; }  this.Gw0 = bool; this.Ht0 = paramT60; this(); this.Ka = zg; J8(zg); this(paramT60.i4().Nt0()); this.y30 = new dQ(); Zg zg; (zg = new Zg()).J8(dQ1); this
/*  2 */       .nD0 = new dQ(B40.df("$").append(NumberFormat.getInstance().format(paramT60.i4().rK0())).toString()); this("yyyy-MM-dd"); this();
/*    */     int i;
/*  4 */     for (this.iW = new dQ(pv.X9(1659, stringBuilder, ": ").append(simpleDateFormat.format(Long.valueOf(paramT60.i4().HD0() * 1000L))).toString()), i = paramT60.i4().vL() / 3600, this.w7 = new dQ(Ml0.Go(1603, NumberFormat.getInstance().format(i))), this.LA0 = new vF0[6], i = 0; i < this.LA0.length; ) { vF0 vF01; this(this.Gw0 * 16, this.Gw0 * 16); this.LA0[i] = vF01; Q90 q90; if ((q90 = paramT60.Du0(i)) != null) { j40 j40; this(q90); short s = q90.Vf0(); byte b = j40.s5(); this.LA0[i].ZH0().sm(new zh0[] { um0.TK0().lb(s, j40.ol0(), b)[0] }); this.LA0[i].Pb0(0); this.LA0[i].Gq0(On.v30().lpT3(j40.qI0()).wp()); this.LA0[i].ZH0().tL(this.Gw0 * 36, this.Gw0 * 36); }  this.Ka.J8(this.LA0[i]); i = (byte)(i + 1); }  (this.a90 = new Hw(this, this)).rY(); this.a90.gT(this.Gw0); } public dQ w7; public dQ iW; public T60 Ht0; public Hw a90; public int Gw0; public final void d40() { this.y30.C70(et.Wi0); this.y30.uh0(qF(), 0); this.y30.mM(); Zg zg3; this.y30.ME((zg3 = this.Ka).Kd, zg3.er0 + 5);
/*  5 */     int m = (zg3 = this.Ka).Kd;
/*  6 */     int k = this.Gw0 * 10 + m;
/*  7 */     m = zg3.er0;
/*  8 */     this.nD0.ME(k, this.Gw0 * 30 + m);
/*    */     Zg zg2;
/* 10 */     m = (zg2 = this.Ka).Kd;
/* 11 */     int j = this.Gw0 * 10 + m;
/* 12 */     m = zg2.er0;
/* 13 */     this.w7.ME(j, this.Gw0 * 50 + m);
/*    */     Zg zg1;
/* 15 */     m = (zg1 = this.Ka).Kd;
/* 16 */     int i = this.Gw0 * 10 + m;
/* 17 */     m = zg1.er0;
/* 18 */     this.iW.ME(i, this.Gw0 * 70 + m); for (i = 0; i < 6; ) {
/* 19 */       vF0 vF01; if ((vF01 = this.LA0[i]) != null) { int n = i % 3;
/* 20 */         int i1 = this.Ka.Kd;
/* 21 */         n = i2 * 70 + i1; n = n * 32 * i2 + n;
/* 22 */         i1 = this.y30.er0; int i2; i1 = (i2 = this.Gw0) * 25 + i1;
/* 23 */         vF01.ME(n, i / 3 * 32 * i2 + i1); }  i++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     int i = this.Gw0 * 16 + 11;
/*    */     MJ0();
/*    */     T60 t60;
/*    */     this.a90.rh = (t60 = this.Ht0).TL0.goto;
/*    */     this.a90.FD0(this.lpT3.Xu0, 0, i);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ys0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */