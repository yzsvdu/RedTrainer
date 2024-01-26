package f;

import com.badlogic.gdx.graphics.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class dR {
  public fQ Bm0;
  
  public dR() {
    fQ fQ1;
    this();
    this.Bm0 = this;
  }
  
  public static Color Yj(String[] paramArrayOfString) {
    float f1 = Float.parseFloat(paramArrayOfString[1]);
    float f2 = Float.parseFloat(paramArrayOfString[2]);
    float f3 = Float.parseFloat(paramArrayOfString[3]);
    float f4 = 1.0F;
    if (paramArrayOfString.length > 4)
      f4 = Float.parseFloat(paramArrayOfString[4]); 
    return new Color(f1, f2, f3, f4);
  }
  
  public final void jw(RD0 paramRD0) {
    this();
    uF uF;
    BufferedReader bufferedReader;
    if (paramRD0 == null || !paramRD0.L0())
      return; 
    this(new InputStreamReader(paramRD0.Yc()), 4096);
    try {
      String str;
      while ((str = bufferedReader.readLine()) != null) {
        String str1;
        QD qD1;
        if (str.length() > 0 && str.charAt(0) == '\t')
          str = str.substring(1).trim(); 
        String[] arrayOfString;
        if ((arrayOfString = str.split("\\s+"))[0].length() == 0 || arrayOfString[0].charAt(0) == '#')
          continue; 
        String str2;
        if ((str2 = arrayOfString[0].toLowerCase()).equals("newmtl")) {
          qD1 = uF.ez0();
          this.Bm0.Com3(qD1);
          if (arrayOfString.length > 1) {
          
          } else {
          
          } 
          str1 = "default";
          uF.Q70 = str1;
          uF.tf();
          continue;
        } 
        if (qD1.equals("ka")) {
          uF.tI = Yj((String[])str1);
          continue;
        } 
        if (qD1.equals("kd")) {
          uF.Jp = Yj((String[])str1);
          continue;
        } 
        if (qD1.equals("ks")) {
          uF.Wn = Yj((String[])str1);
          continue;
        } 
        if (qD1.equals("tr") || qD1.equals("d")) {
          uF.pF0 = Float.parseFloat(str1[1]);
          continue;
        } 
        if (qD1.equals("ns")) {
          uF.UH = Float.parseFloat(str1[1]);
          continue;
        } 
        if (qD1.equals("map_d")) {
          uF.YG = paramRD0.wT().f0(str1[1]).rw();
          continue;
        } 
        if (qD1.equals("map_ka")) {
          uF.jT = paramRD0.wT().f0(str1[1]).rw();
          continue;
        } 
        if (qD1.equals("map_kd")) {
          uF.TF = paramRD0.wT().f0(str1[1]).rw();
          continue;
        } 
        if (qD1.equals("map_ks")) {
          uF.Yh = paramRD0.wT().f0(str1[1]).rw();
          continue;
        } 
        if (qD1.equals("map_ns"))
          uF.Rt = paramRD0.wT().f0(str1[1]).rw(); 
      } 
      bufferedReader.close();
      QD qD = uF.ez0();
      this.Bm0.Com3(this);
      return;
    } catch (IOException iOException) {
      return;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dR.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */