package com.example.demo.utils;

import org.slf4j.Logger;
import org.slf4j.helpers.MessageFormatter;

/**
 * 日志工具
 *
 * @author wangKai
 * @version $Id: LogUtils.java, v 0.1 2017年5月4日 下午4:38:49 wangKai Exp $
 */
public class LogUtils {

    /**
     * trace日志
     *
     * @param message
     * @param args
     */
    public static void trace(Logger logger, String message, Object... args) {
        if (logger != null) {
            if (logger.isTraceEnabled()) {
                logger.trace(format(message, args));
            }
        }
    }

    /**
     * info日志
     *
     * @param message
     * @param args
     */
    public static void info(Logger logger, String message, Object... args) {

        if (logger != null) {
            if (logger.isInfoEnabled()) {
                logger.info(format(message, args));
            }
        }
    }

    /**
     * debug日志
     *
     * @param message
     * @param args
     */
    public static void debug(Logger logger, String message, Object... args) {
        if (logger != null) {
            if (logger.isDebugEnabled()) {
                logger.debug(format(message, args));
            }
        }
    }

    /**
     * error日志
     *
     * @param message
     * @param ex
     * @param args
     */
    public static void error(Logger logger, String message, Throwable ex, Object... args) {
        if (logger != null) {
            logger.error(format(message, args), ex);
        }
    }

    /**
     * warn日志
     *
     * @param message
     * @param ex
     * @param args
     */
    public static void warn(Logger logger, String message, Throwable ex, Object... args) {
        if (logger != null) {
            logger.warn(format(message, args), ex);
        }
    }

    /**
     * warn日志
     *
     * @param message
     * @param args
     */
    public static void warn(Logger logger, String message, Object... args) {
        if (logger != null) {
            logger.warn(format(message, args));
        }
    }

    /**
     * 格式化消息
     *
     * @param message
     * @param args
     * @return
     */
    public static String format(String message, Object... args) {
        if (args != null && args.length > 0) {
            return MessageFormatter.arrayFormat(message, args).getMessage();
        }
        return message;
    }

}
