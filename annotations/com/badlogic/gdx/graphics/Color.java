/* 1 */ package com.badlogic.gdx.graphics;public class Color { public static final Color WHITE; public static final Color LIGHT_GRAY = new Color(-1077952513); public static final Color GRAY = new Color(2139062271); public static final Color DARK_GRAY = new Color(1061109759); public static final Color BLACK = new Color(0.0F, 0.0F, 0.0F, 1.0F); public static final float WHITE_FLOAT_BITS = (WHITE = new Color(1.0F, 1.0F, 1.0F, 1.0F)).toFloatBits(); public static final Color CLEAR = new Color(0.0F, 0.0F, 0.0F, 0.0F); public static final Color BLUE = new Color(0.0F, 0.0F, 1.0F, 1.0F); public static final Color NAVY = new Color(0.0F, 0.0F, 0.5F, 1.0F); public static final Color ROYAL = new Color(1097458175); public static final Color SLATE = new Color(1887473919); public static final Color SKY = new Color(-2016482305); public static final Color CYAN = new Color(0.0F, 1.0F, 1.0F, 1.0F); public static final Color TEAL = new Color(0.0F, 0.5F, 0.5F, 1.0F); public static final Color GREEN = new Color(16711935); public static final Color CHARTREUSE = new Color(2147418367); public static final Color LIME = new Color(852308735); public static final Color FOREST = new Color(579543807); public static final Color OLIVE = new Color(1804477439); public static final Color YELLOW = new Color(-65281); public static final Color GOLD = new Color(-2686721); public static final Color GOLDENROD = new Color(-626712321); public static final Color ORANGE = new Color(-5963521); public static final Color BROWN = new Color(-1958407169); public static final Color TAN = new Color(-759919361); public static final Color FIREBRICK = new Color(-1306385665); public static final Color RED = new Color(-16776961); public static final Color SCARLET = new Color(-13361921); public static final Color CORAL = new Color(-8433409); public static final Color SALMON = new Color(-92245249); public static final Color PINK = new Color(-9849601); public static final Color MAGENTA = new Color(1.0F, 0.0F, 1.0F, 1.0F); public static final Color PURPLE = new Color(-1608453889); public static void abgr8888ToColor(Color paramColor, float paramFloat) { paramColor
/* 2 */       .a = ((i & 0xFF000000) >>> 24) / 255.0F; paramColor.b = ((i & 0xFF0000) >>> 16) / 255.0F; paramColor.g = ((i & 0xFF00) >>> 8) / 255.0F; int i; paramColor.r = ((i = Float.floatToRawIntBits(paramFloat) | (int)((Float.floatToRawIntBits(paramFloat) >>> 24) * 1.003937F) << 24) & 0xFF) / 255.0F; } public static final Color VIOLET = new Color(-293409025); public static final Color MAROON = new Color(-1339006721); public float r; public float g; public float b; public float a; public Color() {} public Color(int paramInt) { rgba8888ToColor(this, paramInt); } public Color(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.r = paramFloat1; this.g = paramFloat2; this.b = paramFloat3; this.a = paramFloat4; clamp(); } public Color(Color paramColor) { set(paramColor); } public static Color valueOf(String paramString) { return valueOf(paramString, new Color()); } public static Color valueOf(String paramString, Color paramColor) { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: iconst_0
/*   */     //   2: invokevirtual charAt : (I)C
/*   */     //   5: bipush #35
/*   */     //   7: if_icmpne -> 16
/*   */     //   10: aload_0
/*   */     //   11: iconst_1
/*   */     //   12: invokevirtual substring : (I)Ljava/lang/String;
/*   */     //   15: astore_0
/*   */     //   16: aload_0
/*   */     //   17: aload_1
/*   */     //   18: aload_0
/*   */     //   19: aload_1
/*   */     //   20: aload_0
/*   */     //   21: aload_1
/*   */     //   22: aload_0
/*   */     //   23: iconst_0
/*   */     //   24: iconst_2
/*   */     //   25: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   28: bipush #16
/*   */     //   30: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   33: i2f
/*   */     //   34: ldc 255.0
/*   */     //   36: fdiv
/*   */     //   37: putfield r : F
/*   */     //   40: iconst_2
/*   */     //   41: iconst_4
/*   */     //   42: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   45: bipush #16
/*   */     //   47: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   50: i2f
/*   */     //   51: ldc 255.0
/*   */     //   53: fdiv
/*   */     //   54: putfield g : F
/*   */     //   57: iconst_4
/*   */     //   58: bipush #6
/*   */     //   60: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   63: bipush #16
/*   */     //   65: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   68: i2f
/*   */     //   69: ldc 255.0
/*   */     //   71: fdiv
/*   */     //   72: putfield b : F
/*   */     //   75: invokevirtual length : ()I
/*   */     //   78: bipush #8
/*   */     //   80: if_icmpeq -> 88
/*   */     //   83: fconst_1
/*   */     //   84: fstore_0
/*   */     //   85: goto -> 106
/*   */     //   88: aload_0
/*   */     //   89: bipush #6
/*   */     //   91: bipush #8
/*   */     //   93: invokevirtual substring : (II)Ljava/lang/String;
/*   */     //   96: bipush #16
/*   */     //   98: invokestatic parseInt : (Ljava/lang/String;I)I
/*   */     //   101: i2f
/*   */     //   102: ldc 255.0
/*   */     //   104: fdiv
/*   */     //   105: fstore_0
/*   */     //   106: aload_1
/*   */     //   107: dup
/*   */     //   108: fload_0
/*   */     //   109: putfield a : F
/* 2 */     //   112: areturn } public static float toFloatBits(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return i8.uU(paramInt4 << 24 | paramInt3 << 16 | paramInt2 << 8 | paramInt1); } public static float toFloatBits(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { return i8.uU((int)(paramFloat4 * 255.0F) << 24 | (int)(paramFloat3 * 255.0F) << 16 | (int)(paramFloat2 * 255.0F) << 8 | (int)(paramFloat1 * 255.0F)); } public static int toIntBits(int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return paramInt4 << 24 | paramInt3 << 16 | paramInt2 << 8 | paramInt1; } public static int alpha(float paramFloat) { return (int)(paramFloat * 255.0F); } public static int luminanceAlpha(float paramFloat1, float paramFloat2) { return (int)(paramFloat1 * 255.0F) << 8 | (int)(paramFloat2 * 255.0F); } public static int rgb565(float paramFloat1, float paramFloat2, float paramFloat3) { return (int)(paramFloat1 * 31.0F) << 11 | (int)(paramFloat2 * 63.0F) << 5 | (int)(paramFloat3 * 31.0F); } public static int rgba4444(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { return (int)(paramFloat1 * 15.0F) << 12 | (int)(paramFloat2 * 15.0F) << 8 | (int)(paramFloat3 * 15.0F) << 4 | (int)(paramFloat4 * 15.0F); } public static int rgb888(float paramFloat1, float paramFloat2, float paramFloat3) { return (int)(paramFloat1 * 255.0F) << 16 | (int)(paramFloat2 * 255.0F) << 8 | (int)(paramFloat3 * 255.0F); } public static int rgba8888(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { return (int)(paramFloat1 * 255.0F) << 24 | (int)(paramFloat2 * 255.0F) << 16 | (int)(paramFloat3 * 255.0F) << 8 | (int)(paramFloat4 * 255.0F); } public static int argb8888(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { return (int)(paramFloat1 * 255.0F) << 24 | (int)(paramFloat2 * 255.0F) << 16 | (int)(paramFloat3 * 255.0F) << 8 | (int)(paramFloat4 * 255.0F); } public static int rgb565(Color paramColor) { return (int)(paramColor.r * 31.0F) << 11 | (int)(paramColor.g * 63.0F) << 5 | (int)(paramColor.b * 31.0F); } public static int rgba4444(Color paramColor) { return (int)(paramColor.r * 15.0F) << 12 | (int)(paramColor.g * 15.0F) << 8 | (int)(paramColor.b * 15.0F) << 4 | (int)(paramColor.a * 15.0F); } public static int rgb888(Color paramColor) { return (int)(paramColor.r * 255.0F) << 16 | (int)(paramColor.g * 255.0F) << 8 | (int)(paramColor.b * 255.0F); } public static int rgba8888(Color paramColor) { return (int)(paramColor.r * 255.0F) << 24 | (int)(paramColor.g * 255.0F) << 16 | (int)(paramColor.b * 255.0F) << 8 | (int)(paramColor.a * 255.0F); } public static int argb8888(Color paramColor) { return (int)(paramColor.a * 255.0F) << 24 | (int)(paramColor.r * 255.0F) << 16 | (int)(paramColor.g * 255.0F) << 8 | (int)(paramColor.b * 255.0F); } public static void rgb565ToColor(Color paramColor, int paramInt) { paramColor.r = ((paramInt & 0xF800) >>> 11) / 31.0F; paramColor.g = ((paramInt & 0x7E0) >>> 5) / 63.0F; paramColor.b = ((paramInt & 0x1F) >>> 0) / 31.0F; } public static void rgba4444ToColor(Color paramColor, int paramInt) { paramColor.r = ((paramInt & 0xF000) >>> 12) / 15.0F; paramColor.g = ((paramInt & 0xF00) >>> 8) / 15.0F; paramColor.b = ((paramInt & 0xF0) >>> 4) / 15.0F; paramColor.a = (paramInt & 0xF) / 15.0F; } public static void rgb888ToColor(Color paramColor, int paramInt) { paramColor.r = ((paramInt & 0xFF0000) >>> 16) / 255.0F; paramColor.g = ((paramInt & 0xFF00) >>> 8) / 255.0F; paramColor.b = (paramInt & 0xFF) / 255.0F; } public static void rgba8888ToColor(Color paramColor, int paramInt) { paramColor.r = ((paramInt & 0xFF000000) >>> 24) / 255.0F; paramColor.g = ((paramInt & 0xFF0000) >>> 16) / 255.0F; paramColor.b = ((paramInt & 0xFF00) >>> 8) / 255.0F; paramColor.a = (paramInt & 0xFF) / 255.0F; } public static void argb8888ToColor(Color paramColor, int paramInt) { paramColor.a = ((paramInt & 0xFF000000) >>> 24) / 255.0F; paramColor.r = ((paramInt & 0xFF0000) >>> 16) / 255.0F; paramColor.g = ((paramInt & 0xFF00) >>> 8) / 255.0F; paramColor.b = (paramInt & 0xFF) / 255.0F; } public static void abgr8888ToColor(Color paramColor, int paramInt) { paramColor.a = ((paramInt & 0xFF000000) >>> 24) / 255.0F; paramColor.b = ((paramInt & 0xFF0000) >>> 16) / 255.0F; paramColor.g = ((paramInt & 0xFF00) >>> 8) / 255.0F; paramColor.r = (paramInt & 0xFF) / 255.0F; } public Color set(Color paramColor) { this.r = paramColor.r; this.g = paramColor.g; this.b = paramColor.b; this.a = paramColor.a; return this; } public Color mul(Color paramColor) { this.r *= paramColor.r; this.g *= paramColor.g; this.b *= paramColor.b; this.a *= paramColor.a; return clamp(); } public Color mul(float paramFloat) { this.r *= paramFloat; this.g *= paramFloat; this.b *= paramFloat; this.a *= paramFloat; return clamp(); } public Color add(Color paramColor) { this.r += paramColor.r; this.g += paramColor.g; this.b += paramColor.b; this.a += paramColor.a; return clamp(); } public Color sub(Color paramColor) { this.r -= paramColor.r; this.g -= paramColor.g; this.b -= paramColor.b; this.a -= paramColor.a; return clamp(); } public Color clamp() { float f; if ((f = this.r) < 0.0F) { this.r = 0.0F; } else if (f > 1.0F) { this.r = 1.0F; }  if ((f = this.g) < 0.0F) { this.g = 0.0F; } else if (f > 1.0F) { this.g = 1.0F; }  if ((f = this.b) < 0.0F) { this.b = 0.0F; } else if (f > 1.0F) { this.b = 1.0F; }  if ((f = this.a) < 0.0F) { this.a = 0.0F; } else if (f > 1.0F) { this.a = 1.0F; }  return this; } public Color set(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.r = paramFloat1; this.g = paramFloat2; this.b = paramFloat3; this.a = paramFloat4; return clamp(); } public Color set(int paramInt) { rgba8888ToColor(this, paramInt); return this; } public Color add(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.r += paramFloat1; this.g += paramFloat2; this.b += paramFloat3; this.a += paramFloat4; return clamp(); } public Color sub(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.r -= paramFloat1; this.g -= paramFloat2; this.b -= paramFloat3; this.a -= paramFloat4; return clamp(); } public Color mul(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { this.r *= paramFloat1; this.g *= paramFloat2; this.b *= paramFloat3; this.a *= paramFloat4; return clamp(); } public Color lerp(Color paramColor, float paramFloat) { float f = this.r; this.r = NUL.df(paramColor.r, f, paramFloat, f); f = this.g; this.g = NUL.df(paramColor.g, f, paramFloat, f); f = this.b; this.b = NUL.df(paramColor.b, f, paramFloat, f); f = this.a; this.a = NUL.df(paramColor.a, f, paramFloat, f); return clamp(); } public Color lerp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) { this.r = NUL.df(paramFloat1, this.r, paramFloat5, this.r); this.g = NUL.df(paramFloat2, this.g, paramFloat5, this.g); this.b = NUL.df(paramFloat3, this.b, paramFloat5, this.b); this.a = NUL.df(paramFloat4, this.a, paramFloat5, this.a); return clamp(); } public Color premultiplyAlpha() { float f; this.r *= f = this.a; this.g *= f; this.b *= f; return this; } public boolean equals(Object paramObject) { if (this == paramObject) return true;  if (paramObject == null || getClass() != paramObject.getClass()) return false;  this = (Color)paramObject; return (toIntBits() == toIntBits()); } public int hashCode() { byte b1, b3, b2; float f2; if ((f2 = this.r) != 0.0F) { j = Float.floatToIntBits(f2); } else { j = 0; }  j *= 31; float f4; if ((f4 = this.g) != 0.0F)
/* 3 */     { b3 = Float.floatToIntBits(f4); } else { b3 = 0; }  int j = (j + b3) * 31; float f3;
/* 4 */     if ((f3 = this.b) != 0.0F)
/* 5 */     { b2 = Float.floatToIntBits(f3); } else { b2 = 0; }  int i = (j + b2) * 31; float f1;
/* 6 */     if ((f1 = this.a) != 0.0F)
/* 7 */     { b1 = Float.floatToIntBits(f1); } else { b1 = 0; }  return i + b1; }
/*   */ 
/*   */   
/*   */   public float toFloatBits() {
/*   */     return i8.uU((int)(this.a * 255.0F) << 24 | (int)(this.b * 255.0F) << 16 | (int)(this.g * 255.0F) << 8 | (int)(this.r * 255.0F));
/*   */   }
/*   */   
/*   */   public int toIntBits() {
/*   */     return (int)(this.a * 255.0F) << 24 | (int)(this.b * 255.0F) << 16 | (int)(this.g * 255.0F) << 8 | (int)(this.r * 255.0F);
/*   */   }
/*   */   
/*   */   public String toString() {
/*   */     String str;
/*   */     for (str = Integer.toHexString((int)(this.r * 255.0F) << 24 | (int)(this.g * 255.0F) << 16 | (int)(this.b * 255.0F) << 8 | (int)(this.a * 255.0F)); length() < 8; str = m0.tF0("0", this));
/*   */     return this;
/*   */   }
/*   */   
/*   */   public Color fromHsv(float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     float f1 = (1.0F - paramFloat2) * paramFloat3;
/*   */     float f2 = (1.0F - paramFloat2 * (paramFloat1 -= i)) * paramFloat3;
/*   */     paramFloat1 = (1.0F - (1.0F - paramFloat1) * paramFloat2) * paramFloat3;
/*   */     int i;
/*   */     switch (i = (int)(paramFloat1 = (paramFloat1 / 60.0F + 6.0F) % 6.0F)) {
/*   */       default:
/*   */         this.r = paramFloat3;
/*   */         this.g = f1;
/*   */         this.b = f2;
/*   */         return clamp();
/*   */       case 4:
/*   */         this.r = paramFloat1;
/*   */         this.g = f1;
/*   */         this.b = paramFloat3;
/*   */         return clamp();
/*   */       case 3:
/*   */         this.r = f1;
/*   */         this.g = f2;
/*   */         this.b = paramFloat3;
/*   */         return clamp();
/*   */       case 2:
/*   */         this.r = f1;
/*   */         this.g = paramFloat3;
/*   */         this.b = paramFloat1;
/*   */         return clamp();
/*   */       case 1:
/*   */         this.r = f2;
/*   */         this.g = paramFloat3;
/*   */         this.b = f1;
/*   */         return clamp();
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     this.r = paramFloat3;
/*   */     this.g = paramFloat1;
/*   */     this.b = f1;
/*   */     return clamp();
/*   */   }
/*   */   
/*   */   public Color fromHsv(float[] paramArrayOffloat) {
/*   */     float f1 = paramArrayOffloat[0];
/*   */     float f2 = paramArrayOffloat[1];
/*   */     float f3 = paramArrayOffloat[2];
/*   */     return fromHsv(f1, f2, f3);
/*   */   }
/*   */   
/*   */   public float[] toHsv(float[] paramArrayOffloat) {
/*   */     float f1;
/*   */     float f2;
/*   */     float f3;
/*   */     if ((f3 = (f1 = Math.max(Math.max(this.r, this.g), this.b)) - (f2 = Math.min(Math.min(this.r, this.g), this.b))) == 0.0F) {
/*   */       paramArrayOffloat[0] = 0.0F;
/*   */     } else {
/*   */       float f;
/*   */       if (f1 == (f = this.r)) {
/*   */         paramArrayOffloat[0] = ((this.g - this.b) * 60.0F / f3 + 360.0F) % 360.0F;
/*   */       } else {
/*   */         float f4;
/*   */         if (f1 == (f4 = this.g)) {
/*   */           paramArrayOffloat[0] = (this.b - f) * 60.0F / f3 + 120.0F;
/*   */         } else {
/*   */           paramArrayOffloat[0] = (f - f4) * 60.0F / f3 + 240.0F;
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     if (f1 > 0.0F) {
/*   */       paramArrayOffloat[1] = 1.0F - f2 / f1;
/*   */     } else {
/*   */       paramArrayOffloat[1] = 0.0F;
/*   */     } 
/*   */     paramArrayOffloat[2] = f1;
/*   */     return paramArrayOffloat;
/*   */   }
/*   */   
/*   */   public Color cpy() {
/*   */     return new Color(this);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/Color.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */