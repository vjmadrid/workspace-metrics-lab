package com.acme.metrics.elk.util;

import static com.acme.metrics.elk.constant.MessageConstant.*;

import java.util.Random;

public enum MessageUtil {

    INSTANCE;

    private int generateRandomIndex(int maxValue) {

        Random random = new Random();
        return random.nextInt(maxValue);
    }

    public String getMessage() {

        final StringBuilder msg = new StringBuilder();
        final int logTypeIndex = generateRandomIndex(LOG_TYPE.length);

        if (logTypeIndex == LOG_TYPE.length - 1) {
            final int blamerIndex = generateRandomIndex(LOG_BLAMERS.length);
            msg.append(String.format(DELETE_MESSAGE_PATTERN, LOG_TYPE[logTypeIndex], LOG_BLAMERS[blamerIndex]));
        } else {
            msg.append(String.format(MESSAGE_PATTERN, LOG_TYPE[logTypeIndex]));
        }

        return msg.toString();
    }
}
