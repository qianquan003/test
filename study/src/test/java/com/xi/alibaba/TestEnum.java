package com.xi.alibaba;

/**
 * Created by Administrator on 2017/6/21.
 */
public enum TestEnum {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7) {
        @Override
        public boolean isRest() {
            return true;
        }
    },
    SUN(0) {
        @Override
        public boolean isRest() {
            return true;
        }
    };

    private int value;

    private TestEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isRest() {
        return false;
    }
}

