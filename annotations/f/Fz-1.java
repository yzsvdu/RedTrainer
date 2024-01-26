/*  1 */ package f;public final class Fz extends Kl0 { public int xg; public final void sM() { this
/*  2 */       .xg = this.Ws.getInt();
/*    */     
/*  4 */     this.V2 = this.Ws.get(); } public byte V2; public Fz(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { ro ro = r8(); int i = this.xg; byte b = this.V2; Kf kf; pA pA; if ((pA = ((R8)this).YG0.MH0) != null && (kf = this.AL) != null && this.Ps == i) { i = 0; boolean bool = false; yn0[] arrayOfYn0; int j; byte b1;
/*  5 */       for (j = (arrayOfYn0 = this.sw).length, b1 = 0; b1 < j; ) { yn0 yn0; if ((yn0 = arrayOfYn0[b1]).ZF0
/*  6 */           .Ly == b) { yn0
/*  7 */             .Tx.sk0(false); yn0.Tx.wI0(false); yn0.jK.sk0(false); yn0.jK.wI0(false); yn0.ZF0
/*  8 */             .T7 = true; }
/*    */          nE0 nE0;
/* 10 */         if (!(nE0 = yn0.ZF0).T7)
/* 11 */         { byte b2; if ((b2 = nE0.Jf) == 0) { i = 1; } else if (b2 == 1) { bool = true; }  }  b1++; }
/* 12 */        Un un2; if ((un2 = this.gk) != null && i == 0) { un2.sk0(false); this.gk.wI0(false); }  Un un1; if ((un1 = this.s9) != null && !bool) { un1.sk0(false); this.s9.wI0(false); this.sC0.sk0(false); this.sC0.wI0(false); }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */