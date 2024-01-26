/*  1 */ package f;public final class XK0 extends Qa0 implements r60 { public final void d40() { super.d40(); if (km.XU()) { QI(); this.Kp.mM(); this.Kp.QJ0(et.T90, 20, 0); this.jK0.Tm(200, 60); this.jK0.js0(et.kL0); this.Ff.mM(); this.Ff
/*    */         
/*  3 */         .ME(this.jK0.Kd - this.Ff.xY - 20, 15);
/*  4 */       this.Lc0.mM(); this.Lc0.QJ0(et.dw0, -20, 0); this.Ki.QJ0(et.t9, 0, 0); this.kM = 0; } else { if (!this.By0) { this.By0 = true; js0(et.Wi0); }  this.Ff.mM();
/*  5 */       int j = this.Kd;
/*    */       
/*  7 */       int i = this.xY - 160 + j - dQ1.xY;
/*  8 */       j = this.er0 + 60; dQ dQ1;
/*  9 */       int k = (dQ1 = this.Ff).HC;
/*    */       
/* 11 */       this.Ff.ME(i, (30 - k) / 2 + j);
/* 12 */       this.Kp.mM(); this.Kp
/*    */ 
/*    */         
/* 15 */         .ME(this.Kd + 20, this.er0 + 60);
/* 16 */       this.jK0.Tm(120, 30);
/* 17 */       i = this.Kd;
/*    */ 
/*    */ 
/*    */       
/* 21 */       this.jK0.ME(this.xY - 20 + i - this.jK0.xY, this.er0 + 58);
/* 22 */       this.Lc0.uh0(170, 32); this.Lc0.mM();
/* 23 */       i = this.Kd;
/*    */ 
/*    */ 
/*    */       
/* 27 */       this.Lc0.ME(this.xY - 10 + i - this.Lc0.xY, this.er0 + 490 + 40 + 24); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Vq0 g30;
/*    */   public Vq0 Vu0;
/*    */   public final Un Lc0;
/*    */   public sM[][] Lm;
/*    */   public JG0 wQ;
/*    */   public W1 jK0;
/*    */   public dQ Ff;
/*    */   public dQ Kp;
/*    */   public boolean By0;
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       if (js.com3(this))
/*    */         return super.i2(paramoa0); 
/*    */       int i;
/*    */       if (h1.J20(i = paramoa0.GG0, BM.Oq)) {
/*    */         this.g30.E00(-1);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.M8)) {
/*    */         this.g30.E00(1);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.lc)) {
/*    */         pA.Dg0.IL0(false);
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void i2() {
/*    */     dQ dQ1 = this.Kp;
/*    */     this();
/*    */     String str;
/*    */     StringBuilder stringBuilder = pv.X9(3001, stringBuilder, ": ").append(km.u4.sE.TF0);
/*    */     if (km.u4.sE.My > 0) {
/*    */       str = N.Gl0(B40.df(" ("), km.u4.sE.My, ")");
/*    */     } else {
/*    */       str = "";
/*    */     } 
/*    */     E1(stringBuilder.append(str).append(" ").append(Ml0.OH0(3002)).append(".").toString());
/*    */   }
/*    */   
/*    */   public XK0(pA parampA) {
/*    */     super(km.XU());
/*    */     OZ oZ;
/*    */     Ip ip;
/*    */     this.Lm = null;
/*    */     this.By0 = false;
/*    */     TG0(new Mi0(parampA));
/*    */     (this.Lc0 = new Un(Ml0.OH0(3003))).tW(new x00(this));
/*    */     byte b1;
/*    */     String[] arrayOfString = new String[b1 = 5];
/*    */     int[] arrayOfInt;
/*    */     (arrayOfInt = new int[5])[0] = 3024;
/*    */     (new int[5])[1] = 3020;
/*    */     (new int[5])[2] = 3021;
/*    */     (new int[5])[3] = 3022;
/*    */     (new int[5])[4] = 3023;
/*    */     for (byte b2 = 0; b2 < b1; b2++)
/*    */       arrayOfString[b2] = Ml0.OH0(arrayOfInt[b2]); 
/*    */     this((Object[])arrayOfString);
/*    */     (this.jK0 = new W1(oZ)).Z30(0);
/*    */     this.jK0.D30(new Fc0(this));
/*    */     if (km.XU()) {
/*    */       Xu("mobile-gameshop");
/*    */     } else {
/*    */       Xu("gameshop");
/*    */     } 
/*    */     Lo(Ml0.OH0(3000));
/*    */     EP(1);
/*    */     jJ0(true);
/*    */     this();
/*    */     this.g30 = vq0;
/*    */     Vq0 vq0;
/*    */     (vq0 = new Vq0()).T1(false);
/*    */     this();
/*    */     (new Ip()).rK0((new Ip()).mE0().cOM8(new U90[] { ip.d7().Aq(10).Mg(new JG0[] { vq0 }) }));
/*    */     (new Ip()).WN((new Ip()).d7().cOM8(new U90[] { ip.mE0().Mg(new JG0[] { vq0 }) }));
/*    */     (this.Ff = new dQ(Ml0.OH0(3016))).Xu("sortby");
/*    */     (this.Kp = new dQ(Ml0.OH0(55))).Xu("points");
/*    */     J8(new Ip());
/*    */     J8(this.Lc0);
/*    */     J8(this.jK0);
/*    */     J8(this.Ff);
/*    */     J8(this.Kp);
/*    */     this.wQ = null;
/*    */     update();
/*    */   }
/*    */   
/*    */   public final boolean jf0(JG0 paramJG0) {
/*    */     if (paramJG0 == this.wQ)
/*    */       this.wQ = null; 
/*    */     return super.jf0(paramJG0);
/*    */   }
/*    */   
/*    */   public final void update() {
/*    */     UB0.Kg0.fN(new TI(this));
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     VA0.c90(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */