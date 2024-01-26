/* 1 */ package f;public final class ys extends Kl0 { public final void sM() { short[] arrayOfShort1; byte b; short[] arrayOfShort2; for (this
/* 2 */       .rm0 = arrayOfShort1 = new short[this.Ws.get()], this.dp0 = new boolean[arrayOfShort1.length], b = 0; b < (arrayOfShort2 = this.rm0).length; ) { boolean bool; arrayOfShort2[b] = this
/* 3 */         .Ws.getShort();
/* 4 */       boolean[] arrayOfBoolean = this.dp0;
/* 5 */       if (this.Ws.get() == 1) { bool = true; } else { bool = false; }  arrayOfBoolean[b] = bool;
/* 6 */       b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public short[] rm0;
/*   */   public boolean[] dp0;
/*   */   
/*   */   public ys(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     R8 r8;
/*   */     if ((r8 = km.u4) != null) {
/*   */       short[] arrayOfShort = this.rm0;
/*   */       boolean[] arrayOfBoolean = this.dp0;
/*   */       r8.GN = this;
/*   */       r8.PM = arrayOfBoolean;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ys.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */