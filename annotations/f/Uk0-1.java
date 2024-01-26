/*  1 */ package f;public final class Uk0 extends Kl0 { public final void sM() { int i; this.TZ = arrayOfInt; int[] arrayOfInt; (arrayOfInt = new int[2])[0] = this.Ws.getInt(); this
/*  2 */       .TZ[
/*  3 */         1] = this.Ws.getInt();
/*  4 */     if (R00() == 1) { i = 1; } else { i = 0; }  this.aB0 = i; if (i) { this
/*    */         
/*  6 */         .I0 = this.Ws.getShort();
/*    */       jZ[] arrayOfJZ;
/*  8 */       for (this.AE0 = this.Ws.get(), this.j6 = new jZ[R00()], i = 0; i < (arrayOfJZ = this.j6).length; ) { this(); arrayOfJZ[i] = jZ1; jZ jZ1 = this.j6[i]; if (R00() == 1) { b = 1; } else { b = 0; }  jZ1
/*  9 */           .ZM = b;
/* 10 */         (this.j6[i])
/*    */           
/* 12 */           .d = this.Ws.getShort(); int j; byte b;
/* 13 */         for (j = R00(), b = 0; b < j; )
/* 14 */         { byte b1 = this.Ws.get();
/* 15 */           float f = this.Ws.getFloat();
/* 16 */           int k = this.Ws.getInt();
/* 17 */           (this.j6[i]).OS
/* 18 */             .add(new os0(b1, f, k)); b++; }  i++; }  nV[] arrayOfNV; for (this
/* 19 */         .Ih0 = new nV[R00()], i = 0; i < (arrayOfNV = this.Ih0).length; ) { arrayOfNV[i] = 
/*    */           
/* 21 */           nV.Y4(this.Ws.get()); i++; }  short[] arrayOfShort; for (this.M6 = new short[i = R00()], this.Fy0 = new byte[i], i = 0; i < (arrayOfShort = this.M6).length; ) { arrayOfShort[i] = this
/* 22 */           .Ws.getShort();
/* 23 */         i++; }  for (i = 0; i < this.M6.length; ) { this.Fy0[i] = this
/* 24 */           .Ws.get();
/* 25 */         i++; }  this
/*    */         
/* 27 */         .MI0 = this.Ws.get();
/*    */       
/* 29 */       this.K4 = this.Ws.get(); }
/*    */      }
/*    */ 
/*    */   
/*    */   public int[] TZ;
/*    */   public boolean aB0;
/*    */   public short I0 = 0;
/*    */   public byte AE0 = 0;
/*    */   public byte K4 = 0;
/*    */   public jZ[] j6 = null;
/*    */   public nV[] Ih0;
/*    */   public short[] M6 = null;
/*    */   public byte[] Fy0 = null;
/*    */   public byte MI0 = 2;
/*    */   
/*    */   public Uk0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     int[] arrayOfInt = this.TZ;
/*    */     boolean bool = this.aB0;
/*    */     short s = this.I0;
/*    */     byte b1 = this.AE0;
/*    */     jZ[] arrayOfJZ = this.j6;
/*    */     nV[] arrayOfNV = this.Ih0;
/*    */     short[] arrayOfShort = this.M6;
/*    */     byte arrayOfByte[] = this.Fy0, b2 = this.MI0, b3 = this.K4;
/*    */     GV gV;
/*    */     pA pA;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null && (gV = this.cl) != null)
/*    */       I80(arrayOfInt, bool, s, b1, arrayOfJZ, arrayOfNV, arrayOfShort, arrayOfByte, b2, b3); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */