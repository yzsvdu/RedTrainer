/*  1 */ package f;public final class nj0 extends GS implements Np0 { public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) { int i = 0; byte b1; if ((b1 = this.lPt6) == 2 || b1 == 16) { paramBoolean2 = true; } else { paramBoolean2 = false; }  if (paramBoolean2) { i = 4; } else { if (b1 == 4 || b1 == 32) { b1 = 1; } else { b1 = 0; }  if (b1 != 0) i = 8;  }
/*    */     
/*  3 */     Wl wl = km.wI0.K7;
/*    */ 
/*    */     
/*  6 */     PE pE = km.MR.a0(this.Rp0); byte b2;
/*  7 */     if ((b2 = this.lPt6) == 1 || b2 == 16 || b2 == 32) {  } else {  }
/*  8 */      if (false) { WD wD = yk0.cw().mP(paramShort);
/*  9 */       if (O5.AU
/* 10 */         .yG0
/*    */         
/* 12 */         .Fb(wD.HA)) {
/*    */         
/* 14 */         byte b = this.Rp0; O5.AU.getClass();
/*    */         wb wb;
/* 16 */         (wb = O5.AU.xa(paramhm02, wD.HA))
/* 17 */           .XW = b;
/* 18 */         O5.AU.xa(paramhm02, wD.HA).tS();
/* 19 */         paramkf.t80(wb);
/* 20 */       }  i += 148;
/*    */       
/* 22 */       paramkf.Kq(Ml0.Qf0(F40.ef0, 15, paramkf.AD.iD(i, this.Rp0))); if (pE != null) { if (paramShort != 191) { if (paramShort != 390) { if (paramShort == 446) pE
/* 23 */                 .Y20 = 1;  }
/* 24 */           else { if ((i = (byte)(pE.Vn + 1)) > 2) i = 2;  pE
/* 25 */               .Vn = i; }  }
/* 26 */         else { if ((i = (byte)(pE.Dq0 + 1)) > 3) i = 3;  pE
/* 27 */             .Dq0 = i; }  wl
/*    */           
/* 29 */           .yw0(this.Rp0, paramShort); }  }
/* 30 */     else { i += 150;
/*    */       
/* 32 */       paramkf.Kq(Ml0.Qf0(F40.ef0, 15, paramkf.AD.iD(i, this.Rp0))); if (pE != null) {
/* 33 */         if ((i = this.lPt6) == 1 || i == 0) {  } else {  }  if (false) { pE
/* 34 */             .Dq0 = 0;
/*    */           
/* 36 */           wl.yw0(this.Rp0, (short)191); }
/* 37 */          if ((i = this.lPt6) == 2 || i == 16) { i = 1; } else { i = 0; }  if (i != 0) { pE
/* 38 */             .Vn = 0;
/*    */           
/* 40 */           wl.yw0(this.Rp0, (short)390); }
/* 41 */          if ((i = this.lPt6) == 4 || i == 32) { i = 1; } else { i = 0; }  if (i != 0) { pE
/* 42 */             .Y20 = 0;
/*    */           
/* 44 */           wl.yw0(this.Rp0, (short)446); }
/*    */       
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final byte Rp0;
/*    */   public final byte lPt6;
/*    */   
/*    */   public nj0(byte paramByte1, byte paramByte2) {
/*    */     this.Rp0 = paramByte1;
/*    */     this.lPt6 = paramByte2;
/*    */   }
/*    */   
/*    */   public final byte YG0() {
/*    */     return 25;
/*    */   }
/*    */   
/*    */   public final boolean Lt() {
/*    */     return false;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */