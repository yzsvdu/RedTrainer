/*  1 */ package f;public abstract class zp implements iq0 { private static float maxAnisotropicFilterLevel = 0.0F; public final int glTarget; public int glHandle; public cu0 minFilter; public cu0 magFilter; public static float getMaxAnisotropicFilterLevel() { float f; if ((f = maxAnisotropicFilterLevel) > 0.0F) return f;  UB0.M60.getClass(); if (GLFW.glfwExtensionSupported("GL_EXT_texture_filter_anisotropic"))
/*  2 */     { FloatBuffer floatBuffer; (floatBuffer = BufferUtils.Sg()).position(0); BufferUtils.Sg().limit(BufferUtils.Sg().capacity()); UB0.re0.glGetFloatv(34047, floatBuffer); return maxAnisotropicFilterLevel = BufferUtils.Sg().get(0); }  maxAnisotropicFilterLevel = 1.0F; return 1.0F; } public A00 uWrap; public A00 vWrap; public float anisotropicFilterLevel; public zp(int paramInt) { this(paramInt, UB0.go.glGenTexture()); } public zp(int paramInt1, int paramInt2) { cu0 cu01 = cu0.Fh; this.magFilter = this; A00 a00 = A00.IB0; this.vWrap = this; this.anisotropicFilterLevel = 1.0F; this.glTarget = paramInt1; this.glHandle = paramInt2; } public static void uploadImageData(int paramInt, Bu0 paramBu0) { uploadImageData(paramInt, paramBu0, 0); } public static void uploadImageData(int paramInt1, Bu0 paramBu0, int paramInt2) { if (paramBu0 == null) return;  if (!paramBu0.aF0()) paramBu0.zr0();  if (paramBu0.getType() == EL.Lu0) { paramBu0.pk0(paramInt1); return; }  ZH zH = paramBu0.Jw(); boolean bool = paramBu0.zb(); if (paramBu0.getFormat() != zH.TU()) { ZH zH1; int i = zH.Con.ju;
/*  3 */       int j = zH.Con.Og0;
/*  4 */       Uc uc = paramBu0.getFormat(); this(i, j, uc); (new ZH()).r1(y1.Zj); i = 0; j = 0; boolean bool2 = false, bool3 = false;
/*  5 */       Gdx2DPixmap gdx2DPixmap = zH.Con;
/*  6 */       int k = gdx2DPixmap.ju;
/*  7 */       int m = gdx2DPixmap.Og0;
/*  8 */       zH1.Con.nM(gdx2DPixmap, bool2, bool3, i, j, k, m);
/*  9 */       if (paramBu0.zb()) zH.dispose();  boolean bool1 = true; zH = zH1; }  UB0.go.glPixelStorei(3317, 1); if (paramBu0.wm0())
/*    */     
/* 11 */     { paramInt1 = zH.Con.ju;
/* 12 */       int i = zH.Con.Og0;
/* 13 */       Dr.Rn0(paramInt1, zH, paramInt1, i); } else { paramInt1 = zH.PB();
/*    */       
/* 15 */       int i = zH.Con.ju;
/* 16 */       int j = zH.Con.Og0;
/* 17 */       int k = zH.qf(), m = zH.i5(); ByteBuffer byteBuffer = zH.tp0(); UB0.go.glTexImage2D(paramInt1, paramInt2, paramInt1, i, j, 0, k, m, byteBuffer); }  if (bool) zH.dispose();  }
/*    */ 
/*    */   
/*    */   public void bind() {
/*    */     int i = this.glTarget;
/*    */     UB0.go.glBindTexture(i, this.glHandle);
/*    */   }
/*    */   
/*    */   public void bind(int paramInt) {
/*    */     UB0.go.glActiveTexture(paramInt + 33984);
/*    */     int i = this.glTarget;
/*    */     UB0.go.glBindTexture(i, this.glHandle);
/*    */   }
/*    */   
/*    */   public cu0 getMinFilter() {
/*    */     return this.minFilter;
/*    */   }
/*    */   
/*    */   public cu0 getMagFilter() {
/*    */     return this.magFilter;
/*    */   }
/*    */   
/*    */   public A00 getUWrap() {
/*    */     return this.uWrap;
/*    */   }
/*    */   
/*    */   public A00 getVWrap() {
/*    */     return this.vWrap;
/*    */   }
/*    */   
/*    */   public int getTextureObjectHandle() {
/*    */     return this.glHandle;
/*    */   }
/*    */   
/*    */   public void unsafeSetWrap(A00 paramA001, A00 paramA002) {
/*    */     unsafeSetWrap(paramA001, paramA002, false);
/*    */   }
/*    */   
/*    */   public void unsafeSetWrap(A00 paramA001, A00 paramA002, boolean paramBoolean) {
/*    */     if (paramA001 != null && (paramBoolean || this.uWrap != paramA001)) {
/*    */       int i = this.glTarget;
/*    */       char c = '⠂';
/*    */       int j = paramA001.UA0;
/*    */       UB0.go.glTexParameteri(i, c, j);
/*    */       this.uWrap = paramA001;
/*    */     } 
/*    */     if (paramA002 != null && (paramBoolean || this.vWrap != paramA002)) {
/*    */       int i = this.glTarget;
/*    */       char c = '⠃';
/*    */       int j = paramA002.UA0;
/*    */       UB0.go.glTexParameteri(i, c, j);
/*    */       this.vWrap = paramA002;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void setWrap(A00 paramA001, A00 paramA002) {
/*    */     this.uWrap = paramA001;
/*    */     this.vWrap = paramA002;
/*    */     bind();
/*    */     int j = this.glTarget;
/*    */     char c = '⠂';
/*    */     int m = paramA001.UA0;
/*    */     UB0.go.glTexParameteri(j, c, m);
/*    */     int i = this.glTarget;
/*    */     j = 10243;
/*    */     int k = paramA002.UA0;
/*    */     UB0.go.glTexParameteri(i, j, k);
/*    */   }
/*    */   
/*    */   public void unsafeSetFilter(cu0 paramcu01, cu0 paramcu02) {
/*    */     unsafeSetFilter(paramcu01, paramcu02, false);
/*    */   }
/*    */   
/*    */   public void unsafeSetFilter(cu0 paramcu01, cu0 paramcu02, boolean paramBoolean) {
/*    */     if (paramcu01 != null && (paramBoolean || this.minFilter != paramcu01)) {
/*    */       int i = this.glTarget;
/*    */       char c = '⠁';
/*    */       int j = paramcu01.Co0;
/*    */       UB0.go.glTexParameteri(i, c, j);
/*    */       this.minFilter = paramcu01;
/*    */     } 
/*    */     if (paramcu02 != null && (paramBoolean || this.magFilter != paramcu02)) {
/*    */       int i = this.glTarget;
/*    */       char c = '⠀';
/*    */       int j = paramcu02.Co0;
/*    */       UB0.go.glTexParameteri(i, c, j);
/*    */       this.magFilter = paramcu02;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void setFilter(cu0 paramcu01, cu0 paramcu02) {
/*    */     this.minFilter = paramcu01;
/*    */     this.magFilter = paramcu02;
/*    */     bind();
/*    */     int j = this.glTarget;
/*    */     char c = '⠁';
/*    */     int m = paramcu01.Co0;
/*    */     UB0.go.glTexParameteri(j, c, m);
/*    */     int i = this.glTarget;
/*    */     j = 10240;
/*    */     int k = paramcu02.Co0;
/*    */     UB0.go.glTexParameteri(i, j, k);
/*    */   }
/*    */   
/*    */   public float unsafeSetAnisotropicFilter(float paramFloat) {
/*    */     return unsafeSetAnisotropicFilter(paramFloat, false);
/*    */   }
/*    */   
/*    */   public float unsafeSetAnisotropicFilter(float paramFloat, boolean paramBoolean) {
/*    */     float f;
/*    */     if ((f = getMaxAnisotropicFilterLevel()) == 1.0F)
/*    */       return 1.0F; 
/*    */     paramFloat = Math.min(paramFloat, f);
/*    */     if (!paramBoolean) {
/*    */       boolean bool;
/*    */       float f1 = 0.1F;
/*    */       if (Math.abs(paramFloat - this.anisotropicFilterLevel) <= f1) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool)
/*    */         return this.anisotropicFilterLevel; 
/*    */     } 
/*    */     UB0.re0.glTexParameterf(3553, 34046, paramFloat);
/*    */     this.anisotropicFilterLevel = paramFloat;
/*    */     return paramFloat;
/*    */   }
/*    */   
/*    */   public float setAnisotropicFilter(float paramFloat) {
/*    */     boolean bool;
/*    */     float f;
/*    */     if ((f = getMaxAnisotropicFilterLevel()) == 1.0F)
/*    */       return 1.0F; 
/*    */     f = 0.1F;
/*    */     if (Math.abs((paramFloat = Math.min(paramFloat, f)) - this.anisotropicFilterLevel) <= f) {
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     if (bool)
/*    */       return paramFloat; 
/*    */     bind();
/*    */     UB0.re0.glTexParameterf(3553, 34046, paramFloat);
/*    */     this.anisotropicFilterLevel = paramFloat;
/*    */     return paramFloat;
/*    */   }
/*    */   
/*    */   public float getAnisotropicFilter() {
/*    */     return this.anisotropicFilterLevel;
/*    */   }
/*    */   
/*    */   public void delete() {
/*    */     int i;
/*    */     if ((i = this.glHandle) != 0) {
/*    */       UB0.go.glDeleteTexture(i);
/*    */       this.glHandle = 0;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void dispose() {
/*    */     delete();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */