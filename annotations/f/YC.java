/*  1 */ package f;public final class YC extends Wr implements r60 { public final void d40() { Tm(472, 350); this.MX.uh0(250, 25); this.MX.Tm(250, 25); this.J20.uh0(260, 200); this.J20.Tm(260, 200); this.cb.Tm(170, 250); this.MX
/*    */       
/*  3 */       .ME(this.Kd + 180 + 20, this.er0 + 310);
/*  4 */     this.J20
/*    */ 
/*    */       
/*  7 */       .ME(this.Kd + 180 + 20, this.er0 + 67);
/*  8 */     this.CV
/*    */ 
/*    */       
/* 11 */       .ME(this.Kd + 350 + 20, this.er0 + 298);
/* 12 */     this.case
/*    */ 
/*    */       
/* 15 */       .ME(this.Kd + 180 + 20, this.er0 + 298);
/* 16 */     super.d40(); }
/*    */ 
/*    */   
/*    */   public pA kc;
/*    */   public final byte oA;
/*    */   public Ip cb;
/*    */   public Ip J20;
/*    */   public final rS ww0;
/*    */   public final Un MX;
/*    */   public final dQ case;
/*    */   public final dQ EF;
/*    */   public final dQ M2;
/*    */   public final dQ qZ;
/*    */   public final dQ CV;
/*    */   public i wm;
/*    */   public Xo c10;
/*    */   public byte EN;
/*    */   public Un[] BD0;
/*    */   
/*    */   public YC(pA parampA, byte paramByte, ArrayList paramArrayList) {
/*    */     pRn pRn;
/*    */     Ip ip3;
/*    */     this.kc = parampA;
/*    */     this.oA = paramByte;
/*    */     TG0(new sJ0(this));
/*    */     this((byte)-1, (byte)-1, (byte)-1, (byte)-1);
/*    */     Vo0(new I(this, pRn));
/*    */     Xu("gc-shop");
/*    */     Lo(Ml0.OH0(0) + " PRIZE CORNER");
/*    */     EP(1);
/*    */     jJ0(true);
/*    */     (this.ww0 = new rS()).zG0(2);
/*    */     this.case = new dQ(Ml0.OH0(1137));
/*    */     this();
/*    */     cr0 cr0 = (new Ip()).d7();
/*    */     g0 g0 = (new Ip()).mE0();
/*    */     this.EF = new dQ("");
/*    */     this.M2 = new dQ("");
/*    */     this.qZ = new dQ("");
/*    */     this(Ml0.OH0(56));
/*    */     this.MX = un;
/*    */     un.sk0(false);
/*    */     this.CV = new dQ(Ml0.Go(1925, "0"));
/*    */     Un un;
/*    */     (un = new Un()).tW(new uF0(this, paramByte, parampA));
/*    */     this.BD0 = (Un[])new F50[paramArrayList.size()];
/*    */     int j = 0;
/*    */     Iterator<i> iterator = paramArrayList.iterator();
/*    */     while (iterator.hasNext()) {
/*    */       F50 f50;
/*    */       i i1;
/*    */       if ((i1 = iterator.next()).uf() != null) {
/*    */         this(i1.uf());
/*    */       } else {
/*    */         this(i1, false);
/*    */       } 
/*    */       byte b = (byte)j;
/*    */       f50.tW(new AK(this, i1, b));
/*    */       this.BD0[j++] = f50;
/*    */     } 
/*    */     cr0.Mg((JG0[])this.BD0);
/*    */     g0.Mg((JG0[])this.BD0);
/*    */     ip3.WN(cr0);
/*    */     ip3.rK0(g0);
/*    */     this.ww0.Gz0(ip3);
/*    */     (new Ip()).rK0((this.cb = new Ip()).mE0().cOM8(new U90[] { this.cb.d7().Mg(new JG0[] { this.ww0 }).Em0() }));
/*    */     this.cb.WN(this.cb.d7().cOM8(new U90[] { this.cb.mE0().Mg(new JG0[] { this.ww0 }) }));
/*    */     J8(this.cb);
/*    */     this();
/*    */     (this.J20 = new Ip()).Xu("label-area-market");
/*    */     arrayOfU90[0] = this.J20.vo0(new JG0[] { this.EF });
/*    */     arrayOfU90[1] = this.J20.vo0(new JG0[] { this.M2 });
/*    */     U90[] arrayOfU90;
/*    */     (arrayOfU90 = new U90[3])[2] = this.J20.vo0(new JG0[] { this.qZ });
/*    */     this.J20.rK0(this.J20.mE0().cOM8(new U90[3]));
/*    */     arrayOfU90[0] = this.J20.AUX(new JG0[] { this.EF });
/*    */     arrayOfU90[1] = this.J20.AUX(new JG0[] { this.M2 });
/*    */     (arrayOfU90 = new U90[3])[2] = this.J20.AUX(new JG0[] { this.qZ });
/*    */     this.J20.WN(this.J20.d7().cOM8(new U90[3]));
/*    */     Ip ip2;
/*    */     (new Ip()).rK0((ip2 = new Ip()).mE0());
/*    */     (new Ip()).WN((new Ip()).d7());
/*    */     this();
/*    */     this.CV.Xu("label");
/*    */     this.case.Xu("label");
/*    */     ip1.J8(this.MX);
/*    */     ip1.J8(this.CV);
/*    */     ip1.J8(this.case);
/*    */     Ip ip1;
/*    */     (ip1 = new Ip()).J8(this.J20);
/*    */     J8(new Ip());
/*    */     DS();
/*    */   }
/*    */   
/*    */   public final boolean jf0(JG0 paramJG0) {
/*    */     if (paramJG0 == this.c10)
/*    */       this.c10 = null; 
/*    */     return super.jf0(paramJG0);
/*    */   }
/*    */   
/*    */   public final void DS() {
/*    */     char c = 'ޕ';
/*    */     dQ dQ1 = this.case;
/*    */     this();
/*    */     StringBuilder stringBuilder;
/*    */     short s;
/*    */     R8 r8;
/*    */     fH0 fH0;
/*    */     if ((r8 = km.u4) == null || (fH0 = r8.Lz) == null) {
/*    */       s = 0;
/*    */     } else {
/*    */       s = s.aY;
/*    */     } 
/*    */     dQ1.E1(Ml0.Go(c, stringBuilder.append(s).append("").toString()));
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     Ha();
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     pA pA1;
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       int j;
/*    */       if (h1.J20(j = paramoa0.GG0, BM.ni)) {
/*    */         byte b;
/*    */         if ((b = this.EN) > 0) {
/*    */           this.EN = (byte)(b - 1);
/*    */           Ha();
/*    */         } 
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(j, BM.N70)) {
/*    */         this.EN = (byte)(this.EN + 1);
/*    */         Ha();
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(j, BM.bC)) {
/*    */         hm.Fz0(this.MX.TG0.oh0);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(j, BM.lc)) {
/*    */         YC yC;
/*    */         if ((yC = (pA1 = this.kc).dS) != null) {
/*    */           yC.ra0();
/*    */           pA1.dS = null;
/*    */         } 
/*    */         km.u4.lx0(this.oA, (byte)(this.BD0.length + 1));
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2((oa0)pA1);
/*    */   }
/*    */   
/*    */   public final void Ha() {
/*    */     Un un;
/*    */     Un[] arrayOfUn;
/*    */     if (this.EN >= (arrayOfUn = this.BD0).length)
/*    */       this.EN = (byte)(arrayOfUn.length - 1); 
/*    */     if (this.EN < 0)
/*    */       this.EN = 0; 
/*    */     byte b;
/*    */     if ((b = this.EN) >= arrayOfUn.length) {
/*    */       arrayOfUn = null;
/*    */     } else {
/*    */       un = arrayOfUn[b];
/*    */     } 
/*    */     if (un != null) {
/*    */       hm.Fz0(un.TG0.oh0);
/*    */       VA0.c90(un);
/*    */       this.ww0.ai(un);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */