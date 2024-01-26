/* 1 */ package f;public final class WB0 { public final void GN(s40 params40) { if (params40.in() != 0) return;  this.CoM8 = params40; byteBuffer1
/* 2 */       .position(params40.wJ.nz(uq.Vb)); byteBuffer1.getInt(); byteBuffer1.getInt(); byteBuffer1.getInt(); int i = pN.tx0(byteBuffer1.getInt()); byteBuffer1.getInt(); byteBuffer1.getInt(); this.E50 = pN.tx0(byteBuffer1.getInt()); ByteBuffer byteBuffer2 = params40.pr(); this.jQ = new Wf(i, 1, 1, 1, byteBuffer2);
/*   */     ByteBuffer byteBuffer1;
/* 4 */     (byteBuffer1 = params40.pr()).position(params40.wJ.nz(uq.Fb0)); int arrayOfInt[], j; for (arrayOfInt = new int[10], j = 0; j < 10; ) { arrayOfInt[j] = pN.tx0(byteBuffer1.getInt()); byteBuffer1.getInt(); j++; }  j = arrayOfInt[0]; ByteBuffer byteBuffer3 = params40.pr(); this(j, 4, 28, 1, byteBuffer3); Wf wf; zh0 zh01; U70 u701, u702, u703, u704, u705; this(new eQ(params40, wf, arrayOfInt)); this(new dJ0(params40, wf, arrayOfInt)); this(new ob0(params40, wf, arrayOfInt)); this(new Wc(params40, wf, arrayOfInt)); this(u702, 0, 0, 32, 32); (this.Le0 = new zh0[7])[0] = zh01; this(u702, 0, 32, 32, 32); this.Le0[1] = zh01; this(u702, 0, 128, 32, 32); this.Le0[4] = zh01; this(u703, 0, 64, 32, 32); this.Le0[2] = zh01; this(u703, 0, 96, 32, 32); this.Le0[3] = zh01; this(u704, 0, 192, 32, 32); this.Le0[6] = zh01; this(u705, 0, 160, 32, 32); this.Le0[5] = zh01; this(new jN(params40, arrayOfInt)); byte b; for (this.GD = new zh0[10], b = 0; b < 10; ) { zh0 zh02; this(u701, 0, b * 16, 8, 16); this.GD[b] = zh02; b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static WB0 L1;
/*   */   public zh0[] Le0;
/*   */   public zh0[] GD;
/*   */   public Wf jQ;
/*   */   public int E50;
/*   */   public s40 CoM8;
/*   */   public HashMap fx;
/*   */   
/*   */   public WB0() {
/*   */     HashMap<Object, Object> hashMap;
/*   */     this();
/*   */     this.fx = this;
/*   */   }
/*   */   
/*   */   public static WB0 QJ0() {
/*   */     if (L1 == null)
/*   */       L1 = new WB0(); 
/*   */     return L1;
/*   */   }
/*   */   
/*   */   public final zh0 wE0(int paramInt) {
/*   */     return this.Le0[paramInt];
/*   */   }
/*   */   
/*   */   public final zh0 Q() {
/*   */     return this.GD[0];
/*   */   }
/*   */   
/*   */   public final U70 OL0(int paramInt) {
/*   */     boolean bool1;
/*   */     boolean bool2;
/*   */     boolean bool3;
/*   */     boolean bool4;
/*   */     if (paramInt > 0) {
/*   */       bool1 = true;
/*   */     } else {
/*   */       bool1 = false;
/*   */     } 
/*   */     if (paramInt > 1) {
/*   */       bool2 = true;
/*   */     } else {
/*   */       bool2 = false;
/*   */     } 
/*   */     if (paramInt > 1) {
/*   */       bool3 = true;
/*   */     } else {
/*   */       bool3 = false;
/*   */     } 
/*   */     if (paramInt > 2) {
/*   */       bool4 = true;
/*   */     } else {
/*   */       bool4 = false;
/*   */     } 
/*   */     if (paramInt > 2) {
/*   */       paramInt = 1;
/*   */     } else {
/*   */       paramInt = 0;
/*   */     } 
/*   */     return UK0(bool1, bool2, bool3, bool4, paramInt);
/*   */   }
/*   */   
/*   */   public final U70 UK0(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
/*   */     boolean bool;
/*   */     int i;
/*   */     if (paramBoolean2) {
/*   */       i = paramBoolean1 | 0x2;
/*   */     } else {
/*   */       bool = paramBoolean1;
/*   */     } 
/*   */     if (paramBoolean3)
/*   */       i = bool | 0x4; 
/*   */     if (paramBoolean4)
/*   */       i |= 0x8; 
/*   */     if (paramBoolean5)
/*   */       i |= 0x10; 
/*   */     if (this.fx.containsKey(Integer.valueOf(i)))
/*   */       return (U70)this.fx.get(Integer.valueOf(i)); 
/*   */     this.fx.put(Integer.valueOf(i), new U70(new cp0(this, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5)));
/*   */     return (U70)this.fx.get(Integer.valueOf(i));
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WB0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */