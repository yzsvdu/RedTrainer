/*  1 */ package f;public final class Xe0 implements q5 { public final void AB0(int paramInt) { R8 r8 = km.u4; paramInt = this.kP.OB; short s = (short)paramInt; int i = 0, j = 1; short[] arrayOfShort1; (arrayOfShort1 = new short[10])[i] = s; Lpt4[] arrayOfLpt4;
/*    */     byte b;
/*  3 */     for (i = (arrayOfLpt4 = this.kP.LpT6).length, b = 0; b < i; )
/*  4 */     { short s1; if ((s1 = (arrayOfLpt4[b]).hC0) >= 1) { int k; if ((k = j + 1) > arrayOfShort1.length)
/*  5 */         { arrayOfShort1 = new short[Math.max(arrayOfShort1.length << 1, k)]; int m = arrayOfShort1.length; System.arraycopy(arrayOfShort1, 0, arrayOfShort1, 0, m); }  arrayOfShort1[j] = s1;
/*  6 */         j = k; }  b++; }  boolean bool = false;
/*  7 */     short[] arrayOfShort2 = new short[j]; if (j != 0) if (j > 0) {
/*  8 */         System.arraycopy(arrayOfShort1, bool, arrayOfShort2, 0, j);
/*    */       }
/*    */       else {
/*    */         
/* 12 */         throw new ArrayIndexOutOfBoundsException(bool);
/*    */       }  
/*    */     byte[] arrayOfByte;
/*    */     for (ShortBuffer shortBuffer = ByteBuffer.wrap(arrayOfByte = new byte[j * 2]).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer(); b < j; ) {
/*    */       shortBuffer.put(arrayOfShort2[b]);
/*    */       b++;
/*    */     } 
/*    */     r8.N7(paramInt, arrayOfByte);
/*    */     this.kP.ra0(); }
/*    */ 
/*    */   
/*    */   public Xe0(XI paramXI) {}
/*    */   
/*    */   public final void run() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xe0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */