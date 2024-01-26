/*  1 */ package f;public final class fp0 extends Kl0 { public final void sM() { boolean bool; this
/*  2 */       .lM = this.Ws.getInt();
/*    */     
/*  4 */     this.T0 = this.Ws.get(); this.jt = ZV(); this.he = au();
/*  5 */     byte b1 = this.Ws.get();
/*  6 */     byte b2 = this.Ws.get();
/*  7 */     byte b3 = this.Ws.get();
/*  8 */     short s1 = this.Ws.getShort();
/*  9 */     short s2 = this.Ws.getShort();
/* 10 */     byte b4 = this.Ws.get();
/* 11 */     byte b5 = (byte)(this.Ws.get() & 0x3); if ((this.Ws.get() & 0x8) != 0) { bool = true; } else { bool = false; }  this
/* 12 */       .ri = new G5(b1, b2, b3, bool, s1, s2, b4, b5);
/*    */     
/* 14 */     this.LB = this.Ws.get();
/*    */     
/* 16 */     this.Gx = Z50.tC0(this.Ws.get());
/* 17 */     if (((b1 = this.Ws.get()) & 0x1) != 0) this
/*    */         
/* 19 */         .C6 = this.Ws.get();  if ((b1 & 0x2) != 0) { this
/*    */         
/* 21 */         .OX = this.Ws.get();
/*    */       
/* 23 */       this.lpT9 = this.Ws.getShort(); }  if ((b1 & 0x4) != 0) this
/*    */         
/* 25 */         .Gz0 = this.Ws.getShort();  if ((b1 & 0x8) != 0) this
/*    */         
/* 27 */         .lc0 = this.Ws.get();  if ((b1 & 0x10) != 0) { this
/*    */         
/* 29 */         .QI0 = this.Ws.getInt(); this.p70 = au(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public int lM;
/*    */   public byte T0;
/*    */   public String he;
/*    */   public G5 ri;
/*    */   public Z50 Gx;
/*    */   public byte LB;
/*    */   public byte OX = -1;
/*    */   public short lpT9 = -1;
/*    */   public short Gz0 = 0;
/*    */   public byte lc0 = 0;
/*    */   public int QI0 = 0;
/*    */   public String p70 = "";
/*    */   public byte C6 = 0;
/*    */   public H10 jt;
/*    */   
/*    */   public fp0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   static {
/*    */     C00.gd(fp0.class);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     int i = this.lM;
/*    */     byte b1 = this.T0;
/*    */     H10 h10 = this.jt;
/*    */     String str1 = this.he;
/*    */     byte b2 = this.C6;
/*    */     G5 g5 = this.ri;
/*    */     byte b3 = this.LB;
/*    */     Z50 z50 = this.Gx;
/*    */     byte b4 = this.OX;
/*    */     short s1 = this.lpT9, s2 = this.Gz0;
/*    */     byte b5 = this.lc0;
/*    */     int j = this.QI0;
/*    */     String str2 = this.p70;
/*    */     (r8()).Qa.K80(i, b1, h10, str1, b2, g5, b3, z50, b4, s1, s2, b5, j, str2);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */