/*  1 */ package f;public final class Lpt8 extends Kl0 { public final void Cx() { mG mG; if ((mG = (r8()).Wn0) == null)
/*  2 */       return;  yy yy3, yy4; if ((yy3 = mG.FH0)
/*  3 */       .lpt5 != 
/*  4 */       (yy4 = this.ok)
/*  5 */       .lpt5 || yy3
/*  6 */       .u8 != yy4.u8 || yy3
/*  7 */       .t20 != yy4.t20 || yy3
/*  8 */       .z40 != yy4.z40 || yy3
/*  9 */       .V1 != yy4.V1) {
/* 10 */       r8().oD(Ml0.OH0(2603), ZY.lB);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 15 */     if (!mG.FH0.Ku0.equals(this.ok.Ku0)) r8()
/*    */ 
/*    */ 
/*    */         
/* 19 */         .oD(this.ok.mK + ": " + this.ok.Ku0, ZY.lB);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     if (!mG.FH0.mK.equals(this.ok.mK)) { arrayOfString[
/*    */           
/* 26 */           0] = mG.FH0.mK;
/*    */       String[] arrayOfString;
/* 28 */       (arrayOfString = new String[2])[1] = this.ok.mK;
/* 29 */       r8().oD(Ml0.sB(2621, arrayOfString), ZY.lB); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     if (!mG.FH0.TC0.equals(this.ok.TC0)) { arrayOfString[
/*    */           
/* 36 */           0] = mG.FH0.mK;
/*    */       String[] arrayOfString;
/* 38 */       (arrayOfString = new String[2])[1] = this.ok.TC0;
/* 39 */       r8().oD(Ml0.sB(2622, arrayOfString), ZY.lB); }  jv[] arrayOfJv; int i; byte b; for (i = (arrayOfJv = jv.bv).length, b = 0; b < i; ) { jv jv = arrayOfJv[b];
/*    */ 
/*    */       
/*    */       String str;
/*    */ 
/*    */       
/*    */       byte b1;
/*    */       
/* 47 */       if (!mG.FH0.Qz0[b1 = jv.cJ].equals(str = this.ok.Qz0[b1])) { if (str.isEmpty())
/*    */         {
/* 49 */           str = Ml0.OH0(jv.MQ); }  String[] arrayOfString; (arrayOfString = new String[2])[0] = mG.Oh0(jv); (new String[2])[1] = str; r8().oD(Ml0.sB(2640, arrayOfString), ZY.lB); }  b++; }  yy yy1 = this.ok;
/* 50 */     yy2.getClass(); yy2
/* 51 */       .mK = this.mK; yy2.TC0 = this.TC0; yy2.ho0 = this.ho0; yy2.Ku0 = this.Ku0; yy2.lpt5 = this.lpt5; yy2.u8 = this.u8; yy2.t20 = this.t20; yy2.z40 = this.z40; yy2.V1 = this.V1; yy2.s80 = this.s80; yy yy2; (yy2 = mG.FH0).Qz0 = this.Qz0;
/* 52 */     mG.LD = true; }
/*    */ 
/*    */   
/*    */   public yy ok;
/*    */   
/*    */   public Lpt8(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void sM() {
/*    */     this.ok = pu();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Lpt8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */