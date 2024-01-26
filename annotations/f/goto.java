/*  1 */ package f;public final class goto extends Kl0 { public int Ff; public short fF0; public final void sM() { boolean bool; this
/*  2 */       .Ff = this.Ws.getInt();
/*    */     
/*  4 */     this.fF0 = this.Ws.getShort(); if (R00() == 1) { bool = true; } else { bool = false; }  this.ZP = bool; } public boolean ZP; public goto(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { Hb0 hb0; j40 j40; if ((j40 = r8().s40(aq0.LI).de0(this.Ff)) == null && (j40 = r8().s40(aq0.XJ0).de0(this.Ff)) == null) { if ((r8()).Ld != null) j40 = (r8()).Ld.ou().de0(this.Ff);  if (j40 == null) return;  }  if ((j40
/*  5 */       .cY = this.fF0) < 1)
/*  6 */       return;  Gp0 gp0; if ((gp0 = km.MR) == null) { this(j40, this.ZP); (Lj.f40())
/*  7 */         .Oq0.add(hb0);
/*  8 */       km.MR = Lj.f40(); } else { this(j40, this.ZP); ((Gp0)hb0)
/*  9 */         .Oq0
/* 10 */         .add(hb0); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/goto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */