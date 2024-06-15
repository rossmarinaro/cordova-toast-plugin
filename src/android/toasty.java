
package cordova.plugins.toasty;

import org.apache.cordova.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.app.Application; 
import android.os.Bundle;
import android.widget.Toast;
import android.view.*;

//for custom graphics

//import android.widget.TextView;
//import android.view.Menu;
//import io.cordova.pastaboss_a_recipe_for_disaster.R; //pkg where drawable lives
//import android.graphics.drawable.Drawable;
//import android.content.res.Resources;


public class toasty extends CordovaPlugin {

    private CallbackContext PUBLIC_CALLBACKS = null;  

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

        PUBLIC_CALLBACKS = callbackContext;

        Context context = this.cordova.getActivity().getApplicationContext();
        
        if (action.equals("showToast")) 
        {
        
            Toast toast = Toast.makeText(context, args.getString(0), Toast.LENGTH_LONG);

        //custom svg

            // if (args.getBoolean(1) == false)
            // {
            //     View toastView = toast.getView();
            //     toastView.setBackgroundResource(R.drawable.hello_drawable);
            //     TextView v = (TextView) toast.getView().findViewById(android.R.id.message);
            //     if (v != null) v.setGravity(Gravity.CENTER);
            // }

            toast.show();

            PluginResult result = new PluginResult(PluginResult.Status.OK, "success");
                result.setKeepCallback(true);
                PUBLIC_CALLBACKS.sendPluginResult(result);

            return true;
        }

        return false;
    }
    
}
