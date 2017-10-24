package br.com.voxzap.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.voxzap.messenger.AndroidUtilities;
import br.com.voxzap.messenger.LocaleController;
import br.com.voxzap.messenger.MessagesController;
import br.com.voxzap.R;
import br.com.voxzap.tgnet.ConnectionsManager;
import br.com.voxzap.tgnet.RequestDelegate;
import br.com.voxzap.tgnet.TLObject;
import br.com.voxzap.tgnet.TLRPC;
import br.com.voxzap.ui.ActionBar.AlertDialog;
import br.com.voxzap.ui.ActionBar.Theme;
import br.com.voxzap.ui.Components.BetterRatingView;
import br.com.voxzap.ui.Components.LayoutHelper;
import br.com.voxzap.ui.Components.voip.VoIPHelper;

public class VoIPFeedbackActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
		super.onCreate(savedInstanceState);

		overridePendingTransition(0, 0);

		setContentView(new View(this));

		VoIPHelper.showRateAlert(this, new Runnable(){
			@Override
			public void run(){
				finish();
			}
		}, getIntent().getLongExtra("call_id", 0), getIntent().getLongExtra("call_access_hash", 0));
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(0, 0);
	}
}
