package io.getynge.yasil.backend.src.tools;

import java.util.function.Consumer;

/**
 * Created by spark on 1/25/17.
 */
public interface OneWayCallback<T> {
    public Consumer<? extends T> registerCallback();
}