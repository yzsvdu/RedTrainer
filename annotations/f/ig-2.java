/* 1 */ package f;public final class ig extends S { public final T7 zz(int paramInt) { int j, k = this.l30.getInt(this.Pd.Ex + 12 + (j = paramInt * 8)); ByteBuffer byteBuffer = this.l30;
/* 2 */     int i = k + this.B10; j = WW.Rq0(this.Pd.Ex, 12, 4, j, byteBuffer) - k; T7 t7 = new T7(); HI hI = this.XA;
/* 3 */     String[] arrayOfString = nN.Wj; if (paramInt < 400) { str = arrayOfString[paramInt]; } else { str = Integer.toString(paramInt); }  paramInt = (short)paramInt;
/* 4 */     this(hI, str, i, j, paramInt); String str; t7.db = "";
/*   */     return t7; }
/*   */ 
/*   */   
/*   */   public HI XA;
/*   */   public ByteBuffer l30;
/*   */   public E60 Pd;
/*   */   public int B10;
/*   */   
/*   */   public ig(T7 paramT7) {
/*   */     this.B1 = "";
/*   */     this.Dz = 0;
/*   */     this.XA = paramT7.Sh0();
/*   */     this.l30 = byteBuffer;
/*   */     ByteBuffer byteBuffer;
/*   */     (byteBuffer = paramT7.Sh0().GA0()).position(paramT7.XL);
/*   */     (new FA0(this.l30)).sV(1129464142);
/*   */     this.Pd = new E60(this.l30);
/*   */     this.l30.getInt();
/*   */     int i = this.l30.getInt();
/*   */     this.B10 = this.l30.position() + i;
/*   */   }
/*   */   
/*   */   public final int size() {
/*   */     return this.Pd.dh0;
/*   */   }
/*   */   
/*   */   public final T7 Em0(int paramInt) {
/*   */     return zz(paramInt);
/*   */   }
/*   */   
/*   */   public final Iterator iterator() {
/*   */     return new rG(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */