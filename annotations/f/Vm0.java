/*  1 */ package f;public final class Vm0 extends Kl0 { public int QN; public final void sM() { boolean bool; this
/*  2 */       .QN = this.Ws.getInt(); if (R00() == 1) { bool = true; } else { bool = false; }  byte b; nl[] arrayOfNl; for (this.dd0 = new nl[R00()], b = 0; b < (arrayOfNl = this.dd0).length; )
/*  3 */     { nl nl1; byte b1 = this.Ws.get(); nl[] arrayOfNl1;
/*  4 */       int i = (arrayOfNl1 = nl.Wt0).length; byte b2 = 0; while (true) { if (b2 < i) { nl nl2; if ((nl2 = arrayOfNl1[b2]).SB == b1 && nl2.s50 == bool) break;  b2++; continue; }  nl1 = null; break; }  arrayOfNl[b] = nl1;
/*  5 */       b++; }  } public nl[] dd0; public Vm0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { int i; if ((i = this.QN) == -1) { wJ0.Nf0.rq(this.dd0); return; }  if (i == -2) { (r8()).Qa.Ct.Ae
/*  6 */         .pm
/*  7 */         .Kk(this.dd0); return; }
/*    */      tc tc;
/*  9 */     if ((tc = (r8()).Qa.Xb(this.QN)) == null) return;  tc
/* 10 */       .pm
/* 11 */       .Kk(this.dd0); }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */