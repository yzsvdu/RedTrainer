/* 1 */ package f;public final class gd implements iq0 { public final void Pw0() { String str1 = "", str2 = ""; if (this.sz0 != null) { str1 = m0.tF0(str1, "#define fogFlag\n");
/* 2 */       str2 = m0.tF0(str2, "#define fogFlag\n"); }
/* 3 */      str1 = m0.tF0(str1, "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nattribute vec4 a_color_mix;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec4 v_color_mix;\nvarying vec2 v_texCoords;\n#ifdef fogFlag\nvarying float v_fog;\nuniform vec4 u_cameraPosition;\n#endif\n\nvoid main()\n{\n   v_color = a_color;\n   v_color_mix = a_color_mix;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n#ifdef fogFlag\n   vec3 flen = u_cameraPosition.xyz - a_position.xyz;\n   float fog = dot(flen, flen) * u_cameraPosition.w;\n   v_fog = min(fog, 1.0);\n#endif\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n");
/* 4 */     str2 = m0.tF0(str2, "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nvarying vec4 v_color_mix;\nuniform sampler2D u_texture;\n#ifdef fogFlag\nuniform vec4 u_fogColor;\nvarying float v_fog;\n#endif\nvoid main()\n{\n  vec4 texel0 = texture2D(u_texture, v_texCoords); \n  gl_FragColor = v_color_mix * vec4(mix(texel0.rgb, v_color.rgb, v_color.a), texel0.a);\n#ifdef fogFlag\n  gl_FragColor.rgb = mix(gl_FragColor.rgb, u_fogColor.rgb, v_fog);\n#endif\nif (gl_FragColor.a <= 0.01)\n  discard;\n}");
/* 5 */     this(str1, str2); Rm0 rm0; this.ZE0 = new Rm0(); if (rm0
/* 6 */       .Xu0)
/* 7 */       return;  throw new IllegalArgumentException(
/* 8 */         B40.df("couldn't compile shader: ")
/* 9 */         .append(this.ZE0.ET()).toString()); }
/*   */ 
/*   */   
/*   */   public Db sx0;
/*   */   public fQ Mi0;
/*   */   public f7 O2;
/*   */   public ny Pz0;
/*   */   public Rm0 ZE0;
/*   */   public final Comparator Tu0;
/*   */   public fo0 sz0;
/*   */   
/*   */   public gd(ny paramny) {
/*   */     this(paramny, null);
/*   */   }
/*   */   
/*   */   public gd(ny paramny, fo0 paramfo0) {
/*   */     this(paramny);
/*   */     FQ fQ1;
/*   */     this(paramny, this, paramfo0);
/*   */   }
/*   */   
/*   */   public gd(ny paramny, Comparator paramComparator, fo0 paramfo0) {
/*   */     Db db;
/*   */     fQ fQ1;
/*   */     f7 f71;
/*   */     this();
/*   */     this.sx0 = this;
/*   */     this();
/*   */     this.Mi0 = this;
/*   */     this();
/*   */     this.O2 = this;
/*   */     this.Pz0 = paramny;
/*   */     this.Tu0 = paramComparator;
/*   */     this.sz0 = paramfo0;
/*   */     Pw0();
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     Rm0 rm0;
/*   */     if ((rm0 = this.ZE0) != null)
/*   */       dispose(); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */