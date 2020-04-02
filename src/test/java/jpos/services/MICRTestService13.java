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
 * JavaPOS Device Service class, intended to be used for testing purposes in MICRTest.
 *
 */
public final class MICRTestService13 implements jpos.services.MICRService13, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_003_000;
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
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public String getAmount() throws JposException {
        return "";
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public String getBankNumber() throws JposException {
        return "";
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapValidationDevice() throws JposException {
        return true;
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public int getCheckType() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public int getCountryCode() throws JposException {
        return 0;
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
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getEPC() throws JposException {
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
    public String getRawData() throws JposException {
        return "";
    }
    
    @Override
    public String getSerialNumber() throws JposException {
        return "";
    }
    
    @Override
    public String getTransitNumber() throws JposException {
        return "";
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
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
    public void endInsertion() throws JposException 
    {
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
}
