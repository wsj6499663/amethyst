/*
 * Copyright (C) 2010 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package netty.util;

import io.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 线程工厂工具类
 *
 * @author xiongjie001
 * @version v0.1 2017-11-02 16:11 xiongjie001 Exp $
 */
public final class ThreadFactoryBuilder {
    private String nameFormat = null;
    private Boolean daemon = null;
    private Integer priority = null;
    private UncaughtExceptionHandler uncaughtExceptionHandler = null;
    private ThreadFactory backingThreadFactory = null;

    /**
     * Creates a new builder.
     */
    public ThreadFactoryBuilder() {
    }

    private static ThreadFactory build(ThreadFactoryBuilder builder) {
        final String nameFormat = builder.nameFormat;
        final Boolean daemon = builder.daemon;
        final Integer priority = builder.priority;
        final UncaughtExceptionHandler uncaughtExceptionHandler =
                builder.uncaughtExceptionHandler;
        final ThreadFactory backingThreadFactory =
                (builder.backingThreadFactory != null)
                        ? builder.backingThreadFactory
                        : Executors.defaultThreadFactory();
        final AtomicLong count = (nameFormat != null) ? new AtomicLong(0) : null;
        return new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread thread = backingThreadFactory.newThread(runnable);
                if (nameFormat != null) {
                    thread.setName(format(nameFormat, count.getAndIncrement()));
                }
                if (daemon != null) {
                    thread.setDaemon(daemon);
                }
                if (priority != null) {
                    thread.setPriority(priority);
                }
                if (uncaughtExceptionHandler != null) {
                    thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
                return thread;
            }
        };
    }

    private static String format(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    /**
     * Sets the naming format to use when naming threads which are created with this ThreadFactory.
     *
     * @param nameFormat a-compatible format String.
     * @return this for the builder pattern
     */
    public ThreadFactoryBuilder setNameFormat(String nameFormat) {
        String unused = format(nameFormat, 0); // fail fast if the format is bad or null
        this.nameFormat = nameFormat;
        return this;
    }

    /**
     * Sets daemon or not for new threads created with this ThreadFactory.
     *
     * @param daemon whether or not new Threads created with this ThreadFactory
     *               will be daemon threads
     * @return this for the builder pattern
     */
    public ThreadFactoryBuilder setDaemon(boolean daemon) {
        this.daemon = daemon;
        return this;
    }

    /**
     * Sets the priority for new threads created with this ThreadFactory.
     *
     * @param priority the priority for new Threads created with this
     *                 ThreadFactory
     * @return this for the builder pattern
     */
    public ThreadFactoryBuilder setPriority(int priority) {
        if (priority <= Thread.MIN_PRIORITY) {

            throw new IllegalArgumentException(String.format(
                    "Thread priority (%s) must be >= %s", priority, Thread.MIN_PRIORITY));
        } else if (priority >= Thread.MAX_PRIORITY) {
            throw new IllegalArgumentException(String.format(
                    "Thread priority (%s) must be <= %s", priority, Thread.MAX_PRIORITY));
        }
        this.priority = priority;
        return this;
    }

    /**
     * Sets the for new threads created with this
     * ThreadFactory.
     *
     * @param uncaughtExceptionHandler the uncaught exception handler for new
     *                                 Threads created with this ThreadFactory
     * @return this for the builder pattern
     */
    public ThreadFactoryBuilder setUncaughtExceptionHandler(
            UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) throw new NullPointerException();
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        return this;
    }

    /**
     * Sets the backing or new threads created with this
     * ThreadFactory. Threads will be created by invoking #newThread(Runnable) on
     * this backing .
     *
     * @param backingThreadFactory the backing  which will
     *                             be delegated to during thread creation.
     * @return this for the builder pattern
     */
    public ThreadFactoryBuilder setThreadFactory(
            ThreadFactory backingThreadFactory) {
        if (backingThreadFactory == null) throw new NullPointerException();
        this.backingThreadFactory = backingThreadFactory;
        return this;
    }

    /**
     * Returns a new thread factory using the options supplied during the building
     * process. After building, it is still possible to change the options used to
     * build the ThreadFactory and/or build again. State is not shared amongst
     * built instances.
     *
     * @return the fully constructed
     */
    public ThreadFactory build() {
        return build(this);
    }
}
