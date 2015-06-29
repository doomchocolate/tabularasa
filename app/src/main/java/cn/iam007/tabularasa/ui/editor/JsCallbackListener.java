package cn.iam007.tabularasa.ui.editor;

import java.util.Map;

/**
 * Created by Administrator on 2015/6/29.
 */
public interface JsCallbackListener {
    void onDomLoaded();

    void onSelectionChanged(Map<String, String> selectionArgs);

    void onSelectionStyleChanged(Map<String, Boolean> changeSet);

    void onGetHtmlResponse(Map<String, String> responseArgs);

    void onInput(String fieldId);
//
//    void onFocusIn(String params){
//
//    }
//
//    void onFocusOut(String params){
//
//    }
//
//    void onImageReplaced(String params){
//
//    }
//
//    void onImageTap(String params){
//
//    }
//
//    void onLinkTap(String params){
//
//    }
}
