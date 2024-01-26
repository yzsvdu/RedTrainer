/*    */ package f;public final class do0 extends Wr implements r60 { public final void LM(throws paramthrows) {
/*  2 */     int i = this.fr0.RS();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  8 */     i = this.fr0.e3();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     ME(JO.Se0(this.fr0.qF(), this.xY, 2, i), (this.fr0.Hy() - this.HC) / 4 + i);
/* 14 */     VA0.c90(this);
/*    */   }
/*    */   
/*    */   public byte eU;
/*    */   public int Iz0;
/*    */   public int kq0;
/*    */   public dQ[] Gl0;
/*    */   
/*    */   public do0(int paramInt, byte paramByte) {
/*    */     Xu("base-frame-padded");
/*    */     Lo("");
/*    */     EP(1);
/*    */     this.eU = paramByte;
/*    */     this.kq0 = (int)(km.wI0.dG() * 0.6D) / 256;
/*    */     this.Iz0 = paramInt;
/*    */     if (paramInt != 0 && paramInt != 1) {
/*    */       if (paramInt == 2)
/*    */         for (paramInt = 0; paramInt < 2; paramInt++) {
/*    */           (new vF0(0, 0)).ZH0().qt(new U70[] { Ha0.pp.O40(paramInt) });
/*    */           (new vF0(0, 0)).ZH0().Ii0(this.kq0);
/*    */           (new vF0(0, 0)).ZH0().zT(2, 0);
/*    */           J8(new vF0(0, 0));
/*    */         }  
/*    */     } else {
/*    */       dQ dQ1;
/*    */       dQ dQ2;
/*    */       dQ dQ3;
/*    */       LPT1 lPT1;
/*    */       (new vF0(0, 0)).ZH0().qt(new U70[] { Ha0.pp.iy(paramInt) });
/*    */       (new vF0(0, 0)).ZH0().Ii0(this.kq0);
/*    */       (new vF0(0, 0)).ZH0().zT(2, 0);
/*    */       J8(new vF0(0, 0));
/*    */       this.Gl0 = new dQ[3];
/*    */       String str = "";
/*    */       vh0 vh0;
/*    */       if ((vh0 = km.a3) != null && vh0.wQ() != null)
/*    */         str = km.a3.wQ().m(); 
/*    */       F40 f40 = F40.wI;
/*    */       this((byte)0, (byte)5, str);
/*    */       LPT1[] arrayOfLPT1;
/*    */       (arrayOfLPT1 = new LPT1[1])[0] = lPT1;
/*    */       this(Ml0.tm0((byte)2, f40, 1, 0, arrayOfLPT1));
/*    */       this.Gl0[0] = dQ3;
/*    */       this(Ml0.KM(f40, paramInt * 5 + 1));
/*    */       this.Gl0[1] = dQ2;
/*    */       this(Ml0.KM(f40, 3));
/*    */       this.Gl0[2] = dQ1;
/*    */       dQ[] arrayOfDQ;
/*    */       for (byte b = 0; b < (arrayOfDQ = this.Gl0).length; b++)
/*    */         J8(arrayOfDQ[b]); 
/*    */     } 
/*    */     int i = this.kq0 * 256 + 3;
/*    */     uh0(i, this.kq0 * 192 + 2);
/*    */     i = this.kq0 * 256 + 3;
/*    */     Tm(i, this.kq0 * 192 + 2);
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     int i;
/*    */     if (B8.Wm0(paramoa0.cz0) && paramoa0.oO() && (h1.J20(i = paramoa0.GG0, BM.bC) || h1.J20(i, BM.lc))) {
/*    */       pA.Dg0.jf0(this);
/*    */       km.u4.lx0(this.eU, (byte)0);
/*    */       return true;
/*    */     } 
/*    */     d40();
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     super.d40();
/*    */     int i;
/*    */     if ((i = this.Iz0) != 0) {
/*    */       if (i != 1)
/*    */         return; 
/*    */       et et;
/*    */       this.Gl0[0].C70(et = et.Em);
/*    */       this.Gl0[1].C70(et);
/*    */       this.Gl0[2].C70(et.t9);
/*    */       int j = RS();
/*    */       j = this.kq0 * 60 + j;
/*    */       int k = e3();
/*    */       this.Gl0[0].ME(j, this.kq0 * 20 + k);
/*    */       j = RS();
/*    */       j = this.kq0 * 60 + j;
/*    */       k = e3();
/*    */       this.Gl0[1].ME(j, this.kq0 * 44 + k);
/*    */       j = RS();
/*    */       j = this.kq0 * -60 + j;
/*    */       k = e3();
/*    */     } else {
/*    */       et et;
/*    */       this.Gl0[0].C70(et = et.Wi0);
/*    */       this.Gl0[1].C70(et);
/*    */       this.Gl0[2].C70(et);
/*    */       int j = RS(), k = e3();
/*    */       this.Gl0[0].ME(j, this.kq0 * -70 + k);
/*    */       j = RS();
/*    */       k = e3();
/*    */       this.Gl0[1].ME(j, this.kq0 * -10 + k);
/*    */       j = RS();
/*    */       k = e3();
/*    */     } 
/*    */     this.Gl0[2].ME(j, this.kq0 * 40 + k);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/do0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */