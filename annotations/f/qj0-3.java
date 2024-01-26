/*  1 */ package f;public final class qj0 implements Runnable { public final synchronized void run() { if (this.Fj0) return;  try { if (this.Zv < 0L) this.Zv = this.d80.getInt();  boolean bool = false; while (true) { if (this.QG || this.Zv < (int)(System.currentTimeMillis() - this.cm))
/*    */         { Gp0 gp0;
/*    */ 
/*    */ 
/*    */           
/*  6 */           if ((gp0 = km.MR) == null || gp0
/*  7 */             .Ja == 
/*  8 */             Mn.VK) bool = true;  this.d80.get(new byte[this.d80.getShort() - 6]);
/*    */           
/* 10 */           kl0
/* 11 */             .n90 = this.Wv; Kl0 kl0;
/* 12 */           if ((kl0 = COM7.qe(ByteBuffer.wrap(new byte[this.d80.getShort() - 6]).order(ByteOrder.LITTLE_ENDIAN), km.u4.e20, true)) != null && kl0.ZX()) UB0.Kg0.fN(kl0);  if (this.d80.hasRemaining()) { long l = this.d80.getInt(); if (bool)
/* 13 */             { A1.L7
/*    */                 
/* 15 */                 .ac0(this, l - (int)(System.currentTimeMillis() - this.cm) + 1L); return; }  continue; }  this.Fj0 = true; return; }  if (!this.QG) A1.L7.ac0(this, this.Zv - (int)(System.currentTimeMillis() - this.cm) + 1L);  break; }  } catch (Exception exception) { printStackTrace(); km.u4.Pq(Ml0.OH0(5803)); km.u4.UW(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final byte[] zR = new byte[] { 80, 79, 75, 69, 77, 77, 79, 82, 80, 10 };
/*    */   public final boolean QG = h1.rn;
/*    */   public ByteBuffer O1;
/*    */   public ByteBuffer d80;
/*    */   public int Wv;
/*    */   public boolean yo = true;
/*    */   public long Zv = -2147483648L;
/*    */   public long cm = System.currentTimeMillis();
/*    */   public boolean Fj0 = false;
/*    */   
/*    */   public qj0(byte[] paramArrayOfbyte) {
/*    */     this.O1 = ByteBuffer.wrap(paramArrayOfbyte).order(ByteOrder.LITTLE_ENDIAN);
/*    */     Jt0();
/*    */   }
/*    */   
/*    */   public final void Jt0() {
/*    */     try {
/*    */       byte[] arrayOfByte1 = zR;
/*    */       this.O1.get(arrayOfByte2);
/*    */       byte[] arrayOfByte2;
/*    */       if (!Arrays.equals(arrayOfByte2 = new byte[10], arrayOfByte1)) {
/*    */         this.yo = false;
/*    */         return;
/*    */       } 
/*    */       this.Wv = this.O1.getInt();
/*    */       this.O1.getLong();
/*    */       int i = this.O1.getInt();
/*    */       this.O1.duplicate().order(ByteOrder.LITTLE_ENDIAN).limit((this.d80 = this.O1.duplicate().order(ByteOrder.LITTLE_ENDIAN)).position() + i);
/*    */       if ((i = this.Wv) > 20)
/*    */         this.yo = false; 
/*    */       if (i < 19)
/*    */         this.yo = false; 
/*    */     } catch (Exception exception) {
/*    */       null.printStackTrace();
/*    */       this.yo = false;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qj0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */