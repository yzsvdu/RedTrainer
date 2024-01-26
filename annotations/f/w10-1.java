/*  1 */ package f;public final class w10 extends Kl0 { public final void sM() { byte b1; if ((b1 = this.Ws.get()) != -1) { bool = true; } else { bool = false; }  this
/*  2 */       .tB0 = bool; if (!bool)
/*  3 */       return;  ak ak1; if ((ak1 = Ud0.DJ0)
/*  4 */       .db0(b1))
/*  5 */     { ud0 = (Ud0)ak1.Ha0(b1); } else { ud0 = Ud0.X30; }
/*  6 */      byte b2; if (((b2 = this.Ws.get()) & 0x1) != 0) { j = 1; } else { j = 0; }  this
/*  7 */       .qR = j; if ((b2 & 0x2) != 0) { j = 1; } else { j = 0; }  this.AA0 = j; int j; if ((j = b2 & 0x4) != 0) { b = 1; } else { b = 0; }  this.LL0 = b;
/*  8 */     byte b = this.Ws.get(); ak ak2;
/*  9 */     if ((ak2 = Sn.LC)
/* 10 */       .db0(b))
/* 11 */     { sn = (Sn)ak2.Ha0(b); } else { sn = Sn.gJ0; }  int k = 0, m = 0; if ((b2 & 0x20) != 0) this
/*    */         
/* 13 */         .rw = this.Ws.getInt();  if ((b2 & 0x8) != 0)
/* 14 */       k = this.Ws.getInt();  if ((b2 & 0x10) != 0) m = this.Ws.getInt();  if ((b2 & 0x40) != 0) this
/* 15 */         .If0 = this.Ws.getInt();  this(sn, ud0, k, m); Ud0 ud0; boolean bool; Uk uk; Sn sn; int i; short s; for (this.UP = uk, i = R00(), s = 0; s < i; )
/* 16 */     { k = this.Ws.getShort(); m = this.Ws.getShort(); short s1 = this.Ws.getShort();
/* 17 */       i i1 = this.UP.rd0(k, ud0, m, s1); if (ud0 == Ud0.GA) { for (m = R00(), s1 = 0; s1 < m; )
/* 18 */         { short s2 = this.Ws.getShort(), s3 = this.Ws.getShort();
/* 19 */           i1.wS
/* 20 */             .add(new S3(s2, s3)); s1++; }  } else { i1
/*    */           
/* 22 */           .ac0 = this.Ws.getInt(); }  s++; }  if (ud0 == 
/* 23 */       Ud0.GA && j != 0) for (int n = R00(); i < n; ) {
/* 24 */         i i1; j = this.Ws.getShort(); s = this.Ws.getShort(); k = this.Ws.getShort(); Uk uk1;
/* 25 */         if ((uk1 = this.UP)
/* 26 */           .w5
/* 27 */           .Fb(j))
/* 28 */         { i1 = (i)uk1.w5.Z90(j); } else { i1 = uk1.rd0(i1, uk1.Xp0, (short)0, (short)0); }  i1
/* 29 */           .Lq0
/* 30 */           .add(new S3(s, k)); i++;
/*    */       }   }
/*    */ 
/*    */   
/*    */   public boolean tB0;
/*    */   public int rw;
/*    */   public int If0;
/*    */   public Uk UP;
/*    */   public boolean qR;
/*    */   public boolean AA0;
/*    */   public boolean LL0;
/*    */   
/*    */   public w10(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     Uk uk;
/*    */     if (this.tB0) {
/*    */       uk = this.UP;
/*    */       int i = this.rw, j = this.If0;
/*    */       boolean bool1 = this.LL0, bool2 = this.qR, bool3 = this.AA0;
/*    */       (r8()).hZ = this;
/*    */       pA pA;
/*    */       if ((pA = ((R8)r8()).YG0.MH0) != null)
/*    */         if (this == null) {
/*    */           pA.Yd();
/*    */         } else {
/*    */           pA.nk(i, j, bool1, bool2, bool3);
/*    */         }  
/*    */     } else {
/*    */       uk = null;
/*    */       (r8()).hZ = this;
/*    */       pA pA;
/*    */       if ((pA = ((R8)r8()).YG0.MH0) != null)
/*    */         Yd(); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */