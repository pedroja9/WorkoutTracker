/**
 * 
 */
package com.sudarmuthu.android.wt.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author "Sudar Muthu (http://sudarmuthu.com)"
 *
 */
public class EntriesDateActivity extends ListActivity {

	static class ViewHolder {
		TextView date;
		TextView value;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
}
