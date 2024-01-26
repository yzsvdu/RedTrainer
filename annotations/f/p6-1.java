/*  1 */ package f;public final class p6 extends Kl0 { public int Gk; public Vp0 Lf; public final void sM() { boolean bool; this
/*  2 */       .Gk = this.Ws.getInt(); this.Lf = Vp0.cOm1(R00());
/*    */     
/*  4 */     this.rI0 = this.Ws.getShort();
/*  5 */     if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  this
/*  6 */       .jY = bool; } public short rI0; public boolean jY; public p6(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { tc tc; if ((tc = (r8()).Qa.Xb(this.Gk)) == null || !(tc instanceof Jo)) return;  if (km.pm0 == null) return;  if (((Jo)(tc = tc)).lB0.JM(this.Lf) == this.rI0) { float f; if (km.MR != null) this.jY = false;  if (this.jY) { km.pm0.getClass(); f = VD0.xz0(tc); } else { f = 0.0F; }  if (f > 0.0F && 
/*  7 */         (r8()).Qa
/*  8 */         .yD != this
/*  9 */         .Gk && !km.pm0.c7()) f = 0.0F; 
/* 10 */       OE0 oE0 = ((Jo)tc).lB0;
/* 11 */       oE0
/* 12 */         .ew0[this.Lf
/* 13 */           .gw0]
/*    */         
/* 15 */         .f3(this.rI0, f); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/p6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */