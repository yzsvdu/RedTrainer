/*  1 */ package f;public final class TQ extends Qa0 implements r60 { public final void b5(boolean paramBoolean) { if (!this.FB0.kN) return;  if (!paramBoolean && 
/*    */       
/*  3 */       this.L8.F2
/*  4 */       .PH0
/*  5 */       .toString()
/*  6 */       .isEmpty()) { VA0.c90(this.L8); return; }  this.FB0.s6(Ml0.OH0(55)); this.FB0.sk0(false); this.L8.sk0(false);
/*    */ 
/*    */     
/*  9 */     String str = this.L8.F2.PH0.toString();
/* 10 */     km.u4.e20
/* 11 */       .W3(new zN(this, paramBoolean)); }
/*    */ 
/*    */   
/*    */   public final Ip Ml0;
/*    */   public final dQ yc;
/*    */   public final vF0 Ni;
/*    */   public final Un FB0;
/*    */   public final of L8;
/*    */   public final IN pm;
/*    */   public long N60;
/*    */   public long i40;
/*    */   public Texture BV = null;
/*    */   
/*    */   public TQ(Texture paramTexture, byte paramByte) {
/*    */     super(false, false);
/*    */     Xu("confirm-widget");
/*    */     this.BV = paramTexture;
/*    */     this();
/*    */     this.Ml0 = ip;
/*    */     Ip ip;
/*    */     (ip = new Ip()).Xu("confirm-panel");
/*    */     this(Ml0.Go(70, paramByte + ""));
/*    */     this.yc = dQ1;
/*    */     dQ dQ1;
/*    */     (dQ1 = new dQ()).Zf0(true);
/*    */     this();
/*    */     this.pm = iN;
/*    */     IN iN;
/*    */     (iN = new IN()).Nu(1.0F);
/*    */     (new IN()).Xu("countdown-progressbar");
/*    */     (new IN()).Zf0(true);
/*    */     this.N60 = System.currentTimeMillis();
/*    */     this.i40 = 45000L;
/*    */     this(paramTexture.getWidth() * 2, paramTexture.getHeight() * 2);
/*    */     this.Ni = vF01;
/*    */     vF0 vF01;
/*    */     (vF01 = new vF0()).ZH0().Yo(new Texture[] { paramTexture });
/*    */     (new vF0()).ZH0().Ii0(2.0F);
/*    */     (new vF0()).Zf0(true);
/*    */     this();
/*    */     this.L8 = of1;
/*    */     of of1;
/*    */     (of1 = new of()).LE();
/*    */     this(Ml0.OH0(69));
/*    */     this.FB0 = un;
/*    */     Un un;
/*    */     (un = new Un()).tW(new ka0(this));
/*    */     (new of()).JD0(new Com3(this));
/*    */     if (km.ER()) {
/*    */       ip.WN(ip.d7().Ya(vF01).Ya(iN).Ya(dQ1).Ya(of1).Ya(un).Em0());
/*    */       ip.rK0(ip.mE0().Ya(vF01).Ya(iN).Ya(dQ1).Ya(of1).Ya(un));
/*    */     } else {
/*    */       ip.WN(ip.d7().Ya(dQ1).Ya(vF01).Ya(of1).Ya(un).Ya(iN).Em0());
/*    */       ip.rK0(ip.mE0().Ya(dQ1).Ya(vF01).Ya(of1).Ya(un).Ya(iN));
/*    */     } 
/*    */     J8(ip);
/*    */   }
/*    */   
/*    */   public final void V90(throws paramthrows) {
/*    */     if (km.XU()) {
/*    */       BA();
/*    */     } else if (km.XU()) {
/*    */       this.L8.BA();
/*    */     } else if (!this.L8.p3()) {
/*    */       VA0.c90(this.L8);
/*    */     } 
/*    */     float f;
/*    */     if ((f = (float)(this.N60 + this.i40 - System.currentTimeMillis()) / (float)this.i40) > 0.0F) {
/*    */       this.pm.Nu(f);
/*    */       super.V90(paramthrows);
/*    */       return;
/*    */     } 
/*    */     if (!this.L8.F2.PH0.toString().isEmpty() && this.FB0.kN)
/*    */       b5(true); 
/*    */     super.V90(paramthrows);
/*    */   }
/*    */   
/*    */   public final void jA0() {
/*    */     super.jA0();
/*    */     Texture texture;
/*    */     if ((texture = this.BV) != null)
/*    */       dispose(); 
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     this.Ml0.mM();
/*    */     QI();
/*    */     if (km.XU()) {
/*    */       this.Ml0.js0(et.kL0);
/*    */     } else {
/*    */       this.Ml0.js0(et.Wi0);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */