/* 1 */ package f;public final class NH0 { public Rm0 Za0; public float vG; public int VH0; public int E80; public NH0() { Rm0 rm0; this.vG = 1.0F;
/* 2 */     this("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projTrans;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projTrans * a_position;\n}\n", "#ifdef GL_ES\n#define LOWP lowp\n    precision mediump float;\n#else\n    #define LOWP\n#endif\nvarying LOWP vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nuniform vec4 u_color;\nvoid main()\n{\n\tvec4 texel0 = texture2D(u_texture, v_texCoords);\n\tgl_FragColor = v_color * vec4(mix(texel0.rgb, u_color.rgb, u_color.a), texel0.a);\n}\n"); if ((new Rm0()).d8()) { Uu(rm0); return; }  throw new IllegalArgumentException(
/* 3 */         B40.df("Error compiling shader: ")
/* 4 */         .append(rm0.ET()).toString()); } public final void Uu(Rm0 paramRm0) { if (!paramRm0.Xu0) { this.Za0 = null; }
/* 5 */     else { Rm0.bk0 = false; paramRm0.bind(); boolean bool = true; String str = "u_texture1"; paramRm0.oM(); UB0.re0.glUniform1i(paramRm0.mm0(str, Rm0.bk0), bool);
/* 6 */       this.Za0 = paramRm0; }
/*   */      }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NH0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */