/*
 * This is the source code of VoxZap for Android v. 3.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2017.
 */

package br.com.voxzap.ui.Cells;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;

import br.com.voxzap.messenger.AndroidUtilities;
import br.com.voxzap.ui.Components.LayoutHelper;
import br.com.voxzap.ui.Components.RadialProgressView;

public class LoadingCell extends FrameLayout {

    private RadialProgressView progressBar;

    public LoadingCell(Context context) {
        super(context);

        progressBar = new RadialProgressView(context);
        addView(progressBar, LayoutHelper.createFrame(LayoutHelper.WRAP_CONTENT, LayoutHelper.WRAP_CONTENT, Gravity.CENTER));
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(54), MeasureSpec.EXACTLY));
    }
}
