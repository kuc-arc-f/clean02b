// テスト
package jp.co.esourcejapan.app.clean02;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.starmicronics.stario.*;

import jp.co.esourcejapan.fw.*;

public class TAB001Activity extends Activity {
	private String TAG ="TAB001Activity";

	private static final int MENU1_ID = Menu.FIRST;
	private static final int MENU2_ID = Menu.FIRST+1;
	//
	private static String portName = "";
	private static String portSettings = "";
	//
	Handler mHandler;
	private WebView       m_Web;
	private String        m_STR_url       ="http://esj-clean.main.jp/dev2/php/tst4.php";
	private String        m_STR_url02     ="http://esj-clean.main.jp/dev2/php/tst5.php";
	private String        m_STR_url03     ="http://esj-clean.main.jp/dev2/php/tst6.php";
//	private String        m_STR_url07      ="http://esj-clean.main.jp/dev2/php/tst7.php?id=1";
	private String        m_STR_url08     ="http://esj-clean.main.jp/dev2/php/tst8.php?id=1";
	private ArrayList<String>    m_LIST = new ArrayList<String>();
	private ArrayList<ItemPR>    m_ListPR = new ArrayList<ItemPR>();
	//
	private jp.co.esourcejapan.fw.HttpUtil m_Http = new HttpUtil();
	private jp.co.esourcejapan.fw.ComUtil m_Util  = new ComUtil();
	/* class */
	class JsObj {
		private Activity activity;

		public JsObj(Activity androidJs) {
			this.activity = androidJs;
		}

		public void exec_print(final String title1, final String title2, final String title3) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print(title1, title2, title3);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}
		public void exec_print02(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print02(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}
		public void exec_print03(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print03(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}
		public void exec_print04(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print04(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}
 		public void exec_print05(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print05(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}		
 		public void exec_print06(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print06(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}		
 		//
 		public void exec_print07(final String title) {
			mHandler.post(new Runnable() {
				public void run() {
					try
					{
						proc_print07(title);
					}catch(Exception e){
						e.printStackTrace();
						m_Util.errorDialog(TAB001Activity.this, e.getMessage());
					}
					
				}
			});
		}		
 		

}
    /** Called when the activity is first created. */
	private class WebViewClientLoading extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }
	}
	//
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab001 );
        try
        {
            SharedPreferences prefs = getSharedPreferences("StarAndroidSample", 0);
	        portName = prefs.getString("PortName", "");
	        if(portName == null)
	        {
	        	portName = "";
	        }
	        portSettings = prefs.getString("PortSettings", "");
	        if(portSettings == null)
	        {
	        	portSettings = "";
	        }
        	mHandler = new Handler();
            init_proc();
        }catch(Exception e){
        	portName = "";
        	portSettings = "";
        	e.printStackTrace();
        	m_Util.errorDialog(this, e.toString());
        }
    }
    public void onStart ()
    {
    	super.onStart();
    	try
    	{
        	SharedPreferences prefs = getSharedPreferences("StarAndroidSample", 0);
        	SharedPreferences.Editor editor = prefs.edit();
        	editor.putString("PortName", portName);
        	editor.putString("PortSettings", portSettings);
        	editor.commit();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }    
    //
    private void init_proc() throws Exception{
    	try
    	{
        	m_Web = (WebView) findViewById(R.id.web01 );
        	m_Web.clearCache(true);
        	m_Web.getSettings().setJavaScriptEnabled(true);
        	m_Web.getSettings().setBuiltInZoomControls(true);
        	m_Web.setWebViewClient(new WebViewClientLoading());
        	
    		JsObj jo = new JsObj(this);
    		m_Web.addJavascriptInterface(jo, "Android");        	
    		m_Web.loadUrl(m_STR_url);
    	}catch(Exception e){
    		throw e;
    	}
    }
    //
    private void proc_print(String title1,String title2,String title3){
    	try
    	{
//			m_Util.showDialog(this,"I", title1);
Log.d(TAG, "title1=" +title1);
Log.d(TAG, "title2=" +title2);
Log.d(TAG, "title3=" +title3);
Toast toast = Toast.makeText(this, "proc_print=" + title1 + ":"+ title2 + ":" + title3, Toast.LENGTH_SHORT);
toast.show();

    		m_LIST.clear();
    		m_LIST.add(title1);
    		m_LIST.add(title2);
    		m_LIST.add(title3);
//    		PrintRecieptMini();
    		PrintRecieptMini_sjis();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    //
	private void get_itemData02(String url) throws Exception{
    	try
    	{
        	String s = m_Http.doGet(url);
        	JSONArray arr = new JSONArray( s );
        	StringBuilder sb =new StringBuilder();
			for(int i = 0; i < arr.length(); i++){
        	    ItemPR item = new ItemPR();
				JSONObject obj = arr.getJSONObject(i);
				
				String s_ADH_CustName       = obj.getString("ADH_CustName");
				String s_ADH_SCSName        = obj.getString("ADH_SCSName");
				String s_ADH_Adrs           = obj.getString("ADH_Adrs");
				String s_ADH_SubAdrs        = obj.getString("ADH_SubAdrs");
				String s_ADH_TelNo          = obj.getString("ADH_TelNo");
				String s_ADH_FaxNo          = obj.getString("ADH_FaxNo");
				String s_ADH_AdChar1       = obj.getString("ADH_AdChar1");
				String s_ADH_AdChar2       = obj.getString("ADH_AdChar2");
				String s_ADH_AdChar3       = obj.getString("ADH_AdChar3");
				String s_ADH_AdChar4       = obj.getString("ADH_AdChar4");
				
				String s_SH1_UserName      = obj.getString("SH1_UserName");
				String s_SH1_Adrs          = obj.getString("SH1_Adrs");
				String s_SH1_SubAdrs       = obj.getString("SH1_SubAdrs");
				String s_SH1_TelNo         = obj.getString("SH1_TelNo");
				String s_SH1_FaxNo         = obj.getString("SH1_FaxNo");
				
				String s_HED_phead         = obj.getString("HED_phead");
				String s_HED_pdate         = obj.getString("HED_pdate");
				String s_HED_CustName      = obj.getString("HED_CustName");
				String s_HED_Point         = obj.getString("HED_Point");
				String s_HED_ShiagariYMD   = obj.getString("HED_ShiagariYMD");
				String s_HED_ShiagariHM    = obj.getString("HED_ShiagariHM");
				String s_HED_DenpyoNo      = obj.getString("HED_DenpyoNo");
				
				String s_ITM_Hinname       = obj.getString("ITM_Hinname");
				String s_ITM_Suryo         = obj.getString("ITM_Suryo");
				String s_ITM_TankaKomi     = obj.getString("ITM_TankaKomi");
				String s_ITM_MKingakuK     = obj.getString("ITM_MKingakuK");
				
				String s_FOT_DKingakuK       = obj.getString("FOT_DKingakuK");
				String s_FOT_MaebaraiGaku    = obj.getString("FOT_MaebaraiGaku");
				String s_FOT_Uchizei         = obj.getString("FOT_Uchizei");
				String s_FOT_azuka           = obj.getString("FOT_azuka");
				String s_FOT_watasi          = obj.getString("FOT_watasi");
				
				String s_AD1_CustName         = obj.getString("AD1_CustName");
				String s_AD1_SCSName          = obj.getString("AD1_SCSName");
				String s_AD1_Adrs             = obj.getString("AD1_Adrs");
				String s_AD1_SubAdrs          = obj.getString("AD1_SubAdrs");
				String s_AD1_TelNo            = obj.getString("AD1_TelNo");
				String s_AD1_FaxNo            = obj.getString("AD1_FaxNo");
				String s_AD1_AdChar1          = obj.getString("AD1_AdChar1");
				String s_AD1_AdChar2          = obj.getString("AD1_AdChar2");
				String s_AD1_AdChar3          = obj.getString("AD1_AdChar3");
				String s_AD1_AdChar4          = obj.getString("AD1_AdChar4");

				String s_AD2_CustName         = obj.getString("AD2_CustName");
				String s_AD2_SCSName          = obj.getString("AD2_SCSName");
				String s_AD2_Adrs             = obj.getString("AD2_Adrs");
				String s_AD2_SubAdrs          = obj.getString("AD2_SubAdrs");
				String s_AD2_TelNo            = obj.getString("AD2_TelNo");
				String s_AD2_FaxNo            = obj.getString("AD2_FaxNo");
				String s_AD2_AdChar1          = obj.getString("AD2_AdChar1");
				String s_AD2_AdChar2          = obj.getString("AD2_AdChar2");
				String s_AD2_AdChar3          = obj.getString("AD2_AdChar3");
				String s_AD2_AdChar4          = obj.getString("AD2_AdChar4");
				
				item.setADH_CustName(s_ADH_CustName);
				item.setADH_SCSName( s_ADH_SCSName);
				item.setADH_Adrs( s_ADH_Adrs);
				item.setADH_SubAdrs( s_ADH_SubAdrs);
				item.setADH_TelNo(s_ADH_TelNo);
				item.setADH_FaxNo( s_ADH_FaxNo);
				item.setADH_AdChar1(s_ADH_AdChar1);
				item.setADH_AdChar2(s_ADH_AdChar2);
				item.setADH_AdChar3(s_ADH_AdChar3);
				item.setADH_AdChar4(s_ADH_AdChar4);
				
				item.setSH1_UserName(s_SH1_UserName);
				item.setSH1_Adrs( s_SH1_Adrs);
				item.setSH1_SubAdrs( s_SH1_SubAdrs);
				item.setSH1_TelNo( s_SH1_TelNo);
				item.setSH1_FaxNo( s_SH1_FaxNo);

				item.setHED_phead(  s_HED_phead);
				item.setHED_pdate(  s_HED_pdate);
				item.setHED_CustName(  s_HED_CustName );
				item.setHED_Point(  s_HED_Point);
				item.setHED_ShiagariYMD( s_HED_ShiagariYMD );
				item.setHED_ShiagariHM( s_HED_ShiagariHM );
				item.setHED_DenpyoNo(  s_HED_DenpyoNo);				
				
				item.setITM_Hinname( s_ITM_Hinname);
				item.setITM_Suryo( s_ITM_Suryo);
				item.setITM_TankaKomi( s_ITM_TankaKomi);
				item.setITM_MKingakuK( s_ITM_MKingakuK);
				
				item.setFOT_DKingakuK( s_FOT_DKingakuK);
				item.setFOT_MaebaraiGaku( s_FOT_MaebaraiGaku );
				item.setFOT_Uchizei( s_FOT_Uchizei);
				item.setFOT_azuka( s_FOT_azuka);
				item.setFOT_watasi( s_FOT_watasi);
				
				item.setAD1_CustName( s_AD1_CustName );
				item.setAD1_SCSName( s_AD1_SCSName );
				item.setAD1_Adrs( s_AD1_Adrs );
				item.setAD1_SubAdrs( s_AD1_SubAdrs );
				item.setAD1_TelNo( s_AD1_TelNo );
				item.setAD1_FaxNo( s_AD1_FaxNo );
				item.setAD1_AdChar1( s_AD1_AdChar1 );
				item.setAD1_AdChar2( s_AD1_AdChar2 );
				item.setAD1_AdChar3( s_AD1_AdChar3 );
				item.setAD1_AdChar4( s_AD1_AdChar4 );

				item.setAD2_CustName( s_AD2_CustName );
				item.setAD2_SCSName( s_AD2_SCSName );
				item.setAD2_Adrs( s_AD2_Adrs );
				item.setAD2_SubAdrs( s_AD2_SubAdrs );
				item.setAD2_TelNo( s_AD2_TelNo );
				item.setAD2_FaxNo( s_AD2_FaxNo );
				item.setAD2_AdChar1( s_AD2_AdChar1 );
				item.setAD2_AdChar2( s_AD2_AdChar2 );
				item.setAD2_AdChar3( s_AD2_AdChar3 );
				item.setAD2_AdChar4( s_AD2_AdChar4 );
				m_ListPR.add(item);
			}
			//debug
			/*
			for(int i=0; i< m_ListPR.size(); i++){
				ItemPR item = m_ListPR.get(i);
				Log.d(TAG,  String.valueOf(i) +   ":getADH_CustName=" +item.getADH_CustName());
				Log.d(TAG,  String.valueOf(i) +   ":getADH_SCSName=" +item.getADH_SCSName());
				Log.d(TAG,  String.valueOf(i) +   ":getADH_Adrs=" +item.getADH_Adrs());
			}
			*/
    	}catch(Exception e){
    		throw e;
    	}
	}    
    //
	private void get_itemData_sjis(String url, String enc) throws Exception{
    	try
    	{
        	String s = m_Http.doGet(url);
        	JSONArray arr = new JSONArray( s );
        	StringBuilder sb =new StringBuilder();
        	StringBuilder sb_uni =new StringBuilder();
			for(int i = 0; i < arr.length(); i++){
        	    String[] lime = new String[5];
				JSONObject obj = arr.getJSONObject(i);
				
				String s_id       = obj.getString("id");
				String s_item     = obj.getString("item");
				sb_uni.append( s_item );
				byte[] bb        = s_item.getBytes(enc);
				s_item           = bb.toString();
				sb.append(s_item  +", ");
Log.d(TAG, "s_item=" +s_item);
        	    m_LIST.add(s_item);
			}
Toast toast = Toast.makeText(this, "get_itemData=" + sb_uni.toString() + " :SJIS="  +sb.toString(), Toast.LENGTH_SHORT);
toast.show();
    	}catch(Exception e){
    		throw e;
    	}
	}    
    //
	private void get_itemData(String url) throws Exception{
    	try
    	{
        	String s = m_Http.doGet(url);
        	JSONArray arr = new JSONArray( s );
        	StringBuilder sb =new StringBuilder();
			for(int i = 0; i < arr.length(); i++){
        	    String[] lime = new String[5];
				JSONObject obj = arr.getJSONObject(i);
				
				String s_id       = obj.getString("id");
				String s_item     = obj.getString("item");
				sb.append(s_item  +", ");
Log.d(TAG, "s_item=" +s_item);
        	    m_LIST.add(s_item);
			}
Toast toast = Toast.makeText(this, "get_itemData=" +sb.toString(), Toast.LENGTH_SHORT);
toast.show();
		//debug
String s_msg = sb.toString();
for(int i= 0; i < s_msg.length(); i++){
	System.out.printf("\\u%04X%n", Character.codePointAt(s_msg, i));
	int i_num =  Character.codePointAt(s_msg, i);
	String ss =String.format("\\u%04X%n", i_num);
	Log.d(TAG, "ss=" + ss);
}

    	}catch(Exception e){
    		throw e;
    	}
	}
    //
    private void proc_print02(String title){
    	try
    	{
//    		m_Util.showDialog(this,"I", title);
    		get_itemData(m_STR_url02);
    		if(m_LIST.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    private void proc_print03(String title){
    	try
    	{
    		get_itemData(m_STR_url03);
    		if(m_LIST.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    private void proc_print04(String title){
    	try
    	{
Log.d(TAG, "proc_print04");
    		get_itemData_sjis(m_STR_url03, "SJIS");
    		if(m_LIST.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    private void proc_print05(String title){
    	try
    	{
Log.d(TAG, "proc_print05");
    		get_itemData_sjis(m_STR_url03, "MS932");
    		if(m_LIST.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    private void proc_print06(String title){
    	try
    	{
Log.d(TAG, "proc_print06");
			get_itemData(m_STR_url03);
    		if(m_LIST.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini_sjis();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    //
    private void proc_print07(String title){
    	try
    	{
Log.d(TAG, "proc_print07");
			get_itemData02( m_STR_url08 );
    		if(m_ListPR.size() < 1){
        		m_Util.errorDialog(this, "Item data is Nothing");
    			return;
    		}
    		PrintRecieptMini_07();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
      //
    private void PrintRecieptMini_tst()
    {
    	Log.d(TAG, "PrintRecieptMini_tst");
    	StarIOPort port = null;
    	try
    	{
    		//port = StarIOPort.getPort(portName, portSettings, 5000);
    		ItemPR item = m_ListPR.get(0);
    		
    		String buffer = "\u001b\u0040";                     //Initialize printer Pg. 1-43
    		buffer = buffer + "\u001c\u0043\u0001";             //kanji-ON
    		buffer = buffer + "\u001b\u0061\u0001";             //Center Alignment - Refer to Pg. 1-18
    		buffer = buffer + "**広告**"+ "\n";
    		buffer = buffer + item.getADH_CustName() + "\n";
    		buffer = buffer + item.getADH_SCSName() + " " + item.getADH_Adrs() + "\n";
    		buffer = buffer + item.getADH_SubAdrs() + "\n";
    		buffer = buffer + item.getADH_TelNo() + "\n";
    		buffer = buffer + item.getADH_FaxNo() + "\n";
    		buffer = buffer + item.getADH_AdChar1() + "\n";
    		buffer = buffer + item.getADH_AdChar2() + "\n";
    		buffer = buffer + item.getADH_AdChar3() + "\n";
    		buffer = buffer + item.getADH_AdChar4() + "\n";
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\n";
            //SH1
            buffer = buffer + item.getSH1_UserName()+ "\n";
            buffer = buffer + item.getSH1_Adrs()+ "\n";
            buffer = buffer + item.getSH1_SubAdrs()+ "\n";
            buffer = buffer + item.getSH1_TelNo() + " " + item.getSH1_FaxNo()+ "\n";
            buffer = buffer + "-------------------------------- \n";
            //HED
            buffer = buffer + item.getHED_phead()+ "\n";
            buffer = buffer + item.getHED_pdate()+ "\n";
            buffer = buffer + item.getHED_CustName() + " 様 " + item.getHED_Point() + " ﾎﾟｲﾝﾄ"+ "\n";
            buffer = buffer + "お渡し予定 " + item.getHED_ShiagariYMD() + " " + item.getHED_ShiagariHM()+ "\n";
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\u001b\u0061\u0000";             //Left Alignment - Refer to Pg. 1-18
            buffer = buffer + "伝票No. "+ item.getHED_DenpyoNo() +"\n";
            buffer = buffer + "品　　　名\n";
            buffer = buffer + "\u001b\u0061\u0002";             //Riht Alignment
            buffer = buffer + "点数　　　　単価　　　　　金額\n";

            //
//            buffer = buffer + "Star Clothing Boutique\n";
//            buffer = buffer + "1150 King Georges Post Rd.\n";
//            buffer = buffer + "Edison, NJ 08837\n\n";
//            buffer = buffer + "\u001b\u0061\u0000";             //Left Alignment - Refer to Pg. 1-18
//            buffer = buffer + "\u001b\u0044\u0001\u0008\u0017\u0000";      //Setting Horizontal Tab - Pg. 1-19
//            buffer = buffer + "Date: 12/31/2008 " + " Time: 9:10 PM\n";      //Moving Horizontal Tab - Pg. 1-19
//            buffer = buffer + "-------------------------------- \n";
//            buffer = buffer + "\u001b\u0045\u0001";                    //Select Emphasized Printing - Pg.  1-13
//            buffer = buffer + "SALE\n";
            buffer = buffer + "\u001b\u0045\u0000";                    //Cancel Emphasized Printing - Pg. 1-13
            for(int i=0; i< m_ListPR.size(); i++){
            	ItemPR  line = m_ListPR.get(i); 
            	buffer = buffer + "\u001b\u0061\u0000"; 
            	buffer = buffer + line.getITM_Hinname() +"\n";
            	buffer = buffer + "\u001b\u0061\u0002";
                buffer = buffer + line.getITM_Suryo() + "\u0009" + line.getITM_TankaKomi()  + "\u0009" + line.getITM_MKingakuK() +"\n";
//                buffer = buffer + "30067" + "\u0009" + s_item  + "\u0009" + " 10.99\n";
            }
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "合計(残金分)" + "\u0009" + "\u0009" +  item.getFOT_DKingakuK() +"\n";
            buffer = buffer + "内消費税"     + "\u0009" + "\u0009" +  item.getFOT_Uchizei() +"\n";
            buffer = buffer + "お返し"       + "\u0009" + "\u0009" +  item.getFOT_watasi() +"\n";
            buffer = buffer + "お預かり"     + "\u0009" + "\u0009" +  item.getFOT_azuka() +"\n";
            buffer = buffer + "\n";
            buffer = buffer + "--------------------------------\n";
            //AD1
            buffer = buffer + "\u001b\u0061\u0001";
    		buffer = buffer + "**広告**"+ "\n";
            buffer = buffer + item.getAD1_CustName() +"\n";
            buffer = buffer + item.getAD1_SCSName() +  " "+ item.getAD1_Adrs()+"\n";
            buffer = buffer + item.getAD1_SubAdrs()+"\n";
            buffer = buffer + "TEL:" +item.getAD1_TelNo()+"\n";
            buffer = buffer + "FAX:" +item.getAD1_FaxNo()+"\n";
            buffer = buffer + "\n";
            buffer = buffer + item.getAD1_AdChar1()+ "\n";
            buffer = buffer + item.getAD1_AdChar2()+ "\n";
            buffer = buffer + item.getAD1_AdChar3()+ "\n";
            buffer = buffer + item.getAD1_AdChar4()+ "\n";
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "\n";
            buffer = buffer + "\n";
            buffer = buffer + "\n";
//            buffer = buffer + "Subtotal" + "\u0009" + "\u0009" + "156.95\n";
//            buffer = buffer + "Tax" + "\u0009" + "\u0009" + " 00.00\n";
//            buffer = buffer + "--------------------------------\n";
//            buffer = buffer + "\u001b\u0044\u0016\u0000";      //Setting Horizontal Tab - Pg. 1-19
//            buffer = buffer + "Total" + "\u0009" + "\u0009" + "\u001b\u0021\u0012" + "$156.95\n";    //Character Size - Pg. 1-14
//            buffer = buffer + "\u001b\u0021\u0000";                                                          //Cancel Expansion - Pg. 1-14
//            buffer = buffer + "--------------------------------\n";
//            buffer = buffer + "Charge\n" + "$159.95\n";
//            buffer = buffer + "Visa XXXX-XXXX-XXXX-0123\n\n";
//            buffer = buffer + "\u001d\u0042\u0001" + "Refunds and Exchanges" + "\u001d\u0042\u0000\n";                       //Specify/Cancel White/Black Invert - Pg. 1-15
//            buffer = buffer + "Within " + "\u001b\u002d\u0001" + "30 days" + "\u001b\u002d\u0000" + " with receipt\n"; //Specify/Cancel Underline Printing - Pg. 1-12
//            buffer = buffer + "And tags attached\n\n";
//            buffer = buffer + "          \u001d\u0068\u0030\u001d\u0077\u0001\u001d\u006b\u0049\u000c" + " 12ab34cd56 " + "\n\n\n\n\n";             //Barcode - Pg.1-33 - 1-36
Log.d(TAG, "buffer=" +buffer);
            try
            {
                byte[] data = buffer.getBytes("SJIS");
                port.writePort(data, 0, data.length);
            }catch(Exception e){
            	e.printStackTrace();
            }
            try
            {
            	Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            	
            }
    	}
    	catch(Exception e)
    	{
    		Builder dialog = new AlertDialog.Builder(this);
			dialog.setNegativeButton("Ok", null);
			AlertDialog alert = dialog.create();
			alert.setTitle(e.getMessage());
			alert.show(); 
    	}
    	finally
    	{
    		if(port != null)
    		{
    			try
    			{
    				StarIOPort.releasePort(port);
    			}
    			catch(StarIOPortException e)
    			{
    				
    			}
    		}
    	}
    } 
    //
    private void PrintRecieptMini_07()
    {
Log.d(TAG, "PrintRecieptMini_07");
    	StarIOPort port = null;
    	try
    	{
    		port = StarIOPort.getPort(portName, portSettings, 5000);
    		ItemPR item = m_ListPR.get(0);
    		
    		String buffer = "\u001b\u0040";                     //Initialize printer Pg. 1-43
    		buffer = buffer + "\u001c\u0043\u0001";             //kanji-ON
    		buffer = buffer + "\u001b\u0061\u0001";             //Center Alignment - Refer to Pg. 1-18
    		buffer = buffer + "**広告**"+ "\n";
    		buffer = buffer + item.getADH_CustName() + "\n";
    		buffer = buffer + item.getADH_SCSName() + " " + item.getADH_Adrs() + "\n";
    		buffer = buffer + item.getADH_SubAdrs() + "\n";
    		buffer = buffer + item.getADH_TelNo() + "\n";
    		buffer = buffer + item.getADH_FaxNo() + "\n";
    		buffer = buffer + item.getADH_AdChar1() + "\n";
    		buffer = buffer + item.getADH_AdChar2() + "\n";
    		buffer = buffer + item.getADH_AdChar3() + "\n";
    		buffer = buffer + item.getADH_AdChar4() + "\n";
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\n";
            //SH1
            buffer = buffer + item.getSH1_UserName()+ "\n";
            buffer = buffer + item.getSH1_Adrs()+ "\n";
            buffer = buffer + item.getSH1_SubAdrs()+ "\n";
            buffer = buffer + item.getSH1_TelNo() + " " + item.getSH1_FaxNo()+ "\n";
            buffer = buffer + "-------------------------------- \n";
            //HED
            buffer = buffer + item.getHED_phead()+ "\n";
            buffer = buffer + item.getHED_pdate()+ "\n";
            buffer = buffer + item.getHED_CustName() + " 様 " + item.getHED_Point() + " ﾎﾟｲﾝﾄ"+ "\n";
            buffer = buffer + "お渡し予定 " + item.getHED_ShiagariYMD() + " " + item.getHED_ShiagariHM()+ "\n";
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\u001b\u0061\u0000";             //Left Alignment - Refer to Pg. 1-18
            buffer = buffer + "伝票No. "+ item.getHED_DenpyoNo() +"\n";
            buffer = buffer + "品　　　名\n";
            buffer = buffer + "\u001b\u0061\u0002";             //Riht Alignment
            buffer = buffer + "点数　　　　単価　　　　　金額\n";

            buffer = buffer + "\u001b\u0045\u0000";                    //Cancel Emphasized Printing - Pg. 1-13
            for(int i=0; i< m_ListPR.size(); i++){
            	ItemPR  line = m_ListPR.get(i); 
            	buffer = buffer + "\u001b\u0061\u0000"; 
            	buffer = buffer + line.getITM_Hinname() +"\n";
            	buffer = buffer + "\u001b\u0061\u0002";
                buffer = buffer + line.getITM_Suryo() + "\u0009" + line.getITM_TankaKomi()  + "\u0009" + line.getITM_MKingakuK() +"\n";
            }
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "合計(残金分)" + "\u0009" + "\u0009" +  item.getFOT_DKingakuK() +"\n";
            buffer = buffer + "内消費税"     + "\u0009" + "\u0009" +  item.getFOT_Uchizei() +"\n";
            buffer = buffer + "お返し"       + "\u0009" + "\u0009" +  item.getFOT_watasi() +"\n";
            buffer = buffer + "お預かり"     + "\u0009" + "\u0009" +  item.getFOT_azuka() +"\n";
            buffer = buffer + "\n";
            buffer = buffer + "--------------------------------\n";
            //AD1
            buffer = buffer + "\u001b\u0061\u0001";
    		buffer = buffer + "**広告**"+ "\n";
            buffer = buffer + item.getAD1_CustName() +"\n";
            buffer = buffer + item.getAD1_SCSName() +  " "+ item.getAD1_Adrs()+"\n";
            buffer = buffer + item.getAD1_SubAdrs()+"\n";
            buffer = buffer + "TEL:" +item.getAD1_TelNo()+"\n";
            buffer = buffer + "FAX:" +item.getAD1_FaxNo()+"\n";
            buffer = buffer + "\n";
            buffer = buffer + item.getAD1_AdChar1()+ "\n";
            buffer = buffer + item.getAD1_AdChar2()+ "\n";
            buffer = buffer + item.getAD1_AdChar3()+ "\n";
            buffer = buffer + item.getAD1_AdChar4()+ "\n";
            buffer = buffer + "--------------------------------\n";    
            buffer = buffer + "\n";
            buffer = buffer + "\n";
            buffer = buffer + "\n";
//Log.d(TAG, "buffer=" +buffer);
            try
            {
                byte[] data = buffer.getBytes("SJIS");
                port.writePort(data, 0, data.length);
            }catch(Exception e){
            	e.printStackTrace();
            }
            try
            {
            	Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            	
            }
    	}
    	catch(StarIOPortException e)
    	{
    		Builder dialog = new AlertDialog.Builder(this);
			dialog.setNegativeButton("Ok", null);
			AlertDialog alert = dialog.create();
			alert.setTitle(e.getMessage());
			alert.show(); 
    	}
    	finally
    	{
    		if(port != null)
    		{
    			try
    			{
    				StarIOPort.releasePort(port);
    			}
    			catch(StarIOPortException e)
    			{
    				
    			}
    		}
    	}
    }     
    //
    private void PrintRecieptMini_sjis()
    {
    	StarIOPort port = null;
    	try
    	{
    		port = StarIOPort.getPort(portName, portSettings, 5000);
    		
    		String buffer = "\u001b\u0040";                     //Initialize printer Pg. 1-43
    		buffer = buffer + "\u001b\u0061\u0001";             //Center Alignment - Refer to Pg. 1-18
            buffer = buffer + "Star Clothing Boutique\n";
            buffer = buffer + "1150 King Georges Post Rd.\n";
            buffer = buffer + "Edison, NJ 08837\n\n";
            buffer = buffer + "\u001b\u0061\u0000";             //Left Alignment - Refer to Pg. 1-18
            buffer = buffer + "\u001b\u0044\u0001\u0008\u0017\u0000";      //Setting Horizontal Tab - Pg. 1-19
            buffer = buffer + "Date: 12/31/2008 " + " Time: 9:10 PM\n";      //Moving Horizontal Tab - Pg. 1-19
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\u001b\u0045\u0001";                    //Select Emphasized Printing - Pg.  1-13
            buffer = buffer + "SALE\n";
            buffer = buffer + "\u001b\u0045\u0000";                    //Cancel Emphasized Printing - Pg. 1-13
            for(int i=0; i< m_LIST.size(); i++){
            	String s_item = m_LIST.get(i); 
                buffer = buffer + "30067" + "\u0009" + s_item  + "\u0009" + " 10.99\n";
            }
            buffer = buffer + "Subtotal" + "\u0009" + "\u0009" + "156.95\n";
            buffer = buffer + "Tax" + "\u0009" + "\u0009" + " 00.00\n";
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "\u001b\u0044\u0016\u0000";      //Setting Horizontal Tab - Pg. 1-19
            buffer = buffer + "Total" + "\u0009" + "\u0009" + "\u001b\u0021\u0012" + "$156.95\n";    //Character Size - Pg. 1-14
            buffer = buffer + "\u001b\u0021\u0000";                                                          //Cancel Expansion - Pg. 1-14
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "Charge\n" + "$159.95\n";
            buffer = buffer + "Visa XXXX-XXXX-XXXX-0123\n\n";
            buffer = buffer + "\u001d\u0042\u0001" + "Refunds and Exchanges" + "\u001d\u0042\u0000\n";                       //Specify/Cancel White/Black Invert - Pg. 1-15
            buffer = buffer + "Within " + "\u001b\u002d\u0001" + "30 days" + "\u001b\u002d\u0000" + " with receipt\n"; //Specify/Cancel Underline Printing - Pg. 1-12
            buffer = buffer + "And tags attached\n\n";
            buffer = buffer + "          \u001d\u0068\u0030\u001d\u0077\u0001\u001d\u006b\u0049\u000c" + " 12ab34cd56 " + "\n\n\n\n\n";             //Barcode - Pg.1-33 - 1-36
            
            try
            {
                byte[] data = buffer.getBytes("SJIS");
                port.writePort(data, 0, data.length);
            }catch(Exception e){
            	e.printStackTrace();
            }
            try
            {
            	Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            	
            }
    	}
    	catch(StarIOPortException e)
    	{
    		Builder dialog = new AlertDialog.Builder(this);
			dialog.setNegativeButton("Ok", null);
			AlertDialog alert = dialog.create();
			alert.setTitle(e.getMessage());
			alert.show(); 
    	}
    	finally
    	{
    		if(port != null)
    		{
    			try
    			{
    				StarIOPort.releasePort(port);
    			}
    			catch(StarIOPortException e)
    			{
    				
    			}
    		}
    	}
    }    
    //
    private void PrintRecieptMini()
    {
    	StarIOPort port = null;
    	try
    	{
    		port = StarIOPort.getPort(portName, portSettings, 5000);
    		
    		String buffer = "\u001b\u0040";                     //Initialize printer Pg. 1-43
    		buffer = buffer + "\u001b\u0061\u0001";             //Center Alignment - Refer to Pg. 1-18
            buffer = buffer + "Star Clothing Boutique\n";
            buffer = buffer + "1150 King Georges Post Rd.\n";
            buffer = buffer + "Edison, NJ 08837\n\n";
            buffer = buffer + "\u001b\u0061\u0000";             //Left Alignment - Refer to Pg. 1-18
            buffer = buffer + "\u001b\u0044\u0001\u0008\u0017\u0000";      //Setting Horizontal Tab - Pg. 1-19
            buffer = buffer + "Date: 12/31/2008 " + " Time: 9:10 PM\n";      //Moving Horizontal Tab - Pg. 1-19
            buffer = buffer + "-------------------------------- \n";
            buffer = buffer + "\u001b\u0045\u0001";                    //Select Emphasized Printing - Pg.  1-13
            buffer = buffer + "SALE\n";
            buffer = buffer + "\u001b\u0045\u0000";                    //Cancel Emphasized Printing - Pg. 1-13
            /*
            buffer = buffer + "30067" + "\u0009" + "PLAN T-SHIRT" + "\u0009" + " 10.99\n";
            buffer = buffer + "30069" + "\u0009" + "BLACK DENIM" + "\u0009" + " 29.99\n";
            buffer = buffer + "30065" + "\u0009" + "BLUE DENIM" + "\u0009" + " 29.99\n";
            buffer = buffer + "30064" + "\u0009" + "STRIPE DRESS" + "\u0009" + " 49.99\n";
            buffer = buffer + "30063" + "\u0009" + "BLACK BOOT" + "\u0009" + " 35.99\n\n";
            */
            for(int i=0; i< m_LIST.size(); i++){
            	String s_item = m_LIST.get(i); 
                buffer = buffer + "30067" + "\u0009" + s_item  + "\u0009" + " 10.99\n";
            }
            buffer = buffer + "Subtotal" + "\u0009" + "\u0009" + "156.95\n";
            buffer = buffer + "Tax" + "\u0009" + "\u0009" + " 00.00\n";
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "\u001b\u0044\u0016\u0000";      //Setting Horizontal Tab - Pg. 1-19
            buffer = buffer + "Total" + "\u0009" + "\u0009" + "\u001b\u0021\u0012" + "$156.95\n";    //Character Size - Pg. 1-14
            buffer = buffer + "\u001b\u0021\u0000";                                                          //Cancel Expansion - Pg. 1-14
            buffer = buffer + "--------------------------------\n";
            buffer = buffer + "Charge\n" + "$159.95\n";
            buffer = buffer + "Visa XXXX-XXXX-XXXX-0123\n\n";
            buffer = buffer + "\u001d\u0042\u0001" + "Refunds and Exchanges" + "\u001d\u0042\u0000\n";                       //Specify/Cancel White/Black Invert - Pg. 1-15
            buffer = buffer + "Within " + "\u001b\u002d\u0001" + "30 days" + "\u001b\u002d\u0000" + " with receipt\n"; //Specify/Cancel Underline Printing - Pg. 1-12
            buffer = buffer + "And tags attached\n\n";
            buffer = buffer + "          \u001d\u0068\u0030\u001d\u0077\u0001\u001d\u006b\u0049\u000c" + " 12ab34cd56 " + "\n\n\n\n\n";             //Barcode - Pg.1-33 - 1-36
            
            byte[] data = buffer.getBytes();
            
            port.writePort(data, 0, data.length);
            try
            {
            	Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
            	
            }
    	}
    	catch(StarIOPortException e)
    	{
    		Builder dialog = new AlertDialog.Builder(this);
			dialog.setNegativeButton("Ok", null);
			AlertDialog alert = dialog.create();
			alert.setTitle(e.getMessage());
			alert.show(); 
    	}
    	finally
    	{
    		if(port != null)
    		{
    			try
    			{
    				StarIOPort.releasePort(port);
    			}
    			catch(StarIOPortException e)
    			{
    				
    			}
    		}
    	}
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    	boolean result = super.onCreateOptionsMenu(menu);
    	menu.add(0, MENU1_ID, Menu.NONE, "Setting");
    	
    	return result;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
    	Intent intent;
    	switch( item.getItemId() ){
    	case MENU1_ID :
        	Intent myIntent = new Intent(this, Settings.class);
            startActivityForResult(myIntent, 0); 
    		return true;
    	}
    	return super.onOptionsItemSelected(item);
    }    
    //
    public static String getPortName()
    {
    	return portName;
    }
    public static void setPortName(String pName)
    {
    	portName = pName;
    }
    
    public static String getPortSettings()
    {
    	return portSettings;
    }
    public static void setPortSettings(String pSettings)
    {
    	portSettings = pSettings;
    }    
    
    
}