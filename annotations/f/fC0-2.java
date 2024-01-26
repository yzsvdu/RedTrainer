/* 1 */ package f;public final class fC0 { public final void Ug0() { eo eo1; (eo1 = So0.PH).TG0(0.0F, 0.125F, 0.25F); switch (this.qU) { case 3: eo1.x += 0.5F; break;case 2: eo1.x += -0.5F; break;case 1: eo1.y += -0.5F; break;case 0: eo1.y += 0.5F; break; }  tc tc1; if ((tc1 = this.EF) != null) tc1.pm
/* 2 */         .KC(this.do0, false, eo1);  }
/*   */ 
/*   */   
/*   */   public p70 wV;
/*   */   public lpt1 do0;
/*   */   public eo CoM2;
/*   */   public il hr;
/*   */   public xr0[] x5;
/*   */   public fC0[] V50;
/*   */   public boolean[] o5;
/*   */   public byte SD;
/*   */   public float KB;
/*   */   public tc EF;
/*   */   public fC0 Ek0;
/*   */   public boolean Wq;
/*   */   public byte qU;
/*   */   
/*   */   public fC0(So0 paramSo0, p70 paramp70, lpt1 paramlpt1) {
/*   */     eo eo1;
/*   */     this.x5 = new xr0[4];
/*   */     this.V50 = new fC0[4];
/*   */     this.o5 = new boolean[4];
/*   */     this.SD = 0;
/*   */     this.KB = 0.0F;
/*   */     this.EF = null;
/*   */     this.Ek0 = null;
/*   */     this.Wq = false;
/*   */     this.qU = 0;
/*   */     this.wV = paramp70;
/*   */     this.do0 = paramlpt1;
/*   */     this();
/*   */     this.CoM2 = new eo();
/*   */     paramlpt1.mh.on0(eo1);
/*   */     float f2 = paramp70.f;
/*   */     xV xV;
/*   */     this.hr = (xV = (xV)So0.uo(paramSo0)).hd(paramp70.fi, f2, paramp70.rg, null);
/*   */     f2 = (paramp70.f + 2) + 0.5F;
/*   */     this.x5[0] = xV.hd(paramp70.fi + 0.5F, f2, paramp70.rg, null);
/*   */     f2 = (paramp70.f - 2) + 0.5F;
/*   */     this.x5[1] = xV.hd(paramp70.fi + 0.5F, f2, paramp70.rg, null);
/*   */     f2 = paramp70.f + 0.5F;
/*   */     this.x5[3] = xV.hd((paramp70.fi + 2) + 0.5F, f2, paramp70.rg, null);
/*   */     float f1 = paramp70.f + 0.5F;
/*   */     this.x5[2] = xV.hd((paramp70.fi - 2) + 0.5F, f1, paramp70.rg, null);
/*   */     byte[] arrayOfByte;
/*   */     int i = (arrayOfByte = NI.h).length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       byte b1 = arrayOfByte[b];
/*   */       this.x5[b1].wu0(new E10(paramSo0, this, b1));
/*   */     } 
/*   */     if (paramp70.RU != 2)
/*   */       this.hr.wu0(new E10(paramSo0, this, (byte)-1)); 
/*   */   }
/*   */   
/*   */   public final void wi(byte paramByte, fC0 paramfC0) {
/*   */     this.V50[paramByte] = paramfC0;
/*   */     this.o5[paramByte] = true;
/*   */     paramfC0.V50[NI.rD(paramByte)] = this;
/*   */   }
/*   */   
/*   */   public final fC0 CJ0(byte paramByte, tc paramtc, boolean paramBoolean) {
/*   */     if (paramByte == -1)
/*   */       return null; 
/*   */     if (this.SD != 0)
/*   */       return null; 
/*   */     fC0 fC01;
/*   */     if ((fC01 = this.V50[paramByte]) == null)
/*   */       return null; 
/*   */     if (!this.o5[paramByte])
/*   */       return fC01.CJ0(NI.rD(paramByte), paramtc, false); 
/*   */     this.SD = 1;
/*   */     this.KB = 0.5F;
/*   */     this.Ek0 = fC01;
/*   */     this.Wq = paramBoolean;
/*   */     this.qU = paramByte;
/*   */     this.EF = paramtc;
/*   */     return this;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fC0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */