/*  1 */ package f;public abstract class Az0 extends e6 { public static void Cn0(ByteBuffer paramByteBuffer, H10 paramH10) { paramByteBuffer
/*  2 */       .put(paramH10.goto); short s = 0; Vp0[] arrayOfVp0; int i; byte b;
/*  3 */     for (i = (arrayOfVp0 = Vp0.Jo).length, b = 0; b < i; ) { byte b1; Vp0 vp0; if (paramH10.Hb(vp0 = arrayOfVp0[b]) != H10.tM[
/*  4 */           b1 = vp0.gw0] || 
/*  5 */         paramH10
/*  6 */         .Kw0[b1] != 
/*  7 */         0) s = (short)(s | 1 << b1);  b++; }  paramByteBuffer
/*  8 */       .putShort(s);
/*  9 */     for (i = (arrayOfVp0 = Vp0.Jo).length, b = 0; b < i; ) {
/* 10 */       byte b1 = (arrayOfVp0[b]).gw0; if ((s & 1 << b1) != 0)
/*    */       
/* 12 */       { b1 = paramH10.Kw0[b1];
/* 13 */         paramByteBuffer.putShort((short)(paramH10.Hd0[b1] & 0x3FF | (b1 & 0x3F) << 10)); }  b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public Az0(int paramInt) {
/*    */     super(paramInt);
/*    */   }
/*    */   
/*    */   public Az0() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Az0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */