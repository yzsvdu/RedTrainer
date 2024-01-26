/* 1 */ package f;public final class ja0 { public final String A2(byte paramByte, String paramString) { byte[] arrayOfByte; if (paramByte < 0 || paramByte >= (arrayOfByte = this.mD0).length)
/* 2 */       return ""; 
/*   */     if ((paramByte = arrayOfByte[paramByte]) == 0 || paramByte == 5)
/*   */       return paramString; 
/*   */     this.Hy.getClass();
/*   */     return Ml0.tG((byte)2, F40.ef0, 198, paramByte, Ml0.EH0); }
/*   */ 
/*   */   
/*   */   public Wo Hy;
/*   */   public int Gu;
/*   */   public byte[] mD0;
/*   */   public byte[] GO;
/*   */   public byte[] b;
/*   */   public byte[] JK0;
/*   */   
/*   */   public ja0(Wo paramWo, int paramInt) {
/*   */     B9 b91;
/*   */     B9 b92;
/*   */     this.mD0 = new byte[4];
/*   */     this.GO = new byte[4];
/*   */     if (paramInt < 1 || paramInt > 6)
/*   */       paramInt = 1; 
/*   */     this.Hy = paramWo;
/*   */     this.Gu = paramInt;
/*   */     byteBuffer.get(this.mD0);
/*   */     ByteBuffer byteBuffer;
/*   */     (byteBuffer = (new ig(paramWo.Vz().B8("/a/1/3/1"))).Em0(paramInt + 62).l2()).get(this.GO);
/*   */     this();
/*   */     this();
/*   */     while (byteBuffer.remaining() > 3 && byteBuffer.get() == 1) {
/*   */       b92.Be(byteBuffer.get());
/*   */       b91.Be(byteBuffer.get());
/*   */       byteBuffer.get();
/*   */     } 
/*   */     this.b = b91.m9();
/*   */     this.JK0 = b92.m9();
/*   */   }
/*   */   
/*   */   public final byte Wr0(int paramInt) {
/*   */     if (paramInt < 0 || paramInt >= this.mD0.length)
/*   */       paramInt = 3; 
/*   */     return this.mD0[paramInt];
/*   */   }
/*   */   
/*   */   public final byte rq0(int paramInt) {
/*   */     if (paramInt < 0 || paramInt >= this.GO.length)
/*   */       paramInt = 3; 
/*   */     return this.GO[paramInt];
/*   */   }
/*   */   
/*   */   public final int COM3(int paramInt, byte paramByte) {
/*   */     switch (Wr0(paramInt)) {
/*   */       default:
/*   */         return 0;
/*   */       case 4:
/*   */         return 5;
/*   */       case 2:
/*   */         return 4;
/*   */       case 1:
/*   */         return 3;
/*   */       case 0:
/*   */       case 5:
/*   */         break;
/*   */     } 
/*   */     return (paramByte == 0) ? 2 : 1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ja0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */