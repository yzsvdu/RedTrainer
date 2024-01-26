/*  1 */ package f;public final class U70 extends Bw { public final ZH cOm9() { this
/*  2 */       .mk = zm0.u20;
/*    */     
/*    */     ZH zH;
/*    */     Gdx2DPixmap gdx2DPixmap;
/*  6 */     this.mv = (gdx2DPixmap = (zH = this.Jf0.ys0()).Con).ju;
/*    */     
/*  8 */     this.s7 = gdx2DPixmap.Og0; if (this.Gd0 && this.WG == null) { this
/*    */ 
/*    */         
/* 11 */         .WG = new BitSet(zH.Con.Og0); if (zH.TU() == Uc.xi0) { ByteBuffer byteBuffer; for (int i = this.mv * 4; byteBuffer.hasRemaining();) { if ((byteBuffer.getInt() & 0xFF) != 0) { this.WG.set((byteBuffer.position() - 4) / i); byteBuffer.position(((byteBuffer.position() - 4) / i + 1) * i); }  }  byteBuffer.position(0); } else { throw new RuntimeException(
/* 12 */             B40.df("Not supported pixmap format = ")
/* 13 */             .append(zH.TU()).toString()); }  }  return zH; }
/*    */ 
/*    */   
/*    */   public static final U70 ah0;
/*    */   public N50 Jf0;
/*    */   public Texture kw;
/*    */   public boolean Gd0 = false;
/*    */   public int mv = -1;
/*    */   public int s7 = -1;
/*    */   public BitSet WG = null;
/*    */   
/*    */   public U70(N50 paramN50) {
/*    */     this.Jf0 = paramN50;
/*    */   }
/*    */   
/*    */   static {
/*    */     this();
/*    */     U70 u70;
/*    */     iF iF;
/*    */     xF0 xF0;
/*    */     this(iF);
/*    */     (ah0 = new U70()).lu(u70);
/*    */     this();
/*    */     this(xF0);
/*    */     (new U70()).lu(u70);
/*    */   }
/*    */   
/*    */   public final Texture HA0() {
/*    */     this.mk = zm0.u20;
/*    */     Texture texture;
/*    */     if ((texture = this.kw) != null)
/*    */       return texture; 
/*    */     (this.kw = new Texture(zH)).setWrap(A00.OW, A00.OW);
/*    */     Bb0.DL0(this);
/*    */     ZH zH;
/*    */     (zH = cOm9()).dispose();
/*    */     return this.kw;
/*    */   }
/*    */   
/*    */   public final int Zz() {
/*    */     return this.mv;
/*    */   }
/*    */   
/*    */   public final int eh0() {
/*    */     return this.s7;
/*    */   }
/*    */   
/*    */   public final aF jt0() {
/*    */     return new aF(this);
/*    */   }
/*    */   
/*    */   public final void yM() {
/*    */     HashSet hashSet;
/*    */     this.kw = null;
/*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/HashSet}, expression=ObjectTypeReferenceExpression{ObjectType{f/Bb0}}, name=fA, descriptor=Ljava/util/HashSet;}} */
/*    */     try {
/*    */       Bb0.fA.remove(this);
/*    */       return;
/*    */     } finally {
/*    */       this = null;
/*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/HashSet}, name=null} */
/*    */     } 
/*    */   }
/*    */   
/*    */   public final zh0 Ql0() {
/*    */     return new zh0(this, 0, 0, -1, -1);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/U70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */