package id.blastering.mylibrary.dialogblastering;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.webkit.WebView;
import id.blastering.mylibrary.R;
import id.blastering99.htmlloader.Connection_Checker;

/**
 * Created by macbook on 4/12/16.
 */
public class CustomProgressDialog extends AlertDialog {
    public static final int SQUARE_TO_CIRCLE= 1;
    public static final int BIGSQUARE_TO_CIRCLE= 2;
    public static final int CIRCLELININGUP_TO_CIRCLE= 3;
    public static final int SPINNING_CIRCLE= 4;
    public static final int SPINNING_LINE= 5;
    public static final int SPINNING_SQUARE= 6;
    private int selectedLoader;

    public CustomProgressDialog(Context context) {
        super(context);
    }

    public CustomProgressDialog(Context context, int theme) {
        super(context, theme);
    }

    public void setLoaderType(int i){
        selectedLoader = i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_loader);
        WebView webView = (WebView) findViewById(R.id.wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setBackgroundColor(0x00000000);

        switch (selectedLoader){
            case SQUARE_TO_CIRCLE:
                webView.loadUrl("file:///android_res/raw/preload_twosquare_to_circle.html");
                break;
            case BIGSQUARE_TO_CIRCLE:
                webView.loadUrl("file:///android_res/raw/preload_bigsquare_to_circle.html");
                break;
            case CIRCLELININGUP_TO_CIRCLE:
                webView.loadUrl("file:///android_res/raw/preload_circle_lining_jumping.html");
                break;
            case SPINNING_CIRCLE:
                webView.loadUrl("file:///android_res/raw/preload_spinning_circle.html");
                break;
            case SPINNING_LINE:
                webView.loadUrl("file:///android_res/raw/preload_spinning_line.html");
                break;
            case SPINNING_SQUARE:
                webView.loadUrl("file:///android_res/raw/preload_spinning_square.html");
                break;
            default:
                webView.loadUrl("file:///android_res/raw/preload_spinning_line.html");
                break;
        }

        setCanceledOnTouchOutside(false);
    }
}
