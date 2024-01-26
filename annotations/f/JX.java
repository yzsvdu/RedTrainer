/*  1 */ package f;public class JX implements M30 { public static yj GM = yj.xd0; public re0 Qa0; public final float[] mI; public int LJ0; public Texture fH; public float PB0; public float ul; public boolean V10; public final Matrix4 q0; public final Matrix4 qZ; public final Matrix4 Is; public int rc0; public int R00; public int s10; public int ID0; public final Rm0 fe; public Rm0 J30; public boolean Xa; public final Color Bm; public float lPt6; public int G20; public int ez0; public JX() { this(1000, null); } public JX(int paramInt) { this(paramInt, null); } public JX(int paramInt, Rm0 paramRm0) { short[] arrayOfShort; Matrix4 matrix4; this.LJ0 = 0; this.fH = null; this.PB0 = 0.0F; this.ul = 0.0F; this.V10 = false; this.q0 = new Matrix4(); this(); this.qZ = new Matrix4(); this.Is = new Matrix4(); this.rc0 = 770; this.R00 = 771; this.s10 = 770; this.ID0 = 771; this.J30 = null; this.Bm = new Color(1.0F, 1.0F, 1.0F, 1.0F); this.lPt6 = Color.WHITE_FLOAT_BITS; this.G20 = 0; this.ez0 = 0; if (paramInt <= 8191) { lw0 lw0; yj yj1; if (UB0.Je != null) { yj1 = yj.bz0; } else { yj1 = GM; }  re0 re01 = new re0(); int i = paramInt * 4; this(1, 2, "a_position"); lw0[] arrayOfLw0; (arrayOfLw0 = new lw0[3])[0] = lw0; this(4, 4, "a_color"); (new lw0[3])[1] = lw0; this(16, 2, "a_texCoord0"); (new lw0[3])[2] = lw0; this(yj1, false, i, j, arrayOfLw0); this.Qa0 = re01; matrix4.ZA0(UB0.M60.fG0(), UB0.M60.dL()); short s; byte b; int j; for (this.mI = new float[paramInt * 20], arrayOfShort = new short[j = paramInt * 6], s = 0, b = 0; b < j; ) { arrayOfShort[b] = s; int k = b + 1; arrayOfShort[k] = (short)(s + 1); k = b + 2; i = (short)(s + 2); arrayOfShort[k] = i; arrayOfShort[b + 3] = i; k = b + 4; arrayOfShort[k] = (short)(s + 3); arrayOfShort[b + 5] = s; b += 6; s = (short)(s + 4); }  this.Qa0.cOM9(arrayOfShort); if (paramRm0 == null) { this.fe = static(); this.Xa = true; } else { this.fe = paramRm0; }  return; }  throw new IllegalArgumentException(XD0.SD0("Can't have more than 8191 sprites per batch: ", arrayOfShort)); } public final void Tx() { if (!this.V10) { this.G20 = 0; UB0.go.glDepthMask(false); Rm0 rm0; if ((rm0 = this.J30) != null) { rm0.bind(); } else { this.fe.bind(); }  A6(); this.V10 = true; return; }  throw new IllegalStateException("SpriteBatch.end must be called before begin."); } public final void end() { if (this.V10) { if (this.LJ0 > 0) ot();  this.fH = null; this.V10 = false; UB0.go.glDepthMask(true); UB0.go.glDisable(3042); return; }  throw new IllegalStateException("SpriteBatch.begin must be called before end."); } public final void HK0(Color paramColor) { this.Bm.set(paramColor); this.lPt6 = paramColor.toFloatBits(); } public final void implements(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.Bm.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4); this.lPt6 = this.Bm.toFloatBits(); } public final void og0(float paramFloat) { Color.abgr8888ToColor(this.Bm, paramFloat); this.lPt6 = paramFloat; } public static Rm0 static() { this("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n#define LOWP lowp\nprecision mediump float;\n#else\n#define LOWP \n#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}"); Rm0 rm0; if ((new Rm0()).Xu0) return rm0; 
/*  2 */     throw new IllegalArgumentException(
/*  3 */         B40.df("Error compiling shader: ")
/*  4 */         .append(rm0.ET()).toString()); } public void oS(Texture paramTexture, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { if (this.V10) { float[] arrayOfFloat = this.mI; if (paramTexture != this.fH) { c3(paramTexture); } else if (this.LJ0 == arrayOfFloat.length) { ot(); }  float f2; float f3 = paramInt1 * (f2 = this.PB0); float f1; float f4 = (paramInt2 + paramInt4) * (f1 = this.ul); f2 = (paramInt1 + paramInt3) * f2; f1 = paramInt2 * f1; float f5 = paramFloat1 + paramInt3; float f6 = paramFloat2 + paramInt4; float f7 = this.lPt6; arrayOfFloat[i] = paramFloat1; arrayOfFloat[i + 1] = paramFloat2; arrayOfFloat[i + 2] = f7; arrayOfFloat[i + 3] = f3; arrayOfFloat[i + 4] = f4; arrayOfFloat[i + 5] = paramFloat1; arrayOfFloat[i + 6] = f6; arrayOfFloat[i + 7] = f7; arrayOfFloat[i + 8] = f3; arrayOfFloat[i + 9] = f1; arrayOfFloat[i + 10] = f5; arrayOfFloat[i + 11] = f6; arrayOfFloat[i + 12] = f7; arrayOfFloat[i + 13] = f2; arrayOfFloat[i + 14] = f1; arrayOfFloat[i + 15] = f5; arrayOfFloat[i + 16] = paramFloat2; arrayOfFloat[i + 17] = f7; arrayOfFloat[i + 18] = f2; arrayOfFloat[i + 19] = f4; int i; this.LJ0 = (i = this.LJ0) + 20; return; }  throw new IllegalStateException("SpriteBatch.begin must be called before draw."); } public void WE0(Texture paramTexture, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8) { if (this.V10) { float[] arrayOfFloat = this.mI; if (paramTexture != this.fH) { c3(paramTexture); } else if (this.LJ0 == arrayOfFloat.length) { ot(); }  float f1 = paramFloat1 + paramFloat3; float f2 = paramFloat2 + paramFloat4; paramFloat3 = this.lPt6; arrayOfFloat[i] = paramFloat1; arrayOfFloat[i + 1] = paramFloat2; arrayOfFloat[i + 2] = paramFloat3; arrayOfFloat[i + 3] = paramFloat5; arrayOfFloat[i + 4] = paramFloat6; arrayOfFloat[i + 5] = paramFloat1; arrayOfFloat[i + 6] = f2; arrayOfFloat[i + 7] = paramFloat3; arrayOfFloat[i + 8] = paramFloat5; arrayOfFloat[i + 9] = paramFloat8; arrayOfFloat[i + 10] = f1; arrayOfFloat[i + 11] = f2; arrayOfFloat[i + 12] = paramFloat3; arrayOfFloat[i + 13] = paramFloat7; arrayOfFloat[i + 14] = paramFloat8; arrayOfFloat[i + 15] = f1; arrayOfFloat[i + 16] = paramFloat2; arrayOfFloat[i + 17] = paramFloat3; arrayOfFloat[i + 18] = paramFloat7; arrayOfFloat[i + 19] = paramFloat6; int i; this.LJ0 = (i = this.LJ0) + 20; return; }  throw new IllegalStateException("SpriteBatch.begin must be called before draw."); } public void Ap0(Texture paramTexture, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { if (this.V10) { float[] arrayOfFloat = this.mI; if (paramTexture != this.fH) { c3(paramTexture); } else if (this.LJ0 == arrayOfFloat.length) { ot(); }  float f1 = paramFloat1 + paramFloat3; float f2 = paramFloat2 + paramFloat4; paramFloat3 = this.lPt6; arrayOfFloat[i] = paramFloat1; arrayOfFloat[i + 1] = paramFloat2; arrayOfFloat[i + 2] = paramFloat3; arrayOfFloat[i + 3] = 0.0F; arrayOfFloat[i + 4] = 1.0F; arrayOfFloat[i + 5] = paramFloat1; arrayOfFloat[i + 6] = f2; arrayOfFloat[i + 7] = paramFloat3; arrayOfFloat[i + 8] = 0.0F; arrayOfFloat[i + 9] = 0.0F; arrayOfFloat[i + 10] = f1; arrayOfFloat[i + 11] = f2; arrayOfFloat[i + 12] = paramFloat3; arrayOfFloat[i + 13] = 1.0F; arrayOfFloat[i + 14] = 0.0F; arrayOfFloat[i + 15] = f1; arrayOfFloat[i + 16] = paramFloat2; arrayOfFloat[i + 17] = paramFloat3; arrayOfFloat[i + 18] = 1.0F; arrayOfFloat[i + 19] = 1.0F; int i; this.LJ0 = (i = this.LJ0) + 20; return; }  throw new IllegalStateException("SpriteBatch.begin must be called before draw."); } public void Yo0(pe0 parampe0, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { if (this.V10) { float[] arrayOfFloat = this.mI; Texture texture; if ((texture = parampe0.G3) != this.fH) { c3(texture); } else if (this.LJ0 == arrayOfFloat.length) { ot(); }  float f1 = paramFloat1 + paramFloat3; float f2 = paramFloat2 + paramFloat4; paramFloat3 = parampe0.mP; paramFloat4 = parampe0.bh0; float f3 = parampe0.zV; float f4 = parampe0.WT; float f5 = this.lPt6; arrayOfFloat[i] = paramFloat1; arrayOfFloat[i + 1] = paramFloat2; arrayOfFloat[i + 2] = f5; arrayOfFloat[i + 3] = paramFloat3; arrayOfFloat[i + 4] = paramFloat4; arrayOfFloat[i + 5] = paramFloat1; arrayOfFloat[i + 6] = f2; arrayOfFloat[i + 7] = f5; arrayOfFloat[i + 8] = paramFloat3; arrayOfFloat[i + 9] = f4; arrayOfFloat[i + 10] = f1; arrayOfFloat[i + 11] = f2; arrayOfFloat[i + 12] = f5; arrayOfFloat[i + 13] = f3; arrayOfFloat[i + 14] = f4; arrayOfFloat[i + 15] = f1; arrayOfFloat[i + 16] = paramFloat2; arrayOfFloat[i + 17] = f5; arrayOfFloat[i + 18] = f3; arrayOfFloat[i + 19] = paramFloat4; int i; this.LJ0 = (i = this.LJ0) + 20; return; }  throw new IllegalStateException("SpriteBatch.begin must be called before draw."); } public void dR(pe0 parampe0, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9) { if (this.V10) { float[] arrayOfFloat = this.mI; Texture texture; if ((texture = parampe0.G3) != this.fH) { c3(texture); } else if (this.LJ0 == arrayOfFloat.length) { ot(); }  paramFloat1 += paramFloat3; paramFloat2 += paramFloat4; paramFloat3 = -paramFloat3; paramFloat4 = -paramFloat4; paramFloat5 -= paramFloat3; paramFloat6 -= paramFloat4; if (paramFloat7 != 1.0F || paramFloat8 != 1.0F) { paramFloat3 *= paramFloat7; paramFloat4 *= paramFloat8; paramFloat5 *= paramFloat7; paramFloat6 *= paramFloat8; }  if (paramFloat9 != 0.0F) { paramFloat7 = nx0.Tu0(paramFloat9); paramFloat5 = (paramFloat3 = paramFloat7 * paramFloat3) - paramFloat8 * paramFloat4; paramFloat4 = paramFloat7 * paramFloat4 + paramFloat9; paramFloat6 = paramFloat3 - (paramFloat3 = paramFloat8 * paramFloat6); paramFloat8 = (paramFloat9 = paramFloat8 * paramFloat3) + (paramFloat7 *= paramFloat6); paramFloat3 = paramFloat7 * paramFloat5 - paramFloat3; paramFloat9 = paramFloat3 - paramFloat6 + paramFloat5; f3 = (paramFloat7 = (paramFloat8 = nx0.nH(paramFloat9)) * paramFloat5 + paramFloat7) - paramFloat8 - paramFloat4; paramFloat6 = f3; paramFloat8 = paramFloat9; f3 = paramFloat7; paramFloat7 = paramFloat3; paramFloat9 = paramFloat8; paramFloat4 = paramFloat6; paramFloat5 = paramFloat4; paramFloat3 = paramFloat5; } else { paramFloat6 = paramFloat4; paramFloat8 = paramFloat5; f3 = paramFloat6; paramFloat7 = paramFloat5; paramFloat9 = paramFloat6; paramFloat4 = paramFloat3; paramFloat5 = paramFloat4; }  float f1 = paramFloat3 + paramFloat1; float f2 = paramFloat5 + paramFloat2; paramFloat1 = paramFloat4 + paramFloat1; paramFloat2 = paramFloat9 + paramFloat2; paramFloat3 = paramFloat7 + paramFloat1; paramFloat4 = f3 + paramFloat2; paramFloat5 = paramFloat8 + paramFloat1; paramFloat6 += paramFloat2; paramFloat7 = parampe0.mP; paramFloat8 = parampe0.bh0; paramFloat9 = parampe0.zV; float f3 = parampe0.WT; float f4 = this.lPt6; arrayOfFloat[i] = f1; arrayOfFloat[i + 1] = f2; arrayOfFloat[i + 2] = f4; arrayOfFloat[i + 3] = paramFloat7; arrayOfFloat[i + 4] = paramFloat8; arrayOfFloat[i + 5] = paramFloat1; arrayOfFloat[i + 6] = paramFloat2; arrayOfFloat[i + 7] = f4; arrayOfFloat[i + 8] = paramFloat7; arrayOfFloat[i + 9] = f3; arrayOfFloat[i + 10] = paramFloat3; arrayOfFloat[i + 11] = paramFloat4; arrayOfFloat[i + 12] = f4; arrayOfFloat[i + 13] = paramFloat9; arrayOfFloat[i + 14] = f3; arrayOfFloat[i + 15] = paramFloat5; arrayOfFloat[i + 16] = paramFloat6; arrayOfFloat[i + 17] = f4; arrayOfFloat[i + 18] = paramFloat9; arrayOfFloat[i + 19] = paramFloat8; int i; this.LJ0 = (i = this.LJ0) + 20; return; }  throw new IllegalStateException("SpriteBatch.begin must be called before draw."); } public final void ot() { int i; if ((i = this.LJ0) == 0) return;  this.G20++; if ((i /= 20) > this.ez0) this.ez0 = i;  i *= 6; this.fH.bind(); re0 re01 = this.Qa0; float[] arrayOfFloat = this.mI; int k = this.LJ0; re01.Dt0.Dc(0, k, arrayOfFloat); re01.rs0.w0().position(0);
/*  5 */     re01.rs0.w0()
/*  6 */       .limit(i); UB0.go.glEnable(3042); int j; if ((j = this.rc0) != -1) { j = this.R00; k = this.s10; int m = this.ID0; UB0.go.glBlendFuncSeparate(j, j, k, m); }  Rm0 rm0; if ((rm0 = this.J30) == null) rm0 = this.fe; 
/*  7 */     boolean bool = re01.N70; re01.Gi0(rm0, 4, 0, i, bool);
/*  8 */     this.LJ0 = 0; } public final void dispose() { this.Qa0.dispose(); Rm0 rm0; if (this.Xa && (rm0 = this.fe) != null) dispose();  }
/*    */   public final void d60(Matrix4 paramMatrix4) { if (this.V10) ot();  this.qZ.getClass(); this.qZ.Qw(paramMatrix4.Z0); if (this.V10) A6();  }
/* 10 */   public final void A6() { Rm0 rm01; boolean bool; String str; Matrix4 matrix4 = this.qZ; this.Is.getClass(); this.Is.Qw(matrix4.Z0).lU(this.q0); Rm0 rm02; if ((rm02 = this.J30) != null) { Matrix4 matrix41 = this.Is; float[] arrayOfFloat = this.Z0; UB0.re0.glUniformMatrix4fv(rm02.mm0("u_projTrans", Rm0.bk0), 1, false, this, 0); rm01 = this.J30; bool = false; str = "u_texture"; } else { Matrix4 matrix41 = ((JX)super).Is;
/*    */ 
/*    */       
/* 13 */       float[] arrayOfFloat = this.Z0; UB0.re0.glUniformMatrix4fv(((JX)super).fe.mm0("u_projTrans", Rm0.bk0), 1, false, this, 0);
/* 14 */       rm01 = ((JX)super).fe; bool = false; str = "u_texture"; }
/*    */     
/*    */     oM();
/*    */     UB0.re0.glUniform1i(mm0(str, Rm0.bk0), bool); }
/*    */ 
/*    */   
/*    */   public final void c3(Texture paramTexture) {
/*    */     ot();
/*    */     this.fH = paramTexture;
/*    */     this.PB0 = 1.0F / paramTexture.getWidth();
/*    */     this.ul = 1.0F / paramTexture.getHeight();
/*    */   }
/*    */   
/*    */   public void BE(Texture paramTexture, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
/*    */     if (this.V10) {
/*    */       float[] arrayOfFloat = this.mI;
/*    */       if (paramTexture != this.fH) {
/*    */         c3(paramTexture);
/*    */       } else if (this.LJ0 == arrayOfFloat.length) {
/*    */         ot();
/*    */       } 
/*    */       float f2 = paramFloat1 + paramFloat3;
/*    */       paramFloat1 = paramFloat2 + paramFloat4;
/*    */       paramFloat2 = -paramFloat3;
/*    */       paramFloat3 = -paramFloat4;
/*    */       paramFloat4 = paramFloat5 - paramFloat3;
/*    */       paramFloat5 = paramFloat6 - paramFloat4;
/*    */       if (paramFloat7 != 1.0F || paramFloat8 != 1.0F) {
/*    */         paramFloat2 *= paramFloat7;
/*    */         paramFloat3 *= paramFloat8;
/*    */         paramFloat4 *= paramFloat7;
/*    */         paramFloat5 *= paramFloat8;
/*    */       } 
/*    */       if (paramFloat9 != 0.0F) {
/*    */         paramFloat6 = nx0.Tu0(paramFloat9);
/*    */         paramFloat4 = (paramFloat2 = paramFloat6 * paramFloat2) - paramFloat7 * paramFloat3;
/*    */         paramFloat3 = paramFloat6 * paramFloat3 + paramFloat8;
/*    */         paramFloat5 = paramFloat2 - (paramFloat2 = paramFloat7 * paramFloat5);
/*    */         paramFloat7 = (paramFloat8 = paramFloat7 * paramFloat2) + (paramFloat6 *= paramFloat5);
/*    */         paramFloat2 = paramFloat6 * paramFloat4 - paramFloat2;
/*    */         paramFloat8 = paramFloat2 - paramFloat5 + paramFloat4;
/*    */         paramFloat9 = (paramFloat6 = (paramFloat7 = nx0.nH(paramFloat9)) * paramFloat4 + paramFloat6) - paramFloat7 - paramFloat3;
/*    */         paramFloat3 = paramFloat4;
/*    */         paramFloat5 = paramFloat3;
/*    */         paramFloat2 = paramFloat5;
/*    */         paramFloat9 = paramFloat7;
/*    */         paramFloat7 = paramFloat2;
/*    */         paramFloat8 = paramFloat6;
/*    */         paramFloat6 = paramFloat8;
/*    */         paramFloat4 = paramFloat9;
/*    */       } else {
/*    */         paramFloat3 = paramFloat2;
/*    */         paramFloat5 = paramFloat3;
/*    */         paramFloat9 = paramFloat5;
/*    */         paramFloat7 = paramFloat4;
/*    */         paramFloat8 = paramFloat5;
/*    */         paramFloat6 = paramFloat4;
/*    */         paramFloat4 = paramFloat3;
/*    */       } 
/*    */       f2 = paramFloat3 + f2;
/*    */       paramFloat1 = paramFloat5 + paramFloat1;
/*    */       paramFloat2 += f2;
/*    */       paramFloat3 = paramFloat9 + paramFloat1;
/*    */       paramFloat4 = paramFloat7 + f2;
/*    */       paramFloat5 = paramFloat8 + paramFloat1;
/*    */       paramFloat6 += f2;
/*    */       paramFloat7 = paramFloat4 + paramFloat1;
/*    */       paramFloat9 = paramInt1 * (paramFloat8 = this.PB0);
/*    */       float f3;
/*    */       float f4 = (paramInt2 + paramInt4) * (f3 = this.ul);
/*    */       paramFloat8 = (paramInt1 + paramInt3) * paramFloat8;
/*    */       f3 = paramInt2 * f3;
/*    */       if (paramBoolean) {
/*    */         f3 = f4;
/*    */         f4 = f3;
/*    */       } 
/*    */       float f1 = this.lPt6;
/*    */       arrayOfFloat[paramInt3] = f2;
/*    */       arrayOfFloat[paramInt3 + 1] = paramFloat1;
/*    */       arrayOfFloat[paramInt3 + 2] = f1;
/*    */       arrayOfFloat[paramInt3 + 3] = paramFloat9;
/*    */       arrayOfFloat[paramInt3 + 4] = f4;
/*    */       arrayOfFloat[paramInt3 + 5] = paramFloat2;
/*    */       arrayOfFloat[paramInt3 + 6] = paramFloat3;
/*    */       arrayOfFloat[paramInt3 + 7] = f1;
/*    */       arrayOfFloat[paramInt3 + 8] = paramFloat9;
/*    */       arrayOfFloat[paramInt3 + 9] = f3;
/*    */       arrayOfFloat[paramInt3 + 10] = paramFloat4;
/*    */       arrayOfFloat[paramInt3 + 11] = paramFloat5;
/*    */       arrayOfFloat[paramInt3 + 12] = f1;
/*    */       arrayOfFloat[paramInt3 + 13] = paramFloat8;
/*    */       arrayOfFloat[paramInt3 + 14] = f3;
/*    */       arrayOfFloat[paramInt3 + 15] = paramFloat6;
/*    */       arrayOfFloat[paramInt3 + 16] = paramFloat7;
/*    */       arrayOfFloat[paramInt3 + 17] = f1;
/*    */       arrayOfFloat[paramInt3 + 18] = paramFloat8;
/*    */       arrayOfFloat[paramInt3 + 19] = f4;
/*    */       this.LJ0 = (paramInt3 = this.LJ0) + 20;
/*    */       return;
/*    */     } 
/*    */     throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
/*    */   }
/*    */   
/*    */   public void P10(Texture paramTexture, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     byte b1 = 0;
/*    */     byte b2 = 0;
/*    */     if (this.V10) {
/*    */       float[] arrayOfFloat = this.mI;
/*    */       if (paramTexture != this.fH) {
/*    */         c3(paramTexture);
/*    */       } else if (this.LJ0 == arrayOfFloat.length) {
/*    */         ot();
/*    */       } 
/*    */       float f2;
/*    */       paramFloat3 = f2 * (f2 = this.PB0);
/*    */       float f3 = (b2 + paramInt2) * (paramFloat4 = this.ul);
/*    */       f2 = (b1 + paramInt1) * f2;
/*    */       paramFloat4 = (f2 = b1) * paramFloat4;
/*    */       float f4 = paramFloat1 + paramFloat3;
/*    */       float f5 = paramFloat2 + paramFloat4;
/*    */       if (!paramBoolean1) {
/*    */         f2 = paramFloat3;
/*    */         paramFloat3 = f2;
/*    */       } 
/*    */       if (paramBoolean2) {
/*    */         paramFloat4 = f3;
/*    */         f3 = paramFloat4;
/*    */       } 
/*    */       float f1 = this.lPt6;
/*    */       arrayOfFloat[i] = paramFloat1;
/*    */       arrayOfFloat[i + 1] = paramFloat2;
/*    */       arrayOfFloat[i + 2] = f1;
/*    */       arrayOfFloat[i + 3] = f2;
/*    */       arrayOfFloat[i + 4] = f3;
/*    */       arrayOfFloat[i + 5] = paramFloat1;
/*    */       arrayOfFloat[i + 6] = f5;
/*    */       arrayOfFloat[i + 7] = f1;
/*    */       arrayOfFloat[i + 8] = f2;
/*    */       arrayOfFloat[i + 9] = paramFloat4;
/*    */       arrayOfFloat[i + 10] = f4;
/*    */       arrayOfFloat[i + 11] = f5;
/*    */       arrayOfFloat[i + 12] = f1;
/*    */       arrayOfFloat[i + 13] = paramFloat3;
/*    */       arrayOfFloat[i + 14] = paramFloat4;
/*    */       arrayOfFloat[i + 15] = f4;
/*    */       arrayOfFloat[i + 16] = paramFloat2;
/*    */       arrayOfFloat[i + 17] = f1;
/*    */       arrayOfFloat[i + 18] = paramFloat3;
/*    */       arrayOfFloat[i + 19] = f3;
/*    */       int i;
/*    */       this.LJ0 = (i = this.LJ0) + 20;
/*    */       return;
/*    */     } 
/*    */     throw new IllegalStateException("SpriteBatch.begin must be called before draw.");
/*    */   }
/*    */   
/*    */   public void xu(Texture paramTexture, float[] paramArrayOffloat, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: iconst_0
/*    */     //   2: istore #4
/*    */     //   4: getfield V10 : Z
/*    */     //   7: ifeq -> 142
/*    */     //   10: aload_1
/*    */     //   11: aload_0
/*    */     //   12: dup
/*    */     //   13: getfield mI : [F
/*    */     //   16: arraylength
/*    */     //   17: istore #5
/*    */     //   19: getfield fH : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   22: if_acmpeq -> 33
/*    */     //   25: aload_0
/*    */     //   26: aload_1
/*    */     //   27: invokevirtual c3 : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   30: goto -> 49
/*    */     //   33: iload #5
/*    */     //   35: aload_0
/*    */     //   36: getfield LJ0 : I
/*    */     //   39: isub
/*    */     //   40: dup
/*    */     //   41: istore_1
/*    */     //   42: ifne -> 52
/*    */     //   45: aload_0
/*    */     //   46: invokevirtual ot : ()V
/*    */     //   49: iload #5
/*    */     //   51: istore_1
/*    */     //   52: iload_3
/*    */     //   53: aload_0
/*    */     //   54: dup
/*    */     //   55: aload_2
/*    */     //   56: iload #4
/*    */     //   58: aload_0
/*    */     //   59: dup
/*    */     //   60: iload_1
/*    */     //   61: iload_3
/*    */     //   62: invokestatic min : (II)I
/*    */     //   65: istore_1
/*    */     //   66: getfield mI : [F
/*    */     //   69: astore_3
/*    */     //   70: getfield LJ0 : I
/*    */     //   73: aload_3
/*    */     //   74: swap
/*    */     //   75: iload_1
/*    */     //   76: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   79: getfield LJ0 : I
/*    */     //   82: iload_1
/*    */     //   83: iadd
/*    */     //   84: putfield LJ0 : I
/*    */     //   87: iload_1
/*    */     //   88: isub
/*    */     //   89: istore_3
/*    */     //   90: iload_3
/*    */     //   91: ifle -> 141
/*    */     //   94: iload_3
/*    */     //   95: aload_0
/*    */     //   96: dup
/*    */     //   97: aload_2
/*    */     //   98: aload_0
/*    */     //   99: iload #5
/*    */     //   101: iload_3
/*    */     //   102: aload_0
/*    */     //   103: iload #4
/*    */     //   105: iload_1
/*    */     //   106: iadd
/*    */     //   107: istore #4
/*    */     //   109: invokevirtual ot : ()V
/*    */     //   112: invokestatic min : (II)I
/*    */     //   115: istore_1
/*    */     //   116: getfield mI : [F
/*    */     //   119: iload #4
/*    */     //   121: swap
/*    */     //   122: iconst_0
/*    */     //   123: iload_1
/*    */     //   124: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   127: getfield LJ0 : I
/*    */     //   130: iload_1
/*    */     //   131: iadd
/*    */     //   132: putfield LJ0 : I
/*    */     //   135: iload_1
/*    */     //   136: isub
/*    */     //   137: istore_3
/*    */     //   138: goto -> 90
/*    */     //   141: return
/*    */     //   142: new java/lang/IllegalStateException
/*    */     //   145: dup
/*    */     //   146: ldc_w 'SpriteBatch.begin must be called before draw.'
/*    */     //   149: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   152: athrow
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/JX.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */