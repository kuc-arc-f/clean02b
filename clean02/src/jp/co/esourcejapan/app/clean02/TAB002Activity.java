//------------------------------------
// @         : 
// @ purpose : About
// @ date    : 
//------------------------------------
package jp.co.esourcejapan.app.clean02;

import jp.co.esourcejapan.fw.*;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

public class TAB002Activity extends Activity {
	private jp.co.esourcejapan.fw.AppConst m_Const= new AppConst();
	private jp.co.esourcejapan.fw.ComUtil  m_Util    = new ComUtil();
	
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.tab002);

        String versionName = m_Util.comGet_VersionName02(this);
        TextView t = (TextView) findViewById(R.id.about);
        String a_app = getResources().getString(R.string.app_name );
//		String  msg = a_app + "\nversion " + versionName + "\n\n" + getText(R.string.about_text);
		String  msg = a_app + "\n\n version " + versionName + "\n\n";
        t.setText(msg );
    }
    
    
}