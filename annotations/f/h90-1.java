/*   */ package f;public final class h90 { public final void gF(Wo paramWo) {
/* 2 */     this(paramWo.TI.B8("/a/0/8/3")); ig ig; U70 u70, arrayOfU70[]; for (byte b3 = 0; b3 < (arrayOfU70 = this.Dl0).length; ) { U70 u701; UJ uJ; this(ig, b3); this(uJ); arrayOfU70[b3] = u701; b3++; }  this(new gQ(ig)); this.e1 = new zh0(u70, 0, 0, 8, 8);
/*   */     
/* 4 */     this(paramWo.TI.B8("/a/0/7/8")); for (byte b1 = 45, b2 = 0; b2 < 5; ) { for (byte b = 0; b < b1; ) { U70 u701; this(new Qp(ig, b, b2)); this.vF[b2][b] = u701; b++; }  b2++; }
/*   */   
/*   */   }
/*   */   
/*   */   public static final ik Xr = C00.gd(h90.class);
/*   */   public static h90 S80;
/*   */   public zh0[][] WY = new zh0[5][8];
/*   */   public zh0[] cA;
/*   */   public zh0 e1;
/*   */   public U70[][] vF;
/*   */   public U70 yH;
/*   */   public U70[] Dl0;
/*   */   
/*   */   public h90() {
/*   */     Arrays.fill((Object[])(this.cA = new zh0[16]), zh0.Ac0);
/*   */     Arrays.fill((Object[])(this.Dl0 = new U70[25]), U70.ah0);
/*   */   }
/*   */   
/*   */   public static h90 Kw0() {
/*   */     if (S80 == null)
/*   */       S80 = new h90(); 
/*   */     return S80;
/*   */   }
/*   */   
/*   */   public final zh0 Xu0(int paramInt, byte paramByte) {
/*   */     zh0[] arrayOfZh0;
/*   */     return ((arrayOfZh0 = this.WY[paramByte]) == null || this.length <= paramInt) ? null : this[paramInt];
/*   */   }
/*   */   
/*   */   public final zh0 ol() {
/*   */     return this.e1;
/*   */   }
/*   */   
/*   */   public final U70 Hl(int paramInt1, int paramInt2) {
/*   */     U70[][] arrayOfU701;
/*   */     U70[] arrayOfU70;
/*   */     return ((arrayOfU701 = this.vF) == null || paramInt1 >= this.length || (arrayOfU70 = this[paramInt1]) == null || paramInt2 >= this.length || paramInt2 < 0) ? null : this[paramInt2];
/*   */   }
/*   */   
/*   */   public final U70 j(byte paramByte) {
/*   */     if (paramByte < 0 || paramByte >= this.Dl0.length)
/*   */       paramByte = 0; 
/*   */     return this.Dl0[paramByte];
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/h90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */