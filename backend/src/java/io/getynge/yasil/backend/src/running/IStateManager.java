package io.getynge.yasil.backend.src.running;

/**
 * Created by spark on 1/25/17.
*/
interface IStateManager<T,U>{
    byte FLAG_JUMP = 0b0000001; //prepare to jump to the top of the call stack
    byte FLAG_CACH = 0b0000010; //cache current location in memory
    byte FLAG_ERRO = 0b0000100; //Error occured
    byte FLAG_EXIT = 0b0001000; //Program will exit
    byte FLAG_NOOP = 0b0010000; //Does nothing
    byte FLAG_RSTR = 0b0100000; //Program will restart
    byte FLAG_DELE = 0b1000000; //Remove top of call stack

    public void raiseFlag(byte flags);
    public T getLoc();
    public void pushResult(U result);
    public void pushLoc(T loc);
}
