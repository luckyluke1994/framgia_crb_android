package framgia.vn.framgiacrb.constant;

/**
 * Created by lucky_luke on 9/15/2016.
 */
public enum RepeatTypeEnum {
    NO_REPEATE(Constant.NO_REPEAT, 0),
    DAILY(Constant.DAILY, 1),
    WEEKLY(Constant.WEEKLY, 2),
    MONTHLY(Constant.MONTHLY, 3),
    YEARLY(Constant.YEARLY, 4);

    private String mValue;
    private int mIndex;

    RepeatTypeEnum(String value, int index) {
        mValue = value;
        mIndex = index;
    }

    public String getValue() {
        return mValue;
    }

    public int getIndex() {
        return mIndex;
    }

    public static int getIndexByValue(String value) {
        if (null == value) return RepeatTypeEnum.NO_REPEATE.mIndex;
        for (RepeatTypeEnum repeat : RepeatTypeEnum.values()) {
            if (repeat.mValue.equalsIgnoreCase(value))
                return repeat.mIndex;
        }
        return RepeatTypeEnum.NO_REPEATE.mIndex;
    }
}
