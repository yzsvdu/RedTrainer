/* 1 */ package f;public final class Zb extends Kl0 { public int L6; public final void sM() { byte b; qk[] arrayOfQk; for (this.L6 = R00(), this.LI0 = new qk[R00()], b = 0; b < (arrayOfQk = this.LI0).length; )
/* 2 */     { int i = this.Ws.getInt();
/* 3 */       String str1 = au(), str2 = au(); arrayOfQk[b] = new qk(i, this
/* 4 */           .Ws.getInt(), str1, str2);
/*   */       
/* 6 */       b++; }  } public qk[] LI0; public Zb(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { if (this.L6 == 0) (r8()).qH0.aux.clear();  QK0 qK0 = (r8()).qH0; getClass(); qk[] arrayOfQk; int i; byte b;
/* 7 */     for (i = (arrayOfQk = this.LI0).length, b = 0; b < i; ) { qk qk1 = arrayOfQk[b]; this.aux
/*   */         
/* 9 */         .put(Integer.valueOf(qk1.uB), qk1); b++; }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */