/*   */ package f;public final class O50 { public final String toString() { String str; byte b;
/* 2 */     for (str = B40.df("Vendor: ").append(new String(this.EB0, 0, this.EB0.length - 1)).toString(), b = 0; b < this.WO; ) {
/*   */       
/* 4 */       str = zw.vz(str, "\nComment: ").append(new String(this.az[b], 0, (this.az[b]).length - 1)).toString(); b++;
/* 5 */     }  return m0.tF0(str, "\n"); }
/*   */ 
/*   */   
/*   */   public byte[][] az;
/*   */   public int[] Cs;
/*   */   public int WO;
/*   */   public byte[] EB0;
/*   */   
/*   */   static {
/*   */     "vorbis".getBytes();
/*   */     "Xiphophorus libVorbis I 20000508".getBytes();
/*   */   }
/*   */   
/*   */   public final void HZ() {
/*   */     for (byte b = 0; b < this.WO; b++)
/*   */       this.az[b] = null; 
/*   */     this.az = null;
/*   */     this.EB0 = null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/O50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */