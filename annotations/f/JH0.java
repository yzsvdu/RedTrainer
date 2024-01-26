/* 1 */ package f;public final class JH0 extends hO { public final void d40() { this.vw0.kN(0, 0, 0, 0); this.vw0.RI(400, 40); this.bG.Tm(800, 115); int i = (km.wI0.k1() - 500) / 4; i = km.wI0.dG() / 2 - 400; this.bG.ME(i, i + 350); this
/* 2 */       .hG.Tm(150, 105); this.hG
/* 3 */       .ME(this.bG.RS() + 800 - 160, this.bG.e3());
/* 4 */     this.Qr0.uh0(140, 24); this.Qr0.RI(140, 48); this.hr0.uh0(140, 24); this.hr0.RI(140, 48); mM(); }
/*   */ 
/*   */   
/*   */   public final Ip bG;
/*   */   public of vw0;
/*   */   public g0 AN;
/*   */   public cr0 hP;
/*   */   public Ip f3;
/*   */   public rS hG;
/*   */   public Un Qr0;
/*   */   public Un hr0;
/*   */   
/*   */   public JH0(byte paramByte, String paramString) {
/*   */     super(paramByte, Aq.hn0);
/*   */     Ip ip2;
/*   */     dQ dQ;
/*   */     this.vw0 = new of();
/*   */     String[] arrayOfString;
/*   */     if ((arrayOfString = paramString.split("\n\n")).length > 1)
/*   */       paramString = arrayOfString[0]; 
/*   */     Xu("messagebox");
/*   */     this();
/*   */     this.bG = ip1;
/*   */     ip1.Xu("npc-interaction-panel");
/*   */     ip1.Zf0(true);
/*   */     this();
/*   */     this.f3 = new Ip();
/*   */     this.AN = ip2.mE0();
/*   */     this.hP = this.f3.d7();
/*   */     (this.Qr0 = new Un(Ml0.OH0(52))).tW(new Bz0(this));
/*   */     this.AN.Ya(this.Qr0);
/*   */     this.hP.Ya(this.Qr0);
/*   */     (this.hr0 = new Un(Ml0.OH0(53).toUpperCase())).tW(new bb0(this));
/*   */     this.AN.Ya(this.hr0);
/*   */     this.hP.Ya(this.hr0);
/*   */     this.f3.rK0(this.AN);
/*   */     this.f3.WN(this.hP);
/*   */     (this.hG = new rS()).zG0(2);
/*   */     this.hG.Gz0(this.f3);
/*   */     Ip ip1;
/*   */     (ip1 = new Ip()).Zf0(true);
/*   */     this(paramString);
/*   */     (new Ip()).rK0((new Ip()).d7().ee0(ip1.AUX(new JG0[] { dQ, this.vw0 })).Aq(150));
/*   */     (new Ip()).WN((new Ip()).mE0().ee0(ip1.vo0(new JG0[] { dQ, this.vw0 })).ee0(ip1.mE0()));
/*   */     J8(new Ip());
/*   */     J8(this.hG);
/*   */   }
/*   */   
/*   */   public final void LM(throws paramthrows) {
/*   */     UB0.Kg0.fN(new O60(this));
/*   */   }
/*   */   
/*   */   public final boolean RW(int paramInt) {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean Cs0() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final boolean Eq() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final void SB0(int paramInt1, int paramInt2) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */