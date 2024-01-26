/*  1 */ package f;public final class Qb0 { public int uC; public int Hq0; public final int COM2; public int am; public final re0 sQ; public Rm0 Pf0; public boolean M80; public Qb0(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, Rm0 paramRm0) { this.O0 = new Matrix4(); this.COM2 = paramInt1; this.Tt = paramInt2; this.Pf0 = paramRm0; lw0[] arrayOfLw0 = Rl(paramBoolean1, paramBoolean2, paramInt2); this(false, paramInt1, 0, arrayOfLw0); this.sQ = re01; this.R60 = new float[(re01.n8()).Nb / 4 * paramInt1]; this.G20 = (re01.n8()).Nb / 4; re0 re01; if ((re01 = new re0()).Rb(8) != null) (re01.Rb(8)).TZ / 4;  if (re01.Rb(4) != null) { paramInt1 = (re01.Rb(4)).TZ / 4; } else { paramInt1 = 0; }  this.ZF0 = paramInt1; if (re01.Rb(16) != null) (re01.Rb(16)).TZ / 4;  for (this.e6 = new String[paramInt2], paramInt1 = 0; paramInt1 < paramInt2; ) { this.e6[paramInt1] = XD0.SD0("u_sampler", paramInt1);
/*  2 */       paramInt1++; }  } public final int Tt; public final int G20; public final int ZF0; public final Matrix4 O0; public final float[] R60; public final String[] e6; public Qb0(boolean paramBoolean1, boolean paramBoolean2, int paramInt) { this(5000, paramBoolean1, paramBoolean2, paramInt, this); this.M80 = true; } public Qb0(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2) { this(paramInt1, paramBoolean1, paramBoolean2, paramInt2, this); this.M80 = true; } public static Rm0 COM5(boolean paramBoolean1, boolean paramBoolean2, int paramInt) { StringBuilder stringBuilder2 = B40.df("attribute vec4 a_position;\n"); if (paramBoolean1) { str6 = "attribute vec3 a_normal;\n"; } else { str6 = ""; }  stringBuilder2 = stringBuilder2.append(str6); if (paramBoolean2) { str6 = "attribute vec4 a_color;\n"; } else { str6 = ""; }  String str2; byte b3; for (str2 = stringBuilder2.append(str6).toString(), b3 = 0; b3 < paramInt; ) { str2 = str2 + "attribute vec2 a_texCoord" + b3 + ";\n"; b3++; }
/*  3 */      StringBuilder stringBuilder1 = zw.vz(str2, "uniform mat4 u_projModelView;\n"); if (paramBoolean2)
/*  4 */     { str5 = "varying vec4 v_col;\n"; } else { str5 = ""; }  String str1; byte b2; for (str1 = stringBuilder1.append(str5).toString(), b2 = 0; b2 < paramInt; ) { str1 = str1 + "varying vec2 v_tex" + b2 + ";\n"; b2++; }
/*  5 */      str1 = m0.tF0(str1, "void main() {\n   gl_Position = u_projModelView * a_position;\n"); if (paramBoolean2)
/*  6 */       str1 = m0.tF0(str1, "   v_col = a_color;\n   v_col.a *= 255.0 / 254.0;\n");  for (b2 = 0; b2 < paramInt; ) {
/*    */       
/*  8 */       str1 = N.Gl0((new StringBuilder()).append(str1).append("   v_tex").append(b2).append(" = ").append("a_texCoord"), b2, ";\n"); b2++;
/*  9 */     }  str1 = m0.tF0(str1, "   gl_PointSize = 1.0;\n}\n");
/* 10 */     String str4 = "#ifdef GL_ES\nprecision mediump float;\n#endif\n"; if (paramBoolean2)
/* 11 */       str4 = m0.tF0(str4, "varying vec4 v_col;\n");  for (byte b4 = 0; b4 < paramInt; ) {
/* 12 */       str4 = str4 + "varying vec2 v_tex" + b4 + ";\n"; str4 = str4 + "uniform sampler2D u_sampler" + b4 + ";\n"; b4++;
/* 13 */     }  StringBuilder stringBuilder3 = zw.vz(str4, "void main() {\n   gl_FragColor = "); if (paramBoolean2)
/* 14 */     { str4 = "v_col"; } else { str4 = "vec4(1, 1, 1, 1)"; }  String str3 = stringBuilder3.append(str4).toString(); if (paramInt > 0)
/* 15 */       str3 = m0.tF0(str3, " * ");  for (byte b1 = 0; b1 < paramInt; ) { if (b1 == paramInt - 1)
/* 16 */       { str3 = str3 + " texture2D(u_sampler" + b1 + ",  v_tex" + b1 + ")"; } else { str3 = str3 + " texture2D(u_sampler" + b1 + ",  v_tex" + b1 + ") *"; }  b1++; }
/* 17 */      str3 = m0.tF0(str3, ";\n}");
/* 18 */     this(str1, str3); Rm0 rm0; String str6, str5; if ((new Rm0())
/* 19 */       .Xu0) return rm0; 
/* 20 */     throw new JU(
/* 21 */         B40.df("Error compiling shader: ")
/* 22 */         .append(rm0.ET()).toString()); }
/*    */ 
/*    */   
/*    */   public static lw0[] Rl(boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
/*    */     this();
/*    */     fQ fQ;
/*    */     lw0 lw0;
/*    */     this(1, 3, "a_position");
/*    */     (new fQ()).Com3(lw0);
/*    */     if (paramBoolean1) {
/*    */       this(8, 3, "a_normal");
/*    */       fQ.Com3(lw0);
/*    */     } 
/*    */     if (paramBoolean2) {
/*    */       lw0 lw01;
/*    */       this(4, 4, "a_color");
/*    */       fQ.Com3(lw01);
/*    */     } 
/*    */     for (paramBoolean2 = false; paramBoolean2 < paramInt; ) {
/*    */       String str = XD0.SD0("a_texCoord", paramBoolean2);
/*    */       this(16, 2, str);
/*    */       fQ.Com3(lw0);
/*    */       paramBoolean2++;
/*    */     } 
/*    */     lw0[] arrayOfLw0;
/*    */     for (arrayOfLw0 = new lw0[fQ.Z8], paramInt = 0; paramInt < fQ.Z8; ) {
/*    */       arrayOfLw0[paramInt] = (lw0)fQ.get(paramInt);
/*    */       paramInt++;
/*    */     } 
/*    */     return arrayOfLw0;
/*    */   }
/*    */   
/*    */   public final void Ad0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     int i = this.Hq0 + this.ZF0;
/*    */     this.R60[i] = Color.toFloatBits(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*    */   }
/*    */   
/*    */   public final void nX(float paramFloat) {
/*    */     this.R60[this.Hq0 + this.ZF0] = paramFloat;
/*    */   }
/*    */   
/*    */   public final void hd0(float paramFloat1, float paramFloat2) {
/*    */     this[i] = paramFloat1;
/*    */     this[i + 1] = paramFloat2;
/*    */     float[] arrayOfFloat;
/*    */     (arrayOfFloat = this.R60)[i + 2] = 0.0F;
/*    */     int i;
/*    */     this.Hq0 = (i = this.Hq0) + this.G20;
/*    */     this.am++;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qb0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */