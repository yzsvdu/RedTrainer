/*  1 */ package f;public final class cOM1 extends ZK0 { public final void Uk0(tc paramtc, xr0 paramxr0) { paramtc.getClass(); if (!(paramtc instanceof zk0) && paramxr0
/*  2 */       .EA0() && !km.wI0.Oo0()) { S10 s10; if (this.jB0)
/*  3 */       { boolean bool1; if (L70.gq
/*  4 */           .fu() == 3) { bool1 = true; } else { bool1 = false; }  if (!bool1)
/*  5 */           return;  }  KI kI; if ((kI = paramxr0.Q4())
/*  6 */         .E10 == 3) { bool = true; } else { bool = false; }  if (bool && (kI
/*  7 */         .Xg0() == 311 || kI.Xg0() == 411))
/*  8 */       { boolean bool1; if (L70.gq
/*  9 */           .fu() == 3) { bool1 = true; } else { bool1 = false; }  if (!bool1) return;  }  Jo jo; if (paramtc instanceof Jo && 
/* 10 */         (jo = (Jo)paramtc)
/* 11 */         .Ml == 10 && jo
/* 12 */         .com5 == 285)
/* 13 */         return;  int i = this.Gy;
/*    */       
/* 15 */       byte b1 = paramtc.HW.g50;
/* 16 */       byte b2 = paramtc.HW.ZJ0;
/* 17 */       boolean bool = paramtc.XC(); this(i, b1, b2, bool); paramxr0.TL0(s10); }
/*    */      }
/*    */ 
/*    */   
/*    */   public int Gy;
/*    */   public boolean jB0;
/*    */   public e2 lpT9;
/*    */   
/*    */   public cOM1(int paramInt) {
/*    */     e2 e21;
/*    */     this(125);
/*    */     this.lpT9 = this;
/*    */     this.Gy = paramInt;
/*    */     this.jB0 = false;
/*    */   }
/*    */   
/*    */   public cOM1() {
/*    */     e2 e21;
/*    */     this(125);
/*    */     this.lpT9 = this;
/*    */     this.Gy = 3;
/*    */     this.jB0 = true;
/*    */   }
/*    */   
/*    */   public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) {
/*    */     paramtc.getClass();
/*    */     if (!(paramtc instanceof zk0) && paramxr01.EA0()) {
/*    */       boolean bool;
/*    */       if (this.jB0) {
/*    */         if (L70.gq.fu() == 3) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         if (!bool)
/*    */           return false; 
/*    */       } 
/*    */       KI kI;
/*    */       if ((kI = paramxr01.Q4()).E10 == 3) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool && (kI.Xg0() == 311 || kI.Xg0() == 411)) {
/*    */         boolean bool1;
/*    */         if (L70.gq.fu() == 3) {
/*    */           bool1 = true;
/*    */         } else {
/*    */           bool1 = false;
/*    */         } 
/*    */         if (!bool1)
/*    */           return false; 
/*    */       } 
/*    */       if (paramtc.D4() == 285 || paramtc.D4() == 2850)
/*    */         return false; 
/*    */       if (paramtc.Pf() && this.lpT9.Po0())
/*    */         km.pm0.dv((byte)2, cOm3.bl0(this.Gy), true, 0.0F, 0.35F, 0); 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public final boolean Ud() {
/*    */     return (this.Gy == 2) ? false : super.Ud();
/*    */   }
/*    */   
/*    */   public final int Pt(boolean paramBoolean) {
/*    */     return (paramBoolean && this.Gy == 2) ? 600 : 0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cOM1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */