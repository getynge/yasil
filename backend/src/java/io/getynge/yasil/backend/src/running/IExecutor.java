package io.getynge.yasil.backend.src.running;

import io.getynge.yasil.backend.src.tools.TwoWayCallback;

/**
 *
 */
public abstract class IExecutor<T, U, V, W extends IStateManager<? extends T, ? extends V>> implements TwoWayCallback<T, U> {
    private W stateManager;
    abstract void start();
}
