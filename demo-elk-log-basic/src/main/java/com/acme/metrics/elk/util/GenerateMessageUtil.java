package com.acme.metrics.elk.util;

import static com.acme.metrics.elk.constant.MessageConstant.*;

import java.util.Random;

public final class GenerateMessageUtil {

	private GenerateMessageUtil() {
		throw new IllegalStateException("GenerateMessageUtil");
	}

    private static int generateRandomIndex(int maxValue) {
        return new Random().nextInt(maxValue);
    }

    public static String getMessage() {

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
