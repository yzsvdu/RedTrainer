/*  1 */ package f;public final class Qv { public long Hb0; public boolean eI0; public long Dt; public long t00; public char bi0; public final void S9() { long l; if (!this.Qo && (l = this.Dt) > 0L) { this.Dt = l - 1L; char c; if ((c = this.bi0) == '\r' || c == '\n') { this.t00--; this.Hb0 = this.hE0; } else { long l1; if ((l1 = this.Hb0) > 0L) this.Hb0 = l1 - 1L;  }  this
/*  2 */         .Qo = true; this.eI0 = false; return; }  throw new m8("Stepping back two steps is not supported"); } public final Reader FA0; public boolean Qo; public long hE0; public Qv(StringReader paramStringReader) { BufferedReader bufferedReader; if (!paramStringReader.markSupported()) { BufferedReader bufferedReader1; this(paramStringReader); bufferedReader = bufferedReader1; }  this.FA0 = bufferedReader; this.eI0 = false; this.Qo = false; this.bi0 = Character.MIN_VALUE; this.Dt = 0L; this.Hb0 = 1L; this.hE0 = 0L; this.t00 = 1L; } public Qv(String paramString) { this(paramString); StringReader stringReader; this(this); } public final char o() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Qo : Z
/*    */     //   4: ifeq -> 20
/*    */     //   7: aload_0
/*    */     //   8: dup
/*    */     //   9: iconst_0
/*    */     //   10: putfield Qo : Z
/*    */     //   13: getfield bi0 : C
/*    */     //   16: istore_1
/*    */     //   17: goto -> 28
/*    */     //   20: aload_0
/*    */     //   21: getfield FA0 : Ljava/io/Reader;
/*    */     //   24: invokevirtual read : ()I
/*    */     //   27: istore_1
/*    */     //   28: iload_1
/*    */     //   29: ifgt -> 39
/*    */     //   32: aload_0
/*    */     //   33: iconst_1
/*    */     //   34: putfield eI0 : Z
/*    */     //   37: iconst_0
/*    */     //   38: ireturn
/*    */     //   39: iload_1
/*    */     //   40: ifle -> 134
/*    */     //   43: iload_1
/*    */     //   44: aload_0
/*    */     //   45: dup
/*    */     //   46: getfield Dt : J
/*    */     //   49: lconst_1
/*    */     //   50: ladd
/*    */     //   51: putfield Dt : J
/*    */     //   54: bipush #13
/*    */     //   56: if_icmpne -> 84
/*    */     //   59: aload_0
/*    */     //   60: dup
/*    */     //   61: dup
/*    */     //   62: dup2
/*    */     //   63: getfield t00 : J
/*    */     //   66: lconst_1
/*    */     //   67: ladd
/*    */     //   68: putfield t00 : J
/*    */     //   71: getfield Hb0 : J
/*    */     //   74: putfield hE0 : J
/*    */     //   77: lconst_0
/*    */     //   78: putfield Hb0 : J
/*    */     //   81: goto -> 134
/*    */     //   84: iload_1
/*    */     //   85: bipush #10
/*    */     //   87: if_icmpne -> 124
/*    */     //   90: aload_0
/*    */     //   91: getfield bi0 : C
/*    */     //   94: bipush #13
/*    */     //   96: if_icmpeq -> 116
/*    */     //   99: aload_0
/*    */     //   100: dup
/*    */     //   101: dup2
/*    */     //   102: getfield t00 : J
/*    */     //   105: lconst_1
/*    */     //   106: ladd
/*    */     //   107: putfield t00 : J
/*    */     //   110: getfield Hb0 : J
/*    */     //   113: putfield hE0 : J
/*    */     //   116: aload_0
/*    */     //   117: lconst_0
/*    */     //   118: putfield Hb0 : J
/*    */     //   121: goto -> 134
/*    */     //   124: aload_0
/*    */     //   125: dup
/*    */     //   126: getfield Hb0 : J
/*    */     //   129: lconst_1
/*    */     //   130: ladd
/*    */     //   131: putfield Hb0 : J
/*    */     //   134: iload_1
/*    */     //   135: i2c
/*    */     //   136: dup
/*    */     //   137: aload_0
/*    */     //   138: swap
/*    */     //   139: putfield bi0 : C
/*    */     //   142: ireturn
/*    */     //   143: astore_0
/*    */     //   144: new f/m8
/*    */     //   147: dup
/*    */     //   148: aload_0
/*    */     //   149: invokespecial <init> : (Ljava/io/IOException;)V
/*    */     //   152: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 46
/*    */     //   #2	-> 139
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*  2 */     //   20	27	143	java/io/IOException } public final Object jk() { char c1; if ((c1 = PD0()) != '"' && c1 != '\'') { if (c1 != '[') { if (c1 != '{') { StringBuilder stringBuilder1; this(); while (c1 >= ' ' && ",:]}/\\\"[{;=#".indexOf(c1) < 0) { stringBuilder1.append(c1); c1 = o(); }  S9(); String str = stringBuilder1.toString().trim(); if (!"".equals(str)) { Long long_1; if (!str.equals("")) { Boolean bool; if (str.equalsIgnoreCase("true")) { bool = Boolean.TRUE; } else if (bool.equalsIgnoreCase("false")) { bool = Boolean.FALSE; } else { sT sT; if (bool.equalsIgnoreCase("null")) { sT = Sl0.lB0; } else { char c; if (((c = sT.charAt(0)) >= '0' && c <= '9') || c == '-') try { Double double_; if (sT.indexOf('.') > -1 || sT.indexOf('e') > -1 || sT.indexOf('E') > -1 || "-0".equals(sT)) {  } else {  }
/*  3 */                        if (false) { Double double_1; if (!(double_1 = Double.valueOf((String)sT)).isInfinite() && !isNaN()) double_ = this;  } else { if (double_.equals((long_ = Long.valueOf((String)double_)).toString())) { if (longValue() == intValue()) return Integer.valueOf(intValue());  } else { return double_; }  long_1 = this; }  } catch (Exception exception) {}  }  }  }  return long_1; }  throw super
/*  4 */             .mo0("Missing value"); }  super.S9(); return new Sl0((Qv)this); }  super.S9();
/*  5 */       this(); if (super.PD0() == '[') { char c; if ((c = super.PD0()) != '\000') { if (c != ']') while (true) { super.S9(); if (super.PD0() == ',') { super.S9(); xg.com9.add(Sl0.lB0); } else { super.S9(); xg.com9.add(super.jk()); }  if ((c = super.PD0()) != '\000') { if (c != ',') { if (c == ']') break;  throw super.mo0("Expected a ',' or ']'"); }  if ((c = super.PD0()) != '\000') { if (c == ']') break;  continue; }  throw super.mo0("Expected a ',' or ']'"); }  throw super.mo0("Expected a ',' or ']'"); }   return xg; }  throw super.mo0("Expected a ',' or ']'"); }  throw super.mo0("A JSONArray text must start with '['"); }
/*  6 */      this(); Long long_; xg xg; StringBuilder stringBuilder; char c2; while ((c2 = super.o()) != '\000' && c2 != '\n' && c2 != '\r') { if (c2 != '\\') { if (c2 == xg) return stringBuilder.toString();  } else { switch (c2 = super.o()) { default: throw super.mo0("Illegal escape.");
/*  7 */           case 'u': try { char[] arrayOfChar; byte b; for (arrayOfChar = new char[c2 = '\004'], b = 0; b < c2; ) { arrayOfChar[b] = super.o();
/*  8 */                 if (!((((Qv)super).eI0 && !((Qv)super).Qo) ? 1 : 0)) { b++; continue; }  throw super
/*  9 */                   .mo0("Substring bounds error"); }  stringBuilder
/* 10 */                 .append((char)Integer.parseInt(new String(arrayOfChar), 16)); } catch (NumberFormatException numberFormatException)
/* 11 */             { throw new m8(
/* 12 */                   B40.df("Illegal escape.")
/* 13 */                   .append(super.toString()).toString(), numberFormatException); }  continue;
/* 14 */           case 't': stringBuilder.append('\t'); continue;case 'r': stringBuilder.append('\r'); continue;case 'n': stringBuilder.append('\n'); continue;case 'f': stringBuilder.append('\f'); continue;case 'b': stringBuilder.append('\b'); continue;case '"': case '\'': case '/': case '\\': break; }  }  stringBuilder.append(c2); }  throw super.mo0("Unterminated string"); }
/*    */ 
/*    */   
/*    */   public final char PD0() {
/*    */     char c;
/*    */     do {
/*    */     
/*    */     } while ((c = o()) != '\000' && c <= ' ');
/*    */     return c;
/*    */   }
/*    */   
/*    */   public final m8 mo0(String paramString) {
/*    */     return new m8(B40.df(paramString).append(toString()).toString());
/*    */   }
/*    */   
/*    */   public final String toString() {
/*    */     return B40.df(" at ").append(this.Dt).append(" [character ").append(this.Hb0).append(" line ").append(this.t00).append("]").toString();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */