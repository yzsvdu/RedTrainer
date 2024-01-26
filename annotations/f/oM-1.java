/*  1 */ package f;public final class oM implements Bu0 { public final void pk0(int paramInt) { if (this.hI) { UB0.M60.getClass(); if (!GLFW.glfwExtensionSupported("GL_OES_compressed_ETC1_RGB8_texture"))
/*  2 */       { ZH zH = ETC1.xj0(this.Qy0, Uc.se0); int i = zH.PB();
/*    */         
/*  4 */         int j = zH.Con.ju;
/*  5 */         int k = zH.Con.Og0;
/*  6 */         int m = zH.qf(), n = zH.i5(); ByteBuffer byteBuffer = zH.tp0(); UB0.go.glTexImage2D(paramInt, 0, i, j, k, 0, m, n, byteBuffer); if (this.a20)
/*    */         
/*  8 */         { paramInt = zH.Con.ju;
/*  9 */           i = zH.Con.Og0;
/* 10 */           Dr.Rn0(paramInt, zH, paramInt, i); }  zH.dispose(); this.a20 = false; } else { paramInt = this.Dv; int i = this.Oc, j = this.Qy0.B8.capacity(); j -= this.Qy0.Zg0; ByteBuffer byteBuffer = this.Qy0.B8; UB0.go.glCompressedTexImage2D(paramInt, 0, 36196, paramInt, i, 0, j, byteBuffer); if (this
/* 11 */           .a20)
/* 12 */           UB0.re0.glGenerateMipmap(3553);  }
/*    */       
/* 14 */       BufferUtils.lf(this.Qy0.B8);
/* 15 */       this.Qy0 = null; this.hI = false; return; }  throw new JU("Call prepare() before calling consumeCompressedData()"); }
/*    */ 
/*    */   
/*    */   public RD0 gW;
/*    */   public dn0 Qy0;
/*    */   public boolean a20;
/*    */   public int Dv = 0;
/*    */   public int Oc = 0;
/*    */   public boolean hI = false;
/*    */   
/*    */   public oM(RD0 paramRD0) {
/*    */     this(paramRD0, false);
/*    */   }
/*    */   
/*    */   public oM(RD0 paramRD0, boolean paramBoolean) {
/*    */     this.gW = paramRD0;
/*    */     this.a20 = paramBoolean;
/*    */   }
/*    */   
/*    */   public oM(dn0 paramdn0, boolean paramBoolean) {
/*    */     this.Qy0 = paramdn0;
/*    */     this.a20 = paramBoolean;
/*    */   }
/*    */   
/*    */   public final EL getType() {
/*    */     return EL.Lu0;
/*    */   }
/*    */   
/*    */   public final boolean aF0() {
/*    */     return this.hI;
/*    */   }
/*    */   
/*    */   public final void zr0() {
/*    */     if (!this.hI) {
/*    */       RD0 rD0;
/*    */       if ((rD0 = this.gW) != null || this.Qy0 != null) {
/*    */         if (rD0 != null) {
/*    */           dn0 dn02;
/*    */           this(rD0);
/*    */           this.Qy0 = dn02;
/*    */         } 
/*    */         dn0 dn01;
/*    */         this.Dv = (dn01 = this.Qy0).Tj0;
/*    */         this.Oc = this.Pq;
/*    */         this.hI = true;
/*    */         return;
/*    */       } 
/*    */       throw new JU("Can only load once from ETC1Data");
/*    */     } 
/*    */     throw new JU("Already prepared");
/*    */   }
/*    */   
/*    */   public final ZH Jw() {
/*    */     throw new JU("This TextureData implementation does not return a Pixmap");
/*    */   }
/*    */   
/*    */   public final boolean zb() {
/*    */     throw new JU("This TextureData implementation does not return a Pixmap");
/*    */   }
/*    */   
/*    */   public final int Vb() {
/*    */     return this.Dv;
/*    */   }
/*    */   
/*    */   public final int wu0() {
/*    */     return this.Oc;
/*    */   }
/*    */   
/*    */   public final Uc getFormat() {
/*    */     return Uc.se0;
/*    */   }
/*    */   
/*    */   public final boolean wm0() {
/*    */     return this.a20;
/*    */   }
/*    */   
/*    */   public final boolean k50() {
/*    */     return true;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */