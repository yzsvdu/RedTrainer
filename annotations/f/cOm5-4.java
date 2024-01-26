/*  1 */ package f;public final class cOm5 extends Kl0 { public final void sM() { byte b; for (this.Rv0 = new iv[R00()], b = 0; b < this.Rv0.length; ) { QF qF; long l = this.Ws.getLong();
/*  2 */       byte b1 = this.Ws.get(); int i; ya0[] arrayOfYa0; byte b2;
/*  3 */       for (arrayOfYa0 = new ya0[i = R00()], b2 = 0; b2 < i; ) { boolean bool; ya0 ya0 = new ya0();
/*  4 */         short s1 = this.Ws.getShort();
/*  5 */         short s2 = this.Ws.getShort();
/*  6 */         int k = this.Ws.getInt();
/*  7 */         if (this.Ws.get() == 1) { bool = true; } else { bool = false; }
/*  8 */          this(s1, s2, k, bool); arrayOfYa0[b2] = ya0; b2++; }  iv arrayOfIv[] = this.Rv0, iv1 = new iv();
/*  9 */       if (QF.Com2 == null) QF.Com2 = QF.values();  QF[] arrayOfQF; int j = (arrayOfQF = QF.Com2).length; byte b3 = 0; while (true) { if (b3 < j) { QF qF1; if ((qF1 = arrayOfQF[b3]).c40 == b1) break;  b3++; continue; }  qF = null; break; }
/* 10 */        this(l, qF, arrayOfYa0); arrayOfIv[b] = iv1; b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public iv[] Rv0;
/*    */   
/*    */   public cOm5(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     iv[] arrayOfIv = this.Rv0;
/*    */     pA pA;
/*    */     A a;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null && (a = this.QI0) != null)
/*    */       C40(arrayOfIv); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cOm5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */