/* 1 */ package f;public final class lj0 { public final int K40() { int i = js0(); switch (this.wW) { default: b = 0; return b * i;case 8: b = 3; return b * i;case 7: b = 4; return b * i;case 3: case 4: case 5: case 9: b = 2; return b * i;case 0: case 1: break; }  byte b = 1; return b * i; }
/*   */ 
/*   */   
/*   */   public byte interface;
/*   */   public final short Pu0;
/*   */   public byte iC0;
/*   */   public byte wW;
/*   */   public byte kq0;
/*   */   public final short[] tJ;
/*   */   public boolean pf0 = false;
/*   */   public boolean vh;
/*   */   
/*   */   public lj0(byte paramByte, ByteBuffer paramByteBuffer) {
/*   */     this.vh = true;
/*   */     this.interface = paramByte;
/*   */     this.Pu0 = s;
/*   */     paramByteBuffer.get(new byte[16]);
/*   */     String str1 = ed.LJ0(new byte[16]);
/*   */     Ml0.TP(s + 290000, str1);
/*   */     this.iC0 = paramByteBuffer.get();
/*   */     this.wW = paramByteBuffer.get();
/*   */     this.kq0 = paramByteBuffer.get();
/*   */     paramByteBuffer.getInt();
/*   */     int i = pN.tx0(paramByteBuffer.getInt());
/*   */     String str2 = ed.j00(pN.tx0(paramByteBuffer.getInt()), paramByteBuffer);
/*   */     short s;
/*   */     Ml0.TP((s = (short)paramByteBuffer.get()) + 295000, str2);
/*   */     int j = paramByteBuffer.position();
/*   */     paramByteBuffer.position(i);
/*   */     i = K40();
/*   */     if (this.iC0 == 4)
/*   */       i = 1; 
/*   */     this.tJ = new short[i];
/*   */     short[] arrayOfShort;
/*   */     for (i = 0; i < (arrayOfShort = this.tJ).length; i++)
/*   */       arrayOfShort[i] = paramByteBuffer.getShort(); 
/*   */     paramByteBuffer.position(j);
/*   */   }
/*   */   
/*   */   public lj0(short paramShort, boolean paramBoolean) {
/*   */     this.interface = 0;
/*   */     this.Pu0 = paramShort;
/*   */     this.vh = paramBoolean;
/*   */     this.iC0 = 0;
/*   */     this.wW = 0;
/*   */     this.kq0 = 0;
/*   */     short[] arrayOfShort;
/*   */     (arrayOfShort = new short[1])[0] = 0;
/*   */     this.tJ = this;
/*   */   }
/*   */   
/*   */   public final byte ae() {
/*   */     return this.interface;
/*   */   }
/*   */   
/*   */   public final String s60() {
/*   */     return !this.vh ? Ml0.OH0(1450) : Ml0.OH0(this.Pu0 + 290000);
/*   */   }
/*   */   
/*   */   public final int js0() {
/*   */     switch (this.wW) {
/*   */       default:
/*   */         return 0;
/*   */       case 9:
/*   */         return 3;
/*   */       case 8:
/*   */         return 3;
/*   */       case 7:
/*   */         return 2;
/*   */       case 5:
/*   */         return 1;
/*   */       case 4:
/*   */         return 2;
/*   */       case 3:
/*   */         return 4;
/*   */       case 1:
/*   */         return 2;
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     return 1;
/*   */   }
/*   */   
/*   */   public final void wn0() {
/*   */     byte b = 10;
/*   */     char c = 'Ó';
/*   */     short[] arrayOfShort;
/*   */     if ((arrayOfShort = this.tJ).length < 1)
/*   */       return; 
/*   */     this.interface = b;
/*   */     arrayOfShort[0] = c;
/*   */     this.pf0 = true;
/*   */   }
/*   */   
/*   */   public final void Z20() {
/*   */     this.iC0 = 5;
/*   */   }
/*   */   
/*   */   public final void yQ() {
/*   */     this.wW = 0;
/*   */   }
/*   */   
/*   */   public final void HU() {
/*   */     this.kq0 = 2;
/*   */   }
/*   */   
/*   */   public final short x5() {
/*   */     short[] arrayOfShort;
/*   */     return (!this.pf0 && this.iC0 != 4) ? 0 : (((arrayOfShort = this.tJ).length < 1) ? 0 : this[0]);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */