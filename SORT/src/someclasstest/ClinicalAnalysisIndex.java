package someclasstest;

public class ClinicalAnalysisIndex {
    private String indexCode;
    private String indexName;
    private String indexType;
    private String aperCode;
    private String createTime;

    public ClinicalAnalysisIndex(String indexCode, String aperCode, String createTime) {
        this.indexCode = indexCode;
        this.aperCode = aperCode;
        this.createTime = createTime;
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getAperCode() {
        return aperCode;
    }

    public void setAperCode(String aperCode) {
        this.aperCode = aperCode;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ClinicalAnalysisIndex{" +
                "indexCode='" + indexCode + '\'' +
                ", indexName='" + indexName + '\'' +
                ", indexType='" + indexType + '\'' +
                ", aperCode='" + aperCode + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
