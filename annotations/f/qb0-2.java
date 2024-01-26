/* 1 */ package f;public final class qb0 extends Kl0 { public final void sM() { this
/* 2 */       .K30 = this.Ws.get(); if (R00() == 1) { i = 1; } else { i = 0; }  int i; byte b; for (this.Bg0 = i, this.a7 = new int[i = R00()], this.qu = new String[i], b = 0; b < i; ) { this.a7[b] = this
/* 3 */         .Ws.getInt();
/* 4 */       this.qu[b] = au(); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public byte K30;
/*   */   public boolean Bg0;
/*   */   public String[] qu;
/*   */   public int[] a7;
/*   */   
/*   */   public qb0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     ro ro = r8();
/*   */     boolean bool = true;
/*   */     byte b = this.K30;
/*   */     boolean bool1 = this.Bg0;
/*   */     String[] arrayOfString = this.qu;
/*   */     int[] arrayOfInt = this.a7;
/*   */     pA pA;
/*   */     if ((pA = ((R8)this).YG0.MH0) != null)
/*   */       SR(bool, b, bool1, arrayOfString, arrayOfInt); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */