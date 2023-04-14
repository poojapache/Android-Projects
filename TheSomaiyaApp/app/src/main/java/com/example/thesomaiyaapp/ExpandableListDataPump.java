package com.example.thesomaiyaapp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Pooja on 11-03-2017.
 */

public class ExpandableListDataPump {
    static int dept, sem, i, j, deppos, sempos;
    static video_item vid;
    static int a[] = {R.id.comp, R.id.it, R.id.etrx, R.id.mech, R.id.extc};
    static int bttn[] = {R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8};

    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();
        for (i = 0; i < a.length; i++) {
            if (dept == a[i]) {
                deppos = i;
                break;
            }
        }
        for (j = 0; j < bttn.length; j++) {
            if (sem == bttn[j]) {
                sempos = j;
                break;
            }
        }
        switch (deppos) {
            case 0: {
                switch (sempos) {
                    case 0:
                        String[] beettl = {"Circuits", "Conductors", "Ohm's law", "Transformer"}, egttl = {"Ortho", "Projections"}, csttl = {"", ""}, phy1ttl = {"", ""}, chem1ttl = {"Water", " "}, m1ttl = {"", ""};
                        List<String> bee = new ArrayList<String>();
                        for (int i = 0; i < beettl.length; i++) {
                            bee.add(beettl[i]);
                        }
                        expandableListDetail.put("BEE", bee);
                        List<String> eg = new ArrayList<String>();
                        for (int i = 0; i < egttl.length; i++) {
                            eg.add(egttl[i]);
                        }
                        expandableListDetail.put("Engineering Graphics", eg);
                        List<String> cs = new ArrayList<String>();
                        for (int i = 0; i < csttl.length; i++) {
                            eg.add(csttl[i]);
                        }
                        expandableListDetail.put("Communication Skills", cs);
                        List<String> phy1 = new ArrayList<String>();
                        for (int i = 0; i < phy1ttl.length; i++) {
                            eg.add(phy1ttl[i]);
                        }
                        expandableListDetail.put("Physics-1", phy1);
                        List<String> chem1 = new ArrayList<String>();
                        for (int i = 0; i < chem1ttl.length; i++) {
                            eg.add(egttl[i]);
                        }
                        expandableListDetail.put("Chemistry-1", chem1);
                        List<String> m1 = new ArrayList<String>();
                        for (int i = 0; i < m1ttl.length; i++) {
                            eg.add(m1ttl[i]);
                        }
                        expandableListDetail.put("Maths-1", m1);
                        break;

                    case 1:
                        String[] mechttl = {"Trusses", " "}, fcpttl = {"Basics of C", "Files in C"}, evsttl = {"", ""}, phy2ttl = {"", ""}, chem2ttl = {"Rubber", " "}, m2ttl = {"", ""};
                        List<String> mech = new ArrayList<String>();
                        for (int i = 0; i < mechttl.length; i++) {
                            mech.add(mechttl[i]);
                        }
                        expandableListDetail.put("MECHANICS", mech);
                        List<String> fcp = new ArrayList<String>();
                        for (int i = 0; i < fcpttl.length; i++) {
                            fcp.add(fcpttl[i]);
                        }
                        expandableListDetail.put("Fundamental of computer programming", fcp);
                        List<String> evs = new ArrayList<String>();
                        for (int i = 0; i < evsttl.length; i++) {
                            evs.add(evsttl[i]);
                        }
                        expandableListDetail.put("E.V.S.", evs);
                        List<String> phy2 = new ArrayList<String>();
                        for (int i = 0; i < phy2ttl.length; i++) {
                            phy2.add(phy2ttl[i]);
                        }
                        expandableListDetail.put("Physics-2", phy2);
                        List<String> chem2 = new ArrayList<String>();
                        for (int i = 0; i < chem2ttl.length; i++) {
                            chem2.add(chem2ttl[i]);
                        }
                        expandableListDetail.put("Chemistry-2", chem2);
                        List<String> m2 = new ArrayList<String>();
                        for (int i = 0; i < m2ttl.length; i++) {
                            m2.add(m2ttl[i]);
                        }
                        expandableListDetail.put("Maths-2", m2);
                        break;
                    case 2:
                        String[] dsttl = {"Trees", "Linked Lists"}, coattl = {"PCI", "RAM"}, javattl = {"Objects and classes", "Constructors"}, dd2ttl = {"", ""}, dsgtttl = {"Lattice", " "}, m3ttl = {"", ""};
                        String[] dbmsitttl = {" ", " "}, dsitttl = {" ", " "}, dldaitttl = {" ", " "}, tcttl = {" ", " "}, pl1ttl = {" ", " "};
                        List<String> ds = new ArrayList<String>();
                        for (int i = 0; i < dsttl.length; i++) {
                            ds.add(dsttl[i]);
                        }
                        expandableListDetail.put("Data Structures", ds);
                        List<String> coa = new ArrayList<String>();
                        for (int i = 0; i < coattl.length; i++) {
                            coa.add(coattl[i]);
                        }
                        expandableListDetail.put("COA", coa);
                        List<String> java = new ArrayList<String>();
                        for (int i = 0; i < javattl.length; i++) {
                            java.add(javattl[i]);
                        }
                        expandableListDetail.put("JAVA", java);
                        List<String> dd = new ArrayList<String>();
                        for (int i = 0; i < dd2ttl.length; i++) {
                            dd.add(dd2ttl[i]);
                        }
                        expandableListDetail.put("Digital Design", dd);
                        List<String> dsgt = new ArrayList<String>();
                        for (int i = 0; i < dsgtttl.length; i++) {
                            dsgt.add(dsgtttl[i]);
                        }
                        expandableListDetail.put("DSGT", dsgt);
                        List<String> m3 = new ArrayList<String>();
                        for (int i = 0; i < m3ttl.length; i++) {
                            m3.add(m3ttl[i]);
                        }
                        expandableListDetail.put("Maths-3", m3);
                        break;
                }
                break;
            }
            case 1: {
                switch (sempos) {
                    case 0: {
                        String[] beettl = {"Circuits", "Conductors", "Ohm's law", "Transformer"}, egttl = {"Ortho", "Projections"}, csttl = {"", ""}, phy1ttl = {"", ""}, chem1ttl = {"Water", " "}, m1ttl = {"", ""};
                        String[] dsttl = {"Trees", "Linked Lists"}, coattl = {"PCI", "RAM"}, javattl = {"Objects and classes", "Constructors"}, dd2ttl = {"", ""}, dsgtttl = {"Lattice", " "}, m3ttl = {"", ""};
                        String[] dbmsitttl = {" ", " "}, dsitttl = {" ", " "}, dldaitttl = {" ", " "}, tcttl = {" ", " "}, pl1ttl = {" ", " "};
                        List<String> bee = new ArrayList<String>();
                        for (int i = 0; i < beettl.length; i++) {
                            bee.add(beettl[i]);
                        }
                        expandableListDetail.put("BEE", bee);
                        List<String> eg = new ArrayList<String>();
                        for (int i = 0; i < beettl.length; i++) {
                            eg.add(egttl[i]);
                        }
                        expandableListDetail.put("Engineering Graphics", eg);
                        List<String> cs = new ArrayList<String>();
                        for (int i = 0; i < csttl.length; i++) {
                            eg.add(csttl[i]);
                        }
                        expandableListDetail.put("Communication Skills", cs);
                        List<String> phy1 = new ArrayList<String>();
                        for (int i = 0; i < phy1ttl.length; i++) {
                            eg.add(phy1ttl[i]);
                        }
                        expandableListDetail.put("Physics-1", phy1);
                        List<String> chem1 = new ArrayList<String>();
                        for (int i = 0; i < chem1ttl.length; i++) {
                            eg.add(egttl[i]);
                        }
                        expandableListDetail.put("Chemistry-1", chem1);
                        List<String> m1 = new ArrayList<String>();
                        for (int i = 0; i < m1ttl.length; i++) {
                            eg.add(m1ttl[i]);
                        }
                        expandableListDetail.put("Maths-1", m1);
                    }
                    break;
                    case 1: {
                        String[] mechttl = {"Trusses", " "}, fcpttl = {"Ortho", "Projections"}, evsttl = {"", ""}, phy2ttl = {"", ""}, chem2ttl = {"Rubber", " "}, m2ttl = {"", ""};
                        List<String> mech = new ArrayList<String>();
                        for (int i = 0; i < mechttl.length; i++) {
                            mech.add(mechttl[i]);
                        }
                        expandableListDetail.put("MECHANICS", mech);
                        List<String> fcp = new ArrayList<String>();
                        for (int i = 0; i < fcpttl.length; i++) {
                            fcp.add(fcpttl[i]);
                        }
                        expandableListDetail.put("Fundamental of computer programming", fcp);
                        List<String> evs = new ArrayList<String>();
                        for (int i = 0; i < evsttl.length; i++) {
                            evs.add(evsttl[i]);
                        }
                        expandableListDetail.put("E.V.S.", evs);
                        List<String> phy2 = new ArrayList<String>();
                        for (int i = 0; i < phy2ttl.length; i++) {
                            phy2.add(phy2ttl[i]);
                        }
                        expandableListDetail.put("Physics-2", phy2);
                        List<String> chem2 = new ArrayList<String>();
                        for (int i = 0; i < chem2ttl.length; i++) {
                            chem2.add(chem2ttl[i]);
                        }
                        expandableListDetail.put("Chemistry-2", chem2);
                        List<String> m2 = new ArrayList<String>();
                        for (int i = 0; i < m2ttl.length; i++) {
                            m2.add(m2ttl[i]);
                        }
                        expandableListDetail.put("Maths-2", m2);
                    }
                    break;
                }
            }
        }


        return expandableListDetail;
    }
    public void getdept(int a){
        dept=a;
    }
    public void getsem(int b){
        sem=b;
    }
    public int givdeppos(){
        return deppos;
    }
    public int givsempos(){
        return sempos;
    }

}
