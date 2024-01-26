/* 1 */ package f;public final class xE0 extends Kl0 { public short Jq; public short fd; public final void sM() { boolean bool; this
/* 2 */       .Jq = this.Ws.getShort();
/*   */     
/* 4 */     this.fd = this.Ws.getShort(); if (R00() == 1) { bool = true; } else { bool = false; }  this.W7 = bool; } public boolean W7; public xE0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { ro ro = r8(); short s1 = this.Jq, s2 = this.fd; boolean bool = this.W7; KI kI; xr0 xr0; if ((kI = this.Qa.Jr0()) != null && (xr0 = v50(s1, s2, 0)) != null) { tJ0 tJ0; if (bool) { a4 a4 = xr0.jH();
/* 5 */         this(this, xr0, a4, false, true, false); }
/* 6 */       else { MF.KQ(); fQ fQ; if ((fQ = xr0.Gl) != null) fQ.clear(); 
/* 7 */         a4 a4 = xr0.jH();
/* 8 */         this(this, xr0, a4, true, false, false); }  xr0
/* 9 */         .TL0(tJ0); }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */