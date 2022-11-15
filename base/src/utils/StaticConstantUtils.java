package utils;

import java.math.BigDecimal;

/**
 * @description:  常量工具类
 * @fileName: StaticConstantUtils
 * @author: mayuquan
 * @createAt: 2021/3/31 14:27
 * @updateBy: mayuquan
 * @remark: Copyright
 */
public class StaticConstantUtils {

    public static final String SUPER_ADMIN_ROLE_CODE = "OWN";

    public static final String ADMIN_ROLE_CODE = "GLY";

    public static final String DEAN_DEPT_ROLE_CODE = "YZ";

    public static final String HEAD_DEPT_ROLE_CODE = "KZR";

    public static final String MEDICAL_DEPT_ROLE_CODE = "YW";
    /**
     * 月
     */
    public static final String DIM_MONTH = "2";
    /**
     * 日
     */
    public static final String DIM_DAY = "5";
    /**
     *季
     */
    public static final String DIM_QUARTER = "3";

    /**
     * 1 : 周
     */
    public static final String DIM_WEEK = "1";
    /**
     * 4 : 年
     */
    public static final String DIM_YEAR = "4";

    public static final String DIM_REAL = "6";

    public static final String DEPT_ALL_TYPE = "1";

    public static final String DEPT_MZ_TYPE = "2";

    public static final String DEPT_ZY_TYPE = "3";

    public static final String  HAND_MASS = "2";

    public static final String MEDICAL_RECORD = "1";

    public static final String TABLE="table";

    public static final String PIE = "pie";

    public static final String ORDER = "order";
    public static final String ORDERD = "orderD";
    public static final String ORDERK = "orderK";
    public static final String ORDERZ = "orderZ";
    public static final String ORDERC = "orderC";
    public static final String TAG = "tag";
    public static final String LIST = "list";
    public static final String LINE = "line";

    public static final String DeptLine = "deptLine";
    public static final String DocLine = "docLine";
    public static final String DeptSum = "deptSum";
    public static final String DeptList = "deptList";
    public static final String DocList = "docList";


    public static final String DEPT_LINE = "DeptLine";
    public static final String DOC_LINE = "DocLine";
    public static final String DEPT_SUM = "DeptSum";
    public static final String DEPT_LIST = "DeptList";
    public static final String DOC_LIST = "DocList";
    /**
     * 指标配置专用
     */
    public static final String INDEX_DEPT_SUM = "indexDeptSum";

    public static final BigDecimal BIG_ZERO = new BigDecimal(0.0);

    public static final Long HospitalId = 1L;

    //药品类型基本药品
    public static final String MEDIC_TY_ONE ="1";
    //药品类型抗菌药物
    public static final String MEDIC_TY_TWO ="2";
    //药品类型重点监控药物
    public static final String MEDIC_TY_THREE ="3";

    public static final String SQL_OLD = "1";

    public static final String SQL_NEW = "2";

    public static final String Dept = "dept";

    public static final String Doc = "doc";


    public static final String START_FLAG = "启用";
    public static final String CLOSE_FLAG = "关闭";

    public static final String DISPLAY_NO_START = "不启用显示";
    public static final String NO_DISPLAY_FLAG = "不显示";

    public static final String ONLINE_FLAG = "已上线";
    public static final String NO_ONLINE_FLAG = "未上线";

    public static final String CALENDAR_START_FLAG = "自然月开启";
    public static final String NATURAL_START_FLAG = "非自然月开启";

    public static final String DAY_FLAG="日";
    public static final String WEEK_FLAG="周";
    public static final String MONTH_FLAG="月";

    //检查状态
    public static final String CHECK_STATUS_ONE="未检查";
    public static final String CHECK_STATUS_TWO="待反馈";
    public static final String CHECK_STATUS_THREE="待审核";
    public static final String CHECK_STATUS_SESS="已完成";

    //检查状态码
    public static final String CHECK_ONE="1";
    public static final String CHECK_TWO="2";
    public static final String CHECK_THREE="3";


    /**
     * 新增常量信息口径类型 1:指标分子   2:指标分子    3:指标分母    4:指标(没有分子分母的)
     */
    public static final String APERTURE_TYPE_ONE="1";
    public static final String APERTURE_TYPE_TWO="2";
    public static final String APERTURE_TYPE_THREE="3";
    public static final String APERTURE_TYPE_FORE="4";

    public static final String INDEX_UNIT = "万元";
}
