package edu.orangecoastcollege.cs273.smssender;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joseph on 10/30/2016.
 */

public class ContactsAdapter extends ArrayAdapter<Contact>{
    private Context mContext;
    private int mResourceId;
    private List<Contact> mAllContacts;

    private TextView mListItemNameTextView;
    private TextView mListItemPhoneNumberTextView;

    public ContactsAdapter(Context context, int resourceId, ArrayList<Contact> allContacts) {
        super(context, resourceId, allContacts);
        this.mContext = context;
        this.mResourceId = resourceId;
        this.mAllContacts = allContacts;
    }

    public View getView(int pos, View convertView, ViewGroup parent)
    {
        Contact contact = mAllContacts.get(pos);
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(mResourceId, null);

        mListItemNameTextView = (TextView) view.findViewById(R.id.listItemNameTextView);
        mListItemPhoneNumberTextView = (TextView) view.findViewById(R.id.listItemPhoneNumberTextView);

        mListItemNameTextView.setText(contact.getName());
        mListItemPhoneNumberTextView.setText(contact.getPhone());

        LinearLayout selectedLinearLayout = (LinearLayout) view.findViewById(R.id.contactItemLinearLayout);
        selectedLinearLayout.setTag(contact);

        return view;
    }
}
