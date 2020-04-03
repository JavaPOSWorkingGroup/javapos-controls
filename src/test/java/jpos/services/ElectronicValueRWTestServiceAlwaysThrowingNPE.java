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
 * JavaPOS Device Service class, intended to be used for testing purposes in ElectronicValueRWTest.
 *
 */
public final class ElectronicValueRWTestServiceAlwaysThrowingNPE implements jpos.services.ElectronicValueRWService114, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1015000;
        else
            return 1014000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
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
        throw new NullPointerException();
    }
    
    
    @Override
    public String getAccountNumber() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getAdditionalSecurityInformation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAdditionalSecurityInformation(String addSecInfo) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getAmount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAmount(long amount) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getApprovalCode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setApprovalCode(String approvalCode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAsyncMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getBalance() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getBalanceOfPoint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapActivateService() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAddValue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCancelValue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCardSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapDetectionControl() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapElectronicMoney() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapEnumerateCardServices() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapIndirectTransactionLog() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapLockTerminal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapLogStatus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMediumID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPINDevice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPoint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRealTimeData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSubtractValue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean CapTrainingMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTransactionLog() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUnlockTerminal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateKey() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapVoucher() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapWriteValue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCardServiceList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCurrentService() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCurrentService(String currentService) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDataCount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDetectionControl() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDetectionControl(boolean detectionControl) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDetectionStatus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getExpirationDate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getLastUsedDate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getLogStatus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getMediumID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMediumID(String mediumID) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getOutputID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPINEntry() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPINEntry(int pinEntry) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getPoint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPoint(long point) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getReaderWriterServiceList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSequenceNumber() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getSettledAmount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getSettledPoint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTrainingModeState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTrainingModeState(int trainingModeState) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTransactionLog() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVoucherID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVoucherID(String voucherID) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVoucherIDList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVoucherIDList(String voucherIDList) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void accessLog(int sequenceNumber, int type, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void activateService(int[] data, Object[] obj) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void addValue(int sequenceNumber, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginDetection(int type, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void cancelValue(int sequenceNumber, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void captureCard() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInputProperties() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearParameterInformation() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endDetection() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void enumerateCardServices() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void lockTerminal() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void queryLastSuccessfulTransactionResult() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void readValue(int sequenceNumber, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveResultInformation(String name, String[] value) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setParameterInformation(String name, String value) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void subtractValue(int sequenceNumber, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void transactionAccess(int control) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void unlockTerminal() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateKey(int[] data, Object[] obj) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void writeValue(int sequenceNumber, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
}
