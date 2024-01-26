/* 1 */ package f;public final class Hx0 { public byte[] wX; public int Pu; public boolean iP; public final byte[] Vm(int paramInt) { if (paramInt >= 0) { if ((paramInt = this.Pu + paramInt) > this.wX.length) { paramInt = Math.min(this.Pu, paramInt); System.arraycopy(this.wX, 0, arrayOfByte, 0, paramInt); byte[] arrayOfByte = new byte[paramInt = Math.max(Math.max(8, paramInt), (int)(this.Pu * 1.75F))]; }
/* 2 */        return this.wX; }  throw new IllegalArgumentException(
/* 3 */         XD0.SD0("additionalCapacity must be >= 0: ", paramInt)); } public final String toString() { if (this.Pu == 0) return "[]";  byte[] arrayOfByte = this.wX; this(32); ag.yd0('['); Ag ag; (ag = new Ag()).Td(arrayOfByte[0]); for (byte b = 1; b < this.Pu; ) { ag.V9(", ");
/* 4 */       ag.Td(arrayOfByte[b]); b++; }  ag
/* 5 */       .yd0(']');
/* 6 */     return ag.toString(); }
/*   */ 
/*   */   
/*   */   public final int hashCode() {
/*   */     if (!this.iP)
/*   */       return super.hashCode(); 
/*   */     byte[] arrayOfByte = this.wX;
/*   */     int i = 1;
/*   */     byte b = 0;
/*   */     int j = this.Pu;
/*   */     while (b < j) {
/*   */       i = i * 31 + this[b];
/*   */       b++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final boolean equals(Object paramObject) {
/*   */     if (paramObject == this)
/*   */       return true; 
/*   */     if (!this.iP)
/*   */       return false; 
/*   */     if (!(paramObject instanceof Hx0))
/*   */       return false; 
/*   */     if (!((Hx0)(paramObject = paramObject)).iP)
/*   */       return false; 
/*   */     int i;
/*   */     if ((i = this.Pu) != ((Hx0)paramObject).Pu)
/*   */       return false; 
/*   */     byte[] arrayOfByte = this.wX;
/*   */     paramObject = ((Hx0)paramObject).wX;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       if (this[b] != paramObject[b])
/*   */         return false; 
/*   */     } 
/*   */     return true;
/*   */   }
/*   */   
/*   */   public Hx0() {
/*   */     this(true, 16);
/*   */   }
/*   */   
/*   */   public Hx0(int paramInt) {
/*   */     this(true, paramInt);
/*   */   }
/*   */   
/*   */   public Hx0(boolean paramBoolean, int paramInt) {
/*   */     this.iP = paramBoolean;
/*   */     this.wX = new byte[paramInt];
/*   */   }
/*   */   
/*   */   public Hx0(Hx0 paramHx0) {
/*   */     this.iP = paramHx0.iP;
/*   */     this.Pu = i;
/*   */     int i;
/*   */     byte[] arrayOfByte = new byte[i = paramHx0.Pu];
/*   */     System.arraycopy(paramHx0.wX, 0, this, 0, i);
/*   */   }
/*   */   
/*   */   public Hx0(byte[] paramArrayOfbyte) {
/*   */     this(true, paramArrayOfbyte, 0, i);
/*   */   }
/*   */   
/*   */   public Hx0(boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*   */     this(paramBoolean, paramInt2);
/*   */     this.Pu = paramInt2;
/*   */     System.arraycopy(paramArrayOfbyte, paramInt1, this.wX, 0, paramInt2);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hx0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */