/*    */ package f;public final class GM { public int YB; public int Tx; public boolean bM = false; public int Gd = 0; public int pS = 0; public So XR = null;
/*    */   
/*  3 */   public final void AE() { int i = this.YB; (this.SM.xb.Nl0.nuL(i, this.Tx)).NR = 0; if (this.bM) return;  So so = So.k60().eC();
/*  4 */     so = eh0.sp0((paramInt, paramsh) -> this.Gd = 1, so, 0.033F);
/*    */     
/*  6 */     so = eh0.sp0((paramInt, paramsh) -> this.Gd = 2, so, 0.066F);
/*    */     
/*  8 */     so = eh0.sp0((paramInt, paramsh) -> this.Gd = 3, so, 0.033F);
/*    */     
/* 10 */     eh0.sp0((paramInt, paramsh) -> this.Gd = 4, so, 0.066F)
/* 11 */       .PL(Wz0.OC((paramInt, paramsh) -> this.XR = null));
/*    */     
/* 13 */     this.XR = (So)eh0.sp0((paramInt, paramsh) -> this.Gd = 4, so, 0.066F).Kr().mg(km.wI0.pB0); } public final void Wv() { int i = this.YB; v50 v50; if ((v50 = this.SM.xb.Nl0.nuL(i, this.Tx)).F4 && !this.bM) { this.bM = true; boolean bool = this.SM.xb.Nl0.d20(); So so = So.k60().eC(); so = eh0.sp0((paramInt, paramsh) -> this.Gd = 1, so, 0.033F); so = eh0.sp0((paramInt, paramsh) -> this.Gd = 2, so, 0.066F); so = eh0.sp0(GM::LPT6, eh0.sp0((paramInt, paramsh) -> this.Gd = 3, so, 0.033F).PL(Wz0.OC((paramInt, paramsh) -> this.Gd = 4)), 0.066F);
/* 14 */       if (v50.Ua0 > 0)
/* 15 */       { So so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 1, so, 0.1F);
/*    */         
/* 17 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 2, so1, 0.1F);
/*    */         
/* 19 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 3, so1, 0.1F);
/*    */         
/* 21 */         eh0.sp0((paramInt, paramsh) -> this.pS = 4, so1, 0.1F)
/* 22 */           .PL(Wz0.OC((paramInt, paramsh) -> this.pS = 0)); }
/* 23 */       else { So so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 29, so, 0.133F);
/*    */         
/* 25 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 30, so1, 0.133F);
/*    */ 
/*    */         
/* 28 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 31, so1, 0.066F).PL(Wz0.OC(GM::G1));
/* 29 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 23, so1, 0.066F);
/*    */         
/* 31 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 24, so1, 0.066F);
/*    */         
/* 33 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 25, so1, 0.1F);
/*    */         
/* 35 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 26, so1, 0.1F);
/*    */         
/* 37 */         so1 = eh0.sp0((paramInt, paramsh) -> this.pS = 27, so1, 0.1F);
/*    */         
/* 39 */         eh0.sp0((paramInt, paramsh) -> this.pS = 28, so1, 0.066F)
/* 40 */           .PL(Wz0.OC((paramInt, paramsh) -> this.pS = 0)); }  so.PL(Wz0.OC((paramInt, paramsh) -> this.XR = null)); so.PL(Wz0.OC(bool::F70)); this
/*    */         
/* 42 */         .XR = (So)so.Kr().mg(km.wI0.pB0); }
/*    */      }
/*    */ 
/*    */   
/*    */   public final void Y00(So paramSo) {
/*    */     this.XR = paramSo;
/*    */     paramSo = paramSo.eC();
/*    */     paramSo = eh0.sp0((paramInt, paramsh) -> this.Gd = 3, paramSo, 0.033F);
/*    */     paramSo = eh0.sp0((paramInt, paramsh) -> this.Gd = 2, paramSo, 0.066F);
/*    */     eh0.sp0((paramInt, paramsh) -> this.Gd = 1, paramSo, 0.033F).PL(Wz0.OC((paramInt, paramsh) -> this.Gd = 0)).Kr();
/*    */   }
/*    */   
/*    */   public GM(nR paramnR, int paramInt) {
/*    */     this.YB = paramInt / 5;
/*    */     this.Tx = paramInt % 5;
/*    */   }
/*    */   
/*    */   public static void LPT6(int paramInt, sh paramsh) {
/*    */     paramInt = 2348;
/*    */     km.pm0.bA0(true, (byte)4, paramInt, 0.0F);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */