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
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;
import jpos.events.*;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in KeylockTest.
 *
 */
public final class KeylockTestServiceRethrowingJposException implements jpos.services.KeylockService114, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1015000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1014000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_IDLE;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
        callbacks = cb;
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getCapKeylockType() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public byte[] getElectronicKeyValue() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getKeyPosition() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getPositionCount() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
    
    @Override
    public void waitForKeylockChange(int keyPosition, int timeout) throws JposException 
    {
        throw new JposException(JposConst.JPOS_E_NOHARDWARE, Integer.MAX_VALUE, "hardware error");
    }
}