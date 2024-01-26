/* 1 */ package f;public final class IP extends UA { public final void Vt(String[] paramArrayOfString) { String str; byte b; for (str = "", b = 1; b < paramArrayOfString.length; ) {
/*   */       
/* 3 */       str = B40.df(this).append(paramArrayOfString[b]).toString(); if (b != paramArrayOfString.length)
/* 4 */         str = m0.tF0(this, " ");  b++;
/* 5 */     }  if (length() != 0) km.u4.lF(this);  }
/*   */ 
/*   */   
/*   */   public IP() {
/*   */     super("say");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */