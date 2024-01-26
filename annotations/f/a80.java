/*  1 */ package f;public final class a80 { public static final a80 Oz0 = new a80(); public U70[] dI; public U70 Ey; public U70 nA; public zh0[] i6; public zh0[] zm0; public zh0[] af; public static ZH Ze0(ByteBuffer paramByteBuffer, int paramInt1, int[][] paramArrayOfint, int paramInt2, int paramInt3) { ByteBuffer byteBuffer = ByteBuffer.wrap(LF.sf(paramInt2, paramByteBuffer)).order(ByteOrder.LITTLE_ENDIAN); this(paramInt1, 1, 1, 1, paramByteBuffer); f1 f1; ZH zH; Wf wf; this(1, paramInt3 * 32, byteBuffer); paramInt1 = paramArrayOfint.length * 8; int i = (paramArrayOfint[0]).length * 8; this(i, paramInt1, Uc.xi0); for (paramInt1 = 0; paramInt1 < paramArrayOfint.length; ) { int[] arrayOfInt; for (i = 0; i < (arrayOfInt = paramArrayOfint[paramInt1]).length; ) { int j = i * 8, k = paramInt1 * 8, m = arrayOfInt[i]; wf.COm5(zH, j, k, m, f1, 0, false, false); i++; }  paramInt1++; }  return zH; } public zh0[] CB; public zh0 i20; public U70 Dg; public U70 os; public U70[] TV; public U70[] DE0; public U70[] Ah; public zh0 NH0; public final void Kc(s40 params40) { if (params40.in() == 1) { U70 u701; zh0 zh01; U70 u702; ui0 ui0; U70 u703; zh0 zh02; U70 u707, u706, u705, u704, u708; ByteBuffer byteBuffer1; (byteBuffer1 = params40.pr())
/*  2 */         .position(params40.wJ.nz(uq.WW)); int i = pN.tx0(params40.pr().getInt()), j = pN.tx0(params40.pr().getInt()); params40.pr().getInt(); int k = pN.tx0(params40.pr().getInt()), m = pN.tx0(params40.pr().getInt()); this.Ey = new U70(new y20(params40, i, m)); byte b2 = 1; int i1 = 0;
/*  3 */       this(new Wi(j, k, m, b2, i1, params40)); (this.dI = new U70[5])[0] = u708;
/*  4 */       b2 = 1; i1 = 128;
/*  5 */       this(new Wi(j, k, m, b2, i1, params40)); this.dI[1] = u708;
/*  6 */       b2 = 2; i1 = 0;
/*  7 */       this(new Wi(j, k, m, b2, i1, params40)); this.dI[2] = u708;
/*  8 */       b2 = 2; i1 = 128;
/*  9 */       this(new Wi(j, k, m, b2, i1, params40)); this.dI[3] = u708;
/* 10 */       b2 = 3; i1 = 0;
/* 11 */       this(new Wi(j, k, m, b2, i1, params40)); this.dI[4] = u708;
/* 12 */       this.nA = new U70(new mx0(params40)); this(new jL0(params40)); zh0[] arrayOfZh02; for (this.i6 = new zh0[7], k = 0; k < (arrayOfZh02 = this.i6).length; ) { zh0 zh03; i1 = k * 16; this(u703, 0, i1, 16, 16); arrayOfZh02[k] = zh03; k++; }  ByteBuffer byteBuffer2 = ByteBuffer.wrap(LF.sf(m, byteBuffer1)).order(ByteOrder.LITTLE_ENDIAN); byteBuffer1
/*    */         
/* 14 */         .position(params40.wJ.nz(uq.IF)); k = pN.tx0(byteBuffer1.getInt()); m = pN.tx0(byteBuffer1.getInt()); int n = pN.tx0(byteBuffer1.getInt()); byteBuffer1.getInt(); i1 = pN.tx0(byteBuffer1.getInt());
/*    */       
/* 16 */       this.Dg = new U70(new ap(k, m, i1, params40));
/*    */       
/* 18 */       this.os = new U70(new ap(k, n, i1, params40)); int[] arrayOfInt4; (arrayOfInt4 = new int[m = 5])[0] = 162; (new int[m = 5])[1] = 163; (new int[m = 5])[2] = 164; (new int[m = 5])[3] = 165; (new int[m = 5])[4] = 166; U70[] arrayOfU70; byte b3;
/* 19 */       for (arrayOfU70 = new U70[5], b3 = 0; b3 < m; ) { U70 u70; nu nu; int i2 = arrayOfInt4[b3]; this(params40, k, i2, i1); this(nu); arrayOfU70[b3] = u70; b3++; }  this
/* 20 */         .TV = arrayOfU70; (arrayOfInt4 = new int[m = 3])[0] = 178; (new int[m = 3])[1] = 179; (new int[m = 3])[2] = 180;
/* 21 */       for (arrayOfU70 = new U70[3], b3 = 0; b3 < m; ) { U70 u70; nu nu; int i2 = arrayOfInt4[b3]; this(params40, k, i2, i1); this(nu); arrayOfU70[b3] = u70; b3++; }  this
/* 22 */         .DE0 = arrayOfU70; (arrayOfInt4 = new int[2])[0] = 67; (new int[2])[1] = 68; int[][] arrayOfInt; (arrayOfInt = new int[2][])[0] = arrayOfInt4; (arrayOfInt4 = new int[2])[0] = 83; (new int[2])[1] = 84; (new int[2][])[1] = arrayOfInt4;
/* 23 */       this(new for(byteBuffer1, k, arrayOfInt, i1)); (this.Ah = new U70[4])[0] = u707; int[] arrayOfInt3;
/* 24 */       (arrayOfInt3 = new int[2])[0] = 69; (new int[2])[1] = 70; (arrayOfInt = new int[2][])[0] = arrayOfInt3; (arrayOfInt3 = new int[2])[0] = 85; (new int[2])[1] = 86; (new int[2][])[1] = arrayOfInt3;
/* 25 */       this(new for(byteBuffer1, k, arrayOfInt, i1)); this.Ah[1] = u706; int[] arrayOfInt2;
/* 26 */       (arrayOfInt2 = new int[2])[0] = 71; (new int[2])[1] = 72; (arrayOfInt = new int[2][])[0] = arrayOfInt2; (arrayOfInt2 = new int[2])[0] = 87; (new int[2])[1] = 88; (new int[2][])[1] = arrayOfInt2;
/* 27 */       this(new for(byteBuffer1, k, arrayOfInt, i1)); this.Ah[2] = u705; int[] arrayOfInt1;
/* 28 */       (arrayOfInt1 = new int[2])[0] = 73; (new int[2])[1] = 74; (arrayOfInt = new int[2][])[0] = arrayOfInt1; (arrayOfInt1 = new int[2])[0] = 89; (new int[2])[1] = 90; (new int[2][])[1] = arrayOfInt1;
/* 29 */       this(new for(byteBuffer1, k, arrayOfInt, i1)); this.Ah[3] = u704;
/* 30 */       this(new cj0(i, params40, byteBuffer2)); this.i20 = new zh0(u702, 32, 24, 8, 8); this(new Ft0(i, params40, byteBuffer2)); this(u702, 0, 32, 40, 16); (this.af = new zh0[5])[0] = zh02; this(u702, 40, 32, 40, 16); this.af[1] = zh02; this(u702, 80, 32, 40, 16); this.af[2] = zh02; this(u702, 80, 48, 40, 16); this.af[3] = zh02; this(u702, 80, 64, 40, 16); this.af[4] = zh02; this(new MH(i, params40, byteBuffer2)); byte b1; for (this.zm0 = new zh0[6], b1 = 0; b1 < 4; ) { this.zm0[b1] = new zh0(u702, b1 * 8 + 8, 8, 8, 8); b1++; }  for (b1 = 0; b1 < 2; ) { this.zm0[b1 + 4] = new zh0(u702, b1 * 8 + 40, 24, 8, 8); b1++; }  this(new Cm(i, params40, byteBuffer2)); zh0[] arrayOfZh01; for (this.CB = new zh0[5], b1 = 0; b1 < (arrayOfZh01 = this.CB).length; ) { zh0 zh03; this(u702, b1 * 16, 64, 16, 16); arrayOfZh01[b1] = zh03; b1++; }  this(i, params40, byteBuffer2); this(ui0); this(this, 16, 24, 16, 8); this.NH0 = zh01; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final zh0 Ns() {
/*    */     return this.NH0;
/*    */   }
/*    */   
/*    */   public final zh0 fj() {
/*    */     return this.i20;
/*    */   }
/*    */   
/*    */   public final zh0 z7(int paramInt) {
/*    */     return this.zm0[paramInt];
/*    */   }
/*    */   
/*    */   public final U70 Dk(int paramInt) {
/*    */     return this.TV[paramInt];
/*    */   }
/*    */   
/*    */   public final U70 sk(int paramInt) {
/*    */     return this.DE0[paramInt];
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */