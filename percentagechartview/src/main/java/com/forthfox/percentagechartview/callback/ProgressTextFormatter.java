package com.forthfox.percentagechartview.callback;

import androidx.annotation.NonNull;

public interface ProgressTextFormatter {

    @NonNull
    CharSequence provideFormattedText(float progress);

}
