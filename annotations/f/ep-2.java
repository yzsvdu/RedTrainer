/*  1 */ package f;public final class ep extends Qa0 implements r60 { public static void GA0(String paramString1, String paramString2, Ip paramIp) { this(); dQ dQ2; (dQ2 = new dQ()).E1(paramString1); (new dQ())
/*  2 */       .Xu("label-title");
/*  3 */     this(); dQ dQ1; (dQ1 = new dQ()).E1(paramString2);
/*  4 */     (new dQ()).Xu("label-name-value");
/*  5 */     paramIp.Xz0
/*    */       
/*  7 */       .ee0((new cr0(paramIp)).Mg(new JG0[] { dQ2, dQ1 }));
/*  8 */     paramIp.o30
/*    */       
/* 10 */       .ee0((new g0(paramIp)).Mg(new JG0[] { dQ2, dQ1 })); }
/*    */ 
/*    */   
/*    */   public static SimpleDateFormat zC0 = new SimpleDateFormat("dd/MM/yyyy hh:mm a z");
/*    */   public final pA yy;
/*    */   public Vq0 bw;
/*    */   public Ip Dk0;
/*    */   public rS mq;
/*    */   public rS cV;
/*    */   public short[] Hp;
/*    */   public byte[] Xu0;
/*    */   public CS Yf;
/*    */   public CS gE;
/*    */   public Zy0 Ey;
/*    */   
/*    */   public ep(pA parampA) {
/*    */     super(km.XU());
/*    */     Ip ip;
/*    */     this.Hp = new short[2];
/*    */     this.Xu0 = new byte[2];
/*    */     this.yy = parampA;
/*    */     Xu("mm-stats-window");
/*    */     Lo(Ml0.OH0(9152));
/*    */     EP(1);
/*    */     TG0(new QN(parampA));
/*    */     this.bw = new Vq0();
/*    */     (new Ip()).rK0((this.Dk0 = new Ip()).mE0().cOM8(new U90[] { this.Dk0.d7().Aq(10).Mg(new JG0[] { this.bw }) }));
/*    */     this.Dk0.WN(this.Dk0.d7().cOM8(new U90[] { this.Dk0.mE0().Mg(new JG0[] { this.bw }) }));
/*    */     this.Yf = new CS(this, false);
/*    */     (this.mq = new rS(this.Yf)).Xu("stats");
/*    */     this();
/*    */     (new Ip()).rK0((new Ip()).AUX(new JG0[] { this.mq }));
/*    */     (new Ip()).WN((new Ip()).vo0(new JG0[] { this.mq }));
/*    */     this.bw.WS(ip, Ml0.OH0(9153)).Ac0(new kb(this));
/*    */     this.gE = new CS(this, true);
/*    */     this.Ey = new Zy0(this);
/*    */     (this.cV = new rS(this.gE)).Xu("stats");
/*    */     this();
/*    */     (new Ip()).rK0((new Ip()).AUX(new JG0[] { this.cV, this.Ey }));
/*    */     (new Ip()).WN((new Ip()).vo0(new JG0[] { this.cV, this.Ey }));
/*    */     this.bw.WS(ip, Ml0.OH0(9154)).Ac0(new xY(this));
/*    */     J8(this.Dk0);
/*    */     as(false);
/*    */   }
/*    */   
/*    */   public final void as(boolean paramBoolean) {
/*    */     byte b = (byte)(this.Xu0[paramBoolean] + 1);
/*    */     short s = this.Hp[paramBoolean];
/*    */     km.u4.e20.W3(new f30(s, paramBoolean, b));
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (km.XU()) {
/*    */       QI();
/*    */     } else {
/*    */       uh0(670, 500);
/*    */       this.bw.uh0(670, 500);
/*    */     } 
/*    */     super.d40();
/*    */   }
/*    */   
/*    */   public final void LM(throws paramthrows) {
/*    */     super.LM(paramthrows);
/*    */     VA0.c90(this);
/*    */   }
/*    */   
/*    */   public final void IG0() {
/*    */     VA0.c90(this);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO()) {
/*    */       int i;
/*    */       if (h1.J20(i = paramoa0.GG0, BM.Oq)) {
/*    */         this.bw.E00(-1);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.M8)) {
/*    */         this.bw.E00(1);
/*    */         return true;
/*    */       } 
/*    */       if (h1.J20(i, BM.lc)) {
/*    */         this.yy.p10(false);
/*    */         return true;
/*    */       } 
/*    */     } 
/*    */     return super.i2(paramoa0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */