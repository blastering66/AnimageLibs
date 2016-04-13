package id.blastering.mylib;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.webkit.WebView;

/**
 * Created by macbook on 4/12/16.
 */
public class CustomProgressDialog extends AlertDialog {
    public static int SQUARE_TO_CIRCLE= 1;
    public static int BIGSQUARE_TO_CIRCLE= 2;
    public static int CIRCLELININGUP_TO_CIRCLE= 3;
    public static int SPINNING_CIRCLE= 4;
    public static int SPINNING_LINE= 5;
    public static int SPINNING_SQUARE= 6;
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
            case 1:
                webView.loadUrl("file:///android_res/raw/preload_twosquare_to_circle.html");
                break;
            case 2:
                webView.loadUrl("file:///android_res/raw/preload_bigsquare_to_circle.html");
                break;
            case 3:
                webView.loadUrl("file:///android_res/raw/preload_circle_lining_jumping.html");
                break;
            case 4:
                webView.loadUrl("file:///android_res/raw/preload_spinning_circle.html");
                break;
            case 5:
                webView.loadUrl("file:///android_res/raw/preload_spinning_line.html");
                break;
            case 6:
                webView.loadUrl("file:///android_res/raw/preload_spinning_square.html");
                break;
            default:
                webView.loadUrl("file:///android_res/raw/preload_spinning_line.html");
                break;
        }

        setCanceledOnTouchOutside(false);
    }
}
