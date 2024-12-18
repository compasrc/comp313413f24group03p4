package edu.luc.etl.cs313.android.simplestopwatch.model.state;

/**
 * The restricted view states have of their surrounding state machine.
 * This is a client-specific interface in Peter Coad's terminology.
 *
 * @author laufer
 */
interface StopwatchSMStateView {

    // time model interactions
    int getRuntime();

    // transitions
    void toRunningState();
    void toStoppedState();
    void toIncrementingState();
    void toAlarmingState();

    // actions
    void actionInit();
    void actionReset();
    void actionStart();
    void actionStop();
    void actionInc();
    void actionUpdateView();
    void actionDec();
    void actionAlarm();

    // state-dependent UI updates
    void updateUIRuntime();
    int getEnteredTime();
    void enterTime(int time);
}
