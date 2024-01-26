package f;

import com.badlogic.gdx.graphics.Color;

public final class uF {
  public String Q70 = "default";
  
  public Color tI;
  
  public Color Jp;
  
  public Color Wn;
  
  public float pF0;
  
  public float UH;
  
  public String YG;
  
  public String jT;
  
  public String TF;
  
  public String Rt;
  
  public String Yh;
  
  public uF() {
    tf();
  }
  
  public static void SJ(QD paramQD, String paramString, int paramInt) {
    if (paramString != null) {
      this();
      ri0.kH = paramInt;
      Ri0 ri0;
      (ri0 = new Ri0()).i0 = paramString;
      if (paramQD.Oi0 == null) {
        fQ fQ;
        this(1);
        paramQD.Oi0 = fQ;
      } 
      paramQD.Oi0.Com3(ri0);
    } 
  }
  
  public final QD ez0() {
    this();
    Color color;
    QD qD;
    (qD = new QD()).KJ0 = this.Q70;
    if (this.tI == null) {
      color = null;
    } else {
      this(this.tI);
    } 
    qD.W4 = color;
    qD.sK = new Color(this.Jp);
    qD.yF0 = new Color(this.Wn);
    qD.wC = this.pF0;
    qD.Tu = this.UH;
    SJ(qD, this.YG, 9);
    SJ(qD, this.jT, 4);
    SJ(qD, this.TF, 2);
    SJ(qD, this.Yh, 5);
    SJ(qD, this.Rt, 6);
    return qD;
  }
  
  public final void tf() {
    this.tI = null;
    Color color = Color.WHITE;
    this.Wn = this;
    this.pF0 = 1.0F;
    this.UH = 0.0F;
    this.YG = null;
    this.jT = null;
    this.TF = null;
    this.Rt = null;
    this.Yh = null;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */