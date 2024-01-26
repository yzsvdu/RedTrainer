/* 1 */ package f;public final class a4 { public final Ui0 cx0(int paramInt1, int paramInt2) { boolean bool1; Ui0 ui0; if ((ui0 = this.LpT9[paramInt1][paramInt2]) == null) return null;  short s; if (((s = (this.Lh[paramInt1][paramInt2]).vx0) & 0x400) != 0) { bool1 = true; } else { bool1 = false; }  if ((s & 0x800) != 0) { s = 1; } else { s = 0; }  boolean bool2 = false, bool3 = false;
/* 2 */     if (((ui0.mP > ui0.zV) ? true : false) != bool1) bool2 = true; 
/* 3 */     if (((ui0.WT > ui0.bh0) ? 1 : 0) != s) bool3 = true;  ui0
/* 4 */       .zt0(bool2, bool3);
/* 5 */     return this.LpT9[paramInt1][paramInt2]; }
/*   */ 
/*   */   
/*   */   public uI0[][] Lh = new uI0[2][4];
/*   */   public pe0[] qd0 = new pe0[2];
/*   */   public pe0[][] qt0 = null;
/*   */   public int[] W6 = new int[2];
/*   */   public byte jY;
/*   */   public byte Ii;
/*   */   public byte No;
/*   */   public byte Ht;
/*   */   public int[] MF = new int[2];
/*   */   public int h;
/*   */   public Ui0[][] LpT9 = null;
/*   */   public pe0[] pn0 = null;
/*   */   public short up0 = 0;
/*   */   
/*   */   public a4(int paramInt, ByteBuffer paramByteBuffer) {
/*   */     this.h = paramInt;
/*   */     if (paramByteBuffer != null)
/*   */       for (paramInt = 0; paramInt < this.Lh.length; paramInt++) {
/*   */         uI0[] arrayOfUI0;
/*   */         for (byte b = 0; b < (arrayOfUI0 = this.Lh[paramInt]).length; b++) {
/*   */           uI0 uI01;
/*   */           this(paramByteBuffer);
/*   */           arrayOfUI0[b] = uI01;
/*   */         } 
/*   */       }  
/*   */   }
/*   */   
/*   */   public final void Pd(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) {
/*   */     this.jY = paramByte1;
/*   */     this.Ii = paramByte2;
/*   */     this.No = paramByte3;
/*   */     this.Ht = paramByte4;
/*   */   }
/*   */   
/*   */   public final pe0 GC0(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield W6 : [I
/*   */     //   4: dup
/*   */     //   5: astore_2
/*   */     //   6: ifnull -> 20
/*   */     //   9: aload_2
/*   */     //   10: iload_1
/*   */     //   11: iaload
/*   */     //   12: ifle -> 20
/*   */     //   15: iconst_1
/*   */     //   16: istore_3
/*   */     //   17: goto -> 22
/*   */     //   20: iconst_0
/*   */     //   21: istore_3
/*   */     //   22: iload_3
/*   */     //   23: ifeq -> 50
/*   */     //   26: aload_0
/*   */     //   27: getstatic f/zm0.u20 : J
/*   */     //   30: sipush #300
/*   */     //   33: i2l
/*   */     //   34: ldiv
/*   */     //   35: aload_2
/*   */     //   36: iload_1
/*   */     //   37: iaload
/*   */     //   38: i2l
/*   */     //   39: lrem
/*   */     //   40: l2i
/*   */     //   41: istore_0
/*   */     //   42: getfield qt0 : [[Lf/pe0;
/*   */     //   45: iload_1
/*   */     //   46: aaload
/*   */     //   47: iload_0
/*   */     //   48: aaload
/*   */     //   49: areturn
/*   */     //   50: aload_0
/*   */     //   51: getfield qd0 : [Lf/pe0;
/*   */     //   54: iload_1
/*   */     //   55: aaload
/*   */     //   56: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 27
/*   */     //   #3	-> 34
/*   */     //   #4	-> 51
/*   */   }
/*   */   
/*   */   public final short Wi() {
/*   */     return this.up0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */