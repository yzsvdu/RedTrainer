/* 1 */ package f;public final class Hh0 extends Kl0 { public jc[] jn; public Hh0(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { short s; for (this.jn = new jc[R00()], s = 0; s < this.jn.length; ) { short s1; if ((s1 = this.Ws.getShort()) >= 0)
/* 2 */       { jc jc1; this
/* 3 */           .Ws.getInt();
/* 4 */         this(s1); this.jn[s] = jc1; this.jn[s].Cq(k60()); }  s = (short)(s + 1); }  } public final void Dl0() { qa0 qa0; if ((qa0 = km.u4.II) == null) return;  jc[] arrayOfJc = this.jn; if (qa0.gb == null) qa0.gb = new jc[qa0.KX];  int i; byte b; for (i = this.length, b = 0; b < i; ) { jc jc1; if ((jc1 = this[b]) != null) qa0.gb[jc1.M7] = jc1; 
/* 5 */       b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void Cx() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */