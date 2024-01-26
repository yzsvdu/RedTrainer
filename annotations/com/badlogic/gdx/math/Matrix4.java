/*  1 */ package com.badlogic.gdx.math;public class Matrix4 implements Serializable { private static final long serialVersionUID = -2717655254359579617L; public static final TG0 qw0 = new TG0(); public static final eo sp0 = new eo(); public static final eo Re = new eo(); public static final eo zV = new eo(); public static final eo RW = new eo(); public static final Matrix4 z1 = new Matrix4(); public final float[] Z0; public Matrix4() { (this.Z0 = new float[16])[0] = 1.0F; (new float[16])[5] = 1.0F; (new float[16])[10] = 1.0F; (new float[16])[15] = 1.0F; } public Matrix4(Matrix4 paramMatrix4) { this.Z0 = new float[16]; Cx0(paramMatrix4); } public Matrix4(float[] paramArrayOffloat) { this.Z0 = new float[16]; Qw(paramArrayOffloat); } public Matrix4(TG0 paramTG0) { this.Z0 = new float[16]; Hl0(paramTG0); } public Matrix4(eo parameo1, TG0 paramTG0, eo parameo2) { this.Z0 = new float[16]; mT(parameo1, paramTG0, parameo2); } public static native void prj(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int paramInt1, int paramInt2, int paramInt3); public static void jq(float[] paramArrayOffloat1, float[] paramArrayOffloat2) { float f1; float f3; float f4 = (f1 = paramArrayOffloat1[0]) * (f3 = paramArrayOffloat2[0]); float f5; float f6; f4 = (f5 = paramArrayOffloat1[4]) * (f6 = paramArrayOffloat2[1]) + f4; float f7; float f8; f4 = (f7 = paramArrayOffloat1[8]) * (f8 = paramArrayOffloat2[2]) + f4; float f2 = f9 * (f1 = paramArrayOffloat2[3]) + f4; f5 = f1 * (f4 = paramArrayOffloat2[4]); f5 = f5 * (f7 = paramArrayOffloat2[5]) + f5; float f9; f5 = f7 * (f9 = paramArrayOffloat2[6]) + f5; float f10; f5 = f9 * (f10 = paramArrayOffloat2[7]) + f5; float f11; float f12 = f1 * (f11 = paramArrayOffloat2[8]); float f13; f12 = f5 * (f13 = paramArrayOffloat2[9]) + f12; float f14; f12 = f7 * (f14 = paramArrayOffloat2[10]) + f12; float f15; f12 = f9 * (f15 = paramArrayOffloat2[11]) + f12; float f16; float f17 = f1 * (f16 = paramArrayOffloat2[12]); float f18; f17 = f5 * (f18 = paramArrayOffloat2[13]) + f17; float f19; f17 = f7 * (f19 = paramArrayOffloat2[14]) + f17; float f20; f17 = (f9 = paramArrayOffloat1[12]) * (f20 = paramArrayOffloat2[15]) + f17; float f21; float f22 = (f21 = paramArrayOffloat1[1]) * f3; float f23; f22 = (f23 = paramArrayOffloat1[5]) * f6 + f22; float f24; f22 = (f24 = paramArrayOffloat1[9]) * f8 + f22; f21 = f25 * f1 + f22; f22 = f21 * f4; f22 = f23 * f7 + f22; f22 = f24 * f9 + f22; f22 = f25 * f10 + f22; f23 = f21 * f11; f23 = f23 * f13 + f23; f23 = f24 * f14 + f23; f23 = f25 * f15 + f23; f24 = f21 * f16; f24 = f23 * f18 + f24; f24 = f24 * f19 + f24; float f25; f24 = (f25 = paramArrayOffloat1[13]) * f20 + f24; float f26 = (f25 = paramArrayOffloat1[2]) * f3; float f27; f26 = (f27 = paramArrayOffloat1[6]) * f6 + f26; float f28; f26 = (f28 = paramArrayOffloat1[10]) * f8 + f26; f25 = f29 * f1 + f26; f26 = f25 * f4; f26 = f27 * f7 + f26; f26 = f28 * f9 + f26; f26 = f29 * f10 + f26; f27 = f25 * f11; f27 = f27 * f13 + f27; f27 = f28 * f14 + f27; f27 = f29 * f15 + f27; f28 = f25 * f16; f28 = f27 * f18 + f28; f28 = f28 * f19 + f28; float f29; f28 = (f29 = paramArrayOffloat1[14]) * f20 + f28; f3 = (f29 = paramArrayOffloat1[3]) * f3; float f30; f3 = (f30 = paramArrayOffloat1[7]) * f6 + f3; f3 = (f6 = paramArrayOffloat1[11]) * f8 + f3; f1 = f8 * f1 + f3; f3 = f29 * f4; f3 = f30 * f7 + f3; f3 = f6 * f9 + f3; f3 = f8 * f10 + f3; f4 = f29 * f11; f4 = f30 * f13 + f4; f4 = f6 * f14 + f4; f4 = f8 * f15 + f4; f6 = f29 * f16; f6 = f30 * f18 + f6; f6 = f6 * f19 + f6; f6 = (f8 = paramArrayOffloat1[15]) * f20 + f6; paramArrayOffloat1[0] = f2; paramArrayOffloat1[1] = f21; paramArrayOffloat1[2] = f25; paramArrayOffloat1[3] = f1; paramArrayOffloat1[4] = f5; paramArrayOffloat1[5] = f22; paramArrayOffloat1[6] = f26; paramArrayOffloat1[7] = f3; paramArrayOffloat1[8] = f12; paramArrayOffloat1[9] = f23; paramArrayOffloat1[10] = f27; paramArrayOffloat1[11] = f4; paramArrayOffloat1[12] = f17; paramArrayOffloat1[13] = f24; paramArrayOffloat1[14] = f28; paramArrayOffloat1[15] = f6; } public static void O4(float[] paramArrayOffloat) { float f3, f4, f5, f6, f7 = (f4 = f2 * (f3 = paramArrayOffloat[6])) * (f5 = paramArrayOffloat[9]) * (f6 = paramArrayOffloat[12]); f7 = Oq.R0(f10, f5, f6, f7); float f10, f11, f12; f7 = Oq.R0(f11 = f2 * (f10 = paramArrayOffloat[5]), f12 = paramArrayOffloat[10], f6, f7); float f13 = paramArrayOffloat[1]; float f14; f7 = (f14 = f13 * f9) * f12 * f6 + f7; float f15, f16, f17, f18, f19, f20 = (f17 = (f15 = f8 * f10) * (f16 = paramArrayOffloat[11])) * f6 + f7 - (f18 = (f7 = f13 * f3) * f16) * f6 - f4 * (f4 = paramArrayOffloat[8]) * (f19 = paramArrayOffloat[13]); float f8, f9; f20 = (f10 = (f8 = paramArrayOffloat[2]) * (f9 = paramArrayOffloat[7])) * f4 * f19 + f20; float f2, f21, f22; f20 = (f22 = (f2 = paramArrayOffloat[3]) * (f21 = paramArrayOffloat[4])) * f12 * f19 + f20; f20 = Oq.R0(f24, f12, f19, f20) - (f14 = (f11 = f8 * f21) * f16) * f19; float f24; f20 = (f24 = (f22 = f23 * f3) * f16) * f19 + f20; float f25; f20 = Oq.R0(f22, f5, f25, Oq.R0(f14, f4, f25, f11 * f4 * (f25 = paramArrayOffloat[14]) + f20)); f20 = (f24 = f23 * f9) * f5 * f25 + f20; float f26, f27; f20 = (f27 = (f26 = f13 * f21) * f16) * f25 + f20; float f29, f30 = f20 - (f20 = f28 * f16) * f25 - f15 * f4 * (f29 = paramArrayOffloat[15]); f30 = f7 * f4 * f29 + f30; float f31 = Oq.R0(f22, f5, f29, f11 * f5 * f29 + f30) - (f30 = f26 * f12) * f29; float f23, f28, f32; if ((f31 = (f32 = (f28 = (f23 = paramArrayOffloat[0]) * f10) * f12) * f29 + f31) == 0.0F) return;  float f33, f34, f35 = (f33 = f5 * f25) * f9 - (f34 = f19 * f12) * f9; float f36, f37, f38 = (f36 = f19 * f3) * f16 + f35 - (f35 = f10 * f25) * f16 - (f37 = f5 * f3) * f29; float f39; f38 = (f39 = f10 * f12) * f29 + f38; float f40, f41, f42, f43 = (f40 = f6 * f12) * f9 - (f41 = f4 * f25) * f9 - (f42 = f6 * f3) * f16; float f44; f43 = (f44 = f21 * f25) * f16 + f43; float f45, f46 = (f45 = f4 * f3) * f29 + f43 - (f43 = f21 * f12) * f29; float f47, f48 = (f47 = f4 * f19) * f9; f10 = f48 - f49 * f9; f41 = (f34 = f6 * f10) * f16 + f10 - (f10 = f21 * f19) * f16; f21 = f41 - f48 * f29; f21 = (f41 = f21 * f5) * f29 + f21; float f50 = f49 * f3 - f47 * f3 - f34 * f12; f50 = f10 * f12 + f50; f50 = (f48 = f4 * f10) * f25 + f50 - f41 * f25; f33 = f34 * f2 - f33 * f2 - (f19 *= f8) * f16; float f51; f33 = (f51 = f13 * f25) * f16 + f33; float f52, f53 = (f52 = f5 * f8) * f29 + f33 - (f33 = f13 * f12) * f29; f40 = f41 * f2 - f40 * f2; float f54, f55 = (f54 = f6 * f8) * f16 + f40 - (f40 = f23 * f25) * f16 - (f4 *= f8) * f29; float f56; f55 = (f56 = f23 * f12) * f29 + f55; float f49; f13 = (f49 = f6 * f5) * f2 - f47 * f2 - (f6 *= f13) * f16; float f57; f13 = (f57 = f23 * f19) * f16 + f13; f5 = f16 * f29 + f13; f4 = f5 - f13 * f29; f5 = f47 * f8 - f49 * f8; f5 = f6 * f12 + f5 - f57 * f12 - f16 * f25; f5 = f13 * f25 + f5; f7 = f35 * f2 - f36 * f2; f7 = f19 * f9 + f7 - f51 * f9 - f15 * f29; f7 = f7 * f29 + f7; f11 = f42 * f2 - f44 * f2 - f54 * f9; f11 = f40 * f9 + f11; f11 = f11 * f29 + f11 - f22 * f29; f12 = f10 * f2 - f34 * f2; f12 = f6 * f9 + f12 - f57 * f9 - f26 * f29; f12 = f28 * f29 + f12; f6 = f34 * f8 - f10 * f8 - f6 * f3; f6 = f57 * f3 + f6; f6 = f26 * f25 + f6 - f28 * f25; f10 = f37 * f2 - f39 * f2 - f52 * f9; f10 = f33 * f9 + f10 + f17 - f18; f15 = f43 * f2 - f45 * f2; f14 = f4 * f9 + f15 - f56 * f9 - f14 + f24; f2 = f48 * f2 - f41 * f2 - f16 * f9; f2 = (f13 = f23 * f5) * f9 + f2 + f27 - f20; f8 = f41 * f8 - f48 * f8; float f1; paramArrayOffloat[0] = f38 * (f1 = 1.0F / f31); paramArrayOffloat[
/*  2 */         1] = f53 * f1; paramArrayOffloat[2] = f7 * f1; paramArrayOffloat[3] = f10 * f1; paramArrayOffloat[4] = f46 * f1; paramArrayOffloat[5] = f55 * f1; paramArrayOffloat[6] = f11 * f1; paramArrayOffloat[7] = f14 * f1; paramArrayOffloat[8] = f21 * f1; paramArrayOffloat[9] = f4 * f1; paramArrayOffloat[10] = f12 * f1; paramArrayOffloat[11] = f2 * f1; paramArrayOffloat[12] = f50 * f1; paramArrayOffloat[13] = f5 * f1; paramArrayOffloat[14] = f6 * f1; paramArrayOffloat[15] = ((f16 = f4 * f13) * f3 + f8 - f13 * f3 - f30 + f32) * f1; } public final Matrix4 Qw(float[] paramArrayOffloat) { float[] arrayOfFloat; int i = (arrayOfFloat = this.Z0).length; System.arraycopy(paramArrayOffloat, 0, this, 0, i); return this; } public final Matrix4 Hl0(TG0 paramTG0) { float f1 = paramTG0.D80, f2 = paramTG0.tb0, f3 = paramTG0.z60, f4 = paramTG0.AD; return eE0(0.0F, 0.0F, 0.0F, f1, f2, f3, f4); } public final Matrix4 eE0(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7) { float f1 = paramFloat4 * 2.0F; paramFloat4 = paramFloat5 * 2.0F; paramFloat5 = paramFloat6 * 2.0F; paramFloat6 = paramFloat7 * f1; paramFloat7 *= paramFloat4; float f2 = paramFloat7 * paramFloat5; f1 = paramFloat4 * f1; float f3 = paramFloat4 * paramFloat4; float f4 = paramFloat4 * paramFloat5; paramFloat4 = paramFloat5 * paramFloat4; float f5 = paramFloat5 * paramFloat5; paramFloat5 = paramFloat6 * paramFloat5; arrayOfFloat[0] = 1.0F - paramFloat4 + paramFloat5; arrayOfFloat[4] = f3 - f2; arrayOfFloat[8] = f4 + paramFloat7; arrayOfFloat[12] = paramFloat1; arrayOfFloat[1] = f3 + f2; arrayOfFloat[5] = 1.0F - f1 + paramFloat5; arrayOfFloat[9] = f5 - paramFloat6; arrayOfFloat[13] = paramFloat2; arrayOfFloat[2] = f4 - paramFloat7; arrayOfFloat[6] = f5 + paramFloat6; float[] arrayOfFloat; (arrayOfFloat = this.Z0)[10] = 1.0F - f1 + paramFloat4; this.Z0[14] = paramFloat3; this.Z0[3] = 0.0F; this.Z0[7] = 0.0F; this.Z0[11] = 0.0F; this.Z0[15] = 1.0F; return this; } public final Matrix4 mT(eo parameo1, TG0 paramTG0, eo parameo2) { float f1 = parameo1.x; float f2 = parameo1.y; float f3 = parameo1.z; float f4 = paramTG0.D80; float f5 = paramTG0.tb0; float f6 = paramTG0.z60; float f7 = paramTG0.AD; float f8 = parameo2.x; float f9 = parameo2.y; float f10 = parameo2.z; return iO(f1, f2, f3, f4, f5, f6, f7, f8, f9, f10); } public final Matrix4 iO(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10) { float f1 = paramFloat4 * 2.0F; paramFloat4 = paramFloat5 * 2.0F; paramFloat5 = paramFloat6 * 2.0F; paramFloat6 = paramFloat7 * f1; paramFloat7 *= paramFloat4; float f2 = paramFloat7 * paramFloat5; f1 = paramFloat4 * f1; float f3 = paramFloat4 * paramFloat4; float f4 = paramFloat4 * paramFloat5; paramFloat4 = paramFloat5 * paramFloat4; float f5 = paramFloat5 * paramFloat5; paramFloat5 = paramFloat6 * paramFloat5; arrayOfFloat[0] = (1.0F - paramFloat4 + paramFloat5) * paramFloat8; arrayOfFloat[4] = (f3 - f2) * paramFloat9; arrayOfFloat[8] = (f4 + paramFloat7) * paramFloat10; arrayOfFloat[12] = paramFloat1; arrayOfFloat[1] = (f3 + f2) * paramFloat8; arrayOfFloat[5] = (1.0F - f1 + paramFloat5) * paramFloat9; arrayOfFloat[9] = (f5 - paramFloat6) * paramFloat10; arrayOfFloat[13] = paramFloat2; arrayOfFloat[2] = (f4 - paramFloat7) * paramFloat8; arrayOfFloat[6] = (f5 + paramFloat6) * paramFloat9; float[] arrayOfFloat; (arrayOfFloat = this.Z0)[10] = (1.0F - f1 + paramFloat4) * paramFloat10; this.Z0[14] = paramFloat3; this.Z0[3] = 0.0F; this.Z0[7] = 0.0F; this.Z0[11] = 0.0F; this.Z0[15] = 1.0F; return this; } public final String toString() { return B40.df("[").append(this.Z0[0]).append("|").append(this.Z0[4]).append("|").append(this.Z0[8]).append("|").append(this.Z0[12]).append("]\n[").append(this.Z0[1]).append("|").append(this.Z0[5]).append("|").append(this.Z0[9]).append("|").append(this.Z0[13]).append("]\n[").append(this.Z0[2]).append("|").append(this.Z0[6]).append("|").append(this.Z0[10]).append("|").append(this.Z0[14]).append("]\n[").append(this.Z0[3]).append("|").append(this.Z0[7]).append("|").append(this.Z0[11]).append("|").append(this.Z0[15]).append("]\n").toString(); } public Matrix4 Ye() { return new Matrix4(this); } public final Matrix4 lU(Matrix4 paramMatrix4) { jq(this.Z0, paramMatrix4.Z0); return this; } public final Matrix4 WU() { this.Z0[0] = 1.0F; this.Z0[4] = 0.0F; this.Z0[8] = 0.0F; this.Z0[12] = 0.0F; this.Z0[1] = 0.0F; this.Z0[5] = 1.0F; this.Z0[9] = 0.0F; this.Z0[13] = 0.0F; this.Z0[2] = 0.0F; this.Z0[6] = 0.0F; this.Z0[10] = 1.0F; this.Z0[14] = 0.0F; this.Z0[3] = 0.0F; this.Z0[7] = 0.0F; this.Z0[11] = 0.0F; this.Z0[15] = 1.0F; return this; } public final float eA() { float f3; float f4; float f5; float f6 = f2 * (f3 = this[6]) * (f4 = this[9]) * (f5 = this[12]); float f8 = f6 - f7 * (f6 = this[7]) * f4 * f5; float f9; float f10; f8 = Oq.R0(f2 * (f9 = this[5]), f10 = this[10], f5, f8); float f11 = this[1]; f8 = f11 * f6 * f10 * f5 + f8; float f7; float f12; float f13 = (f7 = this[2]) * f9 * (f12 = this[11]) * f5 + f8 - f11 * f3 * f12 * f5 - f2 * f3 * (f5 = this[8]) * (f8 = this[13]); f13 = this[2] * f6 * f5 * f8 + f13; float[] arrayOfFloat; float f2; float f14; f13 = (f2 = (arrayOfFloat = this.Z0)[3]) * (f14 = this[4]) * f10 * f8 + f13; f13 = f13 - f15 * f6 * f10 * f8 - f7 * f14 * f12 * f8; f8 = f15 * f3 * f12 * f8 + f13; f2 = f2 * f9 * f5 * (f13 = this[14]) + f8 - f11 * f6 * f5 * f13 - f2 * f14 * f4 * f13; f2 = f15 * f6 * f4 * f13 + f2; float f1; f2 = f11 * f14 * f12 * f13 + f2 - f15 * f9 * f12 * f13 - f7 * f9 * f5 * (f1 = this[15]); f2 = f11 * f3 * f5 * f1 + f2; f2 = f7 * f14 * f4 * f1 + f2 - f15 * f3 * f4 * f1 - f11 * f14 * f10 * f1; float f15; return (f15 = this.Z0[0]) * f9 * f10 * f1 + f2; } public final Matrix4 gv0(float paramFloat1, float paramFloat2, float paramFloat3) { WU(); this.Z0[12] = paramFloat1; this.Z0[13] = paramFloat2; this.Z0[14] = paramFloat3; return this; } public final eo on0(eo parameo) { parameo.x = this[12]; parameo.y = this[13]; float[] arrayOfFloat; parameo.z = (arrayOfFloat = this.Z0)[14]; return parameo; } public final Matrix4 g7(float paramFloat1, float paramFloat2, float paramFloat3) { float f1 = this.Z0[12]; float f2 = this.Z0[0] * paramFloat1; f2 = this.Z0[4] * paramFloat2 + f2; this.Z0[12] = this.Z0[8] * paramFloat3 + f2 + f1; f1 = this.Z0[13]; f2 = this.Z0[1] * paramFloat1; f2 = this.Z0[5] * paramFloat2 + f2; this.Z0[13] = this.Z0[9] * paramFloat3 + f2 + f1; f1 = this.Z0[14]; f2 = this.Z0[2] * paramFloat1; f2 = this.Z0[6] * paramFloat2 + f2; this.Z0[14] = this.Z0[10] * paramFloat3 + f2 + f1; f1 = this.Z0[15]; paramFloat1 = this.Z0[3] * paramFloat1; paramFloat1 = this.Z0[7] * paramFloat2 + paramFloat1; this.Z0[15] = this.Z0[11] * paramFloat3 + paramFloat1 + f1; return this; } public final Matrix4 N8(eo parameo, float paramFloat) { if (paramFloat == 0.0F) return this;  getClass(); float f1 = parameo.x, f2 = parameo.y; paramFloat = parameo.z; float f3 = paramFloat * 0.017453292F; TG0 tG0; (tG0 = qw0).qj0(f1, f2, paramFloat, f3);
/*  3 */     return SD(qw0); } public final Matrix4 SD(TG0 paramTG0) { float f2 = paramTG0.tb0; float f3 = paramTG0.z60; float f4 = paramTG0.AD; f1 *= f2; float f6 = f1 * f3; float f7 = f1 * f4; float f8 = f2 * f2; float f9 = f2 * f3; float f1 = f2 * f4; f2 = f3 * f3; f3 *= f4; f4 = (f8 + f2) * 2.0F; f4 = 1.0F - f4; float f5 = (f1 - f3) * 2.0F; f6 = (f6 + f1) * 2.0F; f3 = (f1 + f3) * 2.0F; f2 = 1.0F - (f5 + f2) * 2.0F; f7 = (f9 - f7) * 2.0F; f1 = (f6 - f1) * 2.0F; f8 = (f9 + f7) * 2.0F; f9 = 1.0F - ((f5 = paramTG0.D80 * (f1 = paramTG0.D80)) + f8) * 2.0F; float f10; float f11 = (f10 = this.Z0[0]) * f4; float f12; f11 = (f12 = this.Z0[4]) * f3 + f11; f10 = f13 * f1 + f11; f11 = f10 * f5; f11 = f12 * f2 + f11; f11 = f13 * f8 + f11; f12 = f10 * f6; f12 = f12 * f7 + f12; float f13; f12 = (f13 = this.Z0[8]) * f9 + f12; float f14 = (f13 = this.Z0[1]) * f4; float f15; f14 = (f15 = this.Z0[5]) * f3 + f14; f13 = f16 * f1 + f14; f14 = f13 * f5; f14 = f15 * f2 + f14; f14 = f16 * f8 + f14; f15 = f13 * f6; f15 = f15 * f7 + f15; float f16; f15 = (f16 = this.Z0[9]) * f9 + f15; float f17 = (f16 = this.Z0[2]) * f4; float f18; f17 = (f18 = this.Z0[6]) * f3 + f17; f16 = f19 * f1 + f17; f17 = f16 * f5; f17 = f18 * f2 + f17; f17 = f19 * f8 + f17; f18 = f16 * f6; f18 = f18 * f7 + f18; float f19; f18 = (f19 = this.Z0[10]) * f9 + f18; f4 = (f19 = this.Z0[3]) * f4; float f20; f3 = (f20 = this.Z0[7]) * f3 + f4; f1 = f4 * f1 + f3; f2 = f19 * f5; f2 = f20 * f2 + f2; f2 = f4 * f8 + f2; f3 = f19 * f6; f3 = f20 * f7 + f3; f3 = (f4 = this.Z0[11]) * f9 + f3; this.Z0[0] = f10; this.Z0[1] = f13; this.Z0[2] = f16; this.Z0[3] = f1; this.Z0[4] = f11; this.Z0[5] = f14; this.Z0[6] = f17; this.Z0[7] = f2; this.Z0[8] = f12; this.Z0[9] = f15; this.Z0[10] = f18; this.Z0[11] = f3; return this; } public final boolean Hn() { if (!nx0.JC0(this.Z0[0], 1.0F) || !nx0.JC0(this.Z0[5], 1.0F) || !nx0.JC0(this.Z0[10], 1.0F) || !nx0.is(this.Z0[4]) || !nx0.is(this.Z0[8]) || !nx0.is(this.Z0[1]) || !nx0.is(this.Z0[9]) || !nx0.is(this.Z0[2]) || !nx0.is(this.Z0[6])) return true;  } public final void Cx0(Matrix4 paramMatrix4) { Qw(paramMatrix4.Z0); } public final void ZA0(float paramFloat1, float paramFloat2) { float f = 0.0F + paramFloat2; PG(0.0F, 0.0F + paramFloat1, 0.0F, f, 0.0F, 1.0F); } public final void PG(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) { float f = paramFloat2 - paramFloat1; paramFloat1 = 2.0F / f; paramFloat2 = paramFloat4 - paramFloat3; paramFloat3 = 2.0F / paramFloat2; paramFloat4 = paramFloat6 - paramFloat5; paramFloat5 = -2.0F / paramFloat4; f = -(paramFloat2 + paramFloat1) / f; paramFloat2 = -(paramFloat4 + paramFloat3) / paramFloat2; paramFloat4 = -(paramFloat6 + paramFloat5) / paramFloat4; this.Z0[0] = paramFloat1; this.Z0[1] = 0.0F; this.Z0[2] = 0.0F; this.Z0[3] = 0.0F; this.Z0[4] = 0.0F; this.Z0[5] = paramFloat3; this.Z0[6] = 0.0F; this.Z0[7] = 0.0F; this.Z0[8] = 0.0F; this.Z0[9] = 0.0F; this.Z0[10] = paramFloat5; this.Z0[11] = 0.0F; this.Z0[12] = f; this.Z0[13] = paramFloat2; this.Z0[14] = paramFloat4; this.Z0[15] = 1.0F; } public final void b8(eo parameo) { this[12] = parameo.x; this[13] = parameo.y; float[] arrayOfFloat; (arrayOfFloat = this.Z0)[14] = parameo.z; } public final void bb0(float paramFloat1, float paramFloat2, float paramFloat3) { this.Z0[12] = paramFloat1; this.Z0[13] = paramFloat2; this.Z0[14] = paramFloat3; } public final void Jo(eo parameo) { WU(); this[12] = parameo.x; this[13] = parameo.y; float[] arrayOfFloat; (arrayOfFloat = this.Z0)[14] = parameo.z; } public final void Rn0(eo parameo, float paramFloat) { if (paramFloat == 0.0F) { WU(); return; }  getClass(); float f1 = parameo.x, f2 = parameo.y; paramFloat = parameo.z; float f3 = paramFloat * 0.017453292F; TG0 tG0; Hl0((tG0 = qw0).qj0(f1, f2, paramFloat, f3)); } public final void Cj(eo parameo1, eo parameo2, eo parameo3) { getClass(); float f3 = parameo2.x, f5 = parameo2.y, f6 = parameo2.z; f3 = parameo1.x; f5 = parameo1.y; f6 = parameo1.z; eo eo2; (eo2 = RW).TG0(f3, f5, f6).uD(f3, f5, f6); eo3.getClass();
/*  4 */     f5 = this.x; f6 = this.y; float f7 = this.z; eo eo3; (eo3 = sp0).TG0(f5, f6, f7)
/*  5 */       .WC0(); eo4.getClass();
/*  6 */     float f2 = this.x; f6 = this.y; f7 = this.z; eo eo4; (eo4 = Re).TG0(f2, f6, f7)
/*  7 */       .Nz(parameo3).WC0(); getClass();
/*  8 */     float f4 = eo4.x; f6 = eo4.y; f7 = eo4.z; eo eo1; (eo1 = zV).TG0(f4, f6, f7)
/*  9 */       .Nz(eo3).WC0(); WU(); arrayOfFloat[0] = eo4.x; arrayOfFloat[4] = eo4.y; arrayOfFloat[8] = eo4.z; arrayOfFloat[1] = this.x; arrayOfFloat[5] = this.y; arrayOfFloat[9] = this.z; arrayOfFloat[2] = -eo3.x; arrayOfFloat[6] = -eo3.y; float[] arrayOfFloat; (arrayOfFloat = this.Z0)[10] = -eo3.z;
/* 10 */     float f1 = -parameo1.y; Matrix4 matrix4 = z1.gv0(-parameo1.x, f1, -parameo1.z);
/* 11 */     jq(this.Z0, this.Z0); }
/*    */ 
/*    */   
/*    */   public final void implements(float paramFloat) {
/*    */     this.Z0[0] = this.Z0[0] * paramFloat;
/*    */     this.Z0[5] = this.Z0[5] * paramFloat;
/*    */     this.Z0[10] = this.Z0[10] * paramFloat;
/*    */   }
/*    */   
/*    */   public final void EF(eo parameo) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Z0 : [F
/*    */     //   4: iconst_4
/*    */     //   5: faload
/*    */     //   6: invokestatic is : (F)Z
/*    */     //   9: ifeq -> 38
/*    */     //   12: aload_0
/*    */     //   13: getfield Z0 : [F
/*    */     //   16: bipush #8
/*    */     //   18: faload
/*    */     //   19: invokestatic is : (F)Z
/*    */     //   22: ifeq -> 38
/*    */     //   25: aload_0
/*    */     //   26: getfield Z0 : [F
/*    */     //   29: iconst_0
/*    */     //   30: faload
/*    */     //   31: invokestatic abs : (F)F
/*    */     //   34: fstore_2
/*    */     //   35: goto -> 69
/*    */     //   38: aload_0
/*    */     //   39: getfield Z0 : [F
/*    */     //   42: dup
/*    */     //   43: dup
/*    */     //   44: iconst_0
/*    */     //   45: faload
/*    */     //   46: dup
/*    */     //   47: fmul
/*    */     //   48: fstore_2
/*    */     //   49: iconst_4
/*    */     //   50: faload
/*    */     //   51: dup
/*    */     //   52: fmul
/*    */     //   53: fload_2
/*    */     //   54: fadd
/*    */     //   55: fstore_2
/*    */     //   56: bipush #8
/*    */     //   58: faload
/*    */     //   59: dup
/*    */     //   60: fmul
/*    */     //   61: fload_2
/*    */     //   62: fadd
/*    */     //   63: f2d
/*    */     //   64: invokestatic sqrt : (D)D
/*    */     //   67: d2f
/*    */     //   68: fstore_2
/*    */     //   69: aload_0
/*    */     //   70: getfield Z0 : [F
/*    */     //   73: iconst_1
/*    */     //   74: faload
/*    */     //   75: invokestatic is : (F)Z
/*    */     //   78: ifeq -> 107
/*    */     //   81: aload_0
/*    */     //   82: getfield Z0 : [F
/*    */     //   85: bipush #9
/*    */     //   87: faload
/*    */     //   88: invokestatic is : (F)Z
/*    */     //   91: ifeq -> 107
/*    */     //   94: aload_0
/*    */     //   95: getfield Z0 : [F
/*    */     //   98: iconst_5
/*    */     //   99: faload
/*    */     //   100: invokestatic abs : (F)F
/*    */     //   103: fstore_3
/*    */     //   104: goto -> 138
/*    */     //   107: aload_0
/*    */     //   108: getfield Z0 : [F
/*    */     //   111: dup
/*    */     //   112: dup
/*    */     //   113: iconst_1
/*    */     //   114: faload
/*    */     //   115: dup
/*    */     //   116: fmul
/*    */     //   117: fstore_3
/*    */     //   118: iconst_5
/*    */     //   119: faload
/*    */     //   120: dup
/*    */     //   121: fmul
/*    */     //   122: fload_3
/*    */     //   123: fadd
/*    */     //   124: fstore_3
/*    */     //   125: bipush #9
/*    */     //   127: faload
/*    */     //   128: dup
/*    */     //   129: fmul
/*    */     //   130: fload_3
/*    */     //   131: fadd
/*    */     //   132: f2d
/*    */     //   133: invokestatic sqrt : (D)D
/*    */     //   136: d2f
/*    */     //   137: fstore_3
/*    */     //   138: aload_0
/*    */     //   139: getfield Z0 : [F
/*    */     //   142: iconst_2
/*    */     //   143: faload
/*    */     //   144: invokestatic is : (F)Z
/*    */     //   147: ifeq -> 177
/*    */     //   150: aload_0
/*    */     //   151: getfield Z0 : [F
/*    */     //   154: bipush #6
/*    */     //   156: faload
/*    */     //   157: invokestatic is : (F)Z
/*    */     //   160: ifeq -> 177
/*    */     //   163: aload_0
/*    */     //   164: getfield Z0 : [F
/*    */     //   167: bipush #10
/*    */     //   169: faload
/*    */     //   170: invokestatic abs : (F)F
/*    */     //   173: fstore_0
/*    */     //   174: goto -> 209
/*    */     //   177: aload_0
/*    */     //   178: getfield Z0 : [F
/*    */     //   181: dup
/*    */     //   182: dup
/*    */     //   183: iconst_2
/*    */     //   184: faload
/*    */     //   185: dup
/*    */     //   186: fmul
/*    */     //   187: fstore_0
/*    */     //   188: bipush #6
/*    */     //   190: faload
/*    */     //   191: dup
/*    */     //   192: fmul
/*    */     //   193: fload_0
/*    */     //   194: fadd
/*    */     //   195: fstore_0
/*    */     //   196: bipush #10
/*    */     //   198: faload
/*    */     //   199: dup
/*    */     //   200: fmul
/*    */     //   201: fload_0
/*    */     //   202: fadd
/*    */     //   203: f2d
/*    */     //   204: invokestatic sqrt : (D)D
/*    */     //   207: d2f
/*    */     //   208: fstore_0
/*    */     //   209: aload_1
/*    */     //   210: fload_2
/*    */     //   211: fload_3
/*    */     //   212: fload_0
/*    */     //   213: invokevirtual TG0 : (FFF)Lf/eo;
/*    */     //   216: pop
/*    */     //   217: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 39
/*    */     //   #3	-> 64
/*    */     //   #4	-> 70
/*    */     //   #5	-> 108
/*    */     //   #6	-> 133
/*    */     //   #7	-> 139
/*    */     //   #8	-> 178
/*    */     //   #9	-> 204
/*    */     //   #10	-> 213
/*    */   }
/*    */   
/*    */   public final void Ri0(eo parameo) {
/*    */     float f1 = parameo.x;
/*    */     float f2 = parameo.y;
/*    */     float f3 = parameo.z;
/*    */     g7(f1, f2, f3);
/*    */   }
/*    */   
/*    */   public final void GJ(float paramFloat1, float paramFloat2, float paramFloat3) {
/*    */     this.Z0[0] = this.Z0[0] * paramFloat1;
/*    */     this.Z0[4] = this.Z0[4] * paramFloat2;
/*    */     this.Z0[8] = this.Z0[8] * paramFloat3;
/*    */     this.Z0[1] = this.Z0[1] * paramFloat1;
/*    */     this.Z0[5] = this.Z0[5] * paramFloat2;
/*    */     this.Z0[9] = this.Z0[9] * paramFloat3;
/*    */     this.Z0[2] = this.Z0[2] * paramFloat1;
/*    */     this.Z0[6] = this.Z0[6] * paramFloat2;
/*    */     this.Z0[10] = this.Z0[10] * paramFloat3;
/*    */     this.Z0[3] = this.Z0[3] * paramFloat1;
/*    */     this.Z0[7] = this.Z0[7] * paramFloat2;
/*    */     this.Z0[11] = this.Z0[11] * paramFloat3;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/math/Matrix4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */