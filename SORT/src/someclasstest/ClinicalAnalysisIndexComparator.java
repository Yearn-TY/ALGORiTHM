package someclasstest;

import java.util.Comparator;


/**
 * @author all
 */
public class ClinicalAnalysisIndexComparator implements Comparator<ClinicalAnalysisIndex> {

    @Override
    public int compare(ClinicalAnalysisIndex o1, ClinicalAnalysisIndex o2) {
        int result = 0;
        if (o1.getCreateTime().compareTo(o2.getCreateTime()) == 0) {
            if (o1.getIndexCode().compareTo(o2.getIndexCode()) == 0) {
                result = o1.getAperCode().compareTo(o2.getAperCode());
            }else{
                result = o1.getIndexCode().compareTo(o2.getIndexCode());
            }
        }else{
            result = o1.getCreateTime().compareTo(o2.getCreateTime());
        }
        return result;
    }
}
