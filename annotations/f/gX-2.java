/*  1 */ package f;public final class gX extends Kl0 { public final void sM() { this
/*  2 */       .lI = this.Ws.getInt(); if (R00() == 1) { b = 1; } else { b = 0; }  this.aJ = b; if (R00() == 1) { b = 1; } else { b = 0; }  this.d4 = b;
/*  3 */     byte b = this.Ws.get(); byte b1 = this.Ws.get(), b2 = this.Ws.get(); int i; Sm0[] arrayOfSm0; byte b3;
/*  4 */     for (arrayOfSm0 = new Sm0[i = Gc0()], b3 = 0; b3 < i; )
/*    */     { Sm0 sm0;
/*  6 */       byte b4 = this.Ws.get();
/*  7 */       short s1 = this.Ws.getShort(), s2 = this.Ws.getShort(), s3 = this.Ws.getShort(), s4 = this.Ws.getShort(), s5 = this.Ws.getShort();
/*  8 */       String str = au();
/*  9 */       short s6 = this.Ws.getShort();
/* 10 */       this(b, b1, b2, b4, s1, s2, s3, s4, s5, str, s6); arrayOfSm0[b3] = sm0;
/* 11 */       b3++; }  this(b, b1, b2, arrayOfSm0); ZC0 zC0; this.Cn0 = this; }
/*    */ 
/*    */   
/*    */   public static ArrayList q1;
/*    */   public int lI;
/*    */   public boolean aJ;
/*    */   public boolean d4;
/*    */   public ZC0 Cn0;
/*    */   
/*    */   public gX(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     if (this.aJ)
/*    */       q1 = new ArrayList(); 
/*    */     q1.add(this.Cn0);
/*    */     ro ro = r8();
/*    */     int i = this.lI;
/*    */     ZC0[] arrayOfZC0 = (ZC0[])q1.toArray((Object[])new ZC0[0]);
/*    */     pA pA;
/*    */     if (this.d4 && (pA = ((R8)this).YG0.MH0) != null) {
/*    */       Gz gz;
/*    */       pA.h();
/*    */       this(pA, i, this);
/*    */       pA.vm0 = new Gz();
/*    */       pA.J8(gz);
/*    */       pA.vm0.mM();
/*    */       pA.vm0.ME(km.wI0.dG() / 2 - pA.vm0.xY / 2, km.wI0.k1() / 2 - pA.vm0.HC / 2);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */