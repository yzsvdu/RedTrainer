/* 1 */ package f;public final class SS extends Kl0 { public int BR; public byte Ts; public final void sM() { this
/* 2 */       .BR = this.Ws.getInt();
/* 3 */     if ((this
/* 4 */       .Ts = this.Ws.get()) == 0) this.Rh0 = au();  } public String Rh0 = ""; public SS(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void Cx() { String str; j40 j40; if ((j40 = r8().s40(aq0.LI).de0(this.BR)) == null && (j40 = r8().s40(aq0.XJ0).de0(this.BR)) == null && (r8()).Ld != null) j40 = (r8()).Ld.ou().de0(this.BR);  if (j40 == null) { str = ""; } else { str = j40.m(); }  if (this.Ts != 0 || !this.Rh0.isEmpty()) r8().Pq(Ml0.sB(this.Ts + 6100, new String[] { str, this.Rh0 }));  if (this.Ts == 0) {
/* 5 */       j40.Zs
/*   */         
/* 7 */         .nr = this.Rh0;
/* 8 */       r8().W0(j40);
/*   */     }  }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/SS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */