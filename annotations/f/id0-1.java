/*  1 */ package f;public final class id0 extends Kl0 { public final void sM() { int i; byte b1; boolean bool; byte b = this.Ws.get();
/*    */     
/*  3 */     int arrayOfInt[], j = (arrayOfInt = Zk0.s6(8)).length, k = 0; while (true) { if (k < j) { int m; if (KA0.KH(m = arrayOfInt[k]) == b) break;  k++; continue; }  bool = true; break; }  this
/*  4 */       .h9 = bool; switch (Zk0.yE(bool)) { default: return;case 7: for (this.cN = new es[i = R00()], b1 = 0; b1 < i; ) { es es1; String str, arrayOfString[]; Xs0[] arrayOfXs0; byte b2; for (str = au(), arrayOfString = new String[k = R00()], arrayOfXs0 = new Xs0[R00()], b2 = 0; b2 < k; ) { arrayOfString[b2] = au(); arrayOfXs0[b2] = Xs0.values()[R00()]; b2++; }  this(str, arrayOfString, arrayOfXs0); this.cN[b1] = es1; b1++; } case 6: this.ey = au(); break;case 4: this
/*    */           
/*  6 */           .a00 = this.Ws.get();
/*    */         
/*  8 */         this.Xg0 = this.Ws.getShort();
/*    */         
/* 10 */         this.f70 = this.Ws.getShort();
/*    */         
/* 12 */         this.cOM1 = this.Ws.getShort();
/*    */         
/* 14 */         this.Dv0 = this.Ws.get();
/* 15 */         this.Ws.get();
/*    */         
/* 17 */         this.pH0 = this.Ws.getInt(); if (R00() == 1) { i = 1; } else { i = 0; }  this.Tv = i; if (R00() == 1) { i = 1; } else { i = 0; }  this.ZJ0 = i; this
/*    */           
/* 19 */           .rx0 = this.Ws.get();
/*    */         
/* 21 */         this.u3 = this.Ws.get();
/*    */         
/* 23 */         this.IE = this.Ws.get();
/*    */         
/* 25 */         for (this.ic0 = new byte[i = this.Ws.get()], this.iN = new byte[i], b1 = 0; b1 < i; ) { this.ic0[b1] = this
/* 26 */             .Ws.get();
/* 27 */           this.iN[b1] = this
/* 28 */             .Ws.get();
/* 29 */           b1++; } case 2: this
/*    */           
/* 31 */           .Tz0 = this.Ws.getInt();case 1: break; }  this
/*    */       
/* 33 */       .Tz0 = this.Ws.getInt(); this.Bk0 = au(); this.ey = au();
/*    */     
/* 35 */     this.SN = this.Ws.getInt(); }
/*    */ 
/*    */   
/*    */   public int h9;
/*    */   public String Bk0;
/*    */   public String ey;
/*    */   public int SN;
/*    */   public int Tz0;
/*    */   public byte a00;
/*    */   public short Xg0;
/*    */   public short f70;
/*    */   public short cOM1;
/*    */   public byte Dv0;
/*    */   public boolean ZJ0;
/*    */   public boolean Tv;
/*    */   public int pH0;
/*    */   public byte rx0;
/*    */   public byte u3;
/*    */   public byte IE;
/*    */   public byte[] ic0;
/*    */   public byte[] iN;
/*    */   public es[] cN;
/*    */   
/*    */   public id0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     r8().tS(this);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/id0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */