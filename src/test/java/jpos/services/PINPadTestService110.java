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
 * JavaPOS Device Service class, intended to be used for testing purposes in PINPadTest.
 *
 */
public final class PINPadTestService110 implements jpos.services.PINPadService110, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1011000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1010000;
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
        switch (command) {
        case jpos.ControlsTestHelper.SEND_DATA_EVENT:
            this.callbacks.fireDataEvent(new DataEvent(this.callbacks.getEventSource(), 0));
        case jpos.ControlsTestHelper.SEND_DIRECTIO_EVENT:
            this.callbacks.fireDirectIOEvent(new DirectIOEvent(this.callbacks.getEventSource(), 1, 2, null));
        case jpos.ControlsTestHelper.SEND_ERROR_EVENT:
            this.callbacks.fireErrorEvent(new ErrorEvent(this.callbacks.getEventSource(), 1, 2, 3, 4));
            break;
        case jpos.ControlsTestHelper.SEND_OUTPUTCOMPLETE_EVENT: 
            this.callbacks.fireOutputCompleteEvent(new OutputCompleteEvent(this.callbacks.getEventSource(), 1));
            break;
        case jpos.ControlsTestHelper.SEND_STATUSUPDATE_EVENT:
            this.callbacks.fireStatusUpdateEvent(new StatusUpdateEvent(this.callbacks.getEventSource(), 1));
            break;
        default:
            break;
        }
    }
    
    
    @Override
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public void setAccountNumber(String accountNumber) throws JposException {
    }
    
    @Override
    public String getAdditionalSecurityInformation() throws JposException {
        return "";
    }
    
    @Override
    public long getAmount() throws JposException {
        return 0;
    }
    
    @Override
    public void setAmount(long amount) throws JposException {
    }
    
    @Override
    public String getAvailableLanguagesList() throws JposException {
        return "";
    }
    
    @Override
    public String getAvailablePromptsList() throws JposException {
        return "";
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public int getCapDisplay() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapKeyboard() throws JposException {
        return true;
    }
    
    @Override
    public int getCapLanguage() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapMACCalculation() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTone() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
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
    public String getEncryptedPIN() throws JposException {
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
    public int getMaximumPINLength() throws JposException {
        return 0;
    }
    
    @Override
    public void setMaximumPINLength(int maximumPINLength) throws JposException {
    }
    
    @Override
    public String getMerchantID() throws JposException {
        return "";
    }
    
    @Override
    public void setMerchantID(String merchantID) throws JposException {
    }
    
    @Override
    public int getMinimumPINLength() throws JposException {
        return 0;
    }
    
    @Override
    public void setMinimumPINLength(int minimumPINLength) throws JposException {
    }
    
    @Override
    public boolean getPINEntryEnabled() throws JposException {
        return true;
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
    public int getPrompt() throws JposException {
        return 0;
    }
    
    @Override
    public void setPrompt(int propmpt) throws JposException {
    }
    
    @Override
    public String getPromptLanguage() throws JposException {
        return "";
    }
    
    @Override
    public void setPromptLanguage(String promptLanguage) throws JposException {
    }
    
    @Override
    public String getTerminalID() throws JposException {
        return "";
    }
    
    @Override
    public void setTerminalID(String terminalID) throws JposException {
    }
    
    @Override
    public byte[] getTrack1Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public void setTrack1Data(byte[] track1Data) throws JposException {
    }
    
    @Override
    public byte[] getTrack2Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public void setTrack2Data(byte[] track2Data) throws JposException {
    }
    
    @Override
    public byte[] getTrack3Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public void setTrack3Data(byte[] track3Data) throws JposException {
    }
    
    @Override
    public byte[] getTrack4Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public void setTrack4Data(byte[] track4Data) throws JposException {
    }
    
    @Override
    public int getTransactionType() throws JposException {
        return 0;
    }
    
    @Override
    public void setTransactionType(int transactionType) throws JposException {
    }
    
    @Override
    public void beginEFTTransaction(String PINPadSystem, int transactionHost) throws JposException 
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
    public void clearInputProperties() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void computeMAC(String inMsg, String[] outMsg) throws JposException 
    {
    }
    
    @Override
    public void enablePINEntry() throws JposException 
    {
    }
    
    @Override
    public void endEFTTransaction(int completionCode) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateKey(int keyNum, String key) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void verifyMAC(String message) throws JposException 
    {
    }
}
