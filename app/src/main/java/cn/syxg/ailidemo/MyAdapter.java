package cn.syxg.ailidemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/3/20.
 */

public class MyAdapter extends BaseAdapter{

    private Context mContext;

    public String[] img_text = { "转账", "余额宝", "手机充值", "信用卡还款", "淘宝电影", "彩票",
            "当面付", "亲密付", "机票","兵哥哥" };
    public int[] imgs = { R.drawable.app_transfer, R.drawable.app_fund,
            R.drawable.app_phonecharge, R.drawable.app_creditcard,
            R.drawable.app_movie, R.drawable.app_lottery,
            R.drawable.app_facepay, R.drawable.app_close, R.drawable.app_plane ,R.drawable.app_game};

    public MyAdapter(Context mContext) {
        super();
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return img_text.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.grid_item, parent, false);
        }
        TextView tv = BaseViewHolder.get(convertView, R.id.tv_item);
        ImageView iv = BaseViewHolder.get(convertView, R.id.iv_item);
        iv.setBackgroundResource(imgs[position]);

        tv.setText(img_text[position]);
        return convertView;
    }

}
