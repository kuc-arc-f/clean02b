package jp.co.esourcejapan.app.clean02;

import android.graphics.Bitmap;

//
public class ItemPR {
//	private CharSequence m_ID;
	private String m_ID;
	private String m_ADH_CustName;
	private String m_ADH_SCSName;
	private String m_ADH_Adrs;
	private String m_ADH_SubAdrs;
	private String m_ADH_TelNo;
	private String m_ADH_FaxNo;
	private String m_ADH_AdChar1;
	private String m_ADH_AdChar2;
	private String m_ADH_AdChar3;
	private String m_ADH_AdChar4;
	
	private String m_SH1_UserName;
	private String m_SH1_Adrs;
	private String m_SH1_SubAdrs;
	private String m_SH1_TelNo;
	private String m_SH1_FaxNo;
	
	private String m_HED_phead;
	private String m_HED_pdate;
	private String m_HED_CustName;
	private String m_HED_Point;
	private String m_HED_ShiagariYMD;
	private String m_HED_ShiagariHM;
	private String m_HED_DenpyoNo;
	
	private String m_ITM_Hinname;
	private String m_ITM_Suryo;
	private String m_ITM_TankaKomi;
	private String m_ITM_MKingakuK;

	private String m_FOT_DKingakuK;
	private String m_FOT_MaebaraiGaku;
	private String m_FOT_Uchizei;
	private String m_FOT_azuka;
	private String m_FOT_watasi;
	
	private String m_AD1_CustName;
	private String m_AD1_SCSName;
	private String m_AD1_Adrs;
	private String m_AD1_SubAdrs;
	private String m_AD1_TelNo;
	private String m_AD1_FaxNo;
	private String m_AD1_AdChar1;
	private String m_AD1_AdChar2;
	private String m_AD1_AdChar3;
	private String m_AD1_AdChar4;
	
	private String m_AD2_CustName;
	private String m_AD2_SCSName;
	private String m_AD2_Adrs;
	private String m_AD2_SubAdrs;
	private String m_AD2_TelNo;
	private String m_AD2_FaxNo;
	private String m_AD2_AdChar1;
	private String m_AD2_AdChar2;
	private String m_AD2_AdChar3;
	private String m_AD2_AdChar4;
	
	public ItemPR() {
		m_ID      = "";
		m_ADH_CustName= "";
		m_ADH_SCSName= "";
		m_ADH_Adrs= "";
		m_ADH_SubAdrs= "";
		m_ADH_TelNo= "";
		m_ADH_FaxNo= "";
		m_ADH_AdChar1= "";
		m_ADH_AdChar2= "";
		m_ADH_AdChar3= "";
		m_ADH_AdChar4= "";

		m_SH1_UserName      = "";
		m_SH1_Adrs      = "";
		m_SH1_SubAdrs      = "";
		m_SH1_TelNo      = "";
		m_SH1_FaxNo      = "";
		
		m_HED_phead      = "";
		m_HED_pdate      = "";
		m_HED_CustName      = "";
		m_HED_Point      = "";
		m_HED_ShiagariYMD      = "";
		m_HED_ShiagariHM      = "";
		m_HED_DenpyoNo      = "";
		
		m_ITM_Hinname      = "";
		m_ITM_Suryo      = "";
		m_ITM_TankaKomi      = "";
		m_ITM_MKingakuK      = "";

		m_FOT_DKingakuK      = "";
		m_FOT_MaebaraiGaku      = "";
		m_FOT_Uchizei    ="";
		m_FOT_azuka      = "";
		m_FOT_watasi      = "";
		
		m_AD1_CustName      = "";
		m_AD1_SCSName      = "";
		m_AD1_Adrs      = "";
		m_AD1_SubAdrs      = "";
		m_AD1_TelNo      = "";
		m_AD1_FaxNo      = "";
		m_AD1_AdChar1      = "";
		m_AD1_AdChar2      = "";
		m_AD1_AdChar3      = "";
		m_AD1_AdChar4      = "";
		
		m_AD2_CustName      = "";
		m_AD2_SCSName      = "";
		m_AD2_Adrs      = "";
		m_AD2_SubAdrs      = "";
		m_AD2_TelNo      = "";
		m_AD2_FaxNo      = "";
		m_AD2_AdChar1      = "";
		m_AD2_AdChar2      = "";
		m_AD2_AdChar3      = "";
		m_AD2_AdChar4      = "";
	}
	public String getId() { return m_ID; }
	public void setId(String src) { m_ID = src; }
	
	public String getADH_CustName() { return m_ADH_CustName; }
	public void setADH_CustName(String src) { m_ADH_CustName = src; }
	public String getADH_SCSName() { return m_ADH_SCSName; }
	public void setADH_SCSName(String src) { m_ADH_SCSName = src; }
	public String getADH_Adrs() { return m_ADH_Adrs; }
	public void setADH_Adrs(String src) { m_ADH_Adrs = src; }
	public String getADH_SubAdrs() { return m_ADH_SubAdrs; }
	public void setADH_SubAdrs(String src) { m_ADH_SubAdrs = src; }
	public String getADH_TelNo() { return m_ADH_TelNo; }
	public void setADH_TelNo(String src) { m_ADH_TelNo = src; }
	public String getADH_FaxNo() { return m_ADH_FaxNo; }
	public void setADH_FaxNo(String src) { m_ADH_FaxNo = src; }
	public String getADH_AdChar1() { return m_ADH_AdChar1; }
	public void setADH_AdChar1(String src) { m_ADH_AdChar1 = src; }
	public String getADH_AdChar2() { return m_ADH_AdChar2; }
	public void setADH_AdChar2(String src) { m_ADH_AdChar2 = src; }
	public String getADH_AdChar3() { return m_ADH_AdChar3; }
	public void setADH_AdChar3(String src) { m_ADH_AdChar3 = src; }
	public String getADH_AdChar4() { return m_ADH_AdChar4; }
	public void setADH_AdChar4(String src) { m_ADH_AdChar4 = src; }

	public String getSH1_UserName() { return m_SH1_UserName; }
	public void setSH1_UserName(String src) { m_SH1_UserName = src; }
	public String getSH1_Adrs() { return m_SH1_Adrs; }
	public void setSH1_Adrs(String src) { m_SH1_Adrs = src; }
	public String getSH1_SubAdrs() { return m_SH1_SubAdrs; }
	public void setSH1_SubAdrs(String src) { m_SH1_SubAdrs = src; }
	public String getSH1_TelNo() { return m_SH1_TelNo; }
	public void setSH1_TelNo(String src) { m_SH1_TelNo = src; }
	public String getSH1_FaxNo() { return m_SH1_FaxNo; }
	public void setSH1_FaxNo(String src) { m_SH1_FaxNo = src; }
	
	public String getHED_phead() { return m_HED_phead; }
	public void setHED_phead(String src) { m_HED_phead = src; }
	public String getHED_pdate() { return m_HED_pdate; }
	public void setHED_pdate(String src) { m_HED_pdate = src; }
	public String getHED_CustName() { return m_HED_CustName; }
	public void setHED_CustName(String src) { m_HED_CustName = src; }
	public String getHED_Point() { return m_HED_Point; }
	public void setHED_Point(String src) { m_HED_Point = src; }
	public String getHED_ShiagariYMD() { return m_HED_ShiagariYMD; }
	public void setHED_ShiagariYMD(String src) { m_HED_ShiagariYMD = src; }
	public String getHED_ShiagariHM() { return m_HED_ShiagariHM; }
	public void setHED_ShiagariHM(String src) { m_HED_ShiagariHM = src; }
	public String getHED_DenpyoNo() { return m_HED_DenpyoNo; }
	public void setHED_DenpyoNo(String src) { m_HED_DenpyoNo = src; }

	public String getITM_Hinname() { return m_ITM_Hinname; }
	public void setITM_Hinname(String src) { m_ITM_Hinname = src; }
	public String getITM_Suryo() { return m_ITM_Suryo; }
	public void setITM_Suryo(String src) { m_ITM_Suryo = src; }
	public String getITM_TankaKomi() { return m_ITM_TankaKomi; }
	public void setITM_TankaKomi(String src) { m_ITM_TankaKomi = src; }
	public String getITM_MKingakuK() { return m_ITM_MKingakuK; }
	public void setITM_MKingakuK(String src) { m_ITM_MKingakuK = src; }
	
	public String getFOT_DKingakuK() { return m_FOT_DKingakuK; }
	public void setFOT_DKingakuK(String src) { m_FOT_DKingakuK = src; }
	public String getFOT_MaebaraiGaku() { return m_FOT_MaebaraiGaku; }
	public void setFOT_MaebaraiGaku(String src) { m_FOT_MaebaraiGaku = src; }
	public String getFOT_Uchizei() { return m_FOT_Uchizei; }
	public void setFOT_Uchizei(String src) { m_FOT_Uchizei = src; }
	public String getFOT_azuka() { return m_FOT_azuka; }
	public void setFOT_azuka(String src) { m_FOT_azuka = src; }
	public String getFOT_watasi() { return m_FOT_watasi; }
	public void setFOT_watasi(String src) { m_FOT_watasi = src; }

	public String getAD1_CustName() { return m_AD1_CustName; }
	public void setAD1_CustName(String src) { m_AD1_CustName = src; }
	public String getAD1_SCSName() { return m_AD1_SCSName; }
	public void setAD1_SCSName(String src) { m_AD1_SCSName = src; }
	public String getAD1_Adrs() { return m_AD1_Adrs; }
	public void setAD1_Adrs(String src) { m_AD1_Adrs = src; }
	public String getAD1_SubAdrs() { return m_AD1_SubAdrs; }
	public void setAD1_SubAdrs(String src) { m_AD1_SubAdrs = src; }
	public String getAD1_TelNo() { return m_AD1_TelNo; }
	public void setAD1_TelNo(String src) { m_AD1_TelNo = src; }
	public String getAD1_FaxNo() { return m_AD1_FaxNo; }
	public void setAD1_FaxNo(String src) { m_AD1_FaxNo = src; }
	public String getAD1_AdChar1() { return m_AD1_AdChar1; }
	public void setAD1_AdChar1(String src) { m_AD1_AdChar1 = src; }
	public String getAD1_AdChar2() { return m_AD1_AdChar2; }
	public void setAD1_AdChar2(String src) { m_AD1_AdChar2 = src; }
	public String getAD1_AdChar3() { return m_AD1_AdChar3; }
	public void setAD1_AdChar3(String src) { m_AD1_AdChar3 = src; }
	public String getAD1_AdChar4() { return m_AD1_AdChar4; }
	public void setAD1_AdChar4(String src) { m_AD1_AdChar4 = src; }
	
	public String getAD2_CustName() { return m_AD2_CustName; }
	public void setAD2_CustName(String src) { m_AD2_CustName = src; }
	public String getAD2_SCSName() { return m_AD2_SCSName; }
	public void setAD2_SCSName(String src) { m_AD2_SCSName = src; }
	public String getAD2_Adrs() { return m_AD2_Adrs; }
	public void setAD2_Adrs(String src) { m_AD2_Adrs = src; }
	public String getAD2_SubAdrs() { return m_AD2_SubAdrs; }
	public void setAD2_SubAdrs(String src) { m_AD2_SubAdrs = src; }
	public String getAD2_TelNo() { return m_AD2_TelNo; }
	public void setAD2_TelNo(String src) { m_AD2_TelNo = src; }
	public String getAD2_FaxNo() { return m_AD2_FaxNo; }
	public void setAD2_FaxNo(String src) { m_AD2_FaxNo = src; }
	public String getAD2_AdChar1() { return m_AD2_AdChar1; }
	public void setAD2_AdChar1(String src) { m_AD2_AdChar1 = src; }
	public String getAD2_AdChar2() { return m_AD2_AdChar2; }
	public void setAD2_AdChar2(String src) { m_AD2_AdChar2 = src; }
	public String getAD2_AdChar3() { return m_AD2_AdChar3; }
	public void setAD2_AdChar3(String src) { m_AD2_AdChar3 = src; }
	public String getAD2_AdChar4() { return m_AD2_AdChar4; }
	public void setAD2_AdChar4(String src) { m_AD2_AdChar4 = src; }
}