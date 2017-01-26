package io.getynge.yasil.backend.src.parsing;

import io.getynge.yasil.backend.src.running.IExecutor;
import io.getynge.yasil.backend.src.tools.OneWayCallback;

import java.io.InputStream;

/**
 *
 * @param <T> T is the type of data being received from the executor
 * @param <U> U is the type of data this IParser sends to the executor
 * @param <V> V is the type of data being sent from the receiver to the parser
 * @param <W> W is the implementation of IExecutor which accepts U and sends T
 */
public abstract class IParser<T, U, V, W extends IExecutor<? extends T, ? extends U, ?, ?>> implements OneWayCallback<V>{
    W executor;
    public abstract void start(boolean interactive);
}
