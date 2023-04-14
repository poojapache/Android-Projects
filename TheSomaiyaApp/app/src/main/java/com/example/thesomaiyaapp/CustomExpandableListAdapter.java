package com.example.thesomaiyaapp;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.List;

public class CustomExpandableListAdapter extends BaseExpandableListAdapter {
    static int a[]={R.id.comp,R.id.it,R.id.etrx,R.id.mech,R.id.extc};
    static int bttn[] = {R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8};
    static int deppos,sempos;
     String[] beeid={"VnnpLaKsqGU","vfx8rVbWwmw","iLzfe_HxrWI","vh_aCAHThTQ"},egid={"unTc3PI5rkY","bpztzuBjhP4"},phy1id={"","","",""},chem1id={"",""},m1id={"",""},cs={"",""};
    String[] mechid={"DS0LCnSpkFc",""},fcpid={"Hl-zzrqQoSE","7fC9nL3_AQQ"},evsid={"",""},phy2id={"",""},chem2id={"",""},m2={"",""};
    String[]dsid={"",""},coaid={"",""},javaid={"",""},ddid={"",""},dsgtid={"",""},m3id={" "," "};
    String[]dbmsitid={"",""},dsitid={"",""},dldaid={"",""},tcid={"",""},plid={"",""};
    ExpandableListDataPump e=new ExpandableListDataPump();
    private Context context;
    private List<String> expandableListTitle;
    private LinkedHashMap<String, List<String>> expandableListDetail;

    public CustomExpandableListAdapter(Context context, List<String> expandableListTitle,
                                       LinkedHashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;

    }
    public CustomExpandableListAdapter(){

    }

    @Override
    public Object getChild(int listPosition, int expandedListPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition))
                .get(expandedListPosition);
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {
        final String expandedListText = (String) getChild(listPosition, expandedListPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView expandedListTextView = (TextView) convertView.findViewById(R.id.expandedListItem);
        expandedListTextView.setText(expandedListText);
        MainActivity3 m3=new MainActivity3();
        int d=m3.givcold();
        expandedListTextView.setTextColor(d);
       video_item v=new video_item();
        v.setTitle(expandedListText);
        int j= (int) getGroupId(listPosition);
        int k=(int)getChildId(listPosition,expandedListPosition);
        this.deppos=e.givdeppos();
        this.sempos=e.givsempos();
        v.setChild_id(k);
        switch(deppos) {
            case 0: {
                switch (sempos) {
                    case 0: {
                        switch (j) {
                            case 0: {
                                switch (k) {
                                    case 0: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 2: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 3: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                switch (k) {
                                    case 0: {
                                        v.setId( egid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(egid[k]);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:
                                switch (k) {
                                    case 0: {
                                        v.setId(cs[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(cs[k]);
                                        break;
                                    }

                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        v.setId(phy1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(phy1id[k]);
                                        break;
                                    }

                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        v.setId(chem1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId( chem1id[k]);
                                        break;
                                    }

                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        v.setId( m1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(m1id[k]);
                                        break;
                                    }

                                }
                                break;
                        }

                    }
                    break;
                    case 1:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        v.setId(mechid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(mechid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        v.setId(fcpid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(fcpid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        v.setId(evsid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(evsid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        v.setId(phy2id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(phy2id[k]);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        v.setId(chem2id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(chem2id[k]);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        v.setId(m2[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(m2[k]);
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                    case 3:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        v.setId(dsid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(dsid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        v.setId(coaid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(coaid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        v.setId(javaid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(javaid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        v.setId(ddid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(ddid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        v.setId(dsgtid[k]);
                                        break;
                                    }
                                    case 1: {
                                       v.setId(dsgtid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        v.setId(m3id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(m3id[k]);
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                }
                break;
            }
            case 1: {
                switch (sempos) {
                    case 0: {
                        switch (j) {
                            case 0: {
                                switch (k) {
                                    case 0: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 2: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                    case 3: {
                                        v.setId( beeid[k]);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                switch (k) {
                                    case 0: {
                                        v.setId( egid[k]);
                                        break;
                                    }
                                    case 1: {
                                       v.setId(egid[k]);
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:
                                switch (k) {
                                    case 0: {
                                        v.setId(cs[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(cs[k]);
                                        break;
                                    }

                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        v.setId(phy1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(phy1id[k]);
                                        break;
                                    }

                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        v.setId(chem1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId( chem1id[k]);
                                        break;
                                    }

                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        v.setId( m1id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(m1id[k]);
                                        break;
                                    }

                                }
                                break;
                        }

                    }
                    break;
                    case 1:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        v.setId(mechid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(mechid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        v.setId(fcpid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(fcpid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        v.setId(evsid[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(evsid[k]);
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        v.setId(phy2id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(phy2id[k]);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        v.setId(chem2id[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(chem2id[k]);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        v.setId(m2[k]);
                                        break;
                                    }
                                    case 1: {
                                        v.setId(m2[k]);
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                    case 2:switch (j) {
                        case 0:
                            switch (k) {
                                case 0: {
                                    v.setId(dbmsitid[k]);
                                    break;
                                }
                                case 1: {
                                    v.setId(dbmsitid[k]);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            switch (k) {
                                case 0: {
                                    v.setId( dsitid[k]);
                                    break;
                                }
                                case 1: {
                                    v.setId(dsitid[k]);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            switch (k) {
                                case 0: {
                                    v.setId(dldaid[k]);
                                    break;
                                }
                                case 1: {
                                    v.setId(dldaid[k]);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            switch (k) {
                                case 0: {
                                    v.setId(tcid[k]);
                                    break;
                                }
                                case 1: {
                                    v.setId(tcid[k]);
                                    break;
                                }
                            }
                            break;
                        case 4:
                            switch (k) {
                                case 0: {
                                    v.setId(plid[k]);
                                    break;
                                }
                                case 1: {
                                    v. setId(plid[k]);
                                    break;
                                }
                            }
                            break;
                        case 5:
                            switch (k) {
                                case 0: {
                                   v.setId(m3id[k]);
                                    break;
                                }
                                case 1: {
                                    v.setId(m3id[k]);
                                    break;
                                }
                            }
                            break;

                    }
                        break;
                }
            }break;
        }
        return convertView;
    }
    public String get_id(int j,int k) {
        String s=null;
        switch(deppos) {
            case 0: {
                switch (sempos) {
                    case 0: {
                        switch (j) {
                            case 0: {
                                switch (k) {
                                    case 0: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 2: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 3: {
                                        s = beeid[k];
                                        break;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                switch (k) {
                                    case 0: {
                                        s = egid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = egid[k];
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:
                                switch (k) {
                                    case 0: {
                                        s = cs[k];
                                        break;
                                    }
                                    case 1: {
                                        s = cs[k];
                                        break;
                                    }

                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        s = phy1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = phy1id[k];
                                        break;
                                    }

                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        s = chem1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = chem1id[k];
                                        break;
                                    }

                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        s = m1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = m1id[k];
                                        break;
                                    }

                                }
                                break;
                        }

                    }
                    break;
                    case 1:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        s = mechid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = mechid[k];
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        s = fcpid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = fcpid[k];
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        s = evsid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = evsid[k];
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        s = phy2id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = phy2id[k];
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        s = chem2id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = chem2id[k];
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        s = m2[k];
                                        break;
                                    }
                                    case 1: {
                                        s = m2[k];
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                    case 3:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        s = dsid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = dsid[k];
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        s = coaid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = coaid[k];
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        s = javaid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = javaid[k];
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        s = ddid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = ddid[k];
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        s = dsgtid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = dsgtid[k];
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        s = m3id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = m3id[k];
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                }
                break;
            }
            case 1: {
                switch (sempos) {
                    case 0: {
                        switch (j) {
                            case 0: {
                                switch (k) {
                                    case 0: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 2: {
                                        s = beeid[k];
                                        break;
                                    }
                                    case 3: {
                                        s = beeid[k];
                                        break;
                                    }
                                }
                                break;
                            }
                            case 1: {
                                switch (k) {
                                    case 0: {
                                        s = egid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = egid[k];
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2:
                                switch (k) {
                                    case 0: {
                                        s = cs[k];
                                        break;
                                    }
                                    case 1: {
                                        s = cs[k];
                                        break;
                                    }

                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        s = phy1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = phy1id[k];
                                        break;
                                    }

                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        s = chem1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = chem1id[k];
                                        break;
                                    }

                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        s = m1id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = m1id[k];
                                        break;
                                    }

                                }
                                break;
                        }

                    }
                    break;
                    case 1:
                        switch (j) {
                            case 0:
                                switch (k) {
                                    case 0: {
                                        s = mechid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = mechid[k];
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                switch (k) {
                                    case 0: {
                                        s = fcpid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = fcpid[k];
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                switch (k) {
                                    case 0: {
                                        s = evsid[k];
                                        break;
                                    }
                                    case 1: {
                                        s = evsid[k];
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                switch (k) {
                                    case 0: {
                                        s = phy2id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = phy2id[k];
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                switch (k) {
                                    case 0: {
                                        s = chem2id[k];
                                        break;
                                    }
                                    case 1: {
                                        s = chem2id[k];
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                switch (k) {
                                    case 0: {
                                        s = m2[k];
                                        break;
                                    }
                                    case 1: {
                                        s = m2[k];
                                        break;
                                    }
                                }
                                break;

                        }
                        break;
                    case 2:switch (j) {
                        case 0:
                            switch (k) {
                                case 0: {
                                    s = dbmsitid[k];
                                    break;
                                }
                                case 1: {
                                    s = dbmsitid[k];
                                    break;
                                }
                            }
                            break;
                        case 1:
                            switch (k) {
                                case 0: {
                                    s = dsitid[k];
                                    break;
                                }
                                case 1: {
                                    s = dsitid[k];
                                    break;
                                }
                            }
                            break;
                        case 2:
                            switch (k) {
                                case 0: {
                                    s = dldaid[k];
                                    break;
                                }
                                case 1: {
                                    s = dldaid[k];
                                    break;
                                }
                            }
                            break;
                        case 3:
                            switch (k) {
                                case 0: {
                                    s = tcid[k];
                                    break;
                                }
                                case 1: {
                                    s = tcid[k];
                                    break;
                                }
                            }
                            break;
                        case 4:
                            switch (k) {
                                case 0: {
                                    s = plid[k];
                                    break;
                                }
                                case 1: {
                                    s = plid[k];
                                    break;
                                }
                            }
                            break;
                        case 5:
                            switch (k) {
                                case 0: {
                                    s = m3id[k];
                                    break;
                                }
                                case 1: {
                                    s = m3id[k];
                                    break;
                                }
                            }
                            break;

                    }
                        break;
                }
            }break;
        }
return s;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return this.expandableListDetail.get(this.expandableListTitle.get(listPosition))
                .size();
    }

    @Override
    public Object getGroup(int listPosition) {
        return this.expandableListTitle.get(listPosition);
    }

    @Override
    public int getGroupCount() {
        return this.expandableListTitle.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(listPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group, null);
        }
        TextView listTitleTextView = (TextView) convertView
                .findViewById(R.id.listTitle);
        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle);
        MainActivity3 m3=new MainActivity3();
        int d=m3.givcold();
        listTitleTextView.setTextColor(d);
        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }
}
