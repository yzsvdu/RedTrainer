/* 1 */ package f;public final class Cs extends LJ { public final void IW() { ByteBuffer byteBuffer; (byteBuffer = this.s20.pr()).position(this.UB); this(); ArrayList<U70> arrayList; f1 f11; this
/* 2 */       .L6 = L70.gq.fu(); if (this.Vr) { byte b1 = this.L6, b2 = this.LH; f11 = this.kB0; Pu pu;
/* 3 */       if ((pu = (Pu)YO.break.Z90(YO.JK0(this.s20.in(), b1, b2, 0))) != null) for (f11 = f11.Zm0(), b2 = 0; b2 < 16; )
/*   */         { int i;
/* 5 */           if ((i = pu.dB[b2]) != 0) f11
/* 6 */               .LPT2[b2] = i; 
/* 7 */           b2++; }   }
/* 8 */     else { f11 = this.kB0; }  while (true) { U70 u70; int i; if ((this.m90 >= 1 && byteBuffer.position() >= this.m90) || !pN.pk0(i = byteBuffer.getInt())) { this.Gt0 = (U70[])arrayList.toArray((Object[])new U70[0]); return; }  i = pN.tx0(i); byteBuffer.getShort(); byteBuffer.getShort(); int j; if ((j = this.ZR) == 165 || j == 161 || j == 153) { wz0 wz0; this(this, i, f11); this(wz0); } else if (u70 == 93) { xu xu; this(this, i, f11); this(xu); } else if (u70 == '') { PR pR; this(this, i, f11); this(pR); } else { KJ0 kJ0; this(this, i, f11); this(kJ0); }  arrayList.add(u70); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final int ZR;
/*   */   public final boolean BI;
/*   */   public byte LH;
/*   */   public final int N50;
/*   */   public final int bk;
/*   */   public final int UB;
/*   */   public int DJ0 = 0;
/*   */   public U70[] Gt0 = null;
/*   */   public s40 s20;
/*   */   public int m90;
/*   */   public f1 kB0 = null;
/*   */   public byte zp0;
/*   */   public boolean Vr = false;
/*   */   public byte L6 = -1;
/*   */   
/*   */   public Cs(int paramInt1, int paramInt2, s40 params40) {
/*   */     this.s20 = params40;
/*   */     ByteBuffer byteBuffer;
/*   */     (byteBuffer = params40.pr()).position(paramInt2);
/*   */     this.ZR = paramInt1;
/*   */     if (byteBuffer.getShort() == -1) {
/*   */       paramInt2 = 1;
/*   */     } else {
/*   */       paramInt2 = 0;
/*   */     } 
/*   */     this.BI = paramInt2;
/*   */     this.LH = byteBuffer.get();
/*   */     this.zp0 = paramInt2;
/*   */     if ((paramInt2 = byteBuffer.get()) == 16) {
/*   */       this.LH = (byte)(this.LH + 26);
/*   */       byteBuffer.getInt();
/*   */       byteBuffer.getInt();
/*   */       this.UB = pN.tx0(byteBuffer.getInt());
/*   */       this.N50 = 16;
/*   */       this.bk = 16;
/*   */     } else if (paramInt2 == -1) {
/*   */       this.LH = (byte)(this.LH + 26);
/*   */       byteBuffer.getInt();
/*   */       byteBuffer.getInt();
/*   */       if (paramInt1 == 159) {
/*   */         this.UB = pN.tx0(byteBuffer.getInt());
/*   */         this.N50 = 32;
/*   */         this.bk = 32;
/*   */       } else if (paramInt1 == 180) {
/*   */         this.N50 = 64;
/*   */         this.bk = 64;
/*   */         byteBuffer.getInt();
/*   */         byteBuffer.getInt();
/*   */         byteBuffer.getInt();
/*   */         this.UB = byteBuffer.position();
/*   */       } else {
/*   */         this.UB = pN.tx0(byteBuffer.getInt());
/*   */         this.N50 = 16;
/*   */         this.bk = 16;
/*   */       } 
/*   */     } else if (paramInt2 == 17) {
/*   */       byteBuffer.getInt();
/*   */       this.N50 = byteBuffer.getShort() & 0xFFFF;
/*   */       this.bk = byteBuffer.getShort() & 0xFFFF;
/*   */       byteBuffer.getInt();
/*   */       byteBuffer.getInt();
/*   */       byteBuffer.getInt();
/*   */       byteBuffer.getInt();
/*   */       this.UB = pN.tx0(byteBuffer.getInt());
/*   */       byteBuffer.getInt();
/*   */     } else {
/*   */       this.N50 = 16;
/*   */       this.bk = 16;
/*   */       this.UB = 0;
/*   */       this.Gt0 = new U70[0];
/*   */     } 
/*   */   }
/*   */   
/*   */   public Cs() {
/*   */     this.ZR = -1;
/*   */     this.N50 = 16;
/*   */     this.bk = 16;
/*   */     this.BI = true;
/*   */     this.LH = 0;
/*   */     this.UB = 0;
/*   */     U70 u70 = U70.ah0;
/*   */     U70[] arrayOfU70;
/*   */     (arrayOfU70 = new U70[3])[0] = u70;
/*   */     (new U70[3])[1] = u70;
/*   */     (new U70[3])[2] = u70;
/*   */     this.Gt0 = this;
/*   */   }
/*   */   
/*   */   public final byte cOM3() {
/*   */     return this.zp0;
/*   */   }
/*   */   
/*   */   public final U70 LT(int paramInt) {
/*   */     if (this.Gt0 == null)
/*   */       IW(); 
/*   */     if (this.Vr && this.L6 != L70.gq.fu())
/*   */       IW(); 
/*   */     U70[] arrayOfU70;
/*   */     if ((arrayOfU70 = this.Gt0).length == 0)
/*   */       return null; 
/*   */     if (paramInt < 0 || paramInt >= arrayOfU70.length)
/*   */       paramInt = 0; 
/*   */     if (arrayOfU70[paramInt] == null)
/*   */       IW(); 
/*   */     return this.Gt0[paramInt];
/*   */   }
/*   */   
/*   */   public final boolean V(int paramInt) {
/*   */     return (this.DJ0 > paramInt);
/*   */   }
/*   */   
/*   */   public final U70[] Uu() {
/*   */     if (this.Gt0 == null)
/*   */       IW(); 
/*   */     U70[] arrayOfU70;
/*   */     return ((arrayOfU70 = this.Gt0).length == 0) ? new U70[0] : Arrays.<U70>copyOf(this, this.length);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */