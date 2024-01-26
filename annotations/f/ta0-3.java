/* 1 */ package f;public final class ta0 { public final void eI() { this(); H80 h801; Nn nn1; RE0 rE01; Nn nn2; H80 h802; RE0 rE02; this();
/* 2 */     this(); this();
/* 3 */     byte[] arrayOfByte = new byte[4]; this.COM8.get(arrayOfByte); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getInt(); this.COM8.getInt(); int j = this.COM8.getInt(); this.COM8.getInt(); this.COM8.get(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getInt(); int k; if ((k = this.COM8.get() & 0xFF) < 0) { System.out.println("NUM OBJECTS NEGATIVE!"); return; }  byte b4; for (h801.ck0 = new short[k], h801.jB = new short[k], b4 = 0; b4 < k; ) { h801.ck0[b4] = this.COM8.getShort(); h801.jB[b4] = this.COM8.getShort(); b4++; }  this.COM8.getShort(); this.COM8.getShort(); byte b1; for (rE01.mx0 = new Object[k], b1 = 0; b1 < k; ) { this(); this.COM8.getShort(); xL.COm7 = this.COM8.getShort(); this.COM8.get(); xL.E5 = this.COM8.get(); this.COM8.get(); this.COM8.get(); xL xL; byte b = (byte)((xL = new xL()).COm7 >> 10 & 0x7); short s1 = (short)(byte)(8 << ((xL = new xL()).COm7 >> 7 & 0x7)); xL.OU = s2; short s2; if ((s2 = (short)(byte)(8 << ((xL = new xL()).COm7 >> 4 & 0x7))) < 0) xL.OU = (short)-s2;  if (s1 < 0) xL.BS = (short)-s1;  if (xL.OU == 0) if ((xL.E5 & 0x3) != 2) { xL.OU = 256; } else { xL.OU = 512; }   if (xL.BS == 0) if ((xL.E5 >> 4 & 0x3) != 2) { xL.BS = 256; } else { xL.BS = 512; }   wo[b]; if (b == 5) xL.OU * xL.BS / 8;  rE01.mx0[b1] = xL; b1++; }  this(k); byte b2; for (b2 = 0; b2 < k; ) { byte[] arrayOfByte1; this.COM8
/* 4 */         .get(arrayOfByte1 = new byte[16]); String str = (new String(arrayOfByte1)).trim();
/* 5 */       nn1.X00(str, Integer.valueOf(b2)); b2++; }  this.COM8.position(this.u4[0] + j); this.COM8.get(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getShort(); this.COM8.getInt(); int i; for (h802.ck0 = new short[i = this.COM8.get() & 0xFF], h802.jB = new short[i], b2 = 0; b2 < i; ) { h802.ck0[b2] = this.COM8.getShort(); h802.jB[b2] = this.COM8.getShort(); b2++; }  this.COM8.getShort(); this.COM8.getShort(); new byte[i][]; for (rE02.mx0 = new Object[i], b2 = 0; b2 < i; ) { lL lL; this(); this.COM8.getShort(); this.COM8.getShort(); rE02.mx0[b2] = lL; b2++; }  this(i); for (byte b3 = 0; b3 < i; ) { byte[] arrayOfByte1; this.COM8
/* 6 */         .get(arrayOfByte1 = new byte[16]); String str = (new String(arrayOfByte1)).trim();
/* 7 */       nn2.X00(str, Integer.valueOf(b3)); b3++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static byte[] wo = new byte[] { 0, 8, 2, 4, 8, 2, 8, 16 };
/*   */   public short lz;
/*   */   public int[] u4;
/*   */   public ByteBuffer COM8;
/*   */   
/*   */   public ta0(ByteBuffer paramByteBuffer) {
/*   */     this.COM8 = paramByteBuffer;
/*   */     h7();
/*   */     eI();
/*   */   }
/*   */   
/*   */   public final void h7() {
/*   */     if (this.COM8.getInt() != 811095106) {
/*   */       System.out.println("NOT BTX0");
/*   */       return;
/*   */     } 
/*   */     this.COM8.getInt();
/*   */     this.COM8.getInt();
/*   */     this.COM8.getShort();
/*   */     short s = this.COM8.getShort();
/*   */     this.u4 = new int[s];
/*   */     for (s = 0; s < this.lz; s++)
/*   */       this.u4[s] = this.COM8.getInt(); 
/*   */     this.COM8.position(this.u4[0]);
/*   */   }
/*   */   
/*   */   static {
/*   */     C00.gd(ta0.class);
/*   */     "BTX0".getBytes();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ta0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */