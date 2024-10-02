package vn.edu.usth.weatheractivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
public class handlethread {
    private static Handler handler;
    public handlethread(Handler handler)
    {
        this.handler = handler;
    }
    public static void NetworkRequest() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Bundle bundle = new Bundle();
                bundle.putString("server_response", "refresh");
                Message msg = new Message();
                msg.setData(bundle);
                handler.sendMessage(msg);
            }
        });
        t.start();
    }
}
