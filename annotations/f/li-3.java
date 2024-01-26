/*  1 */ package f;public final class li extends Kl0 { public int Up; public boolean t20; public final void sM() { boolean bool; this
/*  2 */       .Up = this.Ws.getInt(); if (R00() == 1) { bool = true; } else { bool = false; }  this.t20 = bool; this.LPT6 = ZV(); } public H10 LPT6; public li(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { int i = this.Up; boolean bool = this.t20; H10 h10 = this.LPT6; vh0 vh0; Jo jo;
/*  3 */     if ((jo = (vh0 = (r8()).Qa).Ct) != null && vh0
/*  4 */       .yD == i) { (bool ? 
/*  5 */         jo.lB0
/*  6 */         .PQ : 
/*  7 */         jo.lB0
/*  8 */         .Xu)
/*  9 */         .ul(h10); vh0.Ct
/* 10 */         .lB0
/* 11 */         .getClass();
/* 12 */       vh0.Ct.lB0.tx = new UX[Vp0.Jo.length]; }
/* 13 */     else { tc tc; if (tc = (tc)vh0.KO.get(Integer.valueOf(i)) instanceof Jo) { tc = this; (bool ? 
/* 14 */           ((Jo)this).lB0
/* 15 */           .PQ : 
/* 16 */           ((Jo)this).lB0
/* 17 */           .Xu)
/* 18 */           .ul(h10); ((Jo)this)
/* 19 */           .lB0
/* 20 */           .getClass();
/* 21 */         ((Jo)this).lB0.tx = new UX[Vp0.Jo.length]; }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/li.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */