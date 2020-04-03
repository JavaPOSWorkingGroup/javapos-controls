////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.loader.JposServiceInstance;
import jpos.services.EventCallbacks;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in CashChangerTest.
 *
 */
public final class CashChangerTestService15 implements jpos.services.CashChangerService15, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1005000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        // intentionally left empty
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public int getAsyncResultCode() throws JposException {
        return 0;
    }
    
    @Override
    public int getAsyncResultCodeExtended() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapDeposit() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDepositDataEvent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDiscrepancy() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapFullSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapNearEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapNearFullSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPauseDeposit() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRepayDeposit() throws JposException {
        return true;
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public String getCurrencyCashList() throws JposException {
        return "";
    }
    
    @Override
    public String getCurrencyCode() throws JposException {
        return "";
    }
    
    @Override
    public void setCurrencyCode(String currencyCode) throws JposException {
    }
    
    @Override
    public String getCurrencyCodeList() throws JposException {
        return "";
    }
    
    @Override
    public int getCurrentExit() throws JposException {
        return 0;
    }
    
    @Override
    public void setCurrentExit(int currentExit) throws JposException {
    }
    
    @Override
    public int getDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
    }
    
    @Override
    public int getDepositAmount() throws JposException {
        return 0;
    }
    
    @Override
    public String getDepositCashList() throws JposException {
        return "";
    }
    
    @Override
    public String getDepositCodeList() throws JposException {
        return "";
    }
    
    @Override
    public String getDepositCounts() throws JposException {
        return "";
    }
    
    @Override
    public int getDepositStatus() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public int getDeviceExits() throws JposException {
        return 0;
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public int getDeviceStatus() throws JposException {
        return 0;
    }
    
    @Override
    public String getExitCashList() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getFullStatus() throws JposException {
        return 0;
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public void beginDeposit() throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void clearInput() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void dispenseCash(String cashCounts) throws JposException 
    {
    }
    
    @Override
    public void dispenseChange(int amount) throws JposException 
    {
    }
    
    @Override
    public void endDeposit(int success) throws JposException 
    {
    }
    
    @Override
    public void fixDeposit() throws JposException 
    {
    }
    
    @Override
    public void pauseDeposit(int control) throws JposException 
    {
    }
    
    @Override
    public void readCashCounts(String[] cashCounts, boolean[] discrepancy) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
}
