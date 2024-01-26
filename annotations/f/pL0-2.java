/* 1 */ package f;public final class pL0 extends Qa0 implements r60 { private void ci() { this(); ArrayList arrayList; for (Hc0 hc0 = this.Pu0.r30(); hc0.hasNext();) { if ((ge0 = (ge0)hc0.next()).TG0
/* 2 */         .nm0())
/*   */       {
/* 4 */         add((E)ge0.DA0); }  }  String str; if (!(str = stream().map(Xv0::us).collect(Collectors.joining(","))).equals(EC.Lm0)) { EC.Lm0 = str; EC.lpt2(); }  R8 r8 = km.u4; Xv0[] arrayOfXv0 = toArray(new Xv0[0]); this
/* 5 */       .e20
/* 6 */       .W3(new rV(arrayOfXv0)); pA pA;
/*   */     pL0 pL01;
/* 8 */     if ((pL01 = (pA = pA.Dg0).qB) != null) { pL01
/* 9 */         .ra0(); this.qB = null; }
/*   */      }
/*   */ 
/*   */   
/*   */   public YA0 MI;
/*   */   public fQ Pu0;
/*   */   
/*   */   public pL0() {
/*   */     super(km.XU());
/*   */     YA0 yA0;
/*   */     fQ fQ1;
/*   */     Xu("instance-matchmaking-frame");
/*   */     Lo(Ml0.OH0(6733));
/*   */     TG0(pL0::ee);
/*   */     SA sA1;
/*   */     (sA1 = (this.MI = new YA0()).Dv0).cM().Xj0(10.0F);
/*   */     this();
/*   */     SA sA2 = (new YA0()).Dv0;
/*   */     List<?> list;
/*   */     (list = (List)Arrays.stream(EC.Lm0.split(",")).map(Xv0::nS).collect(Collectors.toList())).clear();
/*   */     if (((List)Arrays.stream(EC.Lm0.split(",")).map(Xv0::nS).collect(Collectors.toList())).isEmpty())
/*   */       list.add(Xv0.nS(h1.pB0)); 
/*   */     this();
/*   */     this.Pu0 = fQ1;
/*   */     int i = 0;
/*   */     Xv0[] arrayOfXv0;
/*   */     int j = (arrayOfXv0 = Xv0.Kf0).length;
/*   */     for (byte b = 0; b < j; b++) {
/*   */       Xv0 xv0;
/*   */       if ((xv0 = arrayOfXv0[b]) != Xv0.eC0) {
/*   */         vF0 vF0;
/*   */         this();
/*   */         ge0 ge0;
/*   */         (ge0 = new ge0()).IF0(xv0);
/*   */         if (list.contains(xv0))
/*   */           ge0.zs(true); 
/*   */         this.Pu0.Com3(ge0);
/*   */         this(64, 64);
/*   */         (new vF0()).ZH0().zy0();
/*   */         (new vF0()).ZH0().Ii0(2.0F);
/*   */         (new vF0()).ZH0().Pn(new pe0[] { interface.ZZ().Fw(xv0.RI0()) });
/*   */         sA2.S7(ge0).fA0(vF0).ti0().fA0(new dQ(xv0.D70()));
/*   */         if (++i > 2) {
/*   */           i = 0;
/*   */           sA2.wP();
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     sA1.S7(yA0).zm0();
/*   */     (new Un(Ml0.OH0(5525))).tW(this::ci);
/*   */     sA1.S7(new Un(Ml0.OH0(5525)));
/*   */     J8(this.MI);
/*   */   }
/*   */   
/*   */   public static void ee() {
/*   */     pA pA;
/*   */     pL0 pL01;
/*   */     if ((pL01 = (pA = pA.Dg0).qB) != null) {
/*   */       pL01.ra0();
/*   */       pA.qB = null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     super.d40();
/*   */     if (km.XU())
/*   */       QI(); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/pL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */