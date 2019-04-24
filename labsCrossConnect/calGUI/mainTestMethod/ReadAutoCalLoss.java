package mainTestMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.math3.util.Pair;
import org.jopendocument.dom.spreadsheet.MutableCell;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

import xoc.dta.TestMethod;
import xoc.dta.annotations.In;
import xoc.dta.testdescriptor.IParametricTestDescriptor;

public class ReadAutoCalLoss extends TestMethod{
    @In public String filePath = "calGUI/calibration/AutoCALLoss.ods";
    @In public String sheetName = "cal_InLoss;cal_OutLoss;cal_OutLossL;cal_TotalLossG0;cal_TotalLossG2;cal_TotalLossG4";

    public static Integer flowCount = 0;

    public IParametricTestDescriptor ptdInLoss;
    public IParametricTestDescriptor ptdOutLoss;
    public IParametricTestDescriptor ptdOutLossL;
    public IParametricTestDescriptor ptdTotalLossG0;
    public IParametricTestDescriptor ptdTotalLossG2;
    public IParametricTestDescriptor ptdTotalLossG4;

    public static String calInLossText;
    public static String calOutLossText;
    public static String calOutLossLText;
    public static String calTotalLossG0Text;
    public static String calTotalLossG2Text;
    public static String  calTotalLossG4Text;
    public static Boolean[] mJudgeResult = new Boolean[8];





    @Override

    public void execute() {
        // TODO Auto-generated method stub

        String progPath = context.workspace().getActiveProjectPath()+"/";
        List<String> shtList = new ArrayList<String>(Arrays.asList(sheetName.split("\\s*;\\s*")));
        List<Map<List<String>,List<Double>>> mCALDataMap = readAutoCalFile(progPath+filePath, shtList, 8);


        Boolean[] checkInLoss= new Boolean[8];
        Boolean[] checkOutLoss = new Boolean[8];
        Boolean[] checkOutLossL = new Boolean[8];
        Boolean[] checkTotalLossG0 = new Boolean[8];
        Boolean[] checkTotalLossG2 = new Boolean[8];
        Boolean[] checkTotalLossG4 = new Boolean[8];
        String LBID = "1";

        for(String shtName : shtList) {
            int ID = shtList.indexOf(shtName);

            switch (shtName) {
            case ("cal_InLoss"):
            {
                Double lowLimit = ptdInLoss.getLowLimit();
                Double highLimit = ptdInLoss.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calInLossText = pair.getKey();
                checkInLoss = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkInLoss);
                break;
            }

            case("cal_OutLoss"):
            {

                Double lowLimit = ptdOutLoss.getLowLimit();
                Double highLimit = ptdOutLoss.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calOutLossText = pair.getKey();
                checkOutLoss = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkOutLoss);
                break;
            }
            case("cal_OutLossL"):
            {

                Double lowLimit = ptdOutLossL.getLowLimit();
                Double highLimit = ptdOutLossL.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calOutLossLText = pair.getKey();
                checkOutLossL = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkOutLossL);
                break;
            }
            case("cal_TotalLossG0"):
            {

                Double lowLimit = ptdTotalLossG0.getLowLimit();
                Double highLimit = ptdTotalLossG0.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calTotalLossG0Text = pair.getKey();
                checkTotalLossG0 = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkTotalLossG0);
                break;
            }
            case("cal_TotalLossG2"):
            {

                Double lowLimit = ptdTotalLossG2.getLowLimit();
                Double highLimit = ptdTotalLossG2.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calTotalLossG2Text = pair.getKey();
                checkTotalLossG2 = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkTotalLossG2);
                break;
            }
            case("cal_TotalLossG4"):
            {

                Double lowLimit = ptdTotalLossG4.getLowLimit();
                Double highLimit = ptdTotalLossG4.getHighLimit();
                Pair<String,Boolean[]> pair = checkCalSheet(mCALDataMap.get(ID), shtName , LBID, 0.0, 9.0);
                calTotalLossG4Text = pair.getKey();
                checkTotalLossG4 = pair.getValue();
                System.out.println("INFO: "+shtName+": ---------->>"+checkTotalLossG4);
                break;
            }



            }
        }


        for(int i = 0;i<8;i++) {

            mJudgeResult[i] = checkInLoss[i]&&checkOutLoss[i]&&checkOutLossL[i]&&checkTotalLossG0[i]&&checkTotalLossG2[i]&&checkTotalLossG4[i];
        }


    }




    private List< Map<List<String>,List<Double>> >readAutoCalFile(String fileName,List<String> rdSheet,int configuredSite){
       List< Map<List<String>,List<Double>> >mCALDataMap = new ArrayList<>();
        File file = new File(fileName);
        if(!file.exists()) {
            System.out.println("Error!"+file+" is not found!!!");
            return null;
        }
        SpreadSheet document = null;
        try {
            document = SpreadSheet.createFromFile(file);
        }catch(IOException e) {
            System.out.println("Error! Exception in reading from "+file);
            e.printStackTrace();
        }
        if(document == null) {
            return null;
        }
        int count = document.getSheetCount();
        for(int sheetID=0; sheetID<count;sheetID++) {
            Sheet sheet = document.getSheet(sheetID);
            String shtName = sheet.getName();
            if(rdSheet.contains(shtName)) {
                int ID = rdSheet.indexOf(shtName);
                Map<List<String>,List<Double>> mShtCALDataMap = new LinkedHashMap<>();
                mShtCALDataMap = readCalSheet(mShtCALDataMap,sheet,configuredSite);
                System.out.println("INFO: "+shtName+" is Reading Finished!");
                mCALDataMap.add(ID, mShtCALDataMap);
                System.out.println("INFO: "+shtName+" is Setting in List Finished!");
            }
        }
        return mCALDataMap;
    }



    private Map<List<String>,List<Double>> readCalSheet(Map<List<String>,List<Double>> mCalDataMap,Sheet sheet,int configuredSite){
        String shtName = sheet.getName();
        int col = sheet.getColumnCount();
        int row = sheet.getRowCount();
        int maxRow = 200;
        int maxCol = 30;
        if(col>maxCol) {
            sheet.setColumnCount(maxCol);
            col = maxCol;
        }
        if(row>maxRow) {
            sheet.setRowCount(maxRow);
            row = maxRow;
        }

        for(int i=1;i<row;i++) {
            List<String> key = new ArrayList<>();
            List<Double> value = new ArrayList<>();
            ArrayList<String> valuePerRow = new ArrayList<>();

            for(int j=0;j<col;j++) {
                MutableCell<SpreadSheet> cell = sheet.getCellAt(j,i);
                String cellValue = cell.getValue().toString();
                valuePerRow.add(j,cellValue);
            }
            if(valuePerRow.get(0).equals("")) {
                continue;
            }
            if(shtName.contains("cal")) {
                key.add(0,shtName);//sheetName;
                key.add(1,valuePerRow.get(0));//LBID;
                key.add(2,valuePerRow.get(1));//TestItem;
                key.add(3,"0");
                if(shtName.contains("OutLoss")||shtName.contains("TotalLoss")) {
                    key.add(3,valuePerRow.get(2));
                }
                for(int site=0;site<configuredSite;site++) {
                    if(shtName.contains("InLoss")) {
                            value.add(site,Double.parseDouble(valuePerRow.get(2+site)));
                     }else {
                         value.add(site, Double.parseDouble(valuePerRow.get(3+site)));
                     }
                }

            }
            mCalDataMap.put(key, value);


        }



        return mCalDataMap;
    }

    private Pair<String,Boolean[]> checkCalSheet(Map<List<String>,List<Double>> mShtDataMap,String mShtName,String LBID,Double lowLimit,Double highLimit){

        Boolean[] checkLoss = new Boolean[8];
        String testText = ">>>>>>>>>>>>>"+mShtName+" Failed Log"+">>>>>>>>>>>>>\n";
        String title = "LBID"+"     "+"TestItem"+"                                 "+"Freq"+"         "+"Loss"+"\n";
        testText= testText+title;
        for(int i =0 ;i<8;i++) {
            checkLoss[i] = true;
        }
        for(List<String> key : mShtDataMap.keySet()) {
            String shtName = key.get(0);
            String mLBID = key.get(1);
            String mTestItem = key.get(2);
            String mFreq = key.get(3);
            List<Double> value = mShtDataMap.get(key);
            if(mLBID.equals(LBID) && shtName.equals(mShtName)) {
                for(int i = 0 ; i<8;i++) {
                    boolean checkSiteLoss = true;
                    String temp = "";
                    if(value.get(i)<lowLimit||value.get(i)>highLimit) {
                        checkSiteLoss = false;
                        temp = LBID+"        "+mTestItem+"       "+mFreq+"            "+value+"\n";
                    }
                    checkLoss[i] = checkLoss[i]&checkSiteLoss;
                    testText = testText + temp;
                }
            }

        }

        Pair<String,Boolean[]> pair = new Pair<String,Boolean[]>(testText, checkLoss);

        return pair;
    }

}
