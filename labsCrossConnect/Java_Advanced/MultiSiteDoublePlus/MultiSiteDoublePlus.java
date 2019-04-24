package MultiSiteDoublePlus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;

import xoc.dta.datatypes.MultiSiteDouble;

public  class MultiSiteDoublePlus  {

    private MultiSiteDouble value;
    private List<Map<Integer,Double>> MultiSiteDoublePro;

    public MultiSiteDoublePlus(MultiSiteDouble siteValue) {
        this.value = siteValue;
        List<Map<Integer,Double>> MultiSiteDoubleList = new ArrayList<>();
        int[] activeSize = siteValue.getActiveSites();
        int configureSize = siteValue.getNumberOfConfiguredSites();
        for(int i = 0;i<configureSize;i++) {
            Map<Integer,Double> tempMap = new HashedMap();
            tempMap.put(i+1, 0.0);

            for(int site: activeSize) {
                if(site == i+1){
                    tempMap.replace(site, value.get(site));//index = site -1;
                }
                else {
                    continue;
                }
            }
            MultiSiteDoubleList.add(i,tempMap);
        }
        System.out.println("INFO: MultSiteDoublePro Value = "+MultiSiteDoubleList);
        this.MultiSiteDoublePro = MultiSiteDoubleList;
    }

    public List<Map<Integer,Double>> getMultiSiteDoubPro () {
        return MultiSiteDoublePro;
    }

    /*
     * A size need be full. otherwise we can not use A+B.
     */
    public List<Map<Integer,Double>> addMultiSiteDoublePro(List<Map<Integer,Double>> A,List<Map<Integer,Double>> B) {
        Integer sizeOfA = A.size();
        Integer sizeOfB = B.size();
        List<Map<Integer,Double>> sum = new ArrayList<>();
        if(sizeOfA == sizeOfB) {
            for(int i = 0;i<A.size();i++) {
                Map<Integer,Double> tmpMapOfA = A.get(i);
                Integer keyMapOfA = i+1;
                Double valueMapOfA = tmpMapOfA.get(i+1);//ensure right order in List array.
                for(int n = 0;n<B.size();n++) {
                    Map<Integer,Double> tmpMapOfB = B.get(i);
                    Integer keyMapOfB = n+1;
                    Double valueMapOfB = tmpMapOfB.get(n+1);
                    if(keyMapOfA.equals(keyMapOfB)) {
                        Integer keyMapOfsum = keyMapOfB;
                        Double valueMapOfsum = valueMapOfA+valueMapOfB;
                        Map<Integer,Double> tmpMapOfsum = new HashedMap();
                        tmpMapOfsum.put(keyMapOfsum, valueMapOfsum);
                        sum.add(n,tmpMapOfsum);
                    }
                    else {
                        System.out.println("ERROR: Not Found key/value from MapB ");
                    }
                }
            }

        }
        else {
             System.out.println("ERROR: A size is not same with B");
        }
        return sum;

    }

}

