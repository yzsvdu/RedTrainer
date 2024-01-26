/*  1 */ package f;public final class Nf0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.putInt(this.KR); paramByteBuffer
/*    */       
/*  3 */       .put(this.SK);
/*  4 */     if (this.N50 == null) { paramByteBuffer
/*  5 */         .put((byte)0); } else { byte[] arrayOfByte; Object[] arrayOfObject; paramByteBuffer.put((byte)1); paramByteBuffer
/*    */ 
/*    */         
/*  8 */         .put(this.N50.import); Vg0 vg0;
/*    */       byte b;
/* 10 */       if ((b = (vg0 = this.N50).import) == 1)
/* 11 */       { byte b1; nV nV; if ((nV = vg0.xm) == null) { b1 = -1; }
/* 12 */         else { b1 = b1.nh; }  paramByteBuffer
/* 13 */           .put(b1);
/*    */ 
/*    */         
/* 16 */         paramByteBuffer.put(this.N50.iI0);
/*    */ 
/*    */ 
/*    */         
/* 20 */         paramByteBuffer.put((byte)this.N50.rt.length);
/*    */         short[] arrayOfShort;
/*    */         int j;
/* 23 */         for (int i = (arrayOfShort = this.N50.rt).length; j < i; ) { paramByteBuffer
/* 24 */             .putShort(arrayOfShort[j]); j++; }
/*    */         
/* 26 */         paramByteBuffer
/*    */           
/* 28 */           .put((byte)fm.ir0); Fm fm;
/* 29 */         for (arrayOfByte = fm.pC0, j = (arrayOfObject = (fm = this.N50.Jz0).QG0).length; j-- > 0;) { if ((object = arrayOfObject[j]) != zb0.IM && object != zb0.ET) { byte b2 = arrayOfByte[j]; paramByteBuffer
/*    */ 
/*    */               
/* 32 */               .put(((hR)object).dL);
/* 33 */             paramByteBuffer.put(b2); }  }  } else if (arrayOfObject == 6) { paramByteBuffer
/*    */           
/* 35 */           .put(((Vg0)arrayOfByte).lpt6); }  }  paramByteBuffer
/*    */       
/* 37 */       .putShort(this.vF0);
/*    */     
/* 39 */     paramByteBuffer.put(this.gS); }
/*    */ 
/*    */   
/*    */   public int KR;
/*    */   public byte SK;
/*    */   public Vg0 N50;
/*    */   public short vF0;
/*    */   public byte gS;
/*    */   
/*    */   public Nf0(int paramInt, byte paramByte1, Vg0 paramVg0, short paramShort, byte paramByte2) {
/*    */     super(152);
/*    */     this.KR = paramInt;
/*    */     this.SK = paramByte1;
/*    */     this.N50 = paramVg0;
/*    */     this.vF0 = paramShort;
/*    */     this.gS = paramByte2;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nf0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */