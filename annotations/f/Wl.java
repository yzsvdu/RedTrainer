/*  1 */ package f;public abstract class Wl implements iq0 { public Gp0 P2; public kf LW; public boolean uU = false; public wb u4; public ConcurrentHashMap iK = new ConcurrentHashMap<>(); public No0 AJ0 = No0.gm; public static void IL(hm0[] paramArrayOfhm0) { int i = 0; this(); Lw lw; for (byte b = 0; b < paramArrayOfhm0.length; ) { hm0 hm01; if ((hm01 = paramArrayOfhm0[b]) != null && !hm01.K0.AL() && 
/*  2 */         !lw.Fb(hm01.Jx())) { lw.Ye0(hm01.Jx());
/*    */         
/*  4 */         Runnable runnable = hm01::rj; long l = i; A1.L7.ac0(runnable, l); i = D0.BR(hm01.Jx()) + 150 + i; }  b = (byte)(b + 1); }  }
/*  5 */   public mJ Zk; public cx0 Ez = new cx0(); public cx0 gt = new cx0(); public Tm fk; public tH yn0; public dw NC0 = null; public Wl(kf paramkf, Gp0 paramGp0) { this.P2 = paramGp0; this.LW = paramkf; fV(); } public void fV() { this(1000, (new NH0()).Za0); tH tH1; this.yn0 = this; hY(); } public abstract void update(); public abstract void CH(); public abstract void hY(); public final void Lpt1() { if (this.P2 == null) return;  this(); StringBuilder stringBuilder; if (this.P2.e9 > 0) { stringBuilder.append(Ml0.Go(5015, B40.df("\n  ").append(this.P2.e9).toString())); km.u4
/*    */         
/*  7 */         .oD(Ml0.Go(5015, this.P2.e9 + ""), ZY.ze); }
/*  8 */      Gp0 gp0; DO[] arrayOfDO; if ((arrayOfDO = (gp0 = this.P2).yd0).length != 
/*  9 */       0 && (arrayOfDO.length != 4 || gp0.yx0())) { String str = ""; int i;
/*    */       byte b;
/* 11 */       for (i = (arrayOfDO = this.P2.yd0).length, b = 0; b < i; ) { DO dO = arrayOfDO[b]; if (str.length() > 0) {
/* 12 */           str = m0.tF0(str, ", ");
/*    */         }
/*    */         
/* 15 */         str = B40.df(str).append(Ml0.OH0(dO.mt0)).toString(); b++; }  if (stringBuilder.length() > 0) stringBuilder.append("\n");  stringBuilder.append(Ml0.Go(5014, "\n  " + str)); km.u4.oD(Ml0.Go(5014, str), ZY.ze); }
/* 16 */      CC0[] arrayOfCC0; if ((arrayOfCC0 = this.P2.Wf).length > 
/* 17 */       0) { String str; int i; byte b; for (str = "", i = arrayOfCC0.length, b = 0; b < i; ) { CC0 cC0 = arrayOfCC0[b]; if (str.length() > 0) {
/* 18 */           str = m0.tF0(str, ", ");
/*    */         }
/*    */         
/* 21 */         str = B40.df(str).append(Ml0.OH0(cC0.a10)).toString(); b++; }  if (stringBuilder.length() > 0) stringBuilder.append("\n");  stringBuilder.append(Ml0.Go(5011, "\n  " + str)); km.u4.oD(Ml0.Go(5011, str), ZY.ze); }
/* 22 */      DK dK; if ((dK = this.P2.uo0) != null && dK
/* 23 */       .Iq)
/* 24 */       km.u4.oD(Ml0.OH0(5509), ZY.ze);  if (stringBuilder.length() > 0) { kf kf1 = this.LW; String str = stringBuilder.toString(); if (this
/* 25 */         .Rj0 == null) {
/* 26 */         if (km.XU()) { Fy0 fy01; this("", 56, 56); this.Rj0 = fy01; } else { Fy0 fy01; this("", 16, 16); this.Rj0 = fy01; }  this.Rj0.Xu("tooltip-button2"); Fy0 fy0; (fy0 = this.Rj0)
/* 27 */           .jl = 0;
/* 28 */         si(fy0, Ub());
/* 29 */       }  this.Rj0
/* 30 */         .z4 = str;
/* 31 */       this.Rj0.zn(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public void s2(byte paramByte1, float paramFloat, byte paramByte2) {}
/*    */   
/*    */   public void bt0() {}
/*    */   
/*    */   public void wB0() {}
/*    */   
/*    */   public void Sd(Mx paramMx) {}
/*    */   
/*    */   public void yw0(byte paramByte, short paramShort) {}
/*    */   
/*    */   public void qg0(byte paramByte, short paramShort) {}
/*    */   
/*    */   public void dispose() {
/*    */     dw dw1;
/*    */     if ((dw1 = this.NC0) != null)
/*    */       dw1.dispose(); 
/*    */     this.yn0.dispose();
/*    */     for (byte b = 0; b < this.P2.H3(); ) {
/*    */       this.P2.wB(b).dispose();
/*    */       byte b1 = 0;
/*    */       Gp0 gp0;
/*    */       while (b1 < ((gp0 = this.P2).cl[b]).length) {
/*    */         if (gp0.N0(b, b1) != null)
/*    */           this.P2.N0(b, b1).lG0(); 
/*    */         b1 = (byte)(b1 + 1);
/*    */       } 
/*    */       b = (byte)(b + 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void zt0(boolean paramBoolean1, boolean paramBoolean2) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */