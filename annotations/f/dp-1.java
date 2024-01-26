/*    */ package f;public final class dp extends Qa0 implements r60 { public final boolean i2(oa0 paramoa0) {
/*  2 */     if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO() && (
/*    */       
/*  5 */       h1.J20(paramoa0.GG0, BM.bC) || 
/*    */       
/*  7 */       h1.J20(paramoa0.GG0, BM.lc))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.k60.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final Un k60;
/*    */   public YA0 bi;
/*    */   
/*    */   public dp(COm3 paramCOm3) {
/*    */     super(false, false);
/*    */     Xu("confirm-widget");
/*    */     (this.bi = new YA0()).Xu("confirm-panel");
/*    */     SA sA;
/*    */     (sA = this.bi.Dv0).Dl0(10.0F);
/*    */     this.bi.Dv0.cM().fu().Xj0(5.0F);
/*    */     this.bi.Dv0.S7(new dQ(Ml0.OH0(16777271))).Yv(Integer.valueOf(3)).R7();
/*    */     this.bi.Dv0.wP();
/*    */     ge0[] arrayOfGe0 = new ge0[3];
/*    */     dQ[] arrayOfDQ1 = new dQ[3];
/*    */     dQ[] arrayOfDQ2 = new dQ[3];
/*    */     short s = 0;
/*    */     R8 r8;
/*    */     if ((r8 = km.u4) != null)
/*    */       s = r8.vC().eb((byte)4, (short)1495); 
/*    */     for (byte b = 0; b < 3; b++) {
/*    */       dQ dQ;
/*    */       boolean bool;
/*    */       this();
/*    */       arrayOfGe0[b] = ge0;
/*    */       ge0 ge0;
/*    */       (ge0 = new ge0()).sk0(false);
/*    */       ge0 = arrayOfGe0[b];
/*    */       if ((s & 1 << b) != 0) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       ge0.zs(bool);
/*    */       this();
/*    */       arrayOfDQ1[b] = dQ;
/*    */       this();
/*    */       arrayOfDQ2[b] = dQ;
/*    */       sA.S7(arrayOfGe0[b]).fA0(arrayOfDQ1[b]).fA0(arrayOfDQ2[b]);
/*    */       sA.wP();
/*    */     } 
/*    */     arrayOfDQ1[0].E1(Ml0.Go(16777268, NumberFormat.getInstance().format(999L)));
/*    */     arrayOfDQ2[0].E1(Ml0.Go(16777270, NumberFormat.getInstance().format(500L)));
/*    */     arrayOfDQ1[1].E1(Ml0.Go(16777268, NumberFormat.getInstance().format(9999L)));
/*    */     arrayOfDQ2[1].E1(Ml0.Go(16777270, NumberFormat.getInstance().format(5000L)));
/*    */     arrayOfDQ1[2].E1(Ml0.Go(16777269, NumberFormat.getInstance().format(8L)));
/*    */     arrayOfDQ2[2].E1(Of.b20().On0((short)4675).getName());
/*    */     this(Ml0.OH0(52));
/*    */     this.k60 = un;
/*    */     Un un;
/*    */     (un = new Un()).tW(this::ra0);
/*    */     ((SA)this.bi.Dv0.pd0()).S7(un).Yv(Integer.valueOf(3)).Kw();
/*    */     this.bi.ZE();
/*    */     J8(this.bi);
/*    */     this.eh = km.XU();
/*    */   }
/*    */   
/*    */   public final boolean ra0() {
/*    */     super.ra0();
/*    */     VA0.c90(this.mI0);
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     VA0.c90(this.k60);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.bi.mM();
/*    */     this.bi.js0(et.Wi0);
/*    */     QI();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */