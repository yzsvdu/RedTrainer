/*  1 */ package f;public final class Pf0 extends Kl0 { public int Ts0; public final void sM() { boolean bool; this
/*  2 */       .Ts0 = this.Ws.getInt(); if (R00() == 1) { bool = true; } else { bool = false; }  this.Xb = bool; } public boolean Xb; public Pf0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { Oc0 oc0 = (r8()).E50; int i = this.Ts0; boolean bool = this.Xb;
/*    */     CD0 cD0;
/*  4 */     if ((cD0 = (CD0)this.tl0.Z6(i)) != null) { char c; this.zo = true; if (bool) { c = 'ਬ'; } else { c = 'ਭ'; }  if (bool && cD0
/*  5 */         .aT) c = 'ਿ';  cD0
/*  6 */         .aT = bool;
/*  7 */       int j = (int)(System.currentTimeMillis() / 1000L); FV fV;
/*  8 */       (fV = cD0.hY)
/*  9 */         .Wf0 = j;
/* 10 */       km.u4
/*    */         
/* 12 */         .Pq(Ml0.Go(c, fV.Pb)); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */