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
 * JavaPOS Device Service class, intended to be used for testing purposes in ToneIndicatorTest.
 *
 */
public final class ToneIndicatorTestService16 implements jpos.services.ToneIndicatorService16, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_006_000;
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
    public boolean getCapPitch() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapVolume() throws JposException {
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
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getInterToneWait() throws JposException {
        return 0;
    }
    
    @Override
    public void setInterToneWait(int interToneWait) throws JposException {
    }
    
    @Override
    public int getOutputID() throws JposException {
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
    public int getTone1Duration() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone1Duration(int tone1Duration) throws JposException {
    }
    
    @Override
    public int getTone1Pitch() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone1Pitch(int tone1Pitch) throws JposException {
    }
    
    @Override
    public int getTone1Volume() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone1Volume(int tone1Volume) throws JposException {
    }
    
    @Override
    public int getTone2Duration() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone2Duration(int tone2Duration) throws JposException {
    }
    
    @Override
    public int getTone2Pitch() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone2Pitch(int tone2Pitch) throws JposException {
    }
    
    @Override
    public int getTone2Volume() throws JposException {
        return 0;
    }
    
    @Override
    public void setTone2Volume(int tone2Volume) throws JposException {
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
    public void clearOutput() throws JposException 
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
    public void release() throws JposException 
    {
    }
    
    @Override
    public void sound(int numberOfCycles, int interSoundWait) throws JposException 
    {
    }
    
    @Override
    public void soundImmediate() throws JposException 
    {
    }
}
