/* 1 */ package f;public final class XH extends sK { public final boolean fy(Q90 paramQ90, UD0 paramUD0) { S80[] arrayOfS80; if ((arrayOfS80 = this.ww0) != null && paramQ90 != null) { int i; byte b; int j; byte b1; S80 s80; hR hR; for (i = 0, b = this.mc0, j = arrayOfS80.length, b1 = 0; b1 < j && (
/* 2 */         hR = (s80 = arrayOfS80[b1]).IL) != null; )
/* 3 */       { int k = 1 << hR.dL;
/* 4 */         if (s80.fy(paramQ90, null)) { if ((i & k) != 0 && (b = (byte)(b - 1)) == 0) { i = 1; // Byte code: goto -> 110 }  i ^= k; }  b1++; }  }  return false; }
/*   */ 
/*   */   
/*   */   public S80[] ww0;
/*   */   public byte mc0;
/*   */   
/*   */   public XH(S80[] paramArrayOfS80, byte paramByte) {
/*   */     super((byte)19);
/*   */     this.ww0 = paramArrayOfS80;
/*   */     this.mc0 = paramByte;
/*   */   }
/*   */   
/*   */   public final int a7() {
/*   */     return this.mc0;
/*   */   }
/*   */   
/*   */   public final void K10(ByteBuffer paramByteBuffer) {
/*   */     paramByteBuffer.put(this.ak);
/*   */     paramByteBuffer.put(this.mc0);
/*   */     paramByteBuffer.put((byte)this.ww0.length);
/*   */     S80[] arrayOfS80;
/*   */     int i = (arrayOfS80 = this.ww0).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       this[b].K10(paramByteBuffer); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */