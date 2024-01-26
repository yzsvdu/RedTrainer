/*    */ package f;public final class TL extends Wr { public static final U70[] Fk0 = new U70[0]; public final Ip hv; public zT kH; public zT F10; public zT yc; public rh Ge; public final void update() {
/*    */     boolean bool1, bool2;
/*  3 */     short s = (short)this.F10.hk; byte b; if ((b = (byte)this.kH.hk) == 0 || b == 1 || b == 10)
/*    */     
/*    */     { 
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
/* 22 */       U70[] arrayOfU701 = G00.Av0.Cx0(b, s, false).Uu(); this.Av
/* 23 */         .TS
/* 24 */         .qt(arrayOfU701); } else if (b == 2) { U70[] arrayOfU701 = (km.mI0.AN.AuX(s)).w70; this.Av.TS.qt(arrayOfU701); } else { gD gD; if (b == 3 && (gD = km.mI0.MT) != null) { U70[] arrayOfU701; if (!gD.fm.Fb(s)) { gD = null; } else { arrayOfU701 = (U70[])gD.sk.Z90(gD.fm.Z90(s)); }  this.gk = arrayOfU701; this.Av.TS.qt(arrayOfU701); } else { BE bE; if (b == 4 && (bE = km.mI0.yE) != null) { U70[] arrayOfU701; if (!bE.xb.Fb(s)) { bE = null; } else { arrayOfU701 = (U70[])bE.Vl0.Z90(bE.xb.Z90(s)); }  this.gk = arrayOfU701; this.Av.TS.qt(arrayOfU701); }  }  }  if (km.mI0.yE != null && (b == 0 || b == 1)) { bool2 = true; } else { bool2 = false; }  this.Fb0.wI0(bool2); this.kj0.wI0(bool2); if (bool2)
/*    */     { U70[] arrayOfU701; k8 k8;
/* 26 */       if ((k8 = (k8)km.mI0.yE.nk.Ha0(b)) == null) { arrayOfU701 = BE.nA0; }
/* 27 */       else if ((arrayOfU701 = (U70[])k8.hF.Z90(arrayOfU701)) == null) { arrayOfU701 = BE.nA0; }  this
/* 28 */         .jh = arrayOfU701; this.kj0
/* 29 */         .TS
/* 30 */         .qt(arrayOfU701); }  if (b == 0 || b == 1) { this.yc.Hr0(0); } else if (b == 3) { this.yc.Hr0(2); } else { this.yc.Hr0(3); }  r7(); rh rh1 = this.Ge; U70[] arrayOfU70; if ((arrayOfU70 = this.gk) != null && arrayOfU70.length > 0) { bool1 = true; } else { bool1 = false; }  sk0(bool1);
/*    */   }
/*    */   
/*    */   public vF0 Av;
/*    */   public vF0 kj0;
/*    */   public dQ Fb0;
/*    */   public U70[] gk;
/*    */   public U70[] jh;
/*    */   
/*    */   public TL(h2 paramh2) {
/*    */     dQ dQ1;
/*    */     dQ dQ2;
/*    */     dQ dQ3;
/*    */     rh rh1;
/*    */     rh rh2;
/*    */     U70[] arrayOfU70 = Fk0;
/*    */     this.jh = arrayOfU70;
/*    */     this();
/*    */     this.hv = ip;
/*    */     EP(1);
/*    */     Xu("adminframe");
/*    */     Lo("Npc Sprite Debugger");
/*    */     TG0(() -> paramh2.jf0(this));
/*    */     this("Region ID: ");
/*    */     this("Sprite ID: ");
/*    */     this("Frame ID: ");
/*    */     (this.Av = new vF0()).Tm(128, 128);
/*    */     this.Av.ZH0().Ii0(4.0F);
/*    */     this.Av.ZH0().zT(0, 32);
/*    */     (this.kj0 = new vF0()).Tm(128, 128);
/*    */     this.kj0.ZH0().Ii0(4.0F);
/*    */     this.kj0.ZH0().zT(0, 128);
/*    */     this.Fb0 = new dQ("HGSS Mapped Sprite: ");
/*    */     this.kH = new zT(0, 10, 0);
/*    */     this(this.kH);
/*    */     this.F10 = new zT(0, 862, 0);
/*    */     this(this.F10);
/*    */     this.yc = new zT(0, 50, 0);
/*    */     this.Ge = new rh(this.yc);
/*    */     this.kH.Ac0(this::update);
/*    */     this.F10.Ac0(this::update);
/*    */     this.yc.Ac0(this::r7);
/*    */     arrayOfJG0[0] = dQ1;
/*    */     arrayOfJG0[1] = rh1;
/*    */     arrayOfJG0[2] = dQ2;
/*    */     arrayOfJG0[3] = rh2;
/*    */     arrayOfJG0[4] = dQ3;
/*    */     arrayOfJG0[5] = this.Ge;
/*    */     arrayOfJG0[6] = this.Av;
/*    */     arrayOfJG0[7] = this.Fb0;
/*    */     JG0[] arrayOfJG0;
/*    */     (arrayOfJG0 = new JG0[9])[8] = this.kj0;
/*    */     Ip ip;
/*    */     (new Ip()).rK0((ip = new Ip()).mE0().Mg(new JG0[9]));
/*    */     arrayOfJG0[0] = dQ1;
/*    */     arrayOfJG0[1] = rh1;
/*    */     arrayOfJG0[2] = dQ2;
/*    */     arrayOfJG0[3] = rh2;
/*    */     arrayOfJG0[4] = dQ3;
/*    */     arrayOfJG0[5] = this.Ge;
/*    */     arrayOfJG0[6] = this.Av;
/*    */     arrayOfJG0[7] = this.Fb0;
/*    */     (arrayOfJG0 = new JG0[9])[8] = this.kj0;
/*    */     (new Ip()).WN((new Ip()).d7().Mg(new JG0[9]));
/*    */     J8(new Ip());
/*    */     update();
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     uh0(500, 700);
/*    */     mM();
/*    */     this.hv.mM();
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void r7() {
/*    */     U70[] arrayOfU70;
/*    */     if ((arrayOfU70 = this.gk) == null)
/*    */       return; 
/*    */     zT zT1;
/*    */     int i;
/*    */     if ((i = (zT1 = this.yc).hk) >= arrayOfU70.length) {
/*    */       if (arrayOfU70.length > 0) {
/*    */         zT1.Hr0(arrayOfU70.length - 1);
/*    */       } else {
/*    */         zT1.Hr0(0);
/*    */       } 
/*    */       i = this.yc.hk;
/*    */     } 
/*    */     if ((arrayOfU70 = this.gk) != null && arrayOfU70.length > 0) {
/*    */       this.Av.TS.qt(new U70[] { arrayOfU70[i] });
/*    */       if ((arrayOfU70 = this.jh).length > 0)
/*    */         this.kj0.TS.qt(new U70[] { arrayOfU70[i] }); 
/*    */     } else {
/*    */       this.Av.TS.H();
/*    */       this.kj0.TS.H();
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */