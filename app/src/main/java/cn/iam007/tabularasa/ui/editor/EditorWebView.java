package cn.iam007.tabularasa.ui.editor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.ValueCallback;

import org.wordpress.android.editor.EditorWebViewAbstract;

public class EditorWebView extends EditorWebViewAbstract {

    public EditorWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("NewApi")
    public void execJavaScriptFromString(String javaScript) {
        execJavaScriptFromString(javaScript, null);
    }

    /**
     * 执行js代码，通过callback获取执行结果。
     *
     * @param javaScript js代码段
     * @param callback   回调函数
     */
    public void execJavaScriptFromString(String javaScript, ValueCallback<String> callback) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.evaluateJavascript(javaScript, callback);
        } else {
            this.loadUrl("javascript:" + javaScript);
        }
    }

}